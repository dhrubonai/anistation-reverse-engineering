package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r16 implements b12 {
    public final y16 a;
    public bh6 f;
    public d12 g;
    public tx2 h;
    public int i;
    public byte[] e = eq6.b;
    public final zi4 d = new zi4();
    public final ea2 b = null;
    public final ArrayList c = new ArrayList();
    public byte j = 0;
    public long[] k = eq6.c;
    public long l = -9223372036854775807L;

    public r16(y16 y16Var) {
        this.a = y16Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r20.i != r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r2 == (-1)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
    
        r4 = r20.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0081, code lost:
    
        r2 = new defpackage.x16(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0086, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008c, code lost:
    
        r2 = new java.util.concurrent.atomic.AtomicLong(-9223372036854775807L);
        r20.a.E(r20.e, 0, r20.i, r18, new defpackage.fs0(r20, r2, (byte) 14));
        java.util.Collections.sort(r9);
        r20.k = new long[r9.size()];
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        if (r4 >= r9.size()) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ba, code lost:
    
        r20.k[r4] = ((defpackage.q16) r9.get(r4)).x;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
    
        if (r2.get() == (-9223372036854775807L)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d1, code lost:
    
        r4 = r20.f;
        r4.getClass();
        r4.d(r2.get());
        r4 = r20.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
    
        if (r4 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e1, code lost:
    
        r4.c = r2.get();
        r2 = r20.g;
        r2.getClass();
        r2.I(r20.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f1, code lost:
    
        r20.e = defpackage.eq6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f5, code lost:
    
        r20.j = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0089, code lost:
    
        r2 = defpackage.x16.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ff, code lost:
    
        throw defpackage.bj4.a("SubtitleParser failed.", r0);
     */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.c12 r21, defpackage.d42 r22) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r16.a(c12, d42):int");
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        return true;
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        boolean z;
        byte b = this.j;
        byte b2 = 1;
        if (b != 0 && b != 5) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        this.l = j2;
        byte b3 = this.j;
        if (b3 == 2) {
            this.j = (byte) 1;
        } else {
            b2 = b3;
        }
        if (b2 == 4) {
            this.j = (byte) 3;
        }
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        boolean z;
        if (this.j == 0) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        this.g = d12Var;
        bh6 G = d12Var.G(0, 3);
        this.f = G;
        ea2 ea2Var = this.b;
        if (ea2Var != null) {
            G.g(ea2Var);
            d12Var.t();
            tx2 tx2Var = new tx2(-9223372036854775807L, new long[]{0}, new long[]{0});
            this.h = tx2Var;
            d12Var.I(tx2Var);
        }
        this.j = (byte) 1;
    }

    public final void f(q16 q16Var) {
        this.f.getClass();
        byte[] bArr = q16Var.y;
        int length = bArr.length;
        int length2 = bArr.length;
        zi4 zi4Var = this.d;
        zi4Var.L(length2, bArr);
        this.f.e(length, zi4Var);
        this.f.a(q16Var.x, 1, length, 0, null);
    }

    @Override // defpackage.b12
    public final void release() {
        if (this.j == 5) {
            return;
        }
        this.a.reset();
        this.j = (byte) 5;
    }
}
