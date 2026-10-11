package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class fk0 extends yg4 {
    public final ic2 a;
    public final jz0 b;
    public final Long c;

    public fk0(ic2 ic2Var, jz0 jz0Var, Long l, int i) {
        l = (i & 8) != 0 ? null : l;
        this.a = ic2Var;
        this.b = jz0Var;
        this.c = l;
    }

    @Override // defpackage.yg4
    public final Long a() {
        return this.c;
    }

    @Override // defpackage.yg4
    public final jz0 b() {
        return this.b;
    }
}
