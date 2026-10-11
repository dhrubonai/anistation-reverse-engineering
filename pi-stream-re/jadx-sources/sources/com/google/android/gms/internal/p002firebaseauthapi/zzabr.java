package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.internal.zzl;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzabr extends zzacw<Void, zzl> {
    private final String zzaa;
    private final long zzab;
    private final boolean zzac;
    private final boolean zzad;
    private final String zzae;
    private final String zzaf;
    private final boolean zzag;
    private final String zzy;
    private final String zzz;

    public zzabr(zzam zzamVar, String str, String str2, long j4, boolean z9, boolean z10, String str3, String str4, boolean z11) {
        super(8);
        b.s(zzamVar);
        b.o(str);
        String zzb = zzamVar.zzb();
        b.o(zzb);
        this.zzy = zzb;
        this.zzz = str;
        this.zzaa = str2;
        this.zzab = j4;
        this.zzac = z9;
        this.zzad = z10;
        this.zzae = str3;
        this.zzaf = str4;
        this.zzag = z11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzae, this.zzaf, this.zzag, this.zzb);
    }
}
