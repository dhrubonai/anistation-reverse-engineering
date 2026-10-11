package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import t4.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzbj extends d {
    public zzbj(o oVar) {
        super(c.f10031a, oVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ s createFailedResult(Status status) {
        return new zzbv(status);
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        zzbe zzbeVar = (zzbe) bVar;
        zza(zzbeVar.getContext(), (zzbh) zzbeVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzbj) obj);
    }

    public abstract void zza(Context context, zzbh zzbhVar);
}
