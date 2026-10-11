package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class aw implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ long z;

    public /* synthetic */ aw(Object obj, int i, long j, long j2, byte b) {
        this.x = b;
        this.B = obj;
        this.y = i;
        this.z = j;
        this.A = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jw3 jw3Var;
        byte b = this.x;
        Object obj = this.B;
        switch (b) {
            case 0:
                iw iwVar = (iw) ((pz2) obj).z;
                String str = eq6.a;
                iwVar.r(this.z, this.y, this.A);
                return;
            default:
                c71 c71Var = ((y20) obj).b;
                tp tpVar = c71Var.d;
                if (((nw2) tpVar.z).isEmpty()) {
                    jw3Var = null;
                } else {
                    jw3Var = (jw3) bx7.z((nw2) tpVar.z);
                }
                q7 X = c71Var.X(jw3Var);
                c71Var.b0(X, 1006, new z61(X, this.y, this.z, this.A));
                return;
        }
    }
}
