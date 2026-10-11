package defpackage;

import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dg0 implements jc2 {
    public final /* synthetic */ byte x;
    public static final dg0 y = new dg0(0);
    public static final dg0 z = new dg0(1);
    public static final dg0 A = new dg0(2);
    public static final dg0 B = new dg0(3);
    public static final dg0 C = new dg0(4);

    public /* synthetic */ dg0(byte b) {
        this.x = b;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        boolean z2 = false;
        int i = 2;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                try {
                    zo5.s((p45) obj2);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return pn6Var;
            case 1:
                rs5 rs5Var = (rs5) obj;
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (kd2Var.f(rs5Var)) {
                        i = 4;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z2 = true;
                }
                if (kd2Var.V(intValue & 1, z2)) {
                    qs5.b(rs5Var, null, null, kd2Var, intValue & 14);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 2:
                if (obj == null) {
                    kd2 kd2Var2 = (kd2) obj2;
                    int intValue2 = ((Number) obj3).intValue();
                    if ((intValue2 & 6) == 0) {
                        if (kd2Var2.f(null)) {
                            i = 4;
                        }
                        intValue2 |= i;
                    }
                    if ((intValue2 & 19) != 18) {
                        z2 = true;
                    }
                    if (kd2Var2.V(intValue2 & 1, z2)) {
                        ss5.a(intValue2 & 14, kd2Var2);
                        return pn6Var;
                    }
                    kd2Var2.Y();
                    return pn6Var;
                }
                ov3.d();
                return null;
            case 3:
                ((Throwable) obj).getClass();
                ((l11) obj3).getClass();
                ((File) obj2).delete();
                return pn6Var;
            default:
                return null;
        }
    }
}
