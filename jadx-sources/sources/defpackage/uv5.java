package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.io.File;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class uv5 {
    public static og5 a;

    public static pf6 a(v11 v11Var, String str, long j, ub2 ub2Var) {
        jk5 jk5Var = new jk5((byte) 27);
        v11Var.getClass();
        return new pf6(str, j, jk5Var, v11Var, ub2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Map, java.lang.Object] */
    public static final void b(Context context) {
        LinkedHashMap linkedHashMap;
        String str;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            xk3.d().a(e77.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            String[] strArr = e77.b;
            int S = vn3.S(strArr.length);
            if (S < 16) {
                S = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(S);
            for (String str2 : strArr) {
                linkedHashMap2.put(new File(h11.j(databasePath2.getPath(), str2)), new File(h11.j(file.getPath(), str2)));
            }
            if (linkedHashMap2.isEmpty()) {
                ?? singletonMap = Collections.singletonMap(databasePath2, file);
                singletonMap.getClass();
                linkedHashMap = singletonMap;
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        xk3.d().g(e77.a, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        str = "Migrated " + file2 + "to " + file3;
                    } else {
                        str = "Renaming " + file2 + " to " + file3 + " failed";
                    }
                    xk3.d().a(e77.a, str);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v14, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v5, types: [km5] */
    /* JADX WARN: Type inference failed for: r5v0, types: [km5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(defpackage.vg0 r11, defpackage.bd6 r12) {
        /*
            nr1 r0 = defpackage.nr1.Q
            o24 r1 = r12.b
            boolean r2 = r12.d()
            ad6 r3 = r12.a
            if (r2 == 0) goto L15
            int r2 = r3.f
            r4 = 3
            if (r2 != r4) goto L12
            goto L15
        L12:
            r2 = 1
        L13:
            r8 = r2
            goto L17
        L15:
            r2 = 0
            goto L13
        L17:
            if (r8 == 0) goto L42
            long r4 = r12.c
            r12 = 32
            long r6 = r4 >> r12
            int r2 = (int) r6
            float r2 = (float) r2
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r4 = (int) r4
            float r4 = (float) r4
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r9 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r4)
            long r4 = (long) r2
            long r9 = r9 << r12
            long r4 = r4 & r6
            long r4 = r4 | r9
            r6 = 0
            n05 r12 = defpackage.n03.g(r6, r4)
            r11.h()
            defpackage.vg0.q(r11, r12)
        L42:
            xd6 r12 = r3.b
            pv5 r12 = r12.a
            g96 r2 = r12.m
            nc6 r3 = r12.a
            if (r2 != 0) goto L4e
            g96 r2 = defpackage.g96.b
        L4e:
            r6 = r2
            km5 r2 = r12.n
            if (r2 != 0) goto L55
            km5 r2 = defpackage.km5.d
        L55:
            r5 = r2
            bb4 r12 = r12.o
            if (r12 != 0) goto L5c
            y22 r12 = defpackage.y22.O
        L5c:
            r7 = r12
            r12 = r3
            ka0 r3 = r12.d()     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L7b
            if (r12 == r0) goto L71
            float r12 = r12.e()     // Catch: java.lang.Throwable -> L6d
        L6a:
            r2 = r11
            r4 = r12
            goto L74
        L6d:
            r0 = move-exception
            r12 = r0
            r2 = r11
            goto L93
        L71:
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L6a
        L74:
            defpackage.o24.j(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L78
            goto L8a
        L78:
            r0 = move-exception
        L79:
            r12 = r0
            goto L93
        L7b:
            r2 = r11
            if (r12 == r0) goto L84
            long r11 = r12.a()     // Catch: java.lang.Throwable -> L78
        L82:
            r3 = r11
            goto L87
        L84:
            long r11 = defpackage.ep0.b     // Catch: java.lang.Throwable -> L78
            goto L82
        L87:
            defpackage.o24.i(r1, r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L78
        L8a:
            if (r8 == 0) goto L8f
            r2.p()
        L8f:
            return
        L90:
            r0 = move-exception
            r2 = r11
            goto L79
        L93:
            if (r8 == 0) goto L98
            r2.p()
        L98:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv5.c(vg0, bd6):void");
    }

    public static final float d(long j, float f, ud1 ud1Var) {
        float c;
        long b = ee6.b(j);
        if (fe6.a(b, 4294967296L)) {
            if (ud1Var.getFontScale() > 1.05d) {
                c = ee6.c(j) / ee6.c(ud1Var.N(f));
            } else {
                return ud1Var.H0(j);
            }
        } else if (fe6.a(b, 8589934592L)) {
            c = ee6.c(j);
        } else {
            return Float.NaN;
        }
        return c * f;
    }

    public static final void e(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(w65.U(j)), i, i2, 33);
        }
    }

    public static final void f(Spannable spannable, long j, ud1 ud1Var, int i, int i2) {
        long b = ee6.b(j);
        if (fe6.a(b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(io3.h0(ud1Var.H0(j)), false), i, i2, 33);
        } else if (fe6.a(b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(ee6.c(j)), i, i2, 33);
        }
    }

    public static final void g(Spannable spannable, fk3 fk3Var, int i, int i2) {
        if (fk3Var != null) {
            ArrayList arrayList = new ArrayList(zo0.V(fk3Var, 10));
            Iterator it = fk3Var.x.iterator();
            while (it.hasNext()) {
                arrayList.add(((ek3) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kz] */
    public static final Object h(yv0 yv0Var, l11 l11Var, b0 b0Var, du1 du1Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = ge0.a;
        iu1 iu1Var = (iu1) b0Var.y;
        String str = (String) b0Var.z;
        j56 j56Var = iu1Var.B.b;
        dp0.Y(j56Var.a, arrayList);
        List list = j56Var.b;
        list.getClass();
        String str2 = j56Var.c;
        if (str2 != null) {
            str = str2;
        }
        SecureRandom secureRandom = new SecureRandom();
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.getClass();
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        trustManagers.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                arrayList3.add(trustManager);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) yo0.k0(arrayList3);
        x509TrustManager.getClass();
        list.getClass();
        ?? obj = new Object();
        obj.x = secureRandom;
        obj.y = arrayList;
        obj.z = x509TrustManager;
        obj.A = list;
        obj.B = str;
        return i(yv0Var, l11Var, obj, du1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.yv0 r7, defpackage.l11 r8, defpackage.kz r9, defpackage.xz0 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.i56
            if (r0 == 0) goto L14
            r0 = r10
            i56 r0 = (defpackage.i56) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            i56 r0 = new i56
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.y
            int r0 = r6.z
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2c
            yv0 r7 = r6.x
            defpackage.m37.N(r10)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r0 = move-exception
            r8 = r0
            goto L4f
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            r7 = 0
            return r7
        L33:
            defpackage.m37.N(r10)
            r10 = r1
            gu5 r1 = r7.a     // Catch: java.lang.Throwable -> L29
            nc0 r2 = r7.b     // Catch: java.lang.Throwable -> L29
            nc0 r3 = r7.c     // Catch: java.lang.Throwable -> L29
            r6.x = r7     // Catch: java.lang.Throwable -> L29
            r6.z = r10     // Catch: java.lang.Throwable -> L29
            r5 = r8
            r4 = r9
            java.lang.Object r10 = defpackage.rv5.e(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L29
            w11 r8 = defpackage.w11.x
            if (r10 != r8) goto L4c
            return r8
        L4c:
            gu5 r10 = (defpackage.gu5) r10     // Catch: java.lang.Throwable -> L29
            return r10
        L4f:
            nc0 r9 = r7.b
            r9.a(r8)
            nc0 r9 = r7.c
            r9.a(r8)
            gu5 r7 = r7.a
            r7.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv5.i(yv0, l11, kz, xz0):java.lang.Object");
    }

    public static final ai4 j(Object obj, Object obj2) {
        return new ai4(obj, obj2);
    }
}
