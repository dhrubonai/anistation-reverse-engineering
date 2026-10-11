package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import s4.f;

/* loaded from: classes.dex */
final class zzac extends d {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzalVar, i iVar, o oVar, boolean z9) {
        super(iVar, oVar);
        this.zza = z9;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final s createFailedResult(Status status) {
        return new zzaj(status);
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void doExecute(b bVar) {
        f fVar = (f) ((zzam) bVar).getService();
        boolean z9 = this.zza;
        s4.d dVar = (s4.d) fVar;
        Parcel zza = dVar.zza();
        zzc.zzc(zza, z9);
        dVar.zzc(1, zza);
        setResult((zzac) new zzaj(Status.f2356f));
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzac) obj);
    }
}
