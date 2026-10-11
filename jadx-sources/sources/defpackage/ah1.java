package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ah1 extends t36 implements kc2 {
    public /* synthetic */ boolean x;
    public /* synthetic */ boolean y;
    public /* synthetic */ wg1 z;

    /* JADX WARN: Type inference failed for: r3v2, types: [t36, ah1] */
    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        ?? t36Var = new t36(4, (vz0) obj4);
        t36Var.x = booleanValue;
        t36Var.y = booleanValue2;
        t36Var.z = (wg1) obj3;
        return t36Var.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.x;
        boolean z2 = this.y;
        wg1 wg1Var = this.z;
        m37.N(obj);
        return new bh1(z, z2, wg1Var);
    }
}
