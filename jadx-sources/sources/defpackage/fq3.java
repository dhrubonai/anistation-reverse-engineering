package defpackage;

import android.content.Context;
import android.graphics.Region;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a;
import android.view.View;
import android.widget.Magnifier;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fq3 implements tf0, xc2, h85, kp3, gp6, sl, p30, ke4, ce4, yd4, g25 {
    public final /* synthetic */ byte x;
    public Object y;

    public fq3(byte b) {
        this.x = b;
        switch (b) {
            case 5:
                this.y = new sl3((Object) null);
                return;
            case 8:
                this.y = new Region();
                return;
            case 18:
                this.y = new wv((byte) 1);
                return;
            case 21:
                this.y = new int[2];
                return;
            case 23:
                this.y = new CountDownLatch(1);
                return;
            case 24:
                this.y = new EnumMap(wv7.class);
                return;
            case 29:
                this.y = new HashMap();
                return;
            default:
                this.y = new Bundle();
                return;
        }
    }

    @Override // defpackage.p30
    public void a(hw0 hw0Var) {
        ((th2) this.y).a(hw0Var);
    }

    @Override // defpackage.g25
    public void accept(Object obj, Object obj2) {
        nq7 nq7Var = new nq7((wb7) this.y, (p76) obj2);
        lr7 lr7Var = (lr7) ((ur7) obj).m();
        Parcel K = lr7Var.K();
        nn7.c(K, nq7Var);
        lr7Var.M(K, 2);
    }

    @Override // defpackage.kp3
    public void c(int i, x21 x21Var, long j, int i2) {
        ((MediaCodec) this.y).queueSecureInputBuffer(i, 0, x21Var.i, j, i2);
    }

    @Override // defpackage.kp3
    public void d(int i, int i2, int i3, long j) {
        ((MediaCodec) this.y).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.h85
    public g85 e(String str) {
        str.getClass();
        a36 a36Var = (a36) this.y;
        String databaseName = a36Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                ze0.e(qx1.m("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !uz5.n0('/', databaseName, databaseName).equals(uz5.n0('/', str, str))) {
            ov3.n("This driver is configured to open a database named '", a36Var.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new w26(a36Var.X());
    }

    @Override // defpackage.yd4
    public void f() {
        ((CountDownLatch) this.y).countDown();
    }

    @Override // defpackage.h85
    public boolean g() {
        return true;
    }

    @Override // defpackage.sl
    public n42 get(int i) {
        return (t42) this.y;
    }

    public JSONObject h(View view) {
        int[] iArr = (int[]) this.y;
        if (view == null) {
            return ha7.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return ha7.a(iArr[0], iArr[1], width, height);
    }

    public long i(long j) {
        wv wvVar = (wv) this.y;
        if (ur6.b(j) <= 0.0f || ur6.c(j) <= 0.0f) {
            ez2.b("maximumVelocity should be a positive value. You specified=".concat(ur6.g(j)));
        }
        return ez5.a(((wr6) wvVar.b).c(ur6.b(j)), ((wr6) wvVar.c).c(ur6.c(j)));
    }

    public long j() {
        Magnifier magnifier = (Magnifier) this.y;
        return (magnifier.getWidth() << 32) | (magnifier.getHeight() & 4294967295L);
    }

    public void k() {
        l34 l34Var = (l34) this.y;
        l34Var.q = true;
        if (l34Var.i.isEmpty()) {
            hc1 hc1Var = l34Var.n;
            hc1Var.getClass();
            hc1Var.k();
            return;
        }
        l34Var.b();
    }

    @Override // defpackage.gp6
    public FileChannel l() {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.y;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        ov3.f(parcelFileDescriptor, "Not a file: ");
        return null;
    }

    public u98 m(l33 l33Var, oa oaVar) {
        long j;
        boolean z;
        long E;
        sl3 sl3Var = (sl3) this.y;
        ArrayList arrayList = (ArrayList) l33Var.y;
        sl3 sl3Var2 = new sl3(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            wq4 wq4Var = (wq4) arrayList.get(i);
            long j2 = wq4Var.a;
            vq4 vq4Var = (vq4) sl3Var.b(j2);
            if (vq4Var == null) {
                j = wq4Var.b;
                E = wq4Var.d;
                z = false;
            } else {
                long j3 = vq4Var.a;
                j = j3;
                z = vq4Var.c;
                E = oaVar.E(vq4Var.b);
            }
            long j4 = wq4Var.a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            sl3Var2.d(j4, new uq4(j4, wq4Var.b, wq4Var.d, wq4Var.e, wq4Var.f, j, E, z, wq4Var.g, wq4Var.i, wq4Var.j, wq4Var.k, wq4Var.l, wq4Var.m));
            boolean z2 = wq4Var.e;
            if (z2) {
                sl3Var.d(j2, new vq4(wq4Var.b, wq4Var.c, z2));
            } else {
                sl3Var.e(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new u98(sl3Var2, l33Var);
    }

    public void n(String str, String str2) {
        js jsVar = MediaMetadataCompat.z;
        if (jsVar.containsKey(str) && ((Integer) jsVar.get(str)).intValue() != 1) {
            ze0.k(qx1.m("The ", str, " key cannot be used to put a String"));
        } else {
            ((Bundle) this.y).putCharSequence(str, str2);
        }
    }

    public Object o(lj0 lj0Var, sb2 sb2Var) {
        iq5 iq5Var;
        ki5 ki5Var;
        int i;
        if (((qt0) this.y) == null) {
            ds4.b("Called runAndWatch on a manager that has been disposed of");
        }
        qt0 qt0Var = (qt0) this.y;
        if ((qt0Var instanceof iq5) && (ki5Var = (iq5Var = (iq5) qt0Var).C) != null && !ki5Var.equals(lj0Var)) {
            u24 u24Var = new u24();
            ki5 ki5Var2 = iq5Var.C;
            if (ki5Var2 == null) {
                ds4.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            q44 q44Var = iq5Var.A;
            ArrayList arrayList = u24Var.z;
            if (q44Var == null) {
                Object obj = iq5Var.y;
                obj.getClass();
                arrayList.add(new r24(obj, ki5Var2));
            } else {
                Object[] objArr = q44Var.b;
                long[] jArr = q44Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new r24(objArr[(i2 << 3) + i5], ki5Var2));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            u24Var.o();
            iq5Var.p();
            this.y = u24Var;
        }
        qt0 qt0Var2 = (qt0) this.y;
        qt0Var2.getClass();
        ft5 u = mt5.h().u(qt0Var2.z(lj0Var));
        qt0Var2.n(lj0Var);
        try {
            ft5 j2 = u.j();
            try {
                Object invoke = sb2Var.invoke();
                u.c();
                qt0Var2.o();
                return invoke;
            } finally {
                ft5.q(j2);
            }
        } catch (Throwable th) {
            u.c();
            throw th;
        }
    }

    @Override // defpackage.ce4
    public void onFailure(Exception exc) {
        switch (this.x) {
            case 23:
                ((CountDownLatch) this.y).countDown();
                return;
            default:
                p76 p76Var = (p76) this.y;
                un7.d.a(exc, "get checkbox consent failed", new Object[0]);
                p76Var.d(Boolean.FALSE);
                return;
        }
    }

    @Override // defpackage.tf0
    public void onResponse(nf0 nf0Var, p45 p45Var) {
        ((fl5) this.y).l(p45Var);
    }

    @Override // defpackage.xc2
    public void onSuccess(Object obj) {
        switch (this.x) {
            case 7:
                h55 h55Var = (h55) this.y;
                h55Var.i.u(h55Var.q.a());
                return;
            default:
                ((CountDownLatch) this.y).countDown();
                return;
        }
    }

    public void p(g13 g13Var) {
        ((Region) this.y).set(g13Var.a, g13Var.b, g13Var.c, g13Var.d);
    }

    public void q(int i, String str, List list, boolean z, boolean z2) {
        bs7 bs7Var;
        gu7 gu7Var = (gu7) ((nt7) this.y).x;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        es7 es7Var = gu7Var.C;
                        gu7.l(es7Var);
                        bs7Var = es7Var.I;
                    } else if (z) {
                        es7 es7Var2 = gu7Var.C;
                        gu7.l(es7Var2);
                        bs7Var = es7Var2.G;
                    } else if (!z2) {
                        es7 es7Var3 = gu7Var.C;
                        gu7.l(es7Var3);
                        bs7Var = es7Var3.H;
                    } else {
                        es7 es7Var4 = gu7Var.C;
                        gu7.l(es7Var4);
                        bs7Var = es7Var4.F;
                    }
                } else {
                    es7 es7Var5 = gu7Var.C;
                    gu7.l(es7Var5);
                    bs7Var = es7Var5.K;
                }
            } else if (z) {
                es7 es7Var6 = gu7Var.C;
                gu7.l(es7Var6);
                bs7Var = es7Var6.D;
            } else if (!z2) {
                es7 es7Var7 = gu7Var.C;
                gu7.l(es7Var7);
                bs7Var = es7Var7.E;
            } else {
                es7 es7Var8 = gu7Var.C;
                gu7.l(es7Var8);
                bs7Var = es7Var8.C;
            }
        } else {
            es7 es7Var9 = gu7Var.C;
            gu7.l(es7Var9);
            bs7Var = es7Var9.J;
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    bs7Var.a(str);
                    return;
                } else {
                    bs7Var.d(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            bs7Var.c(str, list.get(0), list.get(1));
            return;
        }
        bs7Var.b(list.get(0), str);
    }

    public void r(wv7 wv7Var, int i) {
        ck7 ck7Var;
        if (i != -30) {
            if (i != -20) {
                if (i != -10) {
                    if (i != 0) {
                        if (i != 30) {
                            ck7Var = ck7.UNSET;
                        } else {
                            ck7Var = ck7.INITIALIZATION;
                        }
                    }
                } else {
                    ck7Var = ck7.MANIFEST;
                }
            }
            ck7Var = ck7.API;
        } else {
            ck7Var = ck7.TCF;
        }
        ((EnumMap) this.y).put((EnumMap) wv7Var, (wv7) ck7Var);
    }

    public void s(wv7 wv7Var, ck7 ck7Var) {
        ((EnumMap) this.y).put((EnumMap) wv7Var, (wv7) ck7Var);
    }

    @Override // defpackage.kp3
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.y).setParameters(bundle);
    }

    @Override // defpackage.xc2
    public void t(Throwable th) {
        oz1 d = oz1.d(new IOException("Copy output task failed for the resumed export", th));
        h55 h55Var = (h55) this.y;
        qz1 qz1Var = h55Var.q;
        qz1Var.q = d;
        h55Var.i.v(qz1Var.a(), d);
    }

    public String toString() {
        switch (this.x) {
            case 24:
                StringBuilder sb = new StringBuilder(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                for (wv7 wv7Var : wv7.values()) {
                    ck7 ck7Var = (ck7) ((EnumMap) this.y).get(wv7Var);
                    if (ck7Var == null) {
                        ck7Var = ck7.UNSET;
                    }
                    sb.append(ck7Var.x);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.kp3
    public void b() {
    }

    @Override // defpackage.kp3
    public void flush() {
    }

    @Override // defpackage.kp3
    public void shutdown() {
    }

    @Override // defpackage.kp3
    public void start() {
    }

    @Override // defpackage.tf0
    public void onFailure(nf0 nf0Var, IOException iOException) {
        ((fl5) this.y).m(iOException);
    }

    public /* synthetic */ fq3(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    public fq3(EnumMap enumMap) {
        this.x = (byte) 24;
        EnumMap enumMap2 = new EnumMap(wv7.class);
        this.y = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public fq3(og3 og3Var) {
        this.x = (byte) 19;
        og3Var.getClass();
        this.y = new WeakReference(og3Var);
    }

    public fq3(a36 a36Var) {
        this.x = (byte) 11;
        a36Var.getClass();
        this.y = a36Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ru5, sn3, java.lang.Object] */
    public fq3(View view) {
        this.x = (byte) 10;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? sn3Var = new sn3((Object) view, (byte) 16);
            sn3Var.z = view;
            this.y = sn3Var;
            return;
        }
        this.y = new sn3((Object) view, (byte) 16);
    }

    public /* synthetic */ fq3(byte b, boolean z) {
        this.x = b;
    }

    public fq3(MediaMetadataCompat mediaMetadataCompat) {
        this.x = (byte) 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.x);
        this.y = bundle;
        st3.l(bundle);
    }

    public fq3(Context context, st3 st3Var) {
        this.x = (byte) 0;
        MediaSessionCompat$Token mediaSessionCompat$Token = ((nt3) st3Var.x).c;
        if (mediaSessionCompat$Token != null) {
            Collections.synchronizedSet(new HashSet());
            this.y = new a(context, mediaSessionCompat$Token);
        } else {
            ze0.k("sessionToken must not be null");
            throw null;
        }
    }

    public fq3(float f, float f2) {
        this.x = (byte) 17;
        this.y = new t42(f, f2);
    }
}
