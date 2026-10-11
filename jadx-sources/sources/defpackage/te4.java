package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.anistation.download.service.ExternalDownloadService;
import com.anistation.model.download.EpisodeDownloadState;
import com.anistation.model.download.external.ExternalDownloadRecord;
import com.unity3d.services.core.device.MimeTypes;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class te4 {
    public static final os0 a;
    public static final os0 b;
    public static final o47 c = new o47(0.31006f, 0.31616f);
    public static final o47 d = new o47(0.34567f, 0.3585f);
    public static final o47 e = new o47(0.32168f, 0.33767f);
    public static final o47 f = new o47(0.31271f, 0.32902f);
    public static final float[] g = {0.964212f, 1.0f, 0.825188f};
    public static final int[] h = {13, 15, 14};
    public static final f65 i = new Object();
    public static final z95 j = new z95(3);
    public static final Object k = new Object();
    public static final String[] l = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] m = {"ad_impression"};
    public static final String[] n = {"ad_impression", "in_app_purchase"};
    public static final String[] o = {"ad_impression"};
    public static final String[] p = {"ad_impression", "in_app_purchase"};
    public static final String[] q = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] r = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* JADX WARN: Type inference failed for: r1v9, types: [f65, java.lang.Object] */
    static {
        byte b2 = 27;
        a = new os0(210148896, false, new vs0(b2));
        b = new os0(-1759434350, false, new ys0(b2));
    }

    public static int A(boolean z) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            da2 da2Var = new da2();
            da2Var.o = qy3.n(MimeTypes.VIDEO_H264);
            ea2 ea2Var = new ea2(da2Var);
            if (ea2Var.p != null) {
                o15 g2 = up3.g(ea2Var, z, false);
                for (int i2 = 0; i2 < g2.A; i2++) {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((mp3) g2.get(i2)).d.getVideoCapabilities();
                    if (videoCapabilities != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                            if (supportedPerformancePoints.get(i3).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (sp3 unused) {
        }
        return 0;
    }

    public static final ha3 B(ha3 ha3Var) {
        ha3 ha3Var2;
        fa4 fa4Var;
        ha3 x = ha3Var.x();
        while (true) {
            ha3 ha3Var3 = x;
            ha3Var2 = ha3Var;
            ha3Var = ha3Var3;
            if (ha3Var == null) {
                break;
            }
            x = ha3Var.x();
        }
        if (ha3Var2 instanceof fa4) {
            fa4Var = (fa4) ha3Var2;
        } else {
            fa4Var = null;
        }
        if (fa4Var == null) {
            return ha3Var2;
        }
        fa4 fa4Var2 = fa4Var.T;
        while (true) {
            fa4 fa4Var3 = fa4Var2;
            fa4 fa4Var4 = fa4Var;
            fa4Var = fa4Var3;
            if (fa4Var != null) {
                fa4Var2 = fa4Var.T;
            } else {
                return fa4Var4;
            }
        }
    }

    public static m03 C(int i2, long j2) {
        long j3 = i2;
        long j4 = j3 / 1000000000;
        if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
            j4--;
        }
        long j5 = j2 + j4;
        if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
            if (j2 > 0) {
                return m03.A;
            }
            return m03.z;
        }
        if (j5 < -31557014167219200L) {
            return m03.z;
        }
        if (j5 > 31556889864403199L) {
            return m03.A;
        }
        long j6 = j3 % 1000000000;
        return new m03(j5, (int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)));
    }

    public static int D(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final qg0 E(vz0 vz0Var) {
        Unsafe unsafe;
        qg0 qg0Var;
        qg0 qg0Var2;
        if (!(vz0Var instanceof jh1)) {
            return new qg0(1, vz0Var);
        }
        jh1 jh1Var = (jh1) vz0Var;
        long j2 = jh1.E;
        loop0: while (true) {
            unsafe = qs.a;
            Object objectVolatile = unsafe.getObjectVolatile(jh1Var, j2);
            qg0Var = null;
            ni1 ni1Var = kh1.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(jh1Var, j2, ni1Var);
                qg0Var2 = null;
                break;
            }
            if (objectVolatile instanceof qg0) {
                do {
                    unsafe = qs.a;
                    if (unsafe.compareAndSwapObject(jh1Var, jh1.E, objectVolatile, ni1Var)) {
                        qg0Var2 = (qg0) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(jh1Var, j2) == objectVolatile);
            } else if (objectVolatile != ni1Var && !(objectVolatile instanceof Throwable)) {
                v71.g(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (qg0Var2 != null) {
            long j3 = qg0.E;
            Object objectVolatile2 = unsafe.getObjectVolatile(qg0Var2, j3);
            if ((objectVolatile2 instanceof br0) && ((br0) objectVolatile2).d != null) {
                qg0Var2.o();
            } else {
                unsafe.putIntVolatile(qg0Var2, qg0.C, 536870911);
                unsafe.putObjectVolatile(qg0Var2, j3, t4.x);
                qg0Var = qg0Var2;
            }
            if (qg0Var != null) {
                return qg0Var;
            }
        }
        return new qg0(2, vz0Var);
    }

    public static Intent F(Context context, ComponentName componentName) {
        String G = G(context, componentName);
        if (G == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), G);
        if (G(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String G(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static List H(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List I(Object... objArr) {
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            asList.getClass();
            return asList;
        }
        return nt1.x;
    }

    public static ArrayList J(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new xr(objArr, true));
    }

    public static final List K(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return H(list.get(0));
        }
        return nt1.x;
    }

    public static ss4 L(String str, ap1 ap1Var, z33 z33Var, int i2) {
        if ((i2 & 2) != 0) {
            ap1Var = null;
        }
        ub2 ub2Var = z33Var;
        if ((i2 & 4) != 0) {
            ub2Var = new rs4((byte) 0);
        }
        ja1 ja1Var = rh1.a;
        return new ss4(str, ap1Var, ub2Var, db.b(j91.y.plus(iv5.a())));
    }

    public static final void M(int i2, int i3) {
        if (i3 >= 0) {
            if (i3 <= i2) {
                return;
            }
            ze0.g(qx1.l("toIndex (", i3, ") is greater than size (", i2, ")."));
            return;
        }
        ze0.k(qx1.i(i3, "fromIndex (0) is greater than toIndex (", ")."));
    }

    public static void N(Context context) {
        context.getClass();
        List<ExternalDownloadRecord> a2 = i02.d.M(context).a();
        if (a2 == null || !a2.isEmpty()) {
            for (ExternalDownloadRecord externalDownloadRecord : a2) {
                if (externalDownloadRecord.getState() == EpisodeDownloadState.QUEUED || externalDownloadRecord.getState() == EpisodeDownloadState.DOWNLOADING || externalDownloadRecord.getState() == EpisodeDownloadState.RESTARTING) {
                    context.startForegroundService(new Intent(context, (Class<?>) ExternalDownloadService.class));
                    return;
                }
            }
        }
    }

    public static Set O(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }

    public static final long P(n05 n05Var) {
        float f2 = n05Var.c - n05Var.a;
        float f3 = n05Var.d - n05Var.b;
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final tu1 Q(xi6 xi6Var, ub2 ub2Var, Object obj, kd2 kd2Var) {
        kd2Var.c0(-422486566, xi6Var);
        boolean h2 = xi6Var.h();
        qt0 qt0Var = xi6Var.a;
        tu1 tu1Var = tu1.z;
        tu1 tu1Var2 = tu1.y;
        tu1 tu1Var3 = tu1.x;
        if (h2) {
            kd2Var.e0(-212166497);
            kd2Var.q(false);
            if (((Boolean) ub2Var.invoke(obj)).booleanValue()) {
                tu1Var = tu1Var2;
            } else if (!((Boolean) ub2Var.invoke(qt0Var.v())).booleanValue()) {
                tu1Var = tu1Var3;
            }
        } else {
            kd2Var.e0(-211886815);
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = xt5.g(Boolean.FALSE);
                kd2Var.n0(Q);
            }
            w44 w44Var = (w44) Q;
            Object value = xi6Var.e.getValue();
            if (((Boolean) ub2Var.invoke(qt0Var.v())).booleanValue() || (value != null && ((Boolean) ub2Var.invoke(value)).booleanValue())) {
                w44Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) ub2Var.invoke(obj)).booleanValue()) {
                tu1Var = tu1Var2;
            } else if ((value != null && ((Boolean) ub2Var.invoke(value)).booleanValue()) || !((Boolean) w44Var.getValue()).booleanValue()) {
                tu1Var = tu1Var3;
            }
            kd2Var.q(false);
        }
        kd2Var.q(false);
        return tu1Var;
    }

    public static void R() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final long S(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, pa0] */
    public static final String T(String str) {
        InetAddress z;
        str.getClass();
        int i2 = 0;
        int i3 = -1;
        if (uz5.M(str, ":", false)) {
            if (b06.I(str, "[", false) && b06.A(str, "]", false)) {
                z = z(str, 1, str.length() - 1);
            } else {
                z = z(str, 0, str.length());
            }
            if (z != null) {
                byte[] address = z.getAddress();
                if (address.length == 16) {
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < address.length) {
                        int i6 = i4;
                        while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                            i6 += 2;
                        }
                        int i7 = i6 - i4;
                        if (i7 > i5 && i7 >= 4) {
                            i3 = i4;
                            i5 = i7;
                        }
                        i4 = i6 + 2;
                    }
                    ?? obj = new Object();
                    while (i2 < address.length) {
                        if (i2 == i3) {
                            obj.w0(58);
                            i2 += i5;
                            if (i2 == 16) {
                                obj.w0(58);
                            }
                        } else {
                            if (i2 > 0) {
                                obj.w0(58);
                            }
                            byte b2 = address[i2];
                            byte[] bArr = dq6.a;
                            obj.x0(((b2 & 255) << 8) | (address[i2 + 1] & 255));
                            i2 += 2;
                        }
                    }
                    return obj.T(obj.y, kl0.a);
                }
                if (address.length == 4) {
                    return z.getHostAddress();
                }
                throw new AssertionError(qx1.g('\'', "Invalid IPv6 address: '", str));
            }
            return null;
        }
        try {
            String ascii = IDN.toASCII(str);
            ascii.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = ascii.toLowerCase(locale);
            lowerCase.getClass();
            if (lowerCase.length() != 0) {
                int length = lowerCase.length();
                for (int i8 = 0; i8 < length; i8++) {
                    char charAt = lowerCase.charAt(i8);
                    if (a34.D(charAt, 31) <= 0 || a34.D(charAt, 127) >= 0 || uz5.S(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final int U(float f2, float[] fArr, int i2) {
        float f3 = 0.0f;
        if (f2 >= 0.0f) {
            f3 = f2;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05b7  */
    /* JADX WARN: Type inference failed for: r7v18, types: [os0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.xi6 r32, defpackage.ub2 r33, defpackage.yz3 r34, defpackage.iv1 r35, defpackage.rx1 r36, defpackage.ic2 r37, defpackage.os0 r38, defpackage.kd2 r39, int r40) {
        /*
            Method dump skipped, instructions count: 2210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te4.a(xi6, ub2, yz3, iv1, rx1, ic2, os0, kd2, int):void");
    }

    public static final void b(y44 y44Var, yz3 yz3Var, iv1 iv1Var, rx1 rx1Var, String str, os0 os0Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        yz3 yz3Var2;
        String str2;
        kd2Var.f0(657024243);
        if (kd2Var.f(y44Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3 | 48;
        if (kd2Var.f(iv1Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if (kd2Var.f(rx1Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5 | 24576;
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i8 & 1, z)) {
            xi6 M = tl7.M(y44Var, "AnimatedVisibility", kd2Var, (i8 & 14) | 48);
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = yj.C;
                kd2Var.n0(Q);
            }
            int i9 = i8 << 3;
            vz3 vz3Var = vz3.x;
            e(M, (ub2) Q, vz3Var, iv1Var, rx1Var, os0Var, kd2Var, (i9 & 57344) | (i9 & 7168) | 432 | 1572864);
            yz3Var2 = vz3Var;
            str2 = "AnimatedVisibility";
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
            str2 = str;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new bl(y44Var, yz3Var2, iv1Var, rx1Var, str2, os0Var, i2);
        }
    }

    public static final void c(boolean z, yz3 yz3Var, iv1 iv1Var, rx1 rx1Var, String str, os0 os0Var, kd2 kd2Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        yz3 yz3Var2;
        String str2;
        int i6;
        int i7;
        int i8;
        int i9;
        kd2Var.f0(-1448730565);
        if ((i2 & 6) == 0) {
            if (kd2Var.g(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.f(iv1Var)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i4 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var.f(rx1Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i4 |= i7;
        }
        int i11 = i4 | 24576;
        if ((196608 & i2) == 0) {
            if (kd2Var.h(os0Var)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i11 |= i6;
        }
        if ((74899 & i11) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i11 & 1, z2)) {
            if (i10 != 0) {
                yz3Var = vz3.x;
            }
            yz3Var2 = yz3Var;
            xi6 T = tl7.T(Boolean.valueOf(z), "AnimatedVisibility", kd2Var, (i11 & 14) | ((i11 >> 9) & 112), 0);
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = yj.A;
                kd2Var.n0(Q);
            }
            int i12 = i11 << 3;
            e(T, (ub2) Q, yz3Var2, iv1Var, rx1Var, os0Var, kd2Var, (i12 & 896) | 48 | (i12 & 7168) | (57344 & i12) | (i12 & 3670016));
            str2 = "AnimatedVisibility";
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
            str2 = str;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new al(z, yz3Var2, iv1Var, rx1Var, str2, os0Var, i2, i3, (byte) 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(boolean r30, defpackage.yz3 r31, defpackage.iv1 r32, defpackage.rx1 r33, java.lang.String r34, defpackage.os0 r35, defpackage.kd2 r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te4.d(boolean, yz3, iv1, rx1, java.lang.String, os0, kd2, int, int):void");
    }

    public static final void e(xi6 xi6Var, ub2 ub2Var, yz3 yz3Var, iv1 iv1Var, rx1 rx1Var, os0 os0Var, kd2 kd2Var, int i2) {
        int i3;
        iv1 iv1Var2;
        rx1 rx1Var2;
        os0 os0Var2;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        kd2Var.f0(-497872534);
        if ((i2 & 6) == 0) {
            if (kd2Var.f(xi6Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.h(ub2Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.f(yz3Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            iv1Var2 = iv1Var;
            if (kd2Var.f(iv1Var2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        } else {
            iv1Var2 = iv1Var;
        }
        if ((i2 & 24576) == 0) {
            rx1Var2 = rx1Var;
            if (kd2Var.f(rx1Var2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        } else {
            rx1Var2 = rx1Var;
        }
        int i10 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            os0Var2 = os0Var;
            if (kd2Var.h(os0Var2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i10 |= i4;
        } else {
            os0Var2 = os0Var;
        }
        boolean z3 = false;
        if ((599187 & i10) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i10 & 1, z)) {
            int i11 = i10 & 112;
            if (i11 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i12 = i10 & 14;
            if (i12 == 4) {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (z4 || Q == q18Var) {
                Q = new dl(ub2Var, xi6Var);
                kd2Var.n0(Q);
            }
            yz3 A = tl7.A(yz3Var, (jc2) Q);
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                Q2 = gk.A;
                kd2Var.n0(Q2);
            }
            int i13 = 196608 | i12 | i11 | (i10 & 7168) | (57344 & i10);
            int i14 = i10 << 6;
            a(xi6Var, ub2Var, A, iv1Var2, rx1Var2, (ic2) Q2, os0Var2, kd2Var, i13 | (29360128 & i14) | (i14 & 234881024));
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new zj(xi6Var, ub2Var, yz3Var, iv1Var, rx1Var, os0Var, i2);
        }
    }

    public static final void f(jb6 jb6Var, os0 os0Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        kd2Var.f0(2080741862);
        if ((i2 & 6) == 0) {
            if (kd2Var.h(jb6Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.h(os0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        byte b2 = 1;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            x97.c(jb6Var, os0Var, kd2Var, i3 & 126);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new oq0(jb6Var, os0Var, i2, b2);
        }
    }

    public static final void g(cc6 cc6Var, boolean z, os0 os0Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        kd2Var.f0(-579239002);
        if ((i2 & 6) == 0) {
            if (kd2Var.h(cc6Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.g(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.h(os0Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i3 & 1, z2)) {
            x97.d(cc6Var, z, os0Var, kd2Var, i3 & 1022);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new nq0(cc6Var, z, os0Var, i2, (byte) 1);
        }
    }

    public static final void h(sb2 sb2Var, eg1 eg1Var, os0 os0Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        Object wbVar;
        int i4;
        int i5;
        sb2 sb2Var2 = sb2Var;
        eg1 eg1Var2 = eg1Var;
        kd2Var.f0(826668973);
        if ((i2 & 6) == 0) {
            if (kd2Var.h(sb2Var2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.f(eg1Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i6 = i3;
        boolean z3 = true;
        byte b2 = 0;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i6 & 1, z)) {
            View view = (View) kd2Var.j(eb.f);
            ud1 ud1Var = (ud1) kd2Var.j(bv0.h);
            ia3 ia3Var = (ia3) kd2Var.j(bv0.n);
            id2 O = h98.O(kd2Var);
            w44 h2 = xt5.h(os0Var, kd2Var);
            Object[] objArr = new Object[0];
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (Q == obj) {
                Q = new t((byte) 9);
                kd2Var.n0(Q);
            }
            UUID uuid = (UUID) oi4.B(objArr, (sb2) Q, kd2Var);
            boolean d2 = kd2Var.d(eg1Var2.g) | kd2Var.f(view) | kd2Var.f(ud1Var) | kd2Var.f(null);
            Object Q2 = kd2Var.Q();
            if (d2 || Q2 == obj) {
                hg1 hg1Var = new hg1(sb2Var2, eg1Var2, view, ia3Var, ud1Var, uuid);
                os0 os0Var2 = new os0(-1338939603, true, new ub(h2, b2));
                dg1 dg1Var = hg1Var.E;
                dg1Var.setParentCompositionContext(O);
                dg1Var.H.setValue(os0Var2);
                dg1Var.L = true;
                dg1Var.d();
                kd2Var.n0(hg1Var);
                Q2 = hg1Var;
            }
            hg1 hg1Var2 = (hg1) Q2;
            boolean h3 = kd2Var.h(hg1Var2);
            Object Q3 = kd2Var.Q();
            if (h3 || Q3 == obj) {
                Q3 = new vb(hg1Var2, b2);
                kd2Var.n0(Q3);
            }
            db.c(hg1Var2, (ub2) Q3, kd2Var);
            boolean h4 = kd2Var.h(hg1Var2);
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = h4 | z2;
            if ((i6 & 112) != 32) {
                z3 = false;
            }
            boolean d3 = z4 | z3 | kd2Var.d(ia3Var.ordinal());
            Object Q4 = kd2Var.Q();
            if (!d3 && Q4 != obj) {
                sb2Var2 = sb2Var;
                wbVar = Q4;
                eg1Var2 = eg1Var;
            } else {
                wbVar = new wb(hg1Var2, sb2Var, eg1Var, ia3Var, (byte) 0);
                sb2Var2 = sb2Var;
                eg1Var2 = eg1Var;
                kd2Var.n0(wbVar);
            }
            db.m((sb2) wbVar, kd2Var);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new j(sb2Var2, eg1Var2, os0Var, i2);
        }
    }

    public static final void i(yz3 yz3Var, ic2 ic2Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        boolean z;
        kd2Var.f0(1090521195);
        byte b2 = 4;
        if (kd2Var.f(yz3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (kd2Var.h(ic2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i6 & 1, z)) {
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = yb.b;
                kd2Var.n0(Q);
            }
            vo3 vo3Var = (vo3) Q;
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E = o80.E(kd2Var, yz3Var);
            tt0.d.getClass();
            int i7 = (((((i6 << 3) & 112) | (((i6 >> 3) & 14) | 384)) << 6) & 896) | 6;
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, vo3Var);
            ss5.i(p7.E, kd2Var, l2);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            ic2Var.invoke(kd2Var, Integer.valueOf((i7 >> 6) & 14));
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new q(b2, i2, yz3Var, ic2Var);
        }
    }

    public static final void j(Boolean bool, Object obj, og3 og3Var, ub2 ub2Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        kd2Var.f0(696924721);
        if ((i2 & 6) == 0) {
            if (kd2Var.h(bool)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.h(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var.h(ub2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            kd2Var.a0();
            if ((i2 & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
            } else {
                og3Var = (og3) kd2Var.j(vj3.a);
            }
            int i7 = i3 & (-897);
            kd2Var.r();
            boolean f2 = kd2Var.f(bool) | kd2Var.f(obj) | kd2Var.f(og3Var);
            Object Q = kd2Var.Q();
            if (f2 || Q == au0.a) {
                Q = new xg3(og3Var.getLifecycle());
                kd2Var.n0(Q);
            }
            k(og3Var, (xg3) Q, ub2Var, kd2Var, (i7 >> 3) & 896);
        } else {
            kd2Var.Y();
        }
        og3 og3Var2 = og3Var;
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new c50(bool, obj, og3Var2, ub2Var, i2, (byte) 4);
        }
    }

    public static final void k(og3 og3Var, xg3 xg3Var, ub2 ub2Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        kd2Var.f0(228371534);
        if ((i2 & 6) == 0) {
            if (kd2Var.h(og3Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.h(xg3Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.h(ub2Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        boolean z2 = false;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            boolean h2 = kd2Var.h(xg3Var);
            if ((i3 & 896) == 256) {
                z2 = true;
            }
            boolean h3 = h2 | z2 | kd2Var.h(og3Var);
            Object Q = kd2Var.Q();
            if (h3 || Q == au0.a) {
                Q = new bg((Object) og3Var, (Object) xg3Var, (Object) ub2Var, (byte) 18);
                kd2Var.n0(Q);
            }
            db.d(og3Var, xg3Var, (ub2) Q, kd2Var);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je((byte) 10, i2, (Object) og3Var, (Object) xg3Var, (Object) ub2Var);
        }
    }

    public static final void l(yz3 yz3Var, ic2 ic2Var, kd2 kd2Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        kd2Var.f0(-1298353104);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.h(ic2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i4 & 1, z)) {
            if (i7 != 0) {
                yz3Var = vz3.x;
            }
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = new w06(p7.O);
                kd2Var.n0(Q);
            }
            m((w06) Q, yz3Var, ic2Var, kd2Var, (i4 << 3) & 1008);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new de2(yz3Var, ic2Var, i2, i3);
        }
    }

    public static final void m(w06 w06Var, yz3 yz3Var, ic2 ic2Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        kd2Var.f0(-511989831);
        if ((i2 & 6) == 0) {
            if (kd2Var.h(w06Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.h(ic2Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            int hashCode = Long.hashCode(kd2Var.T);
            id2 O = h98.O(kd2Var);
            yz3 E = o80.E(kd2Var, yz3Var);
            al4 l2 = kd2Var.l();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(w06Var.c, kd2Var, w06Var);
            ss5.i(w06Var.d, kd2Var, O);
            ss5.i(w06Var.e, kd2Var, ic2Var);
            tt0.d.getClass();
            ss5.i(p7.E, kd2Var, l2);
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            kd2Var.q(true);
            if (!kd2Var.F()) {
                kd2Var.e0(-1259245908);
                boolean h2 = kd2Var.h(w06Var);
                Object Q = kd2Var.Q();
                if (h2 || Q == au0.a) {
                    Q = new nj4(w06Var, (byte) 27);
                    kd2Var.n0(Q);
                }
                db.m((sb2) Q, kd2Var);
                kd2Var.q(false);
            } else {
                kd2Var.e0(-1259187287);
                kd2Var.q(false);
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je((byte) 13, i2, (Object) w06Var, (Object) yz3Var, (Object) ic2Var);
        }
    }

    public static ArrayList n(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new xr(objArr, true));
    }

    public static int o(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        M(arrayList.size(), size);
        int i2 = size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int s = jf7.s((Comparable) arrayList.get(i4), comparable);
            if (s < 0) {
                i3 = i4 + 1;
            } else if (s > 0) {
                i2 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final n05 p(ha3 ha3Var) {
        ha3 x = ha3Var.x();
        if (x != null) {
            return x.G(ha3Var, true);
        }
        return new n05(0.0f, 0.0f, (int) (ha3Var.j() >> 32), (int) (ha3Var.j() & 4294967295L));
    }

    public static final n05 q(ha3 ha3Var, boolean z) {
        ha3 B = B(ha3Var);
        float j2 = (int) (B.j() >> 32);
        float j3 = (int) (B.j() & 4294967295L);
        n05 G = B.G(ha3Var, z);
        float f2 = G.a;
        float f3 = 0.0f;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > j2) {
                f2 = j2;
            }
        }
        float f4 = G.b;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > j3) {
                f4 = j3;
            }
        }
        float f5 = G.c;
        if (z) {
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 <= j2) {
                j2 = f5;
            }
            f5 = j2;
        }
        float f6 = G.d;
        if (z) {
            if (f6 >= 0.0f) {
                f3 = f6;
            }
            if (f3 <= j3) {
                j3 = f3;
            }
            f6 = j3;
        }
        if (f2 == f5 || f4 == f6) {
            return n05.e;
        }
        long d2 = B.d((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long d3 = B.d((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long d4 = B.d((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
        long d5 = B.d((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d3 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (d5 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (d4 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (d3 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (d5 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (d4 & 4294967295L));
        return new n05(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static ai3 r(ai3 ai3Var) {
        ai3Var.h();
        ai3Var.z = true;
        if (ai3Var.y > 0) {
            return ai3Var;
        }
        return ai3.A;
    }

    public static wk5 s(wk5 wk5Var) {
        an3 an3Var = wk5Var.x;
        an3Var.b();
        if (an3Var.F > 0) {
            return wk5Var;
        }
        return wk5.y;
    }

    public static final float v(f61 f61Var, float f2, float f3) {
        float f4;
        float f5;
        q42 q42Var = f61Var.a;
        nl nlVar = new nl(0.0f);
        int b2 = nlVar.b();
        for (int i2 = 0; i2 < b2; i2++) {
            if (i2 == 0) {
                f4 = f2;
            } else {
                f4 = 0.0f;
            }
            if (i2 == 0) {
                f5 = f3;
            } else {
                f5 = 0.0f;
            }
            nlVar.e(i2, q42Var.C(f4, f5));
        }
        return nlVar.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r2 == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap w(android.graphics.drawable.Drawable r16, android.graphics.Bitmap.Config r17, defpackage.tq5 r18, defpackage.xa5 r19, defpackage.tq5 r20, boolean r21) {
        /*
            r0 = r16
            r1 = r18
            r4 = r19
            r5 = r20
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r2 == 0) goto L5d
            r2 = r0
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r11 = r2.getBitmap()
            android.graphics.Bitmap$Config r2 = r11.getConfig()
            if (r17 == 0) goto L2a
            boolean r3 = defpackage.w65.F(r17)
            if (r3 == 0) goto L27
            goto L2a
        L27:
            r3 = r17
            goto L2c
        L2a:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L2c:
            if (r2 != r3) goto L5d
            if (r21 == 0) goto L31
            goto L5c
        L31:
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            long r2 = defpackage.oi4.k(r2, r3, r1, r4, r5)
            long r6 = r2 >> r10
            int r6 = (int) r6
            long r2 = r2 & r8
            int r2 = (int) r2
            r5 = r2
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            r7 = r6
            r6 = r4
            r4 = r7
            r7 = r20
            double r2 = defpackage.oi4.l(r2, r3, r4, r5, r6, r7)
            r4 = r6
            r5 = r7
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L5d
        L5c:
            return r11
        L5d:
            android.graphics.drawable.Drawable r6 = r0.mutate()
            int r0 = defpackage.pq6.b(r6)
            r2 = 512(0x200, float:7.17E-43)
            if (r0 <= 0) goto L6a
            goto L6b
        L6a:
            r0 = r2
        L6b:
            int r3 = defpackage.pq6.a(r6)
            if (r3 <= 0) goto L72
            r2 = r3
        L72:
            long r11 = defpackage.oi4.k(r0, r2, r1, r4, r5)
            long r13 = r11 >> r10
            int r1 = (int) r13
            long r7 = r11 & r8
            int r3 = (int) r7
            r15 = r2
            r2 = r1
            r1 = r15
            double r2 = defpackage.oi4.l(r0, r1, r2, r3, r4, r5)
            double r4 = (double) r0
            double r4 = r4 * r2
            int r0 = defpackage.io3.g0(r4)
            double r4 = (double) r1
            double r2 = r2 * r4
            int r1 = defpackage.io3.g0(r2)
            if (r17 == 0) goto L9b
            boolean r2 = defpackage.w65.F(r17)
            if (r2 == 0) goto L98
            goto L9b
        L98:
            r2 = r17
            goto L9d
        L9b:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L9d:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Rect r3 = r6.getBounds()
            int r4 = r3.left
            int r5 = r3.top
            int r7 = r3.right
            int r3 = r3.bottom
            r8 = 0
            r6.setBounds(r8, r8, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.draw(r0)
            r6.setBounds(r4, r5, r7, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te4.w(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, tq5, xa5, tq5, boolean):android.graphics.Bitmap");
    }

    public static final s82 x(Context context) {
        int i2;
        oa7 oa7Var = new oa7(context, (byte) 1);
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = t92.a.a(context);
        } else {
            i2 = 0;
        }
        return new s82(oa7Var, new lc(i2));
    }

    public static ai3 y() {
        return new ai3(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress z(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te4.z(java.lang.String, int, int):java.net.InetAddress");
    }

    public nh2 t(Context context, Looper looper, tp tpVar, Object obj, sh2 sh2Var, th2 th2Var) {
        return u(context, looper, tpVar, obj, (wa7) sh2Var, (wa7) th2Var);
    }

    public nh2 u(Context context, Looper looper, tp tpVar, Object obj, wa7 wa7Var, wa7 wa7Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
