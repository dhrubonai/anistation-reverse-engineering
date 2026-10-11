package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hg extends t36 implements ic2 {
    public final /* synthetic */ long A;
    public byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ jg z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(boolean z, jg jgVar, long j, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = z;
        this.z = jgVar;
        this.A = j;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new hg(this.y, this.z, this.A, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((hg) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    m37.N(obj);
                    long j = ((ur6) obj).a;
                } else {
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                m37.N(obj);
                long j2 = ((ur6) obj).a;
            }
        } else {
            m37.N(obj);
            g84 g84Var = this.z.x;
            w11 w11Var = w11.x;
            if (!this.y) {
                this.x = (byte) 1;
                Object a = g84Var.a(0L, this.A, this);
                if (a != w11Var) {
                    obj = a;
                    long j22 = ((ur6) obj).a;
                }
            } else {
                this.x = (byte) 2;
                Object a2 = g84Var.a(this.A, 0L, this);
                if (a2 != w11Var) {
                    obj = a2;
                    long j3 = ((ur6) obj).a;
                }
            }
            return w11Var;
        }
        return pn6.a;
    }
}
