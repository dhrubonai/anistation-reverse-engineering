package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f65 {
    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof f65)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(0.1f) + qx1.b(0.08f, qx1.b(0.1f, Float.hashCode(0.16f) * 31, 31), 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=0.16, focusedAlpha=0.1, hoveredAlpha=0.08, pressedAlpha=0.1)";
    }
}
