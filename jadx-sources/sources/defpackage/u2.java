package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u2 implements Runnable {
    public final b45 x;
    public final ii3 y;

    public u2(b45 b45Var, ii3 ii3Var) {
        this.x = b45Var;
        this.y = ii3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.x.x == this) {
            if (x2.C.o(this.x, this, x2.g(this.y))) {
                x2.d(this.x);
            }
        }
    }
}
