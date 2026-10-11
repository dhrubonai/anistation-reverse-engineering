package defpackage;

import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b97 implements pu0, lg3 {
    public fg3 A;
    public os0 B = te4.b;
    public final oa x;
    public final vu0 y;
    public boolean z;

    public b97(oa oaVar, vu0 vu0Var) {
        this.x = oaVar;
        this.y = vu0Var;
    }

    public final void a() {
        if (!this.z) {
            this.z = true;
            oa oaVar = this.x;
            oaVar.getView().setTag(R.id.wrapped_composition_tag, null);
            fg3 fg3Var = this.A;
            if (fg3Var != null) {
                fg3Var.b(this);
            }
            this.A = null;
            fi1 fi1Var = oaVar.D;
            if (fi1Var != null) {
                fi1Var.y.invoke();
            }
            oaVar.D = null;
        }
        this.y.p();
    }

    public final void b(ic2 ic2Var) {
        this.x.setOnReadyForComposition(new i87(this, (os0) ic2Var, (byte) 1));
    }

    @Override // defpackage.lg3
    public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
        if (dg3Var == dg3.ON_DESTROY) {
            a();
        } else if (dg3Var == dg3.ON_CREATE && !this.z) {
            b(this.B);
        }
    }
}
