package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ib3 implements wo3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wo3 b;
    public final /* synthetic */ mb3 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ wo3 e;

    public /* synthetic */ ib3(wo3 wo3Var, mb3 mb3Var, int i, wo3 wo3Var2, byte b) {
        this.a = b;
        this.c = mb3Var;
        this.d = i;
        this.e = wo3Var2;
        this.b = wo3Var;
    }

    @Override // defpackage.wo3
    public final Map a() {
        switch (this.a) {
            case 0:
                return this.b.a();
            default:
                return this.b.a();
        }
    }

    @Override // defpackage.wo3
    public final void b() {
        int i;
        byte b = this.a;
        wo3 wo3Var = this.e;
        int i2 = this.d;
        mb3 mb3Var = this.c;
        switch (b) {
            case 0:
                mb3Var.B = i2;
                wo3Var.b();
                z44 z44Var = mb3Var.J;
                p44 p44Var = mb3Var.I;
                long[] jArr = p44Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    Object obj = p44Var.b[i7];
                                    v06 v06Var = (v06) p44Var.c[i7];
                                    int j2 = z44Var.j(obj);
                                    if (j2 < 0 || j2 >= mb3Var.B) {
                                        if (j2 >= 0) {
                                            Object obj2 = te4.k;
                                            i = i4;
                                            Object[] objArr = z44Var.x;
                                            Object obj3 = objArr[j2];
                                            objArr[j2] = obj2;
                                        } else {
                                            i = i4;
                                        }
                                        if (mb3Var.G.b(obj)) {
                                            v06Var.dispose();
                                        }
                                        p44Var.m(i7);
                                        j >>= i;
                                        i6++;
                                        i4 = i;
                                    }
                                }
                                i = i4;
                                j >>= i;
                                i6++;
                                i4 = i;
                            }
                            if (i5 != i4) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        }
                    }
                }
                mb3Var.f(mb3Var.A);
                return;
            default:
                mb3Var.A = i2;
                wo3Var.b();
                if (mb3Var.x.E == null) {
                    mb3Var.f(mb3Var.A);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.wo3
    public final ub2 c() {
        switch (this.a) {
            case 0:
                return this.b.c();
            default:
                return this.b.c();
        }
    }

    @Override // defpackage.wo3
    public final ic2 d() {
        switch (this.a) {
            case 0:
                return this.b.d();
            default:
                return this.b.d();
        }
    }

    @Override // defpackage.wo3
    public final ub2 e() {
        switch (this.a) {
            case 0:
                return this.b.e();
            default:
                return this.b.e();
        }
    }

    @Override // defpackage.wo3
    public final int getHeight() {
        switch (this.a) {
            case 0:
                return this.b.getHeight();
            default:
                return this.b.getHeight();
        }
    }

    @Override // defpackage.wo3
    public final int getWidth() {
        switch (this.a) {
            case 0:
                return this.b.getWidth();
            default:
                return this.b.getWidth();
        }
    }
}
