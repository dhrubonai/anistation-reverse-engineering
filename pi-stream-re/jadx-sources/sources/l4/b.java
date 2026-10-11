package l4;

/* loaded from: classes.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6827a;

    /* renamed from: b, reason: collision with root package name */
    public final d f6828b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f6829c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f6830d;

    /* renamed from: e, reason: collision with root package name */
    public int f6831e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f6832f = 3;

    public b(Object obj, d dVar) {
        this.f6827a = obj;
        this.f6828b = dVar;
    }

    @Override // l4.d, l4.c
    public final boolean a() {
        boolean z9;
        synchronized (this.f6827a) {
            if (!this.f6829c.a() && !this.f6830d.a()) {
                z9 = false;
            }
            z9 = true;
        }
        return z9;
    }

    @Override // l4.d
    public final boolean b(c cVar) {
        boolean z9;
        synchronized (this.f6827a) {
            d dVar = this.f6828b;
            if (dVar != null && !dVar.b(this)) {
                z9 = false;
            }
            z9 = true;
        }
        return z9;
    }

    @Override // l4.c
    public final boolean c(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        if (!this.f6829c.c(bVar.f6829c) || !this.f6830d.c(bVar.f6830d)) {
            return false;
        }
        return true;
    }

    @Override // l4.c
    public final void clear() {
        synchronized (this.f6827a) {
            this.f6831e = 3;
            this.f6829c.clear();
            if (this.f6832f != 3) {
                this.f6832f = 3;
                this.f6830d.clear();
            }
        }
    }

    @Override // l4.c
    public final boolean d() {
        boolean z9;
        synchronized (this.f6827a) {
            if (this.f6831e == 3 && this.f6832f == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    @Override // l4.d
    public final d e() {
        d dVar;
        synchronized (this.f6827a) {
            d dVar2 = this.f6828b;
            if (dVar2 != null) {
                dVar = dVar2.e();
            } else {
                dVar = this;
            }
        }
        return dVar;
    }

    @Override // l4.c
    public final void f() {
        synchronized (this.f6827a) {
            if (this.f6831e != 1) {
                this.f6831e = 1;
                this.f6829c.f();
            }
        }
    }

    @Override // l4.d
    public final boolean g(c cVar) {
        boolean z9;
        boolean z10;
        synchronized (this.f6827a) {
            d dVar = this.f6828b;
            z9 = false;
            if (dVar != null && !dVar.g(this)) {
                z10 = false;
                if (z10 && cVar.equals(this.f6829c)) {
                    z9 = true;
                }
            }
            z10 = true;
            if (z10) {
                z9 = true;
            }
        }
        return z9;
    }

    @Override // l4.d
    public final void h(c cVar) {
        synchronized (this.f6827a) {
            if (!cVar.equals(this.f6830d)) {
                this.f6831e = 5;
                if (this.f6832f != 1) {
                    this.f6832f = 1;
                    this.f6830d.f();
                }
                return;
            }
            this.f6832f = 5;
            d dVar = this.f6828b;
            if (dVar != null) {
                dVar.h(this);
            }
        }
    }

    @Override // l4.c
    public final boolean i() {
        boolean z9;
        synchronized (this.f6827a) {
            if (this.f6831e != 4 && this.f6832f != 4) {
                z9 = false;
            }
            z9 = true;
        }
        return z9;
    }

    @Override // l4.c
    public final boolean isRunning() {
        boolean z9;
        synchronized (this.f6827a) {
            z9 = true;
            if (this.f6831e != 1 && this.f6832f != 1) {
                z9 = false;
            }
        }
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[Catch: all -> 0x0038, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0015, B:13:0x001a, B:16:0x0021, B:18:0x0029, B:23:0x0036), top: B:3:0x0003 }] */
    @Override // l4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(l4.c r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f6827a
            monitor-enter(r0)
            l4.d r1 = r5.f6828b     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r1 = r1.j(r5)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = r2
            goto L13
        L12:
            r1 = r3
        L13:
            if (r1 == 0) goto L36
            int r1 = r5.f6831e     // Catch: java.lang.Throwable -> L38
            r4 = 5
            if (r1 == r4) goto L21
            l4.c r1 = r5.f6829c     // Catch: java.lang.Throwable -> L38
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L38
            goto L33
        L21:
            l4.c r1 = r5.f6830d     // Catch: java.lang.Throwable -> L38
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L32
            int r6 = r5.f6832f     // Catch: java.lang.Throwable -> L38
            r1 = 4
            if (r6 == r1) goto L30
            if (r6 != r4) goto L32
        L30:
            r6 = r3
            goto L33
        L32:
            r6 = r2
        L33:
            if (r6 == 0) goto L36
            r2 = r3
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return r2
        L38:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.b.j(l4.c):boolean");
    }

    @Override // l4.d
    public final void k(c cVar) {
        synchronized (this.f6827a) {
            if (cVar.equals(this.f6829c)) {
                this.f6831e = 4;
            } else if (cVar.equals(this.f6830d)) {
                this.f6832f = 4;
            }
            d dVar = this.f6828b;
            if (dVar != null) {
                dVar.k(this);
            }
        }
    }

    @Override // l4.c
    public final void pause() {
        synchronized (this.f6827a) {
            if (this.f6831e == 1) {
                this.f6831e = 2;
                this.f6829c.pause();
            }
            if (this.f6832f == 1) {
                this.f6832f = 2;
                this.f6830d.pause();
            }
        }
    }
}
