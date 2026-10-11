package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lu implements fu5 {
    public int A;
    public final /* synthetic */ byte x = 1;
    public int y;
    public long z;

    public lu(int i, long j, int i2) {
        this.y = i;
        this.z = j;
        this.A = i2;
    }

    public String toString() {
        switch (this.x) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                int i = this.y;
                String str = eq6.a;
                sb.append(new String(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i}, StandardCharsets.US_ASCII));
                sb.append(", size=");
                sb.append(this.z);
                sb.append(", minHeaderSize=");
                return zo5.k(this.A, "}", sb);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ lu() {
    }
}
