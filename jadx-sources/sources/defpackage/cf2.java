package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class cf2 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ df2 y;
    public final /* synthetic */ int z;

    public /* synthetic */ cf2(df2 df2Var, int i, byte b) {
        this.x = b;
        this.y = df2Var;
        this.z = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hs3 f;
        byte b = this.x;
        int i = this.z;
        df2 df2Var = this.y;
        switch (b) {
            case 0:
                qs3 qs3Var = ((ff2) ((st3) df2Var.g).z).d;
                if (qs3Var != null) {
                    rs3.b();
                    ff2 c = rs3.c();
                    int min = Math.min(qs3Var.q, Math.max(0, i));
                    hs3 f2 = c.f(qs3Var);
                    if (f2 != null) {
                        f2.f(min);
                        return;
                    }
                    return;
                }
                return;
            default:
                qs3 qs3Var2 = ((ff2) ((st3) df2Var.g).z).d;
                if (qs3Var2 != null) {
                    rs3.b();
                    if (i != 0 && (f = rs3.c().f(qs3Var2)) != null) {
                        f.i(i);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
