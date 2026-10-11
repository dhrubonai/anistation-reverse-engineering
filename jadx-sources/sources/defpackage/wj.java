package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wj {
    public final tk6 a;
    public final Object b;
    public final ml c;
    public final ti4 d;
    public final ti4 e;
    public final j54 f;
    public final tw5 g;
    public final rl h;
    public final rl i;
    public final rl j;
    public final rl k;

    public wj(Object obj, tk6 tk6Var, Object obj2) {
        rl rlVar;
        rl rlVar2;
        this.a = tk6Var;
        this.b = obj2;
        ml mlVar = new ml(tk6Var, obj, null, 60);
        this.c = mlVar;
        this.d = xt5.g(Boolean.FALSE);
        this.e = xt5.g(obj);
        this.f = new j54();
        this.g = new tw5(obj2);
        rl rlVar3 = mlVar.z;
        boolean z = rlVar3 instanceof nl;
        if (z) {
            rlVar = v94.e;
        } else if (rlVar3 instanceof ol) {
            rlVar = v94.f;
        } else if (rlVar3 instanceof pl) {
            rlVar = v94.g;
        } else {
            rlVar = v94.h;
        }
        this.h = rlVar;
        if (z) {
            rlVar2 = v94.a;
        } else if (rlVar3 instanceof ol) {
            rlVar2 = v94.b;
        } else if (rlVar3 instanceof pl) {
            rlVar2 = v94.c;
        } else {
            rlVar2 = v94.d;
        }
        this.i = rlVar2;
        this.j = rlVar;
        this.k = rlVar2;
    }

    public static Object a(wj wjVar, Object obj, ll llVar, ub2 ub2Var, vz0 vz0Var, int i) {
        if ((i & 2) != 0) {
            llVar = wjVar.g;
        }
        ll llVar2 = llVar;
        Object invoke = wjVar.a.b.invoke(wjVar.c.z);
        if ((i & 8) != 0) {
            ub2Var = null;
        }
        ub2 ub2Var2 = ub2Var;
        Object d = wjVar.d();
        tk6 tk6Var = wjVar.a;
        return j54.a(wjVar.f, new tj(wjVar, invoke, new l76(llVar2, tk6Var, d, obj, (rl) tk6Var.a.invoke(invoke)), wjVar.c.A, ub2Var2, null), vz0Var);
    }

    public final Object b(Object obj) {
        rl rlVar = this.h;
        rl rlVar2 = this.j;
        boolean i = a34.i(rlVar2, rlVar);
        rl rlVar3 = this.k;
        if (!i || !a34.i(rlVar3, this.i)) {
            tk6 tk6Var = this.a;
            rl rlVar4 = (rl) tk6Var.a.invoke(obj);
            int b = rlVar4.b();
            boolean z = false;
            for (int i2 = 0; i2 < b; i2++) {
                if (rlVar4.a(i2) < rlVar2.a(i2) || rlVar4.a(i2) > rlVar3.a(i2)) {
                    rlVar4.e(i2, db.B(rlVar4.a(i2), rlVar2.a(i2), rlVar3.a(i2)));
                    z = true;
                }
            }
            if (z) {
                return tk6Var.b.invoke(rlVar4);
            }
        }
        return obj;
    }

    public final void c() {
        ml mlVar = this.c;
        mlVar.z.d();
        mlVar.A = Long.MIN_VALUE;
        this.d.setValue(Boolean.FALSE);
    }

    public final Object d() {
        return this.c.y.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object f(vz0 vz0Var, Object obj) {
        Object a = j54.a(this.f, new uj(this, obj, null), vz0Var);
        if (a == w11.x) {
            return a;
        }
        return pn6.a;
    }

    public final Object g(t36 t36Var) {
        Object a = j54.a(this.f, new vj(this, null, (byte) 0), t36Var);
        if (a == w11.x) {
            return a;
        }
        return pn6.a;
    }

    public /* synthetic */ wj(Object obj, tk6 tk6Var, Object obj2, int i) {
        this(obj, tk6Var, (i & 4) != 0 ? null : obj2);
    }
}
