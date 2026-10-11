package x6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import r6.h0;

/* loaded from: classes.dex */
public final class s extends e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f11326a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11327b;

    /* renamed from: c, reason: collision with root package name */
    public int f11328c;

    /* renamed from: d, reason: collision with root package name */
    public int f11329d;

    public s(Object[] objArr, int i10) {
        boolean z9;
        this.f11326a = objArr;
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (i10 <= objArr.length) {
                this.f11327b = objArr.length;
                this.f11329d = i10;
                return;
            } else {
                StringBuilder u9 = a3.g.u("ring buffer filled size: ", i10, " cannot be larger than the buffer size: ");
                u9.append(objArr.length);
                throw new IllegalArgumentException(u9.toString().toString());
            }
        }
        throw new IllegalArgumentException(a3.g.n("ring buffer filled size should not be negative but it is ", i10).toString());
    }

    @Override // x6.b
    public final int b() {
        return this.f11329d;
    }

    public final void c(int i10) {
        boolean z9;
        boolean z10 = true;
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (i10 > this.f11329d) {
                z10 = false;
            }
            if (z10) {
                if (i10 > 0) {
                    int i11 = this.f11328c;
                    int i12 = this.f11327b;
                    int i13 = (i11 + i10) % i12;
                    Object[] objArr = this.f11326a;
                    if (i11 > i13) {
                        i.k1(objArr, i11, i12);
                        i.k1(objArr, 0, i13);
                    } else {
                        i.k1(objArr, i11, i13);
                    }
                    this.f11328c = i13;
                    this.f11329d -= i10;
                    return;
                }
                return;
            }
            StringBuilder u9 = a3.g.u("n shouldn't be greater than the buffer size: n = ", i10, ", size = ");
            u9.append(this.f11329d);
            throw new IllegalArgumentException(u9.toString().toString());
        }
        throw new IllegalArgumentException(a3.g.n("n shouldn't be negative but it is ", i10).toString());
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int b10 = b();
        if (i10 >= 0 && i10 < b10) {
            return this.f11326a[(this.f11328c + i10) % this.f11327b];
        }
        throw new IndexOutOfBoundsException(a3.g.p("index: ", i10, ", size: ", b10));
    }

    @Override // x6.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new r(this);
    }

    @Override // x6.b, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // x6.b, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        h0.u(objArr, "array");
        int length = objArr.length;
        int i10 = this.f11329d;
        if (length < i10) {
            objArr = Arrays.copyOf(objArr, i10);
            h0.s(objArr, "copyOf(...)");
        }
        int i11 = this.f11329d;
        int i12 = this.f11328c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr2 = this.f11326a;
            if (i14 >= i11 || i12 >= this.f11327b) {
                break;
            }
            objArr[i14] = objArr2[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            objArr[i14] = objArr2[i13];
            i14++;
            i13++;
        }
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }
}
