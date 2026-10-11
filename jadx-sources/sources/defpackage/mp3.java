package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.core.device.MimeTypes;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mp3 {
    public static final r26 m = mv5.e(new xw(4));
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public mp3(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = qy3.m(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(eq6.g(i, widthAlignment) * widthAlignment, eq6.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            double floor = Math.floor(d);
            if (videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
                Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
                if (achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r1.equals("Fairphone") == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mp3 i(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17) {
        /*
            mp3 r0 = new mp3
            java.lang.String r1 = "adaptive-playback"
            boolean r8 = r14.isFeatureSupported(r1)
            java.lang.String r1 = "tunneled-playback"
            r14.isFeatureSupported(r1)
            java.lang.String r1 = "secure-playback"
            boolean r9 = r14.isFeatureSupported(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L74
            java.lang.String r1 = "detached-surface"
            boolean r1 = r14.isFeatureSupported(r1)
            if (r1 == 0) goto L74
            r26 r1 = defpackage.mp3.m
            java.lang.Object r1 = r1.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L68
            int r1 = r1.intValue()
            r2 = 202604(0x3176c, float:2.83909E-40)
            if (r1 <= r2) goto L35
            goto L68
        L35:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "Xiaomi"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r2 = "OPPO"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r2 = "realme"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r2 = "motorola"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r2 = "LENOVO"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r2 = "Fairphone"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L68
            goto L74
        L68:
            r1 = 1
        L69:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r10 = r1
            r1 = r11
            goto L76
        L74:
            r1 = 0
            goto L69
        L76:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp3.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean):mp3");
    }

    public final s61 b(ea2 ea2Var, ea2 ea2Var2) {
        int i;
        ea2 ea2Var3;
        ea2 ea2Var4;
        int i2;
        int i3;
        String str = ea2Var.p;
        hp0 hp0Var = ea2Var.H;
        String str2 = ea2Var2.p;
        hp0 hp0Var2 = ea2Var2.H;
        boolean equals = Objects.equals(str, str2);
        boolean z = false;
        if (!equals) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.i) {
            if (ea2Var.C != ea2Var2.C) {
                i |= 1024;
            }
            if (ea2Var.w != ea2Var2.w || ea2Var.x != ea2Var2.x) {
                z = true;
            }
            if (!this.e && z) {
                i |= 512;
            }
            if ((!hp0.g(hp0Var) || !hp0.g(hp0Var2)) && !Objects.equals(hp0Var, hp0Var2)) {
                i |= 2048;
            }
            HashSet hashSet = cr3.a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !ea2Var.c(ea2Var2)) {
                i |= 2;
            }
            int i4 = ea2Var.z;
            if (i4 != -1 && (i3 = ea2Var.A) != -1 && i4 == ea2Var2.z && i3 == ea2Var2.A && z) {
                i |= 2;
            }
            if (i == 0 && Objects.equals(ea2Var2.p, "video/dolby-vision")) {
                Pair c = ko0.c(ea2Var);
                Pair c2 = ko0.c(ea2Var2);
                if (c == null || c2 == null || !((Integer) c.first).equals(c2.first)) {
                    i |= 2;
                }
            }
            if (i == 0) {
                if (ea2Var.c(ea2Var2)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new s61(this.a, ea2Var, ea2Var2, i2, 0);
            }
            ea2Var3 = ea2Var;
            ea2Var4 = ea2Var2;
        } else {
            ea2Var3 = ea2Var;
            ea2Var4 = ea2Var2;
            if (ea2Var3.J != ea2Var4.J) {
                i |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
            }
            if (ea2Var3.L != ea2Var4.L) {
                i |= 8192;
            }
            if (ea2Var3.M != ea2Var4.M) {
                i |= 16384;
            }
            String str3 = this.b;
            if (i == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair c3 = ko0.c(ea2Var3);
                Pair c4 = ko0.c(ea2Var4);
                if (c3 != null && c4 != null) {
                    int intValue = ((Integer) c3.first).intValue();
                    int intValue2 = ((Integer) c4.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new s61(this.a, ea2Var3, ea2Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && c3.equals(c4)) {
                        return new s61(this.a, ea2Var3, ea2Var4, 3, 0);
                    }
                }
            }
            if (i == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new s61(this.a, ea2Var3, ea2Var4, 3, 0);
            }
            if (!ea2Var3.c(ea2Var4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i |= 2;
            }
            if (i == 0) {
                return new s61(this.a, ea2Var3, ea2Var4, 1, 0);
            }
        }
        return new s61(this.a, ea2Var3, ea2Var4, 0, i);
    }

    public final boolean c(Context context, ea2 ea2Var, boolean z) {
        int i;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        jo0 e = ko0.e(ea2Var);
        String str = ea2Var.p;
        char c = 65535;
        String str2 = this.c;
        if (str != null && str.equals("video/mv-hevc")) {
            String n = qy3.n(str2);
            if (!n.equals("video/mv-hevc")) {
                if (n.equals(MimeTypes.VIDEO_H265)) {
                    HashMap hashMap = up3.a;
                    String M = io3.M(ea2Var.s);
                    if (M == null) {
                        e = null;
                    } else {
                        String trim = M.trim();
                        String str3 = eq6.a;
                        e = ko0.d(M, trim.split("\\.", -1), ea2Var.H);
                    }
                }
            }
            return true;
        }
        if (e != null) {
            boolean z2 = e.c;
            if (!z2) {
                return false;
            }
            io3.B(z2);
            int i2 = e.a;
            io3.B(z2);
            int i3 = e.b;
            boolean equals = "video/dolby-vision".equals(str);
            int i4 = 8;
            String str4 = this.b;
            if (equals) {
                str4.getClass();
                switch (str4.hashCode()) {
                    case -1662735862:
                        if (str4.equals(MimeTypes.VIDEO_AV1)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1662541442:
                        if (str4.equals(MimeTypes.VIDEO_H265)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1331836730:
                        if (str4.equals(MimeTypes.VIDEO_H264)) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                        i3 = 0;
                        i2 = 2;
                        break;
                    case 2:
                        i2 = 8;
                        i3 = 0;
                        break;
                }
            }
            if (this.i || str4.equals("audio/ac4") || i2 == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2 = codecCapabilities.profileLevels;
                if (codecProfileLevelArr2 == null) {
                    codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (str4.equals("audio/ac4") && codecProfileLevelArr2.length == 0) {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities != null) {
                        i = audioCapabilities.getMaxInputChannelCount();
                    } else {
                        i = 2;
                    }
                    if (i > 18) {
                        i4 = 16;
                    }
                    if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{up3.b(1026, i4)};
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{up3.b(257, i4), up3.b(513, i4), up3.b(514, i4), up3.b(1026, i4), up3.b(1028, i4)};
                    }
                    codecProfileLevelArr2 = codecProfileLevelArr;
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr2) {
                    if (codecProfileLevel.profile == i2 && (codecProfileLevel.level >= i3 || !z)) {
                        HashSet hashSet = cr3.a;
                        if (MimeTypes.VIDEO_H265.equals(str4) && 2 == i2) {
                            String str5 = Build.DEVICE;
                            if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                            }
                        }
                    }
                }
                h("codec.profileLevel, " + ea2Var.l + ", " + str2);
                return false;
            }
        }
        return true;
    }

    public final boolean d(ea2 ea2Var) {
        if (Objects.equals(ea2Var.p, "audio/flac") && ea2Var.M == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) {
            return false;
        }
        return true;
    }

    public final boolean e(Context context, ea2 ea2Var) {
        int i;
        int i2;
        String str = ea2Var.p;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(up3.c(ea2Var))) || !c(context, ea2Var, true) || !d(ea2Var)) {
            return false;
        }
        if (this.i) {
            int i3 = ea2Var.w;
            if (i3 > 0 && (i2 = ea2Var.x) > 0) {
                return g(i3, i2, ea2Var.B);
            }
        } else {
            int i4 = ea2Var.L;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i4 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    h("sampleRate.support, " + i4);
                    return false;
                }
            }
            int i5 = ea2Var.J;
            if (i5 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i = 16;
                    } else {
                        i = 30;
                    }
                    StringBuilder m2 = h11.m(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.a, ", [", " to ");
                    m2.append(i);
                    m2.append("]");
                    kb0.O("MediaCodecInfo", m2.toString());
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    h("channelCount.support, " + i5);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(ea2 ea2Var) {
        boolean z;
        if (this.i) {
            return this.e;
        }
        jo0 e = ko0.e(ea2Var);
        if (e != null && (z = e.c)) {
            io3.B(z);
            if (e.a == 42) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0072, code lost:
    
        if (r5 == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r9, int r10, double r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp3.g(int, int, double):boolean");
    }

    public final void h(String str) {
        StringBuilder n = h11.n("NoSupport [", str, "] [");
        n.append(this.a);
        n.append(", ");
        n.append(this.b);
        n.append("] [");
        n.append(eq6.a);
        n.append("]");
        kb0.q("MediaCodecInfo", n.toString());
    }

    public final String toString() {
        return this.a;
    }
}
