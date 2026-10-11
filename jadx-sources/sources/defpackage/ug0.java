package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ug0 implements j11, k11 {
    public final /* synthetic */ byte x;
    public static final p18 y = new p18((byte) 9);
    public static final ug0 z = new ug0(1);
    public static final ug0 A = new ug0(2);

    public /* synthetic */ ug0(byte b) {
        this.x = b;
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        switch (this.x) {
            case 0:
                return ic2Var.invoke(obj, this);
            case 1:
                return ic2Var.invoke(obj, this);
            default:
                return ic2Var.invoke(obj, this);
        }
    }

    @Override // defpackage.l11
    public final j11 get(k11 k11Var) {
        switch (this.x) {
            case 0:
                return tl7.u(this, k11Var);
            case 1:
                return tl7.u(this, k11Var);
            default:
                return tl7.u(this, k11Var);
        }
    }

    @Override // defpackage.j11
    public final k11 getKey() {
        switch (this.x) {
            case 0:
                return y;
            case 1:
                return z;
            default:
                return this;
        }
    }

    @Override // defpackage.l11
    public final l11 minusKey(k11 k11Var) {
        switch (this.x) {
            case 0:
                return tl7.B(this, k11Var);
            case 1:
                return tl7.B(this, k11Var);
            default:
                return tl7.B(this, k11Var);
        }
    }

    @Override // defpackage.l11
    public final l11 plus(l11 l11Var) {
        switch (this.x) {
            case 0:
                return tl7.L(this, l11Var);
            case 1:
                return tl7.L(this, l11Var);
            default:
                return tl7.L(this, l11Var);
        }
    }
}
