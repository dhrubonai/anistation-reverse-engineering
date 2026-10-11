package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u26 implements r26, Serializable {
    public final Object x;

    public u26(Object obj) {
        this.x = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u26) {
            return tl7.r(this.x, ((u26) obj).x);
        }
        return false;
    }

    @Override // defpackage.r26
    public final Object get() {
        return this.x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.x + ")";
    }
}
