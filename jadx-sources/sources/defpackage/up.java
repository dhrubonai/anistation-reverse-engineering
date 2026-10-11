package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class up {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static up c;
    public h45 a;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, up] */
    public static synchronized void b() {
        synchronized (up.class) {
            if (c == null) {
                ?? obj = new Object();
                c = obj;
                obj.a = h45.c();
                h45 h45Var = c.a;
                tp tpVar = new tp();
                synchronized (h45Var) {
                    h45Var.e = tpVar;
                }
            }
        }
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.a.d(context, i);
    }
}
