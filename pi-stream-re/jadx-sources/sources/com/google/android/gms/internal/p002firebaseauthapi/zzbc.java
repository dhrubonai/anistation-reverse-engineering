package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzbc<K> extends zzav<K> {
    private final transient zzau<K, ?> zza;
    private final transient zzaq<K> zzb;

    public zzbc(zzau<K, ?> zzauVar, zzaq<K> zzaqVar) {
        this.zza = zzauVar;
        this.zzb = zzaqVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final int zza(Object[] objArr, int i10) {
        return zzc().zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzav, com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzaq<K> zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzav, com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public final zzbd<K> iterator() {
        return (zzbd) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zze() {
        return true;
    }
}
