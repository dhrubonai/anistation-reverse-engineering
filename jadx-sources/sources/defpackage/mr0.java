package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class mr0 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ yr0 y;

    public /* synthetic */ mr0(yr0 yr0Var, byte b) {
        this.x = b;
        this.y = yr0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [u74, java.lang.Object] */
    @Override // defpackage.sb2
    public final Object invoke() {
        Bundle bundle;
        byte b = this.x;
        yr0 yr0Var = this.y;
        switch (b) {
            case 0:
                yr0Var.reportFullyDrawn();
                return pn6.a;
            case 1:
                return yr0.d(yr0Var);
            case 2:
                ?? obj = new Object();
                yr0Var.getNavigationEventDispatcher().b(obj);
                return obj;
            case 3:
                Application application = yr0Var.getApplication();
                if (yr0Var.getIntent() != null) {
                    bundle = yr0Var.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new ha5(application, yr0Var, bundle);
            default:
                wd4 wd4Var = new wd4(new lr0(yr0Var, (byte) 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!a34.i(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new gb(yr0Var, wd4Var, (byte) 11));
                    } else {
                        yr0Var.getLifecycle().a(new bj(wd4Var, yr0Var, (byte) 1));
                    }
                }
                return wd4Var;
        }
    }
}
