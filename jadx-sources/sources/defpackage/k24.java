package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k24 implements ServiceConnection {
    public final /* synthetic */ l24 x;

    public k24(l24 l24Var) {
        this.x = l24Var;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, ot2] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        pt2 pt2Var;
        componentName.getClass();
        iBinder.getClass();
        int i = m24.f;
        IInterface queryLocalInterface = iBinder.queryLocalInterface(pt2.b);
        if (queryLocalInterface != null && (queryLocalInterface instanceof pt2)) {
            pt2Var = (pt2) queryLocalInterface;
        } else {
            ?? obj = new Object();
            obj.e = iBinder;
            pt2Var = obj;
        }
        l24 l24Var = this.x;
        l24Var.g = pt2Var;
        try {
            l24Var.f = pt2Var.o(l24Var.j, l24Var.a);
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.x.g = null;
    }
}
