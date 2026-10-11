package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a07 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ w44 d;
    public final /* synthetic */ px5 e;
    public final /* synthetic */ w44 f;
    public final /* synthetic */ w44 g;
    public final /* synthetic */ w44 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ v27 j;
    public final /* synthetic */ v11 k;
    public final /* synthetic */ w44 l;
    public final /* synthetic */ pi4 m;

    public a07(boolean z, boolean z2, boolean z3, w44 w44Var, px5 px5Var, w44 w44Var2, w44 w44Var3, w44 w44Var4, boolean z4, v27 v27Var, v11 v11Var, w44 w44Var5, pi4 pi4Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = w44Var;
        this.e = px5Var;
        this.f = w44Var2;
        this.g = w44Var3;
        this.h = w44Var4;
        this.i = z4;
        this.j = v27Var;
        this.k = v11Var;
        this.l = w44Var5;
        this.m = pi4Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(yq4 yq4Var, vz0 vz0Var) {
        float f;
        if (this.a) {
            w44 w44Var = this.d;
            if (((dq4) w44Var.getValue()).c && this.b && !this.c && ((Boolean) this.e.getValue()).booleanValue() && !s07.e(this.f) && !s07.o(this.g) && ((dq4) w44Var.getValue()).h == null && !s07.d(this.h)) {
                float f2 = ((int) (((a46) yq4Var).V & 4294967295L)) * 0.45f;
                if (f2 < 1.0f) {
                    f = 1.0f;
                } else {
                    f = f2;
                }
                float f3 = (int) (((a46) yq4Var).V >> 32);
                Object t = n77.t(yq4Var, new zz6(this.i, 0.35f * f3, f3 * 0.65f, ((int) (r0 & 4294967295L)) * 0.8f, this.j, f, this.k, this.l, w44Var, this.m, null), vz0Var);
                if (t == w11.x) {
                    return t;
                }
            }
        }
        return pn6.a;
    }
}
