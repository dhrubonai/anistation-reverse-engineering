package l4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import f.o0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p.j;
import p4.m;
import x3.a0;
import x3.e0;
import x3.k;
import x3.q;
import x3.u;

/* loaded from: classes.dex */
public final class h implements c, m4.h, g {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);
    public boolean A;
    public final RuntimeException B;
    public int C;

    /* renamed from: a, reason: collision with root package name */
    public final String f6833a;

    /* renamed from: b, reason: collision with root package name */
    public final q4.d f6834b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6835c;

    /* renamed from: d, reason: collision with root package name */
    public final e f6836d;

    /* renamed from: e, reason: collision with root package name */
    public final d f6837e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f6838f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.f f6839g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f6840h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f6841i;

    /* renamed from: j, reason: collision with root package name */
    public final a f6842j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6843k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6844l;

    /* renamed from: m, reason: collision with root package name */
    public final com.bumptech.glide.g f6845m;

    /* renamed from: n, reason: collision with root package name */
    public final m4.i f6846n;
    public final List o;

    /* renamed from: p, reason: collision with root package name */
    public final n4.e f6847p;

    /* renamed from: q, reason: collision with root package name */
    public final Executor f6848q;

    /* renamed from: r, reason: collision with root package name */
    public e0 f6849r;

    /* renamed from: s, reason: collision with root package name */
    public k f6850s;

    /* renamed from: t, reason: collision with root package name */
    public long f6851t;

    /* renamed from: u, reason: collision with root package name */
    public volatile q f6852u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f6853v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f6854w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f6855x;

    /* renamed from: y, reason: collision with root package name */
    public int f6856y;

    /* renamed from: z, reason: collision with root package name */
    public int f6857z;

    public h(Context context, com.bumptech.glide.f fVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, com.bumptech.glide.g gVar, m4.i iVar, List list, d dVar, q qVar, n4.e eVar) {
        String str;
        o0 o0Var = z7.c.f12112f;
        if (D) {
            str = String.valueOf(hashCode());
        } else {
            str = null;
        }
        this.f6833a = str;
        this.f6834b = new q4.d();
        this.f6835c = obj;
        this.f6838f = context;
        this.f6839g = fVar;
        this.f6840h = obj2;
        this.f6841i = cls;
        this.f6842j = aVar;
        this.f6843k = i10;
        this.f6844l = i11;
        this.f6845m = gVar;
        this.f6846n = iVar;
        this.f6836d = null;
        this.o = list;
        this.f6837e = dVar;
        this.f6852u = qVar;
        this.f6847p = eVar;
        this.f6848q = o0Var;
        this.C = 1;
        if (this.B == null && fVar.f2222h.f1074a.containsKey(com.bumptech.glide.d.class)) {
            this.B = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // l4.c
    public final boolean a() {
        boolean z9;
        synchronized (this.f6835c) {
            if (this.C == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final void b() {
        if (!this.A) {
            this.f6834b.a();
            this.f6846n.i(this);
            k kVar = this.f6850s;
            if (kVar != null) {
                synchronized (((q) kVar.f11218c)) {
                    ((u) kVar.f11216a).j((g) kVar.f11217b);
                }
                this.f6850s = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    @Override // l4.c
    public final boolean c(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.g gVar;
        int i12;
        int i13;
        int i14;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.g gVar2;
        int i15;
        boolean equals;
        boolean f10;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f6835c) {
            i10 = this.f6843k;
            i11 = this.f6844l;
            obj = this.f6840h;
            cls = this.f6841i;
            aVar = this.f6842j;
            gVar = this.f6845m;
            List list = this.o;
            if (list != null) {
                i12 = list.size();
            } else {
                i12 = 0;
            }
        }
        h hVar = (h) cVar;
        synchronized (hVar.f6835c) {
            i13 = hVar.f6843k;
            i14 = hVar.f6844l;
            obj2 = hVar.f6840h;
            cls2 = hVar.f6841i;
            aVar2 = hVar.f6842j;
            gVar2 = hVar.f6845m;
            List list2 = hVar.o;
            if (list2 != null) {
                i15 = list2.size();
            } else {
                i15 = 0;
            }
        }
        if (i10 == i13 && i11 == i14) {
            char[] cArr = m.f8575a;
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2)) {
                if (aVar == null) {
                    if (aVar2 == null) {
                        f10 = true;
                    } else {
                        f10 = false;
                    }
                } else {
                    f10 = aVar.f(aVar2);
                }
                if (f10 && gVar == gVar2 && i12 == i15) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f A[Catch: all -> 0x004e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:11:0x0013, B:13:0x001b, B:14:0x001f, B:16:0x0023, B:21:0x002f, B:22:0x0038, B:23:0x003a, B:30:0x0046, B:31:0x004d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // l4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f6835c
            monitor-enter(r0)
            boolean r1 = r5.A     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L46
            q4.d r1 = r5.f6834b     // Catch: java.lang.Throwable -> L4e
            r1.a()     // Catch: java.lang.Throwable -> L4e
            int r1 = r5.C     // Catch: java.lang.Throwable -> L4e
            r2 = 6
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            return
        L13:
            r5.b()     // Catch: java.lang.Throwable -> L4e
            x3.e0 r1 = r5.f6849r     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            if (r1 == 0) goto L1e
            r5.f6849r = r3     // Catch: java.lang.Throwable -> L4e
            goto L1f
        L1e:
            r1 = r3
        L1f:
            l4.d r3 = r5.f6837e     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2c
            boolean r3 = r3.g(r5)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            r3 = 0
            goto L2d
        L2c:
            r3 = 1
        L2d:
            if (r3 == 0) goto L38
            m4.i r3 = r5.f6846n     // Catch: java.lang.Throwable -> L4e
            android.graphics.drawable.Drawable r4 = r5.e()     // Catch: java.lang.Throwable -> L4e
            r3.g(r4)     // Catch: java.lang.Throwable -> L4e
        L38:
            r5.C = r2     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L45
            x3.q r0 = r5.f6852u
            r0.getClass()
            x3.q.g(r1)
        L45:
            return
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.Throwable -> L4e
        L4e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.h.clear():void");
    }

    @Override // l4.c
    public final boolean d() {
        boolean z9;
        synchronized (this.f6835c) {
            if (this.C == 6) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final Drawable e() {
        int i10;
        if (this.f6854w == null) {
            a aVar = this.f6842j;
            Drawable drawable = aVar.f6824x;
            this.f6854w = drawable;
            if (drawable == null && (i10 = aVar.f6825y) > 0) {
                this.f6854w = h(i10);
            }
        }
        return this.f6854w;
    }

    @Override // l4.c
    public final void f() {
        int i10;
        synchronized (this.f6835c) {
            try {
                if (!this.A) {
                    this.f6834b.a();
                    int i11 = p4.g.f8564b;
                    this.f6851t = SystemClock.elapsedRealtimeNanos();
                    int i12 = 3;
                    if (this.f6840h == null) {
                        if (m.h(this.f6843k, this.f6844l)) {
                            this.f6856y = this.f6843k;
                            this.f6857z = this.f6844l;
                        }
                        if (this.f6855x == null) {
                            a aVar = this.f6842j;
                            Drawable drawable = aVar.F;
                            this.f6855x = drawable;
                            if (drawable == null && (i10 = aVar.G) > 0) {
                                this.f6855x = h(i10);
                            }
                        }
                        if (this.f6855x == null) {
                            i12 = 5;
                        }
                        k(new a0("Received null model"), i12);
                        return;
                    }
                    int i13 = this.C;
                    if (i13 != 2) {
                        boolean z9 = false;
                        if (i13 == 4) {
                            m(this.f6849r, v3.a.MEMORY_CACHE, false);
                            return;
                        }
                        List<e> list = this.o;
                        if (list != null) {
                            for (e eVar : list) {
                            }
                        }
                        this.C = 3;
                        if (m.h(this.f6843k, this.f6844l)) {
                            n(this.f6843k, this.f6844l);
                        } else {
                            this.f6846n.h(this);
                        }
                        int i14 = this.C;
                        if (i14 == 2 || i14 == 3) {
                            d dVar = this.f6837e;
                            if (dVar == null || dVar.j(this)) {
                                z9 = true;
                            }
                            if (z9) {
                                this.f6846n.d(e());
                            }
                        }
                        if (D) {
                            j("finished run method in " + p4.g.a(this.f6851t));
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        d dVar = this.f6837e;
        if (dVar != null && dVar.e().a()) {
            return false;
        }
        return true;
    }

    public final Drawable h(int i10) {
        Resources.Theme theme = this.f6842j.L;
        Context context = this.f6838f;
        if (theme == null) {
            theme = context.getTheme();
        }
        return p7.a0.w(context, context, i10, theme);
    }

    @Override // l4.c
    public final boolean i() {
        boolean z9;
        synchronized (this.f6835c) {
            if (this.C == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    @Override // l4.c
    public final boolean isRunning() {
        boolean z9;
        synchronized (this.f6835c) {
            int i10 = this.C;
            if (i10 != 2 && i10 != 3) {
                z9 = false;
            }
            z9 = true;
        }
        return z9;
    }

    public final void j(String str) {
        StringBuilder a10 = j.a(str, " this: ");
        a10.append(this.f6833a);
        Log.v("GlideRequest", a10.toString());
    }

    public final void k(a0 a0Var, int i10) {
        int i11;
        int i12;
        this.f6834b.a();
        synchronized (this.f6835c) {
            a0Var.getClass();
            int i13 = this.f6839g.f2223i;
            if (i13 <= i10) {
                Log.w("Glide", "Load failed for [" + this.f6840h + "] with dimensions [" + this.f6856y + "x" + this.f6857z + "]", a0Var);
                if (i13 <= 4) {
                    a0Var.e();
                }
            }
            Drawable drawable = null;
            this.f6850s = null;
            this.C = 5;
            d dVar = this.f6837e;
            if (dVar != null) {
                dVar.h(this);
            }
            boolean z9 = true;
            this.A = true;
            try {
                List<e> list = this.o;
                if (list != null) {
                    for (e eVar : list) {
                        Object obj = this.f6840h;
                        g();
                        ((h8.a) eVar).a(a0Var, obj);
                    }
                }
                e eVar2 = this.f6836d;
                if (eVar2 != null) {
                    Object obj2 = this.f6840h;
                    g();
                    ((h8.a) eVar2).a(a0Var, obj2);
                }
                d dVar2 = this.f6837e;
                if (dVar2 != null && !dVar2.j(this)) {
                    z9 = false;
                }
                if (this.f6840h == null) {
                    if (this.f6855x == null) {
                        a aVar = this.f6842j;
                        Drawable drawable2 = aVar.F;
                        this.f6855x = drawable2;
                        if (drawable2 == null && (i12 = aVar.G) > 0) {
                            this.f6855x = h(i12);
                        }
                    }
                    drawable = this.f6855x;
                }
                if (drawable == null) {
                    if (this.f6853v == null) {
                        a aVar2 = this.f6842j;
                        Drawable drawable3 = aVar2.f6822e;
                        this.f6853v = drawable3;
                        if (drawable3 == null && (i11 = aVar2.f6823f) > 0) {
                            this.f6853v = h(i11);
                        }
                    }
                    drawable = this.f6853v;
                }
                if (drawable == null) {
                    drawable = e();
                }
                this.f6846n.b(drawable);
            } finally {
                this.A = false;
            }
        }
    }

    public final void l(e0 e0Var, Object obj, v3.a aVar) {
        g();
        this.C = 4;
        this.f6849r = e0Var;
        if (this.f6839g.f2223i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f6840h + " with size [" + this.f6856y + "x" + this.f6857z + "] in " + p4.g.a(this.f6851t) + " ms");
        }
        d dVar = this.f6837e;
        if (dVar != null) {
            dVar.k(this);
        }
        this.A = true;
        try {
            List list = this.o;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((h8.a) ((e) it.next())).getClass();
                }
            }
            if (this.f6836d != null) {
            }
            this.f6846n.e(obj, this.f6847p.q(aVar));
        } finally {
            this.A = false;
        }
    }

    public final void m(e0 e0Var, v3.a aVar, boolean z9) {
        h hVar;
        Throwable th;
        Object obj;
        String str;
        boolean z10;
        this.f6834b.a();
        e0 e0Var2 = null;
        try {
            synchronized (this.f6835c) {
                try {
                    this.f6850s = null;
                    if (e0Var == null) {
                        k(new a0("Expected to receive a Resource<R> with an object of " + this.f6841i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = e0Var.get();
                    try {
                        if (obj2 != null && this.f6841i.isAssignableFrom(obj2.getClass())) {
                            d dVar = this.f6837e;
                            if (dVar != null && !dVar.b(this)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                this.f6849r = null;
                                this.C = 4;
                                this.f6852u.getClass();
                                q.g(e0Var);
                            }
                            l(e0Var, obj2, aVar);
                            return;
                        }
                        this.f6849r = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f6841i);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(e0Var);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        k(new a0(sb.toString()), 5);
                        this.f6852u.getClass();
                        q.g(e0Var);
                    } catch (Throwable th2) {
                        th = th2;
                        e0Var2 = e0Var;
                        hVar = this;
                        while (true) {
                            try {
                                try {
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (e0Var2 != null) {
                                        hVar.f6852u.getClass();
                                        q.g(e0Var2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                hVar = hVar;
                            }
                            th = th4;
                            hVar = hVar;
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    hVar = this;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            hVar = this;
        }
    }

    public final void n(int i10, int i11) {
        Object obj;
        int round;
        int i12 = i10;
        this.f6834b.a();
        Object obj2 = this.f6835c;
        synchronized (obj2) {
            try {
                boolean z9 = D;
                if (z9) {
                    j("Got onSizeReady in " + p4.g.a(this.f6851t));
                }
                if (this.C == 3) {
                    this.C = 2;
                    float f10 = this.f6842j.f6819b;
                    if (i12 != Integer.MIN_VALUE) {
                        i12 = Math.round(i12 * f10);
                    }
                    this.f6856y = i12;
                    if (i11 == Integer.MIN_VALUE) {
                        round = i11;
                    } else {
                        round = Math.round(f10 * i11);
                    }
                    this.f6857z = round;
                    if (z9) {
                        j("finished setup for calling load in " + p4.g.a(this.f6851t));
                    }
                    q qVar = this.f6852u;
                    com.bumptech.glide.f fVar = this.f6839g;
                    Object obj3 = this.f6840h;
                    a aVar = this.f6842j;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.f6850s = qVar.a(fVar, obj3, aVar.C, this.f6856y, this.f6857z, aVar.J, this.f6841i, this.f6845m, aVar.f6820c, aVar.I, aVar.D, aVar.P, aVar.H, aVar.f6826z, aVar.N, aVar.Q, aVar.O, this, this.f6848q);
                                if (this.C != 2) {
                                    this.f6850s = null;
                                }
                                if (z9) {
                                    j("finished onSizeReady in " + p4.g.a(this.f6851t));
                                }
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    @Override // l4.c
    public final void pause() {
        synchronized (this.f6835c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f6835c) {
            obj = this.f6840h;
            cls = this.f6841i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
