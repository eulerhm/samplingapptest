package com.woocommerce.android.support;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aP\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0002\u001a8\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002\u001a4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002\u001a\u001c\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0018\u0010\u001a\u001a\u00020\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002\u001a\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000eH\u0002\u001a\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"enablePushNotificationsDelayAfterIdentityChange", "", "maxLogfileLength", "", "zendeskNeedsToBeEnabledError", "", "buildZendeskConfig", "Lzendesk/configurations/Configuration;", "context", "Landroid/content/Context;", "ticketType", "Lcom/woocommerce/android/support/TicketType;", "allSites", "", "Lorg/wordpress/android/fluxc/model/SiteModel;", "origin", "Lcom/woocommerce/android/support/HelpActivity$Origin;", "selectedSite", "extraTags", "buildZendeskCustomFields", "Lzendesk/support/CustomField;", "buildZendeskTags", "createZendeskIdentity", "Lzendesk/core/Identity;", "email", "name", "getCombinedLogInformationOfSites", "getHomeURLOrHostName", "site", "getNetworkInformation", "WooCommerce_wasabiDebug"})
public final class ZendeskHelperKt {
    private static final java.lang.String zendeskNeedsToBeEnabledError = "Zendesk needs to be setup before this method can be called";
    private static final long enablePushNotificationsDelayAfterIdentityChange = 2500L;
    private static final int maxLogfileLength = 63000;
    
    /**
     * This is a helper function which builds a `zendesk.configurations.Configuration` through helpers
     * to be used during ticket creation.
     */
    private static final zendesk.configurations.Configuration buildZendeskConfig(android.content.Context context, com.woocommerce.android.support.TicketType ticketType, java.util.List<? extends org.wordpress.android.fluxc.model.SiteModel> allSites, com.woocommerce.android.support.HelpActivity.Origin origin, org.wordpress.android.fluxc.model.SiteModel selectedSite, java.util.List<java.lang.String> extraTags) {
        return null;
    }
    
    private static final java.lang.String getHomeURLOrHostName(org.wordpress.android.fluxc.model.SiteModel site) {
        return null;
    }
    
    /**
     * This is a helper function which builds a list of `CustomField`s which will be used during ticket creation. They
     * will be used to fill the custom fields we have setup in Zendesk UI for Happiness Engineers.
     */
    private static final java.util.List<zendesk.support.CustomField> buildZendeskCustomFields(android.content.Context context, com.woocommerce.android.support.TicketType ticketType, java.util.List<? extends org.wordpress.android.fluxc.model.SiteModel> allSites, org.wordpress.android.fluxc.model.SiteModel selectedSite) {
        return null;
    }
    
    /**
     * This is a helper function which creates an anonymous Zendesk identity with the email and name passed in. They can
     * both be `null` as they are not required for a valid identity.
     *
     * An important thing to note is that whenever a different set of values are passed in, a different identity will be
     * created which will reset the ticket list for the user. So, for example, even if the passed in email is the same,
     * if the name is different, it'll reset Zendesk's local DB.
     *
     * This is currently the way we handle identity for Zendesk, but it's possible that we may switch to a JWT based
     * authentication which will avoid the resetting issue, but will mean that we'll need to involve our own servers in the
     * authentication. More information can be found in their documentation:
     * https://developer.zendesk.com/embeddables/docs/android-support-sdk/sdk_set_identity#setting-a-unique-identity
     */
    private static final zendesk.core.Identity createZendeskIdentity(java.lang.String email, java.lang.String name) {
        return null;
    }
    
    /**
     * This is a small helper function which just joins the `logInformation` of all the sites passed in with a separator.
     */
    private static final java.lang.String getCombinedLogInformationOfSites(java.util.List<? extends org.wordpress.android.fluxc.model.SiteModel> allSites) {
        return null;
    }
    
    /**
     * This is a helper function which returns a set of pre-defined tags depending on some conditions. It accepts a list of
     * custom tags to be added for special cases.
     */
    private static final java.util.List<java.lang.String> buildZendeskTags(java.util.List<? extends org.wordpress.android.fluxc.model.SiteModel> allSites, com.woocommerce.android.support.HelpActivity.Origin origin, java.util.List<java.lang.String> extraTags) {
        return null;
    }
    
    /**
     * This is a helper function which returns information about the network state of the app to be sent to Zendesk, which
     * could prove useful for the Happiness Engineers while debugging the users' issues.
     */
    private static final java.lang.String getNetworkInformation(android.content.Context context) {
        return null;
    }
}