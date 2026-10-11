package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b5.c;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import s4.d;
import s4.e;
import s4.f;

/* loaded from: classes.dex */
public final class zzam extends k {
    public zzam(Context context, Looper looper, h hVar, m mVar, n nVar) {
        super(context, looper, 120, hVar, mVar, nVar);
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i10 = e.f9898a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        if (queryLocalInterface instanceof f) {
            return (f) queryLocalInterface;
        }
        return new d(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final c[] getApiFeatures() {
        return new c[]{z7.c.f12117k};
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
