package com.woocommerce.android.ui.orders.shippinglabels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelActionListener;", "", "openShippingLabelRefund", "", "orderId", "", "shippingLabelId", "WooCommerce_vanillaDebug"})
public abstract interface ShippingLabelActionListener {
    
    public abstract void openShippingLabelRefund(long orderId, long shippingLabelId);
}