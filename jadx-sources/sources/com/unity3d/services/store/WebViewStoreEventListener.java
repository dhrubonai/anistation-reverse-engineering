package com.unity3d.services.store;

import com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import defpackage.q71;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WebViewStoreEventListener implements StoreEventListener {
    private final boolean isLifecycleListener;
    private final int operationId;
    private final StoreWebViewEventSender storeWebViewEventSender;

    public WebViewStoreEventListener(int i, StoreWebViewEventSender storeWebViewEventSender, boolean z) {
        storeWebViewEventSender.getClass();
        this.operationId = i;
        this.storeWebViewEventSender = storeWebViewEventSender;
        this.isLifecycleListener = z;
    }

    @Override // com.unity3d.services.store.gpbl.listeners.StoreEventListener
    public int getOperationId() {
        return this.operationId;
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        this.storeWebViewEventSender.send(StoreEvent.DISCONNECTED_RESULT, new Object[0]);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingSetupFinished(BillingResultBridge billingResultBridge) {
        billingResultBridge.getClass();
        BillingResultResponseCode responseCode = billingResultBridge.getResponseCode();
        BillingResultResponseCode billingResultResponseCode = BillingResultResponseCode.OK;
        StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        if (responseCode == billingResultResponseCode) {
            storeWebViewEventSender.send(StoreEvent.INITIALIZATION_REQUEST_RESULT, billingResultBridge.getResponseCode());
        } else {
            storeWebViewEventSender.send(StoreEvent.INITIALIZATION_REQUEST_FAILED, billingResultBridge.getResponseCode());
        }
    }

    @Override // com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener
    public void onFeatureSupported(int i) {
        this.storeWebViewEventSender.send(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_RESULT, Integer.valueOf(getOperationId()), Integer.valueOf(i));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
    public void onIsAlreadyInitialized() {
        this.storeWebViewEventSender.send(StoreEvent.INITIALIZATION_REQUEST_RESULT, Integer.valueOf(BillingResultResponseCode.OK.getResponseCode()));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener
    public void onPurchaseHistoryUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseHistoryRecordBridge> list) {
        JSONArray jSONArray;
        billingResultBridge.getClass();
        StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        StoreEvent storeEvent = StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_RESULT;
        Integer valueOf = Integer.valueOf(getOperationId());
        BillingResultResponseCode responseCode = billingResultBridge.getResponseCode();
        if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
            jSONArray = new JSONArray();
        }
        storeWebViewEventSender.send(storeEvent, valueOf, responseCode, jSONArray);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
    public void onPurchaseResponse(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
        StoreEvent storeEvent;
        JSONArray jSONArray;
        StoreEvent storeEvent2;
        billingResultBridge.getClass();
        ArrayList arrayList = new ArrayList();
        if (getOperationId() != -1) {
            arrayList.add(Integer.valueOf(getOperationId()));
        }
        if (billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
            if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
                jSONArray = new JSONArray();
            }
            arrayList.add(jSONArray);
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            if (this.isLifecycleListener) {
                storeEvent2 = StoreEvent.PURCHASES_ON_RESUME_RESULT;
            } else {
                storeEvent2 = StoreEvent.PURCHASES_REQUEST_RESULT;
            }
            Object[] array = arrayList.toArray(new Object[0]);
            storeWebViewEventSender.send(storeEvent2, Arrays.copyOf(array, array.length));
            return;
        }
        arrayList.add(billingResultBridge.getResponseCode());
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        if (this.isLifecycleListener) {
            storeEvent = StoreEvent.PURCHASES_ON_RESUME_ERROR;
        } else {
            storeEvent = StoreEvent.PURCHASES_REQUEST_ERROR;
        }
        Object[] array2 = arrayList.toArray(new Object[0]);
        storeWebViewEventSender2.send(storeEvent, Arrays.copyOf(array2, array2.length));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
    public void onPurchaseUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
        JSONArray jSONArray;
        billingResultBridge.getClass();
        BillingResultResponseCode responseCode = billingResultBridge.getResponseCode();
        BillingResultResponseCode billingResultResponseCode = BillingResultResponseCode.OK;
        StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        if (responseCode == billingResultResponseCode) {
            StoreEvent storeEvent = StoreEvent.PURCHASES_UPDATED_RESULT;
            if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
                jSONArray = new JSONArray();
            }
            storeWebViewEventSender.send(storeEvent, jSONArray);
            return;
        }
        storeWebViewEventSender.send(StoreEvent.PURCHASES_UPDATED_ERROR, billingResultBridge.getResponseCode());
    }

    @Override // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
    public void onSkuDetailsUpdated(BillingResultBridge billingResultBridge, List<? extends SkuDetailsBridge> list) {
        JSONArray jSONArray;
        billingResultBridge.getClass();
        StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        StoreEvent storeEvent = StoreEvent.SKU_DETAILS_LIST_REQUEST_RESULT;
        Integer valueOf = Integer.valueOf(getOperationId());
        if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
            jSONArray = new JSONArray();
        }
        storeWebViewEventSender.send(storeEvent, valueOf, jSONArray);
    }

    public /* synthetic */ WebViewStoreEventListener(int i, StoreWebViewEventSender storeWebViewEventSender, boolean z, int i2, q71 q71Var) {
        this(i, storeWebViewEventSender, (i2 & 4) != 0 ? false : z);
    }
}
