package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.h;

/* loaded from: classes.dex */
public final class zzx extends a {
    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ g buildClient(Context context, Looper looper, h hVar, Object obj, m mVar, n nVar) {
        return new zzy(context, looper, hVar, mVar, nVar);
    }
}
