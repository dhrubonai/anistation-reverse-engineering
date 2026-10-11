package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rl2 extends pl0 {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public qb0 C;
    public tm2 D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public nw2 I;
    public boolean J;
    public long K;
    public boolean L;
    public final long j;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final q41 p;
    public final v41 q;
    public final qb0 r;
    public final boolean s;
    public final boolean t;
    public final tf6 u;
    public final x81 v;
    public final List w;
    public final op1 x;
    public final fu2 y;
    public final zi4 z;

    public rl2(x81 x81Var, q41 q41Var, v41 v41Var, ea2 ea2Var, boolean z, q41 q41Var2, v41 v41Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, tf6 tf6Var, op1 op1Var, qb0 qb0Var, fu2 fu2Var, zi4 zi4Var, boolean z6, boolean z7, cp4 cp4Var, String str) {
        super(q41Var, v41Var, 1, ea2Var, i, obj, j, j2, str);
        long j4;
        boolean z8;
        ea2Var.getClass();
        this.j = j3;
        this.A = z;
        this.o = i2;
        if (z3) {
            j4 = j2 - j;
        } else {
            j4 = -9223372036854775807L;
        }
        this.K = j4;
        this.l = i3;
        this.q = v41Var2;
        this.p = q41Var2;
        if (v41Var2 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.F = z8;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = tf6Var;
        this.t = z4;
        this.v = x81Var;
        this.w = list;
        this.x = op1Var;
        this.r = qb0Var;
        this.y = fu2Var;
        this.z = zi4Var;
        this.L = z6;
        this.n = z7;
        z62 z62Var = nw2.y;
        this.I = o15.B;
        this.k = M.getAndIncrement();
    }

    public static byte[] d(String str) {
        int i;
        if (wc7.U(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i = byteArray.length - 16;
        } else {
            i = 0;
        }
        System.arraycopy(byteArray, i, bArr, (16 - byteArray.length) + i, byteArray.length - i);
        return bArr;
    }

    @Override // defpackage.mj3
    public final void a() {
        qb0 qb0Var;
        this.D.getClass();
        if (this.C == null && (qb0Var = this.r) != null) {
            b12 b12Var = (b12) qb0Var.y;
            if ((b12Var instanceof jk6) || (b12Var instanceof ya2)) {
                this.C = qb0Var;
                this.F = false;
            }
        }
        v41 v41Var = this.q;
        q41 q41Var = this.p;
        if (this.F) {
            q41Var.getClass();
            v41Var.getClass();
            c(q41Var, v41Var, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (!this.G) {
            if (!this.t) {
                c(this.i, this.b, this.A, true);
            }
            this.H = !this.G;
        }
    }

    @Override // defpackage.mj3
    public final void b() {
        this.G = true;
    }

    public final void c(q41 q41Var, v41 v41Var, boolean z, boolean z2) {
        long j;
        v41 c;
        boolean z3;
        long j2;
        boolean z4;
        int i = this.E;
        if (z) {
            if (i != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            z3 = z4;
            c = v41Var;
        } else {
            long j3 = i;
            long j4 = v41Var.g;
            if (j4 == -1) {
                j = -1;
            } else {
                j = j4 - j3;
            }
            c = v41Var.c(j3, j);
            z3 = false;
        }
        try {
            p81 g = g(q41Var, c, z2);
            if (z3) {
                g.i(this.E, false);
            }
            do {
                try {
                    try {
                        if (this.G) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.d.f & 16384) != 0) {
                            ((b12) this.C.y).c(0L, 0L);
                            j2 = g.A;
                        } else {
                            long j5 = v41Var.g;
                            if (j5 != -1 && g.A >= v41Var.f + j5) {
                                throw bj4.a(null, e);
                            }
                            throw e;
                        }
                    }
                } catch (Throwable th) {
                    this.E = (int) (g.A - v41Var.f);
                    throw th;
                }
            } while (((b12) this.C.y).a(g, qb0.C) == 0);
            j2 = g.A;
            this.E = (int) (j2 - v41Var.f);
        } finally {
            io3.F(q41Var);
        }
    }

    public final int e(int i) {
        io3.B(!this.L);
        if (i >= this.I.size()) {
            return 0;
        }
        return ((Integer) this.I.get(i)).intValue();
    }

    public final boolean f() {
        if (this.K != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:101|(1:(2:104|(1:(7:107|(1:(2:110|(1:112)(1:138))(7:139|(1:141)(1:155)|142|143|(4:145|(1:147)|148|(1:150))(1:154)|(1:152)|153))(9:156|(1:158)(1:170)|159|(1:161)(1:169)|162|(1:164)|165|(1:167)|168)|113|114|115|116|(2:130|131)(3:118|(2:127|128)|126))(1:171))(1:173))(1:174))(1:175)|172|113|114|115|116|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0337, code lost:
    
        r4 = 0;
        r2.C = 0;
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0332, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0333, code lost:
    
        r2.C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0336, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x00a2, code lost:
    
        if (((defpackage.fu4) r6).b.equals("com.apple.streaming.transportStreamTimestamp") != false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x033d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0164  */
    /* JADX WARN: Type inference failed for: r10v17, types: [w16] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [b12] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [b12, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v14 */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [w16] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p81 g(defpackage.q41 r33, defpackage.v41 r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl2.g(q41, v41, boolean):p81");
    }
}
