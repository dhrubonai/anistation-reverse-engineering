package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gw3 extends Binder implements IInterface {
    public final WeakReference e;
    public final st3 f;
    public final CopyOnWriteArraySet g;
    public n15 h;
    public t15 i;
    public int j;
    public cw2 k;
    public cw2 l;
    public int m;
    public kf6 n;
    public fw3 o;
    public ew3 p;

    public gw3(bu3 bu3Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.e = new WeakReference(bu3Var);
        this.f = new st3(bu3Var);
        this.g = new CopyOnWriteArraySet();
        n15 n15Var = n15.F;
        this.h = n15Var;
        this.i = t15.D;
        this.k = n15Var;
        this.l = n15Var;
        this.m = 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ii3, java.lang.Object] */
    public static ii3 M(bu3 bu3Var, dt3 dt3Var, int i, dw3 dw3Var, ay0 ay0Var) {
        if (bu3Var.i()) {
            return aw2.y;
        }
        ii3 ii3Var = (ii3) dw3Var.j(bu3Var, dt3Var, i);
        ?? obj = new Object();
        ii3Var.a(new es3(bu3Var, obj, ay0Var, ii3Var, (byte) 4), qg1.x);
        return obj;
    }

    public static void V(bu3 bu3Var, dt3 dt3Var, int i, tk5 tk5Var) {
        try {
            ct3 ct3Var = dt3Var.e;
            ct3Var.getClass();
            ct3Var.f(i, tk5Var);
            bu3Var.c.a(true, true);
        } catch (RemoteException e) {
            kb0.P("MediaSessionStub", "Failed to send result to controller " + dt3Var, e);
        }
    }

    public static h5 W(ay0 ay0Var) {
        return new h5((Object) new xv3(ay0Var, (byte) 0), (byte) 29);
    }

    public final void K(dt2 dt2Var, int i, cw3 cw3Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            bu3 bu3Var = (bu3) this.e.get();
            if (bu3Var != null && !bu3Var.i()) {
                Q(new rv3(this, ((ct2) dt2Var).e, cw3Var, i));
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void L(dt2 dt2Var, final int i, final lk5 lk5Var, final int i2, final dw3 dw3Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final bu3 bu3Var = (bu3) this.e.get();
            if (bu3Var != null && !bu3Var.i()) {
                final IBinder iBinder = ((ct2) dt2Var).e;
                Q(new Runnable() { // from class: wv3
                    @Override // java.lang.Runnable
                    public final void run() {
                        st3 st3Var = gw3.this.f;
                        dt3 q = st3Var.q(iBinder);
                        if (q == null || !st3Var.v(q)) {
                            return;
                        }
                        lk5 lk5Var2 = lk5Var;
                        bu3 bu3Var2 = bu3Var;
                        int i3 = i;
                        if (lk5Var2 != null) {
                            if (!st3Var.z(q, lk5Var2)) {
                                gw3.V(bu3Var2, q, i3, new tk5(-4));
                                return;
                            }
                        } else if (!st3Var.y(q, i2)) {
                            gw3.V(bu3Var2, q, i3, new tk5(-4));
                            return;
                        }
                        dw3Var.j(bu3Var2, q, i3);
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final int N(dt3 dt3Var, fq4 fq4Var, int i) {
        if (fq4Var.t0(17)) {
            st3 st3Var = this.f;
            if (!st3Var.x(dt3Var, 17) && st3Var.x(dt3Var, 16)) {
                return fq4Var.s0() + i;
            }
        }
        return i;
    }

    public final void O(final dt2 dt2Var, final int i, Bundle bundle, Bundle bundle2, boolean z) {
        final lk5 lk5Var;
        Bundle n = eq6.n(bundle2);
        if (dt2Var != null && bundle != null && n != null) {
            try {
                int i2 = bundle.getInt(lk5.h, 0);
                if (i2 != 0) {
                    lk5Var = new lk5(i2);
                } else {
                    String string = bundle.getString(lk5.i);
                    string.getClass();
                    Bundle n2 = eq6.n(bundle.getBundle(lk5.j));
                    if (n2 == null) {
                        n2 = Bundle.EMPTY;
                    }
                    lk5Var = new lk5(n2, string);
                }
                if (kq0.i(lk5Var.b)) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        final bu3 bu3Var = (bu3) this.e.get();
                        if (bu3Var != null && !bu3Var.i()) {
                            final IBinder iBinder = ((ct2) dt2Var).e;
                            Q(new Runnable() { // from class: bv3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    lk5 lk5Var2 = lk5Var;
                                    String str = lk5Var2.b;
                                    bu3 bu3Var2 = bu3Var;
                                    int i3 = i;
                                    gw3 gw3Var = gw3.this;
                                    st3 st3Var = gw3Var.f;
                                    dt3 q = st3Var.q(iBinder);
                                    if (q == null || !st3Var.v(q)) {
                                        return;
                                    }
                                    try {
                                        kq0 c = kq0.c(lk5Var2);
                                        Object obj = c.g;
                                        int i4 = c.b;
                                        if (!c.a()) {
                                            kb0.O("MediaSessionStub", "Can't execute predefined custom command: ".concat(str));
                                            gw3.V(bu3Var2, q, i3, new tk5(-6));
                                            return;
                                        }
                                        lk5 lk5Var3 = c.a;
                                        boolean z2 = false;
                                        if (lk5Var3 != null) {
                                            if (lk5Var3.a == 40010) {
                                                z2 = true;
                                            }
                                            io3.B(z2);
                                            gw3Var.L(dt2Var, i3, null, 40010, new yv3(new cv3(c), (byte) 1));
                                            return;
                                        }
                                        bu3Var2.t();
                                        fq4 fq4Var = bu3Var2.t;
                                        if (i4 == 1) {
                                            if (obj == null) {
                                                if (!fq4Var.n()) {
                                                    z2 = true;
                                                }
                                            } else {
                                                z2 = ((Boolean) obj).booleanValue();
                                            }
                                        }
                                        if (z2) {
                                            gw3Var.P(q, i3);
                                        } else if (i4 == 31) {
                                            obj.getClass();
                                            gw3Var.R(q, i3, 31, new yv3(new fs0(new ev3((ar3) obj), new qi2((byte) 18), (byte) 10), (byte) 1));
                                        } else {
                                            gw3Var.R(q, i3, i4, gw3.W(new cv3(c)));
                                        }
                                        st3Var.n(q);
                                    } catch (RuntimeException e) {
                                        kb0.P("MediaSessionStub", "Failed to convert predefined custom command: ".concat(str), e);
                                        gw3.V(bu3Var2, q, i3, new tk5(-3));
                                    }
                                }
                            });
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            return;
                        }
                        return;
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                L(dt2Var, i, lk5Var, 0, new yv3(new qi2(z, lk5Var, n), (byte) 1));
            } catch (RuntimeException e) {
                kb0.P("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
            }
        }
    }

    public final void P(dt3 dt3Var, int i) {
        R(dt3Var, i, 1, W(new fs0((Object) this, (Object) dt3Var, (byte) 8)));
    }

    public final void Q(Runnable runnable) {
        bu3 bu3Var = (bu3) this.e.get();
        if (bu3Var != null) {
            eq6.a0(bu3Var.l, runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [wv0, java.lang.Object] */
    public final void R(final dt3 dt3Var, final int i, int i2, final dw3 dw3Var) {
        boolean z;
        WeakReference weakReference = this.e;
        bu3 bu3Var = (bu3) weakReference.get();
        if (bu3Var != null) {
            if (Looper.myLooper() == bu3Var.l.getLooper()) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
        }
        final bu3 bu3Var2 = (bu3) weakReference.get();
        if (bu3Var2 != null && !bu3Var2.i()) {
            st3 st3Var = this.f;
            if (st3Var.v(dt3Var)) {
                if (!st3Var.x(dt3Var, i2)) {
                    V(bu3Var2, dt3Var, i, new tk5(-4));
                    return;
                }
                at3 at3Var = bu3Var2.e;
                bu3Var2.q(dt3Var);
                at3Var.getClass();
                if (i2 == 27) {
                    dw3Var.j(bu3Var2, dt3Var, i);
                    st3Var.e(dt3Var, i2, new Object());
                } else {
                    st3Var.e(dt3Var, i2, new wv0() { // from class: uv3
                        @Override // defpackage.wv0
                        public final ii3 run() {
                            return (ii3) dw3.this.j(bu3Var2, dt3Var, i);
                        }
                    });
                }
            }
        }
    }

    public final void S() {
        this.e.clear();
        st3 st3Var = this.f;
        ((WeakReference) st3Var.z).clear();
        nw2 p = st3Var.p();
        int size = p.size();
        int i = 0;
        while (i < size) {
            Object obj = p.get(i);
            i++;
            dt3 dt3Var = (dt3) obj;
            st3Var.D(dt3Var);
            ct3 ct3Var = dt3Var.e;
            if (ct3Var != null) {
                ct3Var.onDisconnected();
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.g;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ct3 ct3Var2 = ((dt3) it.next()).e;
            if (ct3Var2 != null) {
                ct3Var2.onDisconnected();
            }
        }
        copyOnWriteArraySet.clear();
    }

    public final void T(jo4 jo4Var, HashMap hashMap) {
        String str;
        Object obj = jo4Var.d;
        if (obj != null && !hashMap.containsKey(obj) && (str = (String) this.l.get(obj)) != null) {
            hashMap.put(obj, str);
        }
    }

    public final void U(jo4 jo4Var, HashMap hashMap) {
        String str;
        Object obj = jo4Var.a;
        if (obj != null && !hashMap.containsKey(obj) && (str = (String) this.k.get(obj)) != null) {
            hashMap.put(obj, str);
        }
    }

    public final void X(dt2 dt2Var, int i, Bundle bundle, boolean z) {
        if (dt2Var != null && bundle != null) {
            b(dt2Var, i, 31, new yv3(new fs0((Object) new hy1((byte) 2, bundle, z), (Object) new qi2((byte) 18), (byte) 10), (byte) 1));
        }
    }

    public final void Y(dt2 dt2Var, int i, IBinder iBinder, boolean z) {
        if (dt2Var != null && iBinder != null) {
            byte b = 1;
            b(dt2Var, i, 20, new yv3(new fs0((Object) new hy1(b, iBinder, z), (Object) new qi2((byte) 18), (byte) 10), b));
        }
    }

    public final ep4 Z(ep4 ep4Var) {
        fw3 fw3Var;
        hh6 hh6Var;
        boolean z;
        kf6 kf6Var = ep4Var.j;
        jo4 jo4Var = ep4Var.d;
        jo4 jo4Var2 = ep4Var.e;
        sk5 sk5Var = ep4Var.c;
        if (kf6Var.p()) {
            return ep4Var;
        }
        if (!Objects.equals(this.n, kf6Var) || (fw3Var = this.o) == null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            jf6 jf6Var = new jf6();
            for (int i = 0; i < kf6Var.o(); i++) {
                kf6Var.n(i, jf6Var);
                Object obj = jf6Var.a;
                if (obj != null && !hashMap.containsKey(obj)) {
                    String str = (String) this.k.get(jf6Var.a);
                    Object obj2 = jf6Var.a;
                    if (str == null) {
                        int i2 = this.m;
                        this.m = i2 + 1;
                        String str2 = eq6.a;
                        str = Integer.toString(i2, 36);
                    }
                    hashMap.put(obj2, str);
                }
            }
            hf6 hf6Var = new hf6();
            for (int i3 = 0; i3 < kf6Var.h(); i3++) {
                kf6Var.f(i3, hf6Var, true);
                Object obj3 = hf6Var.b;
                if (obj3 != null && !hashMap2.containsKey(obj3)) {
                    String str3 = (String) this.l.get(hf6Var.b);
                    Object obj4 = hf6Var.b;
                    if (str3 == null) {
                        int i4 = this.m;
                        this.m = i4 + 1;
                        String str4 = eq6.a;
                        str3 = Integer.toString(i4, 36);
                    }
                    hashMap2.put(obj4, str3);
                }
                Object obj5 = hf6Var.a;
                if (obj5 != null && !hashMap2.containsKey(obj5)) {
                    String str5 = (String) this.l.get(hf6Var.a);
                    Object obj6 = hf6Var.a;
                    if (str5 == null) {
                        int i5 = this.m;
                        this.m = i5 + 1;
                        String str6 = eq6.a;
                        str5 = Integer.toString(i5, 36);
                    }
                    hashMap2.put(obj6, str5);
                }
            }
            U(sk5Var.a, hashMap);
            U(jo4Var, hashMap);
            U(jo4Var2, hashMap);
            T(sk5Var.a, hashMap2);
            T(jo4Var, hashMap2);
            T(jo4Var2, hashMap2);
            this.k = cw2.j(hashMap);
            this.l = cw2.j(hashMap2);
            this.n = kf6Var;
            fw3Var = new fw3(kf6Var, this.k, this.l);
            this.o = fw3Var;
        }
        sk5 sk5Var2 = new sk5(a(sk5Var.a), sk5Var.b, sk5Var.c, sk5Var.d, sk5Var.e, sk5Var.f, sk5Var.g, sk5Var.h, sk5Var.i, sk5Var.j);
        jo4 a = a(jo4Var);
        jo4 a2 = a(jo4Var2);
        yx1 yx1Var = ep4Var.a;
        int i6 = ep4Var.b;
        int i7 = ep4Var.f;
        rn4 rn4Var = ep4Var.g;
        int i8 = ep4Var.h;
        boolean z2 = ep4Var.i;
        int i9 = ep4Var.k;
        hv6 hv6Var = ep4Var.l;
        jr3 jr3Var = ep4Var.m;
        float f = ep4Var.n;
        float f2 = ep4Var.o;
        int i10 = ep4Var.p;
        ru ruVar = ep4Var.q;
        c31 c31Var = ep4Var.r;
        rf1 rf1Var = ep4Var.s;
        int i11 = ep4Var.t;
        boolean z3 = ep4Var.u;
        boolean z4 = ep4Var.v;
        int i12 = ep4Var.w;
        boolean z5 = ep4Var.x;
        boolean z6 = ep4Var.y;
        int i13 = ep4Var.z;
        int i14 = ep4Var.A;
        jr3 jr3Var2 = ep4Var.B;
        long j = ep4Var.C;
        long j2 = ep4Var.D;
        long j3 = ep4Var.E;
        qh6 qh6Var = ep4Var.F;
        hh6 hh6Var2 = ep4Var.G;
        if (!fw3Var.p()) {
            hh6Var = hh6Var2;
            if (sk5Var2.a.b >= fw3Var.e.o()) {
                z = false;
                io3.B(z);
                return new ep4(yx1Var, i6, sk5Var2, a, a2, i7, rn4Var, i8, z2, hv6Var, fw3Var, i9, jr3Var, f, f2, ruVar, i10, c31Var, rf1Var, i11, z3, z4, i12, i13, i14, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            }
        } else {
            hh6Var = hh6Var2;
        }
        z = true;
        io3.B(z);
        return new ep4(yx1Var, i6, sk5Var2, a, a2, i7, rn4Var, i8, z2, hv6Var, fw3Var, i9, jr3Var, f, f2, ruVar, i10, c31Var, rf1Var, i11, z3, z4, i12, i13, i14, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
    }

    public final jo4 a(jo4 jo4Var) {
        Object obj;
        Object obj2 = jo4Var.a;
        if (obj2 == null) {
            obj2 = null;
            obj = null;
        } else {
            String str = (String) this.k.get(obj2);
            if (str != null) {
                obj2 = str;
            }
            obj = null;
        }
        int i = jo4Var.b;
        Object obj3 = obj;
        ar3 ar3Var = jo4Var.c;
        Object obj4 = jo4Var.d;
        if (obj4 != null) {
            Object obj5 = (String) this.l.get(obj4);
            if (obj5 == null) {
                obj5 = obj4;
            }
            obj3 = obj5;
        }
        return new jo4(obj2, i, ar3Var, obj3, jo4Var.e, jo4Var.f, jo4Var.g, jo4Var.h, jo4Var.i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eb2, bw2] */
    public final ep4 a0(ep4 ep4Var) {
        nw2 nw2Var = ep4Var.F.a;
        ?? eb2Var = new eb2(4);
        eb2 a = rw2.a();
        for (int i = 0; i < nw2Var.size(); i++) {
            yg6 yg6Var = ((ph6) nw2Var.get(i)).b;
            String str = (String) this.h.get(yg6Var);
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.j;
                this.j = i2 + 1;
                String str2 = eq6.a;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(yg6Var.b);
                str = sb.toString();
            }
            eb2Var.I(yg6Var, str);
            a.y(yg6Var.b, str);
        }
        this.h = eb2Var.g();
        this.i = a.e(false);
        jw2 k = nw2.k();
        for (int i3 = 0; i3 < nw2Var.size(); i3++) {
            ph6 ph6Var = (ph6) nw2Var.get(i3);
            k.c(new ph6(b0(ph6Var.b), ph6Var.c, ph6Var.d, ph6Var.e));
        }
        ep4 a2 = ep4Var.a(new qh6(k.g()));
        hh6 hh6Var = a2.G;
        if (hh6Var.H.isEmpty()) {
            return a2;
        }
        gh6 c = hh6Var.a().c();
        ho6 it = hh6Var.H.values().iterator();
        while (it.hasNext()) {
            dh6 dh6Var = (dh6) it.next();
            c.a(new dh6(b0(dh6Var.a), dh6Var.b));
        }
        return a2.d(c.b());
    }

    public final void b(dt2 dt2Var, int i, final int i2, final dw3 dw3Var) {
        K(dt2Var, i, new cw3() { // from class: vv3
            @Override // defpackage.cw3
            public final void a(dt3 dt3Var, int i3) {
                gw3.this.R(dt3Var, i3, i2, dw3Var);
            }
        });
    }

    public final yg6 b0(yg6 yg6Var) {
        String str;
        String str2 = (String) this.h.get(yg6Var);
        if (str2 == null) {
            str2 = yg6Var.b;
        }
        int i = 0;
        while (true) {
            int i2 = yg6Var.a;
            ea2[] ea2VarArr = yg6Var.d;
            if (i < i2) {
                if (ea2VarArr[i].n != null) {
                    ea2[] ea2VarArr2 = new ea2[i2];
                    for (int i3 = 0; i3 < yg6Var.a; i3++) {
                        ea2 ea2Var = ea2VarArr[i3];
                        String str3 = ea2Var.n;
                        if (str3 != null) {
                            str = (String) this.i.get(str3);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            da2 a = ea2Var.a();
                            a.m = str;
                            ea2VarArr2[i3] = new ea2(a);
                        } else {
                            ea2VarArr2[i3] = ea2Var;
                        }
                    }
                    return new yg6(str2, ea2VarArr2);
                }
                i++;
            } else {
                return new yg6(str2, ea2VarArr);
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        dt2 dt2Var;
        Bundle bundle;
        boolean z;
        final byte b = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        byte b2 = 7;
        final byte b3 = 3;
        final byte b4 = 6;
        byte b5 = 10;
        final byte b6 = 2;
        switch (i) {
            case 3002:
                dt2 a = gq3.a(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (a != null && readFloat >= 0.0f && readFloat <= 1.0f) {
                    b(a, readInt, 24, W(new ky1(readFloat, (byte) 2)));
                }
                return true;
            case 3003:
                dt2 a2 = gq3.a(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                if (a2 != null && readInt3 >= 0) {
                    b(a2, readInt2, 25, W(new x61(readInt3, b4)));
                    return true;
                }
                return true;
            case 3004:
                dt2 a3 = gq3.a(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                if (a3 != null) {
                    b(a3, readInt4, 26, W(new qi2((byte) 28)));
                    return true;
                }
                return true;
            case 3005:
                dt2 a4 = gq3.a(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                if (a4 != null) {
                    b(a4, readInt5, 26, W(new qi2((byte) 19)));
                    return true;
                }
                return true;
            case 3006:
                dt2 a5 = gq3.a(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                r12 = parcel.readInt() != 0;
                if (a5 != null) {
                    b(a5, readInt6, 26, W(new jy1((byte) 3, r12)));
                    return true;
                }
                return true;
            case 3007:
                X(gq3.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) nx7.Q(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                dt2 a6 = gq3.a(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                Bundle bundle2 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                long readLong = parcel.readLong();
                if (a6 != null && bundle2 != null) {
                    b(a6, readInt7, 31, new yv3(new fs0(new tv3(bundle2, readLong), new qi2((byte) 18), b5), b));
                    return true;
                }
                return true;
            case 3009:
                X(gq3.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) nx7.Q(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                Y(gq3.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                Y(gq3.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                dt2 a7 = gq3.a(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int readInt9 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (a7 != null && readStrongBinder != null && (readInt9 == -1 || readInt9 >= 0)) {
                    b(a7, readInt8, 20, new yv3(new fs0(new z61(readStrongBinder, readInt9, readLong2), new qi2((byte) 18), b5), b));
                    return true;
                }
                return true;
            case 3013:
                dt2 a8 = gq3.a(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                boolean z2 = parcel.readInt() != 0;
                if (a8 != null) {
                    b(a8, readInt10, 1, W(new jy1((byte) 2, z2)));
                    return true;
                }
                return true;
            case 3014:
                dt2 a9 = gq3.a(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                Bundle bundle3 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                if (a9 != null && bundle3 != null) {
                    try {
                        tk5 a10 = tk5.a(bundle3);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            bu3 bu3Var = (bu3) this.e.get();
                            if (bu3Var != null && !bu3Var.i()) {
                                Q(new rv3((byte) 0, readInt11, this, ((ct2) a9).e, a10));
                            }
                        } finally {
                        }
                    } catch (RuntimeException e) {
                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
                    }
                }
                return true;
            case 3015:
                dt2 a11 = gq3.a(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle4 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                WeakReference weakReference = this.e;
                bu3 bu3Var2 = (bu3) weakReference.get();
                if (a11 != null && bundle4 != null && bu3Var2 != null) {
                    try {
                        Context context = bu3Var2.f;
                        gw0 a12 = gw0.a(bundle4);
                        int callingUid = Binder.getCallingUid();
                        int callingPid = Binder.getCallingPid();
                        String str = a12.c;
                        String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                        if (packagesForUid != null && packagesForUid.length != 0) {
                            for (String str2 : packagesForUid) {
                                if (!str2.equals(str)) {
                                }
                            }
                            kb0.O("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                            v94.q(a11);
                        }
                        long clearCallingIdentity2 = Binder.clearCallingIdentity();
                        if (callingPid == 0) {
                            callingPid = a12.d;
                        }
                        try {
                            xu3 xu3Var = new xu3(str, callingPid, callingUid);
                            boolean k = af2.h(context).k(xu3Var);
                            int i3 = a12.a;
                            int i4 = a12.b;
                            dt3 dt3Var = new dt3(xu3Var, i3, i4, k, new zv3(a11, i4), a12.e);
                            bu3 bu3Var3 = (bu3) weakReference.get();
                            if (bu3Var3 != null && !bu3Var3.i()) {
                                this.g.add(dt3Var);
                                eq6.a0(bu3Var3.l, new es3(this, bu3Var3, dt3Var, a11, (byte) 6));
                            }
                            v94.q(a11);
                        } finally {
                        }
                    } catch (RuntimeException e2) {
                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e2);
                    }
                } else {
                    v94.q(a11);
                }
                return true;
            case 3016:
                dt2 a13 = gq3.a(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                O(a13, readInt12, (Bundle) nx7.Q(parcel, creator), (Bundle) nx7.Q(parcel, creator), false);
                return true;
            case 3017:
                dt2 a14 = gq3.a(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                if (a14 != null && (readInt14 == 2 || readInt14 == 0 || readInt14 == 1)) {
                    b(a14, readInt13, 15, W(new x61(readInt14, (byte) 5)));
                    return true;
                }
                return true;
            case 3018:
                dt2 a15 = gq3.a(parcel.readStrongBinder());
                int readInt15 = parcel.readInt();
                boolean z3 = parcel.readInt() != 0;
                if (a15 != null) {
                    b(a15, readInt15, 14, W(new jy1((byte) 4, z3)));
                    return true;
                }
                return true;
            case 3019:
                dt2 a16 = gq3.a(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                int readInt17 = parcel.readInt();
                if (a16 != null && readInt17 >= 0) {
                    b(a16, readInt16, 20, new h5((Object) new hv3(this, readInt17, (byte) 0), (byte) 29));
                    return true;
                }
                return true;
            case 3020:
                dt2 a17 = gq3.a(parcel.readStrongBinder());
                int readInt18 = parcel.readInt();
                int readInt19 = parcel.readInt();
                int readInt20 = parcel.readInt();
                if (a17 != null && readInt19 >= 0 && readInt20 >= readInt19) {
                    b(a17, readInt18, 20, new h5((Object) new gv3(this, readInt19, readInt20), (byte) 29));
                    return true;
                }
                return true;
            case 3021:
                dt2 a18 = gq3.a(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (a18 != null) {
                    b(a18, readInt21, 20, W(new ov3((byte) 11)));
                    return true;
                }
                return true;
            case 3022:
                dt2 a19 = gq3.a(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                int readInt23 = parcel.readInt();
                int readInt24 = parcel.readInt();
                if (a19 != null && readInt23 >= 0 && readInt24 >= 0) {
                    b(a19, readInt22, 20, W(new gy1(readInt23, readInt24, (byte) 3)));
                    return true;
                }
                return true;
            case 3023:
                dt2 a20 = gq3.a(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                final int readInt26 = parcel.readInt();
                final int readInt27 = parcel.readInt();
                final int readInt28 = parcel.readInt();
                if (a20 != null && readInt26 >= 0 && readInt27 >= readInt26 && readInt28 >= 0) {
                    b(a20, readInt25, 20, W(new ay0() { // from class: pv3
                        @Override // defpackage.ay0
                        public final void accept(Object obj) {
                            ((fq4) obj).B0(readInt26, readInt27, readInt28);
                        }
                    }));
                    return true;
                }
                return true;
            case 3024:
                dt2 a21 = gq3.a(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                if (a21 != null) {
                    K(a21, readInt29, new cw3(this) { // from class: kv3
                        public final /* synthetic */ gw3 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.cw3
                        public final void a(dt3 dt3Var2, int i5) {
                            byte b7 = b;
                            gw3 gw3Var = this.b;
                            switch (b7) {
                                case 0:
                                    gw3Var.R(dt3Var2, i5, 11, gw3.W(new qi2((byte) 29)));
                                    return;
                                case 1:
                                    gw3Var.P(dt3Var2, i5);
                                    return;
                                case 2:
                                    gw3Var.R(dt3Var2, i5, 3, gw3.W(new qi2((byte) 17)));
                                    return;
                                case 3:
                                    gw3Var.R(dt3Var2, i5, 12, gw3.W(new ov3((byte) 13)));
                                    return;
                                case 4:
                                    gw3Var.R(dt3Var2, i5, 1, gw3.W(new qi2((byte) 23)));
                                    return;
                                case 5:
                                    gw3Var.R(dt3Var2, i5, 9, gw3.W(new qi2((byte) 16)));
                                    return;
                                default:
                                    gw3Var.R(dt3Var2, i5, 7, gw3.W(new ov3((byte) 1)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3025:
                dt2 a22 = gq3.a(parcel.readStrongBinder());
                int readInt30 = parcel.readInt();
                if (a22 != null) {
                    final byte b7 = 4;
                    K(a22, readInt30, new cw3(this) { // from class: kv3
                        public final /* synthetic */ gw3 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.cw3
                        public final void a(dt3 dt3Var2, int i5) {
                            byte b72 = b7;
                            gw3 gw3Var = this.b;
                            switch (b72) {
                                case 0:
                                    gw3Var.R(dt3Var2, i5, 11, gw3.W(new qi2((byte) 29)));
                                    return;
                                case 1:
                                    gw3Var.P(dt3Var2, i5);
                                    return;
                                case 2:
                                    gw3Var.R(dt3Var2, i5, 3, gw3.W(new qi2((byte) 17)));
                                    return;
                                case 3:
                                    gw3Var.R(dt3Var2, i5, 12, gw3.W(new ov3((byte) 13)));
                                    return;
                                case 4:
                                    gw3Var.R(dt3Var2, i5, 1, gw3.W(new qi2((byte) 23)));
                                    return;
                                case 5:
                                    gw3Var.R(dt3Var2, i5, 9, gw3.W(new qi2((byte) 16)));
                                    return;
                                default:
                                    gw3Var.R(dt3Var2, i5, 7, gw3.W(new ov3((byte) 1)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3026:
                dt2 a23 = gq3.a(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                if (a23 != null) {
                    b(a23, readInt31, 2, W(new ov3((byte) 9)));
                    return true;
                }
                return true;
            case 3027:
                dt2 a24 = gq3.a(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                Bundle bundle5 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                if (a24 != null && bundle5 != null) {
                    try {
                        b(a24, readInt32, 13, W(new nv3(new rn4(bundle5.getFloat(rn4.e, 1.0f), bundle5.getFloat(rn4.f, 1.0f)))));
                    } catch (RuntimeException e3) {
                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e3);
                    }
                }
                return true;
            case 3028:
                dt2 a25 = gq3.a(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                float readFloat2 = parcel.readFloat();
                if (a25 != null && readFloat2 > 0.0f) {
                    b(a25, readInt33, 13, W(new ky1(readFloat2, (byte) 1)));
                    return true;
                }
                return true;
            case 3029:
                dt2 a26 = gq3.a(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                final Bundle bundle6 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                if (a26 != null && bundle6 != null) {
                    b(a26, readInt34, 20, new yv3(new fs0(new dw3() { // from class: mv3
                        @Override // defpackage.dw3
                        public final Object j(bu3 bu3Var4, dt3 dt3Var2, int i5) {
                            byte b8 = b6;
                            Bundle bundle7 = bundle6;
                            switch (b8) {
                                case 0:
                                    try {
                                        return bu3Var4.k(dt3Var2, nw2.s(ar3.b(dt3Var2.c, bundle7)));
                                    } catch (RuntimeException e4) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return wc7.v(e4);
                                    }
                                case 1:
                                    try {
                                        return bu3Var4.k(dt3Var2, nw2.s(ar3.b(dt3Var2.c, bundle7)));
                                    } catch (RuntimeException e5) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return wc7.v(e5);
                                    }
                                case 2:
                                    try {
                                        return bu3Var4.k(dt3Var2, nw2.s(ar3.b(dt3Var2.c, bundle7)));
                                    } catch (RuntimeException e6) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return wc7.v(e6);
                                    }
                                default:
                                    try {
                                        jr3 b9 = jr3.b(dt3Var2.c, bundle7);
                                        bu3Var4.t();
                                        bu3Var4.t.o0(b9);
                                        return wc7.w(new tk5(0));
                                    } catch (RuntimeException e7) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return wc7.v(e7);
                                    }
                            }
                        }
                    }, new ov3((byte) 5), b4), b));
                    return true;
                }
                return true;
            case 3030:
                dt2 a27 = gq3.a(parcel.readStrongBinder());
                int readInt35 = parcel.readInt();
                int readInt36 = parcel.readInt();
                final Bundle bundle7 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                if (a27 != null && bundle7 != null && readInt36 >= 0) {
                    final byte b8 = r12 ? (byte) 1 : (byte) 0;
                    b(a27, readInt35, 20, new yv3(new fs0(new dw3() { // from class: mv3
                        @Override // defpackage.dw3
                        public final Object j(bu3 bu3Var4, dt3 dt3Var2, int i5) {
                            byte b82 = b8;
                            Bundle bundle72 = bundle7;
                            switch (b82) {
                                case 0:
                                    try {
                                        return bu3Var4.k(dt3Var2, nw2.s(ar3.b(dt3Var2.c, bundle72)));
                                    } catch (RuntimeException e4) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return wc7.v(e4);
                                    }
                                case 1:
                                    try {
                                        return bu3Var4.k(dt3Var2, nw2.s(ar3.b(dt3Var2.c, bundle72)));
                                    } catch (RuntimeException e5) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return wc7.v(e5);
                                    }
                                case 2:
                                    try {
                                        return bu3Var4.k(dt3Var2, nw2.s(ar3.b(dt3Var2.c, bundle72)));
                                    } catch (RuntimeException e6) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return wc7.v(e6);
                                    }
                                default:
                                    try {
                                        jr3 b9 = jr3.b(dt3Var2.c, bundle72);
                                        bu3Var4.t();
                                        bu3Var4.t.o0(b9);
                                        return wc7.w(new tk5(0));
                                    } catch (RuntimeException e7) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return wc7.v(e7);
                                    }
                            }
                        }
                    }, new hv3(this, readInt36, (byte) 2), b4), b));
                    return true;
                }
                return true;
            case 3031:
                dt2 a28 = gq3.a(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                final IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (a28 != null && readStrongBinder2 != null) {
                    b(a28, readInt37, 20, new yv3(new fs0(new dw3() { // from class: jv3
                        @Override // defpackage.dw3
                        public final Object j(bu3 bu3Var4, dt3 dt3Var2, int i5) {
                            byte b9 = b6;
                            int i6 = 0;
                            IBinder iBinder = readStrongBinder2;
                            switch (b9) {
                                case 0:
                                    try {
                                        nw2 a29 = lb0.a(iBinder);
                                        jw2 k2 = nw2.k();
                                        while (i6 < a29.size()) {
                                            Bundle bundle8 = (Bundle) a29.get(i6);
                                            bundle8.getClass();
                                            k2.c(ar3.b(dt3Var2.c, bundle8));
                                            i6++;
                                        }
                                        return bu3Var4.k(dt3Var2, k2.g());
                                    } catch (RuntimeException e4) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return wc7.v(e4);
                                    }
                                case 1:
                                    try {
                                        nw2 a30 = lb0.a(iBinder);
                                        jw2 k3 = nw2.k();
                                        while (i6 < a30.size()) {
                                            Bundle bundle9 = (Bundle) a30.get(i6);
                                            bundle9.getClass();
                                            k3.c(ar3.b(dt3Var2.c, bundle9));
                                            i6++;
                                        }
                                        return bu3Var4.k(dt3Var2, k3.g());
                                    } catch (RuntimeException e5) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return wc7.v(e5);
                                    }
                                default:
                                    try {
                                        nw2 a31 = lb0.a(iBinder);
                                        jw2 k4 = nw2.k();
                                        while (i6 < a31.size()) {
                                            Bundle bundle10 = (Bundle) a31.get(i6);
                                            bundle10.getClass();
                                            k4.c(ar3.b(dt3Var2.c, bundle10));
                                            i6++;
                                        }
                                        return bu3Var4.k(dt3Var2, k4.g());
                                    } catch (RuntimeException e6) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return wc7.v(e6);
                                    }
                            }
                        }
                    }, new ov3((byte) 4), b4), b));
                    return true;
                }
                return true;
            case 3032:
                dt2 a29 = gq3.a(parcel.readStrongBinder());
                int readInt38 = parcel.readInt();
                int readInt39 = parcel.readInt();
                final IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (a29 != null && readStrongBinder3 != null && readInt39 >= 0) {
                    b(a29, readInt38, 20, new yv3(new fs0(new dw3() { // from class: jv3
                        @Override // defpackage.dw3
                        public final Object j(bu3 bu3Var4, dt3 dt3Var2, int i5) {
                            byte b9 = b;
                            int i6 = 0;
                            IBinder iBinder = readStrongBinder3;
                            switch (b9) {
                                case 0:
                                    try {
                                        nw2 a292 = lb0.a(iBinder);
                                        jw2 k2 = nw2.k();
                                        while (i6 < a292.size()) {
                                            Bundle bundle8 = (Bundle) a292.get(i6);
                                            bundle8.getClass();
                                            k2.c(ar3.b(dt3Var2.c, bundle8));
                                            i6++;
                                        }
                                        return bu3Var4.k(dt3Var2, k2.g());
                                    } catch (RuntimeException e4) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return wc7.v(e4);
                                    }
                                case 1:
                                    try {
                                        nw2 a30 = lb0.a(iBinder);
                                        jw2 k3 = nw2.k();
                                        while (i6 < a30.size()) {
                                            Bundle bundle9 = (Bundle) a30.get(i6);
                                            bundle9.getClass();
                                            k3.c(ar3.b(dt3Var2.c, bundle9));
                                            i6++;
                                        }
                                        return bu3Var4.k(dt3Var2, k3.g());
                                    } catch (RuntimeException e5) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return wc7.v(e5);
                                    }
                                default:
                                    try {
                                        nw2 a31 = lb0.a(iBinder);
                                        jw2 k4 = nw2.k();
                                        while (i6 < a31.size()) {
                                            Bundle bundle10 = (Bundle) a31.get(i6);
                                            bundle10.getClass();
                                            k4.c(ar3.b(dt3Var2.c, bundle10));
                                            i6++;
                                        }
                                        return bu3Var4.k(dt3Var2, k4.g());
                                    } catch (RuntimeException e6) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return wc7.v(e6);
                                    }
                            }
                        }
                    }, new hv3(this, readInt39, (byte) 4), b4), b));
                    return true;
                }
                return true;
            case 3033:
                dt2 a30 = gq3.a(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                final Bundle bundle8 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                if (a30 != null && bundle8 != null) {
                    b(a30, readInt40, 19, new yv3(new dw3() { // from class: mv3
                        @Override // defpackage.dw3
                        public final Object j(bu3 bu3Var4, dt3 dt3Var2, int i5) {
                            byte b82 = b3;
                            Bundle bundle72 = bundle8;
                            switch (b82) {
                                case 0:
                                    try {
                                        return bu3Var4.k(dt3Var2, nw2.s(ar3.b(dt3Var2.c, bundle72)));
                                    } catch (RuntimeException e4) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return wc7.v(e4);
                                    }
                                case 1:
                                    try {
                                        return bu3Var4.k(dt3Var2, nw2.s(ar3.b(dt3Var2.c, bundle72)));
                                    } catch (RuntimeException e5) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return wc7.v(e5);
                                    }
                                case 2:
                                    try {
                                        return bu3Var4.k(dt3Var2, nw2.s(ar3.b(dt3Var2.c, bundle72)));
                                    } catch (RuntimeException e6) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return wc7.v(e6);
                                    }
                                default:
                                    try {
                                        jr3 b9 = jr3.b(dt3Var2.c, bundle72);
                                        bu3Var4.t();
                                        bu3Var4.t.o0(b9);
                                        return wc7.w(new tk5(0));
                                    } catch (RuntimeException e7) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return wc7.v(e7);
                                    }
                            }
                        }
                    }, b));
                    return true;
                }
                return true;
            case 3034:
                dt2 a31 = gq3.a(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (a31 != null) {
                    K(a31, readInt41, new cw3(this) { // from class: kv3
                        public final /* synthetic */ gw3 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.cw3
                        public final void a(dt3 dt3Var2, int i5) {
                            byte b72 = b6;
                            gw3 gw3Var = this.b;
                            switch (b72) {
                                case 0:
                                    gw3Var.R(dt3Var2, i5, 11, gw3.W(new qi2((byte) 29)));
                                    return;
                                case 1:
                                    gw3Var.P(dt3Var2, i5);
                                    return;
                                case 2:
                                    gw3Var.R(dt3Var2, i5, 3, gw3.W(new qi2((byte) 17)));
                                    return;
                                case 3:
                                    gw3Var.R(dt3Var2, i5, 12, gw3.W(new ov3((byte) 13)));
                                    return;
                                case 4:
                                    gw3Var.R(dt3Var2, i5, 1, gw3.W(new qi2((byte) 23)));
                                    return;
                                case 5:
                                    gw3Var.R(dt3Var2, i5, 9, gw3.W(new qi2((byte) 16)));
                                    return;
                                default:
                                    gw3Var.R(dt3Var2, i5, 7, gw3.W(new ov3((byte) 1)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3035:
                dt2 a32 = gq3.a(parcel.readStrongBinder());
                parcel.readInt();
                if (a32 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        bu3 bu3Var4 = (bu3) this.e.get();
                        if (bu3Var4 != null && !bu3Var4.i()) {
                            final IBinder iBinder = ((ct2) a32).e;
                            final byte b9 = r12 ? (byte) 1 : (byte) 0;
                            Q(new Runnable(this) { // from class: iv3
                                public final /* synthetic */ gw3 y;

                                {
                                    this.y = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b10 = b9;
                                    IBinder iBinder2 = iBinder;
                                    gw3 gw3Var = this.y;
                                    switch (b10) {
                                        case 0:
                                            st3 st3Var = gw3Var.f;
                                            st3Var.M();
                                            dt3 q = st3Var.q(iBinder2);
                                            if (q != null) {
                                                st3Var.D(q);
                                                return;
                                            }
                                            return;
                                        default:
                                            st3 st3Var2 = gw3Var.f;
                                            dt3 q2 = st3Var2.q(iBinder2);
                                            if (q2 != null) {
                                                st3Var2.n(q2);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                return true;
            case 3036:
                dt2 a33 = gq3.a(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (a33 != null) {
                    b(a33, readInt42, 4, W(new qi2((byte) 20)));
                    return true;
                }
                return true;
            case 3037:
                dt2 a34 = gq3.a(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                int readInt44 = parcel.readInt();
                if (a34 != null && readInt44 >= 0) {
                    b(a34, readInt43, 10, new h5((Object) new hv3(this, readInt44, (byte) 1), (byte) 29));
                    return true;
                }
                return true;
            case 3038:
                dt2 a35 = gq3.a(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                long readLong3 = parcel.readLong();
                if (a35 != null) {
                    b(a35, readInt45, 5, W(new tw(readLong3)));
                    return true;
                }
                return true;
            case 3039:
                dt2 a36 = gq3.a(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                int readInt47 = parcel.readInt();
                long readLong4 = parcel.readLong();
                if (a36 != null && readInt47 >= 0) {
                    b(a36, readInt46, 10, new h5((Object) new z61(this, readInt47, readLong4), (byte) 29));
                    return true;
                }
                return true;
            case 3040:
                dt2 a37 = gq3.a(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                if (a37 != null) {
                    final byte b10 = r12 ? (byte) 1 : (byte) 0;
                    K(a37, readInt48, new cw3(this) { // from class: kv3
                        public final /* synthetic */ gw3 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.cw3
                        public final void a(dt3 dt3Var2, int i5) {
                            byte b72 = b10;
                            gw3 gw3Var = this.b;
                            switch (b72) {
                                case 0:
                                    gw3Var.R(dt3Var2, i5, 11, gw3.W(new qi2((byte) 29)));
                                    return;
                                case 1:
                                    gw3Var.P(dt3Var2, i5);
                                    return;
                                case 2:
                                    gw3Var.R(dt3Var2, i5, 3, gw3.W(new qi2((byte) 17)));
                                    return;
                                case 3:
                                    gw3Var.R(dt3Var2, i5, 12, gw3.W(new ov3((byte) 13)));
                                    return;
                                case 4:
                                    gw3Var.R(dt3Var2, i5, 1, gw3.W(new qi2((byte) 23)));
                                    return;
                                case 5:
                                    gw3Var.R(dt3Var2, i5, 9, gw3.W(new qi2((byte) 16)));
                                    return;
                                default:
                                    gw3Var.R(dt3Var2, i5, 7, gw3.W(new ov3((byte) 1)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3041:
                dt2 a38 = gq3.a(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                if (a38 != null) {
                    K(a38, readInt49, new cw3(this) { // from class: kv3
                        public final /* synthetic */ gw3 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.cw3
                        public final void a(dt3 dt3Var2, int i5) {
                            byte b72 = b3;
                            gw3 gw3Var = this.b;
                            switch (b72) {
                                case 0:
                                    gw3Var.R(dt3Var2, i5, 11, gw3.W(new qi2((byte) 29)));
                                    return;
                                case 1:
                                    gw3Var.P(dt3Var2, i5);
                                    return;
                                case 2:
                                    gw3Var.R(dt3Var2, i5, 3, gw3.W(new qi2((byte) 17)));
                                    return;
                                case 3:
                                    gw3Var.R(dt3Var2, i5, 12, gw3.W(new ov3((byte) 13)));
                                    return;
                                case 4:
                                    gw3Var.R(dt3Var2, i5, 1, gw3.W(new qi2((byte) 23)));
                                    return;
                                case 5:
                                    gw3Var.R(dt3Var2, i5, 9, gw3.W(new qi2((byte) 16)));
                                    return;
                                default:
                                    gw3Var.R(dt3Var2, i5, 7, gw3.W(new ov3((byte) 1)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3042:
                dt2 a39 = gq3.a(parcel.readStrongBinder());
                int readInt50 = parcel.readInt();
                if (a39 != null) {
                    b(a39, readInt50, 6, W(new ov3((byte) 0)));
                    return true;
                }
                return true;
            case 3043:
                dt2 a40 = gq3.a(parcel.readStrongBinder());
                int readInt51 = parcel.readInt();
                if (a40 != null) {
                    b(a40, readInt51, 8, W(new qi2((byte) 26)));
                    return true;
                }
                return true;
            case 3044:
                dt2 a41 = gq3.a(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                Surface surface = (Surface) nx7.Q(parcel, Surface.CREATOR);
                if (a41 != null) {
                    b(a41, readInt52, 27, W(new fs0((Object) this, (Object) surface, (byte) 9)));
                    return true;
                }
                return true;
            case 3045:
                dt2 a42 = gq3.a(parcel.readStrongBinder());
                if (a42 != null) {
                    long clearCallingIdentity4 = Binder.clearCallingIdentity();
                    try {
                        bu3 bu3Var5 = (bu3) this.e.get();
                        if (bu3Var5 != null && !bu3Var5.i()) {
                            final IBinder iBinder2 = ((ct2) a42).e;
                            Q(new Runnable(this) { // from class: iv3
                                public final /* synthetic */ gw3 y;

                                {
                                    this.y = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b102 = b;
                                    IBinder iBinder22 = iBinder2;
                                    gw3 gw3Var = this.y;
                                    switch (b102) {
                                        case 0:
                                            st3 st3Var = gw3Var.f;
                                            st3Var.M();
                                            dt3 q = st3Var.q(iBinder22);
                                            if (q != null) {
                                                st3Var.D(q);
                                                return;
                                            }
                                            return;
                                        default:
                                            st3 st3Var2 = gw3Var.f;
                                            dt3 q2 = st3Var2.q(iBinder22);
                                            if (q2 != null) {
                                                st3Var2.n(q2);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                return true;
            case 3046:
                dt2 a43 = gq3.a(parcel.readStrongBinder());
                int readInt53 = parcel.readInt();
                if (a43 != null) {
                    K(a43, readInt53, new cw3(this) { // from class: kv3
                        public final /* synthetic */ gw3 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.cw3
                        public final void a(dt3 dt3Var2, int i5) {
                            byte b72 = b4;
                            gw3 gw3Var = this.b;
                            switch (b72) {
                                case 0:
                                    gw3Var.R(dt3Var2, i5, 11, gw3.W(new qi2((byte) 29)));
                                    return;
                                case 1:
                                    gw3Var.P(dt3Var2, i5);
                                    return;
                                case 2:
                                    gw3Var.R(dt3Var2, i5, 3, gw3.W(new qi2((byte) 17)));
                                    return;
                                case 3:
                                    gw3Var.R(dt3Var2, i5, 12, gw3.W(new ov3((byte) 13)));
                                    return;
                                case 4:
                                    gw3Var.R(dt3Var2, i5, 1, gw3.W(new qi2((byte) 23)));
                                    return;
                                case 5:
                                    gw3Var.R(dt3Var2, i5, 9, gw3.W(new qi2((byte) 16)));
                                    return;
                                default:
                                    gw3Var.R(dt3Var2, i5, 7, gw3.W(new ov3((byte) 1)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3047:
                dt2 a44 = gq3.a(parcel.readStrongBinder());
                int readInt54 = parcel.readInt();
                if (a44 != null) {
                    final byte b11 = 5;
                    K(a44, readInt54, new cw3(this) { // from class: kv3
                        public final /* synthetic */ gw3 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.cw3
                        public final void a(dt3 dt3Var2, int i5) {
                            byte b72 = b11;
                            gw3 gw3Var = this.b;
                            switch (b72) {
                                case 0:
                                    gw3Var.R(dt3Var2, i5, 11, gw3.W(new qi2((byte) 29)));
                                    return;
                                case 1:
                                    gw3Var.P(dt3Var2, i5);
                                    return;
                                case 2:
                                    gw3Var.R(dt3Var2, i5, 3, gw3.W(new qi2((byte) 17)));
                                    return;
                                case 3:
                                    gw3Var.R(dt3Var2, i5, 12, gw3.W(new ov3((byte) 13)));
                                    return;
                                case 4:
                                    gw3Var.R(dt3Var2, i5, 1, gw3.W(new qi2((byte) 23)));
                                    return;
                                case 5:
                                    gw3Var.R(dt3Var2, i5, 9, gw3.W(new qi2((byte) 16)));
                                    return;
                                default:
                                    gw3Var.R(dt3Var2, i5, 7, gw3.W(new ov3((byte) 1)));
                                    return;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3048:
                dt2 a45 = gq3.a(parcel.readStrongBinder());
                int readInt55 = parcel.readInt();
                Bundle bundle9 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                if (a45 != null && bundle9 != null) {
                    try {
                        b(a45, readInt55, 29, W(new fs0(this, hh6.b(bundle9), b2)));
                    } catch (RuntimeException e4) {
                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e4);
                    }
                }
                return true;
            case 3049:
                dt2 a46 = gq3.a(parcel.readStrongBinder());
                int readInt56 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle10 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                if (a46 != null && readString != null && bundle10 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        kb0.O("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            L(a46, readInt56, null, 40010, new yv3(new ov3(readString, yx4.a(bundle10), (byte) 3), b));
                        } catch (RuntimeException e5) {
                            kb0.P("MediaSessionStub", "Ignoring malformed Bundle for Rating", e5);
                        }
                    }
                }
                return true;
            case 3050:
                dt2 a47 = gq3.a(parcel.readStrongBinder());
                int readInt57 = parcel.readInt();
                Bundle bundle11 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                if (a47 != null && bundle11 != null) {
                    try {
                        L(a47, readInt57, null, 40010, new yv3(new qi2(yx4.a(bundle11), (byte) 21), b));
                    } catch (RuntimeException e6) {
                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for Rating", e6);
                    }
                }
                return true;
            case 3051:
                dt2 a48 = gq3.a(parcel.readStrongBinder());
                int readInt58 = parcel.readInt();
                int readInt59 = parcel.readInt();
                int readInt60 = parcel.readInt();
                if (a48 != null && readInt59 >= 0) {
                    b(a48, readInt58, 33, W(new gy1(readInt59, readInt60, (byte) 2)));
                    return true;
                }
                return true;
            case 3052:
                dt2 a49 = gq3.a(parcel.readStrongBinder());
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                if (a49 != null) {
                    b(a49, readInt61, 34, W(new x61(readInt62, (byte) 4)));
                    return true;
                }
                return true;
            case 3053:
                dt2 a50 = gq3.a(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                int readInt64 = parcel.readInt();
                if (a50 != null) {
                    b(a50, readInt63, 34, W(new x61(readInt64, b3)));
                    return true;
                }
                return true;
            case 3054:
                dt2 a51 = gq3.a(parcel.readStrongBinder());
                int readInt65 = parcel.readInt();
                boolean z4 = parcel.readInt() != 0;
                int readInt66 = parcel.readInt();
                if (a51 != null) {
                    b(a51, readInt65, 34, W(new sv3(z4, readInt66, (byte) 0)));
                    return true;
                }
                return true;
            case 3055:
                dt2 a52 = gq3.a(parcel.readStrongBinder());
                int readInt67 = parcel.readInt();
                int readInt68 = parcel.readInt();
                final Bundle bundle12 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                if (a52 != null && bundle12 != null && readInt68 >= 0) {
                    b(a52, readInt67, 20, new yv3(new fs0(new dw3() { // from class: mv3
                        @Override // defpackage.dw3
                        public final Object j(bu3 bu3Var42, dt3 dt3Var2, int i5) {
                            byte b82 = b;
                            Bundle bundle72 = bundle12;
                            switch (b82) {
                                case 0:
                                    try {
                                        return bu3Var42.k(dt3Var2, nw2.s(ar3.b(dt3Var2.c, bundle72)));
                                    } catch (RuntimeException e42) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e42);
                                        return wc7.v(e42);
                                    }
                                case 1:
                                    try {
                                        return bu3Var42.k(dt3Var2, nw2.s(ar3.b(dt3Var2.c, bundle72)));
                                    } catch (RuntimeException e52) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e52);
                                        return wc7.v(e52);
                                    }
                                case 2:
                                    try {
                                        return bu3Var42.k(dt3Var2, nw2.s(ar3.b(dt3Var2.c, bundle72)));
                                    } catch (RuntimeException e62) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e62);
                                        return wc7.v(e62);
                                    }
                                default:
                                    try {
                                        jr3 b92 = jr3.b(dt3Var2.c, bundle72);
                                        bu3Var42.t();
                                        bu3Var42.t.o0(b92);
                                        return wc7.w(new tk5(0));
                                    } catch (RuntimeException e7) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return wc7.v(e7);
                                    }
                            }
                        }
                    }, new hv3(this, readInt68, (byte) 3), b4), b));
                    return true;
                }
                return true;
            case 3056:
                dt2 a53 = gq3.a(parcel.readStrongBinder());
                int readInt69 = parcel.readInt();
                int readInt70 = parcel.readInt();
                int readInt71 = parcel.readInt();
                final IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (a53 != null && readStrongBinder4 != null && readInt70 >= 0 && readInt71 >= readInt70) {
                    final byte b12 = r12 ? (byte) 1 : (byte) 0;
                    b(a53, readInt69, 20, new yv3(new fs0(new dw3() { // from class: jv3
                        @Override // defpackage.dw3
                        public final Object j(bu3 bu3Var42, dt3 dt3Var2, int i5) {
                            byte b92 = b12;
                            int i6 = 0;
                            IBinder iBinder3 = readStrongBinder4;
                            switch (b92) {
                                case 0:
                                    try {
                                        nw2 a292 = lb0.a(iBinder3);
                                        jw2 k2 = nw2.k();
                                        while (i6 < a292.size()) {
                                            Bundle bundle82 = (Bundle) a292.get(i6);
                                            bundle82.getClass();
                                            k2.c(ar3.b(dt3Var2.c, bundle82));
                                            i6++;
                                        }
                                        return bu3Var42.k(dt3Var2, k2.g());
                                    } catch (RuntimeException e42) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e42);
                                        return wc7.v(e42);
                                    }
                                case 1:
                                    try {
                                        nw2 a302 = lb0.a(iBinder3);
                                        jw2 k3 = nw2.k();
                                        while (i6 < a302.size()) {
                                            Bundle bundle92 = (Bundle) a302.get(i6);
                                            bundle92.getClass();
                                            k3.c(ar3.b(dt3Var2.c, bundle92));
                                            i6++;
                                        }
                                        return bu3Var42.k(dt3Var2, k3.g());
                                    } catch (RuntimeException e52) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e52);
                                        return wc7.v(e52);
                                    }
                                default:
                                    try {
                                        nw2 a312 = lb0.a(iBinder3);
                                        jw2 k4 = nw2.k();
                                        while (i6 < a312.size()) {
                                            Bundle bundle102 = (Bundle) a312.get(i6);
                                            bundle102.getClass();
                                            k4.c(ar3.b(dt3Var2.c, bundle102));
                                            i6++;
                                        }
                                        return bu3Var42.k(dt3Var2, k4.g());
                                    } catch (RuntimeException e62) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e62);
                                        return wc7.v(e62);
                                    }
                            }
                        }
                    }, new gv3(this, readInt70, readInt71), b4), b));
                    return true;
                }
                return true;
            case 3057:
                dt2 a54 = gq3.a(parcel.readStrongBinder());
                int readInt72 = parcel.readInt();
                Bundle bundle13 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                boolean z5 = parcel.readInt() != 0;
                if (a54 != null && bundle13 != null) {
                    try {
                        b(a54, readInt72, 35, W(new hy1(b3, ru.a(bundle13), z5)));
                    } catch (RuntimeException e7) {
                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e7);
                    }
                }
                return true;
            case 3058:
                dt2 a55 = gq3.a(parcel.readStrongBinder());
                int readInt73 = parcel.readInt();
                if (a55 != null) {
                    b(a55, readInt73, 24, W(new qi2((byte) 25)));
                    return true;
                }
                return true;
            case 3059:
                dt2 a56 = gq3.a(parcel.readStrongBinder());
                int readInt74 = parcel.readInt();
                if (a56 != null) {
                    b(a56, readInt74, 24, W(new ov3((byte) 7)));
                    return true;
                }
                return true;
            case 3060:
                dt2 a57 = gq3.a(parcel.readStrongBinder());
                int readInt75 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle14 = (Bundle) nx7.Q(parcel, creator2);
                Bundle bundle15 = (Bundle) nx7.Q(parcel, creator2);
                if (parcel.readInt() != 0) {
                    dt2Var = a57;
                    bundle = bundle14;
                    z = true;
                } else {
                    dt2Var = a57;
                    bundle = bundle14;
                    z = false;
                }
                O(dt2Var, readInt75, bundle, bundle15, z);
                return true;
            case 3061:
                dt2 a58 = gq3.a(parcel.readStrongBinder());
                int readInt76 = parcel.readInt();
                final Surface surface2 = (Surface) nx7.Q(parcel, Surface.CREATOR);
                final int readInt77 = parcel.readInt();
                final int readInt78 = parcel.readInt();
                if (a58 != null) {
                    b(a58, readInt76, 27, W(new ay0() { // from class: lv3
                        @Override // defpackage.ay0
                        public final void accept(Object obj) {
                            fq4 fq4Var = (fq4) obj;
                            gw3 gw3Var = gw3.this;
                            ((bu3) gw3Var.e.get()).getClass();
                            Surface surface3 = surface2;
                            if (surface3 == null) {
                                fq4Var.T(null);
                                gw3Var.p = null;
                            } else {
                                ew3 ew3Var = new ew3(surface3, readInt77, readInt78);
                                gw3Var.p = ew3Var;
                                fq4Var.T(ew3Var);
                            }
                        }
                    }));
                    return true;
                }
                return true;
            case 3062:
                dt2 a59 = gq3.a(parcel.readStrongBinder());
                int readInt79 = parcel.readInt();
                int readInt80 = parcel.readInt();
                int readInt81 = parcel.readInt();
                if (a59 != null) {
                    b(a59, readInt79, 27, W(new gv3(this, readInt80, readInt81)));
                    return true;
                }
                return true;
            default:
                dr3 dr3Var = null;
                switch (i) {
                    case 4001:
                        dt2 a60 = gq3.a(parcel.readStrongBinder());
                        int readInt82 = parcel.readInt();
                        Bundle bundle16 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                        if (a60 != null) {
                            if (bundle16 != null) {
                                try {
                                    dr3Var = dr3.a(bundle16);
                                } catch (RuntimeException e8) {
                                    kb0.P("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e8);
                                }
                            }
                            L(a60, readInt82, null, 50000, new yv3(new ov3(dr3Var, (byte) 8), r12 ? (byte) 1 : (byte) 0));
                        }
                        return true;
                    case 4002:
                        dt2 a61 = gq3.a(parcel.readStrongBinder());
                        int readInt83 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (a61 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                kb0.O("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            L(a61, readInt83, null, 50004, new yv3(new ov3(readString2, (byte) 2), r12 ? (byte) 1 : (byte) 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        dt2 a62 = gq3.a(parcel.readStrongBinder());
                        int readInt84 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt85 = parcel.readInt();
                        int readInt86 = parcel.readInt();
                        Bundle bundle17 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                        if (a62 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                kb0.O("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (readInt85 < 0) {
                                kb0.O("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (readInt86 < 1) {
                                kb0.O("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle17 != null) {
                                    try {
                                        dr3Var = dr3.a(bundle17);
                                    } catch (RuntimeException e9) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e9);
                                    }
                                }
                                L(a62, readInt84, null, 50003, new yv3(new qi2(readString3, readInt85, readInt86, dr3Var), r12 ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4004:
                        dt2 a63 = gq3.a(parcel.readStrongBinder());
                        int readInt87 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle18 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                        if (a63 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                kb0.O("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        dr3Var = dr3.a(bundle18);
                                    } catch (RuntimeException e10) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e10);
                                    }
                                }
                                L(a63, readInt87, null, 50005, new yv3(new ov3(readString4, dr3Var, (byte) 12), r12 ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4005:
                        dt2 a64 = gq3.a(parcel.readStrongBinder());
                        int readInt88 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt89 = parcel.readInt();
                        int readInt90 = parcel.readInt();
                        Bundle bundle19 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                        if (a64 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                kb0.O("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (readInt89 < 0) {
                                kb0.O("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (readInt90 < 1) {
                                kb0.O("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle19 != null) {
                                    try {
                                        dr3Var = dr3.a(bundle19);
                                    } catch (RuntimeException e11) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e11);
                                    }
                                }
                                L(a64, readInt88, null, 50006, new yv3(new ov3(readString5, readInt89, readInt90, dr3Var), r12 ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4006:
                        dt2 a65 = gq3.a(parcel.readStrongBinder());
                        int readInt91 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle20 = (Bundle) nx7.Q(parcel, Bundle.CREATOR);
                        if (a65 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                kb0.O("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle20 != null) {
                                    try {
                                        dr3Var = dr3.a(bundle20);
                                    } catch (RuntimeException e12) {
                                        kb0.P("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e12);
                                    }
                                }
                                L(a65, readInt91, null, 50001, new yv3(new ov3(readString6, dr3Var, (byte) 10), r12 ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4007:
                        dt2 a66 = gq3.a(parcel.readStrongBinder());
                        int readInt92 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (a66 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                kb0.O("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            L(a66, readInt92, null, 50002, new yv3(new qi2(readString7, (byte) 22), r12 ? (byte) 1 : (byte) 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
