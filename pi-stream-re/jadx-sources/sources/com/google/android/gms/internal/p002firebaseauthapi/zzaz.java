package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzaz extends zzaq {
    private final /* synthetic */ zzba zza;

    public zzaz(zzba zzbaVar) {
        this.zza = zzbaVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.zza.zzd;
        zzz.zza(i10, i11);
        objArr = this.zza.zzb;
        int i12 = i10 * 2;
        Object obj = objArr[i12];
        Objects.requireNonNull(obj);
        objArr2 = this.zza.zzb;
        Object obj2 = objArr2[i12 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.zza.zzd;
        return i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zze() {
        return true;
    }
}
