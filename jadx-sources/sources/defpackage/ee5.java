package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ee5 {
    public static final ts4 c = new ts4("queries");
    public final w41 a;
    public final w42 b;

    public ee5(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        w41 w41Var = (w41) fe5.b.a(applicationContext, fe5.a[0]);
        this.a = w41Var;
        this.b = sw0.m(new g10(new i52(w41Var.getData(), new wl1(3, null, (byte) 1), (byte) 1), this, (byte) 6));
    }

    public static List c(String str) {
        String str2;
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int i = 0;
                f13 r0 = db.r0(0, jSONArray.length());
                ArrayList arrayList = new ArrayList();
                Iterator it = r0.iterator();
                while (((e13) it).z) {
                    Object opt = jSONArray.opt(((e13) it).nextInt());
                    String str3 = null;
                    if (opt instanceof String) {
                        str2 = (String) opt;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str3 = uz5.w0(str2).toString();
                    }
                    if (str3 != null) {
                        arrayList.add(str3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (!uz5.V((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = ((String) obj2).toLowerCase(locale);
                    lowerCase.getClass();
                    if (hashSet.add(lowerCase)) {
                        arrayList3.add(obj2);
                    }
                }
                return yo0.D0(arrayList3, 20);
            } catch (JSONException unused) {
                return nt1.x;
            }
        }
        return nt1.x;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.xz0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.yd5
            if (r0 == 0) goto L13
            r0 = r7
            yd5 r0 = (defpackage.yd5) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            yd5 r0 = new yd5
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.x
            int r1 = r0.z
            pn6 r2 = defpackage.pn6.a
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.m37.N(r7)
            return r2
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r4
        L2e:
            defpackage.m37.N(r7)
            java.lang.CharSequence r6 = defpackage.uz5.w0(r6)
            java.lang.String r6 = r6.toString()
            boolean r7 = defpackage.uz5.V(r6)
            if (r7 == 0) goto L40
            goto L53
        L40:
            zd5 r7 = new zd5
            r1 = 0
            r7.<init>(r5, r6, r4, r1)
            r0.z = r3
            w41 r5 = r5.a
            java.lang.Object r5 = defpackage.oi4.p(r5, r7, r0)
            w11 r6 = defpackage.w11.x
            if (r5 != r6) goto L53
            return r6
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee5.a(java.lang.String, xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.xz0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ae5
            if (r0 == 0) goto L13
            r0 = r6
            ae5 r0 = (defpackage.ae5) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ae5 r0 = new ae5
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r6)
            goto L43
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r2
        L2c:
            defpackage.m37.N(r6)
            h70 r6 = new h70
            r1 = 2
            r4 = 5
            r6.<init>(r1, r2, r4)
            r0.z = r3
            w41 r5 = r5.a
            java.lang.Object r5 = defpackage.oi4.p(r5, r6, r0)
            w11 r6 = defpackage.w11.x
            if (r5 != r6) goto L43
            return r6
        L43:
            pn6 r5 = defpackage.pn6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee5.b(xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, defpackage.xz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.be5
            if (r0 == 0) goto L13
            r0 = r6
            be5 r0 = (defpackage.be5) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            be5 r0 = new be5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r6)
            goto L41
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2c:
            defpackage.m37.N(r6)
            zd5 r6 = new zd5
            r6.<init>(r4, r5, r2, r3)
            r0.z = r3
            w41 r4 = r4.a
            java.lang.Object r4 = defpackage.oi4.p(r4, r6, r0)
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L41
            return r5
        L41:
            pn6 r4 = defpackage.pn6.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee5.d(java.lang.String, xz0):java.lang.Object");
    }
}
