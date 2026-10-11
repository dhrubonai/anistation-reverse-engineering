package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l8 extends t36 implements kc2 {
    public /* synthetic */ a9 x;
    public /* synthetic */ y71 y;
    public /* synthetic */ Object z;

    /* JADX WARN: Type inference failed for: r1v1, types: [t36, l8] */
    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? t36Var = new t36(4, (vz0) obj4);
        t36Var.x = (a9) obj;
        t36Var.y = (y71) obj2;
        t36Var.z = obj3;
        pn6 pn6Var = pn6.a;
        t36Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        a9 a9Var = this.x;
        float c = this.y.c(this.z);
        if (!Float.isNaN(c)) {
            a9Var.a(c, 0.0f);
        }
        return pn6.a;
    }
}
