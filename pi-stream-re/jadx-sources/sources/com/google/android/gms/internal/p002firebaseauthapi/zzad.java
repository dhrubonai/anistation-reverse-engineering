package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzad implements zzai {
    private final /* synthetic */ zzs zza;

    public zzad(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final /* synthetic */ Iterator zza(zzac zzacVar, CharSequence charSequence) {
        return new zzag(this, zzacVar, charSequence, this.zza.zza(charSequence));
    }
}
