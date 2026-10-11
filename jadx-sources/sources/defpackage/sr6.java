package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sr6 extends x93 implements ub2 {
    public final /* synthetic */ byte y;
    public final /* synthetic */ tr6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr6(tr6 tr6Var, byte b) {
        super(1);
        this.y = b;
        this.z = tr6Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        long j;
        byte b = this.y;
        tr6 tr6Var = this.z;
        switch (b) {
            case 0:
                si6 si6Var = (si6) obj;
                tu1 tu1Var = tu1.x;
                tu1 tu1Var2 = tu1.y;
                if (si6Var.b(tu1Var, tu1Var2)) {
                    wi6 wi6Var = tr6Var.M.a;
                    return dv1.c;
                }
                if (si6Var.b(tu1Var2, tu1.z)) {
                    wi6 wi6Var2 = tr6Var.N.a;
                    return dv1.c;
                }
                return dv1.c;
            default:
                int ordinal = ((tu1) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            wi6 wi6Var3 = tr6Var.N.a;
                            j = tr6Var.O.e;
                        } else {
                            ze0.l();
                            return null;
                        }
                    } else {
                        wi6 wi6Var4 = tr6Var.M.a;
                        wi6 wi6Var5 = tr6Var.N.a;
                        j = ep0.h;
                    }
                } else {
                    wi6 wi6Var6 = tr6Var.M.a;
                    j = ep0.h;
                }
                return new ep0(j);
        }
    }
}
