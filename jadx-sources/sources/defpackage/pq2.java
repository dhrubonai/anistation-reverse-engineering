package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class pq2 {
    static {
        zd0 zd0Var = zd0.A;
        r18.i("\"\\");
        r18.i("\t ,=");
    }

    public static final boolean a(p45 p45Var) {
        if (!a34.i(p45Var.x.b, "HEAD")) {
            int i = p45Var.A;
            if (((i >= 100 && i < 200) || i == 204 || i == 304) && dq6.j(p45Var) == -1 && !"chunked".equalsIgnoreCase(p45.a(p45Var, "Transfer-Encoding"))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f5, code lost:
    
        if (defpackage.dq6.f.b(r0) == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.l68 r35, defpackage.ws2 r36, defpackage.ik2 r37) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq2.b(l68, ws2, ik2):void");
    }
}
