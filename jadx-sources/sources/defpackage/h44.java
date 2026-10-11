package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class h44 extends x45 implements ic2 {
    public long[] A;
    public int B;
    public boolean C;
    public /* synthetic */ Object D;
    public final /* synthetic */ i44 E;
    public final /* synthetic */ xd2 F;
    public xd2 y;
    public i44 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h44(i44 i44Var, xd2 xd2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.E = i44Var;
        this.F = xd2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        h44 h44Var = new h44(this.E, this.F, vz0Var);
        h44Var.D = obj;
        return h44Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((h44) create((ri5) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        ri5 ri5Var;
        i44 i44Var;
        long[] jArr;
        int i;
        xd2 xd2Var;
        boolean z = this.C;
        if (z) {
            if (z) {
                i = this.B;
                jArr = this.A;
                i44Var = this.z;
                xd2Var = this.y;
                ri5Var = (ri5) this.D;
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            ri5Var = (ri5) this.D;
            i44Var = this.E;
            g44 g44Var = i44Var.y;
            jArr = g44Var.c;
            i = g44Var.e;
            xd2Var = this.F;
        }
        if (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            xd2Var.y = i;
            Object obj2 = i44Var.y.b[i];
            this.D = ri5Var;
            this.y = xd2Var;
            this.z = i44Var;
            this.A = jArr;
            this.B = i2;
            this.C = true;
            ri5Var.d(this, obj2);
            return w11.x;
        }
        return pn6.a;
    }
}
