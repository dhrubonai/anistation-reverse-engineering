package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class n63 implements x73 {
    public static final n63 a = new Object();
    public static final aj5 b = dj5.b("kotlinx.serialization.json.JsonPrimitive", xt4.i, new aj5[0]);

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        String str;
        m53 p = db.p(l61Var);
        q53 k = p.k();
        if (!(k instanceof l63)) {
            String str2 = "Unexpected JSON element, expected JsonPrimitive, had " + z05.a(k.getClass());
            if (p.v().a.l) {
                str = iv.I(k.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new o53(iv.v(-1, str2, null, null, str));
        }
        return (l63) k;
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        l63 l63Var = (l63) obj;
        l63Var.getClass();
        db.q(wt1Var);
        if (l63Var instanceof e63) {
            wt1Var.j(f63.a, e63.INSTANCE);
        } else {
            wt1Var.j(c63.a, (b63) l63Var);
        }
    }
}
