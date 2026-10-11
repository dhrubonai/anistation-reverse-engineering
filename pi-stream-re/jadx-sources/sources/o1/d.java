package o1;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k1.i0;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public final List f8113a;

    /* renamed from: b, reason: collision with root package name */
    public final y f8114b;

    /* renamed from: c, reason: collision with root package name */
    public final f.c f8115c;

    /* renamed from: d, reason: collision with root package name */
    public final e f8116d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8117e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8118f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8119g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f8120h;

    /* renamed from: i, reason: collision with root package name */
    public final f1.d f8121i;

    /* renamed from: j, reason: collision with root package name */
    public final q0 f8122j;

    /* renamed from: k, reason: collision with root package name */
    public final i0 f8123k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f8124l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f8125m;

    /* renamed from: n, reason: collision with root package name */
    public final Looper f8126n;
    public final c o;

    /* renamed from: p, reason: collision with root package name */
    public int f8127p;

    /* renamed from: q, reason: collision with root package name */
    public int f8128q;

    /* renamed from: r, reason: collision with root package name */
    public HandlerThread f8129r;

    /* renamed from: s, reason: collision with root package name */
    public a f8130s;

    /* renamed from: t, reason: collision with root package name */
    public i1.b f8131t;

    /* renamed from: u, reason: collision with root package name */
    public j f8132u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f8133v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f8134w;

    /* renamed from: x, reason: collision with root package name */
    public w f8135x;

    /* renamed from: y, reason: collision with root package name */
    public x f8136y;

    public d(UUID uuid, y yVar, f.c cVar, e eVar, List list, int i10, boolean z9, boolean z10, byte[] bArr, HashMap hashMap, d0 d0Var, Looper looper, q0 q0Var, i0 i0Var) {
        if (i10 == 1 || i10 == 3) {
            bArr.getClass();
        }
        this.f8125m = uuid;
        this.f8115c = cVar;
        this.f8116d = eVar;
        this.f8114b = yVar;
        this.f8117e = i10;
        this.f8118f = z9;
        this.f8119g = z10;
        if (bArr != null) {
            this.f8134w = bArr;
            this.f8113a = null;
        } else {
            list.getClass();
            this.f8113a = Collections.unmodifiableList(list);
        }
        this.f8120h = hashMap;
        this.f8124l = d0Var;
        this.f8121i = new f1.d();
        this.f8122j = q0Var;
        this.f8123k = i0Var;
        this.f8127p = 2;
        this.f8126n = looper;
        this.o = new c(this, looper);
    }

    @Override // o1.k
    public final void a(n nVar) {
        p();
        int i10 = this.f8128q;
        if (i10 <= 0) {
            f1.o.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f8128q = i11;
        if (i11 == 0) {
            this.f8127p = 0;
            c cVar = this.o;
            int i12 = f1.b0.f3799a;
            cVar.removeCallbacksAndMessages(null);
            a aVar = this.f8130s;
            synchronized (aVar) {
                aVar.removeCallbacksAndMessages(null);
                aVar.f8100a = true;
            }
            this.f8130s = null;
            this.f8129r.quit();
            this.f8129r = null;
            this.f8131t = null;
            this.f8132u = null;
            this.f8135x = null;
            this.f8136y = null;
            byte[] bArr = this.f8133v;
            if (bArr != null) {
                this.f8114b.d(bArr);
                this.f8133v = null;
            }
        }
        if (nVar != null) {
            this.f8121i.c(nVar);
            if (this.f8121i.b(nVar) == 0) {
                nVar.f();
            }
        }
        e eVar = this.f8116d;
        int i13 = this.f8128q;
        i iVar = eVar.f8141a;
        if (i13 == 1 && iVar.F > 0 && iVar.B != -9223372036854775807L) {
            iVar.E.add(this);
            Handler handler = iVar.K;
            handler.getClass();
            handler.postAtTime(new androidx.activity.b(this, 9), this, SystemClock.uptimeMillis() + iVar.B);
        } else if (i13 == 0) {
            iVar.C.remove(this);
            if (iVar.H == this) {
                iVar.H = null;
            }
            if (iVar.I == this) {
                iVar.I = null;
            }
            f.c cVar2 = iVar.f8154y;
            ((Set) cVar2.f3635b).remove(this);
            if (((d) cVar2.f3636c) == this) {
                cVar2.f3636c = null;
                if (!((Set) cVar2.f3635b).isEmpty()) {
                    d dVar = (d) ((Set) cVar2.f3635b).iterator().next();
                    cVar2.f3636c = dVar;
                    x f10 = dVar.f8114b.f();
                    dVar.f8136y = f10;
                    a aVar2 = dVar.f8130s;
                    int i14 = f1.b0.f3799a;
                    f10.getClass();
                    aVar2.getClass();
                    aVar2.obtainMessage(0, new b(v1.n.f10478b.getAndIncrement(), true, SystemClock.elapsedRealtime(), f10)).sendToTarget();
                }
            }
            if (iVar.B != -9223372036854775807L) {
                Handler handler2 = iVar.K;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                iVar.E.remove(this);
            }
        }
        iVar.h();
    }

    @Override // o1.k
    public final boolean b() {
        p();
        return this.f8118f;
    }

    @Override // o1.k
    public final UUID c() {
        p();
        return this.f8125m;
    }

    @Override // o1.k
    public final void d(n nVar) {
        int i10;
        p();
        boolean z9 = false;
        if (this.f8128q < 0) {
            f1.o.c("DefaultDrmSession", "Session reference count less than zero: " + this.f8128q);
            this.f8128q = 0;
        }
        if (nVar != null) {
            f1.d dVar = this.f8121i;
            synchronized (dVar.f3814a) {
                ArrayList arrayList = new ArrayList(dVar.f3817d);
                arrayList.add(nVar);
                dVar.f3817d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) dVar.f3815b.get(nVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(dVar.f3816c);
                    hashSet.add(nVar);
                    dVar.f3816c = Collections.unmodifiableSet(hashSet);
                }
                HashMap hashMap = dVar.f3815b;
                if (num != null) {
                    i10 = num.intValue() + 1;
                } else {
                    i10 = 1;
                }
                hashMap.put(nVar, Integer.valueOf(i10));
            }
        }
        int i11 = this.f8128q + 1;
        this.f8128q = i11;
        if (i11 == 1) {
            if (this.f8127p == 2) {
                z9 = true;
            }
            w7.b.u(z9);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f8129r = handlerThread;
            handlerThread.start();
            this.f8130s = new a(this, this.f8129r.getLooper());
            if (m()) {
                i(true);
            }
        } else if (nVar != null && j() && this.f8121i.b(nVar) == 1) {
            nVar.d(this.f8127p);
        }
        i iVar = this.f8116d.f8141a;
        if (iVar.B != -9223372036854775807L) {
            iVar.E.remove(this);
            Handler handler = iVar.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // o1.k
    public final boolean e(String str) {
        p();
        byte[] bArr = this.f8133v;
        w7.b.w(bArr);
        return this.f8114b.l(str, bArr);
    }

    @Override // o1.k
    public final j f() {
        p();
        if (this.f8127p == 1) {
            return this.f8132u;
        }
        return null;
    }

    @Override // o1.k
    public final i1.b g() {
        p();
        return this.f8131t;
    }

    @Override // o1.k
    public final int getState() {
        p();
        return this.f8127p;
    }

    public final void h(f1.c cVar) {
        Set set;
        f1.d dVar = this.f8121i;
        synchronized (dVar.f3814a) {
            set = dVar.f3816c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cVar.accept((n) it.next());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:50|(2:51|52)|(6:54|55|56|57|(1:59)|61)|64|55|56|57|(0)|61) */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a A[Catch: NumberFormatException -> 0x009e, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x009e, blocks: (B:57:0x0092, B:59:0x009a), top: B:56:0x0092 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.d.i(boolean):void");
    }

    public final boolean j() {
        int i10 = this.f8127p;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void k(int i10, Throwable th) {
        int i11;
        int i12 = f1.b0.f3799a;
        if (i12 >= 21 && s.a(th)) {
            i11 = s.b(th);
        } else {
            if (i12 < 23 || !t.a(th)) {
                if ((i12 < 18 || !r.c(th)) && !com.bumptech.glide.c.E(th)) {
                    if (i12 >= 18 && r.a(th)) {
                        i11 = 6007;
                    } else if (th instanceof g0) {
                        i11 = 6001;
                    } else if (i12 >= 18 && r.b(th)) {
                        i11 = 6003;
                    } else if (th instanceof e0) {
                        i11 = 6008;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = 6004;
                        } else if (i10 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i11 = 6002;
            }
            i11 = 6006;
        }
        this.f8132u = new j(i11, th);
        f1.o.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            h(new w.f(th, 11));
        } else if (th instanceof Error) {
            if (!com.bumptech.glide.c.F(th) && !com.bumptech.glide.c.E(th)) {
                throw ((Error) th);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th);
        }
        if (this.f8127p != 4) {
            this.f8127p = 1;
        }
    }

    public final void l(Throwable th, boolean z9) {
        int i10;
        if (!(th instanceof NotProvisionedException) && !com.bumptech.glide.c.E(th)) {
            if (z9) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            k(i10, th);
            return;
        }
        this.f8115c.w(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m() {
        /*
            r4 = this;
            boolean r0 = r4.j()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            o1.y r0 = r4.f8114b     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            byte[] r0 = r0.m()     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            r4.f8133v = r0     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            o1.y r2 = r4.f8114b     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            k1.i0 r3 = r4.f8123k     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            r2.j(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            o1.y r0 = r4.f8114b     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            byte[] r2 = r4.f8133v     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            i1.b r0 = r0.k(r2)     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            r4.f8131t = r0     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            r0 = 3
            r4.f8127p = r0     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            f1.d r2 = r4.f8121i     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            java.lang.Object r3 = r2.f3814a     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            monitor-enter(r3)     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            java.util.Set r2 = r2.f3816c     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            o1.n r3 = (o1.n) r3     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            r3.d(r0)     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            goto L30
        L40:
            byte[] r0 = r4.f8133v     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            r0.getClass()     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
            return r1
        L46:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
            throw r0     // Catch: java.lang.NoSuchMethodError -> L49 java.lang.Exception -> L4b android.media.NotProvisionedException -> L5c
        L49:
            r0 = move-exception
            goto L4c
        L4b:
            r0 = move-exception
        L4c:
            boolean r2 = com.bumptech.glide.c.E(r0)
            if (r2 == 0) goto L58
            f.c r0 = r4.f8115c
            r0.w(r4)
            goto L61
        L58:
            r4.k(r1, r0)
            goto L61
        L5c:
            f.c r0 = r4.f8115c
            r0.w(r4)
        L61:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.d.m():boolean");
    }

    public final void n(byte[] bArr, int i10, boolean z9) {
        try {
            w h10 = this.f8114b.h(bArr, this.f8113a, i10, this.f8120h);
            this.f8135x = h10;
            a aVar = this.f8130s;
            int i11 = f1.b0.f3799a;
            h10.getClass();
            aVar.getClass();
            aVar.obtainMessage(1, new b(v1.n.f10478b.getAndIncrement(), z9, SystemClock.elapsedRealtime(), h10)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            l(e10, true);
        }
    }

    public final Map o() {
        p();
        byte[] bArr = this.f8133v;
        if (bArr == null) {
            return null;
        }
        return this.f8114b.c(bArr);
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f8126n;
        if (currentThread != looper.getThread()) {
            f1.o.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
