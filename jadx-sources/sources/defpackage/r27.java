package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r27 implements b55 {
    public final /* synthetic */ v27 a;
    public final /* synthetic */ w17 b;

    public r27(v27 v27Var, w17 w17Var) {
        this.a = v27Var;
        this.b = w17Var;
    }

    @Override // defpackage.b55
    public final void a(a55 a55Var) {
        hl7 hl7Var = (hl7) a55Var;
        hl7Var.getClass();
        if (hl7Var.b().x <= 0) {
            return;
        }
        v27 v27Var = this.a;
        if (a34.i(v27Var.e0, this.b)) {
            if (v27Var.Q) {
                v27Var.q(false);
            } else {
                v27Var.p.i(new s17("Couldn't change subtitles on the Cast device. Try again."));
            }
        }
    }
}
