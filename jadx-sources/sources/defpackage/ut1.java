package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ut1 {
    public final au1 a;
    public final byte[] b;

    public ut1(au1 au1Var, byte[] bArr) {
        if (au1Var != null) {
            if (bArr != null) {
                this.a = au1Var;
                this.b = bArr;
                return;
            } else {
                qi2.m("bytes is null");
                throw null;
            }
        }
        qi2.m("encoding is null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut1)) {
            return false;
        }
        ut1 ut1Var = (ut1) obj;
        if (!this.a.equals(ut1Var.a)) {
            return false;
        }
        return Arrays.equals(this.b, ut1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
