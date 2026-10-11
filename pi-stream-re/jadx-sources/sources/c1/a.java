package c1;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f1614a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1615b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1616c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri[] f1617d;

    /* renamed from: e, reason: collision with root package name */
    public final k0[] f1618e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1619f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f1620g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1621h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1622i;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
        f1.b0.J(5);
        f1.b0.J(6);
        f1.b0.J(7);
        f1.b0.J(8);
    }

    public a(long j4, int i10, int i11, int[] iArr, k0[] k0VarArr, long[] jArr, long j10, boolean z9) {
        boolean z10;
        Uri uri;
        int i12 = 0;
        if (iArr.length == k0VarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b.g(z10);
        this.f1614a = j4;
        this.f1615b = i10;
        this.f1616c = i11;
        this.f1619f = iArr;
        this.f1618e = k0VarArr;
        this.f1620g = jArr;
        this.f1621h = j10;
        this.f1622i = z9;
        this.f1617d = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f1617d;
            if (i12 < uriArr.length) {
                k0 k0Var = k0VarArr[i12];
                if (k0Var == null) {
                    uri = null;
                } else {
                    f0 f0Var = k0Var.f1769b;
                    f0Var.getClass();
                    uri = f0Var.f1682a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                return;
            }
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f1619f;
            if (i12 >= iArr.length || this.f1622i || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1614a == aVar.f1614a && this.f1615b == aVar.f1615b && this.f1616c == aVar.f1616c && Arrays.equals(this.f1618e, aVar.f1618e) && Arrays.equals(this.f1619f, aVar.f1619f) && Arrays.equals(this.f1620g, aVar.f1620g) && this.f1621h == aVar.f1621h && this.f1622i == aVar.f1622i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f1615b * 31) + this.f1616c) * 31;
        long j4 = this.f1614a;
        int hashCode = (Arrays.hashCode(this.f1620g) + ((Arrays.hashCode(this.f1619f) + ((Arrays.hashCode(this.f1618e) + ((i10 + ((int) (j4 ^ (j4 >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j10 = this.f1621h;
        return ((hashCode + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f1622i ? 1 : 0);
    }
}
