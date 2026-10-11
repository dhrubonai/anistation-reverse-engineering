package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class qc7 {
    public static final rc7 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [rc7] */
    static {
        xc7 xc7Var;
        try {
            xc7Var = yc7.a;
        } catch (NoClassDefFoundError unused) {
            xc7Var = null;
        }
        if (xc7Var == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = rc7.a[i];
                try {
                    xc7Var = (rc7) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        a = xc7Var;
    }
}
