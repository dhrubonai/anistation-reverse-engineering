package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ug1 implements q04 {
    public static final ug1 y = new ug1(0);
    public final /* synthetic */ byte x;

    public /* synthetic */ ug1(byte b) {
        this.x = b;
    }

    @Override // defpackage.q04
    public final float T() {
        switch (this.x) {
            case 0:
                return 0.0f;
            default:
                return 1.0f;
        }
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        switch (this.x) {
            case 0:
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
            default:
                return tl7.u(this, k11Var);
        }
    }

    @Override // defpackage.l11
    public final l11 minusKey(k11 k11Var) {
        switch (this.x) {
            case 0:
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
            default:
                return tl7.L(this, l11Var);
        }
    }
}
