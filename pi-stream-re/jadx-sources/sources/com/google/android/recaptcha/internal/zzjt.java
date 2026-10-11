package com.google.android.recaptcha.internal;

import a3.g;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjt extends zzgh implements RandomAccess, zzja, zzkm {
    private static final zzjt zza = new zzjt(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    public zzjt() {
        this(new long[10], 0, true);
    }

    public static zzjt zzf() {
        return zza;
    }

    private final String zzh(int i10) {
        return g.p("Index:", i10, ", Size:", this.zzc);
    }

    private final void zzi(int i10) {
        if (i10 >= 0 && i10 < this.zzc) {
        } else {
            throw new IndexOutOfBoundsException(zzh(i10));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i10 >= 0 && i10 <= (i11 = this.zzc)) {
            int i12 = i10 + 1;
            long[] jArr = this.zzb;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
            } else {
                long[] jArr2 = new long[g.j(i11, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.zzb, i10, jArr2, i12, this.zzc - i10);
                this.zzb = jArr2;
            }
            this.zzb[i10] = longValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzh(i10));
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzjc.zzd;
        collection.getClass();
        if (!(collection instanceof zzjt)) {
            return super.addAll(collection);
        }
        zzjt zzjtVar = (zzjt) collection;
        int i10 = zzjtVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (f.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.zzb;
            if (i12 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(zzjtVar.zzb, 0, this.zzb, this.zzc, zzjtVar.zzc);
            this.zzc = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjt)) {
            return super.equals(obj);
        }
        zzjt zzjtVar = (zzjt) obj;
        if (this.zzc != zzjtVar.zzc) {
            return false;
        }
        long[] jArr = zzjtVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzi(i10);
        return Long.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            long j4 = this.zzb[i11];
            byte[] bArr = zzjc.zzd;
            i10 = (i10 * 31) + ((int) (j4 ^ (j4 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzi(i10);
        long[] jArr = this.zzb;
        long j4 = jArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i11, jArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzi(i10);
        long[] jArr = this.zzb;
        long j4 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final /* bridge */ /* synthetic */ zzjb zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzjt(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i10) {
        zzi(i10);
        return this.zzb[i10];
    }

    public final void zzg(long j4) {
        zza();
        int i10 = this.zzc;
        long[] jArr = this.zzb;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[g.j(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        jArr3[i11] = j4;
    }

    private zzjt(long[] jArr, int i10, boolean z9) {
        super(z9);
        this.zzb = jArr;
        this.zzc = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
