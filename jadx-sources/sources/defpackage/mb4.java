package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mb4 {
    public static String d;
    public static lb4 g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public mb4(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            ib4 ib4Var = new ib4(this.a.getPackageName(), notification);
            synchronized (f) {
                try {
                    lb4 lb4Var = g;
                    if (lb4Var == null) {
                        lb4Var = new lb4(this.a.getApplicationContext());
                        g = lb4Var;
                    }
                    lb4Var.y.obtainMessage(0, ib4Var).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.b.cancel(null, 4201);
            return;
        }
        this.b.notify(null, 4201, notification);
    }
}
