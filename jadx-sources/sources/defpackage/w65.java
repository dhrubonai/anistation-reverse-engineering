package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.util.Base64;
import android.util.Xml;
import android.view.Display;
import com.anistation.android.R;
import com.anistation.model.Info;
import com.anistation.model.settings.SubtitleArgbColor;
import com.anistation.model.update.AppUpdateCheck;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class w65 {
    public static final os0 b;
    public static final y95 l;
    public static final z95 m;
    public static final q12 o;
    public static final q12 p;
    public static final q12 q;
    public static final q12[] r;
    public static final os0 a = new os0(1447666463, false, new ps0(7));
    public static final int[] c = new int[0];
    public static final long[] d = new long[0];
    public static final Object[] e = new Object[0];
    public static final int[] f = {1, 10, 100, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] g = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] h = {3, 6};
    public static final int[] i = {1, 2, 4, 5, 7, 8};
    public static final qx2 j = new qx2(4);
    public static final r18 k = new r18(29);
    public static final tg5 n = new tg5(24);

    static {
        byte b2 = 0;
        b = new os0(407374624, false, new ps0(b2));
        l = new y95(b2);
        m = new z95(b2);
        q12 q12Var = new q12("commit_to_configuration_v2_api", -1, 1L, true);
        o = q12Var;
        q12 q12Var2 = new q12("get_serving_version_api", -1, 1L, true);
        q12 q12Var3 = new q12("get_experiment_tokens_api", -1, 1L, true);
        q12 q12Var4 = new q12("register_flag_update_listener_api", -1, 2L, true);
        p = q12Var4;
        q12 q12Var5 = new q12("sync_after_api", -1, 1L, true);
        q12 q12Var6 = new q12("sync_after_for_application_api", -1, 1L, true);
        q12 q12Var7 = new q12("set_app_wide_properties_api", -1, 1L, true);
        q12 q12Var8 = new q12("set_runtime_properties_api", -1, 1L, true);
        q12 q12Var9 = new q12("get_storage_info_api", -1, 1L, true);
        q = q12Var9;
        r = new q12[]{q12Var, q12Var2, q12Var3, q12Var4, q12Var5, q12Var6, q12Var7, q12Var8, q12Var9};
    }

    public static final void A(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static final dc5 B(ComponentCallbacks componentCallbacks) {
        kz kzVar = p7.L;
        if (kzVar != null) {
            return (dc5) ((zp2) kzVar.z).A;
        }
        ze0.m("KoinApplication has not been started");
        return null;
    }

    public static int C(int i2) {
        if (i2 != 20) {
            if (i2 != 30) {
                switch (i2) {
                    case 5:
                        return 80000;
                    case 6:
                        return 768000;
                    case 7:
                        return 192000;
                    case 8:
                        return 2250000;
                    case 9:
                        return 40000;
                    case 10:
                        return 100000;
                    case 11:
                        return 16000;
                    case 12:
                        return 7000;
                    default:
                        switch (i2) {
                            case 14:
                                return 3062500;
                            case 15:
                                return 8000;
                            case 16:
                                return 256000;
                            case 17:
                                return 336000;
                            case 18:
                                return 768000;
                            default:
                                return -2147483647;
                        }
                }
            }
            return 2250000;
        }
        return 63750;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yv6, java.lang.Object] */
    public static final ba5 D(ew6 ew6Var) {
        j21 j21Var;
        ?? obj = new Object();
        if (ew6Var instanceof uj2) {
            j21Var = ((uj2) ew6Var).getDefaultViewModelCreationExtras();
        } else {
            j21Var = i21.b;
        }
        j21Var.getClass();
        cw6 viewModelStore = ew6Var.getViewModelStore();
        viewModelStore.getClass();
        return (ba5) new zp2(viewModelStore, obj, j21Var).w(z05.a(ba5.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void E(ra3 ra3Var) {
        wc7.O(ra3Var).F();
    }

    public static final boolean F(Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            return true;
        }
        return false;
    }

    public static int G(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        qi2.k(zo5.m("PROTOCOL_ERROR padding ", " > remaining length ", i4, i2));
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0222  */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, yf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.xh4 H(int r60, defpackage.kd2 r61, int r62) {
        /*
            Method dump skipped, instructions count: 2088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w65.H(int, kd2, int):xh4");
    }

    public static h92 I(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), rx4.b);
                int i8 = 0;
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(5);
                String string3 = obtainAttributes.getString(6);
                String string4 = obtainAttributes.getString(2);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int i9 = 3;
                int integer = obtainAttributes.getInteger(3, 1);
                int integer2 = obtainAttributes.getInteger(4, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
                String string5 = obtainAttributes.getString(7);
                obtainAttributes.recycle();
                if (string != null && string2 != null) {
                    List P = P(resources, resourceId);
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != i9) {
                        if (xmlResourceParser.getEventType() == i2) {
                            if (xmlResourceParser.getName().equals("fallback")) {
                                TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), rx4.d);
                                try {
                                    String string6 = obtainAttributes2.getString(i8);
                                    String string7 = obtainAttributes2.getString(1);
                                    i7 = integer;
                                    String string8 = obtainAttributes2.getString(i2);
                                    if (string6 != null) {
                                        while (xmlResourceParser.next() != i9) {
                                            S(xmlResourceParser);
                                        }
                                        try {
                                            typedArray = obtainAttributes2;
                                            i6 = i9;
                                            try {
                                                z82 z82Var = new z82(string, string2, string6, P, string7, string8);
                                                typedArray.recycle();
                                                arrayList.add(z82Var);
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            typedArray = obtainAttributes2;
                                        }
                                    } else {
                                        typedArray = obtainAttributes2;
                                        throw new XmlPullParserException("query attribute must be set in fallback element");
                                    }
                                    th = th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    typedArray = obtainAttributes2;
                                }
                                typedArray.recycle();
                                throw th;
                            }
                            i6 = i9;
                            i7 = integer;
                            S(xmlResourceParser);
                            i9 = i6;
                            integer = i7;
                            i2 = 2;
                            i8 = 0;
                        }
                    }
                    int i10 = integer;
                    if (!arrayList.isEmpty()) {
                        return new k92(arrayList, i10, integer2, string5);
                    }
                    if (string3 != null) {
                        arrayList.add(new z82(string, string2, string3, P, null, null));
                        if (string4 != null) {
                            arrayList.add(new z82(string, string2, string4, P, null, null));
                        }
                        return new k92(arrayList, i10, integer2, string5);
                    }
                    ze0.k("The provider font XML requires query attribute or fallback children.");
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), rx4.c);
                            int i11 = 8;
                            if (!obtainAttributes3.hasValue(8)) {
                                i11 = 1;
                            }
                            int i12 = obtainAttributes3.getInt(i11, CommonGatewayClient.CODE_400);
                            if (obtainAttributes3.hasValue(6)) {
                                i3 = 6;
                            } else {
                                i3 = 2;
                            }
                            if (1 == obtainAttributes3.getInt(i3, 0)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int i13 = 9;
                            if (!obtainAttributes3.hasValue(9)) {
                                i13 = 3;
                            }
                            if (obtainAttributes3.hasValue(7)) {
                                i4 = 7;
                            } else {
                                i4 = 4;
                            }
                            String string9 = obtainAttributes3.getString(i4);
                            int i14 = obtainAttributes3.getInt(i13, 0);
                            if (obtainAttributes3.hasValue(5)) {
                                i5 = 5;
                            } else {
                                i5 = 0;
                            }
                            int resourceId2 = obtainAttributes3.getResourceId(i5, 0);
                            obtainAttributes3.getString(i5);
                            obtainAttributes3.recycle();
                            while (xmlResourceParser.next() != 3) {
                                S(xmlResourceParser);
                            }
                            arrayList2.add(new j92(i12, z, string9, i14, resourceId2));
                        } else {
                            S(xmlResourceParser);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return null;
                }
                return new i92((j92[]) arrayList2.toArray(new j92[0]));
            }
            S(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01be, code lost:
    
        if (r5 == r26.length()) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c6, code lost:
    
        if (r26.charAt(r5) != 'S') goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c8, code lost:
    
        r2 = (r14 * 1000000000) + r15;
        r14 = r9;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d6, code lost:
    
        switch(r8.ordinal()) {
            case 0: goto L130;
            case 1: goto L129;
            case 2: goto L128;
            case 3: goto L127;
            case 4: goto L126;
            case 5: goto L125;
            case 6: goto L124;
            default: goto L123;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d9, code lost:
    
        defpackage.v71.g(r8, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0210, code lost:
    
        r14 = r2 * r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e1, code lost:
    
        r21 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020a, code lost:
    
        r2 = defpackage.io3.i0(r2 * r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e7, code lost:
    
        r21 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ed, code lost:
    
        r21 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f3, code lost:
    
        r21 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f9, code lost:
    
        r21 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ff, code lost:
    
        r21 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0205, code lost:
    
        r21 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0104, code lost:
    
        defpackage.ze0.k("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0107, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00f2, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        if (r5 >= r26.length()) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        r3 = r26.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        if ('0' > r3) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r3 >= ':') goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        if (r5 == r26.length()) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
    
        if (r2 == '+') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        if (r2 == '-') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f6, code lost:
    
        if (r5 == (r23 + r2)) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f8, code lost:
    
        r20 = 4611686018427387903L;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c A[LOOP:5: B:75:0x015a->B:76:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0199 A[LOOP:7: B:87:0x0197->B:88:0x0199, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long J(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w65.J(java.lang.String):long");
    }

    public static final rt3 K(String str, String str2, int i2, ub2 ub2Var) {
        char charAt = str.charAt(i2);
        if (((Boolean) ub2Var.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return L(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i2);
    }

    public static final rt3 L(String str, String str2) {
        return new rt3((Object) (str2 + " when parsing an Instant from \"" + X(64, str) + '\"'), (Object) str, (byte) 29);
    }

    public static final int M(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static final long N(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final wp5 O(List list, List list2, List list3) {
        wp5 wp5Var;
        if (list2.size() > 0) {
            ((xp5) list2.get(0)).getClass();
            wp5Var = new wp5(((j74) yo0.r0(list)).b, (j74) yo0.r0(list), yo0.h0(list));
        } else {
            wp5Var = null;
        }
        if (wp5Var == null) {
            wp5Var = new wp5(((j74) yo0.r0(list)).b, (j74) yo0.r0(list), yo0.h0(list));
        }
        if (list3.size() <= 0) {
            return wp5Var;
        }
        list3.get(0).getClass();
        ov3.d();
        return null;
    }

    public static List P(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final ArrayList Q(List list, List list2, kd2 kd2Var, int i2) {
        List list3;
        kd2 kd2Var2;
        ArrayList arrayList;
        Object Q = kd2Var.Q();
        q18 q18Var = au0.a;
        if (Q == q18Var) {
            Q = new LinkedHashSet();
            kd2Var.n0(Q);
        }
        Set set = (Set) Q;
        Object Q2 = kd2Var.Q();
        if (Q2 == q18Var) {
            Q2 = new LinkedHashSet();
            kd2Var.n0(Q2);
        }
        Set set2 = (Set) Q2;
        kd2Var.e0(110758886);
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                List list4 = list2;
                arrayList.add(v((j74) list.get(i3), list4, set, set2, kd2Var, i2 & 112));
                i3++;
                list2 = list4;
            }
            list3 = list2;
            kd2Var2 = kd2Var;
        } else {
            list3 = list2;
            kd2Var2 = kd2Var;
            arrayList = new ArrayList(zo0.V(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(v((j74) it.next(), list3, set, set2, kd2Var2, i2 & 112));
            }
        }
        ArrayList arrayList2 = arrayList;
        kd2Var2.q(false);
        j(arrayList2, list3, set, set2, kd2Var2, i2 & 112);
        return arrayList2;
    }

    public static final long R(long j2) {
        return (Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32);
    }

    public static void S(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i2--;
                }
            } else {
                i2++;
            }
        }
    }

    public static final int T(r34 r34Var) {
        int c2;
        int i2 = r34Var.b;
        int c3 = r34Var.c(0);
        while (r34Var.b != 0 && r34Var.c(0) == c3) {
            r34Var.f(0, r34Var.d());
            r34Var.e(r34Var.b - 1);
            int i3 = r34Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int c4 = r34Var.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int c5 = r34Var.c(i7);
                if (i6 < i3 && (c2 = r34Var.c(i6)) > c5) {
                    if (c2 > c4) {
                        r34Var.f(i5, c2);
                        r34Var.f(i6, c4);
                        i5 = i6;
                    }
                } else if (c5 > c4) {
                    r34Var.f(i5, c5);
                    r34Var.f(i7, c4);
                    i5 = i7;
                }
            }
        }
        return c3;
    }

    public static final int U(long j2) {
        float[] fArr = rp0.a;
        return (int) (ep0.a(j2, rp0.e) >>> 32);
    }

    public static final long V(int i2, jq1 jq1Var) {
        if (jq1Var.compareTo(jq1.SECONDS) <= 0) {
            return y(TimeUnit.NANOSECONDS.convert(i2, jq1Var.x));
        }
        return W(i2, jq1Var);
    }

    public static final long W(long j2, jq1 jq1Var) {
        TimeUnit timeUnit = jq1Var.x;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j2 && j2 <= convert) {
            return y(timeUnit2.convert(j2, timeUnit));
        }
        if (jq1Var.compareTo(jq1.MILLISECONDS) >= 0) {
            long signum = Long.signum(j2);
            if (j2 < -9223372036854775807L) {
                j2 = -9223372036854775807L;
            }
            return x(wk6.l(Math.abs(j2), jq1Var) * signum);
        }
        return x(db.D(TimeUnit.MILLISECONDS.convert(j2, timeUnit), -4611686018427387903L, 4611686018427387903L));
    }

    public static final String X(int i2, String str) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    public static final Object Y(vz0 vz0Var, ub2 ub2Var, v65 v65Var) {
        n11 n11Var = null;
        y31 y31Var = new y31(ub2Var, null);
        rh6 rh6Var = (rh6) vz0Var.getContext().get(rh6.y);
        if (rh6Var != null) {
            n11Var = rh6Var.x;
        }
        if (n11Var != null) {
            return tl7.V(n11Var, y31Var, vz0Var);
        }
        byte b2 = 1;
        qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        try {
            v65Var.getTransactionExecutor().execute(new t35(qg0Var, v65Var, y31Var, b2));
        } catch (RejectedExecutionException e2) {
            qg0Var.a(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        return qg0Var.r();
    }

    public static final void Z(oa0 oa0Var, byte[] bArr, int i2) {
        int i3 = (i2 + 7) >>> 3;
        int length = bArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (bArr[i4] != 0) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        int length2 = i3 - (bArr.length - i4);
        if (length2 > 0) {
            db.u0(oa0Var, new byte[length2], 0, length2);
        }
        db.u0(oa0Var, bArr, i4, bArr.length - i4);
    }

    public static final void a(Info info, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        kd2 kd2Var2;
        kd2Var.f0(343057294);
        byte b2 = 4;
        if (kd2Var.h(info)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i4 & 1, z)) {
            Object extraLarge = info.getCoverImage().getExtraLarge();
            if (extraLarge == null) {
                extraLarge = info.getCoverImage().getLarge();
            }
            Context context = (Context) kd2Var.j(eb.b);
            boolean f2 = kd2Var.f(extraLarge) | kd2Var.f(context);
            Object Q = kd2Var.Q();
            if (f2 || Q == au0.a) {
                bv2 bv2Var = new bv2(context);
                bv2Var.c = extraLarge;
                hv2.a(bv2Var, true);
                Q = bv2Var.a();
                kd2Var.n0(Q);
            }
            ev2 ev2Var = (ev2) Q;
            yz3 h2 = bx7.h(n03.k(ar5.i(vz3.x, 82.0f), tm5.b), ((mp0) kd2Var.j(op0.a)).p, io3.h);
            vo3 c2 = b90.c(pk2.C, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E = o80.E(kd2Var, h2);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c2);
            ss5.i(p7.E, kd2Var, l2);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            kd2Var2 = kd2Var;
            tl7.a(ev2Var, e02.b(info.getTitle()), ar5.c, pk2.O, kd2Var2, 1573248);
            kd2Var2.q(true);
        } else {
            kd2Var2 = kd2Var;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new o0(info, i2, b2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cv5, java.lang.Object, oa0] */
    public static final void a0(oa0 oa0Var, ECPoint eCPoint, int i2) {
        ?? obj = new Object();
        obj.l0((byte) 4);
        byte[] byteArray = eCPoint.getAffineX().toByteArray();
        byteArray.getClass();
        Z(obj, byteArray, i2);
        byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
        byteArray2.getClass();
        Z(obj, byteArray2, i2);
        oa0Var.l0((byte) obj.z);
        db.w0(oa0Var, obj);
    }

    public static final void b(kr krVar, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        kr krVar2;
        kd2 kd2Var2;
        boolean z2;
        kr krVar3;
        boolean z3;
        boolean z4;
        boolean z5;
        Object Q;
        Object Q2;
        boolean z6;
        boolean z7;
        boolean z8;
        AppUpdateCheck appUpdateCheck;
        int i4;
        v11 v11Var;
        boolean z9;
        kr krVar4 = krVar;
        kd2 kd2Var3 = kd2Var;
        kd2Var3.f0(1037570247);
        byte b2 = 2;
        if (kd2Var3.h(krVar4)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if ((i5 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var3.V(i5 & 1, z)) {
            w44 m2 = h98.m(krVar4.d, kd2Var3);
            og3 og3Var = (og3) kd2Var3.j(vj3.a);
            do5 f2 = rz3.f(true, kd2Var3, 6, 2);
            Object Q3 = kd2Var3.Q();
            q18 q18Var = au0.a;
            if (Q3 == q18Var) {
                Q3 = db.L(kd2Var3);
                kd2Var3.n0(Q3);
            }
            v11 v11Var2 = (v11) Q3;
            int i6 = i5 & 14;
            if (i6 != 4 && !kd2Var3.h(krVar4)) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean h2 = z2 | kd2Var3.h(og3Var);
            Object Q4 = kd2Var3.Q();
            if (h2 || Q4 == q18Var) {
                Q4 = new b0(og3Var, krVar4, (byte) 11);
                kd2Var3.n0(Q4);
            }
            db.c(og3Var, (ub2) Q4, kd2Var3);
            fr frVar = (fr) m2.getValue();
            if (a34.i(frVar, dr.a)) {
                kd2Var3.e0(672620107);
                kd2Var3.q(false);
            } else if (frVar instanceof zq) {
                kd2Var3.e0(-623554354);
                AppUpdateCheck appUpdateCheck2 = ((zq) frVar).a;
                if (i6 != 4 && !kd2Var3.h(krVar4)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                Object Q5 = kd2Var3.Q();
                if (!z8 && Q5 != q18Var) {
                    i4 = i6;
                    appUpdateCheck = appUpdateCheck2;
                    krVar2 = krVar4;
                    v11Var = v11Var2;
                } else {
                    appUpdateCheck = appUpdateCheck2;
                    i4 = i6;
                    v11Var = v11Var2;
                    ia iaVar = new ia(0, krVar4, kr.class, "downloadAndInstall", "downloadAndInstall()V", 0, (byte) 3);
                    krVar2 = krVar4;
                    kd2Var3.n0(iaVar);
                    Q5 = iaVar;
                }
                sb2 sb2Var = (sb2) ((i73) Q5);
                boolean h3 = kd2Var3.h(v11Var) | kd2Var3.f(f2);
                if (i4 != 4 && !kd2Var3.h(krVar2)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                boolean z10 = h3 | z9;
                Object Q6 = kd2Var3.Q();
                if (z10 || Q6 == q18Var) {
                    Q6 = new mi(v11Var, f2, krVar2, b2);
                    kd2Var3.n0(Q6);
                }
                kd2Var2 = kd2Var3;
                nx7.n(f2, appUpdateCheck, sb2Var, (sb2) Q6, kd2Var2, 0);
                kd2Var3.q(false);
            } else {
                if (frVar instanceof br) {
                    kd2Var3.e0(-623123392);
                    int i7 = ((br) frVar).b;
                    if (i6 != 4 && !kd2Var3.h(krVar4)) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    Object Q7 = kd2Var3.Q();
                    if (!z7 && Q7 != q18Var) {
                        krVar3 = krVar4;
                    } else {
                        Q7 = new ia(0, krVar, kr.class, "cancelDownload", "cancelDownload()V", 0, (byte) 4);
                        krVar3 = krVar;
                        kd2Var3.n0(Q7);
                    }
                    kd2Var2 = kd2Var3;
                    nx7.h(i7, 0, 6, (sb2) ((i73) Q7), kd2Var2, null, null);
                    kd2Var2.q(false);
                } else {
                    krVar3 = krVar4;
                    kd2Var2 = kd2Var3;
                    if (frVar instanceof er) {
                        kd2Var2.e0(-622924868);
                        String f3 = lz5.f(R.string.opening_installer, kd2Var2);
                        Object Q8 = kd2Var2.Q();
                        if (Q8 == q18Var) {
                            Q8 = new t((byte) 29);
                            kd2Var2.n0(Q8);
                        }
                        nx7.h(100, 3078, 2, (sb2) Q8, kd2Var2, null, f3);
                        kd2Var2.q(false);
                    } else {
                        kd2Var3 = kd2Var2;
                        if (frVar instanceof ar) {
                            kd2Var3.e0(-622678728);
                            if (i6 != 4 && !kd2Var3.h(krVar3)) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            Object Q9 = kd2Var3.Q();
                            if (!z6 && Q9 != q18Var) {
                                krVar4 = krVar3;
                            } else {
                                krVar4 = krVar;
                                Q9 = new ia(0, krVar4, kr.class, "openInstallPermissionSettings", "openInstallPermissionSettings()V", 0, (byte) 5);
                                kd2Var3.n0(Q9);
                            }
                            nx7.m((sb2) ((i73) Q9), kd2Var3, 0);
                            kd2Var3.q(false);
                        } else if (frVar instanceof cr) {
                            kd2Var3.e0(-622505934);
                            cr crVar = (cr) frVar;
                            String str = crVar.a;
                            AppUpdateCheck appUpdateCheck3 = crVar.b;
                            if (appUpdateCheck3 != null) {
                                z3 = true;
                                if (appUpdateCheck3.getForceUpdate()) {
                                    z4 = true;
                                    if (i6 == 4 && !kd2Var3.h(krVar3)) {
                                        z5 = false;
                                    } else {
                                        z5 = z3;
                                    }
                                    Q = kd2Var3.Q();
                                    if (!z5 || Q == q18Var) {
                                        ia iaVar2 = new ia(0, krVar3, kr.class, "downloadAndInstall", "downloadAndInstall()V", 0, (byte) 6);
                                        kd2Var3.n0(iaVar2);
                                        Q = iaVar2;
                                    }
                                    sb2 sb2Var2 = (sb2) ((i73) Q);
                                    if (i6 != 4 && !kd2Var3.h(krVar3)) {
                                        z3 = false;
                                    }
                                    Q2 = kd2Var3.Q();
                                    if (z3 && Q2 != q18Var) {
                                        krVar2 = krVar3;
                                    } else {
                                        Q2 = new ia(0, krVar3, kr.class, "dismissError", "dismissError()V", 0, (byte) 7);
                                        krVar2 = krVar3;
                                        kd2Var3.n0(Q2);
                                    }
                                    kd2Var2 = kd2Var3;
                                    nx7.j(str, z4, sb2Var2, (sb2) ((i73) Q2), kd2Var2, 0);
                                    kd2Var2.q(false);
                                }
                            } else {
                                z3 = true;
                            }
                            z4 = false;
                            if (i6 == 4) {
                            }
                            z5 = z3;
                            Q = kd2Var3.Q();
                            if (!z5) {
                            }
                            ia iaVar22 = new ia(0, krVar3, kr.class, "downloadAndInstall", "downloadAndInstall()V", 0, (byte) 6);
                            kd2Var3.n0(iaVar22);
                            Q = iaVar22;
                            sb2 sb2Var22 = (sb2) ((i73) Q);
                            if (i6 != 4) {
                                z3 = false;
                            }
                            Q2 = kd2Var3.Q();
                            if (z3) {
                            }
                            Q2 = new ia(0, krVar3, kr.class, "dismissError", "dismissError()V", 0, (byte) 7);
                            krVar2 = krVar3;
                            kd2Var3.n0(Q2);
                            kd2Var2 = kd2Var3;
                            nx7.j(str, z4, sb2Var22, (sb2) ((i73) Q2), kd2Var2, 0);
                            kd2Var2.q(false);
                        } else {
                            kd2Var3.e0(672619560);
                            kd2Var3.q(false);
                            ze0.l();
                            return;
                        }
                    }
                }
                krVar2 = krVar3;
            }
            krVar2 = krVar4;
            kd2Var2 = kd2Var3;
        } else {
            krVar2 = krVar4;
            kd2Var2 = kd2Var3;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new o0(krVar2, i2, (byte) 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e0, code lost:
    
        if (r11 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        if (r11 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        if (defpackage.h41.l0(r1, r11, r0) != r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (defpackage.h41.l0(r9, r11, r0) == r5) goto L40;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0022. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(defpackage.ae0 r9, defpackage.p56 r10, defpackage.xz0 r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w65.b0(ae0, p56, xz0):java.lang.Object");
    }

    public static final void c(yz3 yz3Var, ub2 ub2Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        boolean z;
        kd2Var.f0(-932836462);
        if (kd2Var.f(yz3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (kd2Var.h(ub2Var)) {
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
            ov5.a(kd2Var, nx7.w(yz3Var, ub2Var));
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new q((byte) 12, i2, yz3Var, ub2Var);
        }
    }

    public static final void c0(oa0 oa0Var, o56 o56Var, int i2) {
        o56Var.getClass();
        if (i2 <= 16777215) {
            int i3 = (o56Var.x << 24) | i2;
            yf5 T = oa0Var.T(4);
            byte[] bArr = T.a;
            int i4 = T.c;
            bArr[i4] = (byte) ((i3 >>> 24) & 255);
            bArr[i4 + 1] = (byte) ((i3 >>> 16) & 255);
            bArr[i4 + 2] = (byte) ((i3 >>> 8) & 255);
            bArr[i4 + 3] = (byte) (i3 & 255);
            T.c = i4 + 4;
            oa0Var.z += 4;
            return;
        }
        throw new SSLException(qx1.h(i2, "TLS handshake size limit exceeded: "), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long d(float r21, float r22, float r23, float r24, defpackage.pp0 r25) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w65.d(float, float, float, float, pp0):long");
    }

    public static final long e(int i2) {
        long j2 = i2 << 32;
        int i3 = ep0.j;
        return j2;
    }

    public static final long f(long j2) {
        long j3 = j2 << 32;
        int i2 = ep0.j;
        return j3;
    }

    public static long g(int i2, int i3, int i4) {
        return e(((i2 & 255) << 16) | SubtitleArgbColor.BLACK | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final void h(yz3 yz3Var, final List list, final ub2 ub2Var, final ub2 ub2Var2, final sb2 sb2Var, kd2 kd2Var, final int i2, final int i3) {
        yz3 yz3Var2;
        int i4;
        int i5;
        int i6;
        boolean z;
        final yz3 yz3Var3;
        boolean z2;
        boolean z3;
        w44 w44Var;
        Object xgVar;
        yz3 yz3Var4;
        q18 q18Var;
        vz3 vz3Var;
        w44 w44Var2;
        vz3 vz3Var2;
        w44 w44Var3;
        w44 w44Var4;
        q18 q18Var2;
        boolean z4;
        w44 w44Var5;
        int i7;
        int i8;
        int i9;
        kd2 kd2Var2 = kd2Var;
        ub2Var.getClass();
        ub2Var2.getClass();
        sb2Var.getClass();
        kd2Var2.f0(347994980);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i5 = i2 | 6;
            yz3Var2 = yz3Var;
        } else {
            yz3Var2 = yz3Var;
            if (kd2Var2.f(yz3Var2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i5 = i4 | i2;
        }
        if (kd2Var2.f(list)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i11 = i5 | i6;
        if ((i2 & 384) == 0) {
            if (kd2Var2.h(ub2Var)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i11 |= i9;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var2.h(ub2Var2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i11 |= i8;
        }
        if ((i2 & 24576) == 0) {
            if (kd2Var2.h(sb2Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i11 |= i7;
        }
        int i12 = i11;
        byte b2 = 0;
        if ((i12 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i12 & 1, z)) {
            vz3 vz3Var3 = vz3.x;
            if (i10 != 0) {
                yz3Var2 = vz3Var3;
            }
            Object Q = kd2Var2.Q();
            q18 q18Var3 = au0.a;
            if (Q == q18Var3) {
                Q = xt5.g(Boolean.FALSE);
                kd2Var2.n0(Q);
            }
            w44 w44Var6 = (w44) Q;
            Object Q2 = kd2Var2.Q();
            if (Q2 == q18Var3) {
                Q2 = xt5.g(tt1.x);
                kd2Var2.n0(Q2);
            }
            w44 w44Var7 = (w44) Q2;
            boolean booleanValue = ((Boolean) w44Var6.getValue()).booleanValue();
            if ((i12 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q3 = kd2Var2.Q();
            if (z2 || Q3 == q18Var3) {
                Q3 = new b01(sb2Var, w44Var6, w44Var7, b2);
                kd2Var2.n0(Q3);
            }
            z51.a(booleanValue, (sb2) Q3, kd2Var2, 0, 0);
            if ((i12 & 112) != 32) {
                z3 = false;
            } else {
                z3 = true;
            }
            Object Q4 = kd2Var2.Q();
            if (z3 || Q4 == q18Var3) {
                yz3 yz3Var5 = yz3Var2;
                w44Var = w44Var6;
                yz3Var4 = yz3Var5;
                q18Var = q18Var3;
                vz3Var = vz3Var3;
                w44Var2 = w44Var7;
                xgVar = new xg(list, w44Var, w44Var2, null, (byte) 3);
                kd2Var2.n0(xgVar);
            } else {
                yz3 yz3Var6 = yz3Var2;
                w44Var = w44Var6;
                xgVar = Q4;
                yz3Var4 = yz3Var6;
                vz3Var = vz3Var3;
                w44Var2 = w44Var7;
                q18Var = q18Var3;
            }
            db.f((ic2) xgVar, kd2Var2, list);
            yz3 V = n77.V(ar5.c(yz3Var4, 1.0f), 0.0f, 8.0f, 0.0f, 20.0f, 5);
            xp0 a2 = vp0.a(x97.z, pk2.K, kd2Var2, 0);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, V);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z5 = kd2Var2.S;
            yz3 yz3Var7 = yz3Var4;
            t53 t53Var = za3.p0;
            if (z5) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a2);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            yz3 V2 = n77.V(ar5.c(vz3Var, 1.0f), 12.0f, 0.0f, 12.0f, 12.0f, 2);
            x50 x50Var = pk2.I;
            q18 q18Var4 = q18Var;
            z75 a3 = y75.a(x97.B, x50Var, kd2Var2, 54);
            w44 w44Var8 = w44Var;
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l3 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, V2);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a3);
            ss5.i(ys0Var, kd2Var2, l3);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            z75 a4 = y75.a(new vr(8.0f, true, new ze0((byte) 6)), x50Var, kd2Var2, 54);
            int hashCode3 = Long.hashCode(kd2Var2.T);
            al4 l4 = kd2Var2.l();
            yz3 E3 = o80.E(kd2Var2, vz3Var);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a4);
            ss5.i(ys0Var, kd2Var2, l4);
            h11.q(hashCode3, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E3);
            xh4 H = H(R.drawable.play_filled, kd2Var2, 0);
            tq1 tq1Var = op0.a;
            w44 w44Var9 = w44Var2;
            vz3 vz3Var4 = vz3Var;
            yt2.a(H, null, ar5.i(vz3Var, 28.0f), ((mp0) kd2Var2.j(tq1Var)).o, kd2Var2, 440, 0);
            yc6.b(lz5.f(R.string.watch_history, kd2Var2), null, ((mp0) kd2Var2.j(tq1Var)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var2.j(pl6.a)).e, hz5.g(19), null, null, 0L, null, 0L, null, 16777213), kd2Var, 0, 0, 131066);
            kd2 kd2Var3 = kd2Var;
            kd2Var3.q(true);
            z75 a5 = y75.a(new vr(15.0f, true, new ze0((byte) 6)), pk2.H, kd2Var3, 6);
            int hashCode4 = Long.hashCode(kd2Var3.T);
            al4 l5 = kd2Var3.l();
            yz3 E4 = o80.E(kd2Var3, vz3Var4);
            kd2Var3.h0();
            if (kd2Var3.S) {
                kd2Var3.k(t53Var);
            } else {
                kd2Var3.q0();
            }
            ss5.i(st0Var, kd2Var3, a5);
            ss5.i(ys0Var, kd2Var3, l5);
            h11.q(hashCode4, kd2Var3, st0Var2, kd2Var3);
            ss5.i(ys0Var2, kd2Var3, E4);
            if (((Boolean) w44Var8.getValue()).booleanValue() && !((Set) w44Var9.getValue()).isEmpty()) {
                kd2Var3.e0(1607535369);
                long j2 = ((mp0) kd2Var3.j(tq1Var)).a;
                long j3 = ep0.e;
                vh4 vh4Var = new vh4(4.0f, 4.0f, 4.0f, 4.0f);
                if ((i12 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object Q5 = kd2Var3.Q();
                q18Var2 = q18Var4;
                if (!z4 && Q5 != q18Var2) {
                    w44Var3 = w44Var8;
                    w44Var5 = w44Var9;
                } else {
                    w44Var3 = w44Var8;
                    w44Var5 = w44Var9;
                    Q5 = new c01(ub2Var2, w44Var5, w44Var3, (byte) 0);
                    kd2Var3.n0(Q5);
                }
                w44Var4 = w44Var5;
                vz3Var2 = vz3Var4;
                zz.a(null, false, true, null, null, j2, j3, (sb2) Q5, vh4Var, x97.C, kd2Var, 907545984, 19);
                kd2Var3 = kd2Var;
                kd2Var3.q(false);
            } else {
                vz3Var2 = vz3Var4;
                w44Var3 = w44Var8;
                w44Var4 = w44Var9;
                q18Var2 = q18Var4;
                kd2Var3.e0(1608362387);
                kd2Var3.q(false);
            }
            vh4 vh4Var2 = new vh4(4.0f, 4.0f, 4.0f, 4.0f);
            Object Q6 = kd2Var3.Q();
            if (Q6 == q18Var2) {
                Q6 = new n(w44Var3, w44Var4, (byte) 29);
                kd2Var3.n0(Q6);
            }
            zz.a(null, false, true, null, null, 0L, 0L, (sb2) Q6, vh4Var2, nx7.R(535478838, new ub(w44Var3, (byte) 2), kd2Var3), kd2Var, 918556032, 115);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
            kd2Var2.q(true);
            x97.b(ar5.c(vz3Var2, 1.0f), null, nx7.R(-1834259688, new sd3(list, ub2Var, w44Var4, w44Var3), kd2Var2), kd2Var2, 3078, 6);
            kd2Var2.q(true);
            yz3Var3 = yz3Var7;
        } else {
            kd2Var2.Y();
            yz3Var3 = yz3Var2;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ic2() { // from class: d01
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w65.h(yz3.this, list, ub2Var, ub2Var2, sb2Var, (kd2) obj, kb0.N(i2 | 1), i3 ? 1 : 0);
                    return pn6.a;
                }
            };
        }
    }

    public static final void i(kb5 kb5Var, w74 w74Var, sb2 sb2Var, sb2 sb2Var2, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        sb2 sb2Var3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        kd2Var.f0(-1784101165);
        if ((i2 & 6) == 0) {
            if (kd2Var.f(kb5Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.f(w74Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i3 | 384;
        if ((i2 & 3072) == 0) {
            if (kd2Var.h(sb2Var2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i7 |= i4;
        }
        boolean z3 = false;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i7 & 1, z)) {
            kd2Var.a0();
            int i8 = i2 & 1;
            q18 q18Var = au0.a;
            if (i8 != 0 && !kd2Var.C()) {
                kd2Var.Y();
                sb2Var3 = sb2Var;
            } else {
                Object Q = kd2Var.Q();
                if (Q == q18Var) {
                    Q = new t53((byte) 25);
                    kd2Var.n0(Q);
                }
                sb2Var3 = (sb2) Q;
            }
            kd2Var.r();
            boolean z4 = !kb5Var.c.c.isEmpty();
            if ((i7 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i7 & 7168) == 2048) {
                z3 = true;
            }
            boolean z5 = z2 | z3;
            Object Q2 = kd2Var.Q();
            if (z5 || Q2 == q18Var) {
                Q2 = new va1(kb5Var, sb2Var2, (byte) 20);
                kd2Var.n0(Q2);
            }
            oi4.d(w74Var, z4, sb2Var3, (sb2) Q2, kd2Var, (i7 & 896) | ((i7 >> 3) & 14));
        } else {
            kd2Var.Y();
            sb2Var3 = sb2Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new c50(kb5Var, w74Var, sb2Var3, sb2Var2, i2, (byte) 5);
        }
    }

    public static final void j(ArrayList arrayList, List list, Set set, Set set2, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        kd2Var.f0(-720826424);
        if ((i2 & 6) == 0) {
            if (kd2Var.h(arrayList)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.h(list)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.h(set)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var.h(set2)) {
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
            w44 h2 = xt5.h(arrayList, kd2Var);
            w44 h3 = xt5.h(list, kd2Var);
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = ((j74) arrayList.get(i8)).b;
                set.add(obj);
                List I0 = yo0.I0(arrayList);
                boolean f2 = kd2Var.f(h2) | kd2Var.h(obj) | kd2Var.h(set) | kd2Var.h(set2) | kd2Var.f(h3);
                Object Q = kd2Var.Q();
                if (f2 || Q == au0.a) {
                    Object g5Var = new g5(obj, set, set2, h2, h3);
                    kd2Var.n0(g5Var);
                    Q = g5Var;
                }
                db.d(obj, I0, (ub2) Q, kd2Var);
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new c50(arrayList, list, set, set2, i2, (byte) 3);
        }
    }

    public static final void k(String str, List list, yz3 yz3Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        boolean z;
        yz3 yz3Var2;
        o75 o75Var;
        kd2 kd2Var2 = kd2Var;
        str.getClass();
        kd2Var2.f0(-1311174178);
        if (kd2Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (kd2Var2.f(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4 | 384;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i6 & 1, z)) {
            vz3 vz3Var = vz3.x;
            yz3 c2 = ar5.c(vz3Var, 1.0f);
            xp0 a2 = vp0.a(x97.A, pk2.L, kd2Var2, 54);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, c2);
            tt0.d.getClass();
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(za3.p0);
            } else {
                kd2Var2.q0();
            }
            ss5.i(p7.F, kd2Var2, a2);
            ss5.i(p7.E, kd2Var2, l2);
            ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
            ss5.h(kd2Var2);
            ss5.i(p7.D, kd2Var2, E);
            xd6 xd6Var = ((nl6) kd2Var2.j(pl6.a)).i;
            yc6.b(str, ar5.c(vz3Var, 1.0f), ((mp0) kd2Var2.j(op0.a)).o, 0L, s92.B, null, 0L, new c86(5), 0L, 0, false, 0, 0, xd6Var, kd2Var, (i6 & 14) | 1572912, 0, 129976);
            kd2Var2 = kd2Var;
            ov5.a(kd2Var2, ar5.e(vz3Var, 10.0f));
            kd2Var2.e0(1345410541);
            int i7 = 0;
            for (Object obj : list) {
                int i8 = i7 + 1;
                if (i7 >= 0) {
                    gl5 gl5Var = (gl5) obj;
                    if (list.size() > 1) {
                        if (i7 == 0) {
                            o75 o75Var2 = p75.a;
                            o75Var = new o75(new wm1(20.0f), new wm1(20.0f), new wm1(0.0f), new wm1(0.0f));
                        } else if (i7 == list.size() - 1) {
                            o75 o75Var3 = p75.a;
                            o75Var = new o75(new wm1(0.0f), new wm1(0.0f), new wm1(20.0f), new wm1(20.0f));
                        } else {
                            o75Var = p75.a(0.0f);
                        }
                    } else {
                        o75Var = tm5.b;
                    }
                    o75 o75Var4 = o75Var;
                    boolean z2 = gl5Var.e;
                    boolean z3 = gl5Var.f;
                    boolean f2 = kd2Var2.f(gl5Var);
                    Object Q = kd2Var2.Q();
                    if (f2 || Q == au0.a) {
                        Q = new nj4(gl5Var, (byte) 21);
                        kd2Var2.n0(Q);
                    }
                    l(gl5Var, null, o75Var4, z2, z3, (sb2) Q, kd2Var2, 0, 2);
                    i7 = i8;
                } else {
                    te4.R();
                    throw null;
                }
            }
            kd2Var2.q(false);
            kd2Var2.q(true);
            yz3Var2 = vz3Var;
        } else {
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new df((Object) str, (Object) list, yz3Var2, i2, (byte) 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final defpackage.gl5 r22, defpackage.yz3 r23, defpackage.om5 r24, boolean r25, boolean r26, final defpackage.sb2 r27, defpackage.kd2 r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w65.l(gl5, yz3, om5, boolean, boolean, sb2, kd2, int, int):void");
    }

    public static final void m(r34 r34Var, int i2) {
        if (r34Var.b != 0 && (r34Var.c(0) == i2 || r34Var.c(r34Var.b - 1) == i2)) {
            return;
        }
        int i3 = r34Var.b;
        r34Var.a(i2);
        while (i3 > 0) {
            int i4 = ((i3 + 1) >>> 1) - 1;
            int c2 = r34Var.c(i4);
            if (i2 <= c2) {
                break;
            }
            r34Var.f(i3, c2);
            i3 = i4;
        }
        r34Var.f(i3, i2);
    }

    public static final long n(long j2, long j3) {
        if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
            if (j3 != 4611686018427387903L && j3 != -4611686018427387903L) {
                return db.D(j2 + j3, -4611686018427387903L, 4611686018427387903L);
            }
            return j3;
        }
        if (-4611686018427387903L < j3 && j3 < 4611686018427387903L) {
            return j2;
        }
        if ((j3 ^ j2) >= 0) {
            return j2;
        }
        return 9223372036854759646L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(defpackage.fg3 r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.yg3
            if (r0 == 0) goto L13
            r0 = r6
            yg3 r0 = (defpackage.yg3) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            yg3 r0 = new yg3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.z
            int r1 = r0.A
            pn6 r2 = defpackage.pn6.a
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            w05 r5 = r0.y
            fg3 r0 = r0.x
            defpackage.m37.N(r6)     // Catch: java.lang.Throwable -> L2b
            goto L71
        L2b:
            r6 = move-exception
            goto L80
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L34:
            defpackage.m37.N(r6)
            r6 = r5
            rg3 r6 = (defpackage.rg3) r6
            eg3 r6 = r6.i
            eg3 r1 = defpackage.eg3.A
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L45
            return r2
        L45:
            w05 r6 = new w05
            r6.<init>()
            r0.x = r5     // Catch: java.lang.Throwable -> L7b
            r0.y = r6     // Catch: java.lang.Throwable -> L7b
            r0.A = r3     // Catch: java.lang.Throwable -> L7b
            qg0 r1 = new qg0     // Catch: java.lang.Throwable -> L7b
            vz0 r0 = defpackage.wc7.z(r0)     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7b
            r1.t()     // Catch: java.lang.Throwable -> L7b
            zg3 r0 = new zg3     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7b
            r6.x = r0     // Catch: java.lang.Throwable -> L7b
            r5.a(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r1.r()     // Catch: java.lang.Throwable -> L7b
            w11 r1 = defpackage.w11.x
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r5
            r5 = r6
        L71:
            java.lang.Object r5 = r5.x
            ng3 r5 = (defpackage.ng3) r5
            if (r5 == 0) goto L7a
            r0.b(r5)
        L7a:
            return r2
        L7b:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L80:
            java.lang.Object r5 = r5.x
            ng3 r5 = (defpackage.ng3) r5
            if (r5 == 0) goto L89
            r0.b(r5)
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w65.o(fg3, xz0):java.lang.Object");
    }

    public static final int p(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 > i3) {
                i4 = i6 - 1;
            } else {
                return i6;
            }
        }
        return ~i5;
    }

    public static final int q(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else if (j3 > j2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    public static void r(String str, boolean z) {
        if (z) {
        } else {
            throw bj4.a(str, null);
        }
    }

    public static final Object s(vz0 vz0Var, ub2 ub2Var, v65 v65Var) {
        if (v65Var.inCompatibilityMode() && v65Var.isOpenInternal$room_runtime() && v65Var.inTransaction()) {
            return ub2Var.invoke(vz0Var);
        }
        if (vz0Var.getContext().get(ug0.z) == null) {
            return ub2Var.invoke(vz0Var);
        }
        return Y(vz0Var, ub2Var, v65Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long t(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w65.t(long, long):long");
    }

    public static final v95 u(o34 o34Var) {
        aa5 aa5Var;
        LinkedHashMap linkedHashMap = o34Var.a;
        ga5 ga5Var = (ga5) linkedHashMap.get(k);
        Bundle bundle = null;
        if (ga5Var != null) {
            ew6 ew6Var = (ew6) linkedHashMap.get(l);
            if (ew6Var != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(m);
                String str = (String) linkedHashMap.get(o80.h);
                if (str != null) {
                    da5 b2 = ga5Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if (b2 instanceof aa5) {
                        aa5Var = (aa5) b2;
                    } else {
                        aa5Var = null;
                    }
                    if (aa5Var != null) {
                        LinkedHashMap linkedHashMap2 = D(ew6Var).b;
                        v95 v95Var = (v95) linkedHashMap2.get(str);
                        if (v95Var == null) {
                            aa5Var.b();
                            Bundle bundle3 = aa5Var.c;
                            if (bundle3 != null && bundle3.containsKey(str)) {
                                Bundle bundle4 = bundle3.getBundle(str);
                                if (bundle4 == null) {
                                    bundle4 = h98.g((ai4[]) Arrays.copyOf(new ai4[0], 0));
                                }
                                bundle3.remove(str);
                                if (bundle3.isEmpty()) {
                                    aa5Var.c = null;
                                }
                                bundle = bundle4;
                            }
                            v95 G = io3.G(bundle, bundle2);
                            linkedHashMap2.put(str, G);
                            return G;
                        }
                        return v95Var;
                    }
                    ze0.m("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    return null;
                }
                ze0.k("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                return null;
            }
            ze0.k("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        ze0.k("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        return null;
    }

    public static final j74 v(j74 j74Var, List list, Set set, Set set2, kd2 kd2Var, int i2) {
        kd2Var.e0(-1239021605);
        w44 h2 = xt5.h(list, kd2Var);
        Object obj = j74Var.b;
        kd2Var.c0(-993800456, obj);
        j74 j74Var2 = new j74(j74Var, nx7.R(-1349345695, new oi(set2, obj, set, h2, list, j74Var), kd2Var));
        kd2Var.q(false);
        kd2Var.q(false);
        return j74Var2;
    }

    public static boolean w(Context context) {
        Display display;
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i2 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static final long x(long j2) {
        long j3 = (j2 << 1) + 1;
        fq1.y.getClass();
        int i2 = hq1.a;
        return j3;
    }

    public static final long y(long j2) {
        m18 m18Var = fq1.y;
        long j3 = j2 << 1;
        int i2 = hq1.a;
        return j3;
    }

    public static final void z(ga5 ga5Var) {
        eg3 eg3Var = ((rg3) ga5Var.getLifecycle()).i;
        if (eg3Var != eg3.y && eg3Var != eg3.z) {
            ov3.n("Failed to enable `SavedStateHandle` for `", ga5Var, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", eg3Var, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (ga5Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            aa5 aa5Var = new aa5(ga5Var.getSavedStateRegistry(), (ew6) ga5Var);
            ga5Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", aa5Var);
            ga5Var.getLifecycle().a(new m05(aa5Var, (byte) 3));
        }
    }
}
