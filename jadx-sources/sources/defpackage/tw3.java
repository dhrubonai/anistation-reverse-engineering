package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tw3 implements Runnable {
    public final /* synthetic */ fr3 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ xw3 y;
    public final /* synthetic */ Pair z;

    public /* synthetic */ tw3(xw3 xw3Var, Pair pair, fr3 fr3Var, byte b) {
        this.x = b;
        this.y = xw3Var;
        this.z = pair;
        this.A = fr3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        fr3 fr3Var = this.A;
        Pair pair = this.z;
        xw3 xw3Var = this.y;
        switch (b) {
            case 0:
                c71 c71Var = xw3Var.b.i;
                int intValue = ((Integer) pair.first).intValue();
                jw3 jw3Var = (jw3) pair.second;
                jw3Var.getClass();
                c71Var.m(intValue, jw3Var, fr3Var);
                return;
            default:
                xw3Var.b.i.l(((Integer) pair.first).intValue(), (jw3) pair.second, fr3Var);
                return;
        }
    }
}
