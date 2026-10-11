package defpackage;

import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;

    public /* synthetic */ i(ub2 ub2Var, byte b) {
        this.x = b;
        this.y = ub2Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        byte b = this.x;
        q18 q18Var = au0.a;
        pn6 pn6Var = pn6.a;
        boolean z2 = false;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    String f = lz5.f(R.string.support_anistation, kd2Var);
                    String f2 = lz5.f(R.string.support_anistation_desc, kd2Var);
                    boolean f3 = kd2Var.f(ub2Var);
                    Object Q = kd2Var.Q();
                    if (f3 || Q == q18Var) {
                        Q = new o(ub2Var, (byte) 0);
                        kd2Var.n0(Q);
                    }
                    u.a(R.drawable.heart, f, f2, null, false, (sb2) Q, kd2Var, 24576);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    boolean f4 = kd2Var2.f(ub2Var);
                    Object Q2 = kd2Var2.Q();
                    if (f4 || Q2 == q18Var) {
                        Q2 = new o(ub2Var, (byte) 1);
                        kd2Var2.n0(Q2);
                    }
                    qi1.a(R.drawable.bitcoin, "Bitcoin (BTC)", "bc1qup69ecueq7069sqk8ma3wtytczh87ek8e638g9", true, null, 0L, (sb2) Q2, kd2Var2, 28080);
                    boolean f5 = kd2Var2.f(ub2Var);
                    Object Q3 = kd2Var2.Q();
                    if (f5 || Q3 == q18Var) {
                        Q3 = new o(ub2Var, (byte) 2);
                        kd2Var2.n0(Q3);
                    }
                    qi1.a(R.drawable.solana, "Solana (SOL)", "9hbfv4Nb8DCbYwVpi61yTNF6VnEoZ2uXJ9mygt89N4hY", false, null, 0L, (sb2) Q3, kd2Var2, 28080);
                    boolean f6 = kd2Var2.f(ub2Var);
                    Object Q4 = kd2Var2.Q();
                    if (f6 || Q4 == q18Var) {
                        Q4 = new o(ub2Var, (byte) 3);
                        kd2Var2.n0(Q4);
                    }
                    qi1.a(R.drawable.ethereum, "Ethereum (ETH)", "0x0A66C86644CB65D67d2BeFB67D670a54eBa8879d", false, null, 0L, (sb2) Q4, kd2Var2, 28080);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                ub2Var.invoke(new xc4(((uq4) obj2).c));
                return pn6Var;
            default:
                kd2 kd2Var3 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((el) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                }
                if (kd2Var3.V(intValue3 & 1, z2)) {
                    boolean f7 = kd2Var3.f(ub2Var);
                    Object Q5 = kd2Var3.Q();
                    if (f7 || Q5 == q18Var) {
                        Q5 = new o(ub2Var, (byte) 4);
                        kd2Var3.n0(Q5);
                    }
                    zz.a(null, false, true, null, null, 0L, 0L, (sb2) Q5, null, t80.c, kd2Var3, 805306752, 379);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
        }
    }
}
