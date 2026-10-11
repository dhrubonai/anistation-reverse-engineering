package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uc5 extends xz3 implements ra3, sh5 {
    public yc5 L;
    public boolean M;

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        zh5.i(bi5Var);
        final byte b = 0;
        final byte b2 = 1;
        hc5 hc5Var = new hc5(new sb2(this) { // from class: tc5
            public final /* synthetic */ uc5 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                int h;
                byte b3 = b;
                uc5 uc5Var = this.y;
                switch (b3) {
                    case 0:
                        h = uc5Var.L.a.h();
                        break;
                    default:
                        h = uc5Var.L.f.h();
                        break;
                }
                return Float.valueOf(h);
            }
        }, new sb2(this) { // from class: tc5
            public final /* synthetic */ uc5 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                int h;
                byte b3 = b2;
                uc5 uc5Var = this.y;
                switch (b3) {
                    case 0:
                        h = uc5Var.L.a.h();
                        break;
                    default:
                        h = uc5Var.L.f.h();
                        break;
                }
                return Float.valueOf(h);
            }
        });
        if (this.M) {
            ai5 ai5Var = yh5.w;
            w73 w73Var = zh5.a[13];
            ai5Var.getClass();
            bi5Var.b(ai5Var, hc5Var);
            return;
        }
        ai5 ai5Var2 = yh5.v;
        w73 w73Var2 = zh5.a[12];
        ai5Var2.getClass();
        bi5Var.b(ai5Var2, hc5Var);
    }

    @Override // defpackage.ra3
    public final int b0(yl3 yl3Var, ro3 ro3Var, int i) {
        if (!this.M) {
            i = Integer.MAX_VALUE;
        }
        return ro3Var.c(i);
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        rg4 rg4Var;
        int g;
        int i;
        int i2;
        if (this.M) {
            rg4Var = rg4.x;
        } else {
            rg4Var = rg4.y;
        }
        h41.g(j, rg4Var);
        int i3 = Integer.MAX_VALUE;
        if (this.M) {
            g = Integer.MAX_VALUE;
        } else {
            g = rx0.g(j);
        }
        if (this.M) {
            i3 = rx0.h(j);
        }
        em4 p = ro3Var.p(rx0.a(j, 0, i3, 0, g, 5));
        int i4 = p.x;
        int h = rx0.h(j);
        if (i4 > h) {
            i4 = h;
        }
        int i5 = p.y;
        int g2 = rx0.g(j);
        if (i5 > g2) {
            i5 = g2;
        }
        int i6 = p.y - i5;
        int i7 = p.x - i4;
        if (!this.M) {
            i6 = i7;
        }
        this.L.f(i6);
        yc5 yc5Var = this.L;
        if (this.M) {
            i = i5;
        } else {
            i = i4;
        }
        yc5Var.b.i(i);
        yc5 yc5Var2 = this.L;
        if (this.M) {
            i2 = p.y;
        } else {
            i2 = p.x;
        }
        yc5Var2.c.i(i2);
        this.L.d.setValue(Boolean.FALSE);
        return xo3Var.L(i4, i5, ot1.x, new vm((byte) 3, i6, this, p));
    }

    @Override // defpackage.ra3
    public final int j(yl3 yl3Var, ro3 ro3Var, int i) {
        if (this.M) {
            i = Integer.MAX_VALUE;
        }
        return ro3Var.n(i);
    }

    @Override // defpackage.ra3
    public final int m0(yl3 yl3Var, ro3 ro3Var, int i) {
        if (!this.M) {
            i = Integer.MAX_VALUE;
        }
        return ro3Var.O(i);
    }

    @Override // defpackage.ra3
    public final int y0(yl3 yl3Var, ro3 ro3Var, int i) {
        if (this.M) {
            i = Integer.MAX_VALUE;
        }
        return ro3Var.k(i);
    }
}
