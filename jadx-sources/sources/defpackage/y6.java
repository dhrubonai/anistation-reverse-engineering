package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y6 {
    public c70 a;
    public up7 b;
    public boolean c;
    public final Object d = new Object();
    public ul7 e;
    public final Context f;
    public final long g;

    public y6(Context context) {
        a34.x(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.c = false;
        this.g = -1L;
    }

    public static x6 a(Context context) {
        y6 y6Var = new y6(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            y6Var.c();
            x6 e = y6Var.e();
            d(e, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e;
        } finally {
        }
    }

    public static void d(x6 x6Var, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
            hashMap.put("app_context", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            if (x6Var != null) {
                if (true != x6Var.c) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = x6Var.b;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new np5(hashMap).start();
        }
    }

    public final void b() {
        a34.w("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f != null && this.a != null) {
                    try {
                        if (this.c) {
                            af2.g().u(this.f, this.a);
                        }
                    } catch (Throwable th) {
                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                    }
                    this.c = false;
                    this.b = null;
                    this.a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        up7 po7Var;
        a34.w("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    b();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b = rh2.b.b(context, 12451000);
                    if (b != 0 && b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    c70 c70Var = new c70();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (af2.g().v(context, context.getClass().getName(), intent, c70Var, 1, null)) {
                            this.a = c70Var;
                            try {
                                IBinder a = c70Var.a();
                                int i = cp7.e;
                                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                if (queryLocalInterface instanceof up7) {
                                    po7Var = (up7) queryLocalInterface;
                                } else {
                                    po7Var = new po7(a);
                                }
                                this.b = po7Var;
                                this.c = true;
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            } catch (Throwable th) {
                                throw new IOException(th);
                            }
                        } else {
                            throw new IOException("Connection failure");
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new Exception();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final x6 e() {
        x6 x6Var;
        a34.w("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        ul7 ul7Var = this.e;
                        if (ul7Var == null || !ul7Var.A) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                a34.x(this.a);
                a34.x(this.b);
                try {
                    po7 po7Var = (po7) this.b;
                    po7Var.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel a = po7Var.a(obtain, 1);
                    String readString = a.readString();
                    a.recycle();
                    po7 po7Var2 = (po7) this.b;
                    po7Var2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = mn7.a;
                    obtain2.writeInt(1);
                    Parcel a2 = po7Var2.a(obtain2, 2);
                    if (a2.readInt() == 0) {
                        z = false;
                    }
                    a2.recycle();
                    x6Var = new x6(readString, z, (byte) 0);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
            ul7 ul7Var2 = this.e;
            if (ul7Var2 != null) {
                ul7Var2.z.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new ul7(this, j);
            }
        }
        return x6Var;
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
