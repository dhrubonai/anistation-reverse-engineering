package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r23 extends w45 {
    public byte x;
    public final /* synthetic */ ub2 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r23(defpackage.ub2 r2) {
        /*
            r1 = this;
            cr0 r0 = defpackage.h41.a
            r1.y = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r23.<init>(ub2):void");
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
        ub2 ub2Var = this.y;
        wk6.j(1, ub2Var);
        return ub2Var.invoke(this);
    }
}
