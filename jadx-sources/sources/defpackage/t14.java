package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t14 implements b12 {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public long E;
    public d12 F;
    public s14[] G;
    public long[][] H;
    public int I;
    public final w16 a;
    public final int b;
    public final boolean c;
    public final zi4 d;
    public final zi4 e;
    public final zi4 f;
    public final zi4 g;
    public final ArrayDeque h;
    public final wf5 i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public o15 m;
    public int n;
    public int o;
    public long p;
    public int q;
    public zi4 r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    public t14(int i, w16 w16Var) {
        boolean z;
        int i2;
        this.a = w16Var;
        this.b = i;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        z62 z62Var = nw2.y;
        this.m = o15.B;
        if ((i & 4) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        this.n = i2;
        this.i = new wf5();
        this.j = new ArrayList();
        this.g = new zi4(16);
        this.h = new ArrayDeque();
        this.d = new zi4(io3.d);
        this.e = new zi4(6);
        this.f = new zi4();
        this.s = -1;
        this.F = d12.g;
        this.G = new s14[0];
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x00f4, code lost:
    
        if ((r1 instanceof defpackage.gk0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x078e, code lost:
    
        throw defpackage.bj4.d("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x04c2, code lost:
    
        if ((r14 & 32) != 0) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x04c4, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x04c6, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x04d2, code lost:
    
        if ((r14 & 128) != 0) goto L232;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06f8  */
    /* JADX WARN: Type inference failed for: r5v5, types: [d24, java.lang.Object] */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.c12 r42, defpackage.d42 r43) {
        /*
            Method dump skipped, instructions count: 2244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t14.a(c12, d42):int");
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        o15 o15Var;
        fu5 k0 = io3.k0(c12Var, false);
        if (k0 != null) {
            o15Var = nw2.s(k0);
        } else {
            z62 z62Var = nw2.y;
            o15Var = o15.B;
        }
        this.m = o15Var;
        if (k0 != null) {
            return false;
        }
        return true;
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        this.h.clear();
        this.q = 0;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.B = false;
        this.C = 0;
        this.D = 0;
        this.k.clear();
        this.l.clear();
        if (j == 0) {
            if (this.n != 3) {
                this.n = 0;
                this.q = 0;
                return;
            } else {
                wf5 wf5Var = this.i;
                wf5Var.a.clear();
                wf5Var.b = (byte) 0;
                this.j.clear();
                return;
            }
        }
        for (s14 s14Var : this.G) {
            ch6 ch6Var = s14Var.b;
            int a = ch6Var.a(j2);
            if (a == -1) {
                a = ch6Var.b(j2);
            }
            s14Var.g = a;
            ek6 ek6Var = s14Var.d;
            if (ek6Var != null) {
                ek6Var.b = false;
                ek6Var.c = 0;
            }
        }
    }

    @Override // defpackage.b12
    public final List d() {
        return this.m;
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        if ((this.b & 16) == 0) {
            d12Var = new tu(d12Var, this.a);
        }
        this.F = d12Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (((defpackage.qo3) r4).a.equals("auxiliary.tracks.interleaved") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0129, code lost:
    
        if (((defpackage.qo3) r14).a.equals("auxiliary.tracks.offset") != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        if (((defpackage.qo3) r12).a.equals("auxiliary.tracks.map") != false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r46) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t14.f(long):void");
    }

    @Override // defpackage.b12
    public final void release() {
    }
}
