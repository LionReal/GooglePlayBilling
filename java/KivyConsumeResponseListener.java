package org.org.googleplay;
import java.lang.String;

import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.BillingResult;
import org.org.googleplay.CLCallbackWrapper;

public class KivyConsumeResponseListener implements ConsumeResponseListener {

    private CLCallbackWrapper callback_wrapper;

    public KivyConsumeResponseListener(CLCallbackWrapper callback_wrapper) {
	    this.callback_wrapper = callback_wrapper;
    }

   @Override
   public void onConsumeResponse(BillingResult billingResult, String purchaseToken) {
	   this.callback_wrapper.callback_data(billingResult,purchaseToken );
    }

}
