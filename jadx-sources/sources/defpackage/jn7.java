package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jn7 implements Runnable {
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ long y;
    public final /* synthetic */ vp7 z;

    public jn7(io7 io7Var, long j) {
        this.y = j;
        Objects.requireNonNull(io7Var);
        this.z = io7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        long j = this.y;
        vp7 vp7Var = this.z;
        switch (b) {
            case 0:
                ((io7) vp7Var).R(j);
                return;
            default:
                py7 py7Var = (py7) vp7Var;
                io7 io7Var = ((gu7) py7Var.x).K;
                gu7.i(io7Var);
                io7Var.O(j);
                py7Var.B = null;
                return;
        }
    }

    public jn7(py7 py7Var, long j) {
        this.y = j;
        Objects.requireNonNull(py7Var);
        this.z = py7Var;
    }
}
