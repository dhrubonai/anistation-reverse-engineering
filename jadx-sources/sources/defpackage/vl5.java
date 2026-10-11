package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.anistation.model.Recent;
import com.anistation.model.settings.ThemeMode;
import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vl5 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ vl5(byte b, int i, Object obj, Object obj2) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        nd6 nd6Var;
        byte b = this.x;
        boolean z = false;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (b) {
            case 0:
                ThemeMode themeMode = (ThemeMode) obj4;
                ub2 ub2Var = (ub2) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    sv1 entries = ThemeMode.getEntries();
                    Object Q = kd2Var.Q();
                    if (Q == au0.a) {
                        Q = new tg5((byte) 15);
                        kd2Var.n0(Q);
                    }
                    t80.a(entries, themeMode, ub2Var, null, (ub2) Q, false, null, 0L, n77.j(0.0f, 0.0f, 3), null, kd2Var, 100687872, 744);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                x97.j((yz3) obj4, (os0) obj3, (kd2) obj, kb0.N(49));
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                k66.a((Route) obj4, (ub2) obj3, (kd2) obj, kb0.N(7));
                return pn6Var;
            case 3:
                ((Integer) obj2).getClass();
                ((h95) obj4).d((Drawable) obj3, (kd2) obj, kb0.N(49));
                return pn6Var;
            case 4:
                jb6 jb6Var = (jb6) obj4;
                v11 v11Var = (v11) obj3;
                n86 n86Var = (n86) obj;
                Context context = (Context) obj2;
                boolean h = jb6Var.h();
                ko k = jb6Var.k();
                if (k != null) {
                    str = k.y;
                } else {
                    str = null;
                }
                nd6 nd6Var2 = jb6Var.v;
                if (nd6Var2 != null) {
                    long j = nd6Var2.a;
                    h12 h12Var = jb6Var.b;
                    int i = (int) (j >> 32);
                    h12Var.b(i);
                    int i2 = (int) (j & 4294967295L);
                    h12Var.b(i2);
                    nd6Var = new nd6(fy5.a(i, i2));
                } else {
                    nd6Var = null;
                }
                dn4.a(n86Var, context, h, str, nd6Var, jb6Var.i, new bg((Object) jb6Var, (Object) v11Var, (Object) context, (byte) 29));
                return pn6Var;
            case 5:
                cc6 cc6Var = (cc6) obj4;
                Context context2 = (Context) obj2;
                boolean m = cc6Var.m();
                gi6 gi6Var = cc6Var.a;
                dn4.a((n86) obj, context2, m, gi6Var.d().A, new nd6(gi6Var.d().B), cc6Var.f, new qb6(cc6Var, (v11) obj3, context2));
                return pn6Var;
            case 6:
                ((Integer) obj2).getClass();
                yc6.a((xd6) obj4, (ic2) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 7:
                mp0 mp0Var = (mp0) obj4;
                os0 os0Var = (os0) obj3;
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    ho3.b(mp0Var, tm5.a, xk6.b, os0Var, kd2Var2, 0);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 8:
                ((Integer) obj2).getClass();
                iv.o((String) obj4, (String) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                iv.n((Recent) obj4, (ub2) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
        }
    }

    public /* synthetic */ vl5(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }
}
