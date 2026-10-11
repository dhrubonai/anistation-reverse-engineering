package c1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1963a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1964b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f1965c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1966d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1967e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1968f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1969g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1970h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1971i;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
        f1.b0.J(5);
        f1.b0.J(6);
    }

    public y0(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j4, long j10, int i12, int i13) {
        this.f1963a = obj;
        this.f1964b = i10;
        this.f1965c = k0Var;
        this.f1966d = obj2;
        this.f1967e = i11;
        this.f1968f = j4;
        this.f1969g = j10;
        this.f1970h = i12;
        this.f1971i = i13;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        if (this == obj) {
            return true;
        }
        if (obj == null || y0.class != obj.getClass()) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f1964b == y0Var.f1964b && this.f1967e == y0Var.f1967e && this.f1968f == y0Var.f1968f && this.f1969g == y0Var.f1969g && this.f1970h == y0Var.f1970h && this.f1971i == y0Var.f1971i && q6.g.x(this.f1965c, y0Var.f1965c)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && q6.g.x(this.f1963a, y0Var.f1963a) && q6.g.x(this.f1966d, y0Var.f1966d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1963a, Integer.valueOf(this.f1964b), this.f1965c, this.f1966d, Integer.valueOf(this.f1967e), Long.valueOf(this.f1968f), Long.valueOf(this.f1969g), Integer.valueOf(this.f1970h), Integer.valueOf(this.f1971i)});
    }
}
