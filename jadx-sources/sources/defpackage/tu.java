package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.Spatializer;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tu implements d12 {
    public Object A;
    public boolean x;
    public final Object y;
    public Object z;

    public tu(Context context, Runnable runnable, Boolean bool) {
        AudioManager y;
        boolean z;
        if (context == null) {
            y = null;
        } else {
            y = iv.y(context);
        }
        if (y != null && (bool == null || !bool.booleanValue())) {
            Spatializer b = z3.b(y);
            this.y = b;
            if (z3.a(b) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.x = z;
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            Handler handler = new Handler(myLooper);
            this.z = handler;
            aw5 aw5Var = new aw5(runnable);
            this.A = aw5Var;
            z3.g(b, new uw(handler, (byte) 0), aw5Var);
            return;
        }
        this.y = null;
        this.x = false;
        this.z = null;
        this.A = null;
    }

    public static void b(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / sqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3;
    }

    @Override // defpackage.d12
    public bh6 G(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.A;
        d12 d12Var = (d12) this.y;
        if (i2 != 3 && i2 != 5) {
            this.x = true;
        }
        if (i2 != 3) {
            return d12Var.G(i, i2);
        }
        l26 l26Var = (l26) sparseArray.get(i);
        if (l26Var != null) {
            return l26Var;
        }
        l26 l26Var2 = new l26(d12Var.G(i, i2), (w16) this.z);
        sparseArray.put(i, l26Var2);
        return l26Var2;
    }

    @Override // defpackage.d12
    public void I(hf5 hf5Var) {
        ((d12) this.y).I(hf5Var);
    }

    public void a(boolean z) {
        hh1 hh1Var = (hh1) this.A;
        synchronized (hh1Var.E) {
            try {
                if (!this.x) {
                    if (a34.i(((eh1) this.y).g, this)) {
                        hh1Var.a(this, z);
                    }
                    this.x = true;
                } else {
                    throw new IllegalStateException("editor is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public kq3 c(UUID uuid, vx1 vx1Var) {
        String str;
        String str2 = vx1Var.b;
        if (this.x || TextUtils.isEmpty(str2)) {
            str2 = (String) this.z;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = ce0.f;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (ce0.d.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((HashMap) this.A)) {
                hashMap.putAll((HashMap) this.A);
            }
            return oi4.q(((cn7) this.y).H(), str2, vx1Var.a, hashMap);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        io3.w(uri, "The uri must be set.");
        throw new lq3(new v41(uri, 0L, 1, null, map, 0L, -1L, null, 0), uri, t15.D, 0L, new IllegalStateException("No license URL"));
    }

    public kq3 d(wx1 wx1Var) {
        boolean z;
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), wx1Var.a, "\"}".getBytes(charset)};
        long j = 0;
        for (int i = 0; i < 3; i++) {
            j += bArr[i].length;
        }
        int i2 = (int) j;
        if (j == i2) {
            z = true;
        } else {
            z = false;
        }
        io3.l(j, "the total number of elements (%s) in the arrays must fit in an int", z);
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr3.length;
        }
        q41 H = ((cn7) this.y).H();
        String str = wx1Var.b;
        String cx3Var = cx3.i.toString();
        String valueOf = String.valueOf(i2);
        io3.s("Content-Length", valueOf);
        return oi4.q(H, str, bArr2, t15.j(2, new Object[]{"Content-Type", cx3Var, "Content-Length", valueOf}, null));
    }

    public qj4 e(int i) {
        qj4 qj4Var;
        hh1 hh1Var = (hh1) this.A;
        synchronized (hh1Var.E) {
            if (!this.x) {
                ((boolean[]) this.z)[i] = true;
                Object obj = ((eh1) this.y).d.get(i);
                x97.s(hh1Var.N, (qj4) obj);
                qj4Var = (qj4) obj;
            } else {
                throw new IllegalStateException("editor is closed");
            }
        }
        return qj4Var;
    }

    public void f() {
        if (!this.x) {
            return;
        }
        ((k46) this.A).f(new p0((Object) this, (byte) 5));
        this.x = false;
    }

    public String g() {
        if (!this.x) {
            this.x = true;
            bt7 bt7Var = (bt7) this.A;
            this.z = bt7Var.P().getString((String) this.y, null);
        }
        return (String) this.z;
    }

    public void h(String str) {
        SharedPreferences.Editor edit = ((bt7) this.A).P().edit();
        edit.putString((String) this.y, str);
        edit.apply();
        this.z = str;
    }

    @Override // defpackage.d12
    public void t() {
        SparseArray sparseArray = (SparseArray) this.A;
        ((d12) this.y).t();
        if (this.x) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((l26) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public tu(byte b) {
        switch (b) {
            case 4:
                this.y = new Object();
                this.z = new ArrayList();
                this.A = new ArrayList();
                this.x = true;
                return;
            default:
                this.y = new float[16];
                this.z = new float[16];
                this.A = new wp();
                return;
        }
    }

    public tu(d12 d12Var, w16 w16Var) {
        this.y = d12Var;
        this.z = w16Var;
        this.A = new SparseArray();
    }

    public tu(Context context, Looper looper, Looper looper2, py1 py1Var, f46 f46Var) {
        this.y = context.getApplicationContext();
        this.A = f46Var.a(looper, null);
        this.z = new su(this, f46Var.a(looper2, null), py1Var);
    }

    public tu(bt7 bt7Var, String str) {
        this.A = bt7Var;
        a34.u(str);
        this.y = str;
    }

    public tu(String str, boolean z, cn7 cn7Var) {
        io3.n((z && TextUtils.isEmpty(str)) ? false : true);
        this.y = cn7Var;
        this.z = str;
        this.x = z;
        this.A = new HashMap();
    }

    public tu(qd3 qd3Var, w06 w06Var, ft4 ft4Var) {
        this.y = qd3Var;
        this.z = w06Var;
        this.A = ft4Var;
        this.x = true;
    }

    public tu(hh1 hh1Var, eh1 eh1Var) {
        this.A = hh1Var;
        this.y = eh1Var;
        this.z = new boolean[2];
    }
}
