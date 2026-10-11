package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ff7 {
    public static volatile ff7 a;
    public static final ff7 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [ff7, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static ff7 a() {
        ff7 ff7Var = a;
        if (ff7Var != null) {
            return ff7Var;
        }
        synchronized (ff7.class) {
            try {
                ff7 ff7Var2 = a;
                if (ff7Var2 != null) {
                    return ff7Var2;
                }
                int i = se7.a;
                ff7 P = jf7.P();
                a = P;
                return P;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
