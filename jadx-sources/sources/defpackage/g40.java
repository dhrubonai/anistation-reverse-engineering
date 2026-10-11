package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class g40 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ cc6 y;

    public /* synthetic */ g40(cc6 cc6Var, byte b) {
        this.x = b;
        this.y = cc6Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        ha3 q;
        n05 n05Var;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        cc6 cc6Var = this.y;
        switch (b) {
            case 0:
                return cc6Var.p(true, false);
            case 1:
                return cc6Var.p(false, false);
            case 2:
                return Boolean.valueOf(cc6Var.j(false).a);
            case 3:
                ti4 ti4Var = cc6Var.s;
                gi6 gi6Var = cc6Var.a;
                boolean d = nd6.d(gi6Var.d().B);
                if (((d && ((be6) ti4Var.getValue()) == be6.y) || (!d && ((be6) ti4Var.getValue()) == be6.z)) && cc6Var.l() == null && ((Boolean) cc6Var.k.getValue()).booleanValue() && (q = cc6Var.q()) != null) {
                    n05 O = sw0.O(q);
                    n05 g = n03.g(q.J(O.f()), O.e());
                    ha3 q2 = cc6Var.q();
                    if (q2 != null) {
                        if (nd6.d(gi6Var.d().B)) {
                            n05 k = cc6Var.k();
                            n05Var = n03.g(q2.J(k.f()), k.e());
                        } else {
                            long J = q2.J(cc6Var.o(true));
                            long J2 = q2.J(cc6Var.o(false));
                            if (cc6Var.b.c() == null) {
                                n05Var = n05.e;
                            } else {
                                float intBitsToFloat = Float.intBitsToFloat((int) (q2.J((Float.floatToRawIntBits(r0.c((int) (r7 >> 32)).b) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)) & 4294967295L));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (q2.J((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r0.c((int) (r7 & 4294967295L)).b) & 4294967295L)) & 4294967295L));
                                int i = (int) (J >> 32);
                                int i2 = (int) (J2 >> 32);
                                float min = Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                                float max = Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                                if (min == max) {
                                    max += 1.0f;
                                }
                                n05Var = new n05(min, Math.min(intBitsToFloat, intBitsToFloat2), max, Math.max(Float.intBitsToFloat((int) (J & 4294967295L)), Float.intBitsToFloat((int) (J2 & 4294967295L))));
                            }
                        }
                        if (n05Var.i(g)) {
                            return n05Var.g(g);
                        }
                    } else {
                        hz2.d("textLayoutCoordinates should not be null.");
                        v71.e();
                    }
                }
                return null;
            case 4:
                return (n05) cc6Var.x.getValue();
            case 5:
                return cc6Var.a.d();
            case 6:
                cc6Var.b();
                return pn6Var;
            case 7:
                return Boolean.valueOf(!((Boolean) cc6Var.t.getValue()).booleanValue());
            case 8:
                ic6 ic6Var = cc6Var.a.a;
                ic6Var.b.a().n();
                o96 o96Var = ic6Var.b;
                ss5.j(o96Var, 0, o96Var.y.length());
                ic6Var.b(true, ia6.x);
                ic6Var.f(true);
                ic6Var.e(ic6Var.b.A);
                return pn6Var;
            default:
                sb2 sb2Var = cc6Var.l;
                if (sb2Var != null) {
                    sb2Var.invoke();
                }
                return pn6Var;
        }
    }
}
