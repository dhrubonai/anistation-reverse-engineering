package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l76 implements gl {
    public final kr6 a;
    public final tk6 b;
    public Object c;
    public Object d;
    public rl e;
    public rl f;
    public final rl g;
    public long h;
    public rl i;

    public l76(ll llVar, tk6 tk6Var, Object obj, Object obj2, rl rlVar) {
        rl c;
        this.a = llVar.a(tk6Var);
        this.b = tk6Var;
        this.c = obj2;
        this.d = obj;
        this.e = (rl) tk6Var.a.invoke(obj);
        ub2 ub2Var = tk6Var.a;
        this.f = (rl) ub2Var.invoke(obj2);
        if (rlVar != null) {
            c = q23.t(rlVar);
        } else {
            c = ((rl) ub2Var.invoke(obj)).c();
        }
        this.g = c;
        this.h = -1L;
    }

    public final void a(Object obj) {
        if (!a34.i(obj, this.d)) {
            this.d = obj;
            this.e = (rl) this.b.a.invoke(obj);
            this.i = null;
            this.h = -1L;
        }
    }

    @Override // defpackage.gl
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.gl
    public final long c() {
        long j = this.h;
        if (j < 0) {
            long e = this.a.e(this.e, this.f, this.g);
            this.h = e;
            return e;
        }
        return j;
    }

    @Override // defpackage.gl
    public final tk6 d() {
        return this.b;
    }

    @Override // defpackage.gl
    public final rl e(long j) {
        if (!f(j)) {
            return this.a.o(j, this.e, this.f, this.g);
        }
        rl rlVar = this.i;
        if (rlVar == null) {
            rl z = this.a.z(this.e, this.f, this.g);
            this.i = z;
            return z;
        }
        return rlVar;
    }

    @Override // defpackage.gl
    public final Object g(long j) {
        if (!f(j)) {
            rl y = this.a.y(j, this.e, this.f, this.g);
            int b = y.b();
            for (int i = 0; i < b; i++) {
                if (Float.isNaN(y.a(i))) {
                    fs4.b("AnimationVector cannot contain a NaN. " + y + ". Animation: " + this + ", playTimeNanos: " + j);
                }
            }
            return this.b.b.invoke(y);
        }
        return this.c;
    }

    @Override // defpackage.gl
    public final Object h() {
        return this.c;
    }

    public final void i(Object obj) {
        if (!a34.i(this.c, obj)) {
            this.c = obj;
            this.f = (rl) this.b.a.invoke(obj);
            this.i = null;
            this.h = -1L;
        }
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
