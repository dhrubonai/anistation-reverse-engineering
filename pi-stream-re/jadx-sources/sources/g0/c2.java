package g0;

/* loaded from: classes.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final k2 f4173a;

    /* renamed from: b, reason: collision with root package name */
    public z.d[] f4174b;

    public c2() {
        this(new k2());
    }

    public final void a() {
        z.d[] dVarArr = this.f4174b;
        if (dVarArr != null) {
            z.d dVar = dVarArr[j5.a.D(1)];
            z.d dVar2 = this.f4174b[j5.a.D(2)];
            k2 k2Var = this.f4173a;
            if (dVar2 == null) {
                dVar2 = k2Var.a(2);
            }
            if (dVar == null) {
                dVar = k2Var.a(1);
            }
            g(z.d.a(dVar, dVar2));
            z.d dVar3 = this.f4174b[j5.a.D(16)];
            if (dVar3 != null) {
                f(dVar3);
            }
            z.d dVar4 = this.f4174b[j5.a.D(32)];
            if (dVar4 != null) {
                d(dVar4);
            }
            z.d dVar5 = this.f4174b[j5.a.D(64)];
            if (dVar5 != null) {
                h(dVar5);
            }
        }
    }

    public abstract k2 b();

    public void c(int i10, z.d dVar) {
        if (this.f4174b == null) {
            this.f4174b = new z.d[9];
        }
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f4174b[j5.a.D(i11)] = dVar;
            }
        }
    }

    public void d(z.d dVar) {
    }

    public abstract void e(z.d dVar);

    public void f(z.d dVar) {
    }

    public abstract void g(z.d dVar);

    public void h(z.d dVar) {
    }

    public c2(k2 k2Var) {
        this.f4173a = k2Var;
    }
}
