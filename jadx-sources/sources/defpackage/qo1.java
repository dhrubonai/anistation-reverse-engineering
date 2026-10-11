package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qo1 extends t36 implements jc2 {
    public final /* synthetic */ byte x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qo1(int i, vz0 vz0Var, byte b) {
        super(i, vz0Var);
        this.x = b;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = 3;
        switch (b) {
            case 0:
                long j = ((xc4) obj2).a;
                new qo1(i, (vz0) obj3, (byte) 0).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                ((Number) obj2).floatValue();
                new qo1(i, (vz0) obj3, (byte) 1).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                long j2 = ((xc4) obj2).a;
                new qo1(i, (vz0) obj3, (byte) 2).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                m37.N(obj);
                return pn6Var;
            case 1:
                m37.N(obj);
                return pn6Var;
            default:
                m37.N(obj);
                return pn6Var;
        }
    }
}
