package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pc3 {
    public final /* synthetic */ byte a;
    public final qi4 b;
    public final qi4 c;
    public boolean d;
    public Object e;
    public final wd3 f;

    public pc3(int i, int i2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new qi4(i);
                this.c = new qi4(i2);
                this.f = new wd3(i, 30, 100);
                return;
            default:
                this.b = new qi4(i);
                this.c = new qi4(i2);
                this.f = new wd3(i, 90, 200);
                return;
        }
    }

    public final void a(int i, int i2) {
        byte b = this.a;
        qi4 qi4Var = this.c;
        wd3 wd3Var = this.f;
        qi4 qi4Var2 = this.b;
        switch (b) {
            case 0:
                if (i < 0.0f) {
                    hz2.a("Index should be non-negative");
                }
                qi4Var2.i(i);
                wd3Var.b(i);
                qi4Var.i(i2);
                return;
            default:
                if (i < 0.0f) {
                    hz2.a("Index should be non-negative (" + i + ")");
                }
                qi4Var2.i(i);
                wd3Var.b(i);
                qi4Var.i(i2);
                return;
        }
    }
}
