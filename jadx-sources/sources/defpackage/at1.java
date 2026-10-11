package defpackage;

import android.text.InputFilter;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class at1 extends nx7 {
    public final zs1 E;

    public at1(eq eqVar) {
        this.E = new zs1(eqVar);
    }

    @Override // defpackage.nx7
    public final InputFilter[] E(InputFilter[] inputFilterArr) {
        if (!ks1.d()) {
            return inputFilterArr;
        }
        return this.E.E(inputFilterArr);
    }

    @Override // defpackage.nx7
    public final void T(boolean z) {
        if (!ks1.d()) {
            return;
        }
        this.E.T(z);
    }

    @Override // defpackage.nx7
    public final void U(boolean z) {
        boolean d = ks1.d();
        zs1 zs1Var = this.E;
        if (!d) {
            zs1Var.G = z;
        } else {
            zs1Var.U(z);
        }
    }
}
