package defpackage;

import android.app.Activity;
import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class f05 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ f05(h05 h05Var, q44 q44Var, q44 q44Var2, List list, List list2, q44 q44Var3, List list3, q44 q44Var4, Set set) {
        this.x = (byte) 0;
        this.y = h05Var;
        this.z = q44Var;
        this.A = q44Var2;
        this.D = list;
        this.E = list2;
        this.B = q44Var3;
        this.F = list3;
        this.C = q44Var4;
        this.G = set;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        boolean D;
        pn6 pn6Var;
        int i;
        ft5 fj6Var;
        long j;
        List list;
        List list2;
        boolean z;
        byte b = 2;
        switch (this.x) {
            case 0:
                pn6 pn6Var2 = pn6.a;
                h05 h05Var = (h05) this.y;
                q44 q44Var = (q44) this.z;
                q44 q44Var2 = (q44) this.A;
                List list3 = (List) this.D;
                List list4 = (List) this.E;
                q44Var2 = (q44) this.B;
                list3 = (List) this.F;
                q44Var2 = (q44) this.C;
                Set set = (Set) this.G;
                long longValue = ((Long) obj).longValue();
                sx5 sx5Var = h05.z;
                synchronized (h05Var.c) {
                    D = h05Var.D();
                }
                if (D) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((kz) h05Var.a.z).t(new pb(longValue, b));
                        synchronized (mt5.c) {
                            q44 q44Var3 = mt5.j.h;
                            if (q44Var3 != null) {
                                if (q44Var3.h()) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            mt5.c();
                        }
                    } finally {
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    h05Var.O();
                    synchronized (h05Var.c) {
                        try {
                            z44 z44Var = h05Var.i;
                            Object[] objArr = z44Var.x;
                            int i2 = z44Var.z;
                            int i3 = 0;
                            while (i3 < i2) {
                                list3.add((vu0) objArr[i3]);
                                i3++;
                                b = b;
                            }
                            h05Var.i.h();
                        } finally {
                        }
                    }
                    q44Var.b();
                    while (true) {
                        if (!list3.isEmpty() || !list4.isEmpty()) {
                            pn6Var = pn6Var2;
                            try {
                                int size = list3.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    vu0 vu0Var = (vu0) list3.get(i4);
                                    vu0 M = h05Var.M(vu0Var, q44Var);
                                    if (M != null) {
                                        list3.add(M);
                                    }
                                    q44Var2.a(vu0Var);
                                }
                                list3.clear();
                                if (q44Var.h() || h05Var.i.z != 0) {
                                    synchronized (h05Var.c) {
                                        try {
                                            List H = h05Var.H();
                                            int size2 = H.size();
                                            for (int i5 = 0; i5 < size2; i5++) {
                                                vu0 vu0Var2 = (vu0) H.get(i5);
                                                if (!q44Var2.c(vu0Var2) && vu0Var2.x(set)) {
                                                    list3.add(vu0Var2);
                                                }
                                            }
                                            z44 z44Var2 = h05Var.i;
                                            int i6 = z44Var2.z;
                                            int i7 = 0;
                                            int i8 = 0;
                                            while (true) {
                                                Object[] objArr2 = z44Var2.x;
                                                if (i7 < i6) {
                                                    vu0 vu0Var3 = (vu0) objArr2[i7];
                                                    if (!q44Var2.c(vu0Var3) && !list3.contains(vu0Var3)) {
                                                        list3.add(vu0Var3);
                                                        i8++;
                                                    } else if (i8 > 0) {
                                                        Object[] objArr3 = z44Var2.x;
                                                        objArr3[i7 - i8] = objArr3[i7];
                                                    }
                                                    i7++;
                                                } else {
                                                    int i9 = i6 - i8;
                                                    Arrays.fill(objArr2, i9, i6, (Object) null);
                                                    z44Var2.z = i9;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                if (list3.isEmpty()) {
                                    try {
                                        g05.j(list4, h05Var);
                                        while (!list4.isEmpty()) {
                                            List L = h05Var.L(list4, q44Var);
                                            q44Var2.getClass();
                                            Iterator it = L.iterator();
                                            while (it.hasNext()) {
                                                q44Var2.k(it.next());
                                            }
                                            g05.j(list4, h05Var);
                                        }
                                    } catch (Throwable th) {
                                        h05Var.N(th, null);
                                        g05.i(h05Var, list3, list4, list3, q44Var2, q44Var2, q44Var, q44Var2);
                                    }
                                }
                                pn6Var2 = pn6Var;
                            } catch (Throwable th2) {
                                try {
                                    h05Var.N(th2, null);
                                    g05.i(h05Var, list3, list4, list3, q44Var2, q44Var2, q44Var, q44Var2);
                                    list3.clear();
                                } finally {
                                }
                            }
                        } else {
                            ft5 h = mt5.h();
                            if (h instanceof u44) {
                                fj6Var = new ej6((u44) h, null, null, true, false);
                                i = 0;
                            } else {
                                i = 0;
                                fj6Var = new fj6(h, null, true, false);
                            }
                            try {
                                ft5 j2 = fj6Var.j();
                                try {
                                    if (!list3.isEmpty()) {
                                        try {
                                            int size3 = list3.size();
                                            for (int i10 = i; i10 < size3; i10++) {
                                                q44Var2.a((vu0) list3.get(i10));
                                            }
                                            int size4 = list3.size();
                                            for (int i11 = i; i11 < size4; i11++) {
                                                ((vu0) list3.get(i11)).g();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                h05Var.N(th3, null);
                                                g05.i(h05Var, list3, list4, list3, q44Var2, q44Var2, q44Var, q44Var2);
                                                Trace.endSection();
                                                return pn6Var2;
                                            } finally {
                                            }
                                        }
                                    }
                                    if (q44Var2.h()) {
                                        try {
                                            q44Var2.j(q44Var2);
                                            Object[] objArr4 = q44Var2.b;
                                            long[] jArr = q44Var2.a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i12 = 0;
                                                j = 255;
                                                while (true) {
                                                    long j3 = jArr[i12];
                                                    Object[] objArr5 = objArr4;
                                                    pn6Var = pn6Var2;
                                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                                        for (int i14 = 0; i14 < i13; i14++) {
                                                            if ((j3 & 255) < 128) {
                                                                try {
                                                                    ((vu0) objArr5[(i12 << 3) + i14]).i();
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    try {
                                                                        h05Var.N(th, null);
                                                                        g05.i(h05Var, list3, list4, list3, q44Var2, q44Var2, q44Var, q44Var2);
                                                                        return pn6Var;
                                                                    } finally {
                                                                    }
                                                                }
                                                            }
                                                            j3 >>= 8;
                                                        }
                                                        if (i13 != 8) {
                                                        }
                                                    }
                                                    if (i12 != length) {
                                                        i12++;
                                                        pn6Var2 = pn6Var;
                                                        objArr4 = objArr5;
                                                    }
                                                }
                                            } else {
                                                pn6Var = pn6Var2;
                                                j = 255;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            pn6Var = pn6Var2;
                                        }
                                    } else {
                                        pn6Var = pn6Var2;
                                        j = 255;
                                    }
                                    if (q44Var2.h()) {
                                        try {
                                            Object[] objArr6 = q44Var2.b;
                                            long[] jArr2 = q44Var2.a;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i15 = 0;
                                                while (true) {
                                                    long j4 = jArr2[i15];
                                                    list = list3;
                                                    list2 = list4;
                                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                        for (int i17 = 0; i17 < i16; i17++) {
                                                            if ((j4 & j) < 128) {
                                                                try {
                                                                    ((vu0) objArr6[(i15 << 3) + i17]).j();
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    try {
                                                                        h05Var.N(th, null);
                                                                        g05.i(h05Var, list, list2, list3, q44Var2, q44Var2, q44Var, q44Var2);
                                                                        q44Var2.b();
                                                                        ft5.q(j2);
                                                                        return pn6Var;
                                                                    } finally {
                                                                    }
                                                                }
                                                            }
                                                            j4 >>= 8;
                                                        }
                                                        if (i16 != 8) {
                                                        }
                                                    }
                                                    if (i15 != length2) {
                                                        i15++;
                                                        list3 = list;
                                                        list4 = list2;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            list = list3;
                                            list2 = list4;
                                        }
                                    }
                                    fj6Var.c();
                                    synchronized (h05Var.c) {
                                        if (h05Var.C() != null) {
                                            eu0.a("unexpected to get continuation here");
                                        }
                                    }
                                    mt5.h().m();
                                    q44Var2.b();
                                    q44Var.b();
                                    h05Var.q = null;
                                    return pn6Var;
                                } finally {
                                    ft5.q(j2);
                                }
                            } finally {
                                fj6Var.c();
                            }
                        }
                    }
                } finally {
                }
                break;
            case 1:
                ub2 ub2Var = (ub2) this.y;
                Activity activity = (Activity) this.z;
                String str = (String) this.A;
                t55 t55Var = (t55) this.B;
                ei0 ei0Var = (ei0) this.C;
                String str2 = (String) this.D;
                String str3 = (String) this.E;
                String str4 = (String) this.F;
                w44 w44Var = (w44) this.G;
                uk4 uk4Var = (uk4) obj;
                uk4Var.getClass();
                if (!uk4Var.c) {
                    ub2Var.invoke(uk4Var);
                } else if (activity == null) {
                    si siVar = si.a;
                    si.a(str);
                } else {
                    Object obj2 = new Object();
                    lb5 lb5Var = new lb5(obj2, (Object) ei0Var, (byte) 22);
                    f05 f05Var = new f05(obj2, ei0Var, ub2Var, uk4Var, str2, str, str3, str4, w44Var, (byte) 2);
                    zn6 zn6Var = (zn6) t55Var;
                    zn6Var.getClass();
                    zn6Var.e(new wb(zn6Var, f05Var, activity, lb5Var, (byte) 8));
                }
                return pn6.a;
            default:
                r05 r05Var = (r05) this.y;
                ei0 ei0Var2 = (ei0) this.z;
                ub2 ub2Var2 = (ub2) this.A;
                uk4 uk4Var2 = (uk4) this.B;
                String str5 = (String) this.C;
                String str6 = (String) this.D;
                String str7 = (String) this.E;
                String str8 = (String) this.F;
                w44 w44Var2 = (w44) this.G;
                u55 u55Var = (u55) obj;
                u55Var.getClass();
                if (r05Var.x) {
                    ei0Var2.p0();
                }
                int ordinal = u55Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    si siVar2 = si.a;
                                    si.a(str8);
                                } else {
                                    ze0.l();
                                    return null;
                                }
                            } else {
                                si siVar3 = si.a;
                                si.a(str7);
                            }
                        } else {
                            si siVar4 = si.a;
                            si.a(str6);
                        }
                    } else {
                        si siVar5 = si.a;
                        si.a(str5);
                    }
                } else {
                    w44Var2.setValue(Boolean.TRUE);
                    ub2Var2.invoke(uk4Var2);
                }
                return pn6.a;
        }
    }

    public /* synthetic */ f05(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, String str3, w44 w44Var, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
        this.C = obj5;
        this.D = str;
        this.E = str2;
        this.F = str3;
        this.G = w44Var;
    }
}
