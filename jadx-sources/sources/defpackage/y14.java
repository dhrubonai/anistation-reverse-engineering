package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y14 implements ey3 {
    public final int a;

    public y14(int i) {
        boolean z;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        } else {
            z = true;
        }
        io3.m("Unsupported orientation", z);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y14) && this.a == ((y14) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + 527;
    }

    public final String toString() {
        return "Orientation= " + this.a;
    }
}
