package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t23 extends xz0 {
    public byte x;
    public final /* synthetic */ ic2 y;
    public final /* synthetic */ vz0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t23(vz0 vz0Var, l11 l11Var, ic2 ic2Var, vz0 vz0Var2) {
        super(vz0Var, l11Var);
        this.y = ic2Var;
        this.z = vz0Var2;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        if (b != 0) {
            if (b == 1) {
                this.x = (byte) 2;
                m37.N(obj);
                return obj;
            }
            ze0.m("This coroutine had already completed");
            return null;
        }
        this.x = (byte) 1;
        m37.N(obj);
        ic2 ic2Var = this.y;
        ic2Var.getClass();
        wk6.j(2, ic2Var);
        return ic2Var.invoke(this.z, this);
    }
}
