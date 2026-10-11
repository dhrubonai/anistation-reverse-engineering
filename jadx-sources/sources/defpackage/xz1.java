package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xz1 {
    public static volatile xz1 a;
    public static final xz1 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xz1] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static xz1 a() {
        xz1 xz1Var;
        ew4 ew4Var = ew4.c;
        xz1 xz1Var2 = a;
        if (xz1Var2 == null) {
            synchronized (xz1.class) {
                try {
                    xz1Var = a;
                    if (xz1Var == null) {
                        Class cls = uz1.a;
                        xz1 xz1Var3 = null;
                        if (cls != null) {
                            try {
                                xz1Var3 = (xz1) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (xz1Var3 != null) {
                            xz1Var = xz1Var3;
                        } else {
                            xz1Var = b;
                        }
                        a = xz1Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return xz1Var;
        }
        return xz1Var2;
    }
}
