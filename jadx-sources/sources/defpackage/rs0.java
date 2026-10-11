package defpackage;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rs0 implements ic2 {
    public final /* synthetic */ byte x;
    public static final rs0 y = new rs0(0);
    public static final rs0 z = new rs0(1);
    public static final rs0 A = new rs0(2);
    public static final rs0 B = new rs0(3);
    public static final rs0 C = new rs0(4);
    public static final rs0 D = new rs0(5);
    public static final rs0 E = new rs0(6);
    public static final rs0 F = new rs0(7);
    public static final rs0 G = new rs0(8);
    public static final rs0 H = new rs0(9);

    public /* synthetic */ rs0(byte b) {
        this.x = b;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        ec2 ec2Var;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        boolean z2 = false;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (!kd2Var.V(intValue & 1, z2)) {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    x70.a.a(null, 0.0f, 0.0f, null, 0L, kd2Var2, 196608);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                }
                if (!kd2Var3.V(intValue3 & 1, z2)) {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 3:
                kd2 kd2Var4 = (kd2) obj;
                int intValue4 = ((Number) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z2 = true;
                }
                if (!kd2Var4.V(intValue4 & 1, z2)) {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 4:
                kd2 kd2Var5 = (kd2) obj;
                int intValue5 = ((Number) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z2 = true;
                }
                if (!kd2Var5.V(intValue5 & 1, z2)) {
                    kd2Var5.Y();
                }
                return pn6Var;
            case 5:
                kd2 kd2Var6 = (kd2) obj;
                int intValue6 = ((Number) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z2 = true;
                }
                if (!kd2Var6.V(intValue6 & 1, z2)) {
                    kd2Var6.Y();
                }
                return pn6Var;
            case 6:
                kd2 kd2Var7 = (kd2) obj;
                int intValue7 = ((Number) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z2 = true;
                }
                if (!kd2Var7.V(intValue7 & 1, z2)) {
                    kd2Var7.Y();
                }
                return pn6Var;
            case 7:
                kd2 kd2Var8 = (kd2) obj;
                ((Number) obj2).intValue();
                kd2Var8.e0(-511854661);
                x70 x70Var = x70.a;
                WeakHashMap weakHashMap = z57.w;
                ch3 ch3Var = new ch3(mv5.b(kd2Var8).l, 48);
                kd2Var8.q(false);
                return ch3Var;
            case 8:
                long j = ((ep0) obj2).a;
                if (j == 16) {
                    return Boolean.FALSE;
                }
                return Integer.valueOf(w65.U(j));
            case 9:
                o3 o3Var = (o3) obj;
                o3 o3Var2 = (o3) obj2;
                if (o3Var == null || (str = o3Var.a) == null) {
                    str = o3Var2.a;
                }
                if (o3Var == null || (ec2Var = o3Var.b) == null) {
                    ec2Var = o3Var2.b;
                }
                return new o3(str, ec2Var);
            default:
                kd2 kd2Var9 = (kd2) obj;
                int intValue8 = ((Number) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z2 = true;
                }
                if (!kd2Var9.V(intValue8 & 1, z2)) {
                    kd2Var9.Y();
                    return pn6Var;
                }
                throw null;
        }
    }
}
