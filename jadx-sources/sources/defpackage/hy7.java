package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hy7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ py7 y;

    public hy7(py7 py7Var, byte b) {
        this.x = b;
        switch (b) {
            case 1:
                Objects.requireNonNull(py7Var);
                this.y = py7Var;
                return;
            default:
                Objects.requireNonNull(py7Var);
                this.y = py7Var;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        py7 py7Var = this.y;
        switch (b) {
            case 0:
                py7Var.B = py7Var.G;
                return;
            default:
                py7Var.G = null;
                return;
        }
    }
}
