package org.org.googleplay;
import com.android.billingclient.api.BillingResult;
import java.lang.String;

public interface SLCallbackWrapper {
    //public void callback_data(@NonNull BillingResult billingResult);
    public void callback_data(BillingResult  billingResult);
}
