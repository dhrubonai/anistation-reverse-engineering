package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import t4.a;
import z3.e;

/* loaded from: classes.dex */
public final class zbo extends k {
    private final a zba;

    public zbo(Context context, Looper looper, h hVar, a aVar, m mVar, n nVar) {
        super(context, looper, 68, hVar, mVar, nVar);
        e eVar = new e(aVar == null ? a.f10026c : aVar);
        eVar.f12045c = zbbj.zba();
        this.zba = new a(eVar);
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof zbt) {
            return (zbt) queryLocalInterface;
        }
        return new zbt(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        a aVar = this.zba;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", aVar.f10027a);
        bundle.putString("log_session_id", aVar.f10028b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final a zba() {
        return this.zba;
    }
}
