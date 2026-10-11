package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class up3 {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            Collections.sort(arrayList, new xq0(new qi2((byte) 11), (byte) 1));
        }
        if (Build.VERSION.SDK_INT < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((mp3) arrayList.get(0)).a)) {
            arrayList.add((mp3) arrayList.remove(0));
        }
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String c(ea2 ea2Var) {
        jo0 e;
        boolean z;
        String str = ea2Var.p;
        if ("audio/eac3-joc".equals(str)) {
            if (!Objects.equals(Build.MANUFACTURER, "Google")) {
                return "audio/eac3";
            }
            return null;
        }
        if (!"audio/vnd.dts.hd".equals(str) && !"audio/vnd.dts.uhd;profile=p2".equals(str)) {
            if ("video/dolby-vision".equals(str) && (e = ko0.e(ea2Var)) != null && (z = e.c)) {
                io3.B(z);
                int i = e.a;
                if (i != 16 && i != 256) {
                    if (i == 512) {
                        return MimeTypes.VIDEO_H264;
                    }
                    if (i == 1024) {
                        hp0 hp0Var = ea2Var.H;
                        if (hp0Var == null || hp0Var.c != 6 || hp0Var.b != 1) {
                            return MimeTypes.VIDEO_AV1;
                        }
                        return null;
                    }
                } else {
                    return MimeTypes.VIDEO_H265;
                }
            }
            if ("video/mv-hevc".equals(str)) {
                return MimeTypes.VIDEO_H265;
            }
            return null;
        }
        return "audio/vnd.dts";
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
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

    public static synchronized List e(String str, boolean z, boolean z2) {
        synchronized (up3.class) {
            try {
                rp3 rp3Var = new rp3(str, z, z2);
                HashMap hashMap = a;
                List list = (List) hashMap.get(rp3Var);
                if (list != null) {
                    return list;
                }
                ArrayList f = f(rp3Var, new fr0(z, z2, str.equals("video/mv-hevc")));
                if (z) {
                    f.isEmpty();
                }
                a(str, f);
                nw2 o = nw2.o(f);
                hashMap.put(rp3Var, o);
                return o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList f(rp3 rp3Var, fr0 fr0Var) {
        String d;
        String str;
        fr0 fr0Var2 = fr0Var;
        int i = fr0Var2.y;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = rp3Var.a;
            boolean z = rp3Var.b;
            MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) fr0Var2.z;
            if (mediaCodecInfoArr == null) {
                mediaCodecInfoArr = new MediaCodecList(i).getCodecInfos();
                fr0Var2.z = mediaCodecInfoArr;
            }
            int length = mediaCodecInfoArr.length;
            int i2 = 0;
            while (i2 < length) {
                MediaCodecInfo[] mediaCodecInfoArr2 = (MediaCodecInfo[]) fr0Var2.z;
                if (mediaCodecInfoArr2 == null) {
                    mediaCodecInfoArr2 = new MediaCodecList(i).getCodecInfos();
                    fr0Var2.z = mediaCodecInfoArr2;
                }
                MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr2[i2];
                if (!mediaCodecInfo.isAlias()) {
                    String name = mediaCodecInfo.getName();
                    if (!mediaCodecInfo.isEncoder() && (d = d(mediaCodecInfo, name, str2)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(d);
                            boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean isFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            boolean z2 = rp3Var.c;
                            if ((z2 || !isFeatureRequired) && (!z2 || isFeatureSupported)) {
                                boolean isFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                                boolean isFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                if ((z || !isFeatureRequired2) && (!z || isFeatureSupported2)) {
                                    str = name;
                                    try {
                                        boolean isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                        boolean isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
                                        boolean isVendor = mediaCodecInfo.isVendor();
                                        if (z == isFeatureSupported2) {
                                            arrayList.add(mp3.i(str, str2, d, capabilitiesForType, isHardwareAccelerated, isSoftwareOnly, isVendor));
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        kb0.s("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                        throw e;
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = name;
                        }
                    }
                }
                i2++;
                fr0Var2 = fr0Var;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new Exception("Failed to query underlying media codecs", e3);
        }
    }

    public static o15 g(ea2 ea2Var, boolean z, boolean z2) {
        Iterable e;
        List e2 = e(ea2Var.p, z, z2);
        String c = c(ea2Var);
        if (c == null) {
            z62 z62Var = nw2.y;
            e = o15.B;
        } else {
            e = e(c, z, z2);
        }
        jw2 k = nw2.k();
        k.d(e2);
        k.d(e);
        return k.g();
    }
}
