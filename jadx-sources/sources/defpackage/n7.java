package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n7 implements b12 {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] u;
    public static final byte[] v;
    public final boolean b;
    public final vg1 c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int j;
    public long k;
    public d12 l;
    public bh6 m;
    public bh6 n;
    public hf5 o;
    public boolean p;
    public long q;
    public boolean r;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = eq6.a;
        Charset charset = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n7(int i) {
        this.b = i;
        vg1 vg1Var = new vg1();
        this.c = vg1Var;
        this.n = vg1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0167  */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.c12 r19, defpackage.d42 r20) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7.a(c12, d42):int");
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        return g(c12Var);
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        long d;
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j2;
        hf5 hf5Var = this.o;
        if (hf5Var instanceof tx2) {
            tx2 tx2Var = (tx2) hf5Var;
            cl3 cl3Var = tx2Var.b;
            if (cl3Var.b == 0) {
                d = -9223372036854775807L;
            } else {
                d = cl3Var.d(eq6.c(tx2Var.a, j));
            }
            this.k = d;
            if (Math.abs(this.q - d) < 20000) {
                return;
            }
            this.p = true;
            this.n = this.c;
            return;
        }
        if (j != 0 && (hf5Var instanceof cx0)) {
            this.k = (Math.max(0L, j - ((cx0) hf5Var).b) * 8000000) / r7.e;
            return;
        }
        this.k = 0L;
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        this.l = d12Var;
        bh6 G = d12Var.G(0, 1);
        this.m = G;
        this.n = G;
        d12Var.t();
    }

    public final int f(c12 c12Var) {
        String str;
        boolean z;
        c12Var.u();
        byte[] bArr = this.a;
        c12Var.A(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) <= 0) {
            int i = (b >> 3) & 15;
            if (i >= 0 && i <= 15 && (((z = this.d) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
                if (z) {
                    return t[i];
                }
                return s[i];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            if (this.d) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i);
            throw bj4.a(sb.toString(), null);
        }
        throw bj4.a("Invalid padding bits for frame header " + ((int) b), null);
    }

    public final boolean g(c12 c12Var) {
        c12Var.u();
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        c12Var.A(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            c12Var.v(bArr.length);
            return true;
        }
        c12Var.u();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        c12Var.A(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        c12Var.v(bArr3.length);
        return true;
    }

    @Override // defpackage.b12
    public final void release() {
    }
}
