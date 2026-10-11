package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzas<E> extends zzak<E> {
    private final zzaq<E> zza;

    public zzas(zzaq<E> zzaqVar, int i10) {
        super(zzaqVar.size(), i10);
        this.zza = zzaqVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final E zza(int i10) {
        return this.zza.get(i10);
    }
}
