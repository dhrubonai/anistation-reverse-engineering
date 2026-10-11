package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ua4 implements vi6 {
    public final aj6 a;
    public final kv2 b;

    public ua4(aj6 aj6Var, kv2 kv2Var) {
        this.a = aj6Var;
        this.b = kv2Var;
    }

    @Override // defpackage.vi6
    public final void a() {
        kv2 kv2Var = this.b;
        boolean z = kv2Var instanceof o26;
        aj6 aj6Var = this.a;
        if (z) {
            aj6Var.onSuccess(((o26) kv2Var).a);
        } else if (kv2Var instanceof jw1) {
            aj6Var.onError(((jw1) kv2Var).a);
        } else {
            ze0.l();
        }
    }
}
