package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g70 extends t36 implements jc2 {
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g70(Object obj, vz0 vz0Var, byte b) {
        super(3, vz0Var);
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                g70 g70Var = new g70(3, (vz0) obj3);
                g70Var.y = (or2) obj;
                g70Var.invokeSuspend(pn6Var);
                return null;
            case 1:
                new g70((i33) this.y, (vz0) obj3, (byte) 1).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((Number) obj2).floatValue();
                new g70((tr5) this.y, (vz0) obj3, (byte) 2).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                or2 or2Var = (or2) this.y;
                m37.N(obj);
                if (or2Var.f.d(i70.a) != null) {
                    ov3.d();
                    return null;
                }
                return null;
            case 1:
                m37.N(obj);
                ((i33) this.y).f.decrementAndGet();
                return pn6Var;
            default:
                m37.N(obj);
                ((tr5) this.y).L.invoke();
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g70(int i, vz0 vz0Var) {
        super(i, vz0Var);
        this.x = (byte) 0;
    }
}
