package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fo6 {
    public static eo6 a(Object obj) {
        vd2 vd2Var = (vd2) obj;
        eo6 eo6Var = vd2Var.unknownFields;
        if (eo6Var == eo6.f) {
            eo6 eo6Var2 = new eo6(0, new int[8], new Object[8], true);
            vd2Var.unknownFields = eo6Var2;
            return eo6Var2;
        }
        return eo6Var;
    }

    public static boolean b(int i, fm0 fm0Var, Object obj) {
        int i2 = fm0Var.y;
        po0 po0Var = (po0) fm0Var.B;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            return false;
                        }
                        if (i4 == 5) {
                            fm0Var.F(5);
                            ((eo6) obj).c(5 | (i3 << 3), Integer.valueOf(po0Var.o()));
                            return true;
                        }
                        throw b33.b();
                    }
                    eo6 eo6Var = new eo6(0, new int[8], new Object[8], true);
                    int i5 = i3 << 3;
                    int i6 = i5 | 4;
                    int i7 = i + 1;
                    if (i7 >= 100) {
                        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    while (fm0Var.e() != Integer.MAX_VALUE && b(i7, fm0Var, eo6Var)) {
                    }
                    if (i6 == fm0Var.y) {
                        if (eo6Var.e) {
                            eo6Var.e = false;
                        }
                        ((eo6) obj).c(i5 | 3, eo6Var);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((eo6) obj).c((i3 << 3) | 2, fm0Var.m());
                return true;
            }
            fm0Var.F(1);
            ((eo6) obj).c((i3 << 3) | 1, Long.valueOf(po0Var.p()));
            return true;
        }
        fm0Var.F(0);
        ((eo6) obj).c(i3 << 3, Long.valueOf(po0Var.s()));
        return true;
    }
}
