package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b5.c;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import w4.p;

/* loaded from: classes.dex */
public final class zbw extends k {
    private final Bundle zba;

    public zbw(Context context, Looper looper, p pVar, h hVar, g gVar, com.google.android.gms.common.api.internal.p pVar2) {
        super(context, looper, 219, hVar, gVar, pVar2);
        pVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("session_id", pVar.f10996a);
        this.zba = bundle;
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        if (queryLocalInterface instanceof zbaa) {
            return (zbaa) queryLocalInterface;
        }
        return new zbaa(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final c[] getApiFeatures() {
        return zbbi.zbi;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
