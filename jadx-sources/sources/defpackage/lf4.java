package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lf4 extends fg4 {
    public static final lf4 c = new fg4(0, 3, 1);

    @Override // defpackage.fg4
    public final void a(fm0 fm0Var, nr nrVar, bs5 bs5Var, b25 b25Var, gg4 gg4Var) {
        y23 y23Var;
        yr5 yr5Var = (yr5) fm0Var.h(1);
        ed2 ed2Var = (ed2) fm0Var.h(0);
        z32 z32Var = (z32) fm0Var.h(2);
        bs5 h = yr5Var.h();
        if (gg4Var != null) {
            try {
                y23Var = new y23(gg4Var, bs5Var, (byte) 9);
            } catch (Throwable th) {
                h.e(false);
                throw th;
            }
        } else {
            y23Var = null;
        }
        if (!z32Var.z.N()) {
            eu0.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        z32Var.y.M(nrVar, h, b25Var, y23Var);
        h.e(true);
        bs5Var.d();
        ed2Var.getClass();
        bs5Var.z(yr5Var, yr5Var.b(ed2Var));
        bs5Var.j();
    }
}
