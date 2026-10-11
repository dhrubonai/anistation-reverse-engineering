package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tu3 implements ct3 {
    public final xu3 x;

    public tu3(xu3 xu3Var) {
        this.x = xu3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == tu3.class) {
            return this.x.equals(((tu3) obj).x);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.x);
    }
}
