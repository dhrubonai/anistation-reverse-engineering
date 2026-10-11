package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iu4 extends jw5 {
    public final /* synthetic */ byte a;
    public final long b;
    public final long c;

    public iu4(byte b, long j, long j2) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = j;
                this.c = j2;
                return;
            default:
                this.b = j2;
                this.c = j;
                return;
        }
    }

    public static long d(long j, zi4 zi4Var) {
        long A = zi4Var.A();
        if ((128 & A) != 0) {
            return 8589934591L & ((((A & 1) << 32) | zi4Var.C()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.jw5
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return qx1.k(this.c, " }", sb);
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.b);
                sb2.append(", playbackPositionUs= ");
                return qx1.k(this.c, " }", sb2);
        }
    }
}
