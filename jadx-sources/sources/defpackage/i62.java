package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i62 extends t36 implements ic2 {
    public /* synthetic */ int x;

    /* JADX WARN: Type inference failed for: r1v1, types: [i62, t36, vz0] */
    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        ?? t36Var = new t36(2, vz0Var);
        t36Var.x = ((Number) obj).intValue();
        return t36Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((i62) create(Integer.valueOf(((Number) obj).intValue()), (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.x;
        m37.N(obj);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
