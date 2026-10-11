package c1;

import android.net.Uri;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: r, reason: collision with root package name */
    public static final Object f1653r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static final k0 f1654s;

    /* renamed from: b, reason: collision with root package name */
    public Object f1656b;

    /* renamed from: d, reason: collision with root package name */
    public Object f1658d;

    /* renamed from: e, reason: collision with root package name */
    public long f1659e;

    /* renamed from: f, reason: collision with root package name */
    public long f1660f;

    /* renamed from: g, reason: collision with root package name */
    public long f1661g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1662h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1663i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1664j;

    /* renamed from: k, reason: collision with root package name */
    public e0 f1665k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1666l;

    /* renamed from: m, reason: collision with root package name */
    public long f1667m;

    /* renamed from: n, reason: collision with root package name */
    public long f1668n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f1669p;

    /* renamed from: q, reason: collision with root package name */
    public long f1670q;

    /* renamed from: a, reason: collision with root package name */
    public Object f1655a = f1653r;

    /* renamed from: c, reason: collision with root package name */
    public k0 f1657c = f1654s;

    static {
        y yVar = new y();
        yVar.f1952a = "androidx.media3.common.Timeline";
        yVar.f1953b = Uri.EMPTY;
        f1654s = yVar.a();
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
        f1.b0.J(5);
        f1.b0.J(6);
        f1.b0.J(7);
        f1.b0.J(8);
        f1.b0.J(9);
        f1.b0.J(10);
        f1.b0.J(11);
        f1.b0.J(12);
        f1.b0.J(13);
    }

    public final boolean a() {
        boolean z9;
        boolean z10;
        boolean z11 = this.f1664j;
        if (this.f1665k != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z11 == z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b.u(z10);
        if (this.f1665k != null) {
            return true;
        }
        return false;
    }

    public final void b(k0 k0Var, Object obj, long j4, long j10, long j11, boolean z9, boolean z10, e0 e0Var, long j12, long j13, int i10, long j14) {
        k0 k0Var2;
        Object obj2;
        boolean z11;
        f0 f0Var;
        this.f1655a = f1653r;
        if (k0Var != null) {
            k0Var2 = k0Var;
        } else {
            k0Var2 = f1654s;
        }
        this.f1657c = k0Var2;
        if (k0Var != null && (f0Var = k0Var.f1769b) != null) {
            obj2 = f0Var.f1688g;
        } else {
            obj2 = null;
        }
        this.f1656b = obj2;
        this.f1658d = obj;
        this.f1659e = j4;
        this.f1660f = j10;
        this.f1661g = j11;
        this.f1662h = z9;
        this.f1663i = z10;
        if (e0Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f1664j = z11;
        this.f1665k = e0Var;
        this.f1667m = j12;
        this.f1668n = j13;
        this.o = 0;
        this.f1669p = i10;
        this.f1670q = j14;
        this.f1666l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d1.class.equals(obj.getClass())) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (f1.b0.a(this.f1655a, d1Var.f1655a) && f1.b0.a(this.f1657c, d1Var.f1657c) && f1.b0.a(this.f1658d, d1Var.f1658d) && f1.b0.a(this.f1665k, d1Var.f1665k) && this.f1659e == d1Var.f1659e && this.f1660f == d1Var.f1660f && this.f1661g == d1Var.f1661g && this.f1662h == d1Var.f1662h && this.f1663i == d1Var.f1663i && this.f1666l == d1Var.f1666l && this.f1667m == d1Var.f1667m && this.f1668n == d1Var.f1668n && this.o == d1Var.o && this.f1669p == d1Var.f1669p && this.f1670q == d1Var.f1670q) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f1657c.hashCode() + ((this.f1655a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f1658d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        e0 e0Var = this.f1665k;
        if (e0Var != null) {
            i10 = e0Var.hashCode();
        }
        int i12 = (i11 + i10) * 31;
        long j4 = this.f1659e;
        int i13 = (i12 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j10 = this.f1660f;
        int i14 = (i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f1661g;
        int i15 = (((((((i14 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f1662h ? 1 : 0)) * 31) + (this.f1663i ? 1 : 0)) * 31) + (this.f1666l ? 1 : 0)) * 31;
        long j12 = this.f1667m;
        int i16 = (i15 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f1668n;
        int i17 = (((((i16 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.o) * 31) + this.f1669p) * 31;
        long j14 = this.f1670q;
        return i17 + ((int) (j14 ^ (j14 >>> 32)));
    }
}
