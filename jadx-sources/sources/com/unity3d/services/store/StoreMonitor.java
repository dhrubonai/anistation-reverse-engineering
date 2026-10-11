package com.unity3d.services.store;

import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.core.StoreLifecycleListener;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import defpackage.sx5;
import defpackage.tx5;
import defpackage.x44;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class StoreMonitor {
    private final x44 _isInitialized;
    private StoreBilling storeBilling;
    private final StoreExceptionHandler storeExceptionHandler;
    private StoreLifecycleListener storeLifecycleListener;

    public StoreMonitor(StoreExceptionHandler storeExceptionHandler) {
        storeExceptionHandler.getClass();
        this.storeExceptionHandler = storeExceptionHandler;
        this._isInitialized = tx5.a(Boolean.FALSE);
    }

    public final void getPurchaseHistory(int i, String str, int i2, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        purchaseHistoryResponseListener.getClass();
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getPurchaseHistory(str, i2, purchaseHistoryResponseListener);
            }
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_ERROR, i, e);
        }
    }

    public final void getPurchases(int i, String str, PurchasesResponseListener purchasesResponseListener) {
        purchasesResponseListener.getClass();
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                if (storeBilling != null) {
                    storeBilling.getPurchases(str, purchasesResponseListener);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASES_REQUEST_ERROR, i, e);
        }
    }

    public final void getSkuDetails(int i, String str, List<String> list, SkuDetailsResponseListener skuDetailsResponseListener) {
        skuDetailsResponseListener.getClass();
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getSkuDetails(str, list, skuDetailsResponseListener);
            }
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.SKU_DETAILS_LIST_REQUEST_ERROR, i, e);
        }
    }

    public final void initialize(BillingInitializationListener billingInitializationListener) {
        billingInitializationListener.getClass();
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        StoreBilling storeBilling = new StoreBilling(ClientProperties.getApplicationContext(), billingInitializationListener);
        this.storeBilling = storeBilling;
        storeBilling.initialize(billingInitializationListener);
        x44 x44Var = this._isInitialized;
        Boolean bool = Boolean.TRUE;
        sx5 sx5Var = (sx5) x44Var;
        sx5Var.getClass();
        sx5Var.l(null, bool);
    }

    public final int isFeatureSupported(int i, String str, FeatureSupportedListener featureSupportedListener) {
        featureSupportedListener.getClass();
        int i2 = -1;
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                i2 = storeBilling.isFeatureSupported(str);
            }
            featureSupportedListener.onFeatureSupported(i2);
            return i2;
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_ERROR, i, e);
            return i2;
        }
    }

    public final boolean isInitialized() {
        return ((Boolean) ((sx5) this._isInitialized).getValue()).booleanValue();
    }

    public final void startPurchaseTracking(ArrayList<String> arrayList, StoreEventListener storeEventListener) {
        arrayList.getClass();
        storeEventListener.getClass();
        if (this.storeLifecycleListener != null) {
            stopPurchaseTracking();
        }
        StoreBilling storeBilling = this.storeBilling;
        storeBilling.getClass();
        this.storeLifecycleListener = new StoreLifecycleListener(arrayList, storeBilling, storeEventListener);
        ClientProperties.getApplication().registerActivityLifecycleCallbacks(this.storeLifecycleListener);
    }

    public final void stopPurchaseTracking() {
        if (this.storeLifecycleListener != null) {
            ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(this.storeLifecycleListener);
            this.storeLifecycleListener = null;
        }
    }
}
