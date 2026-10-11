package j3;

import android.content.res.Resources;
import android.text.TextUtils;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class g implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f6012a;

    public g(Resources resources) {
        resources.getClass();
        this.f6012a = resources;
    }

    public final String a(c1.v vVar) {
        int i10 = vVar.f1931i;
        if (i10 == -1) {
            return "";
        }
        return this.f6012a.getString(R.string.exo_track_bitrate, Float.valueOf(i10 / 1000000.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(c1.v r10) {
        /*
            r9 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = r10.f1926d
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            java.lang.String r4 = ""
            r5 = 0
            if (r2 != 0) goto L65
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L18
            goto L65
        L18:
            int r2 = f1.b0.f3799a
            r6 = 21
            if (r2 < r6) goto L23
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
            goto L29
        L23:
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r1)
            r1 = r6
        L29:
            r6 = 24
            if (r2 < r6) goto L36
            java.util.Locale$Category r2 = w8.a.b()
            java.util.Locale r2 = f1.z.i(r2)
            goto L3a
        L36:
            java.util.Locale r2 = java.util.Locale.getDefault()
        L3a:
            java.lang.String r1 = r1.getDisplayName(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L45
            goto L65
        L45:
            int r6 = r1.offsetByCodePoints(r5, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L66
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L66
            r7.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L66
            java.lang.String r8 = r1.substring(r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L66
            java.lang.String r2 = r8.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L66
            r7.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L66
            java.lang.String r2 = r1.substring(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L66
            r7.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L66
            java.lang.String r1 = r7.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L66
            goto L66
        L65:
            r1 = r4
        L66:
            r0[r5] = r1
            java.lang.String r1 = r9.c(r10)
            r0[r3] = r1
            java.lang.String r0 = r9.e(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L83
            java.lang.String r10 = r10.f1924b
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L81
            goto L82
        L81:
            r4 = r10
        L82:
            r0 = r4
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.g.b(c1.v):java.lang.String");
    }

    public final String c(c1.v vVar) {
        String str;
        int i10 = vVar.f1928f & 2;
        Resources resources = this.f6012a;
        if (i10 != 0) {
            str = resources.getString(R.string.exo_track_role_alternate);
        } else {
            str = "";
        }
        int i11 = vVar.f1928f;
        if ((i11 & 4) != 0) {
            str = e(str, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i11 & 8) != 0) {
            str = e(str, resources.getString(R.string.exo_track_role_commentary));
        }
        if ((i11 & 1088) != 0) {
            return e(str, resources.getString(R.string.exo_track_role_closed_captions));
        }
        return str;
    }

    public final String d(c1.v vVar) {
        String b10;
        int i10 = c1.q0.i(vVar.f1935m);
        int i11 = vVar.f1947z;
        int i12 = vVar.f1940s;
        int i13 = vVar.f1939r;
        if (i10 == -1) {
            String str = vVar.f1932j;
            if (c1.q0.j(str) == null) {
                if (c1.q0.b(str) == null) {
                    if (i13 == -1 && i12 == -1) {
                        if (i11 == -1 && vVar.A == -1) {
                            i10 = -1;
                        }
                    }
                }
                i10 = 1;
            }
            i10 = 2;
        }
        String str2 = "";
        Resources resources = this.f6012a;
        if (i10 == 2) {
            String[] strArr = new String[3];
            strArr[0] = c(vVar);
            if (i13 != -1 && i12 != -1) {
                str2 = resources.getString(R.string.exo_track_resolution, Integer.valueOf(i13), Integer.valueOf(i12));
            }
            strArr[1] = str2;
            strArr[2] = a(vVar);
            b10 = e(strArr);
        } else if (i10 == 1) {
            String[] strArr2 = new String[3];
            strArr2[0] = b(vVar);
            if (i11 != -1 && i11 >= 1) {
                str2 = i11 != 1 ? i11 != 2 ? (i11 == 6 || i11 == 7) ? resources.getString(R.string.exo_track_surround_5_point_1) : i11 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1) : resources.getString(R.string.exo_track_stereo) : resources.getString(R.string.exo_track_mono);
            }
            strArr2[1] = str2;
            strArr2[2] = a(vVar);
            b10 = e(strArr2);
        } else {
            b10 = b(vVar);
        }
        if (b10.length() != 0) {
            return b10;
        }
        String str3 = vVar.f1926d;
        if (str3 != null && !str3.trim().isEmpty()) {
            return resources.getString(R.string.exo_track_unknown_name, str3);
        }
        return resources.getString(R.string.exo_track_unknown);
    }

    public final String e(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f6012a.getString(R.string.exo_item_list, str, str2);
                }
            }
        }
        return str;
    }
}
