package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class zzi<T> implements Iterator<T> {
    private int zza = zzh.zzb;
    private T zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z9;
        int i10 = this.zza;
        int i11 = zzh.zzd;
        if (i10 != i11) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            int i12 = i10 - 1;
            if (i12 == 0) {
                return true;
            }
            if (i12 != 2) {
                this.zza = i11;
                this.zzb = zza();
                if (this.zza != zzh.zzc) {
                    this.zza = zzh.zza;
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.zza = zzh.zzb;
            T t9 = this.zzb;
            this.zzb = null;
            return t9;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract T zza();

    public final T zzb() {
        this.zza = zzh.zzc;
        return null;
    }
}
