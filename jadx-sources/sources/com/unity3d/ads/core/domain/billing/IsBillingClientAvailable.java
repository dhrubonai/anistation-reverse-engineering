package com.unity3d.ads.core.domain.billing;

import defpackage.y45;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class IsBillingClientAvailable {
    public final boolean invoke() {
        Object y45Var;
        try {
            y45Var = Class.forName("com.android.billingclient.api.BillingClient");
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        return !(y45Var instanceof y45);
    }
}
