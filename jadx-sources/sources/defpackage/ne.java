package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ne implements jc2 {
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ sb2 z;

    public /* synthetic */ ne(sb2 sb2Var, boolean z) {
        this.z = sb2Var;
        this.y = z;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        byte b = this.x;
        boolean z = false;
        final boolean z2 = this.y;
        switch (b) {
            case 0:
                yz3 yz3Var = (yz3) obj;
                kd2 kd2Var = (kd2) obj2;
                ((Integer) obj3).getClass();
                kd2Var.e0(-196777734);
                final long j = ((qd6) kd2Var.j(rd6.a)).a;
                boolean e = kd2Var.e(j);
                final sb2 sb2Var = this.z;
                boolean f2 = e | kd2Var.f(sb2Var) | kd2Var.g(z2);
                Object Q = kd2Var.Q();
                if (f2 || Q == au0.a) {
                    Q = new ub2() { // from class: oe
                        @Override // defpackage.ub2
                        public final Object invoke(Object obj4) {
                            we0 we0Var = (we0) obj4;
                            return we0Var.a(new ge(sb2Var, z2, x97.t(we0Var, Float.intBitsToFloat((int) (we0Var.x.g() >> 32)) / 2.0f), new w60(j, 5), (byte) 0));
                        }
                    };
                    kd2Var.n0(Q);
                }
                yz3 x = nx7.x(yz3Var, (ub2) Q);
                kd2Var.q(false);
                return x;
            default:
                kd2 kd2Var2 = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((el) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (kd2Var2.V(intValue & 1, z)) {
                    long b2 = ep0.b(0.5f, ep0.b);
                    yz3 e2 = ar5.e(vz3.x, 30.0f);
                    if (z2) {
                        f = 80.0f;
                    } else {
                        f = 75.0f;
                    }
                    zz.a(ar5.l(e2, f), false, false, null, null, b2, 0L, this.z, null, sw0.E, kd2Var2, 805502976, 350);
                } else {
                    kd2Var2.Y();
                }
                return pn6.a;
        }
    }

    public /* synthetic */ ne(boolean z, sb2 sb2Var) {
        this.y = z;
        this.z = sb2Var;
    }
}
