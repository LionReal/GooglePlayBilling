package org.org.googleplay;
import com.android.billingclient.api.ProductDetails;
import java.lang.String;
import java.util.List;

public interface DLCallbackWrapper {
    //public void callback_data(@Nullable List<ProductDetails> productDetails);
    public void callback_data(List productDetails);
}
