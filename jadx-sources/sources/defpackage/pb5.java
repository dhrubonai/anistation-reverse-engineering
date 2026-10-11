package defpackage;

import com.anistation.android.R;
import com.anistation.model.Resource;
import com.anistation.model.schedule.AnimeSchedule;
import com.anistation.navigation.Route;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class pb5 {
    public static final void a(vm6 vm6Var, af3 af3Var, List list, kc2 kc2Var, sb2 sb2Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean h;
        int i5;
        int i6;
        boolean h2;
        int i7;
        kd2Var.f0(-1321508055);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h2 = kd2Var.f(vm6Var);
            } else {
                h2 = kd2Var.h(vm6Var);
            }
            if (h2) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(af3Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h = kd2Var.f(list);
            } else {
                h = kd2Var.h(list);
            }
            if (h) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.h(kc2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.h(sb2Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        boolean z2 = false;
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            int i8 = i2;
            aj.a(Route.Schedule.INSTANCE, null, null, lz5.f(R.string.schedule, kd2Var), false, false, sb2Var, null, null, kd2Var, ((i8 << 6) & 3670016) | 6, 438);
            LocalDate localDate = vm6Var.a;
            if ((i8 & 7168) == 2048) {
                z2 = true;
            }
            Object Q = kd2Var.Q();
            if (z2 || Q == au0.a) {
                Q = new o0(kc2Var, (byte) 25);
                kd2Var.n0(Q);
            }
            v94.d(af3Var, list, localDate, (ic2) Q, kd2Var, (i8 >> 3) & 126);
            ov5.a(kd2Var, ar5.e(vz3.x, 8.0f));
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ms0(vm6Var, af3Var, list, kc2Var, sb2Var, i, (byte) 2);
        }
    }

    public static final void b(final vm6 vm6Var, final kc2 kc2Var, final ub2 ub2Var, final sb2 sb2Var, sb2 sb2Var2, af3 af3Var, kd2 kd2Var, int i) {
        af3 af3Var2;
        int i2;
        af3 a;
        af3 af3Var3;
        Object e05Var;
        int i3;
        q18 q18Var;
        boolean z;
        boolean z2;
        List<String> genres;
        boolean z3;
        kd2 kd2Var2 = kd2Var;
        w50 w50Var = pk2.K;
        tr trVar = x97.z;
        vm6Var.getClass();
        String str = vm6Var.d;
        Map map = vm6Var.e;
        kc2Var.getClass();
        sb2Var2.getClass();
        kd2Var2.f0(-2081256665);
        int i4 = i | (kd2Var2.h(vm6Var) ? 4 : 2) | (kd2Var2.h(kc2Var) ? 32 : 16) | (kd2Var2.h(ub2Var) ? 256 : 128) | (kd2Var2.h(sb2Var) ? 2048 : 1024) | (kd2Var2.h(sb2Var2) ? 16384 : 8192) | 65536;
        if (kd2Var2.V(i4 & 1, (74899 & i4) != 74898)) {
            kd2Var2.a0();
            if ((i & 1) != 0 && !kd2Var2.C()) {
                kd2Var2.Y();
                i2 = i4 & (-458753);
                a = af3Var;
            } else {
                i2 = i4 & (-458753);
                a = bf3.a(kd2Var2);
            }
            kd2Var2.r();
            final af3 a2 = bf3.a(kd2Var2);
            boolean booleanValue = ((Boolean) kd2Var2.j(ie6.d)).booleanValue();
            Route.Schedule schedule = Route.Schedule.INSTANCE;
            boolean f = kd2Var2.f(a);
            Object Q = kd2Var2.Q();
            int i5 = i2;
            q18 q18Var2 = au0.a;
            if (f || Q == q18Var2) {
                Q = new id0(a, null, (byte) 3);
                kd2Var2.n0(Q);
            }
            k66.a(schedule, (ub2) Q, kd2Var2, 6);
            Object Q2 = kd2Var2.Q();
            if (Q2 == q18Var2) {
                d13 d13Var = new d13(-4, 5, 1);
                ArrayList arrayList = new ArrayList(zo0.V(d13Var, 10));
                Iterator it = d13Var.iterator();
                while (true) {
                    if (!((e13) it).z) {
                        break;
                    }
                    arrayList.add(LocalDate.now().plusDays(r13.nextInt()));
                    a = a;
                }
                af3Var3 = a;
                kd2Var2.n0(arrayList);
                Q2 = arrayList;
            } else {
                af3Var3 = a;
            }
            final List list = (List) Q2;
            LocalDate localDate = vm6Var.a;
            int i6 = i5 & 14;
            boolean h = kd2Var2.h(list) | (i6 == 4 || kd2Var2.h(vm6Var)) | kd2Var2.f(a2);
            Object Q3 = kd2Var2.Q();
            if (h || Q3 == q18Var2) {
                i3 = i5;
                q18Var = q18Var2;
                z = booleanValue;
                e05Var = new e05(list, vm6Var, a2, null, (byte) 2);
                kd2Var2.n0(e05Var);
            } else {
                i3 = i5;
                e05Var = Q3;
                q18Var = q18Var2;
                z = booleanValue;
            }
            db.f((ic2) e05Var, kd2Var2, localDate);
            z22 z22Var = ar5.c;
            yz3 h2 = bx7.h(z22Var, ((mp0) kd2Var2.j(op0.a)).n, io3.h);
            vo3 c = b90.c(pk2.C, false);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, h2);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z4 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z4) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, c);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            Object obj = (Resource) map.get(str);
            if (obj == null) {
                obj = Resource.Idle.INSTANCE;
            }
            if (obj != null) {
                if (obj instanceof Resource.Success) {
                    kd2Var2.e0(-615746998);
                    Object obj2 = (Resource) map.get(str);
                    if (obj2 == null) {
                        obj2 = Resource.Idle.INSTANCE;
                    }
                    obj2.getClass();
                    List list2 = (List) ((Resource.Success) obj2).getData();
                    boolean f2 = kd2Var2.f(list2) | kd2Var2.g(z);
                    Object Q4 = kd2Var2.Q();
                    if (f2 || Q4 == q18Var) {
                        if (!z) {
                            if (list2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : list2) {
                                    AnimeSchedule animeSchedule = (AnimeSchedule) obj3;
                                    if (!animeSchedule.getAdult() && (genres = animeSchedule.getGenres()) != null && !genres.contains("Ecchi")) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                list2 = arrayList2;
                            } else {
                                list2 = null;
                            }
                        }
                        if (list2 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj4 : list2) {
                                AnimeSchedule animeSchedule2 = (AnimeSchedule) obj4;
                                if (vc2.b(animeSchedule2.getFormat(), animeSchedule2.getStatus())) {
                                    arrayList3.add(obj4);
                                }
                            }
                            Q4 = arrayList3;
                        } else {
                            Q4 = nt1.x;
                        }
                        kd2Var2.n0(Q4);
                    }
                    List list3 = (List) Q4;
                    if (list3.isEmpty()) {
                        kd2Var2.e0(-615130842);
                        h98.d(lz5.f(R.string.no_airing_shows, kd2Var2), lz5.f(R.string.there_are_no_anime_episodes_scheduled, kd2Var2), ar5.c, kd2Var2, 384, 0);
                        z3 = false;
                        kd2Var2.q(false);
                    } else {
                        kd2Var2.e0(-614781627);
                        boolean f3 = kd2Var2.f(list3);
                        Object Q5 = kd2Var2.Q();
                        if (f3 || Q5 == q18Var) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj5 : list3) {
                                String hourGroup = ((AnimeSchedule) obj5).getHourGroup();
                                Object obj6 = linkedHashMap.get(hourGroup);
                                if (obj6 == null) {
                                    obj6 = new ArrayList();
                                    linkedHashMap.put(hourGroup, obj6);
                                }
                                ((List) obj6).add(obj5);
                            }
                            Set entrySet = new TreeMap(linkedHashMap).entrySet();
                            entrySet.getClass();
                            Q5 = yo0.I0(entrySet);
                            kd2Var2.n0(Q5);
                        }
                        final List list4 = (List) Q5;
                        z22 z22Var2 = ar5.c;
                        boolean f4 = (i6 == 4 || kd2Var2.h(vm6Var)) | kd2Var2.f(a2) | kd2Var2.h(list) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | kd2Var2.h(list4) | ((i3 & 896) == 256);
                        Object Q6 = kd2Var2.Q();
                        if (f4 || Q6 == q18Var) {
                            ub2 ub2Var2 = new ub2() { // from class: nb5
                                @Override // defpackage.ub2
                                public final Object invoke(Object obj7) {
                                    pe3 pe3Var = (pe3) obj7;
                                    pe3Var.getClass();
                                    pe3.A0(pe3Var, "schedule-header", new os0(155987486, true, new w54(vm6Var, a2, list, kc2Var, sb2Var)), 2);
                                    oa5 oa5Var = new oa5((byte) 6);
                                    List list5 = list4;
                                    pe3Var.B0(list5.size(), new od(oa5Var, list5, (byte) 21), new eo(list5, (byte) 12), new os0(2039820996, true, new ob5(list5, list5, ub2Var, (byte) 0)));
                                    pe3.A0(pe3Var, "schedule-spacer", z51.g, 2);
                                    return pn6.a;
                                }
                            };
                            kd2Var2.n0(ub2Var2);
                            Q6 = ub2Var2;
                        }
                        n77.h(z22Var2, af3Var3, null, null, null, null, false, null, (ub2) Q6, kd2Var2, 6, 508);
                        z3 = false;
                        kd2Var2.q(false);
                    }
                    kd2Var2.q(z3);
                } else if (obj instanceof Resource.Error) {
                    kd2Var2.e0(-613094607);
                    Object obj7 = (Resource) map.get(str);
                    if (obj7 == null) {
                        obj7 = Resource.Idle.INSTANCE;
                    }
                    obj7.getClass();
                    Resource.Error error = (Resource.Error) obj7;
                    yz3 V = n77.V(z22Var, 0.0f, 0.0f, 0.0f, 5.0f, 7);
                    xp0 a3 = vp0.a(trVar, w50Var, kd2Var2, 0);
                    int hashCode2 = Long.hashCode(kd2Var2.T);
                    al4 l2 = kd2Var2.l();
                    yz3 E2 = o80.E(kd2Var2, V);
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(st0Var, kd2Var2, a3);
                    ss5.i(ys0Var, kd2Var2, l2);
                    h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
                    ss5.i(ys0Var2, kd2Var2, E2);
                    aj.a(Route.Schedule.INSTANCE, null, null, lz5.f(R.string.schedule, kd2Var2), false, false, sb2Var, null, null, kd2Var2, ((i3 << 9) & 3670016) | 6, 438);
                    zz.b(error.getMessage(), error.getStatus(), null, null, sb2Var2, kd2Var, i3 & 57344, 12);
                    kd2Var2 = kd2Var;
                    kd2Var2.q(true);
                    kd2Var2.q(false);
                } else {
                    ys0Var2 = ys0Var2;
                }
                z2 = true;
                kd2Var2.q(z2);
                af3Var2 = af3Var3;
            }
            kd2Var2.e0(-612312880);
            yz3 V2 = n77.V(z22Var, 0.0f, 0.0f, 0.0f, 95.0f, 7);
            xp0 a4 = vp0.a(trVar, w50Var, kd2Var2, 0);
            int hashCode3 = Long.hashCode(kd2Var2.T);
            al4 l3 = kd2Var2.l();
            yz3 E3 = o80.E(kd2Var2, V2);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a4);
            ss5.i(ys0Var, kd2Var2, l3);
            h11.q(hashCode3, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E3);
            a(vm6Var, a2, list, kc2Var, sb2Var, kd2Var2, 8 | i6 | ((i3 << 6) & 7168) | ((i3 << 3) & 57344));
            io3.a(null, 0, 0.0f, kd2Var, 0, 7);
            kd2Var2 = kd2Var;
            z2 = true;
            kd2Var2.q(true);
            kd2Var2.q(false);
            kd2Var2.q(z2);
            af3Var2 = af3Var3;
        } else {
            kd2Var2.Y();
            af3Var2 = af3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new is6(vm6Var, kc2Var, ub2Var, sb2Var, sb2Var2, af3Var2, i);
        }
    }
}
