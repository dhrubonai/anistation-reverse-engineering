package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yr3 extends hs3 {
    public final String a;
    public final xr3 b;

    public yr3(String str, xr3 xr3Var) {
        this.a = str;
        this.b = xr3Var;
    }

    @Override // defpackage.hs3
    public final void f(int i) {
        xr3 xr3Var;
        boolean isReleased;
        String str = this.a;
        if (str != null && (xr3Var = this.b) != null) {
            Messenger messenger = xr3Var.h;
            MediaRouter2.RoutingController routingController = xr3Var.g;
            if (routingController != null) {
                isReleased = routingController.isReleased();
                if (!isReleased && messenger != null) {
                    int andIncrement = xr3Var.l.getAndIncrement();
                    Message obtain = Message.obtain();
                    obtain.what = 7;
                    obtain.arg1 = andIncrement;
                    Bundle bundle = new Bundle();
                    bundle.putInt("volume", i);
                    bundle.putString("routeId", str);
                    obtain.setData(bundle);
                    obtain.replyTo = xr3Var.i;
                    try {
                        messenger.send(obtain);
                    } catch (DeadObjectException unused) {
                    } catch (RemoteException e) {
                        Log.e("MR2Provider", "Could not send control request to service.", e);
                    }
                }
            }
        }
    }

    @Override // defpackage.hs3
    public final void i(int i) {
        xr3 xr3Var;
        boolean isReleased;
        String str = this.a;
        if (str != null && (xr3Var = this.b) != null) {
            Messenger messenger = xr3Var.h;
            MediaRouter2.RoutingController routingController = xr3Var.g;
            if (routingController != null) {
                isReleased = routingController.isReleased();
                if (!isReleased && messenger != null) {
                    int andIncrement = xr3Var.l.getAndIncrement();
                    Message obtain = Message.obtain();
                    obtain.what = 8;
                    obtain.arg1 = andIncrement;
                    Bundle bundle = new Bundle();
                    bundle.putInt("volume", i);
                    bundle.putString("routeId", str);
                    obtain.setData(bundle);
                    obtain.replyTo = xr3Var.i;
                    try {
                        messenger.send(obtain);
                    } catch (DeadObjectException unused) {
                    } catch (RemoteException e) {
                        Log.e("MR2Provider", "Could not send control request to service.", e);
                    }
                }
            }
        }
    }
}
