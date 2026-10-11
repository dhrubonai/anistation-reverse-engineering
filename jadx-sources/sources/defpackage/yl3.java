package defpackage;

import com.anistation.model.settings.SubtitleArgbColor;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class yl3 extends em4 implements x04, lh4, xo3 {
    public static final p03 P = new p03(17);
    public static final p03 Q = new p03(18);
    public wl3 C;
    public ub2 D;
    public ic2 E;
    public ub2 F;
    public gm4 G;
    public p44 H;
    public boolean I;
    public p44 J;
    public boolean K;
    public boolean L;
    public final zl3 M = new zl3(this, 0);
    public sp N;
    public p44 O;

    public static void F0(fa4 fa4Var) {
        za3 za3Var;
        ab3 ab3Var;
        fa4 fa4Var2 = fa4Var.S;
        za3 za3Var2 = fa4Var.R;
        if (fa4Var2 != null) {
            za3Var = fa4Var2.R;
        } else {
            za3Var = null;
        }
        if (!a34.i(za3Var, za3Var2)) {
            za3Var2.d0.p.V.f();
            return;
        }
        j7 f = za3Var2.d0.p.f();
        if (f != null && (ab3Var = ((uo3) f).V) != null) {
            ab3Var.f();
        }
    }

    public final wl3 B0() {
        wl3 wl3Var = this.C;
        if (wl3Var == null) {
            wl3 wl3Var2 = new wl3(this);
            this.C = wl3Var2;
            return wl3Var2;
        }
        return wl3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0(q44 q44Var) {
        za3 za3Var;
        Object[] objArr = q44Var.b;
        long[] jArr = q44Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (za3Var = (za3) ((c37) objArr[(i << 3) + i3]).get()) != null) {
                            if (d0()) {
                                za3Var.T(false);
                            } else {
                                za3Var.V(false);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void K0();

    public final void L0() {
        sp spVar = this.N;
        if (spVar != null) {
            int i = spVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                ((yn2[]) spVar.b)[i2] = null;
                ((float[]) spVar.c)[i2] = Float.NaN;
                ((byte[]) spVar.d)[i2] = 0;
            }
            spVar.a = 0;
        }
        p44 p44Var = this.O;
        if (p44Var == null) {
            return;
        }
        Object[] objArr = p44Var.c;
        long[] jArr = p44Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            I0((q44) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        p44Var.a();
    }

    @Override // defpackage.em4
    public final int P(f7 f7Var) {
        int j0;
        long j;
        if (!r0() || (j0 = j0(f7Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = f7Var instanceof es6;
        long j2 = this.B;
        if (z) {
            j = j2 >> 32;
        } else {
            j = 4294967295L & j2;
        }
        return j0 + ((int) j);
    }

    public boolean d0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(defpackage.za3 r32, defpackage.yn2 r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl3.f0(za3, yn2):void");
    }

    public abstract int j0(f7 f7Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0(final gm4 gm4Var, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        za3 za3Var;
        boolean z2;
        int i;
        char c2;
        long j6;
        yl3 yl3Var;
        q44 q44Var;
        mh4 snapshotObserver;
        p44 p44Var = this.O;
        sp spVar = this.N;
        if (spVar == null) {
            spVar = new sp();
            this.N = spVar;
        }
        sp spVar2 = spVar;
        kh4 kh4Var = t0().K;
        if (kh4Var != null && (snapshotObserver = ((oa) kh4Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.d(gm4Var, P, new sb2() { // from class: vl3
                @Override // defpackage.sb2
                public final Object invoke() {
                    yl3 yl3Var2 = yl3.this;
                    yl3Var2.B0().x = false;
                    yl3Var2.B0().y = j;
                    yl3Var2.B0().z = j2;
                    ub2 e = gm4Var.x.e();
                    if (e != null) {
                        e.invoke(yl3Var2.B0());
                    }
                    return pn6.a;
                }
            });
        }
        boolean d0 = d0();
        q44 q44Var2 = (q44) spVar2.e;
        q44 q44Var3 = (q44) spVar2.f;
        int i2 = spVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) spVar2.d)[i3];
            if (b == 3) {
                yn2 yn2Var = ((yn2[]) spVar2.b)[i3];
                yn2Var.getClass();
                q44Var3.k(yn2Var);
            } else if (b != 0 && p44Var != null) {
                yn2 yn2Var2 = ((yn2[]) spVar2.b)[i3];
                yn2Var2.getClass();
                q44 q44Var4 = (q44) p44Var.l(yn2Var2);
                if (q44Var4 != null) {
                    q44Var2.j(q44Var4);
                }
            }
        }
        int i4 = spVar2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) spVar2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                yn2[] yn2VarArr = (yn2[]) spVar2.b;
                yn2VarArr[i6 - i5] = yn2VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = spVar2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((yn2[]) spVar2.b)[i8] = null;
        }
        spVar2.a -= i5;
        yl3 y0 = y0();
        Object[] objArr = q44Var3.b;
        long[] jArr = q44Var3.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            yn2 yn2Var3 = (yn2) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            if (y0 == null) {
                                yl3Var = this;
                            } else {
                                yl3Var = y0;
                            }
                            i = i9;
                            yl3 yl3Var2 = yl3Var;
                            while (true) {
                                sp spVar3 = yl3Var2.N;
                                if (spVar3 != null) {
                                    z2 = d0;
                                    if (ms.t0((yn2[]) spVar3.b, yn2Var3)) {
                                        break;
                                    }
                                } else {
                                    z2 = d0;
                                }
                                yl3 y02 = yl3Var2.y0();
                                if (y02 == null) {
                                    break;
                                }
                                yl3Var2 = y02;
                                d0 = z2;
                            }
                            p44 p44Var2 = yl3Var2.O;
                            if (p44Var2 != null) {
                                q44Var = (q44) p44Var2.l(yn2Var3);
                            } else {
                                q44Var = null;
                            }
                            if (q44Var != null) {
                                yl3Var.I0(q44Var);
                            }
                        } else {
                            z2 = d0;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        d0 = z2;
                    }
                    z = d0;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = d0;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                d0 = z;
                i9 = 8;
            }
        } else {
            z = d0;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        q44Var3.b();
        Object[] objArr2 = q44Var2.b;
        long[] jArr2 = q44Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (za3Var = (za3) ((c37) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                za3Var.T(false);
                            } else {
                                za3Var.V(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        q44Var2.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(defpackage.wo3 r28) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl3.m0(wo3):void");
    }

    public abstract yl3 o0();

    public abstract ha3 q0();

    public abstract boolean r0();

    public abstract za3 t0();

    public boolean u() {
        return t0().I();
    }

    public abstract wo3 u0();

    @Override // defpackage.xo3
    public final wo3 v0(int i, int i2, Map map, ub2 ub2Var, ub2 ub2Var2) {
        if ((i & SubtitleArgbColor.BLACK) != 0 || ((-16777216) & i2) != 0) {
            ez2.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new xl3(i, i2, map, ub2Var, ub2Var2, this);
    }

    public abstract yl3 y0();

    @Override // defpackage.x04
    public final void z(boolean z) {
        za3 za3Var;
        va3 va3Var;
        yl3 y0 = y0();
        va3 va3Var2 = null;
        if (y0 != null) {
            za3Var = y0.t0();
        } else {
            za3Var = null;
        }
        if (a34.i(za3Var, t0())) {
            this.I = z;
            return;
        }
        if (za3Var != null) {
            va3Var = za3Var.d0.d;
        } else {
            va3Var = null;
        }
        if (va3Var != va3.z) {
            if (za3Var != null) {
                va3Var2 = za3Var.d0.d;
            }
            if (va3Var2 != va3.A) {
                return;
            }
        }
        this.I = z;
    }

    public abstract long z0();
}
