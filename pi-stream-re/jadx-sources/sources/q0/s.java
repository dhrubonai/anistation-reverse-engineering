package q0;

import android.util.SparseArray;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f8944a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final x f8945b;

    /* renamed from: c, reason: collision with root package name */
    public x f8946c;

    /* renamed from: d, reason: collision with root package name */
    public x f8947d;

    /* renamed from: e, reason: collision with root package name */
    public int f8948e;

    /* renamed from: f, reason: collision with root package name */
    public int f8949f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8950g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f8951h;

    public s(x xVar, boolean z9, int[] iArr) {
        this.f8945b = xVar;
        this.f8946c = xVar;
        this.f8950g = z9;
        this.f8951h = iArr;
    }

    public final int a(int i10) {
        x xVar;
        boolean z9;
        SparseArray sparseArray = this.f8946c.f8966a;
        if (sparseArray == null) {
            xVar = null;
        } else {
            xVar = (x) sparseArray.get(i10);
        }
        int i11 = 1;
        if (this.f8944a != 2) {
            if (xVar == null) {
                b();
            } else {
                this.f8944a = 2;
                this.f8946c = xVar;
                this.f8949f = 1;
                i11 = 2;
            }
        } else {
            if (xVar != null) {
                this.f8946c = xVar;
                this.f8949f++;
            } else {
                boolean z10 = false;
                if (i10 == 65038) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    b();
                } else {
                    if (i10 == 65039) {
                        z10 = true;
                    }
                    if (!z10) {
                        x xVar2 = this.f8946c;
                        if (xVar2.f8967b != null) {
                            if (this.f8949f == 1) {
                                if (c()) {
                                    this.f8947d = this.f8946c;
                                    b();
                                } else {
                                    b();
                                }
                            } else {
                                this.f8947d = xVar2;
                                b();
                            }
                            i11 = 3;
                        } else {
                            b();
                        }
                    }
                }
            }
            i11 = 2;
        }
        this.f8948e = i10;
        return i11;
    }

    public final void b() {
        this.f8944a = 1;
        this.f8946c = this.f8945b;
        this.f8949f = 0;
    }

    public final boolean c() {
        boolean z9;
        boolean z10;
        int[] iArr;
        r0.a d10 = this.f8946c.f8967b.d();
        int a10 = d10.a(6);
        if (a10 != 0 && d10.f9299b.get(a10 + d10.f9298a) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return true;
        }
        if (this.f8948e == 65039) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (!this.f8950g || ((iArr = this.f8951h) != null && Arrays.binarySearch(iArr, this.f8946c.f8967b.a(0)) >= 0)) {
            return false;
        }
        return true;
    }
}
