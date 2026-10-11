package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m06 extends d04 {
    public final sb2 x;

    public m06(sb2 sb2Var) {
        this.x = sb2Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new n06(this.x);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((n06) xz3Var).N = this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m06)) {
            return false;
        }
        if (this.x == ((m06) obj).x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
