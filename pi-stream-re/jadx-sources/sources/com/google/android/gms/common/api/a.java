package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class a extends f {
    @Deprecated
    public g buildClient(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, Object obj, m mVar, n nVar) {
        return buildClient(context, looper, hVar, obj, (com.google.android.gms.common.api.internal.g) mVar, (com.google.android.gms.common.api.internal.p) nVar);
    }

    public g buildClient(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, Object obj, com.google.android.gms.common.api.internal.g gVar, com.google.android.gms.common.api.internal.p pVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
