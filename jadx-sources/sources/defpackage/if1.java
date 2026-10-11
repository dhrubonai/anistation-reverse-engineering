package defpackage;

import com.anistation.android.R;
import com.anistation.model.Episode;
import com.anistation.model.Info;
import com.anistation.model.Resource;
import com.anistation.model.animelist.WatchStatus;
import com.anistation.model.library.AnimeListItem;
import com.anistation.model.watch.WatchSession;
import com.anistation.navigation.Route;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class if1 {
    public static final void a(final zm6 zm6Var, final float f, final ub2 ub2Var, final ub2 ub2Var2, final sb2 sb2Var, final jc2 jc2Var, final kc2 kc2Var, sb2 sb2Var2, final sb2 sb2Var3, final sb2 sb2Var4, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        sb2 sb2Var5;
        zm6 zm6Var2;
        List list;
        Resource.Success success;
        Resource.Success success2;
        List list2;
        boolean z2;
        boolean z3;
        int i12;
        boolean z4;
        final List list3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        kd2 kd2Var2 = kd2Var;
        zm6Var.getClass();
        AnimeListItem animeListItem = zm6Var.f;
        Object obj = zm6Var.a;
        jc2Var.getClass();
        kc2Var.getClass();
        sb2Var2.getClass();
        sb2Var3.getClass();
        kd2Var2.f0(-1422624035);
        if (kd2Var2.h(zm6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i13 = i | i2;
        if (kd2Var2.c(f)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i14 = i13 | i3;
        if (kd2Var2.h(ub2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i15 = i14 | i4;
        if (kd2Var2.h(ub2Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i16 = i15 | i5;
        if (kd2Var2.h(sb2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i17 = i16 | i6;
        if (kd2Var2.h(jc2Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i18 = i17 | i7;
        if (kd2Var2.h(kc2Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i19 = i18 | i8;
        if (kd2Var2.h(sb2Var2)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i20 = i19 | i9;
        if (kd2Var2.h(sb2Var3)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i21 = i20 | i10;
        if (kd2Var2.h(sb2Var4)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i22 = i21 | i11;
        if ((i22 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i22 & 1, z)) {
            final boolean booleanValue = ((Boolean) kd2Var2.j(ie6.d)).booleanValue();
            List I = te4.I(lz5.f(R.string.home, kd2Var2), lz5.f(R.string.episodes, kd2Var2), lz5.f(R.string.watch_order, kd2Var2), lz5.f(R.string.related, kd2Var2), lz5.f(R.string.more_like_this, kd2Var2));
            Object[] objArr = new Object[0];
            Object Q = kd2Var2.Q();
            Object obj2 = au0.a;
            if (Q == obj2) {
                Q = new zu0((byte) 26);
                kd2Var2.n0(Q);
            }
            final w44 w44Var = (w44) oi4.B(objArr, (sb2) Q, kd2Var2);
            Object[] objArr2 = new Object[0];
            Object Q2 = kd2Var2.Q();
            if (Q2 == obj2) {
                list = I;
                Q2 = new zu0((byte) 27);
                kd2Var2.n0(Q2);
            } else {
                list = I;
            }
            final qi4 qi4Var = (qi4) oi4.B(objArr2, (sb2) Q2, kd2Var2);
            boolean f2 = kd2Var2.f(obj);
            Object Q3 = kd2Var2.Q();
            if (f2 || Q3 == obj2) {
                if (obj instanceof Resource.Success) {
                    success = (Resource.Success) obj;
                } else {
                    success = null;
                }
                if (success != null) {
                    Q3 = (Info) success.getData();
                } else {
                    Q3 = null;
                }
                kd2Var2.n0(Q3);
            }
            final Info info = (Info) Q3;
            Object Q4 = kd2Var2.Q();
            if (Q4 == obj2) {
                Q4 = xt5.g(Boolean.FALSE);
                kd2Var2.n0(Q4);
            }
            final w44 w44Var2 = (w44) Q4;
            final af3 a = bf3.a(kd2Var2);
            Resource resource = zm6Var.b;
            if (resource instanceof Resource.Success) {
                success2 = (Resource.Success) resource;
            } else {
                success2 = null;
            }
            if (success2 != null) {
                list2 = (List) success2.getData();
            } else {
                list2 = null;
            }
            Object Q5 = kd2Var2.Q();
            if (Q5 == obj2) {
                Q5 = xt5.g("1-100");
                kd2Var2.n0(Q5);
            }
            final w44 w44Var3 = (w44) Q5;
            List list4 = list2;
            List list5 = zm6Var.e;
            int i23 = i22 & 14;
            if (i23 != 4 && !kd2Var2.h(zm6Var)) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean h = z2 | kd2Var2.h(info);
            int i24 = i22 & 3670016;
            if (i24 == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z9 = h | z3;
            Object Q6 = kd2Var2.Q();
            if (!z9 && Q6 != obj2) {
                i12 = i24;
            } else {
                i12 = i24;
                Q6 = new hf1(zm6Var, info, kc2Var, null);
                kd2Var2.n0(Q6);
            }
            db.h(obj, animeListItem, list5, (ic2) Q6, kd2Var2);
            z22 z22Var = ar5.c;
            yz3 h2 = bx7.h(z22Var, ((mp0) kd2Var2.j(op0.a)).n, io3.h);
            vo3 c = b90.c(pk2.C, false);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, h2);
            tt0.d.getClass();
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(za3.p0);
            } else {
                kd2Var2.q0();
            }
            ss5.i(p7.F, kd2Var2, c);
            ss5.i(p7.E, kd2Var2, l);
            ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
            ss5.h(kd2Var2);
            ss5.i(p7.D, kd2Var2, E);
            kd2Var2.e0(1176349767);
            if (obj == null) {
                zm6Var2 = zm6Var;
                z4 = false;
            } else {
                if (obj instanceof Resource.Success) {
                    kd2Var2.e0(1176387152);
                    final Info info2 = (Info) ((Resource.Success) obj).getData();
                    if (info2 == null) {
                        kd2Var2.e0(1176171857);
                        c(f, sb2Var, sb2Var4, bx7.c, kd2Var2, ((i22 >> 3) & 14) | 3072 | ((i22 >> 9) & 112) | ((i22 >> 21) & 896));
                        kd2Var2.q(false);
                        kd2Var2.q(false);
                        kd2Var2.q(false);
                        sb2Var5 = sb2Var2;
                        kd2Var2 = kd2Var2;
                        zm6Var2 = zm6Var;
                        z8 = true;
                        kd2Var2.q(z8);
                    } else {
                        kd2Var2.e0(1176615839);
                        kd2Var2.q(false);
                        if (list4 == null) {
                            list3 = nt1.x;
                        } else {
                            list3 = list4;
                        }
                        final int size = list3.size();
                        int i25 = i12;
                        final List list6 = list;
                        WatchStatus watchStatus = null;
                        x97.b(z22Var, null, nx7.R(539351345, new jc2() { // from class: cf1
                            @Override // defpackage.jc2
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                boolean z10;
                                int i26;
                                p90 p90Var = (p90) obj3;
                                kd2 kd2Var3 = (kd2) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                p90Var.getClass();
                                int i27 = 2;
                                if ((intValue & 6) == 0) {
                                    if (kd2Var3.f(p90Var)) {
                                        i26 = 4;
                                    } else {
                                        i26 = 2;
                                    }
                                    intValue |= i26;
                                }
                                boolean z11 = false;
                                if ((intValue & 19) != 18) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (kd2Var3.V(intValue & 1, z10)) {
                                    ud1 ud1Var = (ud1) kd2Var3.j(bv0.h);
                                    Object Q7 = kd2Var3.Q();
                                    Object obj6 = au0.a;
                                    if (Q7 == obj6) {
                                        Q7 = new qi4(0);
                                        kd2Var3.n0(Q7);
                                    }
                                    final qi4 qi4Var2 = (qi4) Q7;
                                    Object Q8 = kd2Var3.Q();
                                    if (Q8 == obj6) {
                                        Q8 = new qi4(0);
                                        kd2Var3.n0(Q8);
                                    }
                                    final qi4 qi4Var3 = (qi4) Q8;
                                    Object Q9 = kd2Var3.Q();
                                    if (Q9 == obj6) {
                                        Q9 = new qi4(0);
                                        kd2Var3.n0(Q9);
                                    }
                                    final qi4 qi4Var4 = (qi4) Q9;
                                    final float f3 = ((vm1) db.y(new vm1(((p90Var.b() - f) - ud1Var.T(qi4Var4.h() + (qi4Var3.h() + qi4Var2.h()))) - 10.0f), new vm1(0.0f))).x;
                                    if (vm1.b(p90Var.c(), 840.0f) >= 0) {
                                        z11 = true;
                                    }
                                    if (vm1.b(p90Var.c(), 840.0f) >= 0) {
                                        i27 = 5;
                                    } else if (vm1.b(p90Var.c(), 600.0f) >= 0) {
                                        i27 = 4;
                                    }
                                    final float c2 = ((p90Var.c() - 20.0f) - ((i27 - 1) * 10.0f)) / i27;
                                    z22 z22Var2 = ar5.c;
                                    vh4 k = n77.k(0.0f, 0.0f, 0.0f, 10.0f, 7);
                                    final sb2 sb2Var6 = sb2Var;
                                    boolean f4 = kd2Var3.f(sb2Var6);
                                    final sb2 sb2Var7 = sb2Var4;
                                    boolean f5 = f4 | kd2Var3.f(sb2Var7);
                                    final Info info3 = info2;
                                    boolean h3 = f5 | kd2Var3.h(info3);
                                    final zm6 zm6Var3 = zm6Var;
                                    boolean h4 = h3 | kd2Var3.h(zm6Var3) | kd2Var3.g(z11);
                                    final int i28 = size;
                                    boolean d = h4 | kd2Var3.d(i28);
                                    final jc2 jc2Var2 = jc2Var;
                                    boolean f6 = d | kd2Var3.f(jc2Var2);
                                    final Info info4 = info;
                                    boolean h5 = f6 | kd2Var3.h(info4);
                                    final ub2 ub2Var3 = ub2Var2;
                                    boolean f7 = h5 | kd2Var3.f(ub2Var3);
                                    final List list7 = list3;
                                    boolean h6 = f7 | kd2Var3.h(list7);
                                    final List list8 = list6;
                                    boolean f8 = h6 | kd2Var3.f(list8);
                                    final qi4 qi4Var5 = qi4Var;
                                    boolean f9 = f8 | kd2Var3.f(qi4Var5);
                                    final w44 w44Var4 = w44Var;
                                    boolean f10 = f9 | kd2Var3.f(w44Var4) | kd2Var3.c(f3);
                                    final sb2 sb2Var8 = sb2Var3;
                                    boolean f11 = f10 | kd2Var3.f(sb2Var8);
                                    final ub2 ub2Var4 = ub2Var;
                                    boolean f12 = f11 | kd2Var3.f(ub2Var4) | kd2Var3.d(i27) | kd2Var3.c(c2);
                                    final boolean z12 = booleanValue;
                                    boolean g = f12 | kd2Var3.g(z12);
                                    Object Q10 = kd2Var3.Q();
                                    if (g || Q10 == obj6) {
                                        final w44 w44Var5 = w44Var2;
                                        final w44 w44Var6 = w44Var3;
                                        final int i29 = i27;
                                        final boolean z13 = z11;
                                        Object obj7 = new ub2() { // from class: bf1
                                            /* JADX WARN: Code restructure failed: missing block: B:59:0x0241, code lost:
                                            
                                                if (r0 == null) goto L65;
                                             */
                                            /* JADX WARN: Removed duplicated region for block: B:62:0x024d  */
                                            /* JADX WARN: Removed duplicated region for block: B:64:0x0259  */
                                            @Override // defpackage.ub2
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct add '--show-bad-code' argument
                                            */
                                            public final java.lang.Object invoke(java.lang.Object r31) {
                                                /*
                                                    Method dump skipped, instructions count: 766
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.bf1.invoke(java.lang.Object):java.lang.Object");
                                            }
                                        };
                                        kd2Var3.n0(obj7);
                                        Q10 = obj7;
                                    }
                                    n77.h(z22Var2, af3.this, k, null, null, null, false, null, (ub2) Q10, kd2Var3, 390, 504);
                                } else {
                                    kd2Var3.Y();
                                }
                                return pn6.a;
                            }
                        }, kd2Var), kd2Var, 3078, 6);
                        boolean booleanValue2 = ((Boolean) w44Var2.getValue()).booleanValue();
                        if (animeListItem != null) {
                            watchStatus = animeListItem.getWatchStatus();
                        }
                        boolean h3 = kd2Var.h(info);
                        if (i23 != 4 && !kd2Var.h(zm6Var)) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        boolean z10 = h3 | z5;
                        if (i25 == 1048576) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean z11 = z10 | z6;
                        if ((i22 & 458752) == 131072) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean z12 = z11 | z7;
                        Object Q7 = kd2Var.Q();
                        if (!z12 && Q7 != obj2) {
                            zm6Var2 = zm6Var;
                        } else {
                            Object gjVar = new gj((Object) info, (Object) zm6Var, (Object) kc2Var, (Object) jc2Var, (byte) 5);
                            zm6Var2 = zm6Var;
                            kd2Var.n0(gjVar);
                            Q7 = gjVar;
                        }
                        ub2 ub2Var3 = (ub2) Q7;
                        Object Q8 = kd2Var.Q();
                        if (Q8 == obj2) {
                            Q8 = new cf(w44Var2, (byte) 12);
                            kd2Var.n0(Q8);
                        }
                        wt5.d(booleanValue2, watchStatus, ub2Var3, (sb2) Q8, null, kd2Var, 3072);
                        kd2Var2 = kd2Var;
                        z4 = false;
                        kd2Var2.q(false);
                        sb2Var5 = sb2Var2;
                    }
                } else {
                    zm6Var2 = zm6Var;
                    z4 = false;
                    if (obj instanceof Resource.Error) {
                        kd2Var2.e0(1186379599);
                        sb2Var5 = sb2Var2;
                        c(f, sb2Var, sb2Var4, nx7.R(1364944704, new q(zm6Var2, sb2Var5, (byte) 18), kd2Var2), kd2Var2, ((i22 >> 3) & 14) | 3072 | ((i22 >> 9) & 112) | ((i22 >> 21) & 896));
                        kd2Var2.q(false);
                    }
                }
                kd2Var2.q(z4);
                z8 = true;
                kd2Var2.q(z8);
            }
            sb2Var5 = sb2Var2;
            kd2Var2.e0(1186729217);
            c(f, sb2Var, sb2Var4, bx7.d, kd2Var2, ((i22 >> 3) & 14) | 3072 | ((i22 >> 9) & 112) | ((i22 >> 21) & 896));
            kd2Var2.q(z4);
            kd2Var2.q(z4);
            z8 = true;
            kd2Var2.q(z8);
        } else {
            sb2Var5 = sb2Var2;
            zm6Var2 = zm6Var;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            final zm6 zm6Var3 = zm6Var2;
            final sb2 sb2Var6 = sb2Var5;
            u.d = new ic2(f, ub2Var, ub2Var2, sb2Var, jc2Var, kc2Var, sb2Var6, sb2Var3, sb2Var4, i) { // from class: df1
                public final /* synthetic */ ub2 A;
                public final /* synthetic */ sb2 B;
                public final /* synthetic */ jc2 C;
                public final /* synthetic */ kc2 D;
                public final /* synthetic */ sb2 E;
                public final /* synthetic */ sb2 F;
                public final /* synthetic */ sb2 G;
                public final /* synthetic */ float y;
                public final /* synthetic */ ub2 z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int N = kb0.N(9);
                    if1.a(zm6.this, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (kd2) obj3, N);
                    return pn6.a;
                }
            };
        }
    }

    public static final void b(ub2 ub2Var, Info info, zm6 zm6Var, List list, int i) {
        if (info != null) {
            int anilistId = info.getAnilistId();
            String id = info.getId();
            Integer malId = info.getMalId();
            String str = zm6Var.c;
            if (str == null) {
                Episode episode = (Episode) yo0.m0(list);
                if (episode != null) {
                    str = episode.getTitle();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = e02.b(info.getTitle());
                }
            }
            ub2Var.invoke(new WatchSession(id, anilistId, malId, str, list, i, null, null, 192, null));
        }
    }

    public static final void c(final float f, final sb2 sb2Var, final sb2 sb2Var2, os0 os0Var, kd2 kd2Var, final int i) {
        float f2;
        int i2;
        boolean z;
        os0 os0Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        kd2Var.f0(-198363814);
        if ((i & 6) == 0) {
            f2 = f;
            if (kd2Var.c(f2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            f2 = f;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(sb2Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(sb2Var2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            yz3 V = n77.V(ar5.c, 0.0f, 0.0f, 0.0f, f2, 7);
            xp0 a = vp0.a(x97.z, pk2.K, kd2Var, 0);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, V);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z2 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z2) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var, valueOf);
            ss5.h(kd2Var);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            int i7 = i2;
            aj.a(new Route.Details(""), null, null, null, true, false, sb2Var, null, sb2Var2, kd2Var, Route.Details.$stable | 24576 | ((i2 << 15) & 3670016) | ((i2 << 18) & 234881024), 174);
            yz3 w = ar5.c(vz3.x, 1.0f).w(new ob3(1.0f, true));
            vo3 c = b90.c(pk2.y, false);
            int hashCode2 = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E2 = o80.E(kd2Var, w);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, c);
            ss5.i(ys0Var, kd2Var, l2);
            h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E2);
            os0Var2 = os0Var;
            os0Var2.invoke(kd2Var, Integer.valueOf((i7 >> 9) & 14));
            kd2Var.q(true);
            kd2Var.q(true);
        } else {
            os0Var2 = os0Var;
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            final os0 os0Var3 = os0Var2;
            u.d = new ic2() { // from class: ve1
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    if1.c(f, sb2Var, sb2Var2, os0Var3, (kd2) obj, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }

    public static final void d(List list, int i, yz3 yz3Var, ub2 ub2Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        yz3 yz3Var2;
        kd2Var.f0(-1305397542);
        if (kd2Var.f(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (kd2Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (kd2Var.h(ub2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i8 & 1, z)) {
            yz3Var2 = yz3Var;
            l36.a(ar5.c(yz3Var2, 1.0f), null, ((mp0) kd2Var.j(op0.a)).n, 0L, 0.0f, 0.0f, null, nx7.R(-314503371, new ye1(i, list, ub2Var), kd2Var), kd2Var, 12582912, 122);
        } else {
            yz3Var2 = yz3Var;
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je(list, i, yz3Var2, ub2Var, i2);
        }
    }
}
