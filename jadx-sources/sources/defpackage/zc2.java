package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zc2 extends f1 implements Runnable {
    public ii3 E;

    @Override // defpackage.j1
    public final void c() {
        this.E = null;
    }

    @Override // defpackage.j1
    public final String j() {
        ii3 ii3Var = this.E;
        if (ii3Var != null) {
            return "delegate=[" + ii3Var + "]";
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ii3 ii3Var = this.E;
        if (ii3Var != null) {
            n(ii3Var);
        }
    }
}
