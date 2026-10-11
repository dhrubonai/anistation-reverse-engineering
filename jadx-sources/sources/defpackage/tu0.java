package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tu0 implements gg4, j11 {
    public static final r18 y = new r18(10);
    public final kd2 x;

    public tu0(kd2 kd2Var) {
        this.x = kd2Var;
    }

    @Override // defpackage.gg4
    public final List B(Integer num) {
        return this.x.J();
    }

    @Override // defpackage.gg4
    public final boolean L() {
        return this.x.C;
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        return ic2Var.invoke(obj, this);
    }

    @Override // defpackage.l11
    public final /* bridge */ j11 get(k11 k11Var) {
        return tl7.u(this, k11Var);
    }

    @Override // defpackage.j11
    public final k11 getKey() {
        return y;
    }

    @Override // defpackage.l11
    public final /* bridge */ l11 minusKey(k11 k11Var) {
        return tl7.B(this, k11Var);
    }

    @Override // defpackage.l11
    public final /* bridge */ l11 plus(l11 l11Var) {
        return tl7.L(this, l11Var);
    }
}
