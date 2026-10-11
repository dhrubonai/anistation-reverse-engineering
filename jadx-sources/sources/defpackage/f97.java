package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f97 {
    public static final f97 b;
    public t91 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [f97, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.a = null;
        b = obj;
    }

    public static t91 a(Context context) {
        t91 t91Var;
        f97 f97Var = b;
        synchronized (f97Var) {
            try {
                t91Var = f97Var.a;
                if (t91Var == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    t91Var = new t91(context, false);
                    f97Var.a = t91Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t91Var;
    }
}
