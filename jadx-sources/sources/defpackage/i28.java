package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i28 extends pv7 {
    public static final String[] F = {"firebase_", "google_", "ga_"};
    public static final String[] G = {"_err"};
    public final AtomicLong A;
    public int B;
    public ap3 C;
    public Boolean D;
    public Integer E;
    public SecureRandom z;

    public i28(gu7 gu7Var) {
        super(gu7Var);
        this.E = null;
        this.A = new AtomicLong(0L);
    }

    public static ArrayList F0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yh7 yh7Var = (yh7) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", yh7Var.x);
            bundle.putString("origin", yh7Var.y);
            bundle.putLong("creation_timestamp", yh7Var.A);
            bundle.putString(MediationMetaData.KEY_NAME, yh7Var.z.y);
            Object c = yh7Var.z.c();
            a34.x(c);
            qs5.i(bundle, c);
            bundle.putBoolean("active", yh7Var.B);
            String str = yh7Var.C;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            mm7 mm7Var = yh7Var.D;
            if (mm7Var != null) {
                bundle.putString("timed_out_event_name", mm7Var.x);
                im7 im7Var = mm7Var.y;
                if (im7Var != null) {
                    bundle.putBundle("timed_out_event_params", im7Var.g());
                }
            }
            bundle.putLong("trigger_timeout", yh7Var.E);
            mm7 mm7Var2 = yh7Var.F;
            if (mm7Var2 != null) {
                bundle.putString("triggered_event_name", mm7Var2.x);
                im7 im7Var2 = mm7Var2.y;
                if (im7Var2 != null) {
                    bundle.putBundle("triggered_event_params", im7Var2.g());
                }
            }
            bundle.putLong("triggered_timestamp", yh7Var.z.z);
            bundle.putLong("time_to_live", yh7Var.G);
            mm7 mm7Var3 = yh7Var.H;
            if (mm7Var3 != null) {
                bundle.putString("expired_event_name", mm7Var3.x);
                im7 im7Var3 = mm7Var3.y;
                if (im7Var3 != null) {
                    bundle.putBundle("expired_event_params", im7Var3.g());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean G0(Context context) {
        ActivityInfo receiverInfo;
        a34.x(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void H0(dy7 dy7Var, Bundle bundle, boolean z) {
        if (bundle != null && dy7Var != null) {
            if (bundle.containsKey("_sc") && !z) {
                z = false;
            } else {
                String str = dy7Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = dy7Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", dy7Var.c);
                return;
            }
        }
        if (bundle != null && dy7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean L0(String str) {
        a34.u(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static boolean N0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    String host = new URL(stringExtra).getHost();
                    if (!TextUtils.isEmpty(host)) {
                        return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
                    }
                } catch (MalformedURLException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static String S(int i, String str, boolean z) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) > i) {
                if (z) {
                    return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
                }
                return null;
            }
            return str;
        }
        return null;
    }

    public static boolean X0(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    public static void d0(ub7 ub7Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        j0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        ub7Var.d(str, "_err", bundle);
    }

    public static MessageDigest e0() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long f0(byte[] bArr) {
        a34.x(bArr);
        int length = bArr.length;
        long j = 0;
        if (length > 0) {
            int i = 0;
            for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
                j += (bArr[i2] & 255) << i;
                i += 8;
            }
            return j;
        }
        p65.l();
        return 0L;
    }

    public static boolean g0(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static final boolean j0(int i, Bundle bundle) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            return true;
        }
        return false;
    }

    public static boolean m0(String str, String[] strArr) {
        a34.x(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean n0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.equals("*") && !Arrays.asList(str.split(",")).contains(str2)) {
            return false;
        }
        return true;
    }

    public static boolean p0(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    public static byte[] u0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final void A0(bo7 bo7Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, i);
        try {
            bo7Var.z(bundle);
        } catch (RemoteException e) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.F.b(e, "Error returning int value to wrapper");
        }
    }

    public final void B0(bo7 bo7Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, bArr);
        try {
            bo7Var.z(bundle);
        } catch (RemoteException e) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.F.b(e, "Error returning byte array to wrapper");
        }
    }

    public final void C0(bo7 bo7Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, z);
        try {
            bo7Var.z(bundle);
        } catch (RemoteException e) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.F.b(e, "Error returning boolean value to wrapper");
        }
    }

    public final void D0(bo7 bo7Var, Bundle bundle) {
        try {
            bo7Var.z(bundle);
        } catch (RemoteException e) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.F.b(e, "Error returning bundle value to wrapper");
        }
    }

    public final void E0(bo7 bo7Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, arrayList);
        try {
            bo7Var.z(bundle);
        } catch (RemoteException e) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.F.b(e, "Error returning bundle list to wrapper");
        }
    }

    public final String I0() {
        byte[] bArr = new byte[16];
        K0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long J0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.A;
        if (atomicLong.get() == 0) {
            synchronized (atomicLong) {
                long nanoTime = System.nanoTime();
                ((gu7) this.x).H.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i = this.B + 1;
                this.B = i;
                j = nextLong + i;
            }
            return j;
        }
        AtomicLong atomicLong2 = this.A;
        synchronized (atomicLong2) {
            atomicLong2.compareAndSet(-1L, 1L);
            andIncrement = atomicLong2.getAndIncrement();
        }
        return andIncrement;
    }

    public final SecureRandom K0() {
        L();
        SecureRandom secureRandom = this.z;
        if (secureRandom == null) {
            SecureRandom secureRandom2 = new SecureRandom();
            this.z = secureRandom2;
            return secureRandom2;
        }
        return secureRandom;
    }

    @Override // defpackage.pv7
    public final boolean M() {
        return true;
    }

    public final Bundle M0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        gu7 gu7Var;
        gu7 gu7Var2 = (gu7) this.x;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str2 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str4 = uri.getQueryParameter("utm_medium");
                    str5 = uri.getQueryParameter("gclid");
                    str6 = uri.getQueryParameter("gbraid");
                    str7 = uri.getQueryParameter("utm_id");
                    str8 = uri.getQueryParameter("dclid");
                    str9 = uri.getQueryParameter("srsltid");
                    str = uri.getQueryParameter("sfmc_id");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                    str9 = null;
                }
                if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str7) || !TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str9) || !TextUtils.isEmpty(str)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(str2)) {
                        gu7Var = gu7Var2;
                        bundle.putString("campaign", str2);
                    } else {
                        gu7Var = gu7Var2;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        bundle.putString("source", str3);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        bundle.putString("medium", str4);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        bundle.putString("gclid", str5);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        bundle.putString("gbraid", str6);
                    }
                    String queryParameter = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("gad_source", queryParameter);
                    }
                    String queryParameter2 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("term", queryParameter2);
                    }
                    String queryParameter3 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, queryParameter3);
                    }
                    String queryParameter4 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("aclid", queryParameter4);
                    }
                    String queryParameter5 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("cp1", queryParameter5);
                    }
                    String queryParameter6 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("anid", queryParameter6);
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        bundle.putString("campaign_id", str7);
                    }
                    if (!TextUtils.isEmpty(str8)) {
                        bundle.putString("dclid", str8);
                    }
                    String queryParameter7 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("source_platform", queryParameter7);
                    }
                    String queryParameter8 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("creative_format", queryParameter8);
                    }
                    String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("marketing_tactic", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(str9)) {
                        bundle.putString("srsltid", str9);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putString("sfmc_id", str);
                    }
                    for (String str10 : uri.getQueryParameterNames()) {
                        if (str10.startsWith("gad_")) {
                            String queryParameter10 = uri.getQueryParameter(str10);
                            if (!TextUtils.isEmpty(queryParameter10)) {
                                bundle.putString(str10, queryParameter10);
                            }
                        }
                    }
                    gu7 gu7Var3 = gu7Var;
                    if (gu7Var3.A.W(null, tq7.a1)) {
                        String uri2 = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        gu7Var3.A.getClass();
                        int max = Math.max(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, 256);
                        if (uri2.length() > max) {
                            uri2 = S(max - 3, uri2, true);
                        }
                        if (!TextUtils.isEmpty(uri2)) {
                            bundle.putString("deep_link_url", uri2);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                es7 es7Var = gu7Var2.C;
                gu7.l(es7Var);
                es7Var.F.b(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean O0(String str, String str2) {
        gu7 gu7Var = (gu7) this.x;
        if (str2 == null) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.E.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.E.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            es7 es7Var3 = gu7Var.C;
            gu7.l(es7Var3);
            es7Var3.E.c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                es7 es7Var4 = gu7Var.C;
                gu7.l(es7Var4);
                es7Var4.E.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean P(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                es7 es7Var = ((gu7) this.x).C;
                gu7.l(es7Var);
                es7Var.H.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean P0(String str, String str2) {
        gu7 gu7Var = (gu7) this.x;
        if (str2 == null) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.E.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.E.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt == 95) {
                codePointAt = 95;
            } else {
                es7 es7Var3 = gu7Var.C;
                gu7.l(es7Var3);
                es7Var3.E.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                es7 es7Var4 = gu7Var.C;
                gu7.l(es7Var4);
                es7Var4.E.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final void Q(String str, String str2, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        String str3;
        int T;
        List list2 = list;
        gu7 gu7Var = (gu7) this.x;
        ak7 ak7Var = gu7Var.A;
        es7 es7Var = gu7Var.C;
        vr7 vr7Var = gu7Var.G;
        i28 i28Var = ((gu7) ak7Var.x).F;
        gu7.j(i28Var);
        if (true != i28Var.v0(231100000)) {
            i = 0;
        } else {
            i = 35;
        }
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i3 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 != null && list2.contains(str4)) {
                i2 = 0;
            } else {
                if (!z) {
                    i2 = V0(str4);
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    i2 = W0(str4);
                }
            }
            if (i2 != 0) {
                if (i2 == 3) {
                    str3 = str4;
                } else {
                    str3 = null;
                }
                Z(bundle, i2, str4, str3);
                bundle.remove(str4);
            } else {
                if (X0(bundle.get(str4))) {
                    gu7.l(es7Var);
                    es7Var.H.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    T = 22;
                } else {
                    T = T(str, str4, bundle.get(str4), bundle, list2, z, false);
                }
                if (T != 0 && !"_ev".equals(str4)) {
                    Z(bundle, T, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (L0(str4) && !m0(str4, oi4.h)) {
                    i3++;
                    if (!v0(231100000)) {
                        gu7.l(es7Var);
                        es7Var.E.c("Item array not supported on client's version of Google Play Services (Android Only)", vr7Var.a(str), vr7Var.e(bundle));
                        j0(23, bundle);
                        bundle.remove(str4);
                    } else if (i3 > i) {
                        if (!z2) {
                            gu7.l(es7Var);
                            bs7 bs7Var = es7Var.E;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            bs7Var.c(sb.toString(), vr7Var.a(str), vr7Var.e(bundle));
                        }
                        j0(28, bundle);
                        bundle.remove(str4);
                        list2 = list;
                        z2 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    public final boolean Q0(String str, String[] strArr, String[] strArr2, String str2) {
        gu7 gu7Var = (gu7) this.x;
        if (str2 == null) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.E.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(F[i])) {
                es7 es7Var2 = gu7Var.C;
                gu7.l(es7Var2);
                es7Var2.E.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr != null && m0(str2, strArr)) {
            if (strArr2 == null || !m0(str2, strArr2)) {
                es7 es7Var3 = gu7Var.C;
                gu7.l(es7Var3);
                es7Var3.E.c("Name is reserved. Type, name", str, str2);
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean R(String str) {
        gu7 gu7Var = (gu7) this.x;
        if (!TextUtils.isEmpty(str)) {
            a34.x(str);
            if (!str.matches("^1:\\d+:android:[a-f0-9]+$")) {
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.E.b(es7.P(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                return false;
            }
            return true;
        }
        es7 es7Var2 = gu7Var.C;
        gu7.l(es7Var2);
        es7Var2.E.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        return false;
    }

    public final boolean R0(int i, String str, String str2) {
        gu7 gu7Var = (gu7) this.x;
        if (str2 == null) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.E.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) > i) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.E.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
        return true;
    }

    public final int S0(String str) {
        String[] strArr;
        if (!P0("event", str)) {
            return 2;
        }
        gu7 gu7Var = (gu7) this.x;
        String[] strArr2 = te4.l;
        if (gu7Var.A.W(null, tq7.f1)) {
            strArr = te4.n;
        } else {
            strArr = te4.m;
        }
        if (!Q0("event", strArr2, strArr, str)) {
            return 13;
        }
        if (!R0(40, "event", str)) {
            return 2;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int T(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i28.T(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final boolean T0(String str) {
        if (((gu7) this.x).A.W(null, tq7.f1)) {
            return m0(str, te4.p);
        }
        return m0(str, te4.o);
    }

    public final Object U(Object obj, String str) {
        gu7 gu7Var = (gu7) this.x;
        boolean equals = "_ev".equals(str);
        int i = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        if (equals) {
            gu7Var.A.getClass();
            return k0(Math.max(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, 256), obj, true, true);
        }
        if (p0(str)) {
            gu7Var.A.getClass();
            i = Math.max(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, 256);
        } else {
            gu7Var.A.getClass();
        }
        return k0(i, obj, false, true);
    }

    public final int U0(String str) {
        if (!P0("user property", str)) {
            return 6;
        }
        if (!Q0("user property", wk6.d, null, str)) {
            return 15;
        }
        ak7 ak7Var = ((gu7) this.x).A;
        if (!R0(24, "user property", str)) {
            return 6;
        }
        return 0;
    }

    public final Bundle V(String str, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        String str2;
        String str3;
        List list2 = list;
        boolean m0 = m0(str, te4.r);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            gu7 gu7Var = (gu7) this.x;
            ak7 ak7Var = gu7Var.A;
            vr7 vr7Var = gu7Var.G;
            i28 i28Var = ((gu7) ak7Var.x).F;
            gu7.j(i28Var);
            if (i28Var.v0(201500000)) {
                i = 100;
            } else {
                i = 25;
            }
            int i3 = i;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i4 = 0;
            boolean z2 = false;
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (list2 != null && list2.contains(str4)) {
                    i2 = 0;
                } else {
                    if (!z) {
                        i2 = V0(str4);
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i2 = W0(str4);
                    }
                }
                if (i2 != 0) {
                    if (i2 == 3) {
                        str3 = str4;
                    } else {
                        str3 = null;
                    }
                    Z(bundle2, i2, str4, str3);
                    bundle2.remove(str4);
                } else {
                    int T = T(str, str4, bundle.get(str4), bundle2, list2, z, m0);
                    if (T == 17) {
                        Z(bundle2, 17, str4, Boolean.FALSE);
                    } else if (T != 0 && !"_ev".equals(str4)) {
                        if (T == 21) {
                            str2 = str;
                        } else {
                            str2 = str4;
                        }
                        Z(bundle2, T, str2, bundle.get(str4));
                        bundle2.remove(str4);
                    }
                    if (L0(str4)) {
                        i4++;
                        if (i4 > i3) {
                            if (!z2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 37);
                                sb.append("Event can't contain more than ");
                                sb.append(i3);
                                sb.append(" params");
                                String sb2 = sb.toString();
                                es7 es7Var = gu7Var.C;
                                gu7.l(es7Var);
                                es7Var.E.c(sb2, vr7Var.a(str), vr7Var.e(bundle));
                            }
                            j0(5, bundle2);
                            bundle2.remove(str4);
                            z2 = true;
                        }
                        list2 = list;
                    }
                }
                list2 = list;
            }
            return bundle2;
        }
        return null;
    }

    public final int V0(String str) {
        if (!O0("event param", str)) {
            return 3;
        }
        if (!Q0("event param", null, null, str)) {
            return 14;
        }
        ak7 ak7Var = ((gu7) this.x).A;
        if (!R0(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final void W(fs7 fs7Var, int i) {
        Bundle bundle = fs7Var.e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (L0(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String sb2 = sb.toString();
                    gu7 gu7Var = (gu7) this.x;
                    es7 es7Var = gu7Var.C;
                    vr7 vr7Var = gu7Var.G;
                    gu7.l(es7Var);
                    es7Var.E.c(sb2, vr7Var.a(fs7Var.a), vr7Var.e(bundle));
                    j0(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final int W0(String str) {
        if (!P0("event param", str)) {
            return 3;
        }
        if (!Q0("event param", null, null, str)) {
            return 14;
        }
        ak7 ak7Var = ((gu7) this.x).A;
        if (!R0(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final void X(Parcelable[] parcelableArr, int i) {
        a34.x(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            boolean z = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (L0(str) && !m0(str, oi4.h) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        gu7 gu7Var = (gu7) this.x;
                        es7 es7Var = gu7Var.C;
                        vr7 vr7Var = gu7Var.G;
                        gu7.l(es7Var);
                        bs7 bs7Var = es7Var.E;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        bs7Var.c(sb.toString(), vr7Var.b(str), vr7Var.e(bundle));
                    }
                    j0(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final void Y(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    i28 i28Var = ((gu7) this.x).F;
                    gu7.j(i28Var);
                    i28Var.c0(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    public final void Z(Bundle bundle, int i, String str, Object obj) {
        if (j0(i, bundle)) {
            ak7 ak7Var = ((gu7) this.x).A;
            bundle.putString("_ev", S(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int a0(Object obj, String str) {
        boolean P;
        if ("_ldl".equals(str)) {
            P = P("user property referrer", str, l0(str), obj);
        } else {
            P = P("user property", str, l0(str), obj);
        }
        if (P) {
            return 0;
        }
        return 7;
    }

    public final Object b0(Object obj, String str) {
        if ("_ldl".equals(str)) {
            return k0(l0(str), obj, true, false);
        }
        return k0(l0(str), obj, false, false);
    }

    public final void c0(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
                return;
            }
            if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
                return;
            }
            if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
                return;
            }
            if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
                return;
            }
            if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                gu7 gu7Var = (gu7) this.x;
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.H.c("Not putting event parameter. Invalid value type. name, type", gu7Var.G.b(str), str2);
            }
        }
    }

    public final ap3 h0() {
        int i;
        int i2;
        int a;
        MeasurementManager measurementManager;
        bp3 bp3Var;
        ap3 ap3Var = this.C;
        if (ap3Var == null) {
            Context context = ((gu7) this.x).x;
            context.getClass();
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i3 = Build.VERSION.SDK_INT;
            f6 f6Var = f6.a;
            int i4 = 0;
            if (i3 >= 33) {
                i = f6Var.a();
            } else {
                i = 0;
            }
            sb.append(i);
            Log.d("MeasurementManager", sb.toString());
            if (i3 >= 33) {
                i2 = f6Var.a();
            } else {
                i2 = 0;
            }
            ap3 ap3Var2 = null;
            if (i2 >= 5) {
                Object systemService = context.getSystemService((Class<Object>) nj2.o());
                systemService.getClass();
                bp3Var = new bp3(nj2.e(systemService));
            } else {
                e6 e6Var = e6.a;
                if (i3 != 31 && i3 != 32) {
                    a = 0;
                } else {
                    a = e6Var.a();
                }
                if (a >= 9) {
                    try {
                        measurementManager = MeasurementManager.get(context);
                        measurementManager.getClass();
                        bp3Var = new bp3(measurementManager);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 == 31 || i5 == 32) {
                            i4 = e6Var.a();
                        }
                        sb2.append(i4);
                        Log.d("MeasurementManager", sb2.toString());
                    }
                }
                bp3Var = null;
            }
            if (bp3Var != null) {
                ap3Var2 = new ap3(bp3Var);
            }
            this.C = ap3Var2;
            return ap3Var2;
        }
        return ap3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i0() {
        /*
            r11 = this;
            r11.L()
            java.lang.Object r0 = r11.x
            gu7 r0 = (defpackage.gu7) r0
            nr7 r1 = r0.p()
            es7 r0 = r0.C
            java.lang.String r1 = r1.R()
            sq7 r2 = defpackage.tq7.q0
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = n0(r2, r1)
            r4 = 0
            if (r1 != 0) goto L23
            return r4
        L23:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r6 = 30
            if (r1 >= r6) goto L2d
            r6 = 4
            goto L58
        L2d:
            int r7 = defpackage.x57.a()
            r8 = 4
            if (r7 >= r8) goto L37
            r6 = 8
            goto L58
        L37:
            if (r1 < r6) goto L45
            int r1 = defpackage.x57.a()
            r6 = 3
            if (r1 <= r6) goto L45
            int r1 = defpackage.y3.x()
            goto L46
        L45:
            r1 = r2
        L46:
            sq7 r6 = defpackage.tq7.k0
            java.lang.Object r6 = r6.a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r1 >= r6) goto L57
            r6 = 16
            goto L58
        L57:
            r6 = r4
        L58:
            java.lang.String r1 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION"
            boolean r1 = r11.o0(r1)
            if (r1 != 0) goto L63
            r8 = 2
            long r6 = r6 | r8
        L63:
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto Lbb
            java.lang.Boolean r1 = r11.D
            if (r1 != 0) goto Lb1
            ap3 r1 = r11.h0()
            if (r1 != 0) goto L72
            goto Lb7
        L72:
            ii3 r1 = r1.b()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L96
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r1 = r1.get(r9, r8)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L8d
            int r3 = r1.intValue()     // Catch: java.lang.Throwable -> L8b
            r8 = 1
            if (r3 != r8) goto L8d
            r2 = r8
            goto L8d
        L8b:
            r2 = move-exception
            goto L94
        L8d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L8b
            r11.D = r2     // Catch: java.lang.Throwable -> L8b
            goto La7
        L94:
            r3 = r1
            goto L98
        L96:
            r1 = move-exception
            r2 = r1
        L98:
            defpackage.gu7.l(r0)
            bs7 r1 = r0.F
            java.lang.String r8 = "Measurement manager api exception"
            r1.b(r2, r8)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r11.D = r1
            r1 = r3
        La7:
            defpackage.gu7.l(r0)
            bs7 r0 = r0.K
            java.lang.String r2 = "Measurement manager api status result"
            r0.b(r1, r2)
        Lb1:
            java.lang.Boolean r11 = r11.D
            boolean r2 = r11.booleanValue()
        Lb7:
            if (r2 != 0) goto Lbb
            r6 = 64
        Lbb:
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 != 0) goto Lc2
            r0 = 1
            return r0
        Lc2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i28.i0():long");
    }

    public final Object k0(int i, Object obj, boolean z, boolean z2) {
        long j;
        if (obj != null) {
            if (!(obj instanceof Long)) {
                if (obj instanceof Double) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    return Long.valueOf(((Integer) obj).intValue());
                }
                if (obj instanceof Byte) {
                    return Long.valueOf(((Byte) obj).byteValue());
                }
                if (obj instanceof Short) {
                    return Long.valueOf(((Short) obj).shortValue());
                }
                if (obj instanceof Boolean) {
                    if (true != ((Boolean) obj).booleanValue()) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                    return Long.valueOf(j);
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    if (z2) {
                        if ((obj instanceof Bundle[]) || (obj instanceof Parcelable[])) {
                            ArrayList arrayList = new ArrayList();
                            for (Parcelable parcelable : (Parcelable[]) obj) {
                                if (parcelable instanceof Bundle) {
                                    Bundle r0 = r0((Bundle) parcelable);
                                    if (!r0.isEmpty()) {
                                        arrayList.add(r0);
                                    }
                                }
                            }
                            return arrayList.toArray(new Bundle[arrayList.size()]);
                        }
                        return null;
                    }
                    return null;
                }
                return S(i, obj.toString(), z);
            }
            return obj;
        }
        return null;
    }

    public final int l0(String str) {
        gu7 gu7Var = (gu7) this.x;
        if ("_ldl".equals(str)) {
            ak7 ak7Var = gu7Var.A;
            return 2048;
        }
        if ("_id".equals(str)) {
            ak7 ak7Var2 = gu7Var.A;
            return 256;
        }
        if ("_lgclid".equals(str)) {
            ak7 ak7Var3 = gu7Var.A;
            return 100;
        }
        ak7 ak7Var4 = gu7Var.A;
        return 36;
    }

    public final boolean o0(String str) {
        L();
        gu7 gu7Var = (gu7) this.x;
        if (f97.a(gu7Var.x).x.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        es7 es7Var = gu7Var.C;
        gu7.l(es7Var);
        es7Var.J.b(str, "Permission not granted");
        return false;
    }

    public final boolean q0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((gu7) this.x).A.P("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle r0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object U = U(bundle.get(str), str);
                if (U == null) {
                    gu7 gu7Var = (gu7) this.x;
                    es7 es7Var = gu7Var.C;
                    gu7.l(es7Var);
                    es7Var.H.b(gu7Var.G.b(str), "Param value can't be null");
                } else {
                    c0(bundle2, str, U);
                }
            }
        }
        return bundle2;
    }

    public final mm7 s0(String str, Bundle bundle, String str2, long j, long j2, boolean z) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (S0(str) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            Bundle V = V(str, bundle2, Collections.singletonList("_o"), true);
            if (z) {
                V = r0(V);
            }
            a34.x(V);
            return new mm7(str, new im7(V), str2, j, j2);
        }
        gu7 gu7Var = (gu7) this.x;
        es7 es7Var = gu7Var.C;
        gu7.l(es7Var);
        es7Var.C.b(gu7Var.G.c(str), "Invalid conditional property event name");
        p65.b();
        return null;
    }

    public final boolean t0(Context context, String str) {
        Signature[] signatureArr;
        gu7 gu7Var = (gu7) this.x;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo c = f97.a(context).c(64, str);
            if (c != null && (signatureArr = c.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.C.b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.C.b(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean v0(int i) {
        Boolean bool = ((gu7) this.x).n().B;
        if (w0() < i / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT) {
            if (bool == null || bool.booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int w0() {
        Integer num = this.E;
        if (num == null) {
            gu7 gu7Var = (gu7) this.x;
            rh2 rh2Var = rh2.b;
            Context context = gu7Var.x;
            rh2Var.getClass();
            int i = xh2.e;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            num = Integer.valueOf(i2 / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
            this.E = num;
        }
        return num.intValue();
    }

    public final void x0(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.F.b(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void y0(String str, bo7 bo7Var) {
        Bundle bundle = new Bundle();
        bundle.putString(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, str);
        try {
            bo7Var.z(bundle);
        } catch (RemoteException e) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.F.b(e, "Error returning string value to wrapper");
        }
    }

    public final void z0(bo7 bo7Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, j);
        try {
            bo7Var.z(bundle);
        } catch (RemoteException e) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.F.b(e, "Error returning long value to wrapper");
        }
    }
}
