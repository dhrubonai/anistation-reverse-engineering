package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w27 implements x27 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final d12 a;
    public final bh6 b;
    public final gp0 c;
    public final int d;
    public final byte[] e;
    public final zi4 f;
    public final int g;
    public final ea2 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public w27(d12 d12Var, bh6 bh6Var, gp0 gp0Var) {
        int i;
        this.a = d12Var;
        this.b = bh6Var;
        this.c = gp0Var;
        int i2 = gp0Var.b;
        int max = Math.max(1, i2 / 10);
        this.g = max;
        zi4 zi4Var = new zi4(gp0Var.e);
        zi4Var.t();
        int t = zi4Var.t();
        this.d = t;
        int i3 = gp0Var.a;
        int i4 = gp0Var.c;
        int i5 = (((i4 - (i3 * 4)) * 8) / (gp0Var.d * i3)) + 1;
        if (t == i5) {
            int g = eq6.g(max, t);
            this.e = new byte[g * i4];
            this.f = new zi4(t * 2 * i3 * g);
            int i6 = ((i4 * i2) * 8) / t;
            da2 da2Var = new da2();
            da2Var.o = qy3.n("audio/raw");
            da2Var.i = i6;
            da2Var.j = i6;
            da2Var.p = max * 2 * i3;
            da2Var.I = i3;
            int i7 = gp0Var.f;
            if (i7 == 0) {
                i = -1;
            } else {
                i = i7 << 2;
            }
            da2Var.J = i;
            da2Var.K = i2;
            da2Var.L = 2;
            this.h = new ea2(da2Var);
            return;
        }
        throw bj4.a("Expected frames per block: " + i5 + "; got: " + t, null);
    }

    @Override // defpackage.x27
    public final void a(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // defpackage.x27
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.c12 r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w27.b(c12, long):boolean");
    }

    @Override // defpackage.x27
    public final void c(int i, long j) {
        a37 a37Var = new a37(this.c, this.d, i, j);
        this.a.I(a37Var);
        ea2 ea2Var = this.h;
        bh6 bh6Var = this.b;
        bh6Var.g(ea2Var);
        bh6Var.d(a37Var.e);
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        gp0 gp0Var = this.c;
        long j3 = gp0Var.b;
        String str = eq6.a;
        long e0 = j + eq6.e0(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * gp0Var.a;
        this.b.a(e0, 1, i2, this.k - i2, null);
        this.l += i;
        this.k -= i2;
    }
}
