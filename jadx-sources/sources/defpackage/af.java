package defpackage;

import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class af implements y86 {
    public final View a;
    public final ub2 b;
    public final sb2 c;
    public final i54 d = new i54();
    public final eu5 e = new eu5(new ue(this, 0));
    public final ue f = new ue(this, 1);
    public final ue g = new ue(this, 2);
    public ActionMode h;
    public ze i;
    public Runnable j;

    public af(View view, ub2 ub2Var, sb2 sb2Var) {
        this.a = view;
        this.b = ub2Var;
        this.c = sb2Var;
    }

    @Override // defpackage.y86
    public final Object a(q86 q86Var, t36 t36Var) {
        vz0 vz0Var = null;
        v8 v8Var = new v8(this, q86Var, vz0Var, (byte) 2);
        i54 i54Var = this.d;
        i54Var.getClass();
        Object K = db.K(new d23(c54.x, i54Var, v8Var, vz0Var, (byte) 1), t36Var);
        if (K == w11.x) {
            return K;
        }
        return pn6.a;
    }
}
