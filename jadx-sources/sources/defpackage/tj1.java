package defpackage;

import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tj1 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;

    public /* synthetic */ tj1(byte b, boolean z) {
        this.x = b;
        this.y = z;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        String i;
        boolean z2;
        String i2;
        boolean z3;
        xh4 H;
        int i3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        byte b = this.x;
        int i9 = R.drawable.edit;
        vz3 vz3Var = vz3.x;
        pn6 pn6Var = pn6.a;
        boolean z8 = false;
        boolean z9 = this.y;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    if (z9) {
                        i9 = R.drawable.check;
                    }
                    xh4 H2 = w65.H(i9, kd2Var, 0);
                    if (z9) {
                        i = h11.i(kd2Var, 2022943829, R.string.done, kd2Var, false);
                    } else {
                        i = h11.i(kd2Var, 2022945589, R.string.edit, kd2Var, false);
                    }
                    yt2.a(H2, i, null, ((mp0) kd2Var.j(op0.a)).q, kd2Var, 8, 4);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    if (z9) {
                        i9 = R.drawable.check;
                    }
                    xh4 H3 = w65.H(i9, kd2Var2, 0);
                    if (z9) {
                        i2 = h11.i(kd2Var2, 269876292, R.string.done, kd2Var2, false);
                    } else {
                        i2 = h11.i(kd2Var2, 269878308, R.string.edit, kd2Var2, false);
                    }
                    yt2.a(H3, i2, null, ((mp0) kd2Var2.j(op0.a)).q, kd2Var2, 8, 4);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var3.V(intValue3 & 1, z3)) {
                    if (z9) {
                        kd2Var3.e0(780144413);
                        H = w65.H(R.drawable.minimize, kd2Var3, 0);
                        kd2Var3.q(false);
                    } else {
                        kd2Var3.e0(780147037);
                        H = w65.H(R.drawable.maximize, kd2Var3, 0);
                        kd2Var3.q(false);
                    }
                    xh4 xh4Var = H;
                    if (z9) {
                        i3 = 780150778;
                        i4 = R.string.minimize;
                    } else {
                        i3 = 780153306;
                        i4 = R.string.maximize;
                    }
                    yt2.a(xh4Var, h11.i(kd2Var3, i3, i4, kd2Var3, false), null, ep0.e, kd2Var3, 3080, 4);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 3:
                kd2 kd2Var4 = (kd2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kd2Var4.V(intValue4 & 1, z4)) {
                    if (z9) {
                        i5 = R.drawable.closed_caption_filled;
                    } else {
                        i5 = R.drawable.closed_caption;
                    }
                    yt2.a(w65.H(i5, kd2Var4, 0), lz5.f(R.string.closed_caption, kd2Var4), null, 0L, kd2Var4, 8, 12);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 4:
                kd2 kd2Var5 = (kd2) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (kd2Var5.V(intValue5 & 1, z5)) {
                    if (z9) {
                        i6 = R.drawable.screen_cast_filled;
                    } else {
                        i6 = R.drawable.screen_cast;
                    }
                    yt2.a(w65.H(i6, kd2Var5, 0), lz5.f(R.string.cast, kd2Var5), null, 0L, kd2Var5, 8, 12);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
            case 5:
                kd2 kd2Var6 = (kd2) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (kd2Var6.V(intValue6 & 1, z6)) {
                    if (z9) {
                        kd2Var6.e0(313362311);
                        cv4.a(ar5.i(vz3Var, 20.0f), ((mp0) kd2Var6.j(op0.a)).o, 3.0f, 0L, 1, 0.0f, kd2Var6, 390, 40);
                        kd2Var6.q(false);
                    } else {
                        kd2Var6.e0(313735272);
                        kd2Var6.q(false);
                    }
                } else {
                    kd2Var6.Y();
                }
                return pn6Var;
            case 6:
                kd2 kd2Var7 = (kd2) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z8 = true;
                }
                if (kd2Var7.V(intValue7 & 1, z8)) {
                    if (z9) {
                        i7 = R.string.subtitle_font_bold;
                    } else {
                        i7 = R.string.subtitle_font_normal;
                    }
                    yc6.b(lz5.f(i7, kd2Var7), null, ((mp0) kd2Var7.j(op0.a)).o, 0L, s92.D, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var7.j(pl6.a)).n, kd2Var7, 1572864, 0, 131002);
                } else {
                    kd2Var7.Y();
                }
                return pn6Var;
            case 7:
                kd2 kd2Var8 = (kd2) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (kd2Var8.V(intValue8 & 1, z7)) {
                    yz3 R = n77.R(ar5.c(vz3Var, 1.0f), 14.0f);
                    z75 a = y75.a(x97.B, pk2.I, kd2Var8, 54);
                    int hashCode = Long.hashCode(kd2Var8.T);
                    al4 l = kd2Var8.l();
                    yz3 E = o80.E(kd2Var8, R);
                    tt0.d.getClass();
                    kd2Var8.h0();
                    if (kd2Var8.S) {
                        kd2Var8.k(za3.p0);
                    } else {
                        kd2Var8.q0();
                    }
                    ss5.i(p7.F, kd2Var8, a);
                    ss5.i(p7.E, kd2Var8, l);
                    ss5.i(p7.G, kd2Var8, Integer.valueOf(hashCode));
                    ss5.h(kd2Var8);
                    ss5.i(p7.D, kd2Var8, E);
                    yc6.b(lz5.f(R.string.turn_off_captions, kd2Var8), null, 0L, 0L, s92.C, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var8.j(pl6.a)).k, kd2Var8, 1572864, 0, 131006);
                    if (z9) {
                        kd2Var8.e0(1862154238);
                        yt2.a(w65.H(R.drawable.tick, kd2Var8, 0), lz5.f(R.string.selected_text, kd2Var8), ar5.i(vz3Var, 18.0f), ((mp0) kd2Var8.j(op0.a)).n, kd2Var8, 392, 0);
                        kd2Var8.q(false);
                    } else {
                        kd2Var8.e0(1862465199);
                        kd2Var8.q(false);
                    }
                    kd2Var8.q(true);
                } else {
                    kd2Var8.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var9 = (kd2) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z8 = true;
                }
                if (kd2Var9.V(intValue9 & 1, z8)) {
                    if (z9) {
                        i8 = R.string.already_downloading_external;
                    } else {
                        i8 = R.string.already_downloading_internal;
                    }
                    yc6.b(lz5.f(i8, kd2Var9), null, ((mp0) kd2Var9.j(op0.a)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var9.j(pl6.a)).l, kd2Var9, 0, 0, 131066);
                } else {
                    kd2Var9.Y();
                }
                return pn6Var;
        }
    }
}
