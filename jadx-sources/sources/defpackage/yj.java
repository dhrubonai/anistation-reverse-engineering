package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yj extends x93 implements ub2 {
    public static final yj A;
    public static final yj B;
    public static final yj C;
    public static final yj D;
    public static final yj E;
    public static final yj F;
    public static final yj G;
    public static final yj H;
    public static final yj I;
    public static final yj J;
    public static final yj K;
    public static final yj L;
    public static final yj M;
    public static final yj N;
    public static final yj z;
    public final /* synthetic */ byte y;

    static {
        int i = 1;
        z = new yj(i, (byte) 0);
        A = new yj(i, (byte) 1);
        B = new yj(i, (byte) 2);
        C = new yj(i, (byte) 3);
        D = new yj(i, (byte) 4);
        E = new yj(i, (byte) 5);
        F = new yj(i, (byte) 6);
        G = new yj(i, (byte) 7);
        H = new yj(i, (byte) 8);
        I = new yj(i, (byte) 9);
        J = new yj(i, (byte) 10);
        K = new yj(i, (byte) 11);
        L = new yj(i, (byte) 12);
        M = new yj(i, (byte) 13);
        N = new yj(i, (byte) 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj(int i, byte b) {
        super(i);
        this.y = b;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                return null;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 4:
                long a = ep0.a(((ep0) obj).a, rp0.x);
                return new ql(ep0.c(a), ep0.g(a), ep0.f(a), ep0.d(a));
            case 5:
                return obj;
            case 6:
                long j = ((xh6) obj).a;
                return new ol(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 7:
                ol olVar = (ol) obj;
                return new xh6(wt5.c(olVar.a, olVar.b));
            case 8:
                return z51.O(0.0f, 0.0f, null, 7);
            case 9:
                ((Number) obj).intValue();
                return 0;
            case 10:
                ((Number) obj).intValue();
                return 0;
            case 11:
                long j2 = ((k13) obj).a;
                return new c13(0L);
            case 12:
                k13 k13Var = (k13) obj;
                long j3 = k13Var.a;
                return k13Var;
            case 13:
                return dv1.d;
            default:
                return pn6.a;
        }
    }
}
