package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class r30 {
    public static final q12[] z = new q12[0];
    public x6 b;
    public final Context c;
    public final Looper d;
    public final o28 e;
    public final rh2 f;
    public final rl7 g;
    public kc7 j;
    public q30 k;
    public IInterface l;
    public gp7 n;
    public final o30 p;
    public final p30 q;
    public final short r;
    public final String s;
    public volatile String t;
    public volatile i75 u;
    public volatile String a = null;
    public final Object h = new Object();
    public final Object i = new Object();
    public final ArrayList m = new ArrayList();
    public byte o = 1;
    public hw0 v = null;
    public boolean w = false;
    public volatile jv7 x = null;
    public final AtomicInteger y = new AtomicInteger(0);

    /* JADX WARN: Multi-variable type inference failed */
    public r30(Context context, Looper looper, o28 o28Var, rh2 rh2Var, int i, o30 o30Var, p30 p30Var, String str) {
        a34.y(context, "Context must not be null");
        this.c = context;
        a34.y(looper, "Looper must not be null");
        this.d = looper;
        a34.y(o28Var, "Supervisor must not be null");
        this.e = o28Var;
        a34.y(rh2Var, "API availability must not be null");
        this.f = rh2Var;
        this.g = new rl7(this, looper);
        this.r = i;
        this.p = o30Var;
        this.q = p30Var;
        this.s = str;
    }

    public final void a() {
        int b = this.f.b(this.c, j());
        if (b != 0) {
            x(1, null);
            this.k = new cn7(this);
            int i = this.y.get();
            rl7 rl7Var = this.g;
            rl7Var.sendMessage(rl7Var.obtainMessage(3, i, b, null));
            return;
        }
        this.k = new cn7(this);
        x(2, null);
    }

    public IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof mb7) {
            return (mb7) queryLocalInterface;
        }
        return new sa7(iBinder, "com.google.android.gms.signin.internal.ISignInService", (byte) 0);
    }

    public void c() {
        this.y.incrementAndGet();
        ArrayList arrayList = this.m;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    jc7 jc7Var = (jc7) arrayList.get(i);
                    synchronized (jc7Var) {
                        jc7Var.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.i) {
            this.j = null;
        }
        x(1, null);
    }

    public final void d(String str) {
        this.a = str;
        c();
    }

    public Account e() {
        return null;
    }

    public q12[] f() {
        return z;
    }

    public Executor g() {
        return null;
    }

    public Bundle h() {
        return null;
    }

    public Bundle i() {
        return new Bundle();
    }

    public int j() {
        return 12451000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(at2 at2Var, Set set) {
        String attributionTag;
        String attributionTag2;
        Bundle i = i();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag2 = this.t;
        } else if (this.u == null) {
            attributionTag2 = this.t;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.u.y;
            if (attributionSource != null) {
                attributionTag = attributionSource.getAttributionTag();
                if (attributionTag != null) {
                    attributionTag2 = attributionSource.getAttributionTag();
                } else {
                    attributionTag2 = this.t;
                }
            } else {
                attributionTag2 = this.t;
            }
        }
        String str = attributionTag2;
        short s = this.r;
        int i2 = rh2.a;
        Scope[] scopeArr = he2.L;
        Bundle bundle = new Bundle();
        q12[] q12VarArr = he2.M;
        he2 he2Var = new he2(6, s, i2, null, null, scopeArr, bundle, null, q12VarArr, q12VarArr, true, 0, false, str);
        he2Var.A = this.c.getPackageName();
        he2Var.D = i;
        if (set != null) {
            he2Var.C = (Scope[]) set.toArray(new Scope[0]);
        }
        if (u()) {
            Account e = e();
            if (e == null) {
                e = new Account("<<default account>>", "com.google");
            }
            he2Var.E = e;
            if (at2Var != 0) {
                he2Var.B = ((sa7) at2Var).f;
            }
        }
        he2Var.F = z;
        he2Var.G = f();
        if (v()) {
            he2Var.J = true;
        }
        try {
            try {
                synchronized (this.i) {
                    try {
                        kc7 kc7Var = this.j;
                        if (kc7Var != null) {
                            kc7Var.a(new no7(this, this.y.get()), he2Var);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException e2) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
                t(8, null, null, this.y.get());
            }
        } catch (DeadObjectException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i3 = this.y.get();
            rl7 rl7Var = this.g;
            rl7Var.sendMessage(rl7Var.obtainMessage(6, i3, 3));
        } catch (SecurityException e4) {
            throw e4;
        }
    }

    public Set l() {
        return Collections.EMPTY_SET;
    }

    public final IInterface m() {
        IInterface iInterface;
        synchronized (this.h) {
            try {
                if (this.o != 5) {
                    if (q()) {
                        iInterface = this.l;
                        a34.y(iInterface, "Client is connected but service is null");
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public String n() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public String o() {
        return "com.google.android.gms.signin.service.START";
    }

    public boolean p() {
        if (j() >= 211700000) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        boolean z2;
        synchronized (this.h) {
            if (this.o == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final boolean r() {
        boolean z2;
        synchronized (this.h) {
            byte b = this.o;
            z2 = true;
            if (b != 2 && b != 3) {
                z2 = false;
            }
        }
        return z2;
    }

    public void s(hw0 hw0Var) {
        int i = hw0Var.y;
        System.currentTimeMillis();
    }

    public void t(int i, IBinder iBinder, Bundle bundle, int i2) {
        tp7 tp7Var = new tp7(this, i, iBinder, bundle);
        rl7 rl7Var = this.g;
        rl7Var.sendMessage(rl7Var.obtainMessage(1, i2, -1, tp7Var));
    }

    public boolean u() {
        return false;
    }

    public boolean v() {
        return this instanceof m08;
    }

    public final /* synthetic */ boolean w(int i, int i2, IInterface iInterface) {
        synchronized (this.h) {
            try {
                if (this.o != i) {
                    return false;
                }
                x(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(int i, IInterface iInterface) {
        boolean z2;
        boolean z3;
        boolean z4;
        x6 x6Var;
        boolean z5 = false;
        if (i != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (iInterface == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 == z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        a34.n(z4);
        synchronized (this.h) {
            try {
                this.o = i;
                this.l = iInterface;
                Bundle bundle = null;
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i == 4) {
                            a34.x(iInterface);
                            System.currentTimeMillis();
                        }
                    } else {
                        gp7 gp7Var = this.n;
                        if (gp7Var != null && (x6Var = this.b) != null) {
                            String str = x6Var.b;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70 + "com.google.android.gms".length());
                            sb.append("Calling connect() while still connected, missing disconnect() for ");
                            sb.append(str);
                            sb.append(" on com.google.android.gms");
                            Log.e("GmsClient", sb.toString());
                            o28 o28Var = this.e;
                            String str2 = this.b.b;
                            a34.x(str2);
                            this.b.getClass();
                            if (this.s == null) {
                                this.c.getClass();
                            }
                            o28Var.c(str2, gp7Var, this.b.c);
                            this.y.incrementAndGet();
                        }
                        gp7 gp7Var2 = new gp7(this, this.y.get());
                        this.n = gp7Var2;
                        String o = o();
                        boolean p = p();
                        this.b = new x6(o, p, (byte) 1);
                        if (p && j() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.b)));
                        }
                        o28 o28Var2 = this.e;
                        String str3 = this.b.b;
                        a34.x(str3);
                        this.b.getClass();
                        String str4 = this.s;
                        if (str4 == null) {
                            str4 = this.c.getClass().getName();
                        }
                        hw0 b = o28Var2.b(new oz7(str3, this.b.c), gp7Var2, str4, g());
                        if (b.y == 0) {
                            z5 = true;
                        }
                        if (!z5) {
                            String str5 = this.b.b;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                            sb2.append("unable to connect to service: ");
                            sb2.append(str5);
                            sb2.append(" on com.google.android.gms");
                            Log.w("GmsClient", sb2.toString());
                            int i2 = b.y;
                            if (i2 == -1) {
                                i2 = 16;
                            }
                            if (b.z != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", b.z);
                            }
                            int i3 = this.y.get();
                            xq7 xq7Var = new xq7(this, i2, bundle);
                            rl7 rl7Var = this.g;
                            rl7Var.sendMessage(rl7Var.obtainMessage(7, i3, -1, xq7Var));
                        }
                    }
                } else {
                    gp7 gp7Var3 = this.n;
                    if (gp7Var3 != null) {
                        o28 o28Var3 = this.e;
                        String str6 = this.b.b;
                        a34.x(str6);
                        this.b.getClass();
                        if (this.s == null) {
                            this.c.getClass();
                        }
                        o28Var3.c(str6, gp7Var3, this.b.c);
                        this.n = null;
                    }
                }
            } finally {
            }
        }
    }
}
