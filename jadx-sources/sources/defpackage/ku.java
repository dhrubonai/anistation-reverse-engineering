package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ku implements cw4 {
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public ku(int i) {
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return cw4.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cw4) {
                cw4 cw4Var = (cw4) obj;
                if (this.b == cw4Var.tag() && bw4.x.equals(cw4Var.intEncoding())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (bw4.x.hashCode() ^ 2041407134);
    }

    @Override // defpackage.cw4
    public final bw4 intEncoding() {
        return bw4.x;
    }

    @Override // defpackage.cw4
    public final int tag() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.b) + "intEncoding=" + bw4.x + ')';
    }
}
