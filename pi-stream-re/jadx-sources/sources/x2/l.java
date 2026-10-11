package x2;

import androidx.appcompat.widget.a0;
import c1.p0;
import c1.r0;
import c1.u;
import c1.v;
import d2.i0;
import d2.j0;
import f1.o;
import f1.s;
import f1.t;
import java.util.ArrayList;
import java.util.Arrays;
import r6.o0;

/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: n, reason: collision with root package name */
    public k f11135n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11136p;

    /* renamed from: q, reason: collision with root package name */
    public j0 f11137q;

    /* renamed from: r, reason: collision with root package name */
    public y.c f11138r;

    @Override // x2.j
    public final void a(long j4) {
        boolean z9;
        this.f11123g = j4;
        int i10 = 0;
        if (j4 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f11136p = z9;
        j0 j0Var = this.f11137q;
        if (j0Var != null) {
            i10 = j0Var.f3167e;
        }
        this.o = i10;
    }

    @Override // x2.j
    public final long b(t tVar) {
        int i10;
        int i11 = 0;
        byte b10 = tVar.f3858a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        k kVar = this.f11135n;
        w7.b.w(kVar);
        boolean z9 = kVar.f11133d[(b10 >> 1) & (255 >>> (8 - kVar.f11134e))].f3156a;
        j0 j0Var = kVar.f11130a;
        if (!z9) {
            i10 = j0Var.f3167e;
        } else {
            i10 = j0Var.f3168f;
        }
        if (this.f11136p) {
            i11 = (this.o + i10) / 4;
        }
        long j4 = i11;
        byte[] bArr = tVar.f3858a;
        int length = bArr.length;
        int i12 = tVar.f3860c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            tVar.E(copyOf, copyOf.length);
        } else {
            tVar.F(i12);
        }
        byte[] bArr2 = tVar.f3858a;
        int i13 = tVar.f3860c;
        bArr2[i13 - 4] = (byte) (j4 & 255);
        bArr2[i13 - 3] = (byte) ((j4 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j4 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j4 >>> 24) & 255);
        this.f11136p = true;
        this.o = i10;
        return j4;
    }

    @Override // x2.j
    public final boolean c(t tVar, long j4, a0 a0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        s sVar;
        long j10;
        s sVar2;
        int i14 = 0;
        if (this.f11135n != null) {
            ((v) a0Var.f403b).getClass();
            return false;
        }
        j0 j0Var = this.f11137q;
        k kVar = null;
        int i15 = 4;
        int i16 = 1;
        if (j0Var == null) {
            q6.g.r0(1, tVar, false);
            tVar.m();
            int v9 = tVar.v();
            int m5 = tVar.m();
            int i17 = tVar.i();
            if (i17 <= 0) {
                i17 = -1;
            }
            int i18 = i17;
            int i19 = tVar.i();
            if (i19 <= 0) {
                i19 = -1;
            }
            int i20 = i19;
            tVar.i();
            int v10 = tVar.v();
            int pow = (int) Math.pow(2.0d, v10 & 15);
            int pow2 = (int) Math.pow(2.0d, (v10 & 240) >> 4);
            tVar.v();
            this.f11137q = new j0(v9, m5, i18, i20, pow, pow2, Arrays.copyOf(tVar.f3858a, tVar.f3860c));
        } else {
            y.c cVar = this.f11138r;
            if (cVar == null) {
                this.f11138r = q6.g.X(tVar, true, true);
            } else {
                int i21 = tVar.f3860c;
                byte[] bArr = new byte[i21];
                System.arraycopy(tVar.f3858a, 0, bArr, 0, i21);
                int i22 = 5;
                q6.g.r0(5, tVar, false);
                int v11 = tVar.v() + 1;
                int i23 = 2;
                s sVar3 = new s(tVar.f3858a, 2, (Object) null);
                sVar3.r(tVar.f3859b * 8);
                while (true) {
                    int i24 = 16;
                    if (i14 < v11) {
                        if (sVar3.i(24) == 5653314) {
                            int i25 = sVar3.i(16);
                            int i26 = sVar3.i(24);
                            if (!sVar3.h()) {
                                boolean h10 = sVar3.h();
                                for (int i27 = 0; i27 < i26; i27++) {
                                    if (h10) {
                                        if (sVar3.h()) {
                                            sVar3.r(i22);
                                        }
                                    } else {
                                        sVar3.r(i22);
                                    }
                                }
                            } else {
                                sVar3.r(i22);
                                int i28 = 0;
                                while (i28 < i26) {
                                    int i29 = 0;
                                    for (int i30 = i26 - i28; i30 > 0; i30 >>>= 1) {
                                        i29++;
                                    }
                                    i28 += sVar3.i(i29);
                                }
                            }
                            int i31 = sVar3.i(i15);
                            if (i31 <= i23) {
                                if (i31 != i16 && i31 != i23) {
                                    sVar2 = sVar3;
                                } else {
                                    sVar3.r(32);
                                    sVar3.r(32);
                                    int i32 = sVar3.i(i15) + i16;
                                    sVar3.r(i16);
                                    if (i31 == i16) {
                                        if (i25 != 0) {
                                            sVar = sVar3;
                                            j10 = (long) Math.floor(Math.pow(i26, 1.0d / i25));
                                        } else {
                                            sVar = sVar3;
                                            j10 = 0;
                                        }
                                    } else {
                                        sVar = sVar3;
                                        j10 = i26 * i25;
                                    }
                                    int i33 = (int) (j10 * i32);
                                    sVar2 = sVar;
                                    sVar2.r(i33);
                                }
                                i14++;
                                i22 = 5;
                                sVar3 = sVar2;
                                i16 = 1;
                                i23 = 2;
                                i15 = 4;
                            } else {
                                throw r0.a("lookup type greater than 2 not decodable: " + i31, null);
                            }
                        } else {
                            throw r0.a("expected code book to start with [0x56, 0x43, 0x42] at " + sVar3.g(), null);
                        }
                    } else {
                        s sVar4 = sVar3;
                        int i34 = 6;
                        int i35 = sVar4.i(6) + 1;
                        for (int i36 = 0; i36 < i35; i36++) {
                            if (sVar4.i(16) != 0) {
                                throw r0.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i37 = 1;
                        int i38 = sVar4.i(6) + 1;
                        int i39 = 0;
                        int i40 = 2;
                        while (true) {
                            int i41 = 3;
                            if (i39 < i38) {
                                int i42 = sVar4.i(i24);
                                if (i42 != 0) {
                                    if (i42 == i37) {
                                        int i43 = sVar4.i(5);
                                        int[] iArr = new int[i43];
                                        int i44 = -1;
                                        for (int i45 = 0; i45 < i43; i45++) {
                                            int i46 = sVar4.i(4);
                                            iArr[i45] = i46;
                                            if (i46 > i44) {
                                                i44 = i46;
                                            }
                                        }
                                        int i47 = i44 + 1;
                                        int[] iArr2 = new int[i47];
                                        int i48 = 0;
                                        while (i48 < i47) {
                                            iArr2[i48] = sVar4.i(i41) + 1;
                                            int i49 = sVar4.i(i40);
                                            int i50 = 8;
                                            if (i49 > 0) {
                                                sVar4.r(8);
                                            }
                                            int i51 = 0;
                                            int i52 = i38;
                                            while (i51 < (1 << i49)) {
                                                sVar4.r(i50);
                                                i51++;
                                                i50 = 8;
                                            }
                                            i48++;
                                            i41 = 3;
                                            i40 = 2;
                                            i38 = i52;
                                        }
                                        i13 = i38;
                                        sVar4.r(i40);
                                        int i53 = sVar4.i(4);
                                        int i54 = 0;
                                        int i55 = 0;
                                        for (int i56 = 0; i56 < i43; i56++) {
                                            i54 += iArr2[iArr[i56]];
                                            while (i55 < i54) {
                                                sVar4.r(i53);
                                                i55++;
                                            }
                                        }
                                    } else {
                                        throw r0.a("floor type greater than 1 not decodable: " + i42, null);
                                    }
                                } else {
                                    i13 = i38;
                                    int i57 = 8;
                                    sVar4.r(8);
                                    sVar4.r(16);
                                    sVar4.r(16);
                                    sVar4.r(6);
                                    sVar4.r(8);
                                    int i58 = sVar4.i(4) + 1;
                                    int i59 = 0;
                                    while (i59 < i58) {
                                        sVar4.r(i57);
                                        i59++;
                                        i57 = 8;
                                    }
                                }
                                i39++;
                                i34 = 6;
                                i24 = 16;
                                i40 = 2;
                                i38 = i13;
                                i37 = 1;
                            } else {
                                int i60 = sVar4.i(i34) + 1;
                                int i61 = 0;
                                while (i61 < i60) {
                                    if (sVar4.i(16) <= 2) {
                                        sVar4.r(24);
                                        sVar4.r(24);
                                        sVar4.r(24);
                                        int i62 = sVar4.i(i34) + 1;
                                        int i63 = 8;
                                        sVar4.r(8);
                                        int[] iArr3 = new int[i62];
                                        for (int i64 = 0; i64 < i62; i64++) {
                                            int i65 = sVar4.i(3);
                                            if (sVar4.h()) {
                                                i12 = sVar4.i(5);
                                            } else {
                                                i12 = 0;
                                            }
                                            iArr3[i64] = (i12 * 8) + i65;
                                        }
                                        int i66 = 0;
                                        while (i66 < i62) {
                                            int i67 = 0;
                                            while (i67 < i63) {
                                                if ((iArr3[i66] & (1 << i67)) != 0) {
                                                    sVar4.r(i63);
                                                }
                                                i67++;
                                                i63 = 8;
                                            }
                                            i66++;
                                            i63 = 8;
                                        }
                                        i61++;
                                        i34 = 6;
                                    } else {
                                        throw r0.a("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int i68 = sVar4.i(i34) + 1;
                                for (int i69 = 0; i69 < i68; i69++) {
                                    int i70 = sVar4.i(16);
                                    if (i70 != 0) {
                                        o.c("VorbisUtil", "mapping type other than 0 not supported: " + i70);
                                    } else {
                                        if (sVar4.h()) {
                                            i10 = 1;
                                            i11 = sVar4.i(4) + 1;
                                        } else {
                                            i10 = 1;
                                            i11 = 1;
                                        }
                                        boolean h11 = sVar4.h();
                                        int i71 = j0Var.f3163a;
                                        if (h11) {
                                            int i72 = sVar4.i(8) + i10;
                                            for (int i73 = 0; i73 < i72; i73++) {
                                                int i74 = i71 - 1;
                                                int i75 = 0;
                                                for (int i76 = i74; i76 > 0; i76 >>>= 1) {
                                                    i75++;
                                                }
                                                sVar4.r(i75);
                                                int i77 = 0;
                                                while (i74 > 0) {
                                                    i77++;
                                                    i74 >>>= 1;
                                                }
                                                sVar4.r(i77);
                                            }
                                        }
                                        if (sVar4.i(2) == 0) {
                                            if (i11 > 1) {
                                                for (int i78 = 0; i78 < i71; i78++) {
                                                    sVar4.r(4);
                                                }
                                            }
                                            for (int i79 = 0; i79 < i11; i79++) {
                                                sVar4.r(8);
                                                sVar4.r(8);
                                                sVar4.r(8);
                                            }
                                        } else {
                                            throw r0.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int i80 = sVar4.i(6) + 1;
                                i0[] i0VarArr = new i0[i80];
                                for (int i81 = 0; i81 < i80; i81++) {
                                    boolean h12 = sVar4.h();
                                    sVar4.i(16);
                                    sVar4.i(16);
                                    sVar4.i(8);
                                    i0VarArr[i81] = new i0(h12);
                                }
                                if (sVar4.h()) {
                                    int i82 = 0;
                                    for (int i83 = i80 - 1; i83 > 0; i83 >>>= 1) {
                                        i82++;
                                    }
                                    kVar = new k(j0Var, cVar, bArr, i0VarArr, i82);
                                } else {
                                    throw r0.a("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f11135n = kVar;
        if (kVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        j0 j0Var2 = kVar.f11130a;
        arrayList.add(j0Var2.f3169g);
        arrayList.add(kVar.f11132c);
        p0 J = q6.g.J(o0.k((String[]) kVar.f11131b.f11425c));
        u k10 = a3.g.k("audio/vorbis");
        k10.f1903g = j0Var2.f3166d;
        k10.f1904h = j0Var2.f3165c;
        k10.f1920y = j0Var2.f3163a;
        k10.f1921z = j0Var2.f3164b;
        k10.f1910n = arrayList;
        k10.f1906j = J;
        a0Var.f403b = new v(k10);
        return true;
    }

    @Override // x2.j
    public final void d(boolean z9) {
        super.d(z9);
        if (z9) {
            this.f11135n = null;
            this.f11137q = null;
            this.f11138r = null;
        }
        this.o = 0;
        this.f11136p = false;
    }
}
