package org.org.googleplay;
//import java.util.ArrayList;
import java.util.List;
//import java.lang.String;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
//import com.android.os.Bundle;
import org.org.googleplay.ULCallbackWrapper;

//public class KivyPurchasesUpdatedListener extends PurchasesUpdatedListener {
public class KivyPurchasesUpdatedListener implements PurchasesUpdatedListener {

    private ULCallbackWrapper callback_wrapper;

    public KivyPurchasesUpdatedListener(ULCallbackWrapper callback_wrapper) {
	    this.callback_wrapper = callback_wrapper;
    }

   @Override
   public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> purchases) {
    //public void onPurchasesUpdated(@NonNull BillingResult billingResult, @Nullable List<Purchase> purchases) {
	   if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && purchases != null) {
	       this.callback_wrapper.callback_data(billingResult,purchases );
	   }
    }

}
