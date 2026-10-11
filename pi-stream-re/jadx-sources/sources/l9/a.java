package l9;

import k9.g;
import k9.o;
import k9.r;
import r6.h0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f7037a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(o7.a.f8311a);
        h0.s(bytes, "this as java.lang.String).getBytes(charset)");
        f7037a = bytes;
    }

    public static final String a(g gVar, long j4) {
        h0.u(gVar, "<this>");
        if (j4 > 0) {
            long j10 = j4 - 1;
            if (gVar.q(j10) == 13) {
                String x9 = gVar.x(j10, o7.a.f8311a);
                gVar.b(2L);
                return x9;
            }
        }
        String x10 = gVar.x(j4, o7.a.f8311a);
        gVar.b(1L);
        return x10;
    }

    public static final int b(g gVar, o oVar, boolean z9) {
        int i10;
        int i11;
        boolean z10;
        byte[] bArr;
        int i12;
        r rVar;
        h0.u(gVar, "<this>");
        h0.u(oVar, "options");
        r rVar2 = gVar.f6520a;
        int i13 = -2;
        if (rVar2 == null) {
            if (z9) {
                return -2;
            }
            return -1;
        }
        int i14 = rVar2.f6546b;
        int i15 = rVar2.f6547c;
        byte[] bArr2 = rVar2.f6545a;
        r rVar3 = rVar2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int[] iArr = oVar.f6538b;
            int i19 = iArr[i17];
            int i20 = i18 + 1;
            int i21 = iArr[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (rVar3 == null) {
                break;
            }
            if (i19 < 0) {
                int i22 = (i19 * (-1)) + i20;
                while (true) {
                    int i23 = i14 + 1;
                    int i24 = i20 + 1;
                    if ((bArr2[i14] & 255) != iArr[i20]) {
                        return i16;
                    }
                    if (i24 == i22) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i23 == i15) {
                        h0.q(rVar3);
                        r rVar4 = rVar3.f6550f;
                        h0.q(rVar4);
                        i12 = rVar4.f6546b;
                        int i25 = rVar4.f6547c;
                        bArr = rVar4.f6545a;
                        if (rVar4 == rVar2) {
                            if (!z10) {
                                break loop0;
                            }
                            i15 = i25;
                            rVar = null;
                        } else {
                            rVar = rVar4;
                            i15 = i25;
                        }
                    } else {
                        r rVar5 = rVar3;
                        bArr = bArr2;
                        i12 = i23;
                        rVar = rVar5;
                    }
                    if (z10) {
                        i10 = iArr[i24];
                        i11 = i12;
                        bArr2 = bArr;
                        rVar3 = rVar;
                        break;
                    }
                    i14 = i12;
                    bArr2 = bArr;
                    i20 = i24;
                    rVar3 = rVar;
                }
            } else {
                int i26 = i14 + 1;
                int i27 = bArr2[i14] & 255;
                int i28 = i20 + i19;
                while (i20 != i28) {
                    if (i27 == iArr[i20]) {
                        i10 = iArr[i20 + i19];
                        if (i26 == i15) {
                            rVar3 = rVar3.f6550f;
                            h0.q(rVar3);
                            i11 = rVar3.f6546b;
                            i15 = rVar3.f6547c;
                            bArr2 = rVar3.f6545a;
                            if (rVar3 == rVar2) {
                                rVar3 = null;
                            }
                        } else {
                            i11 = i26;
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            if (i10 >= 0) {
                return i10;
            }
            i17 = -i10;
            i14 = i11;
            i13 = -2;
        }
        if (z9) {
            return i13;
        }
        return i16;
    }
}
