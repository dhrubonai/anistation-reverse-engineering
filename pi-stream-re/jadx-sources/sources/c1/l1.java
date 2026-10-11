package c1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1801a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f1802b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1803c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1804d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f1805e;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(3);
        f1.b0.J(4);
    }

    public l1(f1 f1Var, boolean z9, int[] iArr, boolean[] zArr) {
        boolean z10;
        int i10 = f1Var.f1690a;
        this.f1801a = i10;
        boolean z11 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b.g(z10);
        this.f1802b = f1Var;
        if (z9 && i10 > 1) {
            z11 = true;
        }
        this.f1803c = z11;
        this.f1804d = (int[]) iArr.clone();
        this.f1805e = (boolean[]) zArr.clone();
    }

    public final f1 a() {
        return this.f1802b;
    }

    public final v b(int i10) {
        return this.f1802b.f1693d[i10];
    }

    public final int c() {
        return this.f1802b.f1692c;
    }

    public final boolean d() {
        for (boolean z9 : this.f1805e) {
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        for (int i10 = 0; i10 < this.f1804d.length; i10++) {
            if (g(i10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l1.class != obj.getClass()) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.f1803c == l1Var.f1803c && this.f1802b.equals(l1Var.f1802b) && Arrays.equals(this.f1804d, l1Var.f1804d) && Arrays.equals(this.f1805e, l1Var.f1805e)) {
            return true;
        }
        return false;
    }

    public final boolean f(int i10) {
        return this.f1805e[i10];
    }

    public final boolean g(int i10) {
        if (this.f1804d[i10] != 4) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1805e) + ((Arrays.hashCode(this.f1804d) + (((this.f1802b.hashCode() * 31) + (this.f1803c ? 1 : 0)) * 31)) * 31);
    }
}
