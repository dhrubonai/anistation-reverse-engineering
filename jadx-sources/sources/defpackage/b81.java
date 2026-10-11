package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b81 implements qp1 {
    public final List a;
    public final xx1 b;
    public final pz2 c;
    public final af2 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final l01 h;
    public final q18 i;
    public final cp4 j;
    public final tu k;
    public final UUID l;
    public final Looper m;
    public final fu n;
    public final Object o;
    public byte p;
    public int q;
    public HandlerThread r;
    public z71 s;
    public cb2 t;
    public pp1 u;
    public byte[] v;
    public byte[] w;
    public vx1 x;
    public cn7 y;
    public wx1 z;

    public b81(UUID uuid, xx1 xx1Var, pz2 pz2Var, af2 af2Var, List list, boolean z, boolean z2, byte[] bArr, HashMap hashMap, tu tuVar, Looper looper, q18 q18Var, cp4 cp4Var) {
        this.l = uuid;
        this.c = pz2Var;
        this.d = af2Var;
        this.b = xx1Var;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.g = hashMap;
        this.k = tuVar;
        this.h = new l01();
        this.i = q18Var;
        this.j = cp4Var;
        this.p = (byte) 2;
        this.m = looper;
        this.n = new fu(this, looper, (byte) 1);
        this.o = new Object();
    }

    @Override // defpackage.qp1
    public final UUID a() {
        n();
        return this.l;
    }

    @Override // defpackage.qp1
    public final boolean b() {
        n();
        return this.e;
    }

    @Override // defpackage.qp1
    public final void c(tp1 tp1Var) {
        n();
        int i = this.q;
        if (i <= 0) {
            kb0.s("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = (byte) 0;
            fu fuVar = this.n;
            String str = eq6.a;
            fuVar.removeCallbacksAndMessages(null);
            z71 z71Var = this.s;
            synchronized (z71Var) {
                z71Var.removeCallbacksAndMessages(null);
                z71Var.a = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            synchronized (this.o) {
                this.y = null;
            }
            this.z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.v(bArr);
                this.v = null;
            }
        }
        if (tp1Var != null) {
            l01 l01Var = this.h;
            synchronized (l01Var.x) {
                try {
                    Integer num = (Integer) l01Var.y.get(tp1Var);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(l01Var.A);
                        arrayList.remove(tp1Var);
                        l01Var.A = Collections.unmodifiableList(arrayList);
                        int intValue = num.intValue();
                        HashMap hashMap = l01Var.y;
                        if (intValue == 1) {
                            hashMap.remove(tp1Var);
                            HashSet hashSet = new HashSet(l01Var.z);
                            hashSet.remove(tp1Var);
                            l01Var.z = Collections.unmodifiableSet(hashSet);
                        } else {
                            hashMap.put(tp1Var, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.h.b(tp1Var) == 0) {
                tp1Var.e();
            }
        }
        af2 af2Var = this.d;
        int i3 = this.q;
        e81 e81Var = (e81) af2Var.y;
        if (i3 == 1 && e81Var.p > 0 && e81Var.l != -9223372036854775807L) {
            e81Var.o.add(this);
            Handler handler = e81Var.u;
            handler.getClass();
            handler.postAtTime(new p0((Object) this, (byte) 14), this, SystemClock.uptimeMillis() + e81Var.l);
        } else if (i3 == 0) {
            e81Var.m.remove(this);
            if (e81Var.r == this) {
                e81Var.r = null;
            }
            if (e81Var.s == this) {
                e81Var.s = null;
            }
            pz2 pz2Var = e81Var.i;
            HashSet hashSet2 = (HashSet) pz2Var.y;
            hashSet2.remove(this);
            if (((b81) pz2Var.z) == this) {
                pz2Var.z = null;
                if (!hashSet2.isEmpty()) {
                    b81 b81Var = (b81) hashSet2.iterator().next();
                    pz2Var.z = b81Var;
                    wx1 k = b81Var.b.k();
                    b81Var.z = k;
                    z71 z71Var2 = b81Var.s;
                    String str2 = eq6.a;
                    k.getClass();
                    z71Var2.getClass();
                    z71Var2.obtainMessage(1, new a81(ij3.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), k)).sendToTarget();
                }
            }
            if (e81Var.l != -9223372036854775807L) {
                Handler handler2 = e81Var.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                e81Var.o.remove(this);
            }
        }
        e81Var.k();
    }

    @Override // defpackage.qp1
    public final void d(tp1 tp1Var) {
        int i;
        n();
        boolean z = false;
        if (this.q < 0) {
            kb0.s("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (tp1Var != null) {
            l01 l01Var = this.h;
            synchronized (l01Var.x) {
                try {
                    ArrayList arrayList = new ArrayList(l01Var.A);
                    arrayList.add(tp1Var);
                    l01Var.A = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) l01Var.y.get(tp1Var);
                    if (num == null) {
                        HashSet hashSet = new HashSet(l01Var.z);
                        hashSet.add(tp1Var);
                        l01Var.z = Collections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = l01Var.y;
                    if (num != null) {
                        i = num.intValue() + 1;
                    } else {
                        i = 1;
                    }
                    hashMap.put(tp1Var, Integer.valueOf(i));
                } finally {
                }
            }
        }
        int i2 = this.q + 1;
        this.q = i2;
        if (i2 == 1) {
            if (this.p == 2) {
                z = true;
            }
            io3.B(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new z71(this, this.r.getLooper());
            if (l()) {
                h(true);
            }
        } else if (tp1Var != null && i() && this.h.b(tp1Var) == 1) {
            tp1Var.c(this.p);
        }
        e81 e81Var = (e81) this.d.y;
        if (e81Var.l != -9223372036854775807L) {
            e81Var.o.remove(this);
            Handler handler = e81Var.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.qp1
    public final int e() {
        n();
        return this.p;
    }

    @Override // defpackage.qp1
    public final boolean f(String str) {
        n();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.J(str, bArr);
    }

    @Override // defpackage.qp1
    public final cb2 g() {
        n();
        return this.t;
    }

    @Override // defpackage.qp1
    public final pp1 getError() {
        n();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:40|(2:41|42)|(6:44|45|46|47|(1:49)|51)|54|45|46|47|(0)|51) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0071 A[Catch: NumberFormatException -> 0x0075, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0075, blocks: (B:47:0x0069, B:49:0x0071), top: B:46:0x0069 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(boolean r10) {
        /*
            r9 = this;
            boolean r0 = r9.f
            if (r0 == 0) goto L6
            goto Lde
        L6:
            byte[] r0 = r9.v
            java.lang.String r1 = defpackage.eq6.a
            byte[] r1 = r9.w
            r2 = 1
            if (r1 != 0) goto L13
            r9.m(r2, r10, r0)
            return
        L13:
            byte r1 = r9.p
            r3 = 4
            if (r1 == r3) goto L29
            xx1 r1 = r9.b     // Catch: java.lang.Throwable -> L22
            byte[] r4 = r9.v     // Catch: java.lang.Throwable -> L22
            byte[] r5 = r9.w     // Catch: java.lang.Throwable -> L22
            r1.u(r4, r5)     // Catch: java.lang.Throwable -> L22
            goto L27
        L22:
            r1 = move-exception
            r9.j(r1, r2)
            r2 = 0
        L27:
            if (r2 == 0) goto Lde
        L29:
            java.util.UUID r1 = defpackage.ce0.e
            java.util.UUID r2 = r9.l
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L39
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L93
        L39:
            r9.n()
            byte[] r1 = r9.v
            r2 = 0
            if (r1 != 0) goto L43
            r1 = r2
            goto L49
        L43:
            xx1 r4 = r9.b
            java.util.Map r1 = r4.c(r1)
        L49:
            if (r1 != 0) goto L4c
            goto L7c
        L4c:
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r4 = "LicenseDurationRemaining"
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.NumberFormatException -> L62
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> L62
            if (r4 == 0) goto L62
            long r7 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L62
            goto L63
        L62:
            r7 = r5
        L63:
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.NumberFormatException -> L75
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L75
            if (r1 == 0) goto L75
            long r5 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L75
        L75:
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r2.<init>(r4, r1)
        L7c:
            r2.getClass()
            java.lang.Object r1 = r2.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            java.lang.Object r1 = r2.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = java.lang.Math.min(r4, r1)
        L93:
            r4 = 60
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r5 = 2
            if (r4 > 0) goto Lb1
            java.lang.String r3 = "DefaultDrmSession"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Offline license has expired or will expire soon. Remaining seconds: "
            r4.<init>(r6)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            defpackage.kb0.q(r3, r1)
            r9.m(r5, r10, r0)
            return
        Lb1:
            r6 = 0
            int r10 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r10 > 0) goto Lc0
            t83 r10 = new t83
            r10.<init>()
            r9.j(r10, r5)
            return
        Lc0:
            r9.p = r3
            l01 r9 = r9.h
            java.lang.Object r10 = r9.x
            monitor-enter(r10)
            java.util.Set r9 = r9.z     // Catch: java.lang.Throwable -> Ldf
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Ldf
            java.util.Iterator r9 = r9.iterator()
        Lce:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lde
            java.lang.Object r10 = r9.next()
            tp1 r10 = (defpackage.tp1) r10
            r10.b()
            goto Lce
        Lde:
            return
        Ldf:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Ldf
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b81.h(boolean):void");
    }

    public final boolean i() {
        byte b = this.p;
        if (b != 3 && b != 4) {
            return false;
        }
        return true;
    }

    public final void j(Throwable th, int i) {
        int i2;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i2 = eq6.A(eq6.B(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            if (!(th instanceof MediaDrmResetException)) {
                if (!(th instanceof NotProvisionedException) && !oi4.w(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof wo6) {
                        i2 = 6001;
                    } else if (th instanceof c81) {
                        i2 = 6003;
                    } else if (th instanceof t83) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            p65.b();
                            return;
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.u = new pp1(th, i2);
        kb0.t("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            l01 l01Var = this.h;
            synchronized (l01Var.x) {
                set = l01Var.z;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((tp1) it.next()).d((Exception) th);
            }
        } else if (th instanceof Error) {
            if (!oi4.x(th) && !oi4.w(th)) {
                throw ((Error) th);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th);
        }
        if (this.p != 4) {
            this.p = (byte) 1;
        }
    }

    public final void k(Throwable th, boolean z) {
        int i;
        if (!(th instanceof NotProvisionedException) && !oi4.w(th)) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            j(th, i);
            return;
        }
        this.c.y(this);
    }

    public final boolean l() {
        Set set;
        if (i()) {
            return true;
        }
        try {
            try {
                byte[] o = this.b.o();
                this.v = o;
                this.b.H(o, this.j);
                this.t = this.b.n(this.v);
                this.p = (byte) 3;
                l01 l01Var = this.h;
                synchronized (l01Var.x) {
                    set = l01Var.z;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((tp1) it.next()).c(3);
                }
                this.v.getClass();
                return true;
            } catch (NotProvisionedException unused) {
                this.c.y(this);
                return false;
            }
        } catch (Exception | NoSuchMethodError e) {
            if (oi4.w(e)) {
                this.c.y(this);
                return false;
            }
            j(e, 1);
            return false;
        }
    }

    public final void m(int i, boolean z, byte[] bArr) {
        try {
            synchronized (this.o) {
                try {
                    this.y = new cn7((byte) 28);
                    List list = this.a;
                    if (list != null) {
                        nw2.o(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            vx1 B = this.b.B(bArr, this.a, i, this.g);
            this.x = B;
            z71 z71Var = this.s;
            String str = eq6.a;
            B.getClass();
            z71Var.getClass();
            z71Var.obtainMessage(2, new a81(ij3.h.getAndIncrement(), z, SystemClock.elapsedRealtime(), B)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            k(e, true);
        }
    }

    public final void n() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.m;
        if (currentThread != looper.getThread()) {
            kb0.P("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
