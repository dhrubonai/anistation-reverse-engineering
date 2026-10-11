package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fu extends Handler {
    public final /* synthetic */ byte a;
    public final Object b;

    public fu(f15 f15Var) {
        this.a = (byte) 8;
        this.b = new WeakReference(f15Var);
    }

    private final void a(Message message) {
        kt3 kt3Var;
        jt3 jt3Var;
        fu fuVar;
        jt3 jt3Var2;
        if (message.what == 1) {
            synchronized (((jt3) this.b).b) {
                kt3Var = (kt3) ((jt3) this.b).c.get();
                jt3Var = (jt3) this.b;
                fuVar = (fu) jt3Var.e;
            }
            if (kt3Var != null) {
                nt3 nt3Var = (nt3) kt3Var;
                synchronized (nt3Var.d) {
                    jt3Var2 = nt3Var.h;
                }
                if (jt3Var == jt3Var2 && fuVar != null) {
                    ((jt3) this.b).getClass();
                }
            }
        }
    }

    private final void b(Message message) {
        mt3 mt3Var;
        jt3 jt3Var;
        fu fuVar;
        jt3 jt3Var2;
        if (message.what == 1) {
            synchronized (((jt3) this.b).b) {
                mt3Var = (mt3) ((jt3) this.b).c.get();
                jt3Var = (jt3) this.b;
                fuVar = (fu) jt3Var.e;
            }
            if (mt3Var != null) {
                synchronized (mt3Var.d) {
                    jt3Var2 = mt3Var.l;
                }
                if (jt3Var == jt3Var2 && fuVar != null) {
                }
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        i18 i18Var;
        Set set;
        cs3 cs3Var;
        cs3 cs3Var2;
        fs3 fs3Var;
        gu guVar = null;
        g15 g15Var = null;
        g15 g15Var2 = null;
        String str = null;
        String str2 = null;
        guVar = null;
        guVar = null;
        guVar = null;
        guVar = null;
        guVar = null;
        int i = 0;
        switch (this.a) {
            case 0:
                hu huVar = (hu) this.b;
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                AtomicReference atomicReference = huVar.A;
                                IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i2));
                                while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                                }
                            } else {
                                try {
                                    huVar.x.setParameters((Bundle) message.obj);
                                } catch (RuntimeException e) {
                                    AtomicReference atomicReference2 = huVar.A;
                                    while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
                                    }
                                }
                            }
                        } else {
                            huVar.B.f();
                        }
                    } else {
                        gu guVar2 = (gu) message.obj;
                        int i3 = guVar2.a;
                        MediaCodec.CryptoInfo cryptoInfo = guVar2.c;
                        long j = guVar2.d;
                        int i4 = guVar2.e;
                        try {
                            if (Build.VERSION.SDK_INT >= 31) {
                                huVar.x.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                            } else {
                                synchronized (hu.E) {
                                    huVar.x.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                                }
                            }
                        } catch (RuntimeException e2) {
                            AtomicReference atomicReference3 = huVar.A;
                            while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                            }
                        }
                        guVar = guVar2;
                    }
                } else {
                    gu guVar3 = (gu) message.obj;
                    try {
                        huVar.x.queueInputBuffer(guVar3.a, 0, guVar3.b, guVar3.d, guVar3.e);
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = huVar.A;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                    guVar = guVar3;
                }
                if (guVar != null) {
                    ArrayDeque arrayDeque = hu.D;
                    synchronized (arrayDeque) {
                        arrayDeque.add(guVar);
                    }
                    return;
                }
                return;
            case 1:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
                int i5 = message.what;
                if (i5 != 1) {
                    if (i5 == 2) {
                        b81 b81Var = (b81) this.b;
                        if (obj == b81Var.x && b81Var.i()) {
                            b81Var.x = null;
                            synchronized (b81Var.o) {
                                cn7 cn7Var = b81Var.y;
                                cn7Var.getClass();
                                i18Var = new i18((byte) 23);
                                ((jw2) cn7Var.x).g();
                                b81Var.y = null;
                            }
                            if (!(obj2 instanceof Exception) && !(obj2 instanceof NoSuchMethodError)) {
                                try {
                                    byte[] z = b81Var.b.z(b81Var.v, ((kq3) obj2).a);
                                    if (b81Var.w != null && z != null && z.length != 0) {
                                        b81Var.w = z;
                                    }
                                    b81Var.p = (byte) 4;
                                    l01 l01Var = b81Var.h;
                                    synchronized (l01Var.x) {
                                        set = l01Var.z;
                                    }
                                    Iterator it = set.iterator();
                                    while (it.hasNext()) {
                                        ((tp1) it.next()).a(i18Var);
                                    }
                                    return;
                                } catch (Exception | NoSuchMethodError e4) {
                                    b81Var.k(e4, true);
                                    return;
                                }
                            }
                            b81Var.k((Throwable) obj2, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                b81 b81Var2 = (b81) this.b;
                pz2 pz2Var = b81Var2.c;
                if (obj == b81Var2.z) {
                    if (b81Var2.p == 2 || b81Var2.i()) {
                        b81Var2.z = null;
                        if (obj2 instanceof Exception) {
                            pz2Var.x((Exception) obj2, false);
                            return;
                        }
                        try {
                            b81Var2.b.A(((kq3) obj2).a);
                            pz2Var.z = null;
                            HashSet hashSet = (HashSet) pz2Var.y;
                            nw2 o = nw2.o(hashSet);
                            hashSet.clear();
                            z62 listIterator = o.listIterator(0);
                            while (listIterator.hasNext()) {
                                b81 b81Var3 = (b81) listIterator.next();
                                if (b81Var3.l()) {
                                    b81Var3.h(true);
                                }
                            }
                            return;
                        } catch (Exception e5) {
                            pz2Var.x(e5, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                byte[] bArr = (byte[]) message.obj;
                if (bArr != null) {
                    ArrayList arrayList = ((e81) this.b).m;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj3 = arrayList.get(i6);
                        i6++;
                        b81 b81Var4 = (b81) obj3;
                        b81Var4.n();
                        if (Arrays.equals(b81Var4.v, bArr)) {
                            if (message.what == 2 && b81Var4.p == 4) {
                                String str3 = eq6.a;
                                b81Var4.h(false);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                int i7 = message.what;
                int i8 = message.arg1;
                Object obj4 = message.obj;
                Bundle peekData = message.peekData();
                SparseArray sparseArray = ((xr3) this.b).j;
                i15 i15Var = (i15) sparseArray.get(i8);
                if (i15Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i8);
                if (i7 != 3) {
                    if (i7 == 4) {
                        if (peekData != null) {
                            str2 = peekData.getString("error");
                        }
                        i15.a((Bundle) obj4, str2);
                        return;
                    }
                    return;
                }
                i15Var.b((Bundle) obj4);
                return;
            case 4:
                js3 js3Var = (js3) this.b;
                int i9 = message.what;
                if (i9 != 1) {
                    if (i9 == 2) {
                        js3Var.C = false;
                        js3Var.e(js3Var.B);
                        return;
                    }
                    return;
                }
                js3Var.E = false;
                i75 i75Var = js3Var.A;
                if (i75Var != null) {
                    u92 u92Var = js3Var.D;
                    ff2 ff2Var = (ff2) i75Var.y;
                    ps3 d = ff2Var.d(js3Var);
                    if (d != null) {
                        ff2Var.n(d, u92Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                b(message);
                return;
            case 6:
                a(message);
                return;
            case 7:
                dt3 dt3Var = (dt3) message.obj;
                st3 st3Var = (st3) this.b;
                if (st3Var.v(dt3Var)) {
                    ct3 ct3Var = dt3Var.e;
                    ct3Var.getClass();
                    ct3Var.onDisconnected();
                    st3Var.D(dt3Var);
                    return;
                }
                return;
            default:
                f15 f15Var = (f15) ((WeakReference) this.b).get();
                if (f15Var != null) {
                    SparseArray sparseArray2 = f15Var.h;
                    l15 l15Var = f15Var.i;
                    ArrayList arrayList2 = l15Var.H;
                    int i10 = message.what;
                    int i11 = message.arg1;
                    int i12 = message.arg2;
                    Object obj5 = message.obj;
                    Bundle peekData2 = message.peekData();
                    switch (i10) {
                        case 0:
                            if (i11 == f15Var.g) {
                                f15Var.g = 0;
                                if (l15Var.K == f15Var) {
                                    l15Var.k();
                                }
                            }
                            if (((i15) sparseArray2.get(i11)) != null) {
                                sparseArray2.remove(i11);
                                i15.a(null, null);
                                return;
                            }
                            return;
                        case 1:
                            return;
                        case 2:
                            if (obj5 == null || (obj5 instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj5;
                                if (f15Var.f == 0 && i11 == f15Var.g && i12 >= 1) {
                                    f15Var.g = 0;
                                    f15Var.f = i12;
                                    u92 a = u92.a(bundle);
                                    if (l15Var.K == f15Var) {
                                        l15Var.f(a);
                                    }
                                    if (l15Var.K == f15Var) {
                                        l15Var.L = true;
                                        int size2 = arrayList2.size();
                                        while (i < size2) {
                                            ((g15) arrayList2.get(i)).b(l15Var.K);
                                            i++;
                                        }
                                        ds3 ds3Var = l15Var.B;
                                        if (ds3Var != null) {
                                            f15 f15Var2 = l15Var.K;
                                            int i13 = f15Var2.d;
                                            f15Var2.d = i13 + 1;
                                            f15Var2.b(10, i13, 0, ds3Var.a, null);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 3:
                            if (obj5 == null || (obj5 instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj5;
                                i15 i15Var2 = (i15) sparseArray2.get(i11);
                                if (i15Var2 != null) {
                                    sparseArray2.remove(i11);
                                    i15Var2.b(bundle2);
                                    return;
                                }
                            }
                            break;
                        case 4:
                            if (obj5 == null || (obj5 instanceof Bundle)) {
                                if (peekData2 != null) {
                                    str = peekData2.getString("error");
                                }
                                Bundle bundle3 = (Bundle) obj5;
                                if (((i15) sparseArray2.get(i11)) != null) {
                                    sparseArray2.remove(i11);
                                    i15.a(bundle3, str);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (obj5 == null || (obj5 instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj5;
                                if (f15Var.f != 0) {
                                    u92 a2 = u92.a(bundle4);
                                    if (l15Var.K == f15Var) {
                                        l15Var.f(a2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 6:
                            if (obj5 instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj5;
                                i15 i15Var3 = (i15) sparseArray2.get(i11);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray2.remove(i11);
                                    i15Var3.b(bundle5);
                                    break;
                                } else {
                                    i15Var3.getClass();
                                    i15.a(bundle5, "DynamicGroupRouteController is created without valid route id.");
                                    break;
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                                break;
                            }
                        case 7:
                            if (obj5 == null || (obj5 instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj5;
                                if (f15Var.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    if (bundle7 != null) {
                                        cs3Var = new cs3(bundle7);
                                    } else {
                                        cs3Var = null;
                                    }
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList3 = new ArrayList();
                                    int size3 = parcelableArrayList.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        Object obj6 = parcelableArrayList.get(i14);
                                        i14++;
                                        Bundle bundle8 = (Bundle) obj6;
                                        if (bundle8 == null) {
                                            fs3Var = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            if (bundle9 != null) {
                                                cs3Var2 = new cs3(bundle9);
                                            } else {
                                                cs3Var2 = null;
                                            }
                                            int i15 = bundle8.getInt("selectionState", 1);
                                            bundle8.getBoolean("isUnselectable", false);
                                            bundle8.getBoolean("isGroupable", false);
                                            bundle8.getBoolean("isTransferable", false);
                                            fs3Var = new fs3(cs3Var2, i15);
                                        }
                                        arrayList3.add(fs3Var);
                                    }
                                    if (l15Var.K == f15Var) {
                                        int size4 = arrayList2.size();
                                        while (true) {
                                            if (i < size4) {
                                                Object obj7 = arrayList2.get(i);
                                                i++;
                                                g15 g15Var3 = (g15) obj7;
                                                if (g15Var3.a() == i12) {
                                                    g15Var2 = g15Var3;
                                                }
                                            }
                                        }
                                        if (g15Var2 instanceof j15) {
                                            ((j15) g15Var2).j(cs3Var, arrayList3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 8:
                            if (l15Var.K == f15Var) {
                                int size5 = arrayList2.size();
                                while (true) {
                                    if (i < size5) {
                                        Object obj8 = arrayList2.get(i);
                                        i++;
                                        g15 g15Var4 = (g15) obj8;
                                        if (g15Var4.a() == i12) {
                                            g15Var = g15Var4;
                                        }
                                    }
                                }
                                xv3 xv3Var = l15Var.M;
                                if (xv3Var != null && (g15Var instanceof hs3)) {
                                    hs3 hs3Var = (hs3) g15Var;
                                    ff2 ff2Var2 = (ff2) ((ui3) xv3Var.y).d;
                                    if (ff2Var2.e == hs3Var) {
                                        ff2Var2.j(ff2Var2.c(), 2, true);
                                    }
                                }
                                if (g15Var != null) {
                                    arrayList2.remove(g15Var);
                                    g15Var.c();
                                    l15Var.l();
                                    break;
                                }
                            }
                            break;
                    }
                    int i16 = l15.N;
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu(xr3 xr3Var) {
        super(Looper.getMainLooper());
        this.a = (byte) 3;
        this.b = xr3Var;
    }

    public fu(js3 js3Var) {
        this.a = (byte) 4;
        this.b = js3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu(Object obj, Looper looper, byte b) {
        super(looper);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu(Looper looper, st3 st3Var) {
        super(looper);
        this.a = (byte) 7;
        this.b = st3Var;
    }
}
