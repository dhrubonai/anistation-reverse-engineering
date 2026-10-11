package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x17 {
    public final zw a;
    public final boolean b;

    public x17(zw zwVar, boolean z) {
        this.a = zwVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x17) {
                x17 x17Var = (x17) obj;
                if (!this.a.equals(x17Var.a) || this.b != x17Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiscoveredAudioTrack(option=" + this.a + ", isSelected=" + this.b + ")";
    }
}
