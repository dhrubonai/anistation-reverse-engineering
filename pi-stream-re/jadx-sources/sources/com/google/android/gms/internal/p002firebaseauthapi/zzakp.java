package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzakp {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzakk zzakkVar, String str) {
        StringBuilder a10 = j.a("# ", str);
        zza(zzakkVar, a10, 0);
        return a10.toString();
    }

    private static void zza(int i10, StringBuilder sb) {
        while (i10 > 0) {
            char[] cArr = zza;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb.append(cArr, 0, length);
            i10 -= length;
        }
    }

    public static void zza(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i10, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzalx.zza(zzahm.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzahm) {
            sb.append(": \"");
            sb.append(zzalx.zza((zzahm) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzaja) {
            sb.append(" {");
            zza((zzaja) obj, sb, i10 + 2);
            sb.append("\n");
            zza(i10, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i12 = i10 + 2;
            zza(sb, i12, "key", entry.getKey());
            zza(sb, i12, "value", entry.getValue());
            sb.append("\n");
            zza(i10, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x015b, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0183, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0185, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0196, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a8, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01be, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.p002firebaseauthapi.zzakk r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakp.zza(com.google.android.gms.internal.firebase-auth-api.zzakk, java.lang.StringBuilder, int):void");
    }
}
