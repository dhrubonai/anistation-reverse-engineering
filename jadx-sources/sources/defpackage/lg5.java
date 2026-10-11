package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class lg5 {
    public final Object a;
    public final jc2 b;
    public final jc2 c;
    public final Object d;
    public final t36 e;
    public final jc2 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ ng5 i;

    public lg5(ng5 ng5Var, Object obj, jc2 jc2Var, jc2 jc2Var2, Object obj2, t36 t36Var, jc2 jc2Var3) {
        this.i = ng5Var;
        this.a = obj;
        this.b = jc2Var;
        this.c = jc2Var2;
        this.d = obj2;
        this.e = t36Var;
        this.f = jc2Var3;
    }

    public final void a() {
        ei1 ei1Var;
        Object obj = this.g;
        if (obj instanceof ag5) {
            ((ag5) obj).h(this.h, this.i.x);
            return;
        }
        if (obj instanceof ei1) {
            ei1Var = (ei1) obj;
        } else {
            ei1Var = null;
        }
        if (ei1Var != null) {
            ei1Var.dispose();
        }
    }
}
