package com.unity3d.ads.metadata;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@Deprecated
/* loaded from: classes.dex */
public class InAppPurchaseMetaData extends MetaData {
    public static final String IAP_KEY = "iap";
    public static final String KEY_CURRENCY = "currency";
    public static final String KEY_PRICE = "price";
    public static final String KEY_PRODUCT_ID = "productId";
    public static final String KEY_RECEIPT_PURCHASE_DATA = "receiptPurchaseData";
    public static final String KEY_SIGNATURE = "signature";

    public InAppPurchaseMetaData(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // com.unity3d.ads.metadata.MetaData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void commit() {
        /*
            r6 = this;
            android.content.Context r0 = r6._context
            boolean r0 = com.unity3d.services.core.device.StorageManager.init(r0)
            if (r0 == 0) goto L54
            com.unity3d.services.core.device.StorageManager$StorageType r0 = com.unity3d.services.core.device.StorageManager.StorageType.PUBLIC
            com.unity3d.services.core.device.Storage r0 = com.unity3d.services.core.device.StorageManager.getStorage(r0)
            org.json.JSONObject r1 = r6.getData()
            if (r1 == 0) goto L53
            if (r0 == 0) goto L53
            java.lang.String r1 = "iap.purchases"
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L26
            org.json.JSONArray r2 = (org.json.JSONArray) r2     // Catch: java.lang.Exception -> L21
            goto L27
        L21:
            java.lang.String r2 = "Invalid object type for purchases"
            com.unity3d.services.core.log.DeviceLog.error(r2)
        L26:
            r2 = 0
        L27:
            if (r2 != 0) goto L2e
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
        L2e:
            org.json.JSONObject r6 = r6.getData()
            java.lang.String r3 = "ts"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L4e
            r6.put(r3, r4)     // Catch: org.json.JSONException -> L4e
            r2.put(r6)
            r0.set(r1, r2)
            r0.writeStorage()
            com.unity3d.services.core.device.StorageEvent r6 = com.unity3d.services.core.device.StorageEvent.SET
            java.lang.Object r1 = r0.get(r1)
            r0.sendEvent(r6, r1)
            goto L53
        L4e:
            java.lang.String r6 = "Error constructing purchase object"
            com.unity3d.services.core.log.DeviceLog.error(r6)
        L53:
            return
        L54:
            java.lang.String r6 = "Unity Ads could not commit metadata due to storage error or the data is null"
            com.unity3d.services.core.log.DeviceLog.error(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.metadata.InAppPurchaseMetaData.commit():void");
    }

    @Override // com.unity3d.ads.metadata.MetaData, com.unity3d.services.core.misc.JsonStorage
    public synchronized boolean set(String str, Object obj) {
        return setRaw(str, obj);
    }

    public void setCurrency(String str) {
        set(KEY_CURRENCY, str);
    }

    public void setPrice(Double d) {
        set(KEY_PRICE, d);
    }

    public void setProductId(String str) {
        set(KEY_PRODUCT_ID, str);
    }

    public void setReceiptPurchaseData(String str) {
        set(KEY_RECEIPT_PURCHASE_DATA, str);
    }

    public void setSignature(String str) {
        set(KEY_SIGNATURE, str);
    }
}
