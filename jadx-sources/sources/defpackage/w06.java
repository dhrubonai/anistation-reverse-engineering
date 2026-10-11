package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w06 {
    public final z06 a;
    public mb3 b;
    public final t06 c;
    public final t06 d;
    public final t06 e;

    /* JADX WARN: Type inference failed for: r2v1, types: [t06] */
    /* JADX WARN: Type inference failed for: r2v2, types: [t06] */
    /* JADX WARN: Type inference failed for: r2v3, types: [t06] */
    public w06(z06 z06Var) {
        this.a = z06Var;
        final byte b = 0;
        this.c = new ic2(this) { // from class: t06
            public final /* synthetic */ w06 y;

            {
                this.y = this;
            }

            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                pn6 pn6Var = pn6.a;
                w06 w06Var = this.y;
                switch (b2) {
                    case 0:
                        z06 z06Var2 = w06Var.a;
                        za3 za3Var = (za3) obj;
                        mb3 mb3Var = za3Var.e0;
                        if (mb3Var == null) {
                            mb3Var = new mb3(za3Var, z06Var2);
                            za3Var.e0 = mb3Var;
                        }
                        w06Var.b = mb3Var;
                        w06Var.a().h();
                        mb3 a = w06Var.a();
                        if (a.z != z06Var2) {
                            a.z = z06Var2;
                            a.i(false);
                            za3.W(a.x, false, 7);
                        }
                        return pn6Var;
                    case 1:
                        w06Var.a().y = (qu0) obj2;
                        return pn6Var;
                    default:
                        mb3 a2 = w06Var.a();
                        ((za3) obj).d0(new jb3(a2, (ic2) obj2, a2.M));
                        return pn6Var;
                }
            }
        };
        final byte b2 = 1;
        this.d = new ic2(this) { // from class: t06
            public final /* synthetic */ w06 y;

            {
                this.y = this;
            }

            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                byte b22 = b2;
                pn6 pn6Var = pn6.a;
                w06 w06Var = this.y;
                switch (b22) {
                    case 0:
                        z06 z06Var2 = w06Var.a;
                        za3 za3Var = (za3) obj;
                        mb3 mb3Var = za3Var.e0;
                        if (mb3Var == null) {
                            mb3Var = new mb3(za3Var, z06Var2);
                            za3Var.e0 = mb3Var;
                        }
                        w06Var.b = mb3Var;
                        w06Var.a().h();
                        mb3 a = w06Var.a();
                        if (a.z != z06Var2) {
                            a.z = z06Var2;
                            a.i(false);
                            za3.W(a.x, false, 7);
                        }
                        return pn6Var;
                    case 1:
                        w06Var.a().y = (qu0) obj2;
                        return pn6Var;
                    default:
                        mb3 a2 = w06Var.a();
                        ((za3) obj).d0(new jb3(a2, (ic2) obj2, a2.M));
                        return pn6Var;
                }
            }
        };
        final byte b3 = 2;
        this.e = new ic2(this) { // from class: t06
            public final /* synthetic */ w06 y;

            {
                this.y = this;
            }

            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                byte b22 = b3;
                pn6 pn6Var = pn6.a;
                w06 w06Var = this.y;
                switch (b22) {
                    case 0:
                        z06 z06Var2 = w06Var.a;
                        za3 za3Var = (za3) obj;
                        mb3 mb3Var = za3Var.e0;
                        if (mb3Var == null) {
                            mb3Var = new mb3(za3Var, z06Var2);
                            za3Var.e0 = mb3Var;
                        }
                        w06Var.b = mb3Var;
                        w06Var.a().h();
                        mb3 a = w06Var.a();
                        if (a.z != z06Var2) {
                            a.z = z06Var2;
                            a.i(false);
                            za3.W(a.x, false, 7);
                        }
                        return pn6Var;
                    case 1:
                        w06Var.a().y = (qu0) obj2;
                        return pn6Var;
                    default:
                        mb3 a2 = w06Var.a();
                        ((za3) obj).d0(new jb3(a2, (ic2) obj2, a2.M));
                        return pn6Var;
                }
            }
        };
    }

    public final mb3 a() {
        mb3 mb3Var = this.b;
        if (mb3Var != null) {
            return mb3Var;
        }
        ze0.k("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
