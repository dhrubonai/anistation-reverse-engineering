package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class oq0 implements ic2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ jb6 y;
    public final /* synthetic */ os0 z;

    public /* synthetic */ oq0(jb6 jb6Var, os0 os0Var, int i, byte b) {
        this.x = b;
        this.y = jb6Var;
        this.z = os0Var;
        this.A = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = this.A;
        os0 os0Var = this.z;
        jb6 jb6Var = this.y;
        kd2 kd2Var = (kd2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                x97.c(jb6Var, os0Var, kd2Var, kb0.N(i | 1));
                return pn6Var;
            default:
                te4.f(jb6Var, os0Var, kd2Var, kb0.N(i | 1));
                return pn6Var;
        }
    }
}
