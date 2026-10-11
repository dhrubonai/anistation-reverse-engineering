package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wu3 extends jt3 {
    public static final int B;
    public go4 A;
    public final st3 f;
    public final js g;
    public final js h;
    public final bu3 i;
    public final af2 j;
    public final uu3 k;
    public final fu l;
    public final boolean m;
    public final p9 n;
    public final rt3 o;
    public final o9 p;
    public final ComponentName q;
    public su3 r;
    public final boolean s;
    public volatile int t;
    public uu3 u;
    public int v;
    public final Bundle w;
    public nw2 x;
    public nw2 y;
    public mk5 z;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 33554432;
        } else {
            i = 0;
        }
        B = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d0  */
    /* JADX WARN: Type inference failed for: r6v3, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r6v4, types: [so5, js] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wu3(defpackage.bu3 r17, android.net.Uri r18, android.os.Handler r19, android.os.Bundle r20, android.app.PendingIntent r21, defpackage.nw2 r22, defpackage.nw2 r23, defpackage.mk5 r24, defpackage.go4 r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu3.<init>(bu3, android.net.Uri, android.os.Handler, android.os.Bundle, android.app.PendingIntent, nw2, nw2, mk5, go4, android.os.Bundle):void");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [st3, java.lang.Object] */
    public static ar3 M(String str, Uri uri, String str2, Bundle bundle) {
        nq3 nq3Var = new nq3();
        if (str == null) {
            str = "";
        }
        nq3Var.b = str;
        ?? obj = new Object();
        obj.x = uri;
        obj.y = str2;
        obj.z = bundle;
        nq3Var.m = new wq3(obj);
        return nq3Var.a();
    }

    public static ComponentName Q(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        return null;
    }

    @Override // defpackage.jt3
    public final void A(ay4 ay4Var) {
        B(ay4Var);
    }

    @Override // defpackage.jt3
    public final void B(ay4 ay4Var) {
        yx4 c = of3.c(ay4Var);
        if (c == null) {
            kb0.O("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + ay4Var);
            return;
        }
        P(null, 40010, new du3(this, c), this.o.o());
    }

    @Override // defpackage.jt3
    public final void C(int i) {
        O(15, new hu3(this, i, (byte) 1), this.o.o(), true);
    }

    @Override // defpackage.jt3
    public final void D(int i) {
        O(14, new hu3(this, i, (byte) 0), this.o.o(), true);
    }

    @Override // defpackage.jt3
    public final void E() {
        bu3 bu3Var = this.i;
        bu3Var.t();
        boolean t0 = bu3Var.t.t0(9);
        byte b = 1;
        rt3 rt3Var = this.o;
        if (t0) {
            O(9, new du3(this, b), rt3Var.o(), true);
        } else {
            O(8, new du3(this, (byte) 2), rt3Var.o(), true);
        }
    }

    @Override // defpackage.jt3
    public final void H() {
        bu3 bu3Var = this.i;
        bu3Var.t();
        byte b = 7;
        boolean t0 = bu3Var.t.t0(7);
        byte b2 = 6;
        rt3 rt3Var = this.o;
        if (t0) {
            O(7, new du3(this, b2), rt3Var.o(), true);
        } else {
            O(6, new du3(this, b), rt3Var.o(), true);
        }
    }

    @Override // defpackage.jt3
    public final void K(long j) {
        if (j < 0) {
            return;
        }
        O(10, new gu3(this, j, (byte) 1), this.o.o(), true);
    }

    @Override // defpackage.jt3
    public final void L() {
        O(3, new du3(this, (byte) 11), this.o.o(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wn4 N(fq4 fq4Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        long j;
        float f;
        Bundle bundle;
        long j2;
        String str;
        int i3;
        int i4;
        int i5;
        Object obj;
        long j3;
        yx1 X = fq4Var.X();
        if (fq4Var.t0(16) && !fq4Var.b1()) {
            z = true;
        } else {
            z = false;
        }
        if (X == null && !eq6.g0(fq4Var, this.s)) {
            z2 = false;
        } else {
            z2 = true;
        }
        Object obj2 = null;
        if (X != null) {
            i2 = 7;
        } else {
            int i6 = of3.a;
            if (fq4Var.X() != null) {
                i = 7;
            } else {
                int h0 = fq4Var.h0();
                if (h0 != 1) {
                    if (h0 != 2) {
                        if (h0 != 3) {
                            if (h0 == 4) {
                                i = 1;
                            } else {
                                ze0.k(qx1.h(h0, "Unrecognized State: "));
                                return null;
                            }
                        } else {
                            if (!z2) {
                                i = 3;
                            }
                            i = 2;
                        }
                    } else {
                        if (!z2) {
                            i = 6;
                        }
                        i = 2;
                    }
                } else {
                    i = 0;
                }
            }
            i2 = i;
        }
        go4 F = x97.F(this.A, fq4Var.l());
        long j4 = 128;
        int i7 = 0;
        while (i7 < F.a.a.size()) {
            int a = F.a.a(i7);
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        obj = obj2;
                        if (a != 31) {
                            switch (a) {
                                case 5:
                                    j3 = 256;
                                    break;
                                case 6:
                                case 7:
                                    j3 = 16;
                                    break;
                                case 8:
                                case 9:
                                    j3 = 32;
                                    break;
                                case 10:
                                    j3 = 4096;
                                    break;
                                case 11:
                                    j3 = 8;
                                    break;
                                case 12:
                                    j3 = 64;
                                    break;
                                case 13:
                                    j3 = 4194304;
                                    break;
                                case 14:
                                    j3 = 2621440;
                                    break;
                                case 15:
                                    j3 = 262144;
                                    break;
                                default:
                                    j3 = 0;
                                    break;
                            }
                        } else {
                            j3 = 240640;
                        }
                    } else {
                        obj = obj2;
                        j3 = 1;
                    }
                } else {
                    obj = obj2;
                    j3 = 16384;
                }
            } else {
                obj = obj2;
                if (z2) {
                    j3 = 516;
                } else {
                    j3 = 514;
                }
            }
            j4 |= j3;
            i7++;
            obj2 = obj;
        }
        wn4 wn4Var = obj2;
        if (!this.y.isEmpty() && kq0.b(2, this.x)) {
            j4 &= -17;
        }
        if (!this.y.isEmpty() && kq0.b(3, this.x)) {
            j4 &= -33;
        }
        if (!z) {
            j4 &= -257;
        }
        long j5 = j4;
        long j6 = -1;
        if (fq4Var.t0(17)) {
            int s0 = fq4Var.s0();
            int i8 = of3.a;
            j = s0 == -1 ? -1L : s0;
        } else {
            j = -1;
        }
        float f2 = fq4Var.e().a;
        if (fq4Var.l0() && z) {
            f = f2;
        } else {
            f = 0.0f;
        }
        if (X != null) {
            bundle = new Bundle(Bundle.EMPTY);
        } else {
            bundle = new Bundle();
        }
        bundle.putAll(this.w);
        bundle.putFloat("EXO_SPEED", f2);
        ar3 e1 = fq4Var.e1();
        if (e1 != null) {
            String str2 = e1.a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z) {
            j2 = fq4Var.Z0();
        } else {
            j2 = -1;
        }
        if (z) {
            j6 = fq4Var.e0();
        }
        ArrayList arrayList = new ArrayList();
        long j7 = j6;
        long j8 = j2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i9 = 0; i9 < this.x.size(); i9++) {
            kq0 kq0Var = (kq0) this.x.get(i9);
            lk5 lk5Var = kq0Var.a;
            Bundle bundle2 = kq0Var.d;
            if (lk5Var != null) {
                Bundle bundle3 = lk5Var.c;
                String str3 = lk5Var.b;
                if (kq0Var.f && lk5Var.a == 0) {
                    mk5 mk5Var = this.z;
                    if ((lk5Var != null && mk5Var.a.contains(lk5Var)) || (((i5 = kq0Var.b) != -1 && F.a(i5)) || kq0.i(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        int i10 = kq0Var.c;
                        if (!TextUtils.isEmpty(str3)) {
                            if (!TextUtils.isEmpty("")) {
                                if (i10 != 0) {
                                    arrayList.add(new vn4(i10, bundle3, str3));
                                } else {
                                    ze0.k("You must specify an icon resource id to build a CustomAction");
                                    return wn4Var;
                                }
                            } else {
                                ze0.k("You must specify a name to build a CustomAction");
                                return wn4Var;
                            }
                        } else {
                            ze0.k("You must specify an action to build a CustomAction");
                            return wn4Var;
                        }
                    }
                }
            }
        }
        if (X != null) {
            int i11 = of3.a;
            int i12 = X.x;
            if (i12 != -110) {
                if (i12 != -109) {
                    if (i12 != -6) {
                        if (i12 != -2) {
                            if (i12 != 1) {
                                switch (i12) {
                                    case -107:
                                        i4 = 9;
                                        break;
                                    case -106:
                                        i4 = 7;
                                        break;
                                    case -105:
                                        i4 = 6;
                                        break;
                                    case -104:
                                        i4 = 5;
                                        break;
                                    case -103:
                                        i4 = 4;
                                        break;
                                    case -102:
                                        i4 = 3;
                                        break;
                                    default:
                                        i4 = 0;
                                        break;
                                }
                            } else {
                                i4 = 10;
                            }
                        } else {
                            i4 = 1;
                        }
                    } else {
                        i4 = 2;
                    }
                } else {
                    i4 = 11;
                }
            } else {
                i4 = 8;
            }
            i3 = i4;
            str = X.getMessage();
        } else {
            str = wn4Var;
            i3 = 0;
        }
        return new wn4(i2, j8, j7, f, j5, i3, str, elapsedRealtime, arrayList, j, bundle);
    }

    public final void O(final int i, final vu3 vu3Var, final xu3 xu3Var, final boolean z) {
        if (this.i.i()) {
            return;
        }
        U(new Runnable() { // from class: ju3
            @Override // java.lang.Runnable
            public final void run() {
                final wu3 wu3Var = wu3.this;
                final int i2 = i;
                final vu3 vu3Var2 = vu3Var;
                final boolean z2 = z;
                wu3Var.R(xu3Var, new vu3() { // from class: ou3
                    @Override // defpackage.vu3
                    public final void a(dt3 dt3Var) {
                        vu3 vu3Var3 = vu3Var2;
                        wu3 wu3Var2 = wu3.this;
                        bu3 bu3Var = wu3Var2.i;
                        st3 st3Var = wu3Var2.f;
                        int i3 = i2;
                        if (!st3Var.x(dt3Var, i3)) {
                            if (i3 == 1) {
                                bu3Var.t();
                                if (!bu3Var.t.n()) {
                                    kb0.O("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        at3 at3Var = bu3Var.e;
                        bu3Var.q(dt3Var);
                        at3Var.getClass();
                        try {
                            vu3Var3.a(dt3Var);
                        } catch (RemoteException e) {
                            kb0.P("MediaSessionLegacyStub", "Exception in " + dt3Var, e);
                        }
                        if (z2) {
                            fo4 fo4Var = new fo4();
                            fo4Var.a.a(i3);
                            fo4Var.b();
                            bu3Var.n(dt3Var);
                        }
                    }
                });
            }
        });
    }

    public final void P(final lk5 lk5Var, final int i, final vu3 vu3Var, final xu3 xu3Var) {
        U(new Runnable() { // from class: mu3
            @Override // java.lang.Runnable
            public final void run() {
                final wu3 wu3Var = wu3.this;
                final lk5 lk5Var2 = lk5Var;
                final char c = i;
                final vu3 vu3Var2 = vu3Var;
                wu3Var.R(xu3Var, new vu3() { // from class: pu3
                    @Override // defpackage.vu3
                    public final void a(dt3 dt3Var) {
                        vu3 vu3Var3 = vu3Var2;
                        st3 st3Var = wu3.this.f;
                        lk5 lk5Var3 = lk5Var2;
                        if (lk5Var3 != null) {
                            if (!st3Var.z(dt3Var, lk5Var3)) {
                                return;
                            }
                        } else if (!st3Var.y(dt3Var, c)) {
                            return;
                        }
                        try {
                            vu3Var3.a(dt3Var);
                        } catch (RemoteException e) {
                            kb0.P("MediaSessionLegacyStub", "Exception in " + dt3Var, e);
                        }
                    }
                });
            }
        });
    }

    public final void R(xu3 xu3Var, vu3 vu3Var) {
        if (this.i.i()) {
            return;
        }
        if (!((mt3) this.o.y).a.isActive()) {
            kb0.O("MediaSessionLegacyStub", "Ignore incoming command before initialization. pid=" + xu3Var.a.b);
            return;
        }
        dt3 q = this.f.q(xu3Var);
        if (q != null) {
            fu fuVar = this.l;
            long j = this.t;
            fuVar.removeMessages(1001, q);
            fuVar.sendMessageDelayed(fuVar.obtainMessage(1001, q), j);
            try {
                vu3Var.a(q);
                return;
            } catch (RemoteException e) {
                kb0.P("MediaSessionLegacyStub", "Exception in " + q, e);
                return;
            }
        }
        if (this.g.containsKey(xu3Var)) {
            List list = (List) this.h.get(xu3Var);
            list.getClass();
            list.add(vu3Var);
            return;
        }
        tu3 tu3Var = new tu3(xu3Var);
        dt3 dt3Var = new dt3(xu3Var, 0, 0, this.j.k(xu3Var), tu3Var, Bundle.EMPTY);
        ii3 l = this.i.l(dt3Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(vu3Var);
        this.h.put(xu3Var, arrayList);
        l.a(new yc2((Object) l, (Object) new dn0(this, xu3Var, tu3Var, dt3Var), (byte) 0), new ba(this, (byte) 2));
    }

    public final void S(final ar3 ar3Var, final boolean z, final boolean z2) {
        O(31, new vu3() { // from class: ku3
            @Override // defpackage.vu3
            public final void a(dt3 dt3Var) {
                wu3 wu3Var = wu3.this;
                fl5 o = wu3Var.i.o(dt3Var, nw2.s(ar3Var), -1, -9223372036854775807L);
                pn0 pn0Var = new pn0(wu3Var, dt3Var, z, z2);
                o.a(new yc2(o, pn0Var, (byte) 0), new ba(wu3Var, (byte) 2));
            }
        }, this.o.o(), false);
    }

    public final boolean T() {
        bu3 bu3Var = this.i;
        bu3Var.t();
        fq4 fq4Var = bu3Var.t;
        if (this.A.a(17) && fq4Var.l().a(17)) {
            return true;
        }
        return false;
    }

    public final void U(Runnable runnable) {
        eq6.a0(this.i.l, runnable);
    }

    public final void V() {
        int i = Build.VERSION.SDK_INT;
        byte b = 0;
        bu3 bu3Var = this.i;
        rt3 rt3Var = this.o;
        if (i < 31) {
            ComponentName componentName = this.q;
            if (componentName == null) {
                ((mt3) rt3Var.y).a.setMediaButtonReceiver(null);
            } else {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", bu3Var.b);
                intent.setComponent(componentName);
                ((mt3) rt3Var.y).a.setMediaButtonReceiver(PendingIntent.getBroadcast(bu3Var.f, 0, intent, B));
            }
        }
        o9 o9Var = this.p;
        if (o9Var != null) {
            bu3Var.f.unregisterReceiver(o9Var);
        }
        p9 p9Var = this.n;
        if (p9Var != null && !p9Var.f.getAndSet(true)) {
            p9Var.c.execute(new n9(p9Var, b));
        }
        mt3 mt3Var = (mt3) rt3Var.y;
        mt3Var.f.kill();
        MediaSession mediaSession = mt3Var.a;
        mediaSession.setCallback(null);
        mt3Var.b.e.clear();
        mediaSession.release();
        ((WeakReference) this.f.z).clear();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ew2, jw2] */
    public final void W() {
        p9 p9Var;
        int i;
        nw2 nw2Var = this.y;
        mk5 mk5Var = this.z;
        go4 go4Var = this.A;
        String str = kq0.h;
        ?? ew2Var = new ew2(4);
        for (int i2 = 0; i2 < nw2Var.size(); i2++) {
            kq0 kq0Var = (kq0) nw2Var.get(i2);
            lk5 lk5Var = kq0Var.a;
            if ((lk5Var != null && mk5Var.a.contains(lk5Var)) || ((i = kq0Var.b) != -1 && go4Var.a(i))) {
                ew2Var.c(kq0Var);
            } else {
                if (kq0Var.f) {
                    kq0Var = new kq0(kq0Var.a, kq0Var.b, kq0Var.c, new Bundle(kq0Var.d), false, kq0Var.e, kq0Var.g);
                }
                ew2Var.c(kq0Var);
            }
        }
        this.x = kq0.f(ew2Var.g());
        boolean z = this.m;
        Bundle bundle = this.w;
        boolean z2 = true;
        if (!z || ((p9Var = this.n) != null && p9Var.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !kq0.b(2, this.x));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !kq0.b(3, this.x));
            return;
        }
        if (this.x.isEmpty() || kq0.b(2, this.x)) {
            z2 = false;
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", z2);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
    }

    public final void X() {
        Bundle bundle = this.w;
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        W();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z2) {
            return;
        }
        ((mt3) this.o.y).a.setExtras(bundle);
    }

    public final void Y(fq4 fq4Var) {
        U(new fu3(this, fq4Var, (byte) 0));
    }

    @Override // defpackage.jt3
    public final void a(jq3 jq3Var) {
        if (jq3Var != null) {
            O(20, new lu3(this, jq3Var, -1), this.o.o(), false);
        }
    }

    @Override // defpackage.jt3
    public final void b(jq3 jq3Var, int i) {
        if (jq3Var != null) {
            if (i == -1 || i >= 0) {
                O(20, new lu3(this, jq3Var, i), this.o.o(), false);
            }
        }
    }

    @Override // defpackage.jt3
    public final void c(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            uk5 uk5Var = this.i.j;
            uk5Var.getClass();
            String str2 = uk5.b;
            Bundle bundle2 = new Bundle();
            vk5 vk5Var = uk5Var.a;
            bundle2.putInt(str2, 0);
            String str3 = uk5.c;
            Bundle bundle3 = new Bundle();
            bundle3.putInt(vk5.f, vk5Var.a);
            bundle3.putInt(vk5.g, 0);
            bundle3.putInt(vk5.h, 1011001300);
            bundle3.putString(vk5.i, vk5Var.b);
            bundle3.putString(vk5.j, "");
            bundle3.putBinder(vk5.l, vk5Var.c);
            bundle3.putParcelable(vk5.k, null);
            bundle3.putBundle(vk5.m, vk5Var.d);
            bundle3.putInt(vk5.n, 10);
            MediaSession.Token token = vk5Var.e;
            if (token != null) {
                bundle3.putParcelable(vk5.o, token);
            }
            bundle2.putBundle(str3, bundle3);
            resultReceiver.send(0, bundle2);
            return;
        }
        final lk5 lk5Var = new lk5(Bundle.EMPTY, str);
        P(lk5Var, 0, new vu3(lk5Var, bundle, resultReceiver) { // from class: nu3
            public final /* synthetic */ Bundle b;
            public final /* synthetic */ ResultReceiver c;

            {
                this.b = bundle;
                this.c = resultReceiver;
            }

            @Override // defpackage.vu3
            public final void a(dt3 dt3Var) {
                bu3 bu3Var = wu3.this.i;
                if (this.b == null) {
                    Bundle bundle4 = Bundle.EMPTY;
                }
                aw2 m = bu3Var.m(dt3Var);
                ResultReceiver resultReceiver2 = this.c;
                if (resultReceiver2 != null) {
                    m.a(new f32(m, resultReceiver2, (byte) 15), qg1.x);
                }
            }
        }, this.o.o());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    @Override // defpackage.jt3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            if (r8 == 0) goto Lc
            goto Le
        Lc:
            android.os.Bundle r8 = android.os.Bundle.EMPTY
        Le:
            lk5 r0 = new lk5
            r0.<init>(r8, r7)
            boolean r1 = defpackage.kq0.i(r7)
            rt3 r2 = r6.o
            r3 = 0
            if (r1 == 0) goto Lae
            java.lang.String r8 = "MediaSessionLegacyStub"
            kq0 r0 = defpackage.kq0.c(r0)     // Catch: java.lang.RuntimeException -> La1
            int r1 = r0.b
            java.lang.Object r4 = r0.g
            boolean r5 = r0.a()
            if (r5 != 0) goto L36
            java.lang.String r6 = "Can't execute predefined custom command: "
            java.lang.String r6 = r6.concat(r7)
            defpackage.kb0.O(r8, r6)
            return
        L36:
            lk5 r7 = r0.a
            r8 = 1
            if (r7 == 0) goto L59
            int r7 = r7.a
            r0 = 40010(0x9c4a, float:5.6066E-41)
            if (r7 != r0) goto L43
            r3 = r8
        L43:
            defpackage.io3.B(r3)
            r4.getClass()
            yx4 r4 = (defpackage.yx4) r4
            du3 r7 = new du3
            r7.<init>(r6, r4)
            xu3 r8 = r2.o()
            r1 = 0
            r6.P(r1, r0, r7, r8)
            return
        L59:
            bu3 r7 = r6.i
            r7.t()
            fq4 r7 = r7.t
            if (r1 == r8) goto L63
            goto L6d
        L63:
            if (r4 != 0) goto L6f
            boolean r7 = r7.n()
            if (r7 != 0) goto L6d
            r7 = r8
            goto L76
        L6d:
            r7 = r3
            goto L76
        L6f:
            r7 = r4
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
        L76:
            if (r7 == 0) goto L87
            du3 r7 = new du3
            r0 = 9
            r7.<init>(r6, r0)
            xu3 r0 = r2.o()
            r6.O(r8, r7, r0, r3)
            return
        L87:
            r7 = 31
            if (r1 != r7) goto L94
            r4.getClass()
            ar3 r4 = (defpackage.ar3) r4
            r6.S(r4, r3, r3)
            return
        L94:
            eu3 r7 = new eu3
            r7.<init>(r6, r0, r8)
            xu3 r0 = r2.o()
            r6.O(r1, r7, r0, r8)
            return
        La1:
            r6 = move-exception
            java.lang.String r7 = r0.b
            java.lang.String r0 = "Failed to convert predefined custom command: "
            java.lang.String r7 = r0.concat(r7)
            defpackage.kb0.P(r8, r7, r6)
            return
        Lae:
            du3 r7 = new du3
            r7.<init>(r6, r0, r8)
            xu3 r8 = r2.o()
            r6.P(r0, r3, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu3.e(java.lang.String, android.os.Bundle):void");
    }

    @Override // defpackage.jt3
    public final void f() {
        O(12, new du3(this, (byte) 0), this.o.o(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    @Override // defpackage.jt3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu3.g(android.content.Intent):boolean");
    }

    @Override // defpackage.jt3
    public final void h() {
        O(1, new du3(this, (byte) 3), this.o.o(), true);
    }

    @Override // defpackage.jt3
    public final void k() {
        O(1, new du3(this, (byte) 9), this.o.o(), false);
    }

    @Override // defpackage.jt3
    public final void n(String str, Bundle bundle) {
        S(M(str, null, null, bundle), true, true);
    }

    @Override // defpackage.jt3
    public final void o(String str, Bundle bundle) {
        S(M(null, null, str, bundle), true, true);
    }

    @Override // defpackage.jt3
    public final void p(Uri uri, Bundle bundle) {
        S(M(null, uri, null, bundle), true, true);
    }

    @Override // defpackage.jt3
    public final void q() {
        O(2, new du3(this, (byte) 10), this.o.o(), true);
    }

    @Override // defpackage.jt3
    public final void r(String str, Bundle bundle) {
        S(M(str, null, null, bundle), true, false);
    }

    @Override // defpackage.jt3
    public final void s(String str, Bundle bundle) {
        S(M(null, null, str, bundle), true, false);
    }

    @Override // defpackage.jt3
    public final void t(Uri uri, Bundle bundle) {
        S(M(null, uri, null, bundle), true, false);
    }

    @Override // defpackage.jt3
    public final void u(jq3 jq3Var) {
        if (jq3Var == null) {
            return;
        }
        O(20, new eu3(this, jq3Var, (byte) 0), this.o.o(), true);
    }

    @Override // defpackage.jt3
    public final void v() {
        O(11, new du3(this, (byte) 8), this.o.o(), true);
    }

    @Override // defpackage.jt3
    public final void w(long j) {
        O(5, new gu3(this, j, (byte) 0), this.o.o(), true);
    }

    @Override // defpackage.jt3
    public final void z(final float f) {
        if (f <= 0.0f) {
            return;
        }
        O(13, new vu3() { // from class: iu3
            @Override // defpackage.vu3
            public final void a(dt3 dt3Var) {
                bu3 bu3Var = wu3.this.i;
                bu3Var.t();
                bu3Var.t.c(f);
            }
        }, this.o.o(), true);
    }
}
