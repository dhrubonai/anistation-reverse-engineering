package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ks6 {
    public static final ks6 g = new ks6(-1, -1, -1, -1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public ks6(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ks6) {
                ks6 ks6Var = (ks6) obj;
                if (this.a == ks6Var.a && this.b == ks6Var.b && this.c == ks6Var.c && this.d == ks6Var.d && this.e == ks6Var.e && this.f == ks6Var.f) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((Float.floatToIntBits(1.0f) + ((((((((217 + this.a) * 31) + 1) * 31) + this.b) * 31) + this.c) * 31)) * 31) - 1) * 31) - 1) * 961) + this.d) * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderSettings{bitrate=");
        sb.append(this.a);
        sb.append(", bitrateMode=1, profile=");
        sb.append(this.b);
        sb.append(", level=");
        sb.append(this.c);
        sb.append(", iFrameIntervalSeconds=1.0, operatingRate=-1, priority=-1, repeatPreviousFrameIntervalUs=-1, maxBFrames=");
        sb.append(this.d);
        sb.append(", numNonBidirectionalTemporalLayers=");
        sb.append(this.e);
        sb.append(", numBidirectionalTemporalLayers=");
        return qx1.o(sb, this.f, '}');
    }
}
