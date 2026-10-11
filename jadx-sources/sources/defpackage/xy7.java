package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xy7 implements Runnable {
    public final /* synthetic */ zz7 A;
    public final /* synthetic */ y2 B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ b48 y;
    public final /* synthetic */ boolean z;

    public xy7(zz7 zz7Var, b48 b48Var, boolean z, yh7 yh7Var) {
        this.x = (byte) 2;
        this.y = b48Var;
        this.z = z;
        this.B = yh7Var;
        Objects.requireNonNull(zz7Var);
        this.A = zz7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        y2 y2Var = this.B;
        y2 y2Var2 = null;
        boolean z = this.z;
        b48 b48Var = this.y;
        zz7 zz7Var = this.A;
        switch (b) {
            case 0:
                cr7 cr7Var = zz7Var.A;
                if (cr7Var == null) {
                    es7 es7Var = ((gu7) zz7Var.x).C;
                    gu7.l(es7Var);
                    es7Var.C.a("Discarding data. Failed to set user property");
                    return;
                } else {
                    if (!z) {
                        y2Var2 = (e28) y2Var;
                    }
                    zz7Var.d0(cr7Var, y2Var2, b48Var);
                    zz7Var.Y();
                    return;
                }
            case 1:
                cr7 cr7Var2 = zz7Var.A;
                if (cr7Var2 == null) {
                    es7 es7Var2 = ((gu7) zz7Var.x).C;
                    gu7.l(es7Var2);
                    es7Var2.C.a("Discarding data. Failed to send event to service");
                    return;
                } else {
                    if (!z) {
                        y2Var2 = (mm7) y2Var;
                    }
                    zz7Var.d0(cr7Var2, y2Var2, b48Var);
                    zz7Var.Y();
                    return;
                }
            default:
                cr7 cr7Var3 = zz7Var.A;
                if (cr7Var3 == null) {
                    es7 es7Var3 = ((gu7) zz7Var.x).C;
                    gu7.l(es7Var3);
                    es7Var3.C.a("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    if (!z) {
                        y2Var2 = (yh7) y2Var;
                    }
                    zz7Var.d0(cr7Var3, y2Var2, b48Var);
                    zz7Var.Y();
                    return;
                }
        }
    }

    public /* synthetic */ xy7(zz7 zz7Var, b48 b48Var, boolean z, y2 y2Var, byte b) {
        this.x = b;
        this.y = b48Var;
        this.z = z;
        this.B = y2Var;
        this.A = zz7Var;
    }
}
