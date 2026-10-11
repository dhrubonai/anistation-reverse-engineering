package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import t4.c;
import t4.d;

/* loaded from: classes.dex */
public final class zzbe extends k {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, h hVar, d dVar, g gVar, p pVar) {
        super(context, looper, 16, hVar, gVar, pVar);
        Bundle bundle;
        if (dVar == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(dVar.f10033a);
        }
        this.zze = bundle;
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof zzbh) {
            return (zzbh) queryLocalInterface;
        }
        return new zzbh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        String str;
        h clientSettings = getClientSettings();
        Account account = clientSettings.f2521a;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            a3.g.z(clientSettings.f2524d.get(c.f10031a));
            if (!clientSettings.f2522b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
