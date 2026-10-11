package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hj6 {
    public static volatile d41 e;
    public final un0 a;
    public final un0 b;
    public final ka1 c;
    public final kp6 d;

    public hj6(un0 un0Var, un0 un0Var2, ka1 ka1Var, kp6 kp6Var, zp2 zp2Var) {
        this.a = un0Var;
        this.b = un0Var2;
        this.c = ka1Var;
        this.d = kp6Var;
        ((Executor) zp2Var.x).execute(new ct6(zp2Var, (byte) 2));
    }

    public static hj6 a() {
        d41 d41Var = e;
        if (d41Var != null) {
            return (hj6) d41Var.B.get();
        }
        ze0.m("Not initialized!");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [c41, java.lang.Object] */
    public static void b(Context context) {
        if (e == null) {
            synchronized (hj6.class) {
                try {
                    if (e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.a = context;
                        e = obj.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
