package org.org.googleplay;
//import java.util.ArrayList;
import java.util.List;
//import java.lang.String;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
//import com.android.os.Bundle;
import org.org.googleplay.DLCallbackWrapper;

//public class KivyProductDetailsResponseListener extends ProductDetailsResponseListener {
public class KivyProductDetailsResponseListener implements ProductDetailsResponseListener {

    private DLCallbackWrapper callback_wrapper;

    public KivyProductDetailsResponseListener(DLCallbackWrapper callback_wrapper) {
	    this.callback_wrapper = callback_wrapper;
    }

   @Override
   public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> productDetails) {
    //public void onProductDetailsResponse(@NonNull BillingResult billingResult, @Nullable List<ProductDetails> productDetails) {
	   if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK ) {
	       this.callback_wrapper.callback_data(productDetails);
	   }
	   else {
        // The product details query failed.
        System.out.println("The product details query failed.");
        }
    }

}
