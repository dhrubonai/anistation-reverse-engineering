package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class c {
    public static final zd0 a;
    public static final zd0 b;
    public static final zd0 c;
    public static final zd0 d;
    public static final zd0 e;

    static {
        zd0 zd0Var = zd0.A;
        a = r18.i("/");
        b = r18.i("\\");
        c = r18.i("/\\");
        d = r18.i(".");
        e = r18.i("..");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pa0] */
    public static final qj4 a(qj4 qj4Var, qj4 qj4Var2, boolean z) {
        qj4Var2.getClass();
        if (c(qj4Var2) != -1 || qj4Var2.f() != null) {
            return qj4Var2;
        }
        zd0 b2 = b(qj4Var);
        if (b2 == null && (b2 = b(qj4Var2)) == null) {
            b2 = f(qj4.y);
        }
        ?? obj = new Object();
        obj.u0(qj4Var.x);
        if (obj.y > 0) {
            obj.u0(b2);
        }
        obj.u0(qj4Var2.x);
        return d(obj, z);
    }

    public static final zd0 b(qj4 qj4Var) {
        zd0 zd0Var = qj4Var.x;
        zd0 zd0Var2 = a;
        if (zd0.g(zd0Var, zd0Var2) != -1) {
            return zd0Var2;
        }
        zd0 zd0Var3 = qj4Var.x;
        zd0 zd0Var4 = b;
        if (zd0.g(zd0Var3, zd0Var4) != -1) {
            return zd0Var4;
        }
        return null;
    }

    public static final int c(qj4 qj4Var) {
        zd0 zd0Var = qj4Var.x;
        if (zd0Var.d() != 0) {
            if (zd0Var.i(0) != 47) {
                if (zd0Var.i(0) == 92) {
                    if (zd0Var.d() > 2 && zd0Var.i(1) == 92) {
                        zd0 zd0Var2 = b;
                        zd0Var2.getClass();
                        int f = zd0Var.f(2, zd0Var2.h());
                        if (f == -1) {
                            return zd0Var.d();
                        }
                        return f;
                    }
                } else if (zd0Var.d() > 2 && zd0Var.i(1) == 58 && zd0Var.i(2) == 92) {
                    char i = (char) zd0Var.i(0);
                    if ('a' > i || i >= '{') {
                        if ('A' <= i && i < '[') {
                            return 3;
                        }
                    } else {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[EDGE_INSN: B:68:0x0110->B:69:0x0110 BREAK  A[LOOP:1: B:20:0x00ab->B:36:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pa0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.qj4 d(defpackage.pa0 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.d(pa0, boolean):qj4");
    }

    public static final zd0 e(byte b2) {
        if (b2 != 47) {
            if (b2 == 92) {
                return b;
            }
            ze0.k(qx1.h(b2, "not a directory separator: "));
            return null;
        }
        return a;
    }

    public static final zd0 f(String str) {
        if (a34.i(str, "/")) {
            return a;
        }
        if (a34.i(str, "\\")) {
            return b;
        }
        ze0.k(zo5.l("not a directory separator: ", str));
        return null;
    }
}
