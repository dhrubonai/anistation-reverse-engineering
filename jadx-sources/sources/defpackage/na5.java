package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class na5 {
    public static final y23 A;
    public static final ma5 B;
    public static final ma5 C;
    public static final ma5 D;
    public static final y23 a;
    public static final y23 b;
    public static final y23 c;
    public static final y23 d;
    public static final y23 e;
    public static final y23 f;
    public static final y23 g;
    public static final y23 h;
    public static final y23 i;
    public static final y23 j;
    public static final y23 k;
    public static final y23 l;
    public static final y23 m;
    public static final y23 n;
    public static final y23 o;
    public static final ma5 p;
    public static final ma5 q;
    public static final ma5 r;
    public static final ma5 s;
    public static final y23 t;
    public static final y23 u;
    public static final ma5 v;
    public static final ma5 w;
    public static final ma5 x;
    public static final y23 y;
    public static final y23 z;

    static {
        final byte b2 = 29;
        final byte b3 = 14;
        new y23(new wj3(b2), new rs4(b3), b3);
        final byte b4 = 6;
        final byte b5 = 26;
        a = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b4) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4(b5), b3);
        final byte b6 = 18;
        final byte b7 = 8;
        b = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b6) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5(b7), b3);
        final byte b8 = 25;
        final byte b9 = 10;
        c = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b8) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5(b9), b3);
        final byte b10 = 27;
        final byte b11 = 11;
        d = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b10) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5(b11), b3);
        final byte b12 = 4;
        e = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b12) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4((byte) 23), b3);
        final byte b13 = 15;
        f = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b13) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5(b12), b3);
        final byte b14 = 12;
        g = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b5) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5(b14), b3);
        final byte b15 = 28;
        final byte b16 = 13;
        h = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b15) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5(b16), b3);
        i = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b2) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4(b16), b3);
        final byte b17 = 0;
        j = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b17) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4(b13), b3);
        final byte b18 = 1;
        final byte b19 = 16;
        k = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b18) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4(b19), b3);
        final byte b20 = 2;
        l = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b20) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4((byte) 17), b3);
        final byte b21 = 3;
        m = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b21) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4(b6), b3);
        final byte b22 = 5;
        n = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b22) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4((byte) 19), b3);
        final byte b23 = 7;
        new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b23) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4((byte) 20), b3);
        o = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b7) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4((byte) 21), b3);
        p = new ma5(rs0.G, xd.J);
        final byte b24 = 9;
        q = new ma5(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b24) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4((byte) 22));
        r = new ma5(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b9) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4((byte) 24));
        s = new ma5(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b11) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4(b8));
        t = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b14) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4(b10), b3);
        u = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b16) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4(b15), b3);
        v = new ma5(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b3) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new rs4(b2));
        w = new ma5(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b19) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5(b17));
        final byte b25 = 17;
        x = new ma5(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b25) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5((byte) 1));
        final byte b26 = 19;
        y = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b26) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5((byte) 2), b3);
        final byte b27 = 20;
        z = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b27) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5(b21), b3);
        final byte b28 = 21;
        A = new y23(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b28) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5((byte) 5), b3);
        final byte b29 = 22;
        B = new ma5(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b29) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5((byte) 6));
        final byte b30 = 23;
        C = new ma5(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b30) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5((byte) 7));
        final byte b31 = 24;
        D = new ma5(new ic2() { // from class: ka5
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                oo ooVar;
                Object a2;
                boolean z2 = false;
                boolean z3 = false;
                switch (b31) {
                    case 0:
                        return Integer.valueOf(((g96) obj2).a);
                    case 1:
                        oc6 oc6Var = (oc6) obj2;
                        return te4.n(Float.valueOf(oc6Var.a), Float.valueOf(oc6Var.b));
                    case 2:
                        i95 i95Var = (i95) obj;
                        qc6 qc6Var = (qc6) obj2;
                        ee6 ee6Var = new ee6(qc6Var.a);
                        ma5 ma5Var = na5.v;
                        return te4.n(na5.a(ee6Var, ma5Var, i95Var), na5.a(new ee6(qc6Var.b), ma5Var, i95Var));
                    case 3:
                        return Integer.valueOf(((s92) obj2).x);
                    case 4:
                        uh3 uh3Var = (uh3) obj2;
                        return te4.n(uh3Var.a, na5.a(uh3Var.b, na5.i, (i95) obj));
                    case 5:
                        return Float.valueOf(((z30) obj2).a);
                    case 6:
                        i95 i95Var2 = (i95) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(na5.a((jo) list.get(i2), na5.b, i95Var2));
                        }
                        return arrayList;
                    case 7:
                        nd6 nd6Var = (nd6) obj2;
                        return te4.n(Integer.valueOf((int) (nd6Var.a >> 32)), Integer.valueOf((int) (nd6Var.a & 4294967295L)));
                    case 8:
                        i95 i95Var3 = (i95) obj;
                        km5 km5Var = (km5) obj2;
                        return te4.n(na5.a(new ep0(km5Var.a), na5.p, i95Var3), na5.a(new xc4(km5Var.b), na5.x, i95Var3), Float.valueOf(km5Var.c));
                    case 9:
                        return Integer.valueOf(((c86) obj2).a);
                    case 10:
                        return Integer.valueOf(((j96) obj2).a);
                    case 11:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 12:
                        return Integer.valueOf(((o92) obj2).a);
                    case 13:
                        return Integer.valueOf(((p92) obj2).a);
                    case 14:
                        i95 i95Var4 = (i95) obj;
                        ee6 ee6Var2 = (ee6) obj2;
                        long j2 = ee6.c;
                        if (ee6Var2 != null) {
                            z3 = ee6.a(ee6Var2.a, j2);
                        }
                        if (z3) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(ee6.c(ee6Var2.a)), na5.a(new fe6(ee6.b(ee6Var2.a)), na5.w, i95Var4));
                    case 15:
                        th3 th3Var = (th3) obj2;
                        return te4.n(th3Var.a, na5.a(th3Var.b, na5.i, (i95) obj));
                    case 16:
                        long j3 = ((fe6) obj2).a;
                        if (fe6.a(j3, 8589934592L)) {
                            return 0;
                        }
                        if (fe6.a(j3, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 17:
                        xc4 xc4Var = (xc4) obj2;
                        if (xc4Var != null) {
                            z2 = xc4.b(xc4Var.a, 9205357640488583168L);
                        }
                        if (z2) {
                            return Boolean.FALSE;
                        }
                        return te4.n(Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xc4Var.a & 4294967295L))));
                    case 18:
                        i95 i95Var5 = (i95) obj;
                        jo joVar = (jo) obj2;
                        Object obj3 = joVar.a;
                        if (obj3 instanceof hi4) {
                            ooVar = oo.x;
                        } else if (obj3 instanceof pv5) {
                            ooVar = oo.y;
                        } else if (obj3 instanceof zr6) {
                            ooVar = oo.z;
                        } else if (obj3 instanceof pp6) {
                            ooVar = oo.A;
                        } else if (obj3 instanceof uh3) {
                            ooVar = oo.B;
                        } else if (obj3 instanceof th3) {
                            ooVar = oo.C;
                        } else if (obj3 instanceof cz5) {
                            ooVar = oo.D;
                        } else {
                            ze0.d();
                            return null;
                        }
                        switch (ooVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                a2 = na5.a((hi4) obj3, na5.g, i95Var5);
                                break;
                            case 1:
                                obj3.getClass();
                                a2 = na5.a((pv5) obj3, na5.h, i95Var5);
                                break;
                            case 2:
                                obj3.getClass();
                                a2 = na5.a((zr6) obj3, na5.c, i95Var5);
                                break;
                            case 3:
                                obj3.getClass();
                                a2 = na5.a((pp6) obj3, na5.d, i95Var5);
                                break;
                            case 4:
                                obj3.getClass();
                                a2 = na5.a((uh3) obj3, na5.e, i95Var5);
                                break;
                            case 5:
                                obj3.getClass();
                                a2 = na5.a((th3) obj3, na5.f, i95Var5);
                                break;
                            case 6:
                                obj3.getClass();
                                a2 = ((cz5) obj3).a;
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        return te4.n(ooVar, a2, Integer.valueOf(joVar.b), Integer.valueOf(joVar.c), joVar.d);
                    case 19:
                        i95 i95Var6 = (i95) obj;
                        List list2 = ((fk3) obj2).x;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(na5.a((ek3) list2.get(i3), na5.z, i95Var6));
                        }
                        return arrayList2;
                    case 20:
                        return ((ek3) obj2).a.toLanguageTag();
                    case 21:
                        i95 i95Var7 = (i95) obj;
                        lh3 lh3Var = (lh3) obj2;
                        return te4.n(na5.a(new ih3(lh3Var.a), na5.B, i95Var7), na5.a(new kh3(lh3Var.b), na5.C, i95Var7), na5.a(new jh3(lh3Var.c), na5.D, i95Var7));
                    case 22:
                        return Float.valueOf(((ih3) obj2).a);
                    case 23:
                        return Integer.valueOf(((kh3) obj2).a);
                    case 24:
                        return Integer.valueOf(((jh3) obj2).a);
                    case 25:
                        return ((zr6) obj2).a;
                    case 26:
                        i95 i95Var8 = (i95) obj;
                        hi4 hi4Var = (hi4) obj2;
                        Object a3 = na5.a(new c86(hi4Var.a), na5.q, i95Var8);
                        Object a4 = na5.a(new j96(hi4Var.b), na5.r, i95Var8);
                        Object a5 = na5.a(new ee6(hi4Var.c), na5.v, i95Var8);
                        qc6 qc6Var2 = hi4Var.d;
                        qc6 qc6Var3 = qc6.c;
                        Object a6 = na5.a(qc6Var2, na5.l, i95Var8);
                        Object a7 = na5.a(hi4Var.e, m37.f, i95Var8);
                        lh3 lh3Var2 = hi4Var.f;
                        lh3 lh3Var3 = lh3.d;
                        return te4.n(a3, a4, a5, a6, a7, na5.a(lh3Var2, na5.A, i95Var8), na5.a(new fh3(hi4Var.g), m37.h, i95Var8), na5.a(new zs2(hi4Var.h), na5.s, i95Var8), na5.a(hi4Var.i, m37.i, i95Var8));
                    case 27:
                        return ((pp6) obj2).a;
                    case 28:
                        i95 i95Var9 = (i95) obj;
                        pv5 pv5Var = (pv5) obj2;
                        ep0 ep0Var = new ep0(pv5Var.a.a());
                        ma5 ma5Var2 = na5.p;
                        Object a8 = na5.a(ep0Var, ma5Var2, i95Var9);
                        ee6 ee6Var3 = new ee6(pv5Var.b);
                        ma5 ma5Var3 = na5.v;
                        Object a9 = na5.a(ee6Var3, ma5Var3, i95Var9);
                        s92 s92Var = pv5Var.c;
                        s92 s92Var2 = s92.y;
                        Object a10 = na5.a(s92Var, na5.m, i95Var9);
                        Object a11 = na5.a(pv5Var.d, na5.t, i95Var9);
                        Object a12 = na5.a(pv5Var.e, na5.u, i95Var9);
                        String str = pv5Var.g;
                        Object a13 = na5.a(new ee6(pv5Var.h), ma5Var3, i95Var9);
                        Object a14 = na5.a(pv5Var.i, na5.n, i95Var9);
                        Object a15 = na5.a(pv5Var.j, na5.k, i95Var9);
                        fk3 fk3Var = pv5Var.k;
                        fk3 fk3Var2 = fk3.z;
                        Object a16 = na5.a(fk3Var, na5.y, i95Var9);
                        Object a17 = na5.a(new ep0(pv5Var.l), ma5Var2, i95Var9);
                        Object a18 = na5.a(pv5Var.m, na5.j, i95Var9);
                        km5 km5Var2 = pv5Var.n;
                        km5 km5Var3 = km5.d;
                        return te4.n(a8, a9, a10, a11, a12, -1, str, a13, a14, a15, a16, a17, a18, na5.a(km5Var2, na5.o, i95Var9));
                    default:
                        i95 i95Var10 = (i95) obj;
                        id6 id6Var = (id6) obj2;
                        pv5 pv5Var2 = id6Var.a;
                        y23 y23Var = na5.h;
                        return te4.n(na5.a(pv5Var2, y23Var, i95Var10), na5.a(id6Var.b, y23Var, i95Var10), na5.a(id6Var.c, y23Var, i95Var10), na5.a(id6Var.d, y23Var, i95Var10));
                }
            }
        }, new la5((byte) 9));
    }

    public static final Object a(Object obj, ja5 ja5Var, i95 i95Var) {
        Object u2;
        if (obj != null && (u2 = ja5Var.u(i95Var, obj)) != null) {
            return u2;
        }
        return Boolean.FALSE;
    }
}
