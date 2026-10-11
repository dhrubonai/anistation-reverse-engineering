package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzay<E> extends zzaq<E> {
    static final zzaq<Object> zza = new zzay(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzay(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final E get(int i10) {
        zzz.zza(i10, this.zzc);
        E e10 = (E) this.zzb[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, i10, this.zzc);
        return i10 + this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final Object[] zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final int zza() {
        return this.zzc;
    }
}
