package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ka2 implements io4 {
    public final /* synthetic */ fi0 a;

    public ka2(fi0 fi0Var) {
        this.a = fi0Var;
    }

    @Override // defpackage.io4
    public final void B(ko4 ko4Var, ho4 ho4Var) {
        fi0 fi0Var = this.a;
        fi0Var.H1();
        if (fi0Var.e.isEmpty() && !fi0Var.h) {
            fi0Var.F1(fi0Var.r1(), false, false);
        }
    }

    @Override // defpackage.io4
    public final void K() {
        this.a.p = true;
    }

    @Override // defpackage.io4
    public final void f(fy3 fy3Var) {
        this.a.l = fy3Var;
    }

    @Override // defpackage.io4
    public final void j(jo4 jo4Var, jo4 jo4Var2, int i) {
        fi0 fi0Var = this.a;
        fi0Var.n = i;
        fi0Var.o = jo4Var2.f;
        kz kzVar = fi0Var.k;
        long j = jo4Var.f;
        long j2 = jo4Var.g;
        ((ok2) kzVar.x).y = j;
        ((ok2) kzVar.y).y = j;
        ((ok2) kzVar.z).y = j2;
        ((ok2) kzVar.A).y = j2;
        ((ok2) kzVar.B).y = 0L;
        fi0Var.k = new kz(fi0Var.j);
    }

    @Override // defpackage.io4
    public final void r(int i, boolean z) {
        this.a.m = i;
    }
}
