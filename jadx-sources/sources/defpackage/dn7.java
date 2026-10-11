package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import androidx.mediarouter.media.MediaTransferReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dn7 extends ua7 implements IInterface {
    public static final zk3 n = new zk3("MediaRouterProxy", null);
    public final rs3 f;
    public final di0 g;
    public final HashMap h;
    public final qn7 i;
    public final boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public dn7(Context context, rs3 rs3Var, di0 di0Var, wb7 wb7Var) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", (byte) 1);
        this.h = new HashMap();
        this.f = rs3Var;
        this.g = di0Var;
        if (Build.VERSION.SDK_INT >= 33) {
            n.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
            this.i = new qn7(di0Var);
            new Intent(context, (Class<?>) MediaTransferReceiver.class).setPackage(context.getPackageName());
            this.j = !context.getPackageManager().queryBroadcastReceivers(r6, 0).isEmpty();
            this.k = true;
            this.l = true;
            wb7Var.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED", "com.google.android.gms.cast.FLAG_SHOW_SYSTEM_OUTPUT_SWITCHER_ON_CAST_ICON_CLICK"}).e(new ub7(this, (byte) 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [sa7] */
    @Override // defpackage.ua7
    public final boolean K(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        hm7 hm7Var = null;
        Bundle bundle = null;
        HashMap hashMap = this.h;
        zk3 zk3Var = n;
        int i2 = 0;
        rs3 rs3Var = this.f;
        switch (i) {
            case 1:
                Bundle bundle2 = (Bundle) nn7.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    if (queryLocalInterface instanceof hm7) {
                        hm7Var = (hm7) queryLocalInterface;
                    } else {
                        hm7Var = new sa7(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", (byte) 1);
                    }
                }
                nn7.d(parcel);
                ks3 b = ks3.b(bundle2);
                if (b != null) {
                    if (!hashMap.containsKey(b)) {
                        hashMap.put(b, new HashSet());
                    }
                    ((Set) hashMap.get(b)).add(new om7(hm7Var, this, this.i));
                }
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle3 = (Bundle) nn7.a(parcel, Bundle.CREATOR);
                int readInt = parcel.readInt();
                nn7.d(parcel);
                ks3 b2 = ks3.b(bundle3);
                if (b2 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        O(b2, readInt);
                    } else {
                        new h15(Looper.getMainLooper(), (byte) 4).post(new xp((byte) 1, readInt, this, b2));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle4 = (Bundle) nn7.a(parcel, Bundle.CREATOR);
                nn7.d(parcel);
                ks3 b3 = ks3.b(bundle4);
                if (b3 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        L(b3);
                    } else {
                        new h15(Looper.getMainLooper(), (byte) 4).post(new yc2((Object) this, (Object) b3, (byte) 17));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                Bundle bundle5 = (Bundle) nn7.a(parcel, Bundle.CREATOR);
                int readInt2 = parcel.readInt();
                nn7.d(parcel);
                ks3 b4 = ks3.b(bundle5);
                if (b4 != null) {
                    rs3Var.getClass();
                    rs3.b();
                    ff2 c = rs3.c();
                    ArrayList arrayList = c.i;
                    b4.a();
                    if (!b4.b.isEmpty()) {
                        if ((readInt2 & 2) != 0 || !c.p) {
                            us3 us3Var = c.u;
                            if (us3Var != null && us3Var.b && c.h()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int size = arrayList.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                qs3 qs3Var = (qs3) arrayList.get(i3);
                                if (((readInt2 & 1) != 0 && qs3Var.c()) || ((z && !qs3Var.c() && qs3Var.a() != c.r) || !qs3Var.e(b4))) {
                                }
                            }
                        }
                        i2 = 1;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case 5:
                String readString = parcel.readString();
                nn7.d(parcel);
                zk3Var.b("select route with routeId = %s", readString);
                rs3Var.getClass();
                rs3.b();
                ArrayList arrayList2 = rs3.c().i;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        Object obj = arrayList2.get(i4);
                        i4++;
                        qs3 qs3Var2 = (qs3) obj;
                        if (qs3Var2.c.equals(readString)) {
                            zk3Var.b("media route is found and selected", new Object[0]);
                            qs3Var2.g(true);
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                rs3Var.getClass();
                rs3.b();
                qs3 qs3Var3 = rs3.c().v;
                if (qs3Var3 != null) {
                    qs3Var3.g(true);
                    parcel2.writeNoException();
                    return true;
                }
                ze0.m("There is no default route.  The media router has not yet been fully initialized.");
                return false;
            case 7:
                rs3Var.getClass();
                rs3.b();
                qs3 qs3Var4 = rs3.c().v;
                if (qs3Var4 != null) {
                    rs3.b();
                    boolean equals = rs3.c().g().c.equals(qs3Var4.c);
                    parcel2.writeNoException();
                    int i5 = nn7.a;
                    parcel2.writeInt(equals ? 1 : 0);
                    return true;
                }
                ze0.m("There is no default route.  The media router has not yet been fully initialized.");
                return false;
            case 8:
                String readString2 = parcel.readString();
                nn7.d(parcel);
                rs3Var.getClass();
                rs3.b();
                ArrayList arrayList3 = rs3.c().i;
                int size3 = arrayList3.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size3) {
                        Object obj2 = arrayList3.get(i6);
                        i6++;
                        qs3 qs3Var5 = (qs3) obj2;
                        if (qs3Var5.c.equals(readString2)) {
                            bundle = qs3Var5.s;
                        }
                    }
                }
                parcel2.writeNoException();
                if (bundle == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
                return true;
            case 9:
                rs3Var.getClass();
                rs3.b();
                String str = rs3.c().g().c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 11:
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        rs3Var.e((ls3) it2.next());
                    }
                }
                hashMap.clear();
                parcel2.writeNoException();
                return true;
            case 12:
                rs3Var.getClass();
                rs3.b();
                qs3 qs3Var6 = rs3.c().w;
                if (qs3Var6 != null) {
                    rs3.b();
                    if (rs3.c().g().c.equals(qs3Var6.c)) {
                        i2 = 1;
                    }
                }
                parcel2.writeNoException();
                int i7 = nn7.a;
                parcel2.writeInt(i2);
                return true;
            case 13:
                int readInt3 = parcel.readInt();
                nn7.d(parcel);
                rs3Var.getClass();
                rs3.g(readInt3);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString3 = parcel.readString();
                nn7.d(parcel);
                rs3Var.getClass();
                rs3.b();
                ArrayList e = rs3.c().e();
                int size4 = e.size();
                int i8 = 0;
                while (i8 < size4) {
                    Object obj3 = e.get(i8);
                    i8++;
                    ns3 ns3Var = (ns3) obj3;
                    if (ns3Var.c.equals(readString3)) {
                        zk3Var.b("clean up the connectedGroupRoute = %s", ns3Var);
                        rs3.b();
                        if (rs3.c().j.get(ns3Var.c) != null) {
                            ov3.d();
                            return false;
                        }
                    }
                }
                rs3.b();
                qs3 g = rs3.c().g();
                if (g != null && !g.h && g.c.equals(readString3)) {
                    zk3Var.b("clean up the selected route = %s", g);
                    rs3.g(0);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void L(ks3 ks3Var) {
        Set set = (Set) this.h.get(ks3Var);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f.e((ls3) it.next());
            }
        }
    }

    public final boolean M() {
        di0 di0Var;
        if (this.j && this.k && (di0Var = this.g) != null && di0Var.J) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [st3, java.lang.Object] */
    public final void N(st3 st3Var) {
        st3 st3Var2;
        this.f.getClass();
        rs3.b();
        ff2 c = rs3.c();
        if (st3Var != null) {
            c.getClass();
            ?? obj = new Object();
            obj.z = c;
            obj.x = st3Var;
            st3Var2 = obj;
        } else {
            st3Var2 = null;
        }
        st3 st3Var3 = c.C;
        if (st3Var3 != null) {
            st3Var3.g();
        }
        c.C = st3Var2;
        if (st3Var2 != null) {
            c.m();
        }
    }

    public final void O(ks3 ks3Var, int i) {
        Set set = (Set) this.h.get(ks3Var);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f.a(ks3Var, (ls3) it.next(), i);
            }
        }
    }
}
