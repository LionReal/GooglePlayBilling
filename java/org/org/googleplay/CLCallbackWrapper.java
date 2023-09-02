package org.org.googleplay;
import com.android.billingclient.api.BillingResult;
import java.lang.String;

public interface CLCallbackWrapper {
    public void callback_data(BillingResult billingResult, String purchaseToken);
}
