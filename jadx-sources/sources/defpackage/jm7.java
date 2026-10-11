package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jm7 extends ua7 {
    public final /* synthetic */ byte f = 3;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm7(gi0 gi0Var) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", (byte) 1);
        this.g = gi0Var;
    }

    @Override // defpackage.ua7
    public final boolean K(int i, Parcel parcel, Parcel parcel2) {
        int i2;
        long g;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        byte b = this.f;
        byte b2 = 4;
        boolean z = false;
        Object obj = this.g;
        switch (b) {
            case 0:
                kk5 kk5Var = (kk5) obj;
                switch (i) {
                    case 1:
                        ic4 ic4Var = new ic4(kk5Var);
                        parcel2.writeNoException();
                        nn7.c(parcel2, ic4Var);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) nn7.a(parcel, Bundle.CREATOR);
                        nn7.d(parcel);
                        ((gi0) kk5Var).h(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) nn7.a(parcel, Bundle.CREATOR);
                        nn7.d(parcel);
                        ((gi0) kk5Var).h(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i3 = nn7.a;
                        if (parcel.readInt() != 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        nn7.d(parcel);
                        gi0 gi0Var = (gi0) kk5Var;
                        xj7 xj7Var = gi0Var.e;
                        if (xj7Var != null) {
                            try {
                                oj7 oj7Var = (oj7) xj7Var;
                                Parcel K = oj7Var.K();
                                K.writeInt(i2);
                                K.writeInt(0);
                                oj7Var.M(K, 6);
                            } catch (RemoteException e) {
                                gi0.m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", xj7.class.getSimpleName());
                            }
                            gi0Var.b(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        gi0 gi0Var2 = (gi0) kk5Var;
                        gi0Var2.getClass();
                        a34.s();
                        s25 s25Var = gi0Var2.j;
                        if (s25Var == null) {
                            g = 0;
                        } else {
                            g = s25Var.g() - gi0Var2.j.a();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(g);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) nn7.a(parcel, Bundle.CREATOR);
                        nn7.d(parcel);
                        gi0 gi0Var3 = (gi0) kk5Var;
                        gi0Var3.getClass();
                        gi0Var3.k = CastDevice.c(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) nn7.a(parcel, Bundle.CREATOR);
                        nn7.d(parcel);
                        gi0 gi0Var4 = (gi0) kk5Var;
                        gi0Var4.getClass();
                        gi0Var4.k = CastDevice.c(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) nn7.a(parcel, Bundle.CREATOR);
                        nn7.d(parcel);
                        gi0 gi0Var5 = (gi0) kk5Var;
                        gi0Var5.getClass();
                        CastDevice c = CastDevice.c(bundle5);
                        if (c != null) {
                            String str2 = c.A;
                            if (!c.equals(gi0Var5.k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = gi0Var5.k) == null || !TextUtils.equals(castDevice2.A, str2))) {
                                    z = true;
                                }
                                gi0Var5.k = c;
                                zk3 zk3Var = gi0.m;
                                if (true != z) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                zk3Var.b("update to device (%s) with name %s", c, str);
                                if (z && (castDevice = gi0Var5.k) != null) {
                                    a58 a58Var = gi0Var5.h;
                                    if (a58Var != null) {
                                        zk3 zk3Var2 = a58.v;
                                        Log.i(zk3Var2.a, zk3Var2.c("update Cast device to %s", castDevice));
                                        a58Var.o = castDevice;
                                        a58Var.b();
                                    }
                                    Iterator it = new HashSet(gi0Var5.d).iterator();
                                    while (it.hasNext()) {
                                        ((m25) it.next()).getClass();
                                    }
                                    uw7 uw7Var = gi0Var5.l;
                                    if (uw7Var != null) {
                                        ((kz) uw7Var.x).I().u++;
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                    default:
                        return false;
                }
                return true;
            case 1:
                vl7 vl7Var = (vl7) obj;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return false;
                            }
                            parcel2.writeNoException();
                            parcel2.writeInt(12451000);
                        } else {
                            String str3 = vl7Var.b;
                            parcel2.writeNoException();
                            parcel2.writeString(str3);
                        }
                    } else {
                        boolean z2 = vl7Var.d.B;
                        parcel2.writeNoException();
                        int i4 = nn7.a;
                        parcel2.writeInt(z2 ? 1 : 0);
                    }
                } else {
                    String readString = parcel.readString();
                    nn7.d(parcel);
                    vl7Var.getClass();
                    Context context = vl7Var.a;
                    String str4 = vl7Var.b;
                    Context context2 = vl7Var.a;
                    di0 di0Var = vl7Var.d;
                    dn7 dn7Var = vl7Var.e;
                    tt2 d = new gi0(context, str4, readString, di0Var, dn7Var, new a58(context2, di0Var, dn7Var)).d();
                    parcel2.writeNoException();
                    nn7.c(parcel2, d);
                }
                return true;
            case 2:
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                } else {
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    nn7.d(parcel);
                    lo7.a((lo7) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                    parcel2.writeNoException();
                }
                return true;
            default:
                gi0 gi0Var6 = (gi0) obj;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return false;
                                }
                                parcel2.writeNoException();
                                parcel2.writeInt(12451000);
                            } else {
                                int readInt = parcel.readInt();
                                nn7.d(parcel);
                                gi0Var6.g(readInt);
                                parcel2.writeNoException();
                            }
                        } else {
                            String readString2 = parcel.readString();
                            nn7.d(parcel);
                            sm7 sm7Var = gi0Var6.i;
                            if (sm7Var != null && sm7Var.k()) {
                                sm7 sm7Var2 = gi0Var6.i;
                                sm7Var2.getClass();
                                o76 b3 = o76.b();
                                b3.d = new fk7(sm7Var2, readString2);
                                b3.c = (short) 8409;
                                sm7Var2.d(1, b3.a());
                            }
                            parcel2.writeNoException();
                        }
                    } else {
                        String readString3 = parcel.readString();
                        aa3 aa3Var = (aa3) nn7.a(parcel, aa3.CREATOR);
                        nn7.d(parcel);
                        sm7 sm7Var3 = gi0Var6.i;
                        if (sm7Var3 != null && sm7Var3.k()) {
                            sm7 sm7Var4 = gi0Var6.i;
                            sm7Var4.getClass();
                            o76 b4 = o76.b();
                            b4.d = new l87(sm7Var4, readString3, aa3Var, b2);
                            b4.c = (short) 8406;
                            sm7Var4.d(1, b4.a()).e(new ub7(this, (byte) 9));
                        }
                        parcel2.writeNoException();
                    }
                } else {
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    nn7.d(parcel);
                    sm7 sm7Var5 = gi0Var6.i;
                    if (sm7Var5 != null && sm7Var5.k()) {
                        sm7 sm7Var6 = gi0Var6.i;
                        sm7Var6.getClass();
                        o76 b5 = o76.b();
                        b5.d = new xf6(sm7Var6, readString4, readString5, (byte) 8);
                        b5.c = (short) 8407;
                        sm7Var6.d(1, b5.a()).e(new qb7((Object) this, (byte) 13));
                    }
                    parcel2.writeNoException();
                }
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm7(kk5 kk5Var) {
        super("com.google.android.gms.cast.framework.ISessionProxy", (byte) 1);
        this.g = kk5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm7(vl7 vl7Var) {
        super("com.google.android.gms.cast.framework.ISessionProvider", (byte) 1);
        this.g = vl7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm7(lo7 lo7Var) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", (byte) 1);
        this.g = lo7Var;
    }
}
