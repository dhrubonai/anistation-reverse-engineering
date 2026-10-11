package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gu3 implements vu3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wu3 b;
    public final /* synthetic */ long c;

    public /* synthetic */ gu3(wu3 wu3Var, long j, byte b) {
        this.a = b;
        this.b = wu3Var;
        this.c = j;
    }

    @Override // defpackage.vu3
    public final void a(dt3 dt3Var) {
        byte b = this.a;
        long j = this.c;
        wu3 wu3Var = this.b;
        switch (b) {
            case 0:
                bu3 bu3Var = wu3Var.i;
                bu3Var.t();
                bu3Var.t.Q(j);
                return;
            default:
                bu3 bu3Var2 = wu3Var.i;
                bu3Var2.t();
                bu3Var2.t.Z((int) j);
                return;
        }
    }
}
