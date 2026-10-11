package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l15 extends js3 implements ServiceConnection {
    public static final /* synthetic */ int N = 0;
    public final ComponentName F;
    public final h15 G;
    public final ArrayList H;
    public boolean I;
    public boolean J;
    public f15 K;
    public boolean L;
    public xv3 M;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.os.Handler, h15] */
    public l15(Context context, ComponentName componentName) {
        super(context, new sn3((Object) componentName, (byte) 4));
        this.H = new ArrayList();
        this.F = componentName;
        this.G = new Handler();
    }

    @Override // defpackage.js3
    public final gs3 a(String str, is3 is3Var) {
        if (str != null) {
            u92 u92Var = this.D;
            if (u92Var != null) {
                List list = u92Var.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((cs3) list.get(i)).d().equals(str)) {
                        j15 j15Var = new j15(this, str, is3Var);
                        this.H.add(j15Var);
                        if (this.L) {
                            j15Var.b(this.K);
                        }
                        l();
                        return j15Var;
                    }
                }
            }
            return null;
        }
        ze0.k("initialMemberRouteId cannot be null.");
        return null;
    }

    @Override // defpackage.js3
    public final hs3 c(String str, is3 is3Var) {
        if (str != null) {
            return i(str, null, is3Var);
        }
        ze0.k("routeId cannot be null");
        return null;
    }

    @Override // defpackage.js3
    public final hs3 d(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return i(str, str2, is3.b);
            }
            ze0.k("routeGroupId cannot be null");
            return null;
        }
        ze0.k("routeId cannot be null");
        return null;
    }

    @Override // defpackage.js3
    public final void e(ds3 ds3Var) {
        Bundle bundle;
        if (this.L) {
            f15 f15Var = this.K;
            int i = f15Var.d;
            f15Var.d = i + 1;
            if (ds3Var != null) {
                bundle = ds3Var.a;
            } else {
                bundle = null;
            }
            f15Var.b(10, i, 0, bundle, null);
        }
        l();
    }

    public final void h() {
        if (!this.J) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.F);
            try {
                this.J = this.x.bindService(intent, this, 4097);
            } catch (SecurityException unused) {
            }
        }
    }

    public final k15 i(String str, String str2, is3 is3Var) {
        u92 u92Var = this.D;
        if (u92Var != null) {
            List list = u92Var.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((cs3) list.get(i)).d().equals(str)) {
                    k15 k15Var = new k15(this, str, str2, is3Var);
                    this.H.add(k15Var);
                    if (this.L) {
                        k15Var.b(this.K);
                    }
                    l();
                    return k15Var;
                }
            }
            return null;
        }
        return null;
    }

    public final void j() {
        if (this.K != null) {
            f(null);
            this.L = false;
            ArrayList arrayList = this.H;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((g15) arrayList.get(i)).c();
            }
            f15 f15Var = this.K;
            f15Var.b(2, 0, 0, null, null);
            ((WeakReference) f15Var.b.b).clear();
            f15Var.a.getBinder().unlinkToDeath(f15Var, 0);
            f15Var.i.G.post(new e15(f15Var, (byte) 0));
            this.K = null;
        }
    }

    public final void k() {
        if (this.J) {
            this.J = false;
            j();
            try {
                this.x.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void l() {
        if (this.I && (this.B != null || !this.H.isEmpty())) {
            h();
        } else {
            k();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger;
        if (this.J) {
            j();
            if (iBinder != null) {
                messenger = new Messenger(iBinder);
            } else {
                messenger = null;
            }
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        f15 f15Var = new f15(this, messenger);
                        int i = f15Var.d;
                        f15Var.d = i + 1;
                        f15Var.g = i;
                        if (f15Var.b(1, i, 4, null, null)) {
                            try {
                                f15Var.a.getBinder().linkToDeath(f15Var, 0);
                                this.K = f15Var;
                                return;
                            } catch (RemoteException unused) {
                                f15Var.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        j();
    }

    public final String toString() {
        return "Service connection " + this.F.flattenToShortString();
    }
}
