package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class nb1 extends xg4 {
    public final jz0 a;
    public final long b;
    public final /* synthetic */ Object c;

    public nb1(jz0 jz0Var, Object obj) {
        this.c = obj;
        if (jz0Var == null) {
            jz0 jz0Var2 = fz0.a;
            jz0Var = fz0.b;
        }
        this.a = jz0Var;
        this.b = ((byte[]) obj).length;
    }

    @Override // defpackage.yg4
    public final Long a() {
        return Long.valueOf(this.b);
    }

    @Override // defpackage.yg4
    public final jz0 b() {
        return this.a;
    }

    @Override // defpackage.xg4
    public final byte[] d() {
        return (byte[]) this.c;
    }
}
