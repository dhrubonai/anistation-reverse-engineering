package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qd3 {
    public final j95 a;
    public final cf b;
    public final p44 c;

    public qd3(j95 j95Var, cf cfVar) {
        this.a = j95Var;
        this.b = cfVar;
        long[] jArr = cb5.a;
        this.c = new p44();
    }

    public final ic2 a(int i, Object obj, Object obj2) {
        p44 p44Var = this.c;
        pd3 pd3Var = (pd3) p44Var.g(obj);
        byte b = 24;
        if (pd3Var != null && pd3Var.c == i && a34.i(pd3Var.b, obj2)) {
            os0 os0Var = pd3Var.d;
            if (os0Var == null) {
                os0 os0Var2 = new os0(818252804, true, new q(pd3Var.e, pd3Var, b));
                pd3Var.d = os0Var2;
                return os0Var2;
            }
            return os0Var;
        }
        pd3 pd3Var2 = new pd3(this, i, obj, obj2);
        p44Var.n(obj, pd3Var2);
        os0 os0Var3 = pd3Var2.d;
        if (os0Var3 == null) {
            os0 os0Var4 = new os0(818252804, true, new q(this, pd3Var2, b));
            pd3Var2.d = os0Var4;
            return os0Var4;
        }
        return os0Var3;
    }

    public final Object b(Object obj) {
        if (obj != null) {
            pd3 pd3Var = (pd3) this.c.g(obj);
            if (pd3Var != null) {
                return pd3Var.b;
            }
            rd3 rd3Var = (rd3) this.b.invoke();
            int e = rd3Var.e(obj);
            if (e != -1) {
                return rd3Var.c(e);
            }
            return null;
        }
        return null;
    }
}
