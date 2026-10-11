package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ni3 extends oi3 {
    public final e41 a;

    public ni3(e41 e41Var) {
        this.a = e41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ni3.class == obj.getClass()) {
            return this.a.equals(((ni3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (ni3.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
