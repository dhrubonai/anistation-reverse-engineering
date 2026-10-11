package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import w7.b;

/* loaded from: classes.dex */
public final class zzbv implements s {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        b.s(status);
        this.zza = status;
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        b.s(str);
        this.zzb = str;
        this.zza = Status.f2356f;
    }
}
