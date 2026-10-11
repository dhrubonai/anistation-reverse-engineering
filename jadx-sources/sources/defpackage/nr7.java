package defpackage;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nr7 extends zq7 {
    public String A;
    public int B;
    public String C;
    public String D;
    public long E;
    public final long F;
    public final long G;
    public List H;
    public String I;
    public final String J;
    public int K;
    public String L;
    public String M;
    public long N;
    public String O;
    public String z;

    public nr7(gu7 gu7Var, long j, long j2, String str) {
        super(gu7Var);
        this.N = 0L;
        this.O = null;
        this.F = j;
        this.G = j2;
        this.J = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b48 P(java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr7.P(java.lang.String):b48");
    }

    public final void Q() {
        String format;
        String str;
        L();
        gu7 gu7Var = (gu7) this.x;
        bt7 bt7Var = gu7Var.B;
        es7 es7Var = gu7Var.C;
        gu7.j(bt7Var);
        if (!bt7Var.S().i(wv7.ANALYTICS_STORAGE)) {
            gu7.l(es7Var);
            es7Var.J.a("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            i28 i28Var = gu7Var.F;
            gu7.j(i28Var);
            i28Var.K0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        gu7.l(es7Var);
        bs7 bs7Var = es7Var.J;
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        bs7Var.a("Resetting session stitching token to ".concat(str));
        this.M = format;
        gu7Var.H.getClass();
        this.N = System.currentTimeMillis();
    }

    public final String R() {
        M();
        a34.x(this.z);
        return this.z;
    }

    public final String S() {
        L();
        M();
        a34.x(this.L);
        return this.L;
    }
}
