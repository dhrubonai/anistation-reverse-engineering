package c1;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: b, reason: collision with root package name */
    public static final m1 f1835b;

    /* renamed from: a, reason: collision with root package name */
    public final r6.o0 f1836a;

    static {
        r6.m0 m0Var = r6.o0.f9505b;
        f1835b = new m1(r6.n1.f9497e);
        f1.b0.J(0);
    }

    public m1(r6.n1 n1Var) {
        this.f1836a = r6.o0.j(n1Var);
    }

    public final r6.o0 a() {
        return this.f1836a;
    }

    public final boolean b(int i10) {
        int i11 = 0;
        while (true) {
            r6.o0 o0Var = this.f1836a;
            if (i11 >= o0Var.size()) {
                return false;
            }
            l1 l1Var = (l1) o0Var.get(i11);
            if (l1Var.d() && l1Var.c() == i10) {
                return true;
            }
            i11++;
        }
    }

    public final boolean c() {
        int i10 = 0;
        while (true) {
            r6.o0 o0Var = this.f1836a;
            if (i10 >= o0Var.size()) {
                return false;
            }
            if (((l1) o0Var.get(i10)).c() == 2 && ((l1) o0Var.get(i10)).e()) {
                return true;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            return this.f1836a.equals(((m1) obj).f1836a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1836a.hashCode();
    }
}
