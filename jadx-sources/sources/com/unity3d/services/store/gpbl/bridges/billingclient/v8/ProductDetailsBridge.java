package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import defpackage.ai4;
import defpackage.b06;
import defpackage.q71;
import defpackage.uz5;
import defpackage.vn3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ProductDetailsBridge extends GenericBridge implements BillingOriginalJsonResponse {
    public static final Companion Companion = new Companion(null);
    private static final String TO_STRING_METHOD = "toString";
    private final Object internalRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsBridge(Object obj) {
        super(vn3.R(new ai4(TO_STRING_METHOD, new Class[0])));
        obj.getClass();
        this.internalRef = obj;
    }

    private final String parseOriginalJson(String str) {
        try {
            int T = uz5.T(str, "jsonString='", 0, false, 6) + 12;
            int T2 = uz5.T(str, "', parsedJson=", 0, false, 6);
            if (1 <= T && T < T2) {
                return b06.G(str.substring(T, T2), "\\/", "/");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.ProductDetails";
    }

    @Override // com.unity3d.services.store.gpbl.BillingOriginalJsonResponse
    public JSONObject getOriginalJson() {
        try {
            String parseOriginalJson = parseOriginalJson(toString());
            if (parseOriginalJson != null) {
                return new JSONObject(parseOriginalJson);
            }
            return new JSONObject();
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public String toString() {
        Object callNonVoidMethod = callNonVoidMethod(TO_STRING_METHOD, this.internalRef, new Object[0]);
        callNonVoidMethod.getClass();
        return (String) callNonVoidMethod;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }
}
