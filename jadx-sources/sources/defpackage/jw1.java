package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jw1 implements kv2 {
    public final mu2 a;
    public final ev2 b;
    public final Throwable c;

    public jw1(mu2 mu2Var, ev2 ev2Var, Throwable th) {
        this.a = mu2Var;
        this.b = ev2Var;
        this.c = th;
    }

    @Override // defpackage.kv2
    public final mu2 a() {
        return this.a;
    }

    @Override // defpackage.kv2
    public final ev2 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jw1) {
                jw1 jw1Var = (jw1) obj;
                if (!a34.i(this.a, jw1Var.a) || !a34.i(this.b, jw1Var.b) || !this.c.equals(jw1Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        mu2 mu2Var = this.a;
        if (mu2Var == null) {
            hashCode = 0;
        } else {
            hashCode = mu2Var.hashCode();
        }
        int hashCode2 = this.b.hashCode();
        return this.c.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ")";
    }
}
