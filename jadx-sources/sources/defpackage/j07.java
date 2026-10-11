package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j07 implements PointerInputEventHandler {
    public final /* synthetic */ w44 a;
    public final /* synthetic */ px5 b;
    public final /* synthetic */ w44 c;
    public final /* synthetic */ w44 d;
    public final /* synthetic */ v11 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;
    public final /* synthetic */ wj n;
    public final /* synthetic */ v27 o;
    public final /* synthetic */ sb2 p;
    public final /* synthetic */ w44 q;
    public final /* synthetic */ wj r;

    public j07(w44 w44Var, px5 px5Var, w44 w44Var2, w44 w44Var3, v11 v11Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, wj wjVar, v27 v27Var, sb2 sb2Var, w44 w44Var4, wj wjVar2) {
        this.a = w44Var;
        this.b = px5Var;
        this.c = w44Var2;
        this.d = w44Var3;
        this.e = v11Var;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = f5;
        this.k = f6;
        this.l = f7;
        this.m = f8;
        this.n = wjVar;
        this.o = v27Var;
        this.p = sb2Var;
        this.q = w44Var4;
        this.r = wjVar2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r5v0, types: [r05, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(yq4 yq4Var, vz0 vz0Var) {
        if (!s07.d(this.a) && ((Boolean) this.b.getValue()).booleanValue()) {
            ?? obj = new Object();
            obj.x = (uy3) this.c.getValue();
            Object K = db.K(new i07(yq4Var, obj, new Object(), this.d, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.a, this.r, null), vz0Var);
            if (K == w11.x) {
                return K;
            }
        }
        return pn6.a;
    }
}
