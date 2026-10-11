package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.unity3d.ads.adplayer.DisplayRecoverer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nv7 extends rm7 implements cr7 {
    public final z18 e;
    public Boolean f;
    public String g;

    public nv7(z18 z18Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        a34.x(z18Var);
        this.e = z18Var;
        this.g = null;
    }

    @Override // defpackage.cr7
    public final void A(mm7 mm7Var, b48 b48Var) {
        a34.x(mm7Var);
        K(b48Var);
        M(new t35((Object) this, (y2) mm7Var, (Object) b48Var, (byte) 4));
    }

    @Override // defpackage.cr7
    public final void C(yh7 yh7Var, b48 b48Var) {
        a34.x(yh7Var);
        a34.x(yh7Var.z);
        K(b48Var);
        yh7 yh7Var2 = new yh7(yh7Var);
        yh7Var2.x = b48Var.x;
        M(new t35((Object) this, (y2) yh7Var2, (Object) b48Var, (byte) 3));
    }

    @Override // defpackage.cr7
    public final void E(b48 b48Var) {
        K(b48Var);
        M(new lu7(this, b48Var, (byte) 0));
    }

    @Override // defpackage.cr7
    public final void G(b48 b48Var, Bundle bundle, gr7 gr7Var) {
        K(b48Var);
        String str = b48Var.x;
        a34.x(str);
        this.e.f().U(new fv7(this, b48Var, bundle, gr7Var, str));
    }

    @Override // defpackage.cr7
    public final void I(b48 b48Var) {
        a34.u(b48Var.x);
        a34.x(b48Var.P);
        b(new lu7(this, b48Var, (byte) 6));
    }

    public final void K(b48 b48Var) {
        a34.x(b48Var);
        String str = b48Var.x;
        a34.u(str);
        L(str, false);
        this.e.k0().R(b48Var.y);
    }

    public final void L(String str, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(str);
        z18 z18Var = this.e;
        if (!isEmpty) {
            if (z) {
                try {
                    Boolean bool = this.f;
                    if (bool == null) {
                        boolean z2 = true;
                        if (!"com.google.android.gms".equals(this.g) && !iz5.e(z18Var.I.x, Binder.getCallingUid()) && !yh2.a(z18Var.I.x).b(Binder.getCallingUid())) {
                            z2 = false;
                        }
                        bool = Boolean.valueOf(z2);
                        this.f = bool;
                    }
                    if (bool.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    z18Var.c().C.b(es7.P(str), "Measurement Service called with invalid calling package. appId");
                    throw e;
                }
            }
            if (this.g == null) {
                Context context = z18Var.I.x;
                int callingUid = Binder.getCallingUid();
                int i = xh2.e;
                if (iz5.l(callingUid, context, str)) {
                    this.g = str;
                }
            }
            if (str.equals(this.g)) {
                return;
            }
            throw new SecurityException("Unknown calling package name '" + str + "'.");
        }
        z18Var.c().C.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void M(Runnable runnable) {
        z18 z18Var = this.e;
        if (z18Var.f().R()) {
            runnable.run();
        } else {
            z18Var.f().U(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r5v14, types: [sa7] */
    /* JADX WARN: Type inference failed for: r5v16, types: [sa7] */
    @Override // defpackage.rm7
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        ?? r12;
        List list;
        z18 z18Var = this.e;
        ArrayList arrayList = null;
        gr7 gr7Var = null;
        kr7 kr7Var = null;
        boolean z = false;
        boolean z2 = false;
        switch (i) {
            case 1:
                mm7 mm7Var = (mm7) tm7.a(parcel, mm7.CREATOR);
                b48 b48Var = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                A(mm7Var, b48Var);
                parcel2.writeNoException();
                return true;
            case 2:
                e28 e28Var = (e28) tm7.a(parcel, e28.CREATOR);
                b48 b48Var2 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                i(e28Var, b48Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                b48 b48Var3 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                E(b48Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                mm7 mm7Var2 = (mm7) tm7.a(parcel, mm7.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                tm7.d(parcel);
                a34.x(mm7Var2);
                a34.u(readString);
                L(readString, true);
                M(new t35((Object) this, (y2) mm7Var2, (Object) readString, (byte) 5));
                parcel2.writeNoException();
                return true;
            case 6:
                b48 b48Var4 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                w(b48Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                b48 b48Var5 = (b48) tm7.a(parcel, b48.CREATOR);
                if (parcel.readInt() != 0) {
                    r12 = true;
                } else {
                    r12 = false;
                }
                tm7.d(parcel);
                K(b48Var5);
                String str = b48Var5.x;
                a34.x(str);
                try {
                    List<g28> list2 = (List) z18Var.f().S(new ju7(this, str, z ? (byte) 1 : (byte) 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (g28 g28Var : list2) {
                        if (r12 == false && i28.p0(g28Var.c)) {
                        }
                        arrayList2.add(new e28(g28Var));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException | ExecutionException e) {
                    z18Var.c().C.c("Failed to get user properties. appId", es7.P(str), e);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                mm7 mm7Var3 = (mm7) tm7.a(parcel, mm7.CREATOR);
                String readString2 = parcel.readString();
                tm7.d(parcel);
                byte[] t = t(readString2, mm7Var3);
                parcel2.writeNoException();
                parcel2.writeByteArray(t);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                tm7.d(parcel);
                n(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case 11:
                b48 b48Var6 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                String h = h(b48Var6);
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 12:
                yh7 yh7Var = (yh7) tm7.a(parcel, yh7.CREATOR);
                b48 b48Var7 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                C(yh7Var, b48Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                yh7 yh7Var2 = (yh7) tm7.a(parcel, yh7.CREATOR);
                tm7.d(parcel);
                a34.x(yh7Var2);
                a34.x(yh7Var2.z);
                a34.u(yh7Var2.x);
                L(yh7Var2.x, true);
                M(new yc2((byte) 22, this, new yh7(yh7Var2), false));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = tm7.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b48 b48Var8 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                List p = p(readString6, readString7, z, b48Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(p);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = tm7.a;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                tm7.d(parcel);
                List e2 = e(readString8, readString9, readString10, z2);
                parcel2.writeNoException();
                parcel2.writeTypedList(e2);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                b48 b48Var9 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                List l = l(readString11, readString12, b48Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(l);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                tm7.d(parcel);
                List r = r(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(r);
                return true;
            case 18:
                b48 b48Var10 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                s(b48Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                b48 b48Var11 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                v(bundle, b48Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                b48 b48Var12 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                g(b48Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                b48 b48Var13 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                jk7 m = m(b48Var13);
                parcel2.writeNoException();
                if (m == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                m.writeToParcel(parcel2, 1);
                return true;
            case 24:
                b48 b48Var14 = (b48) tm7.a(parcel, b48.CREATOR);
                Bundle bundle2 = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                tm7.d(parcel);
                K(b48Var14);
                String str2 = b48Var14.x;
                a34.x(str2);
                if (z18Var.e0().W(null, tq7.T0)) {
                    try {
                        list = (List) z18Var.f().T(new dv7(this, b48Var14, bundle2, (byte) 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                        z18Var.c().C.c("Failed to get trigger URIs. appId", es7.P(str2), e3);
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) z18Var.f().S(new dv7(this, b48Var14, bundle2, (byte) 1)).get();
                    } catch (InterruptedException | ExecutionException e4) {
                        z18Var.c().C.c("Failed to get trigger URIs. appId", es7.P(str2), e4);
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                b48 b48Var15 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                I(b48Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                b48 b48Var16 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                x(b48Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                b48 b48Var17 = (b48) tm7.a(parcel, b48.CREATOR);
                tm7.d(parcel);
                q(b48Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                b48 b48Var18 = (b48) tm7.a(parcel, b48.CREATOR);
                e18 e18Var = (e18) tm7.a(parcel, e18.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    if (queryLocalInterface instanceof kr7) {
                        kr7Var = (kr7) queryLocalInterface;
                    } else {
                        kr7Var = new sa7(readStrongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", (byte) 3);
                    }
                }
                tm7.d(parcel);
                j(b48Var18, e18Var, kr7Var);
                parcel2.writeNoException();
                return true;
            case 30:
                b48 b48Var19 = (b48) tm7.a(parcel, b48.CREATOR);
                mg7 mg7Var = (mg7) tm7.a(parcel, mg7.CREATOR);
                tm7.d(parcel);
                y(b48Var19, mg7Var);
                parcel2.writeNoException();
                return true;
            case 31:
                b48 b48Var20 = (b48) tm7.a(parcel, b48.CREATOR);
                Bundle bundle3 = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    if (queryLocalInterface2 instanceof gr7) {
                        gr7Var = (gr7) queryLocalInterface2;
                    } else {
                        gr7Var = new sa7(readStrongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", (byte) 3);
                    }
                }
                tm7.d(parcel);
                G(b48Var20, bundle3, gr7Var);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void b(Runnable runnable) {
        z18 z18Var = this.e;
        if (z18Var.f().R()) {
            runnable.run();
        } else {
            z18Var.f().W(runnable);
        }
    }

    @Override // defpackage.cr7
    public final List e(String str, String str2, String str3, boolean z) {
        L(str, true);
        z18 z18Var = this.e;
        try {
            List<g28> list = (List) z18Var.f().S(new vu7(this, str, str2, str3, (byte) 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (g28 g28Var : list) {
                if (!z && i28.p0(g28Var.c)) {
                }
                arrayList.add(new e28(g28Var));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            z18Var.c().C.c("Failed to get user properties as. appId", es7.P(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.cr7
    public final void g(b48 b48Var) {
        a34.u(b48Var.x);
        a34.x(b48Var.P);
        b(new lu7(this, b48Var, (byte) 4));
    }

    @Override // defpackage.cr7
    public final String h(b48 b48Var) {
        K(b48Var);
        z18 z18Var = this.e;
        try {
            return (String) z18Var.f().S(new ju7(z18Var, b48Var)).get(DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            z18Var.c().C.c("Failed to get app instance id. appId", es7.P(b48Var.x), e);
            return null;
        }
    }

    @Override // defpackage.cr7
    public final void i(e28 e28Var, b48 b48Var) {
        a34.x(e28Var);
        K(b48Var);
        M(new t35((Object) this, (y2) e28Var, (Object) b48Var, (byte) 6));
    }

    @Override // defpackage.cr7
    public final void j(b48 b48Var, e18 e18Var, kr7 kr7Var) {
        K(b48Var);
        String str = b48Var.x;
        a34.x(str);
        this.e.f().U(new w47(this, str, e18Var, kr7Var, (byte) 1));
    }

    @Override // defpackage.cr7
    public final List l(String str, String str2, b48 b48Var) {
        K(b48Var);
        String str3 = b48Var.x;
        a34.x(str3);
        z18 z18Var = this.e;
        try {
            return (List) z18Var.f().S(new vu7(this, str3, str, str2, (byte) 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            z18Var.c().C.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.cr7
    public final jk7 m(b48 b48Var) {
        K(b48Var);
        String str = b48Var.x;
        a34.u(str);
        z18 z18Var = this.e;
        try {
            return (jk7) z18Var.f().T(new ju7(this, b48Var, (byte) 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            z18Var.c().C.c("Failed to get consent. appId", es7.P(str), e);
            return new jk7(null);
        }
    }

    @Override // defpackage.cr7
    public final void n(long j, String str, String str2, String str3) {
        M(new pu7(this, str2, str3, str, j, (byte) 0));
    }

    @Override // defpackage.cr7
    public final List p(String str, String str2, boolean z, b48 b48Var) {
        K(b48Var);
        String str3 = b48Var.x;
        a34.x(str3);
        z18 z18Var = this.e;
        try {
            List<g28> list = (List) z18Var.f().S(new vu7(this, str3, str, str2, (byte) 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (g28 g28Var : list) {
                if (!z && i28.p0(g28Var.c)) {
                }
                arrayList.add(new e28(g28Var));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            z18Var.c().C.c("Failed to query user properties. appId", es7.P(str3), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.cr7
    public final void q(b48 b48Var) {
        K(b48Var);
        M(new lu7(this, b48Var, (byte) 1));
    }

    @Override // defpackage.cr7
    public final List r(String str, String str2, String str3) {
        L(str, true);
        z18 z18Var = this.e;
        try {
            return (List) z18Var.f().S(new vu7(this, str, str2, str3, (byte) 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            z18Var.c().C.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.cr7
    public final void s(b48 b48Var) {
        String str = b48Var.x;
        a34.u(str);
        L(str, false);
        M(new lu7(this, b48Var, (byte) 3));
    }

    @Override // defpackage.cr7
    public final byte[] t(String str, mm7 mm7Var) {
        a34.u(str);
        a34.x(mm7Var);
        L(str, true);
        z18 z18Var = this.e;
        bs7 bs7Var = z18Var.c().J;
        gu7 gu7Var = z18Var.I;
        vr7 vr7Var = gu7Var.G;
        String str2 = mm7Var.x;
        bs7Var.b(vr7Var.a(str2), "Log and bundle. event");
        z18Var.d().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) z18Var.f().T(new ip7(this, mm7Var, str)).get();
            if (bArr == null) {
                z18Var.c().C.b(es7.P(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            z18Var.d().getClass();
            z18Var.c().J.d("Log and bundle processed. event, size, time_ms", gu7Var.G.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            z18Var.c().C.d("Failed to log and bundle. appId, event, error", es7.P(str), gu7Var.G.a(str2), e);
            return null;
        }
    }

    @Override // defpackage.cr7
    public final void v(Bundle bundle, b48 b48Var) {
        K(b48Var);
        String str = b48Var.x;
        a34.x(str);
        M(new w47(this, bundle, str, b48Var, (byte) 3));
    }

    @Override // defpackage.cr7
    public final void w(b48 b48Var) {
        K(b48Var);
        M(new lu7(this, b48Var, (byte) 2));
    }

    @Override // defpackage.cr7
    public final void x(b48 b48Var) {
        a34.u(b48Var.x);
        a34.x(b48Var.P);
        b(new lu7(this, b48Var, (byte) 5));
    }

    @Override // defpackage.cr7
    public final void y(b48 b48Var, mg7 mg7Var) {
        K(b48Var);
        M(new t35((Object) this, (Object) b48Var, (Object) mg7Var, (byte) 7));
    }
}
