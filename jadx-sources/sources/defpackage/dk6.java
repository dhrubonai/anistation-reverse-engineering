package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class dk6 implements x73 {
    public final x73 a;
    public final x73 b;
    public final x73 c;
    public final cj5 d;

    public dk6(x73 x73Var, x73 x73Var2, x73 x73Var3) {
        cj5 cj5Var;
        this.a = x73Var;
        this.b = x73Var2;
        this.c = x73Var3;
        aj5[] aj5VarArr = new aj5[0];
        pp5 pp5Var = new pp5((Object) this, (byte) 14);
        if (!uz5.V("kotlin.Triple")) {
            jm0 jm0Var = new jm0("kotlin.Triple");
            pp5Var.invoke(jm0Var);
            cj5Var = new cj5("kotlin.Triple", f06.a, jm0Var.c.size(), ms.S0(aj5VarArr), jm0Var);
        } else {
            ze0.k("Blank serial names are prohibited");
            cj5Var = null;
        }
        this.d = cj5Var;
    }

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        cj5 cj5Var = this.d;
        gu0 c = l61Var.c(cj5Var);
        boolean decodeSequentially = c.decodeSequentially();
        x73 x73Var = this.c;
        x73 x73Var2 = this.b;
        x73 x73Var3 = this.a;
        if (decodeSequentially) {
            Object p = c.p(cj5Var, 0, x73Var3, null);
            Object p2 = c.p(cj5Var, 1, x73Var2, null);
            Object p3 = c.p(cj5Var, 2, x73Var, null);
            c.a(cj5Var);
            return new ck6(p, p2, p3);
        }
        Object obj = bx7.h;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int i = c.i(cj5Var);
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            obj4 = c.p(cj5Var, 2, x73Var, null);
                        } else {
                            throw new IllegalArgumentException(qx1.h(i, "Unexpected index "));
                        }
                    } else {
                        obj3 = c.p(cj5Var, 1, x73Var2, null);
                    }
                } else {
                    obj2 = c.p(cj5Var, 0, x73Var3, null);
                }
            } else {
                c.a(cj5Var);
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        if (obj4 != obj) {
                            return new ck6(obj2, obj3, obj4);
                        }
                        throw new IllegalArgumentException("Element 'third' is missing");
                    }
                    throw new IllegalArgumentException("Element 'second' is missing");
                }
                throw new IllegalArgumentException("Element 'first' is missing");
            }
        }
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return this.d;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        ck6 ck6Var = (ck6) obj;
        ck6Var.getClass();
        cj5 cj5Var = this.d;
        v0 v0Var = (v0) wt1Var.c(cj5Var);
        v0Var.v(cj5Var, 0, this.a, ck6Var.x);
        v0Var.v(cj5Var, 1, this.b, ck6Var.y);
        v0Var.v(cj5Var, 2, this.c, ck6Var.z);
        v0Var.a(cj5Var);
    }
}
