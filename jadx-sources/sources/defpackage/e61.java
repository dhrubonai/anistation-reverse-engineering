package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e61 implements gl {
    public final or6 a;
    public final tk6 b;
    public final Object c;
    public final rl d;
    public final rl e;
    public final rl f;
    public final Object g;
    public final long h;

    public e61(f61 f61Var, tk6 tk6Var, Object obj, rl rlVar) {
        or6 or6Var = new or6(f61Var.a);
        this.a = or6Var;
        this.b = tk6Var;
        this.c = obj;
        rl rlVar2 = (rl) tk6Var.a.invoke(obj);
        this.d = rlVar2;
        this.e = q23.t(rlVar);
        ub2 ub2Var = tk6Var.b;
        rl rlVar3 = or6Var.d;
        if (rlVar3 == null) {
            rlVar3 = rlVar2.c();
            or6Var.d = rlVar3;
        }
        int b = rlVar3.b();
        int i = 0;
        while (true) {
            rl rlVar4 = or6Var.d;
            q42 q42Var = or6Var.a;
            if (i < b) {
                if (rlVar4 != null) {
                    rlVar4.e(i, q42Var.C(rlVar2.a(i), rlVar.a(i)));
                    i++;
                } else {
                    a34.s0("targetVector");
                    throw null;
                }
            } else {
                if (rlVar4 != null) {
                    this.g = ub2Var.invoke(rlVar4);
                    rl rlVar5 = or6Var.c;
                    if (rlVar5 == null) {
                        rlVar5 = rlVar2.c();
                        or6Var.c = rlVar5;
                    }
                    int b2 = rlVar5.b();
                    long j = 0;
                    for (int i2 = 0; i2 < b2; i2++) {
                        rlVar2.getClass();
                        j = Math.max(j, q42Var.y(rlVar.a(i2)));
                    }
                    this.h = j;
                    rl t = q23.t(this.a.a(j, this.d, rlVar));
                    this.f = t;
                    int b3 = t.b();
                    for (int i3 = 0; i3 < b3; i3++) {
                        rl rlVar6 = this.f;
                        float a = rlVar6.a(i3);
                        float f = this.a.e;
                        rlVar6.e(i3, db.B(a, -f, f));
                    }
                    return;
                }
                a34.s0("targetVector");
                throw null;
            }
        }
    }

    @Override // defpackage.gl
    public final boolean b() {
        return false;
    }

    @Override // defpackage.gl
    public final long c() {
        return this.h;
    }

    @Override // defpackage.gl
    public final tk6 d() {
        return this.b;
    }

    @Override // defpackage.gl
    public final rl e(long j) {
        if (!f(j)) {
            return this.a.a(j, this.d, this.e);
        }
        return this.f;
    }

    @Override // defpackage.gl
    public final Object g(long j) {
        if (!f(j)) {
            ub2 ub2Var = this.b.b;
            or6 or6Var = this.a;
            rl rlVar = or6Var.b;
            rl rlVar2 = this.d;
            if (rlVar == null) {
                rlVar = rlVar2.c();
                or6Var.b = rlVar;
            }
            int b = rlVar.b();
            int i = 0;
            while (true) {
                rl rlVar3 = or6Var.b;
                if (i < b) {
                    if (rlVar3 != null) {
                        rlVar3.e(i, or6Var.a.q(rlVar2.a(i), this.e.a(i), j));
                        i++;
                    } else {
                        a34.s0("valueVector");
                        throw null;
                    }
                } else {
                    if (rlVar3 != null) {
                        return ub2Var.invoke(rlVar3);
                    }
                    a34.s0("valueVector");
                    throw null;
                }
            }
        } else {
            return this.g;
        }
    }

    @Override // defpackage.gl
    public final Object h() {
        return this.g;
    }
}
