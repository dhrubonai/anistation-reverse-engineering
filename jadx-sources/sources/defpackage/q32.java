package defpackage;

import android.net.TrafficStats;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q32 implements r32 {
    public static final Object k = new Object();
    public final n32 a;
    public final o32 b;
    public final l33 c;
    public final qb3 d;
    public final Object e;
    public final ExecutorService f;
    public final zi5 g;
    public String h;
    public final HashSet i;
    public final ArrayList j;

    static {
        new AtomicInteger(1);
    }

    public q32(n32 n32Var, ow4 ow4Var, ExecutorService executorService, zi5 zi5Var) {
        n32Var.a();
        o32 o32Var = new o32(n32Var.a, ow4Var);
        l33 l33Var = new l33(n32Var, (byte) 11);
        qc5 qc5Var = qc5.y;
        if (qc5Var == null) {
            qc5Var = new qc5((byte) 4);
            qc5.y = qc5Var;
        }
        if (fq6.b == null) {
            fq6.b = new fq6(qc5Var);
        }
        qb3 qb3Var = new qb3(new ds0(n32Var, (byte) 2));
        this.e = new Object();
        this.i = new HashSet();
        this.j = new ArrayList();
        this.a = n32Var;
        this.b = o32Var;
        this.c = l33Var;
        this.d = qb3Var;
        this.f = executorService;
        this.g = zi5Var;
    }

    public static q32 c() {
        n32 b = n32.b();
        b.a();
        return (q32) b.d.b(r32.class);
    }

    public final jy a(jy jyVar) {
        int i;
        int responseCode;
        boolean z;
        ny nyVar;
        ny nyVar2;
        o32 o32Var = this.b;
        n32 n32Var = this.a;
        n32Var.a();
        String str = n32Var.c.a;
        String str2 = jyVar.a;
        n32 n32Var2 = this.a;
        n32Var2.a();
        String str3 = n32Var2.c.h;
        String str4 = jyVar.d;
        q03 q03Var = o32Var.c;
        if (q03Var.a()) {
            URL a = o32.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i2 = 0; i2 <= 1; i2 = i + 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c = o32Var.c(a, str);
                try {
                    try {
                        c.setRequestMethod("POST");
                        c.addRequestProperty("Authorization", "FIS_v2 " + str4);
                        c.setDoOutput(true);
                        o32.h(c);
                        responseCode = c.getResponseCode();
                        q03Var.c(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } finally {
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused) {
                    i = i2;
                }
                if (z) {
                    nyVar2 = o32.f(c);
                } else {
                    o32.b(c, null, str, str3);
                    i = i2;
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) == 1) {
                                    nyVar = new ny(0L, 2, null);
                                } else {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                            }
                        } else {
                            throw new s32("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else if (((byte) (0 | 1)) == 1) {
                        nyVar = new ny(0L, 3, null);
                    } else {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    nyVar2 = nyVar;
                }
                int B = h11.B(nyVar2.c);
                if (B != 0) {
                    if (B != 1) {
                        if (B == 2) {
                            synchronized (this) {
                                this.h = null;
                            }
                            iy a2 = jyVar.a();
                            a2.b = 2;
                            return a2.a();
                        }
                        throw new s32("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    iy a3 = jyVar.a();
                    a3.g = "BAD CONFIG";
                    a3.b = 5;
                    return a3.a();
                }
                String str5 = nyVar2.a;
                long j = nyVar2.b;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                iy a4 = jyVar.a();
                a4.c = str5;
                a4.e = j;
                byte b = (byte) (a4.h | 1);
                a4.f = currentTimeMillis;
                a4.h = (byte) (b | 2);
                return a4.a();
            }
            throw new s32("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new s32("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final v78 b() {
        String str;
        n32 n32Var = this.a;
        n32Var.a();
        a34.v(n32Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n32 n32Var2 = this.a;
        n32Var2.a();
        a34.v(n32Var2.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n32 n32Var3 = this.a;
        n32Var3.a();
        a34.v(n32Var3.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n32 n32Var4 = this.a;
        n32Var4.a();
        String str2 = n32Var4.c.b;
        Pattern pattern = fq6.a;
        a34.m("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str2.contains(":"));
        n32 n32Var5 = this.a;
        n32Var5.a();
        a34.m("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", fq6.a.matcher(n32Var5.c.a).matches());
        synchronized (this) {
            str = this.h;
        }
        if (str != null) {
            return hz5.e(str);
        }
        p76 p76Var = new p76();
        ge2 ge2Var = new ge2(p76Var);
        synchronized (this.e) {
            this.j.add(ge2Var);
        }
        v78 v78Var = p76Var.a;
        this.f.execute(new p32(this, (byte) 0));
        return v78Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if ("[DEFAULT]".equals(r1) != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [vz0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(defpackage.jy r6) {
        /*
            r5 = this;
            n32 r0 = r5.a
            r0.a()
            java.lang.String r1 = r0.b
            java.lang.String r2 = "CHIME_ANDROID_SDK"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L1a
            r0.a()
            java.lang.String r0 = "[DEFAULT]"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb3
        L1a:
            int r6 = r6.b
            r0 = 1
            if (r6 != r0) goto Lb3
            qb3 r5 = r5.d
            java.lang.Object r5 = r5.get()
            ku2 r5 = (defpackage.ku2) r5
            a43 r5 = r5.a
            ts4 r6 = defpackage.ku2.d
            r6.getClass()
            e52 r0 = new e52
            r1 = 0
            r2 = 5
            r0.<init>(r5, r6, r1, r2)
            it1 r6 = defpackage.it1.x
            java.lang.Object r0 = defpackage.bx7.K(r6, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L41
            r1 = r0
            goto La8
        L41:
            java.lang.String r0 = "ContentValues"
            ts4 r3 = defpackage.ku2.c
            r3.getClass()
            e52 r4 = new e52
            r4.<init>(r5, r3, r1, r2)
            java.lang.Object r5 = defpackage.bx7.K(r6, r4)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L56
            goto La8
        L56:
            r6 = 8
            byte[] r5 = android.util.Base64.decode(r5, r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "RSA"
            java.security.KeyFactory r2 = java.security.KeyFactory.getInstance(r2)     // Catch: java.lang.Throwable -> L6c
            java.security.spec.X509EncodedKeySpec r3 = new java.security.spec.X509EncodedKeySpec     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L6c
            java.security.PublicKey r5 = r2.generatePublic(r3)     // Catch: java.lang.Throwable -> L6c
            goto L7f
        L6c:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid key stored "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.w(r0, r5)
            r5 = r1
        L7f:
            if (r5 != 0) goto L82
            goto La8
        L82:
            byte[] r5 = r5.getEncoded()
            java.lang.String r2 = "SHA1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> La3
            byte[] r5 = r2.digest(r5)     // Catch: java.security.NoSuchAlgorithmException -> La3
            r2 = 0
            r3 = r5[r2]     // Catch: java.security.NoSuchAlgorithmException -> La3
            r3 = r3 & 15
            int r3 = r3 + 112
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.security.NoSuchAlgorithmException -> La3
            r5[r2] = r3     // Catch: java.security.NoSuchAlgorithmException -> La3
            r3 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r5, r2, r6, r3)     // Catch: java.security.NoSuchAlgorithmException -> La3
            goto La8
        La3:
            java.lang.String r5 = "Unexpected error, device missing required algorithms"
            android.util.Log.w(r0, r5)
        La8:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto Lb2
            java.lang.String r1 = defpackage.vx4.a()
        Lb2:
            return r1
        Lb3:
            java.lang.String r5 = defpackage.vx4.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q32.d(jy):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [vz0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final jy e(jy jyVar) {
        int responseCode;
        boolean z;
        ay e;
        String str = jyVar.a;
        byte b = 5;
        String str2 = 0;
        str2 = 0;
        str2 = 0;
        str2 = 0;
        if (str != null && str.length() == 11) {
            ku2 ku2Var = (ku2) this.d.get();
            ku2Var.getClass();
            String[] strArr = ku2.e;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str3 = strArr[i];
                String str4 = (String) bx7.K(it1.x, new e52(ku2Var.a, new ts4("|T|" + ku2Var.b + "|" + str3), str2, b));
                if (str4 != null && !str4.isEmpty()) {
                    if (str4.startsWith("{")) {
                        try {
                            str2 = new JSONObject(str4).getString("token");
                        } catch (JSONException unused) {
                        }
                    } else {
                        str2 = str4;
                    }
                } else {
                    i++;
                }
            }
        }
        n32 n32Var = this.a;
        n32Var.a();
        String str5 = n32Var.c.a;
        n32Var.a();
        String str6 = n32Var.c.h;
        n32Var.a();
        String str7 = n32Var.c.b;
        o32 o32Var = this.b;
        q03 q03Var = o32Var.c;
        if (q03Var.a()) {
            URL a = o32.a("projects/" + str6 + "/installations");
            for (int i2 = 0; i2 <= 1; i2++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c = o32Var.c(a, str5);
                try {
                    try {
                        c.setRequestMethod("POST");
                        c.setDoOutput(true);
                        if (str2 != 0) {
                            c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        o32.g(c, str, str7);
                        responseCode = c.getResponseCode();
                        q03Var.c(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (z) {
                        e = o32.e(c);
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        o32.b(c, str7, str5, str6);
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                ay ayVar = new ay(null, null, null, null, 2);
                                c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                e = ayVar;
                            }
                            c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new s32("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    }
                    int B = h11.B(e.e);
                    if (B != 0) {
                        if (B == 1) {
                            iy a2 = jyVar.a();
                            a2.g = "BAD CONFIG";
                            a2.b = 5;
                            return a2.a();
                        }
                        throw new s32("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str8 = e.b;
                    String str9 = e.c;
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    ny nyVar = e.d;
                    String str10 = nyVar.a;
                    long j = nyVar.b;
                    iy a3 = jyVar.a();
                    a3.a = str8;
                    a3.b = 4;
                    a3.c = str10;
                    a3.d = str9;
                    a3.e = j;
                    byte b2 = (byte) (a3.h | 1);
                    a3.f = currentTimeMillis;
                    a3.h = (byte) (b2 | 2);
                    return a3.a();
                } catch (Throwable th) {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new s32("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new s32("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void f() {
        synchronized (this.e) {
            try {
                ArrayList arrayList = this.j;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ge2) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(jy jyVar) {
        boolean z;
        boolean z2;
        synchronized (this.e) {
            try {
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    ge2 ge2Var = (ge2) it.next();
                    ge2Var.getClass();
                    int i = jyVar.b;
                    boolean z3 = false;
                    if (i == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (i == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            if (i == 5) {
                                z3 = true;
                            }
                            if (z3) {
                            }
                        }
                    }
                    ge2Var.a.d(jyVar.a);
                    it.remove();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
