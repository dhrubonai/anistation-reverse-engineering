package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q75 extends wc7 {
    @Override // defpackage.wc7
    public final void r(an5 an5Var, float f, float f2) {
        float f3 = f2 * f;
        an5Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        wm5 wm5Var = new wm5(0.0f, 0.0f, f4, f4);
        wm5Var.f = 180.0f;
        wm5Var.g = 90.0f;
        an5Var.f.add(wm5Var);
        um5 um5Var = new um5(wm5Var);
        an5Var.a(180.0f);
        an5Var.g.add(um5Var);
        an5Var.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        an5Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        an5Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
