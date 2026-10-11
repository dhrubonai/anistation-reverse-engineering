package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import s4.f;

/* loaded from: classes.dex */
final class zzag extends d {
    final /* synthetic */ Account zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzal zzalVar, i iVar, o oVar, Account account) {
        super(iVar, oVar);
        this.zza = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final s createFailedResult(Status status) {
        return new zzak(status);
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void doExecute(b bVar) {
        f fVar = (f) ((zzam) bVar).getService();
        zzaf zzafVar = new zzaf(this);
        Account account = this.zza;
        s4.d dVar = (s4.d) fVar;
        Parcel zza = dVar.zza();
        zzc.zze(zza, zzafVar);
        zzc.zzd(zza, account);
        dVar.zzc(3, zza);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzag) obj);
    }
}
