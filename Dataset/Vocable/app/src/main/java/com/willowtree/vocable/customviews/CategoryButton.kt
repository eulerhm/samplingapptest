package com.willowtree.vocable.customviews

import android.content.Context
import android.util.AttributeSet
import kotlinx.coroutines.*

/**
 * A subclass of AppCompatRadioButton that represents a category on the main screen
 */
class CategoryButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : ActionButton(context, attrs, defStyle),
    PointerListener {

    private var buttonJob: Job? = null
    private val backgroundScope = CoroutineScope(Dispatchers.IO)
    private val uiScope = CoroutineScope(Dispatchers.Main)

    init {
        isEnabled = false
        setOnClickListener {
            isSelected = true
            sayText(text)
            performAction()
        }
    }

    override fun onPointerEnter() {
        if (isSelected) {
            return
        }
        buttonJob = backgroundScope.launch {
            uiScope.launch {
                isPressed = true
            }

            delay(dwellTime)

            uiScope.launch {
                isPressed = false
                isSelected = true
                sayText(text)
                performAction()
            }
        }
    }

    override fun onPointerExit() {
        isPressed = false
        buttonJob?.cancel()
    }

    override fun sayText(text: CharSequence?) {
        // No-op
    }
}