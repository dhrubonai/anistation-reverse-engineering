package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b5.c;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import w4.q;

/* loaded from: classes.dex */
public final class zbx extends k {
    private final Bundle zba;

    public zbx(Context context, Looper looper, q qVar, h hVar, g gVar, p pVar) {
        super(context, looper, 223, hVar, gVar, pVar);
        this.zba = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        if (queryLocalInterface instanceof zbad) {
            return (zbad) queryLocalInterface;
        }
        return new zbad(iBinder);
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
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
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
