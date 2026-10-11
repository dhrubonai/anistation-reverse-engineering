package defpackage;

import java.security.PrivateKey;
import java.security.PublicKey;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class cu1 {
    public final PublicKey a;
    public final PublicKey b;
    public final PrivateKey c;

    public cu1(PublicKey publicKey, PublicKey publicKey2, PrivateKey privateKey) {
        this.a = publicKey;
        this.b = publicKey2;
        this.c = privateKey;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cu1) {
                cu1 cu1Var = (cu1) obj;
                if (!this.a.equals(cu1Var.a) || !this.b.equals(cu1Var.b) || !this.c.equals(cu1Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EncryptionInfo(serverPublic=" + this.a + ", clientPublic=" + this.b + ", clientPrivate=" + this.c + ')';
    }
}
