package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class n08 {
    public static final mo7 a;
    public static final mo7 b;
    public static volatile cf7 c;
    public static final Object d;
    public static Context e;

    static {
        new mo7(iv7.N("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), (byte) 0);
        new mo7(iv7.N("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), (byte) 1);
        new mo7(iv7.N("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), (byte) 2);
        new mo7(iv7.N("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), (byte) 3);
        a = new mo7(iv7.N("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), (byte) 4);
        b = new mo7(iv7.N("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), (byte) 5);
        d = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [cf7] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void a() {
        ?? sa7Var;
        if (c != null) {
            return;
        }
        a34.x(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder b2 = yq1.c(e, yq1.e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = me7.f;
                    if (b2 == null) {
                        sa7Var = 0;
                    } else {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        if (queryLocalInterface instanceof cf7) {
                            sa7Var = (cf7) queryLocalInterface;
                        } else {
                            sa7Var = new sa7(b2, "com.google.android.gms.common.internal.IGoogleCertificatesApi", (byte) 2);
                        }
                    }
                    c = sa7Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static u98 b(String str, nw7 nw7Var, boolean z, boolean z2) {
        try {
            a();
            a34.x(e);
            try {
                cf7 cf7Var = c;
                ic4 ic4Var = new ic4(e.getPackageManager());
                pd7 pd7Var = (pd7) cf7Var;
                Parcel K = pd7Var.K();
                int i = fn7.a;
                boolean z3 = true;
                K.writeInt(1);
                int s0 = z51.s0(K, 20293);
                z51.m0(K, 1, str);
                z51.c0(K, 2, nw7Var);
                z51.r0(K, 3, 4);
                K.writeInt(z ? 1 : 0);
                z51.r0(K, 4, 4);
                K.writeInt(z2 ? 1 : 0);
                z51.t0(K, s0);
                fn7.b(K, ic4Var);
                Parcel a2 = pd7Var.a(K, 5);
                if (a2.readInt() == 0) {
                    z3 = false;
                }
                a2.recycle();
                if (z3) {
                    return u98.B;
                }
                return new x88(new fx7(z, str, nw7Var));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return u98.p("module call", e2);
            }
        } catch (vq1 e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return u98.p("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
