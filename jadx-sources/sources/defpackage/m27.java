package defpackage;

import com.anistation.model.Episode;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m27 extends t36 implements ic2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ long x;
    public final /* synthetic */ v27 y;
    public final /* synthetic */ Episode z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m27(long j, v27 v27Var, Episode episode, long j2, boolean z, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = j;
        this.y = v27Var;
        this.z = episode;
        this.A = j2;
        this.B = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new m27(this.x, this.y, this.z, this.A, this.B, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        m27 m27Var = (m27) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        m27Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        v27 v27Var = this.y;
        long j = v27Var.c0;
        long j2 = this.x;
        pn6 pn6Var = pn6.a;
        if (j2 == j && !((dq4) v27Var.o.getValue()).j) {
            v27Var.v(this.z.getNumber(), new Long(this.A), false, Boolean.valueOf(this.B), true, true);
        }
        return pn6Var;
    }
}
