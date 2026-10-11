package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class vr2 extends t36 implements kc2 {
    public /* synthetic */ or2 x;
    public final /* synthetic */ byte y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vr2(int i, vz0 vz0Var) {
        super(4, vz0Var);
        this.y = i;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        vr2 vr2Var = new vr2(this.y, (vz0) obj4);
        vr2Var.x = (or2) obj2;
        pn6 pn6Var = pn6.a;
        vr2Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        int i;
        or2 or2Var = this.x;
        m37.N(obj);
        mv0 mv0Var = or2Var.f;
        ou ouVar = yr2.d;
        Integer num = (Integer) mv0Var.d(ouVar);
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.y;
        }
        or2Var.f.e(ouVar, new Integer(i));
        return pn6.a;
    }
}
