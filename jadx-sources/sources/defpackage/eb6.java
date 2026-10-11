package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eb6 extends t36 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ jb6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb6(jb6 jb6Var, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.y = jb6Var;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        byte b = this.x;
        jb6 jb6Var = this.y;
        switch (b) {
            case 0:
                return new eb6(jb6Var, vz0Var, (byte) 0);
            case 1:
                return new eb6(jb6Var, vz0Var, (byte) 1);
            case 2:
                return new eb6(jb6Var, vz0Var, (byte) 2);
            default:
                return new eb6(jb6Var, vz0Var, (byte) 3);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                ((eb6) create(vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                ((eb6) create(vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 2:
                ((eb6) create(vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((eb6) create(vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        jb6 jb6Var = this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                jb6Var.A = false;
                return pn6Var;
            case 1:
                m37.N(obj);
                jb6Var.c();
                return pn6Var;
            case 2:
                m37.N(obj);
                jb6Var.a(jb6Var.A);
                return pn6Var;
            default:
                m37.N(obj);
                jb6Var.o();
                return pn6Var;
        }
    }
}
