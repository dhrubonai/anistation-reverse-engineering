package defpackage;

import com.anistation.android.R;
import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class om1 {
    public static final void a(final boolean z, final boolean z2, final boolean z3, yz3 yz3Var, final sb2 sb2Var, final sb2 sb2Var2, final sb2 sb2Var3, kd2 kd2Var, final int i) {
        int i2;
        boolean z4;
        final yz3 yz3Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        sb2Var.getClass();
        sb2Var2.getClass();
        sb2Var3.getClass();
        kd2Var.f0(1613374528);
        if ((i & 6) == 0) {
            if (kd2Var.g(z)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.g(z2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (kd2Var.g(z3)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        int i9 = i2 | 3072;
        if ((i & 24576) == 0) {
            if (kd2Var.h(sb2Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i9 |= i5;
        }
        if ((196608 & i) == 0) {
            if (kd2Var.h(sb2Var2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i9 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (kd2Var.h(sb2Var3)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i9 |= i3;
        }
        if ((599187 & i9) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (kd2Var.V(i9 & 1, z4)) {
            int i10 = i9;
            Route.MyList myList = Route.MyList.INSTANCE;
            String f = lz5.f(R.string.downloads, kd2Var);
            vz3 vz3Var = vz3.x;
            aj.a(myList, vz3Var, new vh4(15.0f, 8.0f, 15.0f, 5.0f), f, false, false, sb2Var3, nx7.R(516310614, new ic2() { // from class: mm1
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    vz3 vz3Var2;
                    kd2 kd2Var2 = (kd2) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (kd2Var2.V(intValue & 1, z5)) {
                        z75 a = y75.a(new vr(10.0f, true, new ze0((byte) 6)), pk2.I, kd2Var2, 54);
                        int hashCode = Long.hashCode(kd2Var2.T);
                        al4 l = kd2Var2.l();
                        vz3 vz3Var3 = vz3.x;
                        yz3 E = o80.E(kd2Var2, vz3Var3);
                        tt0.d.getClass();
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(za3.p0);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(p7.F, kd2Var2, a);
                        ss5.i(p7.E, kd2Var2, l);
                        ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
                        ss5.h(kd2Var2);
                        ss5.i(p7.D, kd2Var2, E);
                        boolean z8 = z;
                        if (z8 && z2) {
                            kd2Var2.e0(-1326711137);
                            vz3Var2 = vz3Var3;
                            z7 = false;
                            z6 = z8;
                            zz.a(ar5.i(vz3Var3, 35.0f), false, true, null, null, ((mp0) kd2Var2.j(op0.a)).a, ep0.e, sb2Var2, new vh4(4.0f, 4.0f, 4.0f, 4.0f), iv.d, kd2Var2, 907542918, 26);
                            kd2Var2.q(false);
                        } else {
                            z6 = z8;
                            z7 = false;
                            vz3Var2 = vz3Var3;
                            kd2Var2.e0(-1326061904);
                            kd2Var2.q(false);
                        }
                        if (z3) {
                            kd2Var2.e0(-1325929472);
                            zz.a(ar5.i(vz3Var2, 40.0f), false, true, null, null, 0L, 0L, sb2Var, n77.j(0.0f, 0.0f, 3), nx7.R(1215921927, new tj1((byte) 1, z6), kd2Var2), kd2Var2, 905973126, 114);
                            kd2Var2 = kd2Var2;
                            kd2Var2.q(z7);
                        } else {
                            kd2Var2.e0(-1325158192);
                            kd2Var2.q(z7);
                        }
                        kd2Var2.q(true);
                    } else {
                        kd2Var2.Y();
                    }
                    return pn6.a;
                }
            }, kd2Var), null, kd2Var, ((i10 >> 6) & 112) | 12582918 | (3670016 & i10), 304);
            yz3Var2 = vz3Var;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: nm1
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    om1.a(z, z2, z3, yz3Var2, sb2Var, sb2Var2, sb2Var3, (kd2) obj, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }
}
