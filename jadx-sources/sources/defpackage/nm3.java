package defpackage;

import android.content.res.Configuration;
import com.anistation.android.MainActivity;
import com.anistation.model.settings.ThemeMode;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class nm3 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ MainActivity y;

    public /* synthetic */ nm3(MainActivity mainActivity, byte b) {
        this.x = b;
        this.y = mainActivity;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj3 = au0.a;
        boolean z4 = false;
        MainActivity mainActivity = this.y;
        byte b2 = 1;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                int i = MainActivity.B;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    Object Q = kd2Var.Q();
                    if (Q == obj3) {
                        hh2 hh2Var = ((mf2) ((kf2) mainActivity.y.getValue())).a;
                        w42 m = sw0.m(new in(hh2Var.a(hh2Var.a).getData(), (byte) 20));
                        ja1 ja1Var = rh1.a;
                        Q = zz.D(m, j91.y);
                        kd2Var.n0(Q);
                    }
                    w44 l = h98.l((w42) Q, ThemeMode.DARK, ((og3) kd2Var.j(vj3.a)).getLifecycle(), eg3.A, it1.x, kd2Var, 48);
                    int i2 = om3.a[((ThemeMode) l.getValue()).ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                kd2Var.e0(1003580143);
                                kd2Var.q(false);
                                z4 = true;
                            } else {
                                kd2Var.e0(-1353104506);
                                kd2Var.q(false);
                                ze0.l();
                                return null;
                            }
                        } else {
                            kd2Var.e0(1003540500);
                            kd2Var.q(false);
                        }
                    } else {
                        kd2Var.e0(-1353102895);
                        if ((((Configuration) kd2Var.j(eb.a)).uiMode & 48) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        kd2Var.q(false);
                        z4 = z2;
                    }
                    boolean h = kd2Var.h(mainActivity) | kd2Var.f(l) | kd2Var.g(z4);
                    Object Q2 = kd2Var.Q();
                    if (h || Q2 == obj3) {
                        Q2 = new gi1(mainActivity, z4, l);
                        kd2Var.n0(Q2);
                    }
                    db.m((sb2) Q2, kd2Var);
                    ie6.a(z4, nx7.R(-1600903680, new nm3(mainActivity, b2), kd2Var), kd2Var, 384);
                    return pn6Var;
                }
                kd2Var.Y();
                return pn6Var;
            default:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = MainActivity.B;
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z3)) {
                    String str = (String) mainActivity.x.getValue();
                    boolean h2 = kd2Var2.h(mainActivity);
                    Object Q3 = kd2Var2.Q();
                    if (h2 || Q3 == obj3) {
                        Q3 = new vt0(mainActivity, (byte) 22);
                        kd2Var2.n0(Q3);
                    }
                    li.a(str, (sb2) Q3, kd2Var2, 0);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
