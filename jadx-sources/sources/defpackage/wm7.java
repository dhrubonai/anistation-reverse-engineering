package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wm7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ xm7 y;

    public /* synthetic */ wm7(xm7 xm7Var, byte b) {
        this.x = b;
        this.y = xm7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        xm7 xm7Var = this.y;
        switch (b) {
            case 0:
                xm7Var.j();
                return;
            default:
                fk7 fk7Var = xm7Var.e;
                rs3 rs3Var = (rs3) fk7Var.y;
                if (rs3Var == null) {
                    rs3Var = rs3.d((Context) fk7Var.x);
                    fk7Var.y = rs3Var;
                }
                rs3Var.e(xm7Var);
                return;
        }
    }
}
