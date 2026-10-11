package s1;

import android.media.MediaCodecInfo;
import android.util.Pair;
import c1.q0;
import f1.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import r6.l0;
import r6.n1;
import r6.o0;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f9849a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f9850b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f9851c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (b0.f3799a < 26 && b0.f3800b.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).f9801a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new u(new j1.l(10), 0));
        }
        int i10 = b0.f3799a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((n) arrayList.get(0)).f9801a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new u(new j1.l(11), 0));
            }
        }
        if (i10 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).f9801a)) {
            arrayList.add((n) arrayList.remove(0));
        }
    }

    public static String b(c1.v vVar) {
        Pair d10;
        if ("audio/eac3-joc".equals(vVar.f1935m)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(vVar.f1935m) && (d10 = d(vVar)) != null) {
            int intValue = ((Integer) d10.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0362 A[Catch: NumberFormatException -> 0x0371, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0371, blocks: (B:198:0x031a, B:200:0x032c, B:212:0x034a, B:215:0x0362), top: B:197:0x031a }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(c1.v r15) {
        /*
            Method dump skipped, instructions count: 2378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.z.d(c1.v):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z9, boolean z10) {
        x eVar;
        synchronized (z.class) {
            v vVar = new v(str, z9, z10);
            HashMap hashMap = f9850b;
            List list = (List) hashMap.get(vVar);
            if (list != null) {
                return list;
            }
            int i10 = b0.f3799a;
            a3.g gVar = null;
            if (i10 >= 21) {
                eVar = new d0.h(z9, z10);
            } else {
                eVar = new j6.e(gVar);
            }
            ArrayList f10 = f(vVar, eVar);
            if (z9 && f10.isEmpty() && 21 <= i10 && i10 <= 23) {
                f10 = f(vVar, new j6.e(gVar));
                if (!f10.isEmpty()) {
                    f1.o.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((n) f10.get(0)).f9801a);
                }
            }
            a(str, f10);
            o0 j4 = o0.j(f10);
            hashMap.put(vVar, j4);
            return j4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[Catch: Exception -> 0x0169, TryCatch #3 {Exception -> 0x0169, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:14:0x013a, B:15:0x0034, B:18:0x003f, B:48:0x0113, B:51:0x011b, B:53:0x0121, B:56:0x0144, B:57:0x0167), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(s1.v r21, s1.x r22) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.z.f(s1.v, s1.x):java.util.ArrayList");
    }

    public static n1 g(t tVar, c1.v vVar, boolean z9, boolean z10) {
        List e10;
        String str = vVar.f1935m;
        k1.i iVar = (k1.i) tVar;
        iVar.getClass();
        List e11 = e(str, z9, z10);
        String b10 = b(vVar);
        if (b10 == null) {
            e10 = n1.f9497e;
        } else {
            iVar.getClass();
            e10 = e(b10, z9, z10);
        }
        l0 l0Var = new l0();
        l0Var.z0(e11);
        l0Var.z0(e10);
        return l0Var.C0();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z9, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z9 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = b0.f3799a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = b0.f3800b;
            if ("a70".equals(str3) || ("Xiaomi".equals(b0.f3801c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = b0.f3800b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = b0.f3800b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(b0.f3801c))) {
            String str6 = b0.f3800b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(b0.f3801c)) {
            String str7 = b0.f3800b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && b0.f3800b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (b0.f3799a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (q0.k(str)) {
            return true;
        }
        String g02 = j5.a.g0(mediaCodecInfo.getName());
        if (g02.startsWith("arc.")) {
            return false;
        }
        if (g02.startsWith("omx.google.") || g02.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((g02.startsWith("omx.sec.") && g02.contains(".sw.")) || g02.equals("omx.qcom.video.decoder.hevcswvdec") || g02.startsWith("c2.android.") || g02.startsWith("c2.google.")) {
            return true;
        }
        if (!g02.startsWith("omx.") && !g02.startsWith("c2.")) {
            return true;
        }
        return false;
    }

    public static int j() {
        n nVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        int i11;
        if (f9851c == -1) {
            int i12 = 0;
            List e10 = e("video/avc", false, false);
            if (e10.isEmpty()) {
                nVar = null;
            } else {
                nVar = (n) e10.get(0);
            }
            if (nVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f9804d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = codecProfileLevelArr[i12].level;
                    if (i14 != 1 && i14 != 2) {
                        switch (i14) {
                            case 8:
                            case 16:
                            case 32:
                                i11 = 101376;
                                break;
                            case 64:
                                i11 = 202752;
                                break;
                            case 128:
                            case 256:
                                i11 = 414720;
                                break;
                            case 512:
                                i11 = 921600;
                                break;
                            case 1024:
                                i11 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i11 = 2097152;
                                break;
                            case 8192:
                                i11 = 2228224;
                                break;
                            case 16384:
                                i11 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i11 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i11 = 35651584;
                                break;
                            default:
                                i11 = -1;
                                break;
                        }
                    } else {
                        i11 = 25344;
                    }
                    i13 = Math.max(i11, i13);
                    i12++;
                }
                if (b0.f3799a >= 21) {
                    i10 = 345600;
                } else {
                    i10 = 172800;
                }
                i12 = Math.max(i13, i10);
            }
            f9851c = i12;
        }
        return f9851c;
    }
}
