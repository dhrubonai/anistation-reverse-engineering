package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class y70 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ do5 y;

    public /* synthetic */ y70(do5 do5Var, byte b) {
        this.x = b;
        this.y = do5Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        float f;
        float f2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        float f3 = 1.0f;
        do5 do5Var = this.y;
        p55 p55Var = (p55) obj;
        switch (b) {
            case 0:
                float h = do5Var.e.i.h();
                float c = do5Var.e.d().c();
                if (h < c) {
                    f = c - h;
                } else {
                    f = 0.0f;
                }
                if (f > 0.0f) {
                    f3 = (Float.intBitsToFloat((int) (p55Var.O & 4294967295L)) + f) / Float.intBitsToFloat((int) (p55Var.O & 4294967295L));
                }
                p55Var.i(f3);
                p55Var.m(wt5.c(0.5f, 0.0f));
                return pn6Var;
            default:
                float h2 = do5Var.e.i.h();
                float c2 = do5Var.e.d().c();
                if (h2 < c2) {
                    f2 = c2 - h2;
                } else {
                    f2 = 0.0f;
                }
                if (f2 > 0.0f) {
                    f3 = 1.0f / ((Float.intBitsToFloat((int) (p55Var.O & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & p55Var.O)));
                }
                p55Var.i(f3);
                p55Var.m(wt5.c(0.5f, 0.0f));
                return pn6Var;
        }
    }
}
