package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class f88 implements ii3 {
    public static final Object A = new Object();
    public static final cf3 B = new cf3((byte) 2);
    public static final boolean C;
    public static final yu5 D;
    public volatile Object x;
    public volatile z78 y;
    public volatile e88 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [yu5] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    static {
        boolean z;
        Object obj;
        Throwable th;
        Throwable th2;
        ?? r0;
        Object obj2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        C = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property != null && !property.contains("Android")) {
            try {
                obj2 = new Object();
            } catch (NoClassDefFoundError unused2) {
                obj2 = new Object();
            }
        } else {
            try {
                obj2 = new Object();
            } catch (Error | Exception e) {
                try {
                    obj = new Object();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    obj = new Object();
                }
                th = th3;
                th2 = e;
                r0 = obj;
            }
        }
        th = null;
        th2 = null;
        r0 = obj2;
        D = r0;
        if (th != null) {
            cf3 cf3Var = B;
            Logger c = cf3Var.c();
            Level level = Level.SEVERE;
            c.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            cf3Var.c().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(e88 e88Var) {
        e88Var.a = null;
        while (true) {
            e88 e88Var2 = this.z;
            if (e88Var2 != e88.c) {
                e88 e88Var3 = null;
                while (e88Var2 != null) {
                    e88 e88Var4 = e88Var2.b;
                    if (e88Var2.a != null) {
                        e88Var3 = e88Var2;
                    } else if (e88Var3 != null) {
                        e88Var3.b = e88Var4;
                        if (e88Var3.a == null) {
                            break;
                        }
                    } else if (!D.q(this, e88Var2, e88Var4)) {
                        break;
                    }
                    e88Var2 = e88Var4;
                }
                return;
            }
            return;
        }
    }
}
