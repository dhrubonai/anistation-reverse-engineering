package c1;

import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f1883a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f1884b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        g0.x g10;
        int a10;
        if (str == null) {
            return false;
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c6 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c6 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c6 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c6 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c6 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c6 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c6 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c6 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c6 = '\n';
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case zzaja.zze.zzg /* 7 */:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                if (str2 == null || (g10 = g(str2)) == null || (a10 = g10.a()) == 0 || a10 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : f1.b0.b0(str)) {
            String e10 = e(str2);
            if (e10 != null && k(e10)) {
                return e10;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] b02 = f1.b0.b0(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : b02) {
            if (str2.equals(e(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.toString();
    }

    public static int d(String str, String str2) {
        g0.x g10;
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c6 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c6 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c6 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c6 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c6 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c6 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c6 = 11;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (g10 = g(str2)) == null) {
                    return 0;
                }
                return g10.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case zzaja.zze.zzg /* 7 */:
                return 6;
            case '\b':
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 8;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        g0.x g10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String g02 = j5.a.g0(str.trim());
        if (!g02.startsWith("avc1") && !g02.startsWith("avc3")) {
            if (!g02.startsWith("hev1") && !g02.startsWith("hvc1")) {
                if (!g02.startsWith("dvav") && !g02.startsWith("dva1") && !g02.startsWith("dvhe") && !g02.startsWith("dvh1")) {
                    if (g02.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!g02.startsWith("vp9") && !g02.startsWith("vp09")) {
                        if (!g02.startsWith("vp8") && !g02.startsWith("vp08")) {
                            if (g02.startsWith("mp4a")) {
                                if (g02.startsWith("mp4a.") && (g10 = g(g02)) != null) {
                                    str2 = f(g10.f4270a);
                                }
                                if (str2 == null) {
                                    return "audio/mp4a-latm";
                                }
                                return str2;
                            }
                            if (g02.startsWith("mha1")) {
                                return "audio/mha1";
                            }
                            if (g02.startsWith("mhm1")) {
                                return "audio/mhm1";
                            }
                            if (!g02.startsWith("ac-3") && !g02.startsWith("dac3")) {
                                if (!g02.startsWith("ec-3") && !g02.startsWith("dec3")) {
                                    if (g02.startsWith("ec+3")) {
                                        return "audio/eac3-joc";
                                    }
                                    if (!g02.startsWith("ac-4") && !g02.startsWith("dac4")) {
                                        if (g02.startsWith("dtsc")) {
                                            return "audio/vnd.dts";
                                        }
                                        if (g02.startsWith("dtse")) {
                                            return "audio/vnd.dts.hd;profile=lbr";
                                        }
                                        if (!g02.startsWith("dtsh") && !g02.startsWith("dtsl")) {
                                            if (g02.startsWith("dtsx")) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            if (g02.startsWith("opus")) {
                                                return "audio/opus";
                                            }
                                            if (g02.startsWith("vorbis")) {
                                                return "audio/vorbis";
                                            }
                                            if (g02.startsWith("flac")) {
                                                return "audio/flac";
                                            }
                                            if (g02.startsWith("stpp")) {
                                                return "application/ttml+xml";
                                            }
                                            if (g02.startsWith("wvtt")) {
                                                return "text/vtt";
                                            }
                                            if (g02.contains("cea708")) {
                                                return "application/cea-708";
                                            }
                                            if (!g02.contains("eia608") && !g02.contains("cea608")) {
                                                ArrayList arrayList = f1883a;
                                                if (arrayList.size() <= 0) {
                                                    return null;
                                                }
                                                a3.g.z(arrayList.get(0));
                                                throw null;
                                            }
                                            return "application/cea-608";
                                        }
                                        return "audio/vnd.dts.hd";
                                    }
                                    return "audio/ac4";
                                }
                                return "audio/eac3";
                            }
                            return "audio/ac3";
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    public static String f(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static g0.x g(String str) {
        int i10;
        Matcher matcher = f1884b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i10 = Integer.parseInt(group2);
            } else {
                i10 = 0;
            }
            return new g0.x(parseInt, i10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (n(str)) {
            return 2;
        }
        if (m(str)) {
            return 3;
        }
        if (l(str)) {
            return 4;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
            if ("application/x-camera-motion".equals(str)) {
                return 6;
            }
            ArrayList arrayList = f1883a;
            if (arrayList.size() <= 0) {
                return -1;
            }
            a3.g.z(arrayList.get(0));
            throw null;
        }
        return 5;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : f1.b0.b0(str)) {
            String e10 = e(str2);
            if (e10 != null && n(e10)) {
                return e10;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(h(str));
    }

    public static boolean l(String str) {
        if (!"image".equals(h(str)) && !"application/x-image-uri".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean m(String str) {
        if (!"text".equals(h(str)) && !"application/x-media3-cues".equals(str) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean n(String str) {
        return "video".equals(h(str));
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        String g02 = j5.a.g0(str);
        g02.getClass();
        char c6 = 65535;
        switch (g02.hashCode()) {
            case -1007807498:
                if (g02.equals("audio/x-flac")) {
                    c6 = 0;
                    break;
                }
                break;
            case -979095690:
                if (g02.equals("application/x-mpegurl")) {
                    c6 = 1;
                    break;
                }
                break;
            case -586683234:
                if (g02.equals("audio/x-wav")) {
                    c6 = 2;
                    break;
                }
                break;
            case -432836268:
                if (g02.equals("audio/mpeg-l1")) {
                    c6 = 3;
                    break;
                }
                break;
            case -432836267:
                if (g02.equals("audio/mpeg-l2")) {
                    c6 = 4;
                    break;
                }
                break;
            case 187090231:
                if (g02.equals("audio/mp3")) {
                    c6 = 5;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return "audio/flac";
            case 1:
                return "application/x-mpegURL";
            case 2:
                return "audio/wav";
            case 3:
                return "audio/mpeg-L1";
            case 4:
                return "audio/mpeg-L2";
            case 5:
                return "audio/mpeg";
            default:
                return g02;
        }
    }
}
