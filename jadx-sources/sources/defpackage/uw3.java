package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class uw3 implements Runnable {
    public final /* synthetic */ ij3 A;
    public final /* synthetic */ fr3 B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ xw3 y;
    public final /* synthetic */ Pair z;

    public /* synthetic */ uw3(xw3 xw3Var, Pair pair, ij3 ij3Var, fr3 fr3Var, byte b) {
        this.x = b;
        this.y = xw3Var;
        this.z = pair;
        this.A = ij3Var;
        this.B = fr3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        fr3 fr3Var = this.B;
        ij3 ij3Var = this.A;
        Pair pair = this.z;
        xw3 xw3Var = this.y;
        switch (b) {
            case 0:
                xw3Var.b.i.u(((Integer) pair.first).intValue(), (jw3) pair.second, ij3Var, fr3Var);
                return;
            default:
                xw3Var.b.i.w(((Integer) pair.first).intValue(), (jw3) pair.second, ij3Var, fr3Var);
                return;
        }
    }
}
