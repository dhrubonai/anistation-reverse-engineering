package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i86 extends xz3 implements ra3, zo1, sh5 {
    public ko L;
    public xd6 M;
    public p82 N;
    public ub2 O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public List T;
    public ub2 U;
    public ub2 V;
    public Map W;
    public q24 X;
    public g86 Y;
    public h86 Z;

    /* JADX WARN: Type inference failed for: r0v2, types: [g86] */
    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        g86 g86Var = this.Y;
        g86 g86Var2 = g86Var;
        if (g86Var == null) {
            final byte b = 0;
            ?? r0 = new ub2(this) { // from class: g86
                public final /* synthetic */ i86 y;

                {
                    this.y = this;
                }

                @Override // defpackage.ub2
                public final Object invoke(Object obj) {
                    bd6 bd6Var;
                    boolean z;
                    boolean z2;
                    byte b2 = b;
                    i86 i86Var = this.y;
                    switch (b2) {
                        case 0:
                            List list = (List) obj;
                            bd6 bd6Var2 = i86Var.a1().n;
                            if (bd6Var2 != null) {
                                ad6 ad6Var = bd6Var2.a;
                                bd6Var = new bd6(new ad6(ad6Var.a, xd6.e(i86Var.M, ep0.i, 0L, null, null, 0L, 0, 0L, 16777214), ad6Var.c, ad6Var.d, ad6Var.e, ad6Var.f, ad6Var.g, ad6Var.h, ad6Var.i, ad6Var.j), bd6Var2.b, bd6Var2.c);
                                list.add(bd6Var);
                            } else {
                                bd6Var = null;
                            }
                            if (bd6Var != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        case 1:
                            ko koVar = (ko) obj;
                            h86 h86Var = i86Var.Z;
                            nt1 nt1Var = nt1.x;
                            if (h86Var != null) {
                                if (!a34.i(koVar, h86Var.b)) {
                                    h86Var.b = koVar;
                                    q24 q24Var = h86Var.d;
                                    if (q24Var != null) {
                                        q24Var.g(koVar, i86Var.M, i86Var.N, i86Var.P, i86Var.Q, i86Var.R, i86Var.S, nt1Var);
                                    }
                                }
                            } else {
                                h86 h86Var2 = new h86(i86Var.L, koVar);
                                q24 q24Var2 = new q24(koVar, i86Var.M, i86Var.N, i86Var.P, i86Var.Q, i86Var.R, i86Var.S, nt1Var);
                                q24Var2.d(i86Var.a1().j);
                                h86Var2.d = q24Var2;
                                i86Var.Z = h86Var2;
                            }
                            z51.w(i86Var);
                            w65.E(i86Var);
                            v94.y(i86Var);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            h86 h86Var3 = i86Var.Z;
                            if (h86Var3 == null) {
                                z2 = false;
                            } else {
                                ub2 ub2Var = i86Var.V;
                                if (ub2Var != null) {
                                    ub2Var.invoke(h86Var3);
                                }
                                h86 h86Var4 = i86Var.Z;
                                if (h86Var4 != null) {
                                    h86Var4.c = booleanValue;
                                }
                                z51.w(i86Var);
                                w65.E(i86Var);
                                v94.y(i86Var);
                                z2 = true;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            };
            this.Y = r0;
            g86Var2 = r0;
        }
        ko koVar = this.L;
        w73[] w73VarArr = zh5.a;
        bi5Var.b(yh5.C, te4.H(koVar));
        h86 h86Var = this.Z;
        if (h86Var != null) {
            ko koVar2 = h86Var.b;
            ai5 ai5Var = yh5.D;
            w73[] w73VarArr2 = zh5.a;
            w73 w73Var = w73VarArr2[16];
            ai5Var.getClass();
            bi5Var.b(ai5Var, koVar2);
            boolean z = h86Var.c;
            ai5 ai5Var2 = yh5.E;
            w73 w73Var2 = w73VarArr2[17];
            Boolean valueOf = Boolean.valueOf(z);
            ai5Var2.getClass();
            bi5Var.b(ai5Var2, valueOf);
        }
        final byte b2 = 1;
        bi5Var.b(oh5.l, new o3(null, new ub2(this) { // from class: g86
            public final /* synthetic */ i86 y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                bd6 bd6Var;
                boolean z2;
                boolean z22;
                byte b22 = b2;
                i86 i86Var = this.y;
                switch (b22) {
                    case 0:
                        List list = (List) obj;
                        bd6 bd6Var2 = i86Var.a1().n;
                        if (bd6Var2 != null) {
                            ad6 ad6Var = bd6Var2.a;
                            bd6Var = new bd6(new ad6(ad6Var.a, xd6.e(i86Var.M, ep0.i, 0L, null, null, 0L, 0, 0L, 16777214), ad6Var.c, ad6Var.d, ad6Var.e, ad6Var.f, ad6Var.g, ad6Var.h, ad6Var.i, ad6Var.j), bd6Var2.b, bd6Var2.c);
                            list.add(bd6Var);
                        } else {
                            bd6Var = null;
                        }
                        if (bd6Var != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        ko koVar3 = (ko) obj;
                        h86 h86Var2 = i86Var.Z;
                        nt1 nt1Var = nt1.x;
                        if (h86Var2 != null) {
                            if (!a34.i(koVar3, h86Var2.b)) {
                                h86Var2.b = koVar3;
                                q24 q24Var = h86Var2.d;
                                if (q24Var != null) {
                                    q24Var.g(koVar3, i86Var.M, i86Var.N, i86Var.P, i86Var.Q, i86Var.R, i86Var.S, nt1Var);
                                }
                            }
                        } else {
                            h86 h86Var22 = new h86(i86Var.L, koVar3);
                            q24 q24Var2 = new q24(koVar3, i86Var.M, i86Var.N, i86Var.P, i86Var.Q, i86Var.R, i86Var.S, nt1Var);
                            q24Var2.d(i86Var.a1().j);
                            h86Var22.d = q24Var2;
                            i86Var.Z = h86Var22;
                        }
                        z51.w(i86Var);
                        w65.E(i86Var);
                        v94.y(i86Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        h86 h86Var3 = i86Var.Z;
                        if (h86Var3 == null) {
                            z22 = false;
                        } else {
                            ub2 ub2Var = i86Var.V;
                            if (ub2Var != null) {
                                ub2Var.invoke(h86Var3);
                            }
                            h86 h86Var4 = i86Var.Z;
                            if (h86Var4 != null) {
                                h86Var4.c = booleanValue;
                            }
                            z51.w(i86Var);
                            w65.E(i86Var);
                            v94.y(i86Var);
                            z22 = true;
                        }
                        return Boolean.valueOf(z22);
                }
            }
        }));
        final byte b3 = 2;
        bi5Var.b(oh5.m, new o3(null, new ub2(this) { // from class: g86
            public final /* synthetic */ i86 y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                bd6 bd6Var;
                boolean z2;
                boolean z22;
                byte b22 = b3;
                i86 i86Var = this.y;
                switch (b22) {
                    case 0:
                        List list = (List) obj;
                        bd6 bd6Var2 = i86Var.a1().n;
                        if (bd6Var2 != null) {
                            ad6 ad6Var = bd6Var2.a;
                            bd6Var = new bd6(new ad6(ad6Var.a, xd6.e(i86Var.M, ep0.i, 0L, null, null, 0L, 0, 0L, 16777214), ad6Var.c, ad6Var.d, ad6Var.e, ad6Var.f, ad6Var.g, ad6Var.h, ad6Var.i, ad6Var.j), bd6Var2.b, bd6Var2.c);
                            list.add(bd6Var);
                        } else {
                            bd6Var = null;
                        }
                        if (bd6Var != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        ko koVar3 = (ko) obj;
                        h86 h86Var2 = i86Var.Z;
                        nt1 nt1Var = nt1.x;
                        if (h86Var2 != null) {
                            if (!a34.i(koVar3, h86Var2.b)) {
                                h86Var2.b = koVar3;
                                q24 q24Var = h86Var2.d;
                                if (q24Var != null) {
                                    q24Var.g(koVar3, i86Var.M, i86Var.N, i86Var.P, i86Var.Q, i86Var.R, i86Var.S, nt1Var);
                                }
                            }
                        } else {
                            h86 h86Var22 = new h86(i86Var.L, koVar3);
                            q24 q24Var2 = new q24(koVar3, i86Var.M, i86Var.N, i86Var.P, i86Var.Q, i86Var.R, i86Var.S, nt1Var);
                            q24Var2.d(i86Var.a1().j);
                            h86Var22.d = q24Var2;
                            i86Var.Z = h86Var22;
                        }
                        z51.w(i86Var);
                        w65.E(i86Var);
                        v94.y(i86Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        h86 h86Var3 = i86Var.Z;
                        if (h86Var3 == null) {
                            z22 = false;
                        } else {
                            ub2 ub2Var = i86Var.V;
                            if (ub2Var != null) {
                                ub2Var.invoke(h86Var3);
                            }
                            h86 h86Var4 = i86Var.Z;
                            if (h86Var4 != null) {
                                h86Var4.c = booleanValue;
                            }
                            z51.w(i86Var);
                            w65.E(i86Var);
                            v94.y(i86Var);
                            z22 = true;
                        }
                        return Boolean.valueOf(z22);
                }
            }
        }));
        bi5Var.b(oh5.n, new o3(null, new nj4(this, (byte) 28)));
        zh5.a(bi5Var, g86Var2);
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    public final q24 a1() {
        q24 q24Var = this.X;
        if (q24Var == null) {
            q24 q24Var2 = new q24(this.L, this.M, this.N, this.P, this.Q, this.R, this.S, this.T);
            this.X = q24Var2;
            return q24Var2;
        }
        return q24Var;
    }

    @Override // defpackage.ra3
    public final int b0(yl3 yl3Var, ro3 ro3Var, int i) {
        return b1(yl3Var).a(i, yl3Var.getLayoutDirection());
    }

    public final q24 b1(ud1 ud1Var) {
        q24 q24Var;
        h86 h86Var = this.Z;
        if (h86Var != null && h86Var.c && (q24Var = h86Var.d) != null) {
            q24Var.d(ud1Var);
            return q24Var;
        }
        q24 a1 = a1();
        a1.d(ud1Var);
        return a1;
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            q24 b1 = b1(xo3Var);
            boolean c = b1.c(j, xo3Var.getLayoutDirection());
            bd6 bd6Var = b1.n;
            if (bd6Var != null) {
                long j2 = bd6Var.c;
                bd6Var.b.a.c();
                if (c) {
                    wc7.M(this, 2).g1();
                    ub2 ub2Var = this.O;
                    if (ub2Var != null) {
                        ub2Var.invoke(bd6Var);
                    }
                    Map map = this.W;
                    if (map == null) {
                        map = new LinkedHashMap(2);
                    }
                    map.put(i7.a, Integer.valueOf(Math.round(bd6Var.d)));
                    map.put(i7.b, Integer.valueOf(Math.round(bd6Var.e)));
                    this.W = map;
                }
                ub2 ub2Var2 = this.U;
                if (ub2Var2 != null) {
                    ub2Var2.invoke(bd6Var.f);
                }
                int i = (int) (j2 >> 32);
                int i2 = (int) (j2 & 4294967295L);
                em4 p = ro3Var.p(n03.p(i, i, i2, i2));
                Map map2 = this.W;
                map2.getClass();
                return xo3Var.L(i, i2, map2, new r0(p, (byte) 15));
            }
            throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + b1);
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.ra3
    public final int j(yl3 yl3Var, ro3 ro3Var, int i) {
        return rz5.a(b1(yl3Var).e(yl3Var.getLayoutDirection()).m());
    }

    @Override // defpackage.ra3
    public final int m0(yl3 yl3Var, ro3 ro3Var, int i) {
        return b1(yl3Var).a(i, yl3Var.getLayoutDirection());
    }

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        boolean z;
        List list;
        if (this.K) {
            vg0 y = bb3Var.x.y.y();
            q24 b1 = b1(bb3Var);
            bd6 bd6Var = b1.n;
            if (bd6Var != null) {
                o24 o24Var = bd6Var.b;
                boolean z2 = false;
                if (bd6Var.d() && this.P != 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    long j = bd6Var.c;
                    n05 g = n03.g(0L, (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L));
                    y.h();
                    vg0.q(y, g);
                }
                try {
                    pv5 pv5Var = this.M.a;
                    g96 g96Var = pv5Var.m;
                    if (g96Var == null) {
                        g96Var = g96.b;
                    }
                    g96 g96Var2 = g96Var;
                    km5 km5Var = pv5Var.n;
                    if (km5Var == null) {
                        km5Var = km5.d;
                    }
                    km5 km5Var2 = km5Var;
                    bb4 bb4Var = pv5Var.o;
                    if (bb4Var == null) {
                        bb4Var = y22.O;
                    }
                    bb4 bb4Var2 = bb4Var;
                    ka0 d = pv5Var.a.d();
                    if (d != null) {
                        o24.j(o24Var, y, d, this.M.a.a.e(), km5Var2, g96Var2, bb4Var2);
                    } else {
                        long j2 = ep0.i;
                        if (j2 == 16) {
                            if (this.M.b() != 16) {
                                j2 = this.M.b();
                            } else {
                                j2 = ep0.b;
                            }
                        }
                        o24.i(o24Var, y, j2, km5Var2, g96Var2, bb4Var2);
                    }
                    if (z) {
                        y.p();
                    }
                    h86 h86Var = this.Z;
                    if (h86Var == null || !h86Var.c) {
                        z2 = iz5.d(this.L);
                    }
                    if (!z2 && ((list = this.T) == null || list.isEmpty())) {
                        return;
                    }
                    bb3Var.a();
                } finally {
                }
            } else {
                ov3.p(b1, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
            }
        }
    }

    @Override // defpackage.ra3
    public final int y0(yl3 yl3Var, ro3 ro3Var, int i) {
        return rz5.a(b1(yl3Var).e(yl3Var.getLayoutDirection()).i());
    }
}
