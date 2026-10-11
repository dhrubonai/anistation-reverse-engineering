package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sx7 {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile sx7 l = null;
    public static final r26 m = mv5.e(yx7.x);
    public final l87 a = new l87((byte) 8);
    public final Context b;
    public final r26 c;
    public final r26 d;
    public final r26 e;
    public final r26 f;
    public final g48 g;
    public final r26 h;
    public final y28 i;

    public sx7(Context context, r26 r26Var, r26 r26Var2, r26 r26Var3, r26 r26Var4, r26 r26Var5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        r26Var.getClass();
        r26Var2.getClass();
        r26Var3.getClass();
        r26Var4.getClass();
        r26Var5.getClass();
        r26 e = mv5.e(r26Var);
        r26 e2 = mv5.e(r26Var2);
        r26 e3 = mv5.e(new ay7(r26Var3, (byte) 0));
        r26 e4 = mv5.e(r26Var4);
        r26 e5 = mv5.e(r26Var5);
        this.b = applicationContext;
        this.c = e;
        this.d = e2;
        this.e = e3;
        this.f = e4;
        this.g = new g48(applicationContext, e, e4, e2);
        this.h = e5;
        this.i = new y28(applicationContext, e, e3, e2);
    }

    public static void b() {
        synchronized (m37.p) {
        }
        if (k.get() == null && m37.q == null) {
            m37.q = new nw((byte) 10);
        }
    }

    public final p04 a() {
        return (p04) this.c.get();
    }
}
