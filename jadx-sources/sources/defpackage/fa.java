package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fa implements ic2 {
    public final /* synthetic */ byte x;
    public final Object y;

    public /* synthetic */ fa(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        int contantForFocusDirection;
        boolean z;
        boolean z2;
        byte b = this.x;
        boolean z3 = false;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                int i = ((f72) obj).a;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Integer c = m72.c(i);
                if (c != null) {
                    int intValue = c.intValue();
                    if (Build.VERSION.SDK_INT >= 31) {
                        contantForFocusDirection = vo.a.a(intValue, booleanValue);
                    } else {
                        contantForFocusDirection = SoundEffectConstants.getContantForFocusDirection(intValue);
                    }
                    ((oa) obj3).playSoundEffect(contantForFocusDirection);
                }
                return pn6Var;
            case 1:
                kd2 kd2Var = (kd2) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(1 & intValue2, z)) {
                    ((jc2) obj3).invoke(b85.a, kd2Var, 0);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var2 = (kd2) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue3 & 1, z2)) {
                    Object Q = kd2Var2.Q();
                    if (Q == au0.a) {
                        Q = new p03((byte) 21);
                        kd2Var2.n0(Q);
                    }
                    yz3 a = rh5.a(vz3.x, false, (ub2) Q);
                    w44 w44Var = (w44) obj3;
                    vo3 c2 = b90.c(pk2.y, false);
                    int s = h98.s(kd2Var2);
                    al4 l = kd2Var2.l();
                    yz3 E = o80.E(kd2Var2, a);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(za3.p0);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(p7.F, kd2Var2, c2);
                    ss5.i(p7.E, kd2Var2, l);
                    st0 st0Var = p7.G;
                    if (kd2Var2.S || !a34.i(kd2Var2.Q(), Integer.valueOf(s))) {
                        h11.p(s, kd2Var2, s, st0Var);
                    }
                    ss5.i(p7.D, kd2Var2, E);
                    ((ic2) w44Var.getValue()).invoke(kd2Var2, 0);
                    kd2Var2.q(true);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var3 = (kd2) obj;
                int intValue4 = ((Number) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                }
                if (kd2Var3.V(intValue4 & 1, z3)) {
                    yc6.b((String) obj3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, kd2Var3, 0, 0, 262142);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
        }
    }
}
