package w2;

import android.util.Pair;
import c1.q0;
import c1.r0;
import c1.v;
import d2.x;
import f1.b0;
import f1.t;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f10810a = b0.G("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0169, code lost:
    
        if (r7 == (-1)) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(f1.t r31, int r32, int r33, int r34, int r35, java.lang.String r36, boolean r37, c1.p r38, c.j r39, int r40) {
        /*
            Method dump skipped, instructions count: 1657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.f.a(f1.t, int, int, int, int, java.lang.String, boolean, c1.p, c.j, int):void");
    }

    public static d b(int i10, t tVar) {
        long j4;
        long j10;
        tVar.G(i10 + 8 + 4);
        tVar.H(1);
        c(tVar);
        tVar.H(2);
        int v9 = tVar.v();
        if ((v9 & 128) != 0) {
            tVar.H(2);
        }
        if ((v9 & 64) != 0) {
            tVar.H(tVar.v());
        }
        if ((v9 & 32) != 0) {
            tVar.H(2);
        }
        tVar.H(1);
        c(tVar);
        String f10 = q0.f(tVar.v());
        if (!"audio/mpeg".equals(f10) && !"audio/vnd.dts".equals(f10) && !"audio/vnd.dts.hd".equals(f10)) {
            tVar.H(4);
            long w9 = tVar.w();
            long w10 = tVar.w();
            tVar.H(1);
            int c6 = c(tVar);
            byte[] bArr = new byte[c6];
            tVar.d(bArr, 0, c6);
            if (w10 > 0) {
                j4 = w10;
            } else {
                j4 = -1;
            }
            if (w9 > 0) {
                j10 = w9;
            } else {
                j10 = -1;
            }
            return new d(f10, bArr, j4, j10);
        }
        return new d(f10, null, -1L, -1L);
    }

    public static int c(t tVar) {
        int v9 = tVar.v();
        int i10 = v9 & 127;
        while ((v9 & 128) == 128) {
            v9 = tVar.v();
            i10 = (i10 << 7) | (v9 & 127);
        }
        return i10;
    }

    public static g1.c d(t tVar) {
        long o;
        long o6;
        tVar.G(8);
        if (((tVar.f() >> 24) & 255) == 0) {
            o = tVar.w();
            o6 = tVar.w();
        } else {
            o = tVar.o();
            o6 = tVar.o();
        }
        return new g1.c(o, o6, tVar.w());
    }

    public static Pair e(int i10, int i11, t tVar) {
        boolean z9;
        boolean z10;
        boolean z11;
        Integer num;
        q qVar;
        Pair create;
        int i12;
        int i13;
        boolean z12;
        byte[] bArr;
        int i14 = tVar.f3859b;
        while (i14 - i10 < i11) {
            tVar.G(i14);
            int f10 = tVar.f();
            boolean z13 = true;
            if (f10 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            a0.d("childAtomSize must be positive", z9);
            if (tVar.f() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                String str = null;
                Integer num2 = null;
                while (i15 - i14 < f10) {
                    tVar.G(i15);
                    int f11 = tVar.f();
                    int f12 = tVar.f();
                    if (f12 == 1718775137) {
                        num2 = Integer.valueOf(tVar.f());
                    } else if (f12 == 1935894637) {
                        tVar.H(4);
                        str = tVar.s(4);
                    } else if (f12 == 1935894633) {
                        i17 = i15;
                        i16 = f11;
                    }
                    i15 += f11;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a0.d("frma atom is mandatory", z10);
                    if (i17 != -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a0.d("schi atom is mandatory", z11);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 < i16) {
                            tVar.G(i18);
                            int f13 = tVar.f();
                            if (tVar.f() == 1952804451) {
                                int f14 = (tVar.f() >> 24) & 255;
                                tVar.H(1);
                                if (f14 == 0) {
                                    tVar.H(1);
                                    i12 = 0;
                                    i13 = 0;
                                } else {
                                    int v9 = tVar.v();
                                    int i19 = (v9 & 240) >> 4;
                                    i12 = v9 & 15;
                                    i13 = i19;
                                }
                                if (tVar.v() == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                int v10 = tVar.v();
                                byte[] bArr2 = new byte[16];
                                tVar.d(bArr2, 0, 16);
                                if (z12 && v10 == 0) {
                                    int v11 = tVar.v();
                                    byte[] bArr3 = new byte[v11];
                                    tVar.d(bArr3, 0, v11);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                qVar = new q(z12, str, v10, bArr2, i13, i12, bArr);
                            } else {
                                i18 += f13;
                            }
                        } else {
                            num = num2;
                            qVar = null;
                            break;
                        }
                    }
                    if (qVar == null) {
                        z13 = false;
                    }
                    a0.d("tenc atom is mandatory", z13);
                    int i20 = b0.f3799a;
                    create = Pair.create(num, qVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += f10;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s f(p pVar, a aVar, x xVar) {
        e pVar2;
        boolean z9;
        t tVar;
        t tVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        long[] jArr;
        v vVar;
        int i14;
        boolean z11;
        int i15;
        p pVar3;
        String str;
        int i16;
        int[] iArr;
        long j4;
        long[] jArr2;
        int i17;
        int[] iArr2;
        int i18;
        int i19;
        int i20;
        int[] iArr3;
        int i21;
        int i22;
        long[] jArr3;
        int i23;
        int i24;
        boolean z12;
        int i25;
        long[] jArr4;
        int[] iArr4;
        int[] iArr5;
        long[] jArr5;
        int[] iArr6;
        int[] iArr7;
        boolean z13;
        long[] jArr6;
        int i26;
        int i27;
        int i28;
        boolean z14;
        b i29 = aVar.i(1937011578);
        v vVar2 = pVar.f10898f;
        if (i29 != null) {
            pVar2 = new s0.b(i29, vVar2);
        } else {
            b i30 = aVar.i(1937013298);
            if (i30 != null) {
                pVar2 = new f1.p(i30);
            } else {
                throw r0.a("Track has no sample table size information", null);
            }
        }
        int b10 = pVar2.b();
        if (b10 == 0) {
            return new s(pVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        b i31 = aVar.i(1937007471);
        if (i31 == null) {
            i31 = aVar.i(1668232756);
            i31.getClass();
            z9 = true;
        } else {
            z9 = false;
        }
        b i32 = aVar.i(1937011555);
        i32.getClass();
        b i33 = aVar.i(1937011827);
        i33.getClass();
        b i34 = aVar.i(1937011571);
        if (i34 != null) {
            tVar = i34.f10796c;
        } else {
            tVar = null;
        }
        b i35 = aVar.i(1668576371);
        if (i35 != null) {
            tVar2 = i35.f10796c;
        } else {
            tVar2 = null;
        }
        c cVar = new c(i32.f10796c, i31.f10796c, z9);
        t tVar3 = i33.f10796c;
        tVar3.G(12);
        int y9 = tVar3.y() - 1;
        int y10 = tVar3.y();
        int y11 = tVar3.y();
        if (tVar2 != null) {
            tVar2.G(12);
            i10 = tVar2.y();
        } else {
            i10 = 0;
        }
        if (tVar != null) {
            tVar.G(12);
            i12 = tVar.y();
            if (i12 > 0) {
                i11 = tVar.y() - 1;
            } else {
                i11 = -1;
                tVar = null;
            }
        } else {
            i11 = -1;
            i12 = 0;
        }
        int a10 = pVar2.a();
        String str2 = vVar2.f1935m;
        if (a10 != -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && y9 == 0 && i10 == 0 && i12 == 0)) {
            i13 = i12;
            z10 = true;
        } else {
            i13 = i12;
            z10 = false;
        }
        if (z10) {
            int i36 = cVar.f10797a;
            long[] jArr7 = new long[i36];
            int[] iArr8 = new int[i36];
            while (cVar.a()) {
                int i37 = cVar.f10798b;
                jArr7[i37] = cVar.f10800d;
                iArr8[i37] = cVar.f10799c;
            }
            long j10 = y11;
            int i38 = 8192 / a10;
            int i39 = 0;
            for (int i40 = 0; i40 < i36; i40++) {
                int i41 = iArr8[i40];
                int i42 = b0.f3799a;
                i39 += ((i41 + i38) - 1) / i38;
            }
            long[] jArr8 = new long[i39];
            int[] iArr9 = new int[i39];
            long[] jArr9 = new long[i39];
            int[] iArr10 = new int[i39];
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            while (i44 < i36) {
                int i47 = iArr8[i44];
                long j11 = jArr7[i44];
                int i48 = i46;
                int i49 = i36;
                int i50 = i45;
                int i51 = i48;
                long[] jArr10 = jArr7;
                int i52 = i47;
                while (i52 > 0) {
                    int min = Math.min(i38, i52);
                    jArr8[i51] = j11;
                    int[] iArr11 = iArr8;
                    int i53 = a10 * min;
                    iArr9[i51] = i53;
                    i50 = Math.max(i50, i53);
                    jArr9[i51] = i43 * j10;
                    iArr10[i51] = 1;
                    j11 += iArr9[i51];
                    i43 += min;
                    i52 -= min;
                    i51++;
                    iArr8 = iArr11;
                    a10 = a10;
                }
                i44++;
                jArr7 = jArr10;
                int i54 = i51;
                i45 = i50;
                i36 = i49;
                i46 = i54;
            }
            long j12 = j10 * i43;
            pVar3 = pVar;
            i16 = b10;
            vVar = vVar2;
            jArr2 = jArr9;
            iArr2 = iArr10;
            jArr = jArr8;
            iArr = iArr9;
            i17 = i45;
            j4 = j12;
        } else {
            jArr = new long[b10];
            int[] iArr12 = new int[b10];
            long[] jArr11 = new long[b10];
            int[] iArr13 = new int[b10];
            int i55 = y9;
            int i56 = i13;
            int i57 = 0;
            int i58 = 0;
            long j13 = 0;
            int i59 = 0;
            int i60 = 0;
            long j14 = 0;
            vVar = vVar2;
            int i61 = i11;
            int i62 = 0;
            while (true) {
                if (i57 < b10) {
                    long j15 = j13;
                    boolean z15 = true;
                    while (i62 == 0) {
                        z15 = cVar.a();
                        if (!z15) {
                            break;
                        }
                        int i63 = y10;
                        long j16 = cVar.f10800d;
                        i62 = cVar.f10799c;
                        j15 = j16;
                        tVar = tVar;
                        y10 = i63;
                        b10 = b10;
                    }
                    int i64 = b10;
                    i14 = y10;
                    t tVar4 = tVar;
                    if (!z15) {
                        f1.o.f("AtomParsers", "Unexpected end of chunk data");
                        jArr = Arrays.copyOf(jArr, i57);
                        iArr12 = Arrays.copyOf(iArr12, i57);
                        jArr11 = Arrays.copyOf(jArr11, i57);
                        iArr13 = Arrays.copyOf(iArr13, i57);
                        b10 = i57;
                        break;
                    }
                    if (tVar2 != null) {
                        while (i60 == 0 && i10 > 0) {
                            i60 = tVar2.y();
                            i59 = tVar2.f();
                            i10--;
                        }
                        i60--;
                    }
                    int i65 = i59;
                    jArr[i57] = j15;
                    int c6 = pVar2.c();
                    iArr12[i57] = c6;
                    if (c6 > i58) {
                        i58 = c6;
                    }
                    jArr11[i57] = j14 + i65;
                    if (tVar4 == null) {
                        i18 = 1;
                    } else {
                        i18 = 0;
                    }
                    iArr13[i57] = i18;
                    if (i57 == i61) {
                        iArr13[i57] = 1;
                        i56--;
                        if (i56 > 0) {
                            tVar4.getClass();
                            i61 = tVar4.y() - 1;
                        }
                    }
                    j14 += y11;
                    y10 = i14 - 1;
                    if (y10 == 0 && i55 > 0) {
                        int y12 = tVar3.y();
                        i19 = i55 - 1;
                        y11 = tVar3.f();
                        y10 = y12;
                    } else {
                        i19 = i55;
                    }
                    long[] jArr12 = jArr;
                    i59 = i65;
                    long j17 = j15 + iArr12[i57];
                    i62--;
                    i57++;
                    i55 = i19;
                    tVar = tVar4;
                    jArr = jArr12;
                    j13 = j17;
                    b10 = i64;
                } else {
                    i14 = y10;
                    break;
                }
            }
            int i66 = i62;
            long j18 = j14 + i59;
            if (tVar2 != null) {
                while (i10 > 0) {
                    if (tVar2.y() != 0) {
                        z11 = false;
                        break;
                    }
                    tVar2.f();
                    i10--;
                }
            }
            z11 = true;
            if (i56 == 0 && i14 == 0 && i66 == 0 && i55 == 0) {
                i15 = i60;
                if (i15 == 0 && z11) {
                    pVar3 = pVar;
                    i16 = b10;
                    iArr = iArr12;
                    j4 = j18;
                    jArr2 = jArr11;
                    i17 = i58;
                    iArr2 = iArr13;
                }
            } else {
                i15 = i60;
            }
            StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
            pVar3 = pVar;
            sb.append(pVar3.f10893a);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i56);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i14);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i66);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i55);
            sb.append(", remainingSamplesAtTimestampOffset ");
            sb.append(i15);
            if (!z11) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            sb.append(str);
            f1.o.f("AtomParsers", sb.toString());
            i16 = b10;
            iArr = iArr12;
            j4 = j18;
            jArr2 = jArr11;
            i17 = i58;
            iArr2 = iArr13;
        }
        long V = b0.V(j4, 1000000L, pVar3.f10895c);
        long j19 = pVar3.f10895c;
        long[] jArr13 = pVar3.f10900h;
        if (jArr13 == null) {
            b0.W(jArr2, j19);
            return new s(pVar, jArr, iArr, i17, jArr2, iArr2, V);
        }
        int length = jArr13.length;
        int i67 = pVar3.f10894b;
        long[] jArr14 = pVar3.f10901i;
        if (length == 1 && i67 == 1 && jArr2.length >= 2) {
            jArr14.getClass();
            long j20 = jArr14[0];
            i22 = i67;
            iArr3 = iArr;
            i21 = i17;
            long V2 = b0.V(jArr13[0], pVar3.f10895c, pVar3.f10896d) + j20;
            int length2 = jArr2.length - 1;
            i20 = i16;
            int h10 = b0.h(4, 0, length2);
            jArr3 = jArr14;
            int h11 = b0.h(jArr2.length - 4, 0, length2);
            long j21 = jArr2[0];
            if (j21 <= j20 && j20 < jArr2[h10] && jArr2[h11] < V2 && V2 <= j4) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long j22 = j4 - V2;
                v vVar3 = vVar;
                long V3 = b0.V(j20 - j21, vVar3.A, pVar3.f10895c);
                long V4 = b0.V(j22, vVar3.A, pVar3.f10895c);
                if ((V3 != 0 || V4 != 0) && V3 <= 2147483647L && V4 <= 2147483647L) {
                    xVar.f3209a = (int) V3;
                    xVar.f3210b = (int) V4;
                    b0.W(jArr2, j19);
                    return new s(pVar, jArr, iArr3, i21, jArr2, iArr2, b0.V(jArr13[0], 1000000L, pVar3.f10896d));
                }
            }
        } else {
            i20 = i16;
            iArr3 = iArr;
            i21 = i17;
            i22 = i67;
            jArr3 = jArr14;
        }
        int i68 = 1;
        if (jArr13.length == 1) {
            i23 = 0;
            if (jArr13[0] == 0) {
                jArr3.getClass();
                long j23 = jArr3[0];
                for (int i69 = 0; i69 < jArr2.length; i69++) {
                    jArr2[i69] = b0.V(jArr2[i69] - j23, 1000000L, pVar3.f10895c);
                }
                return new s(pVar, jArr, iArr3, i21, jArr2, iArr2, b0.V(j4 - j23, 1000000L, pVar3.f10895c));
            }
            i24 = i22;
            i68 = 1;
        } else {
            i23 = 0;
            i24 = i22;
        }
        if (i24 == i68) {
            z12 = 1;
        } else {
            z12 = i23;
        }
        int[] iArr14 = new int[jArr13.length];
        int[] iArr15 = new int[jArr13.length];
        jArr3.getClass();
        int i70 = i23;
        int i71 = i70;
        int i72 = i71;
        int i73 = i72;
        while (i70 < jArr13.length) {
            long[] jArr15 = jArr13;
            long j24 = jArr3[i70];
            if (j24 != -1) {
                int i74 = i73;
                jArr6 = jArr15;
                int i75 = i71;
                int i76 = i72;
                long V5 = b0.V(jArr15[i70], pVar3.f10895c, pVar3.f10896d);
                int i77 = 1;
                iArr14[i70] = b0.f(jArr2, j24, true);
                iArr15[i70] = b0.b(jArr2, j24 + V5, z12);
                while (true) {
                    i26 = iArr14[i70];
                    i27 = iArr15[i70];
                    if (i26 >= i27 || (iArr2[i26] & i77) != 0) {
                        break;
                    }
                    iArr14[i70] = i26 + 1;
                    i77 = 1;
                }
                int i78 = (i27 - i26) + i76;
                if (i74 != i26) {
                    i28 = 1;
                } else {
                    i28 = 0;
                }
                i73 = i27;
                i72 = i78;
                i71 = i75 | i28;
            } else {
                jArr6 = jArr15;
                i72 = i72;
            }
            i70++;
            jArr13 = jArr6;
        }
        long[] jArr16 = jArr13;
        int i79 = i71;
        if (i72 != i20) {
            i25 = 1;
        } else {
            i25 = 0;
        }
        int i80 = i79 | i25;
        if (i80 != 0) {
            jArr4 = new long[i72];
        } else {
            jArr4 = jArr;
        }
        if (i80 != 0) {
            iArr4 = new int[i72];
        } else {
            iArr4 = iArr3;
        }
        if (i80 != 0) {
            i21 = 0;
        }
        if (i80 != 0) {
            iArr5 = new int[i72];
        } else {
            iArr5 = iArr2;
        }
        long[] jArr17 = new long[i72];
        int i81 = 0;
        int i82 = 0;
        long j25 = 0;
        while (i81 < jArr16.length) {
            long j26 = jArr3[i81];
            int i83 = iArr14[i81];
            int[] iArr16 = iArr14;
            int i84 = iArr15[i81];
            if (i80 != 0) {
                iArr6 = iArr15;
                int i85 = i84 - i83;
                System.arraycopy(jArr, i83, jArr4, i82, i85);
                jArr5 = jArr;
                iArr7 = iArr3;
                System.arraycopy(iArr7, i83, iArr4, i82, i85);
                System.arraycopy(iArr2, i83, iArr5, i82, i85);
            } else {
                jArr5 = jArr;
                iArr6 = iArr15;
                iArr7 = iArr3;
            }
            int i86 = i21;
            while (i83 < i84) {
                int[] iArr17 = iArr2;
                int i87 = i84;
                long V6 = b0.V(j25, 1000000L, pVar3.f10896d);
                int i88 = i81;
                int[] iArr18 = iArr7;
                long V7 = b0.V(jArr2[i83] - j26, 1000000L, pVar3.f10895c);
                long[] jArr18 = jArr2;
                if (i24 != 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    V7 = Math.max(0L, V7);
                }
                jArr17[i82] = V6 + V7;
                if (i80 != 0 && iArr4[i82] > i86) {
                    i86 = iArr18[i83];
                }
                i82++;
                i83++;
                iArr2 = iArr17;
                i84 = i87;
                jArr2 = jArr18;
                i81 = i88;
                iArr7 = iArr18;
            }
            int i89 = i81;
            int[] iArr19 = iArr7;
            j25 += jArr16[i89];
            i81 = i89 + 1;
            iArr2 = iArr2;
            i21 = i86;
            iArr14 = iArr16;
            iArr15 = iArr6;
            jArr = jArr5;
            jArr2 = jArr2;
            iArr3 = iArr19;
        }
        return new s(pVar, jArr4, iArr4, i21, jArr17, iArr5, b0.V(j25, 1000000L, pVar3.f10896d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:528:0x00eb, code lost:
    
        if (r8 == 0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0ba8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList g(w2.a r70, d2.x r71, long r72, c1.p r74, boolean r75, boolean r76, q6.f r77) {
        /*
            Method dump skipped, instructions count: 2994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.f.g(w2.a, d2.x, long, c1.p, boolean, boolean, q6.f):java.util.ArrayList");
    }
}
