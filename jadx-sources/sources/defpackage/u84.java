package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class u84 extends uc2 implements ub2 {
    public static final u84 x = new uc2(1, sw0.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && t80.A(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new rw0(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return qw0.a;
    }
}
