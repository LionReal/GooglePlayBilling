package org.org.googleplay;
//import java.util.ArrayList;
//import java.util.List;
//import java.lang.String;

import com.android.billingclient.api.BillingClient;
//import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
//import com.android.billingclient.api.Purchase;

//import com.android.os.Bundle;
import org.org.googleplay.SLCallbackWrapper;

//public class KivyBillingClientStateListener extends BillingClientStateListener {
public class KivyBillingClientStateListener implements BillingClientStateListener {

    private SLCallbackWrapper callback_wrapper;

    public KivyBillingClientStateListener(SLCallbackWrapper callback_wrapper) {
	    this.callback_wrapper = callback_wrapper;
    }

    @Override
    public void onBillingSetupFinished(BillingResult billingResult) {
        if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
            // The setup process was successful.
	    System.out.println("The setup process was successful");
            this.callback_wrapper.callback_data(billingResult );
        } else {
            // The setup process failed.
	    System.out.println("The setup process failed.");
            this.callback_wrapper.callback_data(billingResult );
        }
    }

    @Override
    public void onBillingServiceDisconnected() {
        // Handle the case where the BillingService has disconnected.
    }



}
