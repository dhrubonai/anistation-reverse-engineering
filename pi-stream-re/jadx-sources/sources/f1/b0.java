package f1;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import c1.q0;
import c1.r0;
import c1.z0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import j1.d0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import msr.pistream.app.download.PiStreamDownloadService;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3799a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f3800b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f3801c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f3802d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f3803e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f3804f;

    /* renamed from: g, reason: collision with root package name */
    public static final long[] f3805g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f3806h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f3807i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f3808j;

    /* renamed from: k, reason: collision with root package name */
    public static HashMap f3809k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f3810l;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f3811m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f3812n;
    public static final int[] o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f3813p;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f3799a = i10;
        String str = Build.DEVICE;
        f3800b = str;
        String str2 = Build.MANUFACTURER;
        f3801c = str2;
        String str3 = Build.MODEL;
        f3802d = str3;
        f3803e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f3804f = new byte[0];
        f3805g = new long[0];
        f3806h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f3807i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f3808j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f3810l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", PiStreamDownloadService.EXTRA_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f3811m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f3812n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        o = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f3813p = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long A(long j4, float f10) {
        if (f10 == 1.0f) {
            return j4;
        }
        return Math.round(j4 / f10);
    }

    public static int B(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case zzaja.zze.zzg /* 7 */:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String C(StringBuilder sb, Formatter formatter, long j4) {
        String str;
        if (j4 == -9223372036854775807L) {
            j4 = 0;
        }
        if (j4 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j4) + 500) / 1000;
        long j10 = abs % 60;
        long j11 = (abs / 60) % 60;
        long j12 = abs / 3600;
        sb.setLength(0);
        if (j12 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11), Long.valueOf(j10)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j11), Long.valueOf(j10)).toString();
    }

    public static String[] D() {
        String locale;
        String[] strArr;
        LocaleList locales;
        String languageTags;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i10 = f3799a;
        if (i10 >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            Locale locale2 = configuration.locale;
            if (i10 >= 21) {
                locale = locale2.toLanguageTag();
            } else {
                locale = locale2.toString();
            }
            strArr = new String[]{locale};
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr[i11] = P(strArr[i11]);
        }
        return strArr;
    }

    public static String E(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            o.d("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    public static String F(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i10 >= 10000) {
                    return a3.g.o("custom (", i10, ")");
                }
                return "?";
        }
    }

    public static byte[] G(String str) {
        return str.getBytes(q6.e.f9207c);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean H(c1.z0 r5) {
        /*
            r0 = r5
            j1.d0 r0 = (j1.d0) r0
            int r1 = r0.G()
            r2 = 1
            if (r1 != r2) goto L18
            r3 = 2
            r4 = r5
            c1.i r4 = (c1.i) r4
            boolean r3 = r4.d(r3)
            if (r3 == 0) goto L18
            r0.P()
            goto L2e
        L18:
            r0 = 4
            if (r1 != r0) goto L30
            r1 = r5
            c1.i r1 = (c1.i) r1
            boolean r3 = r1.d(r0)
            if (r3 == 0) goto L30
            r3 = r1
            j1.d0 r3 = (j1.d0) r3
            int r3 = r3.w()
            r1.k(r3, r0)
        L2e:
            r0 = r2
            goto L31
        L30:
            r0 = 0
        L31:
            c1.i r5 = (c1.i) r5
            boolean r1 = r5.d(r2)
            if (r1 == 0) goto L3f
            j1.d0 r5 = (j1.d0) r5
            r5.V(r2)
            goto L40
        L3f:
            r2 = r0
        L40:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.b0.H(c1.z0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean I(f1.t r3, f1.t r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.f3860c
            int r1 = r3.f3859b
            int r0 = r0 - r1
            r1 = 0
            if (r0 > 0) goto L9
            return r1
        L9:
            byte[] r2 = r4.f3858a
            int r2 = r2.length
            if (r2 >= r0) goto L13
            int r0 = r0 * 2
            r4.a(r0)
        L13:
            if (r5 != 0) goto L1a
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L1a:
            byte[] r0 = r3.f3858a
            int r2 = r3.f3859b
            int r3 = r3.f3860c
            int r3 = r3 - r2
            r5.setInput(r0, r2, r3)
            r3 = r1
        L25:
            byte[] r0 = r4.f3858a     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r2 = r0.length     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r0 == 0) goto L3c
            r4.F(r3)     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            r5.reset()
            r3 = 1
            return r3
        L3c:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r0 != 0) goto L55
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r0 == 0) goto L49
            goto L55
        L49:
            byte[] r0 = r4.f3858a     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r2 = r0.length     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r3 != r2) goto L25
            int r0 = r0.length     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r0 = r0 * 2
            r4.a(r0)     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            goto L25
        L55:
            r5.reset()
            return r1
        L59:
            r3 = move-exception
            r5.reset()
            throw r3
        L5e:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.b0.I(f1.t, f1.t, java.util.zip.Inflater):boolean");
    }

    public static String J(int i10) {
        return Integer.toString(i10, 36);
    }

    public static boolean K(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static boolean L(Context context) {
        int i10 = f3799a;
        if (i10 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i10 == 30) {
                String str = f3802d;
                if (j5.a.s(str, "moto g(20)") || j5.a.s(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean M(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean N(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long O(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 * 1000;
    }

    public static String P(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String g02 = j5.a.g0(str);
        int i10 = 0;
        String str2 = g02.split("-", 2)[0];
        if (f3809k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f3810l;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                hashMap.put(strArr[i11], strArr[i11 + 1]);
            }
            f3809k = hashMap;
        }
        String str4 = (String) f3809k.get(str2);
        if (str4 != null) {
            g02 = str4 + g02.substring(str2.length());
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return g02;
        }
        while (true) {
            String[] strArr2 = f3811m;
            if (i10 < strArr2.length) {
                if (g02.startsWith(strArr2[i10])) {
                    return strArr2[i10 + 1] + g02.substring(strArr2[i10].length());
                }
                i10 += 2;
            } else {
                return g02;
            }
        }
    }

    public static Object[] Q(int i10, Object[] objArr) {
        boolean z9;
        if (i10 <= objArr.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        return Arrays.copyOf(objArr, i10);
    }

    public static long R(String str) {
        int i10;
        Matcher matcher = f3806h.matcher(str);
        if (matcher.matches()) {
            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                i10 = 0;
            } else {
                i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i10 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i10 != 0) {
                return timeInMillis - (i10 * 60000);
            }
            return timeInMillis;
        }
        throw r0.a("Invalid date/time format: " + str, null);
    }

    public static void S(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void T(int i10, int i11, ArrayList arrayList) {
        if (i10 >= 0 && i11 <= arrayList.size() && i10 <= i11) {
            if (i10 != i11) {
                arrayList.subList(i10, i11).clear();
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static long U(int i10, long j4) {
        return X(j4, 1000000L, i10, RoundingMode.FLOOR);
    }

    public static long V(long j4, long j10, long j11) {
        return X(j4, j10, j11, RoundingMode.FLOOR);
    }

    public static void W(long[] jArr, long j4) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i10 = 0;
        if (j4 >= 1000000 && j4 % 1000000 == 0) {
            long v9 = q6.g.v(j4, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = q6.g.v(jArr[i10], v9, roundingMode);
                i10++;
            }
            return;
        }
        if (j4 < 1000000 && 1000000 % j4 == 0) {
            long v10 = q6.g.v(1000000L, j4, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = q6.g.g0(jArr[i10], v10);
                i10++;
            }
            return;
        }
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long j10 = jArr[i11];
            if (j10 != 0) {
                if (j4 >= j10 && j4 % j10 == 0) {
                    jArr[i11] = q6.g.v(1000000L, q6.g.v(j4, j10, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j4 < j10 && j10 % j4 == 0) {
                    jArr[i11] = q6.g.g0(1000000L, q6.g.v(j10, j4, RoundingMode.UNNECESSARY));
                } else {
                    jArr[i11] = Y(j10, 1000000L, j4, roundingMode);
                }
            }
        }
    }

    public static long X(long j4, long j10, long j11, RoundingMode roundingMode) {
        if (j4 == 0 || j10 == 0) {
            return 0L;
        }
        if (j11 >= j10 && j11 % j10 == 0) {
            return q6.g.v(j4, q6.g.v(j11, j10, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j11 < j10 && j10 % j11 == 0) {
            return q6.g.g0(j4, q6.g.v(j10, j11, RoundingMode.UNNECESSARY));
        }
        if (j11 >= j4 && j11 % j4 == 0) {
            return q6.g.v(j10, q6.g.v(j11, j4, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j11 < j4 && j4 % j11 == 0) {
            return q6.g.g0(j10, q6.g.v(j4, j11, RoundingMode.UNNECESSARY));
        }
        return Y(j4, j10, j11, roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (java.lang.Math.abs(r0 - r7) == 0.5d) goto L60;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0093. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long Y(long r17, long r19, long r21, java.math.RoundingMode r23) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.b0.Y(long, long, long, java.math.RoundingMode):long");
    }

    public static boolean Z(z0 z0Var, boolean z9) {
        if (z0Var == null) {
            return true;
        }
        d0 d0Var = (d0) z0Var;
        if (!d0Var.E() || d0Var.G() == 1 || d0Var.G() == 4) {
            return true;
        }
        if (z9) {
            d0Var.h0();
            if (d0Var.f5675f0.f5648m != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static String[] a0(String str) {
        return str.split("/", -1);
    }

    public static int b(long[] jArr, long j4, boolean z9) {
        int binarySearch = Arrays.binarySearch(jArr, j4);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j4);
        if (z9) {
            return binarySearch - 1;
        }
        return binarySearch;
    }

    public static String[] b0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int c(d0.h hVar, long j4) {
        int i10 = hVar.f3026a - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            if (hVar.h(i12) < j4) {
                i11 = i12 + 1;
            } else {
                i10 = i12 - 1;
            }
        }
        int i13 = i10 + 1;
        if (i13 < hVar.f3026a && hVar.h(i13) == j4) {
            return i13;
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public static long c0(long j4) {
        if (j4 != -9223372036854775807L && j4 != Long.MIN_VALUE) {
            return j4 / 1000;
        }
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(r6.o0 r2, java.lang.Long r3, boolean r4) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L1d
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L1b
            goto La
        L1b:
            int r2 = r0 + 1
        L1d:
            if (r4 == 0) goto L24
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.b0.d(r6.o0, java.lang.Long, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L19
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L13
            r1 = r2[r0]
            if (r1 != r3) goto L13
            goto La
        L13:
            if (r4 == 0) goto L18
            int r2 = r0 + 1
            goto L19
        L18:
            r2 = r0
        L19:
            if (r5 == 0) goto L20
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.b0.e(int[], int, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(long[] r3, long r4, boolean r6) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r3 = -r0
            goto L17
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L15
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L15
            goto La
        L15:
            int r3 = r0 + 1
        L17:
            if (r6 == 0) goto L1e
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L1e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.b0.f(long[], long, boolean):int");
    }

    public static float g(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int h(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long i(long j4, long j10, long j11) {
        return Math.max(j10, Math.min(j4, j11));
    }

    public static boolean j(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int k(int i10, byte[] bArr, int i11, int i12) {
        while (i10 < i11) {
            i12 = f3812n[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static Handler l(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        w7.b.w(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String m(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String n(byte[] bArr) {
        return new String(bArr, q6.e.f9207c);
    }

    public static int o(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case zzaja.zze.zzg /* 7 */:
            case 8:
                return 23;
            case 9:
            case 10:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                }
        }
    }

    public static AudioFormat p(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int q(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = f1.b0.f3799a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.b0.q(int):int");
    }

    public static int r(int i10, String str) {
        int i11 = 0;
        for (String str2 : b0(str)) {
            if (i10 == q0.i(q0.e(str2))) {
                i11++;
            }
        }
        return i11;
    }

    public static String s(int i10, String str) {
        String[] b02 = b0(str);
        if (b02.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : b02) {
            if (i10 == q0.i(q0.e(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.toString();
    }

    public static Drawable t(Context context, Resources resources, int i10) {
        if (f3799a >= 21) {
            return a0.a(context, resources, i10);
        }
        return resources.getDrawable(i10);
    }

    public static int u(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int v(String str) {
        String[] split;
        int length;
        boolean z9;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z9 = true;
        } else {
            z9 = false;
        }
        try {
            str2.getClass();
            int parseInt = Integer.parseInt(str2);
            if (z9) {
                return -parseInt;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long w(long j4, float f10) {
        if (f10 == 1.0f) {
            return j4;
        }
        return Math.round(j4 * f10);
    }

    public static long x(long j4) {
        if (j4 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j4 + SystemClock.elapsedRealtime();
    }

    public static int y(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int z(int i10, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 21) {
                        if (i10 != 22) {
                            if (i10 != 268435456) {
                                if (i10 != 1342177280) {
                                    if (i10 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    return i11 * 3;
                }
                return i11 * 4;
            }
            return i11;
        }
        return i11 * 2;
    }
}
