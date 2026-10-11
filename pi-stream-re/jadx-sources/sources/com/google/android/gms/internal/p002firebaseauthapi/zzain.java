package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzain extends zzahg<Double> implements zzakw, RandomAccess {
    private static final zzain zza = new zzain(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    public zzain() {
        this(new double[10], 0, true);
    }

    private final String zzb(int i10) {
        return g.p("Index:", i10, ", Size:", this.zzc);
    }

    private final void zzc(int i10) {
        if (i10 >= 0 && i10 < this.zzc) {
        } else {
            throw new IndexOutOfBoundsException(zzb(i10));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i10 >= 0 && i10 <= (i11 = this.zzc)) {
            double[] dArr = this.zzb;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[g.j(i11, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.zzb, i10, dArr2, i10 + 1, this.zzc - i10);
                this.zzb = dArr2;
            }
            this.zzb[i10] = doubleValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzb(i10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zza();
        zzajc.zza(collection);
        if (!(collection instanceof zzain)) {
            return super.addAll(collection);
        }
        zzain zzainVar = (zzain) collection;
        int i10 = zzainVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (f.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.zzb;
            if (i12 > dArr.length) {
                this.zzb = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(zzainVar.zzb, 0, this.zzb, this.zzc, zzainVar.zzc);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahg, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzain)) {
            return super.equals(obj);
        }
        zzain zzainVar = (zzain) obj;
        if (this.zzc != zzainVar.zzc) {
            return false;
        }
        double[] dArr = zzainVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (Double.doubleToLongBits(this.zzb[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzc(i10);
        return Double.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahg, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + zzajc.zza(Double.doubleToLongBits(this.zzb[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.zzb[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        zza();
        zzc(i10);
        double[] dArr = this.zzb;
        double d10 = dArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            double[] dArr = this.zzb;
            System.arraycopy(dArr, i11, dArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzc(i10);
        double[] dArr = this.zzb;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
    public final /* synthetic */ zzajg zza(int i10) {
        if (i10 >= this.zzc) {
            return new zzain(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzain(double[] dArr, int i10, boolean z9) {
        super(z9);
        this.zzb = dArr;
        this.zzc = i10;
    }

    public final void zza(double d10) {
        zza();
        int i10 = this.zzc;
        double[] dArr = this.zzb;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[g.j(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Double) obj).doubleValue());
        return true;
    }
}
