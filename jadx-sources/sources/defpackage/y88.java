package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y88 extends nh2 {
    public static final zk3 T = new zk3("CastClientImpl", null);
    public static final Object U = new Object();
    public static final Object V = new Object();
    public mr B;
    public final CastDevice C;
    public final m25 D;
    public final HashMap E;
    public final Bundle F;
    public t78 G;
    public String H;
    public boolean I;
    public boolean J;
    public boolean K;
    public double L;
    public kk7 M;
    public int N;
    public int O;
    public String P;
    public String Q;
    public Bundle R;
    public final HashMap S;

    public y88(Context context, Looper looper, tp tpVar, CastDevice castDevice, m25 m25Var, Bundle bundle, wa7 wa7Var, wa7 wa7Var2) {
        super(context, looper, 10, tpVar, wa7Var, wa7Var2);
        this.C = castDevice;
        this.D = m25Var;
        this.F = bundle;
        this.E = new HashMap();
        new AtomicLong(0L);
        this.S = new HashMap();
        this.N = -1;
        this.O = -1;
        this.B = null;
        this.H = null;
        this.L = 0.0d;
        y();
        this.I = false;
        this.M = null;
        y();
    }

    public final void A(long j) {
        HashMap hashMap = this.S;
        synchronized (hashMap) {
            try {
                if (hashMap.remove(Long.valueOf(j)) != null) {
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r30
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof uh7) {
            return (uh7) queryLocalInterface;
        }
        return new uh7(iBinder);
    }

    @Override // defpackage.r30
    public final void c() {
        Object[] objArr = {this.G, Boolean.valueOf(q())};
        zk3 zk3Var = T;
        zk3Var.b("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        t78 t78Var = this.G;
        y88 y88Var = null;
        this.G = null;
        if (t78Var != null) {
            y88 y88Var2 = (y88) t78Var.g.getAndSet(null);
            if (y88Var2 != null) {
                y88Var2.N = -1;
                y88Var2.O = -1;
                y88Var2.B = null;
                y88Var2.H = null;
                y88Var2.L = 0.0d;
                y88Var2.y();
                y88Var2.I = false;
                y88Var2.M = null;
                y88Var = y88Var2;
            }
            if (y88Var != null) {
                z();
                try {
                    try {
                        uh7 uh7Var = (uh7) m();
                        lp i = rv5.i();
                        Parcel K = uh7Var.K();
                        nn7.b(K, i);
                        uh7Var.O(K, 1);
                    } catch (RemoteException | IllegalStateException e) {
                        zk3Var.a(e, "Error while disconnecting the controller interface", new Object[0]);
                    }
                    return;
                } finally {
                    super.c();
                }
            }
        }
        zk3Var.b("already disposed, so short-circuiting", new Object[0]);
    }

    @Override // defpackage.r30
    public final Bundle h() {
        Bundle bundle = this.R;
        if (bundle == null) {
            return null;
        }
        this.R = null;
        return bundle;
    }

    @Override // defpackage.r30
    public final Bundle i() {
        Bundle bundle = new Bundle();
        T.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.P, this.Q);
        CastDevice castDevice = this.C;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        Bundle bundle2 = this.F;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        t78 t78Var = new t78(this);
        this.G = t78Var;
        bundle.putParcelable("listener", new BinderWrapper(t78Var));
        String str = this.P;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.Q;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // defpackage.r30
    public final int j() {
        return 12800000;
    }

    @Override // defpackage.r30
    public final String n() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // defpackage.r30
    public final String o() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.r30
    public final void s(hw0 hw0Var) {
        super.s(hw0Var);
        z();
    }

    @Override // defpackage.r30
    public final void t(int i, IBinder iBinder, Bundle bundle, int i2) {
        T.b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.J = true;
            this.K = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.R = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.t(i, iBinder, bundle, i2);
    }

    public final void y() {
        CastDevice castDevice = this.C;
        a34.y(castDevice, "device should not be null");
        mm5 mm5Var = castDevice.F;
        if (!mm5Var.a(2048) && mm5Var.a(4) && !mm5Var.a(1)) {
            "Chromecast Audio".equals(castDevice.B);
        }
    }

    public final void z() {
        T.b("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap hashMap = this.E;
        synchronized (hashMap) {
            hashMap.clear();
        }
    }
}
