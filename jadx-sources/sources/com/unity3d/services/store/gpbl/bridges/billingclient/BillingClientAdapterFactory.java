package com.unity3d.services.store.gpbl.bridges.billingclient;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import defpackage.y45;
import defpackage.z45;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class BillingClientAdapterFactory {
    private final BillingClientAdapter createV6Adapter(Context context, int i) {
        Object y45Var;
        try {
            BillingClientBuilderBridge newBuilder = BillingClientBridge.newBuilder(context);
            newBuilder.getClass();
            y45Var = new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter(newBuilder, i);
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (y45Var instanceof y45) {
            y45Var = null;
        }
        return (BillingClientAdapter) y45Var;
    }

    public static /* synthetic */ BillingClientAdapter createV6Adapter$default(BillingClientAdapterFactory billingClientAdapterFactory, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 6;
        }
        return billingClientAdapterFactory.createV6Adapter(context, i);
    }

    /* renamed from: createV8Adapter-IoAF18A, reason: not valid java name */
    private final Object m66createV8AdapterIoAF18A(Context context) {
        try {
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter billingClientAdapter = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.Companion.newBuilder(context));
            if (new QueryProductDetailsResultsBridge(new Object()).exists()) {
                return billingClientAdapter;
            }
            throw new FallbackException(7);
        } catch (Throwable th) {
            return new y45(th);
        }
    }

    public final BillingClientAdapter createBillingClientAdapter(Context context) {
        BillingClientAdapter createV6Adapter$default;
        context.getClass();
        Object m66createV8AdapterIoAF18A = m66createV8AdapterIoAF18A(context);
        Throwable b = z45.b(m66createV8AdapterIoAF18A);
        if (b != null) {
            if (b instanceof FallbackException) {
                createV6Adapter$default = createV6Adapter(context, ((FallbackException) b).getDetectedVersion());
            } else {
                createV6Adapter$default = createV6Adapter$default(this, context, 0, 2, null);
            }
            m66createV8AdapterIoAF18A = createV6Adapter$default;
        }
        return (BillingClientAdapter) m66createV8AdapterIoAF18A;
    }
}
