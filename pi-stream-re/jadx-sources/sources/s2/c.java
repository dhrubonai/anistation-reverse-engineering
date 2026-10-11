package s2;

import c1.o0;
import c1.p0;
import f1.s;
import f1.t;
import f1.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r6.h0;

/* loaded from: classes.dex */
public final class c extends h0 {

    /* renamed from: g, reason: collision with root package name */
    public final t f9855g = new t();

    /* renamed from: h, reason: collision with root package name */
    public final s f9856h = new s();

    /* renamed from: i, reason: collision with root package name */
    public y f9857i;

    @Override // r6.h0
    public final p0 H(l2.a aVar, ByteBuffer byteBuffer) {
        o0 fVar;
        boolean z9;
        long j4;
        long j10;
        ArrayList arrayList;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        boolean z15;
        long j13;
        long j14;
        boolean z16;
        boolean z17;
        List list;
        long j15;
        long j16;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        int i13;
        int i14;
        int i15;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        long j17;
        boolean z26;
        long j18;
        y yVar = this.f9857i;
        if (yVar == null || aVar.B != yVar.e()) {
            y yVar2 = new y(aVar.f5264x);
            this.f9857i = yVar2;
            yVar2.a(aVar.f5264x - aVar.B);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        t tVar = this.f9855g;
        tVar.E(array, limit);
        s sVar = this.f9856h;
        sVar.n(array, limit);
        sVar.r(39);
        long i16 = (sVar.i(1) << 32) | sVar.i(32);
        sVar.r(20);
        int i17 = sVar.i(12);
        int i18 = sVar.i(8);
        tVar.H(14);
        if (i18 != 0) {
            if (i18 != 255) {
                long j19 = 0;
                long j20 = 1;
                long j21 = -9223372036854775807L;
                if (i18 != 4) {
                    if (i18 != 5) {
                        if (i18 != 6) {
                            fVar = null;
                        } else {
                            y yVar3 = this.f9857i;
                            long d10 = j.d(i16, tVar);
                            fVar = new j(d10, yVar3.b(d10));
                        }
                    } else {
                        y yVar4 = this.f9857i;
                        long w9 = tVar.w();
                        if ((tVar.v() & 128) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        List emptyList = Collections.emptyList();
                        if (!z17) {
                            int v9 = tVar.v();
                            if ((v9 & 128) != 0) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            if ((v9 & 64) != 0) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            if ((v9 & 32) != 0) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if ((v9 & 16) != 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if (z23 && !z25) {
                                j17 = j.d(i16, tVar);
                            } else {
                                j17 = -9223372036854775807L;
                            }
                            if (!z23) {
                                int v10 = tVar.v();
                                ArrayList arrayList2 = new ArrayList(v10);
                                for (int i19 = 0; i19 < v10; i19++) {
                                    int v11 = tVar.v();
                                    if (!z25) {
                                        j18 = j.d(i16, tVar);
                                    } else {
                                        j18 = -9223372036854775807L;
                                    }
                                    arrayList2.add(new d(v11, j18, yVar4.b(j18)));
                                }
                                emptyList = arrayList2;
                            }
                            if (z24) {
                                long v12 = tVar.v();
                                if ((v12 & 128) != 0) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                j21 = ((((v12 & 1) << 32) | tVar.w()) * 1000) / 90;
                            } else {
                                z26 = false;
                            }
                            int A = tVar.A();
                            int v13 = tVar.v();
                            z21 = z26;
                            i15 = tVar.v();
                            list = emptyList;
                            z18 = z22;
                            i13 = A;
                            i14 = v13;
                            j16 = j21;
                            long j22 = j17;
                            z20 = z25;
                            z19 = z23;
                            j15 = j22;
                        } else {
                            list = emptyList;
                            j15 = -9223372036854775807L;
                            j16 = -9223372036854775807L;
                            z18 = false;
                            z19 = false;
                            z20 = false;
                            z21 = false;
                            i13 = 0;
                            i14 = 0;
                            i15 = 0;
                        }
                        fVar = new e(w9, z17, z18, z19, z20, j15, yVar4.b(j15), list, z21, j16, i13, i14, i15);
                    }
                } else {
                    int v14 = tVar.v();
                    ArrayList arrayList3 = new ArrayList(v14);
                    int i20 = 0;
                    while (i20 < v14) {
                        long w10 = tVar.w();
                        if ((tVar.v() & 128) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!z9) {
                            int v15 = tVar.v();
                            if ((v15 & 128) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((v15 & 64) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((v15 & 32) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                j13 = tVar.w();
                            } else {
                                j13 = -9223372036854775807L;
                            }
                            if (!z14) {
                                int v16 = tVar.v();
                                ArrayList arrayList5 = new ArrayList(v16);
                                for (int i21 = 0; i21 < v16; i21++) {
                                    arrayList5.add(new g(tVar.v(), tVar.w()));
                                }
                                arrayList4 = arrayList5;
                            }
                            if (z15) {
                                long v17 = tVar.v();
                                j10 = 0;
                                if ((v17 & 128) != 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                j4 = 1;
                                j14 = ((((v17 & 1) << 32) | tVar.w()) * 1000) / 90;
                            } else {
                                j4 = 1;
                                j10 = 0;
                                j14 = -9223372036854775807L;
                                z16 = false;
                            }
                            z12 = z16;
                            arrayList = arrayList4;
                            z10 = z13;
                            z11 = z14;
                            j11 = j13;
                            j12 = j14;
                            i10 = tVar.A();
                            i11 = tVar.v();
                            i12 = tVar.v();
                        } else {
                            j4 = j20;
                            j10 = j19;
                            arrayList = arrayList4;
                            j11 = -9223372036854775807L;
                            j12 = -9223372036854775807L;
                            z10 = false;
                            z11 = false;
                            z12 = false;
                            i10 = 0;
                            i11 = 0;
                            i12 = 0;
                        }
                        arrayList3.add(new h(w10, z9, z10, z11, arrayList, j11, z12, j12, i10, i11, i12));
                        i20++;
                        j19 = j10;
                        j20 = j4;
                    }
                    fVar = new i(arrayList3);
                }
            } else {
                long w11 = tVar.w();
                int i22 = i17 - 4;
                byte[] bArr = new byte[i22];
                tVar.d(bArr, 0, i22);
                fVar = new a(w11, bArr, i16);
            }
        } else {
            fVar = new f();
        }
        if (fVar == null) {
            return new p0(new o0[0]);
        }
        return new p0(fVar);
    }
}
