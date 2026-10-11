package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.util.Pair;
import com.anistation.android.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class st3 implements cf5, m95, o41 {
    public static int A;
    public static final q18 B = new q18((byte) 15);
    public static volatile st3 C;
    public Object x;
    public Object y;
    public Object z;

    public st3(byte b) {
        byte b2 = 4;
        switch (b) {
            case 3:
                this.x = new hm3(16);
                long[] jArr = cb5.a;
                this.y = new p44();
                this.z = new y95(b2);
                return;
            case 13:
                this.x = new Object();
                return;
            case 14:
                this.x = new af2((byte) 18);
                this.y = new af2((byte) 18);
                this.z = new af2((byte) 18);
                return;
            case 15:
                this.z = lj1.p;
                return;
            case 27:
                this.x = null;
                return;
            default:
                this.z = new y95(b2);
                return;
        }
    }

    public static Bundle K(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        l(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static e81 j(sq3 sq3Var) {
        String uri;
        cn7 cn7Var = new cn7((byte) 15);
        Uri uri2 = sq3Var.b;
        byte[] bArr = null;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        tu tuVar = new tu(uri, sq3Var.f, cn7Var);
        ho6 it = sq3Var.c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) tuVar.A)) {
                ((HashMap) tuVar.A).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        int i = ce0.a;
        q18 q18Var = new q18((byte) 13);
        UUID uuid = sq3Var.a;
        uuid.getClass();
        boolean z = sq3Var.d;
        boolean z2 = sq3Var.e;
        int[] L = jf7.L(sq3Var.g);
        for (int i2 : L) {
            boolean z3 = true;
            if (i2 != 2 && i2 != 1) {
                z3 = false;
            }
            io3.n(z3);
        }
        e81 e81Var = new e81(uuid, tuVar, hashMap, z, (int[]) L.clone(), z2, q18Var);
        byte[] bArr2 = sq3Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        io3.B(e81Var.m.isEmpty());
        e81Var.v = bArr;
        return e81Var;
    }

    public static void l(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(st3.class.getClassLoader());
        }
    }

    public boolean A() {
        if (((px5) this.x).getValue() == this.z) {
            st3 st3Var = (st3) this.y;
            if (st3Var == null || !st3Var.A()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public String B() {
        if (u()) {
            String str = (String) this.z;
            this.z = null;
            return str;
        }
        qi2.e();
        return null;
    }

    public mk1 C() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.x;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        boolean z2 = false;
        if (activeNetwork == null) {
            return new mk1(false, false);
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return new mk1(false, false);
        }
        if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            z = true;
        } else {
            z = false;
        }
        if (z && !connectivityManager.isActiveNetworkMetered()) {
            z2 = true;
        }
        return new mk1(z, z2);
    }

    public void D(dt3 dt3Var) {
        ArrayList arrayList;
        M();
        xv0 xv0Var = (xv0) ((js) this.y).remove(dt3Var);
        if (xv0Var != null) {
            ((js) this.x).remove(xv0Var.a);
            i90 i90Var = xv0Var.b;
            synchronized (i90Var.c) {
                i90Var.b = true;
                arrayList = new ArrayList(((js) i90Var.d).values());
                ((js) i90Var.d).clear();
            }
            int size = arrayList.size();
            byte b = 0;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((vi5) obj).q();
            }
            bu3 bu3Var = (bu3) ((WeakReference) this.z).get();
            if (bu3Var != null && !bu3Var.i()) {
                eq6.a0(bu3Var.l, new uv0(bu3Var, dt3Var, b));
            }
        }
    }

    public k03 E(e73 e73Var, qx4 qx4Var, qx4 qx4Var2) {
        String str;
        e73Var.getClass();
        qx4Var2.getClass();
        StringBuilder sb = new StringBuilder(f73.a(e73Var));
        sb.append(':');
        if (qx4Var == null || (str = qx4Var.getValue()) == null) {
            str = "";
        }
        sb.append(str);
        sb.append(':');
        sb.append(qx4Var2);
        return (k03) ((ConcurrentHashMap) this.y).get(sb.toString());
    }

    public boolean F(int i) {
        ou5 ou5Var;
        if (i == 7) {
            s();
        } else if (i == 2) {
            s();
        } else if (i == 6) {
            s();
        } else if (i == 5) {
            s();
        } else if (i == 3) {
            s();
        } else if (i == 4) {
            s();
        } else if (i != 1 && i != 0) {
            ze0.m("invalid ImeAction");
            return false;
        }
        if (i == 6) {
            p72 p72Var = (p72) this.z;
            if (p72Var != null) {
                ((r72) p72Var).h(1, true);
                return true;
            }
            a34.s0("focusManager");
            throw null;
        }
        if (i == 5) {
            p72 p72Var2 = (p72) this.z;
            if (p72Var2 != null) {
                ((r72) p72Var2).h(2, true);
                return true;
            }
            a34.s0("focusManager");
            throw null;
        }
        if (i != 7 || (ou5Var = (ou5) this.x) == null) {
            return false;
        }
        ((id1) ou5Var).a();
        return true;
    }

    public void G(String str) {
        if (str != null) {
            this.x = str;
        } else {
            qi2.m("Null backendName");
        }
    }

    @Override // defpackage.o41
    public q41 H() {
        return new fo5((l33) this.x, (tq6) this.y, (ConcurrentHashMap) this.z);
    }

    public void I(jt3 jt3Var, Handler handler) {
        nt3 nt3Var = (nt3) this.x;
        if (jt3Var == null) {
            nt3Var.a(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        nt3Var.a(jt3Var, handler);
    }

    public void J(MediaMetadataCompat mediaMetadataCompat) {
        nt3 nt3Var = (nt3) this.x;
        nt3Var.g = mediaMetadataCompat;
        MediaSession mediaSession = nt3Var.a;
        if (mediaMetadataCompat.y == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.y = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.y);
    }

    public void L() {
        p44 p44Var = (p44) this.x;
        String str = (String) this.y;
        List list = (List) p44Var.l(str);
        if (list != null) {
            list.remove((sb2) this.z);
        }
        if (list != null && !list.isEmpty()) {
            p44Var.n(str, list);
        }
    }

    public void M() {
        boolean z;
        bu3 bu3Var = (bu3) ((WeakReference) this.z).get();
        if (bu3Var != null) {
            if (Looper.myLooper() == bu3Var.l.getLooper()) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
        }
    }

    @Override // defpackage.cf5
    public void a(zi4 zi4Var) {
        long d;
        long j;
        long j2;
        ((tf6) this.y).getClass();
        String str = eq6.a;
        tf6 tf6Var = (tf6) this.y;
        synchronized (tf6Var) {
            try {
                long j3 = tf6Var.c;
                if (j3 != -9223372036854775807L) {
                    d = j3 + tf6Var.b;
                } else {
                    d = tf6Var.d();
                }
                j = d;
            } finally {
            }
        }
        tf6 tf6Var2 = (tf6) this.y;
        synchronized (tf6Var2) {
            j2 = tf6Var2.b;
        }
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            ea2 ea2Var = (ea2) this.x;
            if (j2 != ea2Var.u) {
                da2 a = ea2Var.a();
                a.t = j2;
                ea2 ea2Var2 = new ea2(a);
                this.x = ea2Var2;
                ((bh6) this.z).g(ea2Var2);
            }
            int a2 = zi4Var.a();
            ((bh6) this.z).e(a2, zi4Var);
            ((bh6) this.z).a(j, 1, a2, 0, null);
        }
    }

    @Override // defpackage.cf5
    public void b(tf6 tf6Var, d12 d12Var, lk6 lk6Var) {
        this.y = tf6Var;
        lk6Var.a();
        lk6Var.b();
        bh6 G = d12Var.G(lk6Var.d, 5);
        this.z = G;
        G.g((ea2) this.x);
    }

    public void c(za3 za3Var, d33 d33Var) {
        af2 af2Var = (af2) this.x;
        af2 af2Var2 = (af2) this.y;
        af2 af2Var3 = (af2) this.z;
        int ordinal = d33Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (za3Var.E != null) {
                            af2Var3.a(za3Var);
                            return;
                        } else {
                            af2Var2.a(za3Var);
                            return;
                        }
                    }
                    ze0.l();
                    return;
                }
                if (za3Var.E != null) {
                    af2Var3.a(za3Var);
                    return;
                } else {
                    af2Var.a(za3Var);
                    return;
                }
            }
            af2Var2.a(za3Var);
            af2Var3.a(za3Var);
            return;
        }
        af2Var.a(za3Var);
        af2Var3.a(za3Var);
    }

    public void d(Object obj, dt3 dt3Var, mk5 mk5Var, go4 go4Var) {
        js jsVar = (js) this.y;
        M();
        dt3 q = q(obj);
        if (q == null) {
            ((js) this.x).put(obj, dt3Var);
            kf6 kf6Var = kf6.a;
            qh6 qh6Var = qh6.b;
            bu3 bu3Var = (bu3) ((WeakReference) this.z).get();
            if (bu3Var != null) {
                bu3Var.t();
                fq4 fq4Var = bu3Var.t;
                kf6Var = fq4Var.f1();
                if (fq4Var.t0(30)) {
                    qh6Var = fq4Var.j0();
                }
            }
            jsVar.put(dt3Var, new xv0(obj, new i90(), mk5Var, go4Var, kf6Var, qh6Var));
            return;
        }
        xv0 xv0Var = (xv0) jsVar.get(q);
        xv0Var.getClass();
        xv0Var.d = mk5Var;
        xv0Var.e = go4Var;
    }

    public void e(dt3 dt3Var, int i, wv0 wv0Var) {
        M();
        xv0 xv0Var = (xv0) ((js) this.y).get(dt3Var);
        if (xv0Var != null) {
            go4 go4Var = xv0Var.g;
            go4Var.getClass();
            fo4 fo4Var = new fo4(go4Var);
            fo4Var.a.a(i);
            xv0Var.g = fo4Var.b();
            xv0Var.c.add(wv0Var);
        }
    }

    public oy f() {
        String str;
        if (((String) this.x) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((cu4) this.z) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new oy((String) this.x, (byte[]) this.y, (cu4) this.z);
        }
        ze0.m("Missing required properties:".concat(str));
        return null;
    }

    public void g() {
        st3 st3Var = (st3) this.x;
        if (st3Var != null) {
            int i = ((ff2) this.z).n.d;
            nt3 nt3Var = (nt3) st3Var.x;
            nt3Var.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            nt3Var.a.setPlaybackToLocal(builder.build());
            this.y = null;
        }
    }

    public boolean h(za3 za3Var) {
        boolean z;
        boolean z2;
        if (za3Var.E == null) {
            z = true;
        } else {
            z = false;
        }
        if (!((zu5) ((af2) this.x).y).contains(za3Var) && !((zu5) ((af2) this.y).y).contains(za3Var)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || !z2) {
            return false;
        }
        return true;
    }

    public lj1 i(ar3 ar3Var) {
        boolean z;
        iw3 y91Var;
        lw3 e;
        w25 af2Var;
        vq3 vq3Var = ar3Var.b;
        vq3Var.getClass();
        hb1 hb1Var = lj1.p;
        boolean z2 = true;
        byte b = 4;
        if (eq6.L(vq3Var.a, vq3Var.b) == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z && ((o41) this.x) == null) {
            z2 = false;
        }
        io3.n(z2);
        if (z && ((o41) this.x) == null) {
            e = null;
        } else {
            o41 o41Var = (o41) this.x;
            vq3Var.getClass();
            if (eq6.L(vq3Var.a, vq3Var.b) == 4) {
                y91Var = new pv4(o41Var, new q81());
            } else {
                y91Var = new y91(o41Var, e12.a);
            }
            e = y91Var.e(ar3Var);
        }
        hb1 hb1Var2 = (hb1) this.z;
        fa1 fa1Var = (fa1) this.y;
        if (fa1Var != null) {
            byte b2 = 14;
            af2Var = new i75(fa1Var.b(eq6.q(null), new i18(b2), new m18(b2), new v71(b), new v71((byte) 5)));
        } else {
            af2Var = new af2((Object) new w30[0], (byte) 19);
        }
        return new lj1(ar3Var, e, hb1Var2, af2Var);
    }

    public void k(o15 o15Var, we2 we2Var) {
        float[] fArr;
        st3 st3Var = this;
        o15 o15Var2 = o15Var;
        kf kfVar = (kf) st3Var.y;
        float[] fArr2 = (float[]) kfVar.F;
        float[] fArr3 = (float[]) kfVar.E;
        float[] fArr4 = (float[]) kfVar.B;
        float[] fArr5 = (float[]) kfVar.C;
        float[] fArr6 = (float[]) kfVar.y;
        float[] fArr7 = (float[]) kfVar.z;
        float[] fArr8 = (float[]) kfVar.D;
        float[] fArr9 = (float[]) kfVar.A;
        float[] fArr10 = (float[]) kfVar.G;
        if (((re2) st3Var.z) != null) {
            fArr = fArr10;
        } else {
            try {
                fArr = fArr10;
                re2 re2Var = new re2((Context) st3Var.x, R.raw.vertex_shader_transformation_es2, R.raw.fragment_shader_alpha_scale_es2);
                st3Var.z = re2Var;
                re2Var.d(a34.c0());
                ((re2) st3Var.z).f("uTexTransformationMatrix", a34.I());
            } catch (IOException e) {
                throw new ns6(e);
            }
        }
        int i = we2Var.b;
        int i2 = we2Var.d;
        int i3 = we2Var.c;
        a34.T(i, i3, i2);
        kfVar.H = new sq5(i3, i2);
        a34.B();
        re2 re2Var2 = (re2) st3Var.z;
        re2Var2.getClass();
        GLES20.glUseProgram(re2Var2.a);
        a34.p();
        int i4 = 3042;
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        a34.p();
        int i5 = o15Var2.A - 1;
        while (i5 >= 0) {
            me2 me2Var = (me2) o15Var2.get(i5);
            re2 re2Var3 = (re2) st3Var.z;
            re2Var3.getClass();
            we2 we2Var2 = me2Var.a;
            int i6 = i4;
            re2Var3.h("uTexSampler", we2Var2.a, 0);
            sq5 sq5Var = new sq5(we2Var2.c, we2Var2.d);
            Matrix.setIdentityM(fArr7, 0);
            Matrix.setIdentityM(fArr6, 0);
            Matrix.setIdentityM(fArr5, 0);
            Matrix.setIdentityM(fArr9, 0);
            Matrix.setIdentityM(fArr4, 0);
            Matrix.setIdentityM(fArr8, 0);
            Matrix.setIdentityM(fArr3, 0);
            Matrix.setIdentityM(fArr2, 0);
            float[] fArr11 = fArr;
            Matrix.setIdentityM(fArr11, 0);
            Pair pair = ch4.i;
            int i7 = i5;
            Matrix.translateM(fArr6, 0, ((Float) pair.first).floatValue(), ((Float) pair.second).floatValue(), 0.0f);
            ((sq5) kfVar.H).getClass();
            float f = sq5Var.a;
            sq5 sq5Var2 = (sq5) kfVar.H;
            float f2 = sq5Var.b;
            float[] fArr12 = fArr6;
            Matrix.scaleM(fArr7, 0, f / sq5Var2.a, f2 / sq5Var2.b, 1.0f);
            Pair pair2 = ch4.k;
            Matrix.scaleM(fArr9, 0, ((Float) pair2.first).floatValue(), ((Float) pair2.second).floatValue(), 1.0f);
            Matrix.invertM(fArr4, 0, fArr9, 0);
            Pair pair3 = ch4.j;
            Matrix.translateM(fArr5, 0, ((Float) pair3.first).floatValue() * (-1.0f), ((Float) pair3.second).floatValue() * (-1.0f), 0.0f);
            Matrix.rotateM(fArr8, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            float[] fArr13 = fArr8;
            Matrix.scaleM(fArr3, 0, f2 / f, 1.0f, 1.0f);
            Matrix.invertM(fArr2, 0, fArr3, 0);
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, fArr12, 0);
            float[] fArr14 = fArr7;
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, fArr14, 0);
            float[] fArr15 = fArr9;
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, fArr15, 0);
            float[] fArr16 = fArr5;
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, fArr16, 0);
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, fArr4, 0);
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, fArr3, 0);
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, fArr13, 0);
            fArr8 = fArr13;
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, fArr2, 0);
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, fArr15, 0);
            re2Var3.f("uTransformationMatrix", fArr11);
            re2Var3.e("uAlphaScale", 1.0f);
            re2Var3.c();
            GLES20.glDrawArrays(5, 0, 4);
            a34.p();
            i5 = i7 - 1;
            st3Var = this;
            fArr6 = fArr12;
            fArr7 = fArr14;
            fArr = fArr11;
            fArr9 = fArr15;
            fArr5 = fArr16;
            o15Var2 = o15Var;
            i4 = i6;
        }
        GLES20.glDisable(i4);
        a34.p();
    }

    public void m(xv0 xv0Var) {
        ii3 ii3Var;
        bu3 bu3Var = (bu3) ((WeakReference) this.z).get();
        if (bu3Var == null) {
            return;
        }
        M();
        do {
            wv0 wv0Var = (wv0) xv0Var.c.poll();
            if (wv0Var == null) {
                xv0Var.f = false;
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            q(xv0Var.a);
            atomicReference.set(wv0Var.run());
            ii3Var = (ii3) atomicReference.get();
        } while (ii3Var.isDone());
        ii3Var.a(new ze((Object) this, (Object) bu3Var, (Object) xv0Var, (byte) 4), qg1.x);
    }

    public void n(final dt3 dt3Var) {
        M();
        xv0 xv0Var = (xv0) ((js) this.y).get(dt3Var);
        if (xv0Var != null) {
            final go4 go4Var = xv0Var.g;
            xv0Var.g = go4.b;
            xv0Var.c.add(new wv0(dt3Var, go4Var) { // from class: vv0
                public final /* synthetic */ dt3 b;

                @Override // defpackage.wv0
                public final ii3 run() {
                    bu3 bu3Var = (bu3) ((WeakReference) st3.this.z).get();
                    if (bu3Var != null) {
                        bu3Var.n(this.b);
                    }
                    return aw2.y;
                }
            });
            if (xv0Var.f) {
                return;
            }
            xv0Var.f = true;
            m(xv0Var);
        }
    }

    public xp1 o(ar3 ar3Var) {
        e81 e81Var;
        ar3Var.b.getClass();
        sq3 sq3Var = ar3Var.b.c;
        if (sq3Var == null) {
            return xp1.a;
        }
        synchronized (this.x) {
            try {
                if (!sq3Var.equals((sq3) this.y)) {
                    this.y = sq3Var;
                    this.z = j(sq3Var);
                }
                e81Var = (e81) this.z;
                e81Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return e81Var;
    }

    public nw2 p() {
        M();
        return nw2.o(((js) this.x).values());
    }

    public dt3 q(Object obj) {
        M();
        return (dt3) ((js) this.x).get(obj);
    }

    public fk3 r() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((y95) this.z)) {
            try {
                fk3 fk3Var = (fk3) this.y;
                if (fk3Var != null && localeList == ((LocaleList) this.x)) {
                    return fk3Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new ek3(localeList.get(i)));
                }
                fk3 fk3Var2 = new fk3(arrayList);
                this.x = localeList;
                this.y = fk3Var2;
                return fk3Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public m83 s() {
        m83 m83Var = (m83) this.y;
        if (m83Var != null) {
            return m83Var;
        }
        a34.s0("keyboardActions");
        throw null;
    }

    public i90 t(dt3 dt3Var) {
        M();
        xv0 xv0Var = (xv0) ((js) this.y).get(dt3Var);
        if (xv0Var != null) {
            return xv0Var.b;
        }
        return null;
    }

    public boolean u() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.y;
        if (((String) this.z) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.z = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.x).readLine();
                this.z = readLine;
                if (readLine != null) {
                    trim = readLine.trim();
                    this.z = trim;
                } else {
                    return false;
                }
            } while (trim.isEmpty());
        }
        return true;
    }

    public boolean v(dt3 dt3Var) {
        M();
        if (((js) this.y).get(dt3Var) != null) {
            return true;
        }
        return false;
    }

    public boolean w() {
        boolean z;
        if (((zu5) ((af2) this.x).y).isEmpty() && ((zu5) ((af2) this.z).y).isEmpty() && ((zu5) ((af2) this.y).y).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public boolean x(dt3 dt3Var, int i) {
        M();
        xv0 xv0Var = (xv0) ((js) this.y).get(dt3Var);
        bu3 bu3Var = (bu3) ((WeakReference) this.z).get();
        if (xv0Var != null && xv0Var.e.a(i) && bu3Var != null) {
            bu3Var.t();
            if (bu3Var.t.l().a(i)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean y(dt3 dt3Var, int i) {
        boolean z;
        M();
        xv0 xv0Var = (xv0) ((js) this.y).get(dt3Var);
        if (xv0Var != null) {
            mk5 mk5Var = xv0Var.d;
            mk5Var.getClass();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            io3.m("Use contains(Command) for custom command", z);
            Iterator<E> it = mk5Var.a.iterator();
            while (it.hasNext()) {
                if (((lk5) it.next()).a == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean z(dt3 dt3Var, lk5 lk5Var) {
        M();
        xv0 xv0Var = (xv0) ((js) this.y).get(dt3Var);
        if (xv0Var != null) {
            zw2 zw2Var = xv0Var.d.a;
            lk5Var.getClass();
            if (zw2Var.contains(lk5Var) || kq0.i(lk5Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public /* synthetic */ st3(Object obj, Object obj2, Object obj3) {
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    public st3(Context context, byte b) {
        switch (b) {
            case 12:
                this.x = context;
                this.y = new kf();
                return;
            default:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                this.x = connectivityManager;
                sx5 a = tx5.a(C());
                this.y = a;
                this.z = h41.d(a);
                connectivityManager.registerDefaultNetworkCallback(new lk1(this, (byte) 0));
                return;
        }
    }

    public /* synthetic */ st3(Object obj) {
        this.x = obj;
    }

    public st3(String str) {
        da2 da2Var = new da2();
        da2Var.n = qy3.n("video/mp2t");
        da2Var.o = qy3.n(str);
        this.x = new ea2(da2Var);
    }

    public st3(bu3 bu3Var) {
        this.x = new so5(0);
        this.y = new so5(0);
        this.z = new WeakReference(bu3Var);
    }

    public st3(ll6 ll6Var, st3 st3Var) {
        this.x = ll6Var;
        this.y = st3Var;
        this.z = ll6Var.getValue();
    }

    public st3(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.y = arrayDeque;
        this.x = bufferedReader;
    }
}
