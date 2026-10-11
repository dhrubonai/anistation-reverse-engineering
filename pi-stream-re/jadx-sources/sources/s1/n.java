package s1;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import c1.q0;
import f1.b0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f9801a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9802b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9803c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f9804d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9805e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9806f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9807g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9808h;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z9, boolean z10, boolean z11) {
        str.getClass();
        this.f9801a = str;
        this.f9802b = str2;
        this.f9803c = str3;
        this.f9804d = codecCapabilities;
        this.f9807g = z9;
        this.f9805e = z10;
        this.f9806f = z11;
        this.f9808h = q0.n(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = b0.f3799a;
        Point point = new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i13 = point.x;
        int i14 = point.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i13, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r11 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        if (f1.b0.f3799a < 21) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r11.isFeatureSupported("secure-playback") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r15 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s1.n h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            s1.n r13 = new s1.n
            r14 = 1
            r0 = 0
            if (r11 == 0) goto L46
            int r1 = f1.b0.f3799a
            r2 = 19
            if (r1 < r2) goto L16
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L16
            r2 = r14
            goto L17
        L16:
            r2 = r0
        L17:
            if (r2 == 0) goto L46
            r2 = 22
            if (r1 > r2) goto L41
            java.lang.String r1 = f1.b0.f3802d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L2f
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L41
        L2f:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L3f
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L41
        L3f:
            r1 = r14
            goto L42
        L41:
            r1 = r0
        L42:
            if (r1 != 0) goto L46
            r6 = r14
            goto L47
        L46:
            r6 = r0
        L47:
            r1 = 21
            if (r11 == 0) goto L5a
            int r2 = f1.b0.f3799a
            if (r2 < r1) goto L59
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L59
            r2 = r14
            goto L5a
        L59:
            r2 = r0
        L5a:
            if (r15 != 0) goto L72
            if (r11 == 0) goto L70
            int r15 = f1.b0.f3799a
            if (r15 < r1) goto L6c
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L6c
            r15 = r14
            goto L6d
        L6c:
            r15 = r0
        L6d:
            if (r15 == 0) goto L70
            goto L72
        L70:
            r7 = r0
            goto L73
        L72:
            r7 = r14
        L73:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.n.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):s1.n");
    }

    public final j1.g b(c1.v vVar, c1.v vVar2) {
        int i10;
        int i11;
        boolean z9 = false;
        if (!b0.a(vVar.f1935m, vVar2.f1935m)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.f9808h) {
            if (vVar.f1942u != vVar2.f1942u) {
                i10 |= 1024;
            }
            if (!this.f9805e && (vVar.f1939r != vVar2.f1939r || vVar.f1940s != vVar2.f1940s)) {
                i10 |= 512;
            }
            c1.k kVar = vVar.f1946y;
            boolean b10 = c1.k.b(kVar);
            c1.k kVar2 = vVar2.f1946y;
            if ((!b10 || !c1.k.b(kVar2)) && !b0.a(kVar, kVar2)) {
                i10 |= 2048;
            }
            if (b0.f3802d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f9801a)) {
                z9 = true;
            }
            if (z9 && !vVar.c(vVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                String str = this.f9801a;
                if (vVar.c(vVar2)) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
                return new j1.g(str, vVar, vVar2, i11, 0);
            }
        } else {
            if (vVar.f1947z != vVar2.f1947z) {
                i10 |= 4096;
            }
            if (vVar.A != vVar2.A) {
                i10 |= 8192;
            }
            if (vVar.B != vVar2.B) {
                i10 |= 16384;
            }
            String str2 = this.f9802b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str2)) {
                Pair d10 = z.d(vVar);
                Pair d11 = z.d(vVar2);
                if (d10 != null && d11 != null) {
                    int intValue = ((Integer) d10.first).intValue();
                    int intValue2 = ((Integer) d11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new j1.g(this.f9801a, vVar, vVar2, 3, 0);
                    }
                }
            }
            if (!vVar.c(vVar2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new j1.g(this.f9801a, vVar, vVar2, 1, 0);
            }
        }
        return new j1.g(this.f9801a, vVar, vVar2, 0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(c1.v r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.n.c(c1.v, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(c1.v r10) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.n.d(c1.v):boolean");
    }

    public final boolean e(c1.v vVar) {
        if (this.f9808h) {
            return this.f9805e;
        }
        Pair d10 = z.d(vVar);
        if (d10 != null && ((Integer) d10.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i10, int i11, double d10) {
        boolean z9;
        int i12;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9804d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        int i13 = b0.f3799a;
        if (i13 >= 29) {
            if (i13 >= 29 && ((bool = p7.a0.f8644i) == null || !bool.booleanValue())) {
                i12 = o.a(videoCapabilities, i10, i11, d10);
            } else {
                i12 = 0;
            }
            if (i12 == 2) {
                return true;
            }
            if (i12 == 1) {
                g("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                String str = this.f9801a;
                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(b0.f3800b)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9 && a(videoCapabilities, i11, i10, d10)) {
                    f1.o.b("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10) + "] [" + str + ", " + this.f9802b + "] [" + b0.f3803e + "]");
                }
            }
            g("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
            return false;
        }
        return true;
    }

    public final void g(String str) {
        f1.o.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f9801a + ", " + this.f9802b + "] [" + b0.f3803e + "]");
    }

    public final String toString() {
        return this.f9801a;
    }
}
