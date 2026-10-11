package com.unity3d.ads.core.domain.billing;

import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import defpackage.pg0;
import defpackage.qg0;
import defpackage.vz0;
import defpackage.wc7;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonProductDetailsFetcher implements ProductDetailsFetcher {
    private final BillingClientAdapter billingClientAdapter;
    private final String productType;

    public CommonProductDetailsFetcher(BillingClientAdapter billingClientAdapter, String str) {
        str.getClass();
        this.billingClientAdapter = billingClientAdapter;
        this.productType = str;
    }

    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    public Object fetchProductDetails(String str, vz0 vz0Var) {
        final qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        ProductDetailsListener productDetailsListener = new ProductDetailsListener() { // from class: com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher$fetchProductDetails$2$listener$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsListener
            public final void onProductDetailsResponse(BillingResultBridge billingResultBridge, String str2) {
                billingResultBridge.getClass();
                if (str2 != null && billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
                    pg0.this.resumeWith(new ProductDetailsResult.Success(str2));
                    return;
                }
                BillingResultResponseCode responseCode = billingResultBridge.getResponseCode();
                BillingResultResponseCode billingResultResponseCode = BillingResultResponseCode.OK;
                pg0 pg0Var = pg0.this;
                if (responseCode == billingResultResponseCode) {
                    pg0Var.resumeWith(ProductDetailsResult.NotFound.INSTANCE);
                } else {
                    pg0Var.resumeWith(new ProductDetailsResult.Failure(billingResultBridge));
                }
            }
        };
        BillingClientAdapter billingClientAdapter = this.billingClientAdapter;
        if (billingClientAdapter != null) {
            billingClientAdapter.queryProductDetailsAsync(str, this.productType, productDetailsListener);
        }
        return qg0Var.r();
    }
}
