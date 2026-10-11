package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v90 {
    public final z44 a;

    public v90(byte b) {
        switch (b) {
            case 1:
                this.a = new z44(new cd3[16], 0);
                return;
            default:
                this.a = new z44(new my0[16], 0);
                return;
        }
    }

    public void a(CancellationException cancellationException) {
        z44 z44Var = this.a;
        int i = z44Var.z;
        pg0[] pg0VarArr = new pg0[i];
        for (int i2 = 0; i2 < i; i2++) {
            pg0VarArr[i2] = ((my0) z44Var.x[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            pg0VarArr[i3].a(cancellationException);
        }
        if (z44Var.z == 0) {
            return;
        }
        hz2.c("uncancelled requests present");
    }

    public void b() {
        z44 z44Var = this.a;
        f13 r0 = db.r0(0, z44Var.z);
        int i = r0.x;
        int i2 = r0.y;
        if (i <= i2) {
            while (true) {
                ((my0) z44Var.x[i]).b.resumeWith(pn6.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        z44Var.h();
    }
}
