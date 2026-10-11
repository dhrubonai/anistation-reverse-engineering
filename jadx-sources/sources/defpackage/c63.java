package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class c63 implements x73 {
    public static final c63 a = new Object();
    public static final au4 b = dj5.a("kotlinx.serialization.json.JsonLiteral");

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        String str;
        m53 p = db.p(l61Var);
        q53 k = p.k();
        if (!(k instanceof b63)) {
            String str2 = "Unexpected JSON element, expected JsonLiteral, had " + z05.a(k.getClass());
            if (p.v().a.l) {
                str = iv.I(k.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new o53(iv.v(-1, str2, null, null, str));
        }
        return (b63) k;
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // defpackage.mj5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(defpackage.wt1 r3, java.lang.Object r4) {
        /*
            r2 = this;
            b63 r4 = (defpackage.b63) r4
            r4.getClass()
            java.lang.String r2 = r4.y
            defpackage.db.q(r3)
            boolean r4 = r4.x
            if (r4 == 0) goto L12
            r3.o(r2)
            return
        L12:
            java.lang.Long r4 = defpackage.b06.L(r2)
            if (r4 == 0) goto L20
            long r0 = r4.longValue()
            r3.n(r0)
            return
        L20:
            cm6 r4 = defpackage.hz5.j(r2)
            if (r4 == 0) goto L32
            long r0 = r4.x
            aj5 r2 = defpackage.gm6.b
            wt1 r2 = r3.h(r2)
            r2.n(r0)
            return
        L32:
            r4 = 0
            boolean r0 = defpackage.a06.w(r2)     // Catch: java.lang.NumberFormatException -> L42
            if (r0 == 0) goto L42
            double r0 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> L42
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L42
            goto L43
        L42:
            r0 = r4
        L43:
            if (r0 == 0) goto L4d
            double r0 = r0.doubleValue()
            r3.d(r0)
            return
        L4d:
            java.lang.String r0 = "true"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L58
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L62
        L58:
            java.lang.String r0 = "false"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L62
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L62:
            if (r4 == 0) goto L6c
            boolean r2 = r4.booleanValue()
            r3.g(r2)
            return
        L6c:
            r3.o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c63.serialize(wt1, java.lang.Object):void");
    }
}
