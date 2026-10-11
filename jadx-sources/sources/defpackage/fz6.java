package defpackage;

import com.anistation.android.R;
import com.anistation.model.Episode;
import com.anistation.model.Info;
import com.anistation.model.Resource;
import com.anistation.model.connectivity.NetworkState;
import com.anistation.model.watch.WatchSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class fz6 {
    public static final void a(final boolean z, final af3 af3Var, final Integer num, final float f, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        kd2Var.f0(864316528);
        if (kd2Var.g(z)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i6 = i | i2;
        if (kd2Var.f(af3Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i7 = i6 | i3;
        if (kd2Var.f(num)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (kd2Var.c(f)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i9 & 1, z2)) {
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = db.L(kd2Var);
                kd2Var.n0(Q);
            }
            v11 v11Var = (v11) Q;
            iv1 b = dv1.b(z51.V(150, 6, null), 2);
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                Q2 = new dr6((byte) 15);
                kd2Var.n0(Q2);
            }
            Map map = sw6.a;
            iv1 a = b.a(dv1.e(z51.O(0.0f, 400.0f, new c13(4294967297L), 1), (ub2) Q2));
            rx1 c = dv1.c(z51.V(150, 6, null), 2);
            Object Q3 = kd2Var.Q();
            if (Q3 == q18Var) {
                Q3 = new dr6((byte) 16);
                kd2Var.n0(Q3);
            }
            te4.c(z, n77.V(n90.a.a(vz3.x, pk2.F), 0.0f, 0.0f, 0.0f, f + 16.0f, 7), a, c.a(dv1.f(z51.O(0.0f, 400.0f, new c13(4294967297L), 1), (ub2) Q3)), null, nx7.R(-716457144, new ao((Object) num, (Object) v11Var, (Object) af3Var, (byte) 12), kd2Var), kd2Var, ((i9 >> 3) & 14) | 200064, 16);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(z, af3Var, num, f, i) { // from class: ty6
                public final /* synthetic */ float A;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ af3 y;
                public final /* synthetic */ Integer z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(7);
                    fz6.a(this.x, this.y, this.z, this.A, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x063c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.ym6 r59, final com.anistation.model.watch.WatchSession r60, final boolean r61, final boolean r62, final boolean r63, final boolean r64, final com.anistation.model.connectivity.NetworkState r65, final defpackage.n17 r66, final defpackage.ub2 r67, final defpackage.ub2 r68, final defpackage.ub2 r69, final defpackage.ub2 r70, final defpackage.ub2 r71, final defpackage.ub2 r72, final defpackage.ub2 r73, final defpackage.ub2 r74, final defpackage.ub2 r75, final defpackage.sb2 r76, final defpackage.ub2 r77, final defpackage.sb2 r78, final defpackage.ic2 r79, final defpackage.ub2 r80, final defpackage.jc2 r81, final defpackage.ub2 r82, final defpackage.ub2 r83, final defpackage.ub2 r84, final boolean r85, final float r86, final float r87, final float r88, final float r89, final float r90, final float r91, defpackage.kd2 r92, final int r93) {
        /*
            Method dump skipped, instructions count: 2621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz6.b(ym6, com.anistation.model.watch.WatchSession, boolean, boolean, boolean, boolean, com.anistation.model.connectivity.NetworkState, n17, ub2, ub2, ub2, ub2, ub2, ub2, ub2, ub2, ub2, sb2, ub2, sb2, ic2, ub2, jc2, ub2, ub2, ub2, boolean, float, float, float, float, float, float, kd2, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(pe3 pe3Var, final List list, final ym6 ym6Var, final WatchSession watchSession, float f, ub2 ub2Var, int i, float f2, boolean z, final NetworkState networkState, final List list2, final qi4 qi4Var, final w44 w44Var, final List list3, final String str, final w44 w44Var2, final qi4 qi4Var2, final Integer num, final ub2 ub2Var2) {
        pe3.C0(pe3Var, "watch-tabs", new os0(204499435, true, new kc2() { // from class: py6
            @Override // defpackage.kc2
            public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                boolean z2;
                List list4;
                ((Integer) obj2).getClass();
                kd2 kd2Var = (kd2) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((zc3) obj).getClass();
                if ((intValue & 129) != 128) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var.V(intValue & 1, z2)) {
                    Object Q = kd2Var.Q();
                    Object obj5 = au0.a;
                    if (Q == obj5) {
                        Q = new we1(qi4Var2, (byte) 5);
                        kd2Var.n0(Q);
                    }
                    yz3 D = m37.D(vz3.x, (ub2) Q);
                    if (NetworkState.this == NetworkState.Offline && !(ym6Var.u instanceof Resource.Success)) {
                        kd2Var.e0(-1044530828);
                        list4 = te4.H(lz5.f(R.string.episodes, kd2Var));
                        kd2Var.q(false);
                    } else {
                        kd2Var.e0(-1044529361);
                        kd2Var.q(false);
                        list4 = list2;
                    }
                    List list5 = list4;
                    qi4 qi4Var3 = qi4Var;
                    int h = qi4Var3.h();
                    w44 w44Var3 = w44Var;
                    boolean booleanValue = ((Boolean) w44Var3.getValue()).booleanValue();
                    boolean f3 = kd2Var.f(qi4Var3);
                    Object Q2 = kd2Var.Q();
                    if (f3 || Q2 == obj5) {
                        Q2 = new we1(qi4Var3, (byte) 6);
                        kd2Var.n0(Q2);
                    }
                    ub2 ub2Var3 = (ub2) Q2;
                    boolean f4 = kd2Var.f(w44Var3);
                    Object Q3 = kd2Var.Q();
                    if (f4 || Q3 == obj5) {
                        Q3 = new ef(w44Var3, (byte) 21);
                        kd2Var.n0(Q3);
                    }
                    ub2 ub2Var4 = (ub2) Q3;
                    w44 w44Var4 = w44Var2;
                    boolean f5 = kd2Var.f(w44Var4);
                    Object Q4 = kd2Var.Q();
                    if (f5 || Q4 == obj5) {
                        Q4 = new ef(w44Var4, (byte) 22);
                        kd2Var.n0(Q4);
                    }
                    xt5.b(list5, h, ub2Var3, ub2Var4, list3, str, (ub2) Q4, D, booleanValue, kd2Var, 12582912);
                } else {
                    kd2Var.Y();
                }
                return pn6.a;
            }
        }), 2);
        int h = qi4Var.h();
        byte b = 3;
        if (h != 0) {
            List list4 = nt1.x;
            List list5 = null;
            List list6 = null;
            List list7 = null;
            if (h != 1) {
                if (h != 2) {
                    if (h == 3) {
                        Resource resource = ym6Var.u;
                        if (resource instanceof Resource.Success) {
                            Info info = (Info) ((Resource.Success) resource).getData();
                            if (info != null) {
                                list6 = info.getRecommendations();
                            }
                            if (list6 != null) {
                                list4 = list6;
                            }
                            o80.I(pe3Var, "watch-recommendations", list4, i, f2, 0.0f, new vm1(f), z, ub2Var);
                        }
                    }
                } else {
                    Resource resource2 = ym6Var.u;
                    if (resource2 instanceof Resource.Success) {
                        Info info2 = (Info) ((Resource.Success) resource2).getData();
                        if (info2 != null) {
                            list7 = info2.getRelations();
                        }
                        if (list7 != null) {
                            list4 = list7;
                        }
                        io3.f0(pe3Var, "watch-related", list4, i, f2, 0.0f, new vm1(f), z, ub2Var);
                    }
                }
            } else {
                Resource resource3 = ym6Var.u;
                if (resource3 instanceof Resource.Success) {
                    Info info3 = (Info) ((Resource.Success) resource3).getData();
                    if (info3 != null) {
                        list5 = info3.getWatchOrder();
                    }
                    if (list5 != null) {
                        list4 = list5;
                    }
                    it5.g(pe3Var, "watch-order", list4, watchSession.getAnimeId(), 0.0f, new vm1(f), ub2Var);
                }
            }
        } else if (list.isEmpty()) {
            pe3.A0(pe3Var, "watch-episodes-empty", new os0(1646284978, true, new xz4(f, b)), 2);
        } else {
            pe3Var.B0(list.size(), new pp5((Object) list, (byte) 17), xd.H, new os0(-1756228028, true, new kc2() { // from class: qy6
                /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x00a9 A[SYNTHETIC] */
                @Override // defpackage.kc2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object e(java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
                    /*
                        Method dump skipped, instructions count: 283
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.qy6.e(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }));
            pe3.A0(pe3Var, "watch-content-episodes-spacer", v94.j, 2);
        }
        pe3.A0(pe3Var, "watch-spacer", v94.k, 2);
    }

    public static final String d(List list) {
        if (list.isEmpty()) {
            return "";
        }
        int number = ((Episode) yo0.k0(list)).getNumber();
        int number2 = ((Episode) yo0.r0(list)).getNumber();
        if (number == number2) {
            return String.valueOf(number);
        }
        return number + "-" + number2;
    }

    public static final boolean e(af3 af3Var, int i) {
        Object obj;
        int i2;
        ue3 j = af3Var.j();
        Iterator it = j.l.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ve3) obj).a == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ve3 ve3Var = (ve3) obj;
        if (ve3Var != null && (i2 = ve3Var.o) >= j.m && i2 + ve3Var.p <= j.n) {
            return true;
        }
        return false;
    }
}
