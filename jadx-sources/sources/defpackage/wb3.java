package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wb3 implements hd3 {
    public final wc3 a;

    public wb3(wc3 wc3Var) {
        this.a = wc3Var;
    }

    @Override // defpackage.hd3
    public final int a() {
        return this.a.g().q;
    }

    @Override // defpackage.hd3
    public final int b() {
        return ((nc3) yo0.r0(this.a.g().n)).a;
    }

    @Override // defpackage.hd3
    public final int c() {
        long g;
        boolean z;
        int i;
        int i2;
        int i3;
        long j;
        wc3 wc3Var = this.a;
        int i4 = 0;
        if (wc3Var.g().n.isEmpty()) {
            return 0;
        }
        mc3 g2 = wc3Var.g();
        rg4 rg4Var = g2.r;
        rg4 rg4Var2 = rg4.x;
        if (rg4Var == rg4Var2) {
            g = g2.g() & 4294967295L;
        } else {
            g = g2.g() >> 32;
        }
        int i5 = (int) g;
        mc3 g3 = wc3Var.g();
        rg4 rg4Var3 = g3.r;
        List list = g3.n;
        if (rg4Var3 == rg4Var2) {
            z = true;
        } else {
            z = false;
        }
        if (!list.isEmpty()) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < list.size()) {
                nc3 nc3Var = (nc3) list.get(i6);
                if (z) {
                    i2 = nc3Var.y;
                } else {
                    i2 = nc3Var.z;
                }
                if (i2 == -1) {
                    i6++;
                } else {
                    int i9 = 0;
                    while (i6 < list.size()) {
                        nc3 nc3Var2 = (nc3) list.get(i6);
                        if (z) {
                            i3 = nc3Var2.y;
                        } else {
                            i3 = nc3Var2.z;
                        }
                        if (i3 != i2) {
                            break;
                        }
                        if (z) {
                            j = ((nc3) list.get(i6)).w & 4294967295L;
                        } else {
                            j = ((nc3) list.get(i6)).w >> 32;
                        }
                        i9 = Math.max(i9, (int) j);
                        i6++;
                    }
                    i7 += i9;
                    i8++;
                }
            }
            i4 = (i7 / i8) + g3.t;
        }
        if (i4 == 0 || (i = i5 / i4) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.hd3
    public final boolean d() {
        return !this.a.g().n.isEmpty();
    }

    @Override // defpackage.hd3
    public final int e() {
        return this.a.d.b.h();
    }
}
