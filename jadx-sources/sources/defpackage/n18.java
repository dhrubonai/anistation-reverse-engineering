package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n18 extends b18 {
    public static final boolean O(String str) {
        String str2 = (String) tq7.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.G().r()) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.l18 M(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n18.M(java.lang.String):l18");
    }

    public final String N(String str) {
        nt7 nt7Var = this.y.x;
        z18.T(nt7Var);
        String Y = nt7Var.Y(str);
        if (!TextUtils.isEmpty(Y)) {
            Uri parse = Uri.parse((String) tq7.r.a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            String authority = parse.getAuthority();
            StringBuilder sb = new StringBuilder(String.valueOf(Y).length() + 1 + String.valueOf(authority).length());
            sb.append(Y);
            sb.append(".");
            sb.append(authority);
            buildUpon.authority(sb.toString());
            return buildUpon.build().toString();
        }
        return (String) tq7.r.a(null);
    }
}
