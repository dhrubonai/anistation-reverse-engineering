package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ p9 y;

    public /* synthetic */ n9(p9 p9Var, byte b) {
        this.x = b;
        this.y = p9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        p9 p9Var = this.y;
        switch (b) {
            case 0:
                p9Var.a.unregisterReceiver(p9Var.d);
                return;
            case 1:
                o9 o9Var = p9Var.d;
                IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
                int i = Build.VERSION.SDK_INT;
                Context context = p9Var.a;
                if (i >= 33) {
                    context.registerReceiver(o9Var, intentFilter, 2);
                } else {
                    t80.k0(context, o9Var, intentFilter);
                }
                p9Var.a();
                return;
            default:
                Uri uri = p9.g;
                p9Var.a();
                return;
        }
    }
}
