package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class co1 implements ub2 {
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ float y;
    public final /* synthetic */ Object z;

    public /* synthetic */ co1(float f, r05 r05Var) {
        this.y = f;
        this.z = r05Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.x;
        boolean z2 = false;
        float f = this.y;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                r05 r05Var = (r05) obj2;
                po1 po1Var = (po1) obj;
                boolean i = a34.i(po1Var.S(), "waiting");
                if (po1Var.getOrientation() != null) {
                    rg4 orientation = po1Var.getOrientation();
                    orientation.getClass();
                    qo1 qo1Var = ro1.a;
                    if (orientation != rg4.y ? !(f <= 30.0f || f > 90.0f) : f <= 30.0f) {
                        z = true;
                        if (!r05Var.x || (i && z)) {
                            z2 = true;
                        }
                        r05Var.x = z2;
                        return Boolean.valueOf(!z2);
                    }
                }
                z = false;
                if (!r05Var.x) {
                }
                z2 = true;
                r05Var.x = z2;
                return Boolean.valueOf(!z2);
            default:
                xi6 xi6Var = (xi6) obj2;
                long longValue = ((Long) obj).longValue();
                boolean h = xi6Var.h();
                ri4 ri4Var = xi6Var.h;
                if (!h) {
                    if (ri4Var.h() == Long.MIN_VALUE) {
                        ri4Var.i(longValue);
                        ((ti4) xi6Var.a.x).setValue(Boolean.TRUE);
                    }
                    long h2 = longValue - ri4Var.h();
                    if (f != 0.0f) {
                        h2 = io3.i0(h2 / f);
                    }
                    xi6Var.o(h2);
                    if (f == 0.0f) {
                        z2 = true;
                    }
                    xi6Var.i(h2, z2);
                }
                return pn6.a;
        }
    }

    public /* synthetic */ co1(xi6 xi6Var, float f) {
        this.z = xi6Var;
        this.y = f;
    }
}
