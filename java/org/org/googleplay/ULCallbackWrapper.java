package org.org.googleplay;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import java.lang.String;
import java.util.List;

public interface ULCallbackWrapper {
    //public void callback_data(@NonNull BillingResult billingResult, @Nullable List<Purchase> purchases);
    public void callback_data(BillingResult billingResult, List purchases);
}
