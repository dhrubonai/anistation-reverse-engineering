package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class gc0 implements hc0 {
    public final qg0 b;
    public final Throwable c;

    public gc0(qg0 qg0Var) {
        this.b = qg0Var;
        String property = System.getProperty("io.ktor.development");
        if (property != null && Boolean.parseBoolean(property)) {
            int hashCode = qg0Var.hashCode();
            t80.z(16);
            String num = Integer.toString(hashCode, 16);
            num.getClass();
            Throwable th = new Throwable("ReadTask 0x".concat(num));
            n03.J(th);
            this.c = th;
        }
    }

    @Override // defpackage.hc0
    public final Throwable c() {
        return this.c;
    }

    @Override // defpackage.hc0
    public final vz0 d() {
        return this.b;
    }
}
