package defpackage;

import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Insets;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.WindowInsetsAnimation;
import com.anistation.download.service.InternalDownloadService;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class l33 implements a23, u06, o41, sg0, f60, nw4, ys, zd4 {
    public final /* synthetic */ byte x;
    public Object y;
    public Object z;

    public l33(byte b) {
        this.x = b;
        switch (b) {
            case 8:
                this.y = new p44();
                this.z = new p44();
                return;
            case 22:
                this.y = new y95((byte) 4);
                this.z = new hm3(16);
                return;
            case 24:
                this.y = new z44(new Reference[16], 0);
                this.z = new ReferenceQueue();
                return;
            default:
                tk6 tk6Var = db.l;
                Float valueOf = Float.valueOf(0.0f);
                this.z = new ml(tk6Var, valueOf, (rl) tk6Var.a.invoke(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                return;
        }
    }

    @Override // defpackage.o41
    public q41 H() {
        return new kd4((jd4) this.z, (rt3) this.y);
    }

    @Override // defpackage.u06
    public boolean N() {
        nk4 nk4Var;
        fb3 j = j();
        if (j != null && (nk4Var = j.f) != null) {
            return nk4Var.c();
        }
        return true;
    }

    @Override // defpackage.f60
    public e60 a(c12 c12Var, long j) {
        long position = c12Var.getPosition();
        int min = (int) Math.min(20000L, c12Var.p() - position);
        zi4 zi4Var = (zi4) this.z;
        zi4Var.K(min);
        c12Var.A(zi4Var.a, 0, min);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (zi4Var.a() >= 4) {
            if (b42.b(zi4Var.b, zi4Var.a) != 442) {
                zi4Var.O(1);
            } else {
                zi4Var.O(4);
                long c = rw4.c(zi4Var);
                if (c != -9223372036854775807L) {
                    long b = ((tf6) this.y).b(c);
                    if (b > j) {
                        if (j2 == -9223372036854775807L) {
                            return new e60(b, -1, position);
                        }
                        return new e60(-9223372036854775807L, 0, position + i2);
                    }
                    long j3 = 100000 + b;
                    i2 = zi4Var.b;
                    if (j3 > j) {
                        return new e60(-9223372036854775807L, 0, position + i2);
                    }
                    j2 = b;
                }
                int i3 = zi4Var.c;
                if (zi4Var.a() < 10) {
                    zi4Var.N(i3);
                } else {
                    zi4Var.O(9);
                    int A = zi4Var.A() & 7;
                    if (zi4Var.a() < A) {
                        zi4Var.N(i3);
                    } else {
                        zi4Var.O(A);
                        if (zi4Var.a() < 4) {
                            zi4Var.N(i3);
                        } else {
                            if (b42.b(zi4Var.b, zi4Var.a) == 443) {
                                zi4Var.O(4);
                                int H = zi4Var.H();
                                if (zi4Var.a() < H) {
                                    zi4Var.N(i3);
                                } else {
                                    zi4Var.O(H);
                                }
                            }
                            while (true) {
                                if (zi4Var.a() < 4) {
                                    break;
                                }
                                int b2 = b42.b(zi4Var.b, zi4Var.a);
                                if (b2 == 442 || b2 == 441 || (b2 >>> 8) != 1) {
                                    break;
                                }
                                zi4Var.O(4);
                                if (zi4Var.a() < 2) {
                                    zi4Var.N(i3);
                                    break;
                                }
                                zi4Var.N(Math.min(zi4Var.c, zi4Var.b + zi4Var.H()));
                            }
                        }
                    }
                }
                i = zi4Var.b;
            }
        }
        if (j2 != -9223372036854775807L) {
            return new e60(j2, -2, position + i);
        }
        return e60.d;
    }

    @Override // defpackage.u06
    public v06 apply() {
        mb3 mb3Var = (mb3) this.y;
        fb3 j = j();
        if (j != null) {
            mb3Var.b(j, false);
        }
        return mb3Var.e(this.z);
    }

    @Override // defpackage.f60
    public void b() {
        zi4 zi4Var = (zi4) this.z;
        byte[] bArr = eq6.b;
        zi4Var.L(bArr.length, bArr);
    }

    @Override // defpackage.a23
    public int c(char[] cArr, int i, int i2) {
        int i3;
        int c;
        cv5 cv5Var = (cv5) this.z;
        Character ch = (Character) this.y;
        if (ch != null) {
            cArr[i] = ch.charValue();
            this.y = null;
            i3 = 1;
        } else {
            i3 = 0;
        }
        while (i3 < i2 && !cv5Var.D()) {
            if (cv5Var instanceof oa0) {
                c = gv5.c((oa0) cv5Var);
            } else {
                cv5Var.m(1L);
                byte a = cv5Var.c().a(0L);
                if ((a & 224) == 192) {
                    cv5Var.m(2L);
                } else if ((a & 240) == 224) {
                    cv5Var.m(3L);
                } else if ((a & 248) == 240) {
                    cv5Var.m(4L);
                }
                c = gv5.c(cv5Var.c());
            }
            if (c <= 65535) {
                cArr[i + i3] = (char) c;
                i3++;
            } else {
                char c2 = (char) ((c >>> 10) + 55232);
                char c3 = (char) ((c & 1023) + 56320);
                cArr[i + i3] = c2;
                int i4 = i3 + 1;
                if (i4 < i2) {
                    cArr[i4 + i] = c3;
                    i3 += 2;
                } else {
                    this.y = Character.valueOf(c3);
                    i3 = i4;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    @Override // defpackage.u06, defpackage.sg0
    public void cancel() {
        nk4 nk4Var;
        switch (this.x) {
            case 1:
                fb3 j = j();
                if (j != null) {
                    nk4Var = j.f;
                } else {
                    nk4Var = null;
                }
                if (nk4Var != null) {
                    ((mb3) this.y).g(this.z);
                    return;
                }
                return;
            default:
                if (!((nu) this.z).compareAndSet(1, 1)) {
                    ((mi) this.y).invoke();
                    return;
                }
                return;
        }
    }

    public boolean d(i77 i77Var) {
        boolean containsKey;
        synchronized (this.z) {
            containsKey = ((rl0) this.y).a.containsKey(i77Var);
        }
        return containsKey;
    }

    @Override // defpackage.u06
    public boolean e(fs0 fs0Var) {
        nk4 nk4Var;
        fb3 j = j();
        ub2 ub2Var = null;
        if (j != null) {
            nk4Var = j.f;
        } else {
            nk4Var = null;
        }
        if (nk4Var != null && !nk4Var.c()) {
            ft5 b = et5.b();
            if (b != null) {
                ub2Var = b.e();
            }
            ft5 e = et5.e(b);
            try {
                return nk4Var.e(fs0Var);
            } catch (Throwable th) {
                try {
                    j.getClass();
                    throw th;
                } finally {
                    et5.k(b, e, ub2Var);
                }
            }
        }
        return true;
    }

    public void f() {
        ub2 ub2Var;
        ti4 ti4Var = (ti4) this.z;
        ft5 b = et5.b();
        if (b != null) {
            ub2Var = b.e();
        } else {
            ub2Var = null;
        }
        ft5 e = et5.e(b);
        try {
            de6 de6Var = (de6) ti4Var.getValue();
            if (de6Var != null) {
                hn6 hn6Var = (hn6) this.y;
                zt5 zt5Var = hn6Var.b;
                zt5 zt5Var2 = hn6Var.c;
                zt5Var2.clear();
                while (zt5Var2.size() + zt5Var.size() > hn6Var.a - 1) {
                    if (!zt5Var.isEmpty()) {
                        zt5Var.remove(0);
                    } else {
                        p65.h("List is empty.");
                        return;
                    }
                }
                zt5Var.add(de6Var);
            }
            ti4Var.setValue(null);
        } finally {
            et5.k(b, e, ub2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory g(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l33.g(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [sb3] */
    @Override // defpackage.nw4
    public Object get() {
        ti1 ti1Var;
        xb5 xb5Var = new xb5((byte) 8);
        z95 z95Var = new z95((byte) 7);
        Object obj = ((eo3) this.y).get();
        nw4 nw4Var = (af2) this.z;
        if (nw4Var instanceof sb3) {
            ti1Var = (sb3) nw4Var;
        } else {
            ti1Var = new ti1(nw4Var);
        }
        return new l85(xb5Var, z95Var, yx.f, (bc5) obj, ti1Var);
    }

    public File h() {
        if (((File) this.y) == null) {
            synchronized (this) {
                try {
                    if (((File) this.y) == null) {
                        String str = "PersistedInstallation." + ((n32) this.z).c() + ".json";
                        n32 n32Var = (n32) this.z;
                        n32Var.a();
                        File file = new File(n32Var.a.getNoBackupFilesDir(), str);
                        this.y = file;
                        if (file.exists()) {
                            return (File) this.y;
                        }
                        n32 n32Var2 = (n32) this.z;
                        n32Var2.a();
                        File file2 = new File(n32Var2.a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.y)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.y;
    }

    @Override // defpackage.ys
    public at i(qr1 qr1Var, Looper looper, zs zsVar, ex1 ex1Var) {
        if (qr1.d(qr1Var.a)) {
            return new oi5((qi5) this.z, qr1Var.d);
        }
        return ((ys) this.y).i(qr1Var, looper, zsVar, ex1Var);
    }

    public fb3 j() {
        mb3 mb3Var = (mb3) this.y;
        za3 za3Var = (za3) mb3Var.G.g(this.z);
        if (za3Var != null) {
            return (fb3) mb3Var.C.g(za3Var);
        }
        return null;
    }

    public void k(jy jyVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", jyVar.a);
            jSONObject.put("Status", h11.B(jyVar.b));
            jSONObject.put("AuthToken", jyVar.c);
            jSONObject.put("RefreshToken", jyVar.d);
            jSONObject.put("TokenCreationEpochInSecs", jyVar.f);
            jSONObject.put("ExpiresInSecs", jyVar.e);
            jSONObject.put("FisError", jyVar.g);
            n32 n32Var = (n32) this.z;
            n32Var.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", n32Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(h())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public jy l() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(h());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = jy.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i2 = h11.C(5)[optInt];
        if (i2 != 0) {
            byte b2 = (byte) (((byte) (b | 2)) | 1);
            if (b2 == 3 && i2 != 0) {
                return new jy(optString, i2, optString2, optString3, optLong2, optLong, optString4);
            }
            StringBuilder sb = new StringBuilder();
            if (i2 == 0) {
                sb.append(" registrationStatus");
            }
            if ((b2 & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((b2 & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            ov3.p(sb, "Missing required properties:");
            return null;
        }
        qi2.m("Null registrationStatus");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(defpackage.de6 r29) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l33.m(de6):void");
    }

    public ix5 n(i77 i77Var) {
        ix5 c;
        i77Var.getClass();
        synchronized (this.z) {
            c = ((rl0) this.y).c(i77Var);
        }
        return c;
    }

    public void o(Map map) {
        rt3 rt3Var = (rt3) this.y;
        synchronized (rt3Var) {
            rt3Var.z = null;
            ((HashMap) rt3Var.y).clear();
            ((HashMap) rt3Var.y).putAll(map);
        }
    }

    @Override // defpackage.zd4
    public void onComplete(Task task) {
        ((Map) ((y23) this.z).z).remove((p76) this.y);
    }

    public void p(ix5 ix5Var, l87 l87Var) {
        ix5Var.getClass();
        q76 q76Var = (q76) this.z;
        ze zeVar = new ze((Object) this, (Object) ix5Var, (Object) l87Var, (byte) 28);
        q76Var.getClass();
        ((o77) q76Var).a.execute(zeVar);
    }

    public void q() {
        bx5 bx5Var = (bx5) this.y;
        if (bx5Var != null) {
            bx5Var.l(null);
        }
        this.z = new ml(db.l, Float.valueOf(0.0f), null, 60);
    }

    public void r(ix5 ix5Var, int i) {
        ix5Var.getClass();
        q76 q76Var = (q76) this.z;
        qy5 qy5Var = new qy5((pu4) this.y, ix5Var, false, i);
        q76Var.getClass();
        ((o77) q76Var).a.execute(qy5Var);
    }

    public ix5 s(i77 i77Var) {
        ix5 e;
        synchronized (this.z) {
            e = ((rl0) this.y).e(i77Var);
        }
        return e;
    }

    public void t(float f, ud1 ud1Var, v11 v11Var) {
        ub2 ub2Var;
        if (f <= ud1Var.g0(1.0f)) {
            return;
        }
        ft5 b = et5.b();
        vz0 vz0Var = null;
        if (b != null) {
            ub2Var = b.e();
        } else {
            ub2Var = null;
        }
        ft5 e = et5.e(b);
        try {
            float floatValue = ((Number) ((ml) this.z).y.getValue()).floatValue();
            bx5 bx5Var = (bx5) this.y;
            if (bx5Var != null) {
                bx5Var.l(null);
            }
            ml mlVar = (ml) this.z;
            if (mlVar.C) {
                this.z = n03.m(mlVar, floatValue - f, 0.0f, 30);
            } else {
                this.z = new ml(db.l, Float.valueOf(-f), null, 60);
            }
            this.y = tl7.z(v11Var, null, null, new hu1(this, vz0Var, (byte) 14), 3);
            et5.k(b, e, ub2Var);
        } catch (Throwable th) {
            et5.k(b, e, ub2Var);
            throw th;
        }
    }

    public String toString() {
        switch (this.x) {
            case 25:
                return "Bounds{lower=" + ((yz2) this.y) + " upper=" + ((yz2) this.z) + "}";
            default:
                return super.toString();
        }
    }

    public void u(k14 k14Var) {
        p44 p44Var = (p44) this.y;
        Object g = ((p44) this.z).g(k14Var);
        if (g != null) {
            byte b = 4;
            if (g instanceof f44) {
                f44 f44Var = (f44) g;
                Object[] objArr = f44Var.a;
                int i = f44Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj = objArr[i2];
                    obj.getClass();
                    v24.c(p44Var, (i14) obj, new pz3(k14Var, b));
                }
                return;
            }
            v24.c(p44Var, (i14) g, new pz3(k14Var, b));
        }
    }

    public void v(hv6 hv6Var) {
        Handler handler = (Handler) this.y;
        if (handler != null) {
            handler.post(new sp5(this, hv6Var, (byte) 12));
        }
    }

    public /* synthetic */ l33(byte b, Object obj, boolean z) {
        this.x = b;
        this.y = obj;
    }

    public /* synthetic */ l33(byte b, boolean z) {
        this.x = b;
    }

    public /* synthetic */ l33(Object obj, byte b) {
        this.x = b;
        this.z = obj;
    }

    public /* synthetic */ l33(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    public l33(y23 y23Var, p76 p76Var) {
        this.x = (byte) 29;
        this.y = p76Var;
        Objects.requireNonNull(y23Var);
        this.z = y23Var;
    }

    public l33(mi miVar) {
        this.x = (byte) 10;
        this.y = miVar;
        this.z = new AtomicInteger(0);
    }

    public l33(de6 de6Var, hn6 hn6Var) {
        this.x = (byte) 21;
        this.y = hn6Var;
        this.z = xt5.g(de6Var);
    }

    public /* synthetic */ l33(byte b, Object obj, Object obj2, boolean z) {
        this.x = b;
        this.z = obj;
        this.y = obj2;
    }

    public l33(pu4 pu4Var, q76 q76Var) {
        this.x = (byte) 26;
        pu4Var.getClass();
        q76Var.getClass();
        this.y = pu4Var;
        this.z = q76Var;
    }

    public l33(tf6 tf6Var) {
        this.x = (byte) 14;
        this.y = tf6Var;
        this.z = new zi4();
    }

    public l33(InternalDownloadService internalDownloadService) {
        this.x = (byte) 12;
        Context applicationContext = internalDownloadService.getApplicationContext();
        this.y = new ComponentName(applicationContext, (Class<?>) ym4.class);
        JobScheduler jobScheduler = (JobScheduler) applicationContext.getSystemService("jobscheduler");
        jobScheduler.getClass();
        this.z = jobScheduler;
    }

    public l33(rl0 rl0Var) {
        this.x = (byte) 20;
        this.y = rl0Var;
        this.z = new Object();
    }

    public l33(Context context) {
        this.x = (byte) 4;
        this.z = null;
        this.y = context;
    }

    public l33(jd4 jd4Var) {
        this.x = (byte) 9;
        this.z = jd4Var;
        this.y = new rt3((byte) 27);
    }

    public l33(Handler handler, lt6 lt6Var) {
        this.x = (byte) 23;
        if (lt6Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.y = handler;
        this.z = lt6Var;
    }

    public l33(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.x = (byte) 25;
        lowerBound = bounds.getLowerBound();
        this.y = yz2.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.z = yz2.c(upperBound);
    }

    public l33(o15 o15Var, int[] iArr) {
        this.x = (byte) 7;
        this.y = nw2.o(o15Var);
        this.z = iArr;
    }
}
