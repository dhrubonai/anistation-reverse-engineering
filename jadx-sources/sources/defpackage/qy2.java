package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qy2 extends t36 implements ic2 {
    public /* synthetic */ float x;

    /* JADX WARN: Type inference failed for: r1v1, types: [t36, qy2, vz0] */
    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        ?? t36Var = new t36(2, vz0Var);
        t36Var.x = ((Number) obj).floatValue();
        return t36Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((qy2) create(Float.valueOf(((Number) obj).floatValue()), (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z;
        m37.N(obj);
        if (this.x > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
