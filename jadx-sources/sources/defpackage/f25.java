package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f25 implements v11, c25 {
    public static final ug0 A = new ug0((byte) 0);
    public final l11 x;
    public final f25 y = this;
    public volatile l11 z;

    public f25(l11 l11Var) {
        this.x = l11Var;
    }

    @Override // defpackage.c25
    public final void a() {
        d();
    }

    @Override // defpackage.c25
    public final void b() {
        d();
    }

    public final void d() {
        synchronized (this.y) {
            try {
                l11 l11Var = this.z;
                if (l11Var == null) {
                    this.z = A;
                } else {
                    h98.i(l11Var, new ca2((byte) 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        l11 l11Var;
        l11 l11Var2;
        l11 l11Var3 = this.z;
        if (l11Var3 == null || l11Var3 == A) {
            tu0 tu0Var = (tu0) this.x.get(tu0.y);
            if (tu0Var != null) {
                l11Var = new e25(tu0Var, this);
            } else {
                l11Var = it1.x;
            }
            synchronized (this.y) {
                try {
                    l11 l11Var4 = this.z;
                    if (l11Var4 == null) {
                        l11 l11Var5 = this.x;
                        l11Var2 = l11Var5.plus(new j43((h43) l11Var5.get(h95.F))).plus(it1.x).plus(l11Var);
                    } else if (l11Var4 == A) {
                        l11 l11Var6 = this.x;
                        j43 j43Var = new j43((h43) l11Var6.get(h95.F));
                        j43Var.r(new ca2((byte) 0));
                        l11Var2 = l11Var6.plus(j43Var).plus(it1.x).plus(l11Var);
                    } else {
                        l11Var2 = l11Var4;
                    }
                    this.z = l11Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            l11Var3 = l11Var2;
        }
        l11Var3.getClass();
        return l11Var3;
    }

    @Override // defpackage.c25
    public final void c() {
    }
}
