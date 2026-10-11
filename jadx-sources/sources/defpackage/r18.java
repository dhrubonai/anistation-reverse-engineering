package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r18 implements iz1, jx, k11, or, br3, te2, e21 {
    public final /* synthetic */ byte x;
    public static final r18 y = new r18(0);
    public static final r18 z = new r18(1);
    public static final r18 A = new r18(2);
    public static final r18 B = new r18(3);

    public r18() {
        this.x = (byte) 14;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static Typeface c(String str, s92 s92Var, int i) {
        Typeface create;
        if (i == 0 && a34.i(s92Var, s92.B) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && a34.i(s92Var, s92.E) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        boolean z2 = false;
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        int i2 = s92Var.x;
        if (i == 1) {
            z2 = true;
        }
        return Typeface.create(create, i2, z2);
    }

    public static zd0 g(String str) {
        str.getClass();
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (wc7.o(str.charAt(i2 + 1)) + (wc7.o(str.charAt(i2)) << 4));
            }
            return new zd0(bArr);
        }
        ze0.e("Unexpected hex string: ".concat(str));
        return null;
    }

    public static zd0 i(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(kl0.a);
        bytes.getClass();
        zd0 zd0Var = new zd0(bytes);
        zd0Var.z = str;
        return zd0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pa0] */
    public static qj4 l(String str) {
        str.getClass();
        zd0 zd0Var = c.a;
        ?? obj = new Object();
        obj.A0(str);
        return c.d(obj, false);
    }

    public static qj4 n(File file) {
        String str = qj4.y;
        String file2 = file.toString();
        file2.getClass();
        return l(file2);
    }

    public static uq3 o(JSONObject jSONObject) {
        tq3 tq3Var = new tq3();
        if (jSONObject.has("m3-targetOffsetMs")) {
            tq3Var.a = jSONObject.getLong("m3-targetOffsetMs");
        }
        if (jSONObject.has("m3-minOffsetMs")) {
            tq3Var.b = jSONObject.getLong("m3-minOffsetMs");
        }
        if (jSONObject.has("m3-maxOffsetMs")) {
            tq3Var.c = jSONObject.getLong("m3-maxOffsetMs");
        }
        if (jSONObject.has("m3-minPlaybackSpeed")) {
            tq3Var.d = (float) jSONObject.getDouble("m3-minPlaybackSpeed");
        }
        if (jSONObject.has("m3-maxPlaybackSpeed")) {
            tq3Var.e = (float) jSONObject.getDouble("m3-maxPlaybackSpeed");
        }
        return new uq3(tq3Var);
    }

    public static ar3 p(JSONObject jSONObject, jr3 jr3Var) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("mediaItem");
            nq3 nq3Var = new nq3();
            nq3Var.e = Uri.parse(jSONObject2.getString("uri"));
            String string = jSONObject2.getString("mediaId");
            string.getClass();
            nq3Var.b = string;
            nq3Var.k = jr3Var;
            if (jSONObject2.has("mimeType")) {
                nq3Var.c = jSONObject2.getString("mimeType");
            }
            if (jSONObject2.has("drmConfiguration")) {
                u(jSONObject2.getJSONObject("drmConfiguration"), nq3Var);
            }
            if (jSONObject2.has("m3-liveConfiguration")) {
                nq3Var.l = o(jSONObject2.getJSONObject("m3-liveConfiguration")).a();
            }
            return nq3Var.a();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static JSONObject r(ar3 ar3Var) {
        vq3 vq3Var = ar3Var.b;
        uq3 uq3Var = ar3Var.c;
        vq3Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mediaId", ar3Var.a);
        jSONObject.put("title", ar3Var.d.a);
        vq3 vq3Var2 = ar3Var.b;
        jSONObject.put("uri", vq3Var2.a.toString());
        jSONObject.put("mimeType", vq3Var2.b);
        sq3 sq3Var = vq3Var2.c;
        if (sq3Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uuid", sq3Var.a);
            jSONObject2.put("licenseUri", sq3Var.b);
            jSONObject2.put("requestHeaders", new JSONObject(sq3Var.c));
            jSONObject.put("drmConfiguration", jSONObject2);
        }
        if (!uq3Var.equals(uq3.f)) {
            JSONObject jSONObject3 = new JSONObject();
            long j = uq3Var.a;
            if (j != -9223372036854775807L) {
                jSONObject3.put("m3-targetOffsetMs", j);
            }
            long j2 = uq3Var.b;
            if (j2 != -9223372036854775807L) {
                jSONObject3.put("m3-minOffsetMs", j2);
            }
            long j3 = uq3Var.c;
            if (j3 != -9223372036854775807L) {
                jSONObject3.put("m3-maxOffsetMs", j3);
            }
            float f = uq3Var.d;
            if (f != -3.4028235E38f) {
                jSONObject3.put("m3-minPlaybackSpeed", f);
            }
            float f2 = uq3Var.e;
            if (f2 != -3.4028235E38f) {
                jSONObject3.put("m3-maxPlaybackSpeed", f2);
            }
            jSONObject.put("m3-liveConfiguration", jSONObject3);
        }
        return jSONObject;
    }

    public static JSONObject s(ar3 ar3Var) {
        sq3 sq3Var;
        String str;
        vq3 vq3Var = ar3Var.b;
        if (vq3Var != null && (sq3Var = vq3Var.c) != null) {
            UUID uuid = ce0.e;
            UUID uuid2 = sq3Var.a;
            rw2 rw2Var = sq3Var.c;
            if (uuid.equals(uuid2)) {
                str = "widevine";
            } else if (ce0.f.equals(sq3Var.a)) {
                str = "playready";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("withCredentials", false);
            jSONObject.put("protectionSystem", str);
            Uri uri = sq3Var.b;
            if (uri != null) {
                jSONObject.put("licenseUrl", uri);
            }
            if (!rw2Var.isEmpty()) {
                jSONObject.put("headers", new JSONObject(rw2Var));
            }
            return jSONObject;
        }
        return null;
    }

    public static void u(JSONObject jSONObject, nq3 nq3Var) {
        Uri parse;
        rq3 rq3Var = new rq3(UUID.fromString(jSONObject.getString("uuid")));
        String string = jSONObject.getString("licenseUri");
        if (string == null) {
            parse = null;
        } else {
            parse = Uri.parse(string);
        }
        rq3Var.e = parse;
        JSONObject jSONObject2 = jSONObject.getJSONObject("requestHeaders");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject2.getString(next));
        }
        rq3Var.f = rw2.b(hashMap);
        nq3Var.g = new sq3(rq3Var).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0044, code lost:
    
        if (defpackage.qy3.i(r4) != false) goto L26;
     */
    @Override // defpackage.br3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ur3 a(defpackage.ar3 r24) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r18.a(ar3):ur3");
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, x24] */
    /* JADX WARN: Type inference failed for: r9v5, types: [j2, y24, java.lang.Object, t1] */
    @Override // defpackage.iz1
    public jz1[] d(hz1[] hz1VarArr, z20 z20Var) {
        byte b;
        long j;
        jz1 p6Var;
        o15 g;
        int i;
        long j2;
        double d;
        long j3;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            b = 1;
            if (i3 >= hz1VarArr.length) {
                break;
            }
            hz1 hz1Var = hz1VarArr[i3];
            if (hz1Var != null && hz1Var.b.length > 1) {
                jw2 k = nw2.k();
                k.c(new o6(0L, 0L));
                arrayList.add(k);
            } else {
                arrayList.add(null);
            }
            i3++;
        }
        int length = hz1VarArr.length;
        long[][] jArr = new long[length];
        int i4 = 0;
        while (true) {
            j = -1;
            if (i4 >= hz1VarArr.length) {
                break;
            }
            hz1 hz1Var2 = hz1VarArr[i4];
            if (hz1Var2 == null) {
                jArr[i4] = new long[0];
            } else {
                int[] iArr = hz1Var2.b;
                jArr[i4] = new long[iArr.length];
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    long j4 = hz1Var2.a.d[iArr[i5]].k;
                    long[] jArr2 = jArr[i4];
                    if (j4 == -1) {
                        j4 = 0;
                    }
                    jArr2[i5] = j4;
                }
                Arrays.sort(jArr[i4]);
            }
            i4++;
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i6 = 0; i6 < length; i6++) {
            long[] jArr4 = jArr[i6];
            if (jArr4.length == 0) {
                j3 = 0;
            } else {
                j3 = jArr4[0];
            }
            jArr3[i6] = j3;
        }
        p6.v(arrayList, jArr3);
        io3.t(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(w64.y);
        ?? obj = new Object();
        io3.t(2, "expectedValuesPerKey");
        ?? t1Var = new t1(treeMap);
        t1Var.D = obj;
        int i7 = 0;
        while (i7 < length) {
            long[] jArr5 = jArr[i7];
            if (jArr5.length <= 1) {
                i = i2;
                j2 = j;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                i = i2;
                int i8 = i;
                while (true) {
                    long[] jArr6 = jArr[i7];
                    j2 = j;
                    double d2 = 0.0d;
                    if (i8 >= jArr6.length) {
                        break;
                    }
                    long j5 = jArr6[i8];
                    if (j5 != j2) {
                        d2 = Math.log(j5);
                    }
                    dArr[i8] = d2;
                    i8++;
                    j = j2;
                }
                int i9 = length2 - 1;
                double d3 = dArr[i9] - dArr[i];
                int i10 = i;
                while (i10 < i9) {
                    double d4 = dArr[i10];
                    i10++;
                    double d5 = (d4 + dArr[i10]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d5 - dArr[i]) / d3;
                    }
                    t1Var.o(Double.valueOf(d), Integer.valueOf(i7));
                }
            }
            i7++;
            i2 = i;
            j = j2;
        }
        int i11 = i2;
        Collection collection = t1Var.z;
        if (collection == null) {
            collection = new i2(t1Var, b);
            t1Var.z = collection;
        }
        nw2 o = nw2.o(collection);
        for (int i12 = i11; i12 < o.size(); i12++) {
            int intValue = ((Integer) o.get(i12)).intValue();
            int i13 = iArr2[intValue] + 1;
            iArr2[intValue] = i13;
            jArr3[intValue] = jArr[intValue][i13];
            p6.v(arrayList, jArr3);
        }
        for (int i14 = i11; i14 < hz1VarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr3[i14] = jArr3[i14] * 2;
            }
        }
        p6.v(arrayList, jArr3);
        jw2 k2 = nw2.k();
        for (int i15 = i11; i15 < arrayList.size(); i15++) {
            jw2 jw2Var = (jw2) arrayList.get(i15);
            if (jw2Var == null) {
                g = o15.B;
            } else {
                g = jw2Var.g();
            }
            k2.c(g);
        }
        o15 g2 = k2.g();
        jz1[] jz1VarArr = new jz1[hz1VarArr.length];
        for (int i16 = i11; i16 < hz1VarArr.length; i16++) {
            hz1 hz1Var3 = hz1VarArr[i16];
            if (hz1Var3 != null) {
                int[] iArr3 = hz1Var3.b;
                if (iArr3.length != 0) {
                    int length3 = iArr3.length;
                    yg6 yg6Var = hz1Var3.a;
                    if (length3 == 1) {
                        p6Var = new ij1(yg6Var, new int[]{iArr3[i11]}, null, b);
                    } else {
                        p6Var = new p6(yg6Var, iArr3, z20Var, (nw2) g2.get(i16));
                    }
                    jz1VarArr[i16] = p6Var;
                }
            }
        }
        return jz1VarArr;
    }

    @Override // defpackage.jx
    public void e(x26 x26Var) {
        x26Var.getClass();
        x26Var.v("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        x26Var.q0(contentValues, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Type inference failed for: r8v1, types: [qq3, pq3] */
    @Override // defpackage.br3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ar3 f(defpackage.ur3 r24) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r18.f(ur3):ar3");
    }

    public ml1 j(ok1 ok1Var, Context context) {
        ml1 ml1Var;
        ok1Var.getClass();
        ml1 ml1Var2 = ml1.e;
        if (ml1Var2 == null) {
            synchronized (this) {
                ml1Var = ml1.e;
                if (ml1Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    ml1Var = new ml1(ok1Var, applicationContext);
                    ml1.e = ml1Var;
                }
            }
            return ml1Var;
        }
        return ml1Var2;
    }

    @Override // defpackage.or
    public Object m(wc5 wc5Var, Float f, Float f2, ub2 ub2Var, xs5 xs5Var) {
        Object b = ct5.b(wc5Var, f.floatValue(), n03.a(0.0f, f2.floatValue(), 28), z51.b, ub2Var, xs5Var);
        if (b == w11.x) {
            return b;
        }
        return (il) b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x032b, code lost:
    
        if (defpackage.e83.a(r14, defpackage.e83.N) == false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x021f, code lost:
    
        if (defpackage.e83.a(defpackage.q23.c(r15.getKeyCode()), defpackage.e83.o) != false) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.f83 t(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r18.t(android.view.KeyEvent):f83");
    }

    public String toString() {
        switch (this.x) {
            case 10:
                return "CompositionErrorContext";
            case 29:
                int hashCode = hashCode();
                t80.z(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return qx1.n("CreationExtras.Key@", num, "<", z05.a(ga5.class).f(), ">");
            default:
                return super.toString();
        }
    }

    public r18(byte[] bArr, wj2[] wj2VarArr, LinkedHashSet linkedHashSet) {
        this.x = (byte) 9;
        wj2VarArr.getClass();
    }

    public /* synthetic */ r18(byte b) {
        this.x = b;
    }

    @Override // defpackage.e21
    public Object b(d21 d21Var) {
        throw d21Var;
    }
}
