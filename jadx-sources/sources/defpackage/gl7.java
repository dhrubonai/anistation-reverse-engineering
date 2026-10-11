package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gl7 extends ua7 {
    public static final zk3 h = new zk3("AppVisibilityProxy", null);
    public static final boolean i = true;
    public final Set f;
    public byte g;

    public gl7() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", (byte) 1);
        this.f = Collections.synchronizedSet(new HashSet());
        this.g = i ? (byte) 1 : (byte) 0;
    }

    @Override // defpackage.ua7
    public final boolean K(int i2, Parcel parcel, Parcel parcel2) {
        byte b = 1;
        if (i2 != 1) {
            Set set = this.f;
            zk3 zk3Var = h;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                Log.i(zk3Var.a, zk3Var.c("onAppEnteredBackground", new Object[0]));
                this.g = (byte) 2;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    xm7 xm7Var = ((um7) it.next()).a;
                    xm7.f.b("Stopping RouteDiscovery.", new Object[0]);
                    xm7Var.c.clear();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        fk7 fk7Var = xm7Var.e;
                        rs3 rs3Var = (rs3) fk7Var.y;
                        if (rs3Var == null) {
                            rs3Var = rs3.d((Context) fk7Var.x);
                            fk7Var.y = rs3Var;
                        }
                        rs3Var.e(xm7Var);
                    } else {
                        new h15(Looper.getMainLooper(), (byte) 4).post(new wm7(xm7Var, b));
                    }
                }
                parcel2.writeNoException();
                return true;
            }
            Log.i(zk3Var.a, zk3Var.c("onAppEnteredForeground", new Object[0]));
            this.g = (byte) 1;
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((um7) it2.next()).a.i();
            }
            parcel2.writeNoException();
            return true;
        }
        ic4 ic4Var = new ic4(this);
        parcel2.writeNoException();
        nn7.c(parcel2, ic4Var);
        return true;
    }

    public final boolean L() {
        if (this.g == 2) {
            return true;
        }
        return false;
    }
}
