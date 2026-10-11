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
final class zzae extends d {
    final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzal zzalVar, i iVar, o oVar, String str) {
        super(iVar, oVar);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ s createFailedResult(Status status) {
        return new zzai(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void doExecute(b bVar) {
        f fVar = (f) ((zzam) bVar).getService();
        zzad zzadVar = new zzad(this);
        String str = this.zza;
        s4.d dVar = (s4.d) fVar;
        Parcel zza = dVar.zza();
        zzc.zze(zza, zzadVar);
        zza.writeString(str);
        dVar.zzc(2, zza);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzae) obj);
    }
}
