package defpackage;

import java.net.Inet4Address;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xd implements ub2 {
    public final /* synthetic */ byte x;
    public static final xd y = new xd(0);
    public static final xd z = new xd(1);
    public static final xd A = new xd(2);
    public static final xd B = new xd(3);
    public static final xd C = new xd(4);
    public static final xd D = new xd(5);
    public static final xd E = new xd(6);
    public static final xd F = new xd(7);
    public static final xd G = new xd(8);
    public static final xd H = new xd(9);
    public static final xd I = new xd(10);
    public static final xd J = new xd(11);
    public static final xd K = new xd(12);
    public static final xd L = new xd(13);
    public static final xd M = new xd(14);
    public static final xd N = new xd(15);
    public static final xd O = new xd(16);
    public static final xd P = new xd(17);
    public static final xd Q = new xd(18);
    public static final xd R = new xd(19);
    public static final xd S = new xd(20);
    public static final xd T = new xd(21);
    public static final xd U = new xd(22);
    public static final xd V = new xd(23);
    public static final xd W = new xd(24);
    public static final xd X = new xd(25);

    public /* synthetic */ xd(byte b) {
        this.x = b;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ot1 ot1Var = ot1.x;
        switch (b) {
            case 0:
                return pn6Var;
            case 1:
                return Boolean.valueOf(obj instanceof Inet4Address);
            case 2:
                float[] fArr = ((jo3) obj).a;
                return pn6Var;
            case 3:
                float[] fArr2 = ((jo3) obj).a;
                return pn6Var;
            case 4:
                return bb4.u(obj);
            case 5:
                return bb4.u(obj);
            case 6:
                return bb4.u(obj);
            case 7:
                return bb4.u(obj);
            case 8:
                return bb4.u(obj);
            case 9:
                ((Number) obj).intValue();
                return null;
            case 10:
                return bb4.u(obj);
            case 11:
                if (a34.i(obj, Boolean.FALSE)) {
                    return new ep0(ep0.i);
                }
                obj.getClass();
                return new ep0(w65.e(((Integer) obj).intValue()));
            case 12:
                return bb4.u(obj);
            case 13:
                return bb4.u(obj);
            case 14:
                return pn6Var;
            case 15:
                return bb4.u(obj);
            case 16:
                return bb4.u(obj);
            case 17:
                return bb4.u(obj);
            case 18:
                return bb4.u(obj);
            case 19:
                return bb4.u(obj);
            case 20:
                return bb4.u(obj);
            case 21:
                return bb4.u(obj);
            case 22:
                return bb4.u(obj);
            case 23:
                return bb4.u(obj);
            case 24:
                return null;
            case 25:
                return Boolean.valueOf(obj instanceof oq2);
            case 26:
            case 27:
            case 28:
            default:
                return ot1Var;
        }
    }
}
