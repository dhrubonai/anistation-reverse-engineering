package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c28 extends j18 {
    public long A;
    public long B;

    public static mm7 P(mc7 mc7Var) {
        String str;
        Object obj;
        Bundle Q = Q(mc7Var.c, true);
        if (Q.containsKey("_o") && (obj = Q.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String s = ct5.s(mc7Var.a, te4.l, te4.q);
        if (s == null) {
            s = mc7Var.a;
        }
        return new mm7(s, new im7(Q), str2, mc7Var.b, 0L);
    }

    public static Bundle Q(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(Q((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    public static final void T(lt7 lt7Var, String str, Long l) {
        List h = lt7Var.h();
        int i = 0;
        while (true) {
            if (i < h.size()) {
                if (str.equals(((tt7) h.get(i)).s())) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        rt7 D = tt7.D();
        D.h(str);
        D.j(l.longValue());
        if (i >= 0) {
            lt7Var.c();
            ((mt7) lt7Var.y).I(i, (tt7) D.e());
        } else {
            lt7Var.l(D);
        }
    }

    public static final Bundle U(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tt7 tt7Var = (tt7) it.next();
            String s = tt7Var.s();
            if (tt7Var.z()) {
                bundle.putDouble(s, tt7Var.A());
            } else if (tt7Var.x()) {
                bundle.putFloat(s, tt7Var.y());
            } else if (tt7Var.t()) {
                bundle.putString(s, tt7Var.u());
            } else if (tt7Var.v()) {
                bundle.putLong(s, tt7Var.w());
            }
        }
        return bundle;
    }

    public static final tt7 V(String str, mt7 mt7Var) {
        for (tt7 tt7Var : mt7Var.t()) {
            if (tt7Var.s().equals(str)) {
                return tt7Var;
            }
        }
        return null;
    }

    public static final String W(String str, Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (str.equalsIgnoreCase((String) entry.getKey())) {
                    if (entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                        return (String) ((List) entry.getValue()).get(0);
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static final Serializable X(String str, mt7 mt7Var) {
        tt7 V = V(str, mt7Var);
        if (V == null) {
            return null;
        }
        return d0(V);
    }

    public static final void a0(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void b0(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (!hashSet.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public static final String c0(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable d0(tt7 tt7Var) {
        if (tt7Var.t()) {
            return tt7Var.u();
        }
        if (tt7Var.v()) {
            return Long.valueOf(tt7Var.w());
        }
        if (tt7Var.z()) {
            return Double.valueOf(tt7Var.A());
        }
        if (tt7Var.C() > 0) {
            return y0(tt7Var.B());
        }
        return null;
    }

    public static final void e0(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                b0(builder, str3, string, hashSet);
            }
        }
    }

    public static final void f0(StringBuilder sb, String str, tu7 tu7Var) {
        Integer num;
        Integer num2;
        Long l;
        if (tu7Var == null) {
            return;
        }
        a0(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (tu7Var.u() != 0) {
            a0(sb, 4);
            sb.append("results: ");
            int i = 0;
            for (Long l2 : tu7Var.t()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i = i2;
            }
            sb.append('\n');
        }
        if (tu7Var.s() != 0) {
            a0(sb, 4);
            sb.append("status: ");
            int i3 = 0;
            for (Long l3 : tu7Var.r()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (tu7Var.w() != 0) {
            a0(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (kt7 kt7Var : tu7Var.v()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                if (kt7Var.r()) {
                    num2 = Integer.valueOf(kt7Var.s());
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (kt7Var.t()) {
                    l = Long.valueOf(kt7Var.u());
                } else {
                    l = null;
                }
                sb.append(l);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (tu7Var.y() != 0) {
            a0(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (xu7 xu7Var : tu7Var.x()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                if (xu7Var.r()) {
                    num = Integer.valueOf(xu7Var.s());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                Iterator it = xu7Var.t().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        a0(sb, 3);
        sb.append("}\n");
    }

    public static final void g0(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        a0(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void h0(StringBuilder sb, int i, String str, gq7 gq7Var) {
        String str2;
        if (gq7Var == null) {
            return;
        }
        a0(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (gq7Var.r()) {
            int B = gq7Var.B();
            if (B != 1) {
                if (B != 2) {
                    if (B != 3) {
                        if (B != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            g0(sb, i, "comparison_type", str2);
        }
        if (gq7Var.s()) {
            g0(sb, i, "match_as_float", Boolean.valueOf(gq7Var.t()));
        }
        if (gq7Var.u()) {
            g0(sb, i, "comparison_value", gq7Var.v());
        }
        if (gq7Var.w()) {
            g0(sb, i, "min_comparison_value", gq7Var.x());
        }
        if (gq7Var.y()) {
            g0(sb, i, "max_comparison_value", gq7Var.z());
        }
        a0(sb, i);
        sb.append("}\n");
    }

    public static boolean p0(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    public static boolean q0(xf7 xf7Var, int i) {
        if (i < ((eg7) xf7Var).z * 64) {
            if (((1 << (i % 64)) & ((Long) ((eg7) xf7Var).get(i / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList r0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static kf7 w0(kf7 kf7Var, byte[] bArr) {
        ff7 a = ff7.a();
        if (a != null) {
            kf7Var.getClass();
            kf7Var.g(bArr, bArr.length, a);
            return kf7Var;
        }
        kf7Var.getClass();
        int length = bArr.length;
        int i = se7.a;
        kf7Var.g(bArr, length, ff7.b);
        return kf7Var;
    }

    public static int x0(String str, fu7 fu7Var) {
        for (int i = 0; i < ((iu7) fu7Var.y).Y1(); i++) {
            if (str.equals(((iu7) fu7Var.y).Z1(i).t())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] y0(yf7 yf7Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = yf7Var.iterator();
        while (it.hasNext()) {
            tt7 tt7Var = (tt7) it.next();
            if (tt7Var != null) {
                Bundle bundle = new Bundle();
                for (tt7 tt7Var2 : tt7Var.B()) {
                    if (tt7Var2.t()) {
                        bundle.putString(tt7Var2.s(), tt7Var2.u());
                    } else if (tt7Var2.v()) {
                        bundle.putLong(tt7Var2.s(), tt7Var2.w());
                    } else if (tt7Var2.z()) {
                        bundle.putDouble(tt7Var2.s(), tt7Var2.A());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(z0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(z0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(z0((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap z0(android.os.Bundle r10, boolean r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r11 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = z0(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = z0(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.HashMap r3 = z0(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c28.z0(android.os.Bundle, boolean):java.util.HashMap");
    }

    public final void R(Map map) {
        long j;
        gu7 gu7Var = (gu7) this.x;
        String W = W("Date", map);
        if (!TextUtils.isEmpty(W)) {
            try {
                j = ZonedDateTime.parse(W, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
            } catch (DateTimeParseException unused) {
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.F.b(W, "Unable to parse header time, time");
                j = 0;
            }
            if (j > 0) {
                gu7Var.H.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                L();
                if (this.B == 0) {
                    this.A = elapsedRealtime;
                    this.B = j;
                }
            }
        }
    }

    public final long S(long j) {
        L();
        long j2 = this.B;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.A) + j;
    }

    public final void Y(StringBuilder sb, int i, yf7 yf7Var) {
        String str;
        String str2;
        Long l;
        if (yf7Var != null) {
            int i2 = i + 1;
            Iterator it = yf7Var.iterator();
            while (it.hasNext()) {
                tt7 tt7Var = (tt7) it.next();
                if (tt7Var != null) {
                    a0(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (tt7Var.r()) {
                        str = ((gu7) this.x).G.b(tt7Var.s());
                    } else {
                        str = null;
                    }
                    g0(sb, i2, MediationMetaData.KEY_NAME, str);
                    if (tt7Var.t()) {
                        str2 = tt7Var.u();
                    } else {
                        str2 = null;
                    }
                    g0(sb, i2, "string_value", str2);
                    if (tt7Var.v()) {
                        l = Long.valueOf(tt7Var.w());
                    } else {
                        l = null;
                    }
                    g0(sb, i2, "int_value", l);
                    if (tt7Var.z()) {
                        d = Double.valueOf(tt7Var.A());
                    }
                    g0(sb, i2, "double_value", d);
                    if (tt7Var.C() > 0) {
                        Y(sb, i2, tt7Var.B());
                    }
                    a0(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    public final void Z(StringBuilder sb, int i, eq7 eq7Var) {
        String str;
        if (eq7Var == null) {
            return;
        }
        a0(sb, i);
        sb.append("filter {\n");
        if (eq7Var.v()) {
            g0(sb, i, "complement", Boolean.valueOf(eq7Var.w()));
        }
        if (eq7Var.x()) {
            g0(sb, i, "param_name", ((gu7) this.x).G.b(eq7Var.y()));
        }
        if (eq7Var.r()) {
            int i2 = i + 1;
            mq7 s = eq7Var.s();
            if (s != null) {
                a0(sb, i2);
                sb.append("string_filter {\n");
                if (s.r()) {
                    switch (s.z()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    g0(sb, i2, "match_type", str);
                }
                if (s.s()) {
                    g0(sb, i2, "expression", s.t());
                }
                if (s.u()) {
                    g0(sb, i2, "case_sensitive", Boolean.valueOf(s.v()));
                }
                if (s.x() > 0) {
                    a0(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : s.w()) {
                        a0(sb, i + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                a0(sb, i2);
                sb.append("}\n");
            }
        }
        if (eq7Var.t()) {
            h0(sb, i + 1, "number_filter", eq7Var.u());
        }
        a0(sb, i);
        sb.append("}\n");
    }

    public final void i0(bv7 bv7Var, Object obj) {
        bv7Var.c();
        ((cv7) bv7Var.y).G();
        bv7Var.c();
        ((cv7) bv7Var.y).I();
        bv7Var.c();
        ((cv7) bv7Var.y).K();
        if (obj instanceof String) {
            bv7Var.c();
            ((cv7) bv7Var.y).F((String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            bv7Var.c();
            ((cv7) bv7Var.y).H(longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            bv7Var.c();
            ((cv7) bv7Var.y).J(doubleValue);
        } else {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.C.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void j0(rt7 rt7Var, Object obj) {
        rt7Var.c();
        ((tt7) rt7Var.y).G();
        rt7Var.c();
        ((tt7) rt7Var.y).I();
        rt7Var.c();
        ((tt7) rt7Var.y).K();
        rt7Var.c();
        ((tt7) rt7Var.y).N();
        if (obj instanceof String) {
            rt7Var.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            rt7Var.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            rt7Var.c();
            ((tt7) rt7Var.y).J(doubleValue);
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    rt7 D = tt7.D();
                    for (String str : bundle.keySet()) {
                        rt7 D2 = tt7.D();
                        D2.h(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            D2.j(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            D2.i((String) obj2);
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            D2.c();
                            ((tt7) D2.y).J(doubleValue2);
                        }
                        D.c();
                        ((tt7) D.y).L((tt7) D2.e());
                    }
                    if (((tt7) D.y).C() > 0) {
                        arrayList.add((tt7) D.e());
                    }
                }
            }
            rt7Var.c();
            ((tt7) rt7Var.y).M(arrayList);
            return;
        }
        es7 es7Var = ((gu7) this.x).C;
        gu7.l(es7Var);
        es7Var.C.b(obj, "Ignoring invalid (type) event param value");
    }

    public final x08 k0(String str, fu7 fu7Var, lt7 lt7Var, String str2) {
        int indexOf;
        yi7.a();
        gu7 gu7Var = (gu7) this.x;
        ak7 ak7Var = gu7Var.A;
        if (ak7Var.W(str, tq7.O0)) {
            gu7Var.H.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            HashSet hashSet = new HashSet(Arrays.asList(ak7Var.S(str, tq7.t0).split(",")));
            z18 z18Var = this.y;
            n18 n18Var = z18Var.G;
            nt7 nt7Var = z18Var.x;
            nt7 nt7Var2 = n18Var.y.x;
            z18.T(nt7Var2);
            String Y = nt7Var2.Y(str);
            Uri.Builder builder = new Uri.Builder();
            ak7 ak7Var2 = ((gu7) n18Var.x).A;
            builder.scheme(ak7Var2.S(str, tq7.m0));
            if (!TextUtils.isEmpty(Y)) {
                String S = ak7Var2.S(str, tq7.n0);
                StringBuilder sb = new StringBuilder(String.valueOf(Y).length() + 1 + String.valueOf(S).length());
                sb.append(Y);
                sb.append(".");
                sb.append(S);
                builder.authority(sb.toString());
            } else {
                builder.authority(ak7Var2.S(str, tq7.n0));
            }
            builder.path(ak7Var2.S(str, tq7.o0));
            b0(builder, "gmp_app_id", ((iu7) fu7Var.y).G(), hashSet);
            ak7Var.R();
            b0(builder, "gmp_version", String.valueOf(161000L), hashSet);
            String A = ((iu7) fu7Var.y).A();
            sq7 sq7Var = tq7.R0;
            if (ak7Var.W(str, sq7Var)) {
                z18.T(nt7Var);
                if (nt7Var.f0(str)) {
                    A = "";
                }
            }
            b0(builder, "app_instance_id", A, hashSet);
            b0(builder, "rdid", ((iu7) fu7Var.y).x(), hashSet);
            b0(builder, "bundle_id", fu7Var.o(), hashSet);
            String n = lt7Var.n();
            String s = ct5.s(n, te4.q, te4.l);
            if (true != TextUtils.isEmpty(s)) {
                n = s;
            }
            b0(builder, "app_event_name", n, hashSet);
            b0(builder, "app_version", String.valueOf(((iu7) fu7Var.y).M()), hashSet);
            String l2 = ((iu7) fu7Var.y).l2();
            if (ak7Var.W(str, sq7Var)) {
                z18.T(nt7Var);
                if (nt7Var.e0(str) && !TextUtils.isEmpty(l2) && (indexOf = l2.indexOf(".")) != -1) {
                    l2 = l2.substring(0, indexOf);
                }
            }
            b0(builder, "os_version", l2, hashSet);
            b0(builder, "timestamp", String.valueOf(lt7Var.p()), hashSet);
            boolean z = ((iu7) fu7Var.y).z();
            String str3 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
            if (z) {
                b0(builder, "lat", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, hashSet);
            }
            b0(builder, "privacy_sandbox_version", String.valueOf(((iu7) fu7Var.y).I0()), hashSet);
            b0(builder, "trigger_uri_source", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, hashSet);
            b0(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), hashSet);
            b0(builder, "request_uuid", str2, hashSet);
            List<tt7> h = lt7Var.h();
            Bundle bundle = new Bundle();
            for (tt7 tt7Var : h) {
                String s2 = tt7Var.s();
                if (tt7Var.z()) {
                    bundle.putString(s2, String.valueOf(tt7Var.A()));
                } else if (tt7Var.x()) {
                    bundle.putString(s2, String.valueOf(tt7Var.y()));
                } else if (tt7Var.t()) {
                    bundle.putString(s2, tt7Var.u());
                } else if (tt7Var.v()) {
                    bundle.putString(s2, String.valueOf(tt7Var.w()));
                }
            }
            e0(builder, ak7Var.S(str, tq7.s0).split("\\|"), bundle, hashSet);
            List<cv7> unmodifiableList = Collections.unmodifiableList(((iu7) fu7Var.y).X1());
            Bundle bundle2 = new Bundle();
            for (cv7 cv7Var : unmodifiableList) {
                String t = cv7Var.t();
                if (cv7Var.A()) {
                    bundle2.putString(t, String.valueOf(cv7Var.B()));
                } else if (cv7Var.y()) {
                    bundle2.putString(t, String.valueOf(cv7Var.z()));
                } else if (cv7Var.u()) {
                    bundle2.putString(t, cv7Var.v());
                } else if (cv7Var.w()) {
                    bundle2.putString(t, String.valueOf(cv7Var.x()));
                }
            }
            e0(builder, ak7Var.S(str, tq7.r0).split("\\|"), bundle2, hashSet);
            if (true != ((iu7) fu7Var.y).F0()) {
                str3 = "0";
            }
            b0(builder, "dma", str3, hashSet);
            if (!((iu7) fu7Var.y).H0().isEmpty()) {
                b0(builder, "dma_cps", ((iu7) fu7Var.y).H0(), hashSet);
            }
            if (((iu7) fu7Var.y).N0()) {
                qs7 O0 = ((iu7) fu7Var.y).O0();
                if (!O0.F().isEmpty()) {
                    b0(builder, "dl_gclid", O0.F(), hashSet);
                }
                if (!O0.H().isEmpty()) {
                    b0(builder, "dl_gbraid", O0.H(), hashSet);
                }
                if (!O0.J().isEmpty()) {
                    b0(builder, "dl_gs", O0.J(), hashSet);
                }
                if (O0.L() > 0) {
                    b0(builder, "dl_ss_ts", String.valueOf(O0.L()), hashSet);
                }
                if (!O0.N().isEmpty()) {
                    b0(builder, "mr_gclid", O0.N(), hashSet);
                }
                if (!O0.P().isEmpty()) {
                    b0(builder, "mr_gbraid", O0.P(), hashSet);
                }
                if (!O0.R().isEmpty()) {
                    b0(builder, "mr_gs", O0.R(), hashSet);
                }
                if (O0.T() > 0) {
                    b0(builder, "mr_click_ts", String.valueOf(O0.T()), hashSet);
                }
            }
            return new x08(currentTimeMillis, 1, builder.build().toString());
        }
        return null;
    }

    public final mt7 l0(cm7 cm7Var) {
        lt7 H = mt7.H();
        long j = cm7Var.f;
        H.c();
        ((mt7) H.y).P(j);
        long j2 = cm7Var.e;
        H.c();
        ((mt7) H.y).r(j2);
        Bundle bundle = cm7Var.g.x;
        for (String str : bundle.keySet()) {
            rt7 D = tt7.D();
            D.h(str);
            Object obj = bundle.get(str);
            a34.x(obj);
            j0(D, obj);
            H.l(D);
        }
        String str2 = cm7Var.c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            rt7 D2 = tt7.D();
            D2.h("_o");
            D2.i(str2);
            H.k((tt7) D2.e());
        }
        return (mt7) H.e();
    }

    public final String m0(eu7 eu7Var) {
        Long l;
        Long l2;
        Double d;
        String str;
        String str2;
        String str3;
        String str4;
        ws7 K0;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (eu7Var.w()) {
            g0(sb, 0, "upload_subdomain", eu7Var.x());
        }
        if (eu7Var.u()) {
            g0(sb, 0, "sgtm_join_id", eu7Var.v());
        }
        for (iu7 iu7Var : eu7Var.r()) {
            if (iu7Var != null) {
                a0(sb, 1);
                sb.append("bundle {\n");
                if (iu7Var.R()) {
                    g0(sb, 1, "protocol_version", Integer.valueOf(iu7Var.R0()));
                }
                gu7 gu7Var = (gu7) this.x;
                ak7 ak7Var = gu7Var.A;
                vr7 vr7Var = gu7Var.G;
                if (ak7Var.W(iu7Var.r(), tq7.M0) && iu7Var.x0()) {
                    g0(sb, 1, "session_stitching_token", iu7Var.y0());
                }
                g0(sb, 1, "platform", iu7Var.k2());
                if (iu7Var.t()) {
                    g0(sb, 1, "gmp_version", Long.valueOf(iu7Var.u()));
                }
                if (iu7Var.v()) {
                    g0(sb, 1, "uploading_gmp_version", Long.valueOf(iu7Var.w()));
                }
                if (iu7Var.t0()) {
                    g0(sb, 1, "dynamite_version", Long.valueOf(iu7Var.u0()));
                }
                if (iu7Var.N()) {
                    g0(sb, 1, "config_version", Long.valueOf(iu7Var.O()));
                }
                g0(sb, 1, "gmp_app_id", iu7Var.G());
                g0(sb, 1, "app_id", iu7Var.r());
                g0(sb, 1, "app_version", iu7Var.s());
                if (iu7Var.L()) {
                    g0(sb, 1, "app_version_major", Integer.valueOf(iu7Var.M()));
                }
                g0(sb, 1, "firebase_instance_id", iu7Var.K());
                if (iu7Var.B()) {
                    g0(sb, 1, "dev_cert_hash", Long.valueOf(iu7Var.C()));
                }
                g0(sb, 1, "app_store", iu7Var.q2());
                if (iu7Var.a2()) {
                    g0(sb, 1, "upload_timestamp_millis", Long.valueOf(iu7Var.b2()));
                }
                if (iu7Var.c2()) {
                    g0(sb, 1, "start_timestamp_millis", Long.valueOf(iu7Var.d2()));
                }
                if (iu7Var.e2()) {
                    g0(sb, 1, "end_timestamp_millis", Long.valueOf(iu7Var.f2()));
                }
                if (iu7Var.g2()) {
                    g0(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(iu7Var.h2()));
                }
                if (iu7Var.i2()) {
                    g0(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(iu7Var.j2()));
                }
                g0(sb, 1, "app_instance_id", iu7Var.A());
                g0(sb, 1, "resettable_device_id", iu7Var.x());
                g0(sb, 1, "ds_id", iu7Var.Q());
                if (iu7Var.y()) {
                    g0(sb, 1, "limited_ad_tracking", Boolean.valueOf(iu7Var.z()));
                }
                g0(sb, 1, "os_version", iu7Var.l2());
                g0(sb, 1, "device_model", iu7Var.m2());
                g0(sb, 1, "user_default_language", iu7Var.n2());
                if (iu7Var.o2()) {
                    g0(sb, 1, "time_zone_offset_minutes", Integer.valueOf(iu7Var.p2()));
                }
                if (iu7Var.D()) {
                    g0(sb, 1, "bundle_sequential_index", Integer.valueOf(iu7Var.E()));
                }
                if (iu7Var.L0()) {
                    g0(sb, 1, "delivery_index", Integer.valueOf(iu7Var.M0()));
                }
                if (iu7Var.H()) {
                    g0(sb, 1, "service_upload", Boolean.valueOf(iu7Var.I()));
                }
                g0(sb, 1, "health_monitor", iu7Var.F());
                if (iu7Var.r0()) {
                    g0(sb, 1, "retry_counter", Integer.valueOf(iu7Var.s0()));
                }
                if (iu7Var.v0()) {
                    g0(sb, 1, "consent_signals", iu7Var.w0());
                }
                if (iu7Var.E0()) {
                    g0(sb, 1, "is_dma_region", Boolean.valueOf(iu7Var.F0()));
                }
                if (iu7Var.G0()) {
                    g0(sb, 1, "core_platform_services", iu7Var.H0());
                }
                if (iu7Var.C0()) {
                    g0(sb, 1, "consent_diagnostics", iu7Var.D0());
                }
                if (iu7Var.z0()) {
                    g0(sb, 1, "target_os_version", Long.valueOf(iu7Var.A0()));
                }
                yi7.a();
                if (ak7Var.W(iu7Var.r(), tq7.O0)) {
                    g0(sb, 1, "ad_services_version", Integer.valueOf(iu7Var.I0()));
                    if (iu7Var.J0() && (K0 = iu7Var.K0()) != null) {
                        a0(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        g0(sb, 2, "eligible", Boolean.valueOf(K0.r()));
                        g0(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(K0.s()));
                        g0(sb, 2, "pre_r", Boolean.valueOf(K0.t()));
                        g0(sb, 2, "r_extensions_too_old", Boolean.valueOf(K0.u()));
                        g0(sb, 2, "adservices_extension_too_old", Boolean.valueOf(K0.v()));
                        g0(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(K0.w()));
                        g0(sb, 2, "measurement_manager_disabled", Boolean.valueOf(K0.x()));
                        a0(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (iu7Var.N0()) {
                    qs7 O0 = iu7Var.O0();
                    a0(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (O0.E()) {
                        g0(sb, 2, "deep_link_gclid", O0.F());
                    }
                    if (O0.G()) {
                        g0(sb, 2, "deep_link_gbraid", O0.H());
                    }
                    if (O0.I()) {
                        g0(sb, 2, "deep_link_gad_source", O0.J());
                    }
                    if (O0.U()) {
                        g0(sb, 2, "deep_link_url", O0.V());
                    }
                    if (O0.K()) {
                        g0(sb, 2, "deep_link_session_millis", Long.valueOf(O0.L()));
                    }
                    if (O0.M()) {
                        g0(sb, 2, "market_referrer_gclid", O0.N());
                    }
                    if (O0.O()) {
                        g0(sb, 2, "market_referrer_gbraid", O0.P());
                    }
                    if (O0.Q()) {
                        g0(sb, 2, "market_referrer_gad_source", O0.R());
                    }
                    if (O0.S()) {
                        g0(sb, 2, "market_referrer_click_millis", Long.valueOf(O0.T()));
                    }
                    a0(sb, 2);
                    sb.append("}\n");
                }
                if (iu7Var.S()) {
                    g0(sb, 1, "batching_timestamp_millis", Long.valueOf(iu7Var.T()));
                }
                if (iu7Var.P0()) {
                    av7 Q0 = iu7Var.Q0();
                    a0(sb, 2);
                    sb.append("sgtm_diagnostics {\n");
                    int v = Q0.v();
                    if (v != 1) {
                        if (v != 2) {
                            if (v != 3) {
                                if (v != 4) {
                                    str3 = "SDK_SERVICE_UPLOAD";
                                } else {
                                    str3 = "PACKAGE_SERVICE_UPLOAD";
                                }
                            } else {
                                str3 = "SDK_CLIENT_UPLOAD";
                            }
                        } else {
                            str3 = "GA_UPLOAD";
                        }
                    } else {
                        str3 = "UPLOAD_TYPE_UNKNOWN";
                    }
                    g0(sb, 2, "upload_type", str3);
                    g0(sb, 2, "client_upload_eligibility", zo5.w(Q0.r()));
                    int w = Q0.w();
                    if (w != 1) {
                        if (w != 2) {
                            if (w != 3) {
                                if (w != 4) {
                                    if (w != 5) {
                                        str4 = "NON_PLAY_MISSING_SGTM_SERVER_URL";
                                    } else {
                                        str4 = "MISSING_SGTM_PROXY_INFO";
                                    }
                                } else {
                                    str4 = "MISSING_SGTM_SETTINGS";
                                }
                            } else {
                                str4 = "NOT_IN_ROLLOUT";
                            }
                        } else {
                            str4 = "SERVICE_UPLOAD_ELIGIBLE";
                        }
                    } else {
                        str4 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    }
                    g0(sb, 2, "service_upload_eligibility", str4);
                    a0(sb, 2);
                    sb.append("}\n");
                }
                if (iu7Var.U()) {
                    gt7 V = iu7Var.V();
                    a0(sb, 2);
                    sb.append("consent_info_extra {\n");
                    for (ft7 ft7Var : V.r()) {
                        a0(sb, 3);
                        sb.append("limited_data_modes {\n");
                        int s = ft7Var.s();
                        if (s != 1) {
                            if (s != 2) {
                                if (s != 3) {
                                    if (s != 4) {
                                        str = "AD_PERSONALIZATION";
                                    } else {
                                        str = "AD_USER_DATA";
                                    }
                                } else {
                                    str = "ANALYTICS_STORAGE";
                                }
                            } else {
                                str = "AD_STORAGE";
                            }
                        } else {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        }
                        g0(sb, 3, HandleInvocationsFromAdViewer.KEY_AD_TYPE, str);
                        int t = ft7Var.t();
                        if (t != 1) {
                            if (t != 2) {
                                str2 = "NO_DATA_MODE";
                            } else {
                                str2 = "LIMITED_MODE";
                            }
                        } else {
                            str2 = "NOT_LIMITED";
                        }
                        g0(sb, 3, "mode", str2);
                        a0(sb, 3);
                        sb.append("}\n");
                    }
                    a0(sb, 2);
                    sb.append("}\n");
                }
                yf7<cv7> X1 = iu7Var.X1();
                if (X1 != null) {
                    for (cv7 cv7Var : X1) {
                        if (cv7Var != null) {
                            a0(sb, 2);
                            sb.append("user_property {\n");
                            if (cv7Var.r()) {
                                l = Long.valueOf(cv7Var.s());
                            } else {
                                l = null;
                            }
                            g0(sb, 2, "set_timestamp_millis", l);
                            g0(sb, 2, MediationMetaData.KEY_NAME, vr7Var.c(cv7Var.t()));
                            g0(sb, 2, "string_value", cv7Var.v());
                            if (cv7Var.w()) {
                                l2 = Long.valueOf(cv7Var.x());
                            } else {
                                l2 = null;
                            }
                            g0(sb, 2, "int_value", l2);
                            if (cv7Var.A()) {
                                d = Double.valueOf(cv7Var.B());
                            } else {
                                d = null;
                            }
                            g0(sb, 2, "double_value", d);
                            a0(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                yf7<ys7> J = iu7Var.J();
                if (J != null) {
                    for (ys7 ys7Var : J) {
                        if (ys7Var != null) {
                            a0(sb, 2);
                            sb.append("audience_membership {\n");
                            if (ys7Var.r()) {
                                g0(sb, 2, "audience_id", Integer.valueOf(ys7Var.s()));
                            }
                            if (ys7Var.w()) {
                                g0(sb, 2, "new_audience", Boolean.valueOf(ys7Var.x()));
                            }
                            f0(sb, "current_data", ys7Var.t());
                            if (ys7Var.u()) {
                                f0(sb, "previous_data", ys7Var.v());
                            }
                            a0(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<mt7> R1 = iu7Var.R1();
                if (R1 != null) {
                    for (mt7 mt7Var : R1) {
                        if (mt7Var != null) {
                            a0(sb, 2);
                            sb.append("event {\n");
                            g0(sb, 2, MediationMetaData.KEY_NAME, vr7Var.a(mt7Var.w()));
                            if (mt7Var.x()) {
                                g0(sb, 2, "timestamp_millis", Long.valueOf(mt7Var.y()));
                            }
                            if (ak7Var.W(null, tq7.e1) && mt7Var.D()) {
                                g0(sb, 2, "corrected_timestamp_millis", Long.valueOf(mt7Var.E()));
                            }
                            if (mt7Var.z()) {
                                g0(sb, 2, "previous_timestamp_millis", Long.valueOf(mt7Var.A()));
                            }
                            if (mt7Var.B()) {
                                g0(sb, 2, "count", Integer.valueOf(mt7Var.C()));
                            }
                            if (mt7Var.u() != 0) {
                                Y(sb, 2, (yf7) mt7Var.t());
                            }
                            a0(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                a0(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    public final String n0(jq7 jq7Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (jq7Var.r()) {
            g0(sb, 0, "filter_id", Integer.valueOf(jq7Var.s()));
        }
        g0(sb, 0, "property_name", ((gu7) this.x).G.c(jq7Var.t()));
        String c0 = c0(jq7Var.v(), jq7Var.w(), jq7Var.y());
        if (!c0.isEmpty()) {
            g0(sb, 0, "filter_type", c0);
        }
        Z(sb, 1, jq7Var.u());
        sb.append("}\n");
        return sb.toString();
    }

    public final Parcelable o0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (z85 unused) {
                es7 es7Var = ((gu7) this.x).C;
                gu7.l(es7Var);
                es7Var.C.a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public final List s0(xf7 xf7Var, List list) {
        int i;
        gu7 gu7Var = (gu7) this.x;
        ArrayList arrayList = new ArrayList(xf7Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.F.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    es7 es7Var2 = gu7Var.C;
                    gu7.l(es7Var2);
                    es7Var2.F.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean t0(long j, long j2) {
        if (j != 0 && j2 > 0) {
            ((gu7) this.x).H.getClass();
            if (Math.abs(System.currentTimeMillis() - j) <= j2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final long u0(byte[] bArr) {
        a34.x(bArr);
        gu7 gu7Var = (gu7) this.x;
        i28 i28Var = gu7Var.F;
        gu7.j(i28Var);
        i28Var.L();
        MessageDigest e0 = i28.e0();
        if (e0 == null) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.C.a("Failed to get MD5");
            return 0L;
        }
        return i28.f0(e0.digest(bArr));
    }

    public final byte[] v0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.C.b(e, "Failed to gzip content");
            throw e;
        }
    }

    @Override // defpackage.j18
    public final void O() {
    }
}
