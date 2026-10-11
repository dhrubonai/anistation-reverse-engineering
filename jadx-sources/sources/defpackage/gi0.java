package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gi0 extends kk5 {
    public static final zk3 m = new zk3("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final xj7 e;
    public final di0 f;
    public final dn7 g;
    public final a58 h;
    public sm7 i;
    public s25 j;
    public CastDevice k;
    public uw7 l;

    public gi0(Context context, String str, String str2, di0 di0Var, dn7 dn7Var, a58 a58Var) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = di0Var;
        this.g = dn7Var;
        this.h = a58Var;
        tt2 d = d();
        jm7 jm7Var = new jm7(this);
        zk3 zk3Var = il7.a;
        xj7 xj7Var = null;
        if (d != null) {
            try {
                xj7Var = il7.b(context).Q(di0Var, d, jm7Var);
            } catch (RemoteException | h04 e) {
                il7.a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", yl7.class.getSimpleName());
            }
        }
        this.e = xj7Var;
    }

    public final void e(final double d) {
        a34.s();
        final sm7 sm7Var = this.i;
        if (sm7Var != null && sm7Var.k()) {
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                o76 b = o76.b();
                b.d = new g25() { // from class: xl7
                    @Override // defpackage.g25
                    public final void accept(Object obj, Object obj2) {
                        sm7 sm7Var2 = sm7.this;
                        sm7Var2.getClass();
                        uh7 uh7Var = (uh7) ((t98) obj).m();
                        double d2 = sm7Var2.v;
                        boolean z = sm7Var2.w;
                        lp i = rv5.i();
                        Parcel K = uh7Var.K();
                        K.writeDouble(d);
                        K.writeDouble(d2);
                        int i2 = nn7.a;
                        K.writeInt(z ? 1 : 0);
                        nn7.b(K, i);
                        uh7Var.O(K, 7);
                        ((p76) obj2).b(null);
                    }
                };
                b.c = (short) 8411;
                sm7Var.d(1, b.a());
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 17);
            sb.append("Volume cannot be ");
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void f(String str, Task task) {
        boolean z;
        zk3 zk3Var = m;
        xj7 xj7Var = this.e;
        if (xj7Var == null) {
            return;
        }
        try {
            if (task.d()) {
                y38 y38Var = (y38) task.c();
                Status status = y38Var.x;
                if (status.x <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    zk3Var.b("%s() -> success result", str);
                    s25 s25Var = new s25(new qk7());
                    this.j = s25Var;
                    s25Var.s(this.i);
                    this.j.p(new k27(this));
                    this.j.t();
                    a58 a58Var = this.h;
                    s25 s25Var2 = this.j;
                    a34.s();
                    a58Var.a(s25Var2, this.k);
                    mr mrVar = y38Var.y;
                    a34.x(mrVar);
                    String str2 = y38Var.z;
                    String str3 = y38Var.A;
                    a34.x(str3);
                    boolean z2 = y38Var.B;
                    oj7 oj7Var = (oj7) xj7Var;
                    Parcel K = oj7Var.K();
                    nn7.b(K, mrVar);
                    K.writeString(str2);
                    K.writeString(str3);
                    K.writeInt(z2 ? 1 : 0);
                    oj7Var.M(K, 4);
                    return;
                }
                zk3Var.b("%s() -> failure result", str);
                int i = status.x;
                oj7 oj7Var2 = (oj7) xj7Var;
                Parcel K2 = oj7Var2.K();
                K2.writeInt(i);
                oj7Var2.M(K2, 5);
                return;
            }
            Exception b = task.b();
            if (b instanceof bp) {
                int i2 = ((bp) b).x.x;
                oj7 oj7Var3 = (oj7) xj7Var;
                Parcel K3 = oj7Var3.K();
                K3.writeInt(i2);
                oj7Var3.M(K3, 5);
                return;
            }
            oj7 oj7Var4 = (oj7) xj7Var;
            Parcel K4 = oj7Var4.K();
            K4.writeInt(2476);
            oj7Var4.M(K4, 5);
        } catch (RemoteException e) {
            zk3Var.a(e, "Unable to call %s on %s.", "methods", xj7.class.getSimpleName());
        }
    }

    public final void g(int i) {
        a58 a58Var = this.h;
        if (a58Var.q) {
            a58Var.q = false;
            s25 s25Var = a58Var.n;
            if (s25Var != null) {
                s25Var.r(a58Var.m);
            }
            AudioManager audioManager = (AudioManager) a58Var.a.getSystemService("audio");
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
            a58Var.c.N(null);
            kz kzVar = a58Var.h;
            if (kzVar != null) {
                kzVar.H();
                kzVar.B = null;
            }
            kz kzVar2 = a58Var.i;
            if (kzVar2 != null) {
                kzVar2.H();
                kzVar2.B = null;
            }
            st3 st3Var = a58Var.p;
            if (st3Var != null) {
                st3Var.I(null, null);
                a58Var.p.J(new MediaMetadataCompat(new Bundle()));
                a58Var.d(0, null);
            }
            st3 st3Var2 = a58Var.p;
            if (st3Var2 != null) {
                ((nt3) st3Var2.x).a.setActive(false);
                Iterator it = ((ArrayList) st3Var2.z).iterator();
                if (!it.hasNext()) {
                    nt3 nt3Var = (nt3) a58Var.p.x;
                    nt3Var.e.kill();
                    MediaSession mediaSession = nt3Var.a;
                    mediaSession.setCallback(null);
                    nt3Var.b.e.set(null);
                    mediaSession.release();
                    a58Var.p = null;
                } else {
                    throw qx1.f(it);
                }
            }
            a58Var.n = null;
            a58Var.o = null;
            a58Var.i();
            if (i == 0) {
                a58Var.k();
            }
        }
        sm7 sm7Var = this.i;
        if (sm7Var != null) {
            o76 b = o76.b();
            b.d = xb5.z;
            b.c = (short) 8403;
            sm7Var.d(1, b.a());
            sm7Var.i();
            sm7Var.h(sm7Var.k);
            this.i = null;
        }
        this.k = null;
        s25 s25Var2 = this.j;
        if (s25Var2 != null) {
            s25Var2.s(null);
            this.j = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [st3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [m15, java.lang.Object] */
    public final void h(Bundle bundle) {
        zh0 zh0Var;
        boolean z;
        CastDevice c = CastDevice.c(bundle);
        this.k = c;
        boolean z2 = true;
        boolean z3 = false;
        if (c == null) {
            a34.s();
            dl7 dl7Var = this.a;
            zk3 zk3Var = kk5.b;
            if (dl7Var != null) {
                try {
                    uk7 uk7Var = (uk7) dl7Var;
                    Parcel L = uk7Var.L(uk7Var.K(), 9);
                    int i = nn7.a;
                    if (L.readInt() == 0) {
                        z2 = false;
                    }
                    L.recycle();
                    z3 = z2;
                } catch (RemoteException e) {
                    zk3Var.a(e, "Unable to call %s on %s.", "isResuming", dl7.class.getSimpleName());
                }
            }
            if (z3) {
                if (dl7Var != null) {
                    try {
                        uk7 uk7Var2 = (uk7) dl7Var;
                        Parcel K = uk7Var2.K();
                        K.writeInt(2153);
                        uk7Var2.M(K, 15);
                        return;
                    } catch (RemoteException e2) {
                        zk3Var.a(e2, "Unable to call %s on %s.", "notifyFailedToResumeSession", dl7.class.getSimpleName());
                        return;
                    }
                }
                return;
            }
            if (dl7Var != null) {
                try {
                    uk7 uk7Var3 = (uk7) dl7Var;
                    Parcel K2 = uk7Var3.K();
                    K2.writeInt(2151);
                    uk7Var3.M(K2, 12);
                    return;
                } catch (RemoteException e3) {
                    zk3Var.a(e3, "Unable to call %s on %s.", "notifyFailedToStartSession", dl7.class.getSimpleName());
                    return;
                }
            }
            return;
        }
        sm7 sm7Var = this.i;
        ob4 ob4Var = null;
        if (sm7Var != null) {
            o76 b = o76.b();
            b.d = xb5.z;
            b.c = (short) 8403;
            sm7Var.d(1, b.a());
            sm7Var.i();
            sm7Var.h(sm7Var.k);
            this.i = null;
        }
        m.b("Acquiring a connection to Google Play Services for %s", this.k);
        CastDevice castDevice = this.k;
        a34.x(castDevice);
        Bundle bundle2 = new Bundle();
        di0 di0Var = this.f;
        if (di0Var == null) {
            zh0Var = null;
        } else {
            zh0Var = di0Var.C;
        }
        if (zh0Var != null) {
            ob4Var = zh0Var.A;
        }
        if (zh0Var != null && zh0Var.B) {
            z = true;
        } else {
            z = false;
        }
        if (ob4Var != null) {
            z3 = true;
        }
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", z3);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        dn7 dn7Var = this.g;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", dn7Var.M());
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_USE_ROUTE_CONNECTION", dn7Var.m);
        m25 m25Var = new m25(this, (byte) 1);
        ?? obj = new Object();
        a34.y(castDevice, "CastDevice parameter cannot be null");
        obj.x = castDevice;
        obj.y = m25Var;
        obj.z = bundle2;
        ih0 ih0Var = new ih0(obj);
        int i2 = jh0.a;
        sm7 sm7Var2 = new sm7(this.c, ih0Var);
        sm7Var2.E.add(new ya8(this));
        this.i = sm7Var2;
        gs1 c2 = sm7Var2.c(sm7Var2.k, "castDeviceControllerListenerKey");
        ?? obj2 = new Object();
        obj2.e = true;
        qb7 qb7Var = new qb7((Object) sm7Var2, (byte) 3);
        z95 z95Var = z95.y;
        sm7Var2.F = (byte) 2;
        obj2.c = c2;
        obj2.a = qb7Var;
        obj2.b = z95Var;
        obj2.d = new q12[]{v94.r};
        obj2.f = (short) 8428;
        sm7Var2.b(obj2.a());
    }
}
