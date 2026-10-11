package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c1 implements Runnable {
    public final j1 x;
    public final ii3 y;

    public c1(j1 j1Var, ii3 ii3Var) {
        this.x = j1Var;
        this.y = ii3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.x.x == this) {
            if (j1.C.l(this.x, this, j1.h(this.y))) {
                j1.e(this.x, false);
            }
        }
    }
}
