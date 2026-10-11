package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v21 implements ri6 {
    public final int b;

    public v21(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        ze0.k("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.ri6
    public final vi6 a(aj6 aj6Var, kv2 kv2Var) {
        if (!(kv2Var instanceof o26)) {
            return new ua4(aj6Var, kv2Var);
        }
        if (((o26) kv2Var).c == p41.x) {
            return new ua4(aj6Var, kv2Var);
        }
        return new w21(aj6Var, kv2Var, this.b);
    }
}
