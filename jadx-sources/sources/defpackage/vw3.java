package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vw3 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ xw3 y;
    public final /* synthetic */ Pair z;

    public /* synthetic */ vw3(xw3 xw3Var, Pair pair, byte b) {
        this.x = b;
        this.y = xw3Var;
        this.z = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Pair pair = this.z;
        xw3 xw3Var = this.y;
        switch (b) {
            case 0:
                xw3Var.b.i.N(((Integer) pair.first).intValue(), (jw3) pair.second);
                return;
            default:
                xw3Var.b.i.z(((Integer) pair.first).intValue(), (jw3) pair.second);
                return;
        }
    }
}
