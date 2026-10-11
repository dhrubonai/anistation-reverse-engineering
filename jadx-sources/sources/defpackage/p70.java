package defpackage;

import android.text.Layout;
import com.anistation.model.download.EpisodeDownloadState;
import com.anistation.model.download.external.ExternalDownloadRecord;
import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class p70 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ p70(long j, Object obj, Serializable serializable, Serializable serializable2, byte b) {
        this.x = b;
        this.y = j;
        this.A = obj;
        this.z = serializable;
        this.B = serializable2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        String str;
        int g;
        long j;
        boolean z;
        boolean z2;
        float a;
        float a2;
        dn0 dn0Var;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.B;
        Object obj3 = this.z;
        Object obj4 = this.A;
        switch (b) {
            case 0:
                n05 n05Var = (n05) obj4;
                w05 w05Var = (w05) obj3;
                long j2 = this.y;
                w60 w60Var = (w60) obj2;
                bb3 bb3Var = (bb3) obj;
                bb3Var.a();
                float f = n05Var.a;
                float f2 = n05Var.b;
                xg0 xg0Var = bb3Var.x;
                ((af2) xg0Var.y.y).s(f, f2);
                try {
                    bp1.C(bb3Var, (pc) w05Var.x, j2, 0L, 0.0f, w60Var, 0, 890);
                    return pn6Var;
                } finally {
                    ((af2) xg0Var.y.y).s(-f, -f2);
                }
            case 1:
                String str2 = (String) obj2;
                ExternalDownloadRecord externalDownloadRecord = (ExternalDownloadRecord) obj;
                EpisodeDownloadState episodeDownloadState = EpisodeDownloadState.COMPLETED;
                String uri = ((w02) obj4).a.toString();
                w02 w02Var = (w02) ((w05) obj3).x;
                if (w02Var != null) {
                    str = w02Var.a.toString();
                } else {
                    str = null;
                }
                String str3 = str;
                long j3 = this.y;
                return ExternalDownloadRecord.copy$default(externalDownloadRecord, null, episodeDownloadState, 100.0f, j3, j3, 0, uri, str3, str2, 0L, null, 513, null);
            case 2:
                float[] fArr = (float[]) obj4;
                u05 u05Var = (u05) obj3;
                t05 t05Var = (t05) obj2;
                di4 di4Var = (di4) obj;
                int i = di4Var.b;
                cd cdVar = di4Var.a;
                int i2 = di4Var.c;
                long j4 = this.y;
                if (i > nd6.g(j4)) {
                    g = di4Var.b;
                } else {
                    g = nd6.g(j4);
                }
                if (i2 >= nd6.f(j4)) {
                    i2 = nd6.f(j4);
                }
                long a3 = fy5.a(di4Var.d(g), di4Var.d(i2));
                int i3 = u05Var.x;
                zc6 zc6Var = cdVar.d;
                int g2 = nd6.g(a3);
                int f3 = nd6.f(a3);
                Layout layout = zc6Var.f;
                int length = layout.getText().length();
                if (g2 < 0) {
                    fz2.a("startOffset must be > 0");
                }
                if (g2 >= length) {
                    fz2.a("startOffset must be less than text length");
                }
                if (f3 <= g2) {
                    fz2.a("endOffset must be greater than startOffset");
                }
                if (f3 > length) {
                    fz2.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i3 < (f3 - g2) * 4) {
                    fz2.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int f4 = zc6Var.f(g2);
                int f5 = zc6Var.f(f3 - 1);
                wn2 wn2Var = new wn2(zc6Var);
                if (f4 <= f5) {
                    while (true) {
                        int lineStart = layout.getLineStart(f4);
                        int e = zc6Var.e(f4);
                        int max = Math.max(g2, lineStart);
                        int min = Math.min(f3, e);
                        float h = zc6Var.h(f4);
                        float d = zc6Var.d(f4);
                        j = a3;
                        int i4 = i3;
                        boolean z3 = false;
                        if (layout.getParagraphDirection(f4) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (z && !isRtlCharAt) {
                                a = wn2Var.a(max, z3, z3, true);
                                z2 = z;
                                a2 = wn2Var.a(max + 1, true, true, true);
                            } else {
                                if (z && isRtlCharAt) {
                                    z3 = false;
                                    float a4 = wn2Var.a(max, false, false, false);
                                    z2 = z;
                                    a = wn2Var.a(max + 1, true, true, false);
                                    a2 = a4;
                                } else {
                                    z2 = z;
                                    z3 = false;
                                    if (!z2 && isRtlCharAt) {
                                        a2 = wn2Var.a(max, false, false, true);
                                        a = wn2Var.a(max + 1, true, true, true);
                                    } else {
                                        a = wn2Var.a(max, false, false, false);
                                        a2 = wn2Var.a(max + 1, true, true, false);
                                    }
                                }
                                fArr[i4] = a;
                                fArr[i4 + 1] = h;
                                fArr[i4 + 2] = a2;
                                fArr[i4 + 3] = d;
                                i4 += 4;
                                max++;
                                z = z2;
                            }
                            z3 = false;
                            fArr[i4] = a;
                            fArr[i4 + 1] = h;
                            fArr[i4 + 2] = a2;
                            fArr[i4 + 3] = d;
                            i4 += 4;
                            max++;
                            z = z2;
                        }
                        if (f4 != f5) {
                            f4++;
                            a3 = j;
                            i3 = i4;
                        }
                    }
                } else {
                    j = a3;
                }
                int e2 = (nd6.e(j) * 4) + u05Var.x;
                for (int i5 = u05Var.x; i5 < e2; i5 += 4) {
                    int i6 = i5 + 1;
                    float f6 = fArr[i6];
                    float f7 = t05Var.x;
                    fArr[i6] = f6 + f7;
                    int i7 = i5 + 3;
                    fArr[i7] = fArr[i7] + f7;
                }
                u05Var.x = e2;
                t05Var.x += cdVar.f;
                return pn6Var;
            default:
                long j5 = this.y;
                id idVar = (id) obj2;
                bp1 bp1Var = (bp1) obj;
                float a5 = ((bx4) obj4).a.a();
                float max2 = (Math.max(Math.min(1.0f, a5) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                float B = db.B(Math.abs(a5) - 1.0f, 0.0f, 2.0f);
                float pow = (((0.4f * max2) - 0.25f) + (B - (((float) Math.pow(B, 2.0d)) / 4.0f))) * 0.5f;
                float f8 = pow * 360.0f;
                float f9 = ((0.8f * max2) + pow) * 360.0f;
                ps psVar = new ps(pow, f8, f9, Math.min(1.0f, max2));
                float floatValue = ((Number) ((px5) obj3).getValue()).floatValue();
                long A0 = bp1Var.A0();
                dn0 n0 = bp1Var.n0();
                long B2 = n0.B();
                n0.y().h();
                try {
                    ((af2) n0.y).q(pow, A0);
                    float g0 = (bp1Var.g0(2.5f) / 2.0f) + bp1Var.g0(5.5f);
                    long w = bx7.w(bp1Var.g());
                    int i8 = (int) (w >> 32);
                    int i9 = (int) (w & 4294967295L);
                    n05 n05Var2 = new n05(Float.intBitsToFloat(i8) - g0, Float.intBitsToFloat(i9) - g0, Float.intBitsToFloat(i8) + g0, Float.intBitsToFloat(i9) + g0);
                    dn0Var = n0;
                    try {
                        bp1.N0(bp1Var, j5, f8, f9 - f8, n05Var2.f(), n05Var2.e(), floatValue, new d06(bp1Var.g0(2.5f), 0.0f, 0, 0, 26), 768);
                        nx7.v(bp1Var, idVar, n05Var2, j5, floatValue, psVar);
                        h11.u(dn0Var, B2);
                        return pn6Var;
                    } catch (Throwable th) {
                        th = th;
                        h11.u(dn0Var, B2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dn0Var = n0;
                }
        }
    }

    public /* synthetic */ p70(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.x = b;
        this.A = obj;
        this.z = obj2;
        this.y = j;
        this.B = obj3;
    }
}
