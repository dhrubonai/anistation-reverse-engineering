package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzbb extends zzaq<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzbb(Object[] objArr, int i10, int i11) {
        this.zza = objArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzz.zza(i10, this.zzc);
        Object obj = this.zza[(i10 * 2) + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zze() {
        return true;
    }
}
