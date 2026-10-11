package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Parcel;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.fid.Constants;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i75 implements tf0, xr4, w25, ti5, xc2, b23 {
    public static final i75 B;
    public static final sd2 C;
    public static i75 z;
    public final /* synthetic */ byte x;
    public Object y;
    public static final j75 A = new j75(0, 0, 0, false, false);
    public static final m98 D = new Object();

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, m98] */
    static {
        byte b = 1;
        B = new i75(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, b);
        C = new sd2(b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, wm3] */
    public i75(byte b) {
        ay3 ay3Var;
        this.x = b;
        boolean z2 = false;
        Object[] objArr = 0;
        switch (b) {
            case 13:
                this.y = new LinkedHashMap();
                return;
            case 21:
                this.y = new qb2(5, 1.0f, z2, objArr == true ? 1 : 0);
                return;
            default:
                ew4 ew4Var = ew4.c;
                try {
                    ay3Var = (ay3) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (Exception unused) {
                    ay3Var = C;
                }
                ay3[] ay3VarArr = {sd2.b, ay3Var};
                ?? obj = new Object();
                obj.a = ay3VarArr;
                Charset charset = y13.a;
                this.y = obj;
                return;
        }
    }

    public static synchronized i75 n() {
        i75 i75Var;
        synchronized (i75.class) {
            i75Var = z;
            if (i75Var == null) {
                i75Var = new i75((byte) 0, false);
                z = i75Var;
            }
        }
        return i75Var;
    }

    public static void x(String str, l98 l98Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(l98Var.b / 1000000)));
        sb.append(": logging error [");
        z98 z98Var = l98Var.d;
        if (z98Var != null) {
            ov5.m(1, z98Var, sb);
            sb.append("]: ");
            sb.append(str);
            System.err.println(sb);
            System.err.flush();
            return;
        }
        ze0.m("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.xr4
    public long b(g13 g13Var, long j, ia3 ia3Var, long j2) {
        boolean z2;
        long j3 = ((c13) ((sb2) this.y).invoke()).a;
        int i = g13Var.a + ((int) (j3 >> 32));
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j >> 32);
        if (ia3Var == ia3.x) {
            z2 = true;
        } else {
            z2 = false;
        }
        int n = bb4.n(i, i2, i3, z2);
        return (bb4.n(g13Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (n << 32);
    }

    @Override // defpackage.w25
    public w30[] c() {
        w30[] w30VarArr = (w30[]) this.y;
        w30[] w30VarArr2 = new w30[w30VarArr.length];
        for (int i = 0; i < w30VarArr.length; i++) {
            w30 w30Var = w30VarArr[i];
            w30Var.getClass();
            w30VarArr2[i] = w30Var;
        }
        return w30VarArr2;
    }

    public void d(StringBuilder sb, Iterator it) {
        tv tvVar = (tv) this.y;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(tv.e(entry.getKey()));
            sb.append("=");
            sb.append(tv.e(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) tvVar.x);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(tv.e(entry2.getKey()));
                sb.append("=");
                sb.append(tv.e(entry2.getValue()));
            }
        }
    }

    @Override // defpackage.b23
    public void e(char c) {
        gv5.j((qq5) this.y, c);
    }

    public e41 f() {
        e41 e41Var = new e41((LinkedHashMap) this.y);
        a34.t0(e41Var);
        return e41Var;
    }

    @Override // defpackage.ti5
    public void g(ui5 ui5Var) {
        sl2 sl2Var = (sl2) this.y;
        sl2Var.N.g(sl2Var);
    }

    @Override // defpackage.b23
    public void h(String str) {
        str.getClass();
        qq5 qq5Var = (qq5) this.y;
        gv5.j(qq5Var, 34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            String[] strArr = jz5.a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                gv5.k(qq5Var, str, i, i2);
                String str2 = strArr[charAt];
                str2.getClass();
                gv5.k(qq5Var, str2, 0, str2.length());
                i = i2 + 1;
            }
        }
        gv5.k(qq5Var, str, i, str.length());
        gv5.j(qq5Var, 34);
    }

    @Override // defpackage.b23
    public void i(String str) {
        str.getClass();
        gv5.k((qq5) this.y, str, 0, str.length());
    }

    public void j(byte b) {
        ((Parcel) this.y).writeByte(b);
    }

    public void k(float f) {
        ((Parcel) this.y).writeFloat(f);
    }

    public void l(long j) {
        long b = ee6.b(j);
        byte b2 = 0;
        if (!fe6.a(b, 0L)) {
            if (fe6.a(b, 4294967296L)) {
                b2 = 1;
            } else if (fe6.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        j(b2);
        if (!fe6.a(ee6.b(j), 0L)) {
            k(ee6.c(j));
        }
    }

    public px5 m() {
        ks1 a = ks1.a();
        if (a.c() == 1) {
            return new dw2(true);
        }
        ti4 g = xt5.g(Boolean.FALSE);
        a.h(new h91(g, this));
        return g;
    }

    public KeyListener o(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            if (keyListener instanceof us1) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new us1(keyListener);
        }
        return keyListener;
    }

    @Override // defpackage.tf0
    public void onFailure(nf0 nf0Var, IOException iOException) {
        ((qg0) this.y).resumeWith(new y45(iOException));
    }

    @Override // defpackage.tf0
    public void onResponse(nf0 nf0Var, p45 p45Var) {
        ((qg0) this.y).h(p45Var, dg0.y);
    }

    @Override // defpackage.xc2
    public void onSuccess(Object obj) {
        ea2 ea2Var;
        boolean hasGainmap;
        Bitmap bitmap = (Bitmap) obj;
        ((ou2) this.y).i = (byte) 50;
        da2 da2Var = new da2();
        da2Var.w = bitmap.getHeight();
        da2Var.v = bitmap.getWidth();
        da2Var.o = qy3.n("image/raw");
        da2Var.G = hp0.i;
        ea2 ea2Var2 = new ea2(da2Var);
        try {
            if (((ou2) this.y).e && Build.VERSION.SDK_INT >= 34) {
                hasGainmap = bitmap.hasGainmap();
                if (hasGainmap) {
                    da2 a = ea2Var2.a();
                    a.o = qy3.n("image/jpeg_r");
                    ea2Var = new ea2(a);
                    ((ou2) this.y).d.g(2, ea2Var2);
                    ((ou2) this.y).f.submit(new ze((Object) this, (Object) bitmap, (Object) ea2Var, (byte) 11));
                    return;
                }
            }
            ((ou2) this.y).d.g(2, ea2Var2);
            ((ou2) this.y).f.submit(new ze((Object) this, (Object) bitmap, (Object) ea2Var, (byte) 11));
            return;
        } catch (RuntimeException e) {
            ((ou2) this.y).d.b(oz1.a(e, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT));
            return;
        }
        ea2Var = ea2Var2;
    }

    public long p() {
        ld1 ld1Var = (ld1) this.y;
        long j = ((l65) ld1Var.Q.y).b;
        if (j != 16) {
            return j;
        }
        g65 g65Var = (g65) t80.C(ld1Var, j65.a);
        if (g65Var != null) {
            long j2 = g65Var.a;
            if (j2 != 16) {
                return j2;
            }
        }
        return ((ep0) t80.C(ld1Var, ey0.a)).a;
    }

    public void q() {
        sl2 sl2Var = (sl2) this.y;
        int i = sl2Var.O - 1;
        sl2Var.O = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (tm2 tm2Var : sl2Var.Q) {
            tm2Var.w();
            i2 += tm2Var.f0.a;
        }
        yg6[] yg6VarArr = new yg6[i2];
        int i3 = 0;
        for (tm2 tm2Var2 : sl2Var.Q) {
            tm2Var2.w();
            int i4 = tm2Var2.f0.a;
            int i5 = 0;
            while (i5 < i4) {
                tm2Var2.w();
                yg6VarArr[i3] = tm2Var2.f0.a(i5);
                i5++;
                i3++;
            }
        }
        sl2Var.P = new zg6(yg6VarArr);
        sl2Var.N.a(sl2Var);
    }

    public void r(Object obj, String str) {
        Object[] objArr;
        str.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.y;
        if (obj == null) {
            obj = null;
        } else {
            im0 a = z05.a(obj.getClass());
            if (!a.equals(z05.a(Boolean.TYPE)) && !a.equals(z05.a(Byte.TYPE)) && !a.equals(z05.a(Integer.TYPE)) && !a.equals(z05.a(Long.TYPE)) && !a.equals(z05.a(Float.TYPE)) && !a.equals(z05.a(Double.TYPE)) && !a.equals(z05.a(String.class)) && !a.equals(z05.a(Boolean[].class)) && !a.equals(z05.a(Byte[].class)) && !a.equals(z05.a(Integer[].class)) && !a.equals(z05.a(Long[].class)) && !a.equals(z05.a(Float[].class)) && !a.equals(z05.a(Double[].class)) && !a.equals(z05.a(String[].class))) {
                int i = 0;
                if (a.equals(z05.a(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = q51.a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i < length) {
                        objArr[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                } else if (a.equals(z05.a(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = q51.a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i < length2) {
                        objArr[i] = Byte.valueOf(bArr[i]);
                        i++;
                    }
                } else if (a.equals(z05.a(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = q51.a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i < length3) {
                        objArr[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                } else if (a.equals(z05.a(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = q51.a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i < length4) {
                        objArr[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                } else if (a.equals(z05.a(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = q51.a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i < length5) {
                        objArr[i] = Float.valueOf(fArr[i]);
                        i++;
                    }
                } else if (a.equals(z05.a(double[].class))) {
                    double[] dArr = (double[]) obj;
                    String str7 = q51.a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i < length6) {
                        objArr[i] = Double.valueOf(dArr[i]);
                        i++;
                    }
                } else {
                    throw new IllegalArgumentException("Key " + str + " has invalid type " + a);
                }
                obj = objArr;
            }
        }
        linkedHashMap.put(str, obj);
    }

    @Override // defpackage.w25
    public void release() {
        boolean z2;
        for (w30 w30Var : (w30[]) this.y) {
            if (w30Var.E == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            io3.B(z2);
            w30Var.s();
        }
    }

    public void s(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            r(entry.getValue(), (String) entry.getKey());
        }
    }

    @Override // defpackage.w25
    public int size() {
        return ((w30[]) this.y).length;
    }

    @Override // defpackage.xc2
    public void t(Throwable th) {
        ((ou2) this.y).d.b(oz1.a(th, 2000));
    }

    public String toString() {
        switch (this.x) {
            case 1:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, u05] */
    public ArrayList u(int i) {
        ub2 ub2Var;
        mc3 mc3Var;
        ArrayList arrayList = new ArrayList();
        wc3 wc3Var = (wc3) this.y;
        ft5 b = et5.b();
        if (b != null) {
            ub2Var = b.e();
        } else {
            ub2Var = null;
        }
        ft5 e = et5.e(b);
        try {
            if (wc3Var.b) {
                mc3Var = wc3Var.c;
            } else {
                mc3Var = (mc3) wc3Var.e.getValue();
            }
            mc3 mc3Var2 = mc3Var;
            if (mc3Var2 != null) {
                ?? obj = new Object();
                obj.x = 1;
                List list = (List) mc3Var2.k.invoke(Integer.valueOf(i));
                int size = list.size();
                int i2 = 0;
                u05 u05Var = obj;
                while (i2 < size) {
                    ai4 ai4Var = (ai4) list.get(i2);
                    be3 be3Var = wc3Var.o;
                    int intValue = ((Number) ai4Var.x).intValue();
                    long j = ((rx0) ai4Var.y).a;
                    y23 y23Var = wc3.w;
                    u05 u05Var2 = u05Var;
                    arrayList.add(be3Var.a(intValue, j, false, new gj((ArrayList) null, u05Var2, list, i, mc3Var2)));
                    i2++;
                    u05Var = u05Var2;
                }
            }
            et5.k(b, e, ub2Var);
            return arrayList;
        } catch (Throwable th) {
            et5.k(b, e, ub2Var);
            throw th;
        }
    }

    public void v(boolean z2) {
        ct1 ct1Var = (ct1) ((pz2) ((i75) this.y).y).z;
        if (ct1Var.z != z2) {
            if (ct1Var.y != null) {
                ks1 a = ks1.a();
                bt1 bt1Var = ct1Var.y;
                a.getClass();
                bb4.r(bt1Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(bt1Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            ct1Var.z = z2;
            if (z2) {
                ct1.a(ct1Var.x, ks1.a().c());
            }
        }
    }

    public void w(int i, Object obj, zb5 zb5Var) {
        to0 to0Var = (to0) this.y;
        to0Var.B(i, 3);
        zb5Var.g((h2) obj, to0Var.a);
        to0Var.B(i, 4);
    }

    @Override // defpackage.b23
    public void writeLong(long j) {
        qq5 qq5Var = (qq5) this.y;
        byte[] bArr = rq5.a;
        if (j == 0) {
            ((oa0) qq5Var).l0((byte) 48);
            return;
        }
        int i = 0;
        int i2 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                gv5.k(qq5Var, "-9223372036854775808", 0, 20);
                return;
            }
            i = 1;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (i != 0) {
            i2++;
        }
        oa0 oa0Var = (oa0) qq5Var;
        yf5 T = oa0Var.T(i2);
        byte[] bArr2 = T.a;
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                bArr2[T.c + i3] = rq5.a[(byte) (j % 10)];
                j /= 10;
                if (i3 == i) {
                    break;
                } else {
                    i3--;
                }
            }
        }
        if (i != 0) {
            bArr2[T.c] = 45;
        }
        T.c += i2;
        oa0Var.z += i2;
    }

    public /* synthetic */ i75(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    public i75(to0 to0Var) {
        this.x = (byte) 11;
        Charset charset = y13.a;
        this.y = to0Var;
        to0Var.a = this;
    }

    public i75(boolean z2) {
        this.x = (byte) 5;
        this.y = new AtomicBoolean(z2);
    }

    public i75(rp rpVar, byte b) {
        this.x = b;
        switch (b) {
            case 19:
                this.y = new pz2(rpVar);
                return;
            default:
                this.y = new i75(rpVar, (byte) 19);
                return;
        }
    }

    public i75(w30[] w30VarArr) {
        this.x = (byte) 17;
        this.y = (w30[]) Arrays.copyOf(w30VarArr, w30VarArr.length);
        for (int i = 0; i < w30VarArr.length; i++) {
            w30 w30Var = ((w30[]) this.y)[i];
            cp4 cp4Var = cp4.c;
            w30Var.B = i;
            w30Var.C = cp4Var;
            w30Var.D = f46.a;
        }
    }

    public /* synthetic */ i75(byte b, boolean z2) {
        this.x = b;
    }
}
