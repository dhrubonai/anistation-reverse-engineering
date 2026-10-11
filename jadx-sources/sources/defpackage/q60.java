package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q60 extends xh4 {
    public final pc C;
    public final long D;
    public boolean E = true;
    public final long F;
    public float G;
    public w60 H;

    public q60(pc pcVar, long j) {
        int i;
        this.C = pcVar;
        this.D = j;
        int i2 = (int) (j >> 32);
        if (i2 >= 0 && (i = (int) (4294967295L & j)) >= 0 && i2 <= pcVar.a.getWidth() && i <= pcVar.a.getHeight()) {
            this.F = j;
            this.G = 1.0f;
        } else {
            ze0.k("Failed requirement.");
            throw null;
        }
    }

    @Override // defpackage.xh4
    public final boolean d(float f) {
        this.G = f;
        return true;
    }

    @Override // defpackage.xh4
    public final boolean e(w60 w60Var) {
        this.H = w60Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q60) {
                q60 q60Var = (q60) obj;
                if (a34.i(this.C, q60Var.C) && c13.b(0L, 0L) && k13.a(this.D, q60Var.D) && this.E == q60Var.E) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.xh4
    public final long h() {
        return m37.O(this.F);
    }

    public final int hashCode() {
        return Integer.hashCode(this.E ? 1 : 0) + qx1.d(qx1.d(this.C.hashCode() * 31, 0L, 31), this.D, 31);
    }

    @Override // defpackage.xh4
    public final void i(bp1 bp1Var) {
        int round = Math.round(Float.intBitsToFloat((int) (bp1Var.g() >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (bp1Var.g() & 4294967295L)));
        bp1.C(bp1Var, this.C, this.D, (round << 32) | (round2 & 4294967295L), this.G, this.H, this.E ? 1 : 0, 328);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String e = c13.e(0L);
        String b = k13.b(this.D);
        boolean z = this.E;
        if (z == 0) {
            str = "None";
        } else if (z == 1) {
            str = "Low";
        } else if (z == 2) {
            str = "Medium";
        } else if (z == 3) {
            str = "High";
        } else {
            str = "Unknown";
        }
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.C);
        sb.append(", srcOffset=");
        sb.append(e);
        sb.append(", srcSize=");
        return h11.l(sb, b, ", filterQuality=", str, ")");
    }
}
