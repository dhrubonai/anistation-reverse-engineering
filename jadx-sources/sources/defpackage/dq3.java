package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dq3 extends ResultReceiver {
    public final WeakReference x;

    public dq3(eq3 eq3Var) {
        super(null);
        this.x = new WeakReference(eq3Var);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [it2, java.lang.Object] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        kt2 kt2Var;
        eq3 eq3Var = (eq3) this.x.get();
        if (eq3Var != null && bundle != null) {
            synchronized (eq3Var.b) {
                qt3 qt3Var = eq3Var.e;
                IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                int i2 = lt3.f;
                if (binder == null) {
                    kt2Var = null;
                } else {
                    IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof kt2)) {
                        kt2Var = (kt2) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.e = binder;
                        kt2Var = obj;
                    }
                }
                synchronized (qt3Var.x) {
                    qt3Var.z = kt2Var;
                }
                qt3 qt3Var2 = eq3Var.e;
                ds6 v = oi4.v(bundle);
                synchronized (qt3Var2.x) {
                    qt3Var2.A = v;
                }
                eq3Var.a();
            }
        }
    }
}
