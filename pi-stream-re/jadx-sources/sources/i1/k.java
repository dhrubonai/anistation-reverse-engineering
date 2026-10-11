package i1;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final j f5270a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5271b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f5272c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f5273d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final h[] f5274e;

    /* renamed from: f, reason: collision with root package name */
    public final i[] f5275f;

    /* renamed from: g, reason: collision with root package name */
    public int f5276g;

    /* renamed from: h, reason: collision with root package name */
    public int f5277h;

    /* renamed from: i, reason: collision with root package name */
    public h f5278i;

    /* renamed from: j, reason: collision with root package name */
    public f f5279j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5280k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5281l;

    public k(h[] hVarArr, i[] iVarArr) {
        this.f5274e = hVarArr;
        this.f5276g = hVarArr.length;
        for (int i10 = 0; i10 < this.f5276g; i10++) {
            this.f5274e[i10] = f();
        }
        this.f5275f = iVarArr;
        this.f5277h = iVarArr.length;
        for (int i11 = 0; i11 < this.f5277h; i11++) {
            this.f5275f[i11] = g();
        }
        j jVar = new j(this);
        this.f5270a = jVar;
        jVar.start();
    }

    @Override // i1.e
    public final void a() {
        synchronized (this.f5271b) {
            this.f5281l = true;
            this.f5271b.notify();
        }
        try {
            this.f5270a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // i1.e
    public final Object e() {
        boolean z9;
        h hVar;
        synchronized (this.f5271b) {
            try {
                f fVar = this.f5279j;
                if (fVar == null) {
                    if (this.f5278i == null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    w7.b.u(z9);
                    int i10 = this.f5276g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.f5274e;
                        int i11 = i10 - 1;
                        this.f5276g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f5278i = hVar;
                } else {
                    throw fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public abstract h f();

    @Override // i1.e
    public final void flush() {
        synchronized (this.f5271b) {
            this.f5280k = true;
            h hVar = this.f5278i;
            if (hVar != null) {
                hVar.h();
                int i10 = this.f5276g;
                this.f5276g = i10 + 1;
                this.f5274e[i10] = hVar;
                this.f5278i = null;
            }
            while (!this.f5272c.isEmpty()) {
                h hVar2 = (h) this.f5272c.removeFirst();
                hVar2.h();
                int i11 = this.f5276g;
                this.f5276g = i11 + 1;
                this.f5274e[i11] = hVar2;
            }
            while (!this.f5273d.isEmpty()) {
                ((i) this.f5273d.removeFirst()).i();
            }
        }
    }

    public abstract i g();

    public abstract f h(Throwable th);

    public abstract f i(h hVar, i iVar, boolean z9);

    public final boolean j() {
        f h10;
        boolean z9;
        synchronized (this.f5271b) {
            while (!this.f5281l) {
                try {
                    if (!this.f5272c.isEmpty() && this.f5277h > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        break;
                    }
                    this.f5271b.wait();
                } finally {
                }
            }
            if (this.f5281l) {
                return false;
            }
            h hVar = (h) this.f5272c.removeFirst();
            i[] iVarArr = this.f5275f;
            int i10 = this.f5277h - 1;
            this.f5277h = i10;
            i iVar = iVarArr[i10];
            boolean z10 = this.f5280k;
            this.f5280k = false;
            if (hVar.g(4)) {
                iVar.e(4);
            } else {
                iVar.f5267c = hVar.f5264x;
                l();
                if (hVar.g(Integer.MIN_VALUE)) {
                    iVar.e(Integer.MIN_VALUE);
                }
                if (hVar.g(134217728)) {
                    iVar.e(134217728);
                }
                try {
                    h10 = i(hVar, iVar, z10);
                } catch (OutOfMemoryError e10) {
                    h10 = h(e10);
                } catch (RuntimeException e11) {
                    h10 = h(e11);
                }
                if (h10 != null) {
                    synchronized (this.f5271b) {
                        this.f5279j = h10;
                    }
                    return false;
                }
            }
            synchronized (this.f5271b) {
                if (this.f5280k) {
                    iVar.i();
                } else {
                    if (!iVar.g(4)) {
                        l();
                    }
                    if (!iVar.g(Integer.MIN_VALUE)) {
                        this.f5273d.addLast(iVar);
                    } else {
                        iVar.i();
                    }
                }
                hVar.h();
                int i11 = this.f5276g;
                this.f5276g = i11 + 1;
                this.f5274e[i11] = hVar;
            }
            return true;
        }
    }

    @Override // i1.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final i d() {
        synchronized (this.f5271b) {
            try {
                f fVar = this.f5279j;
                if (fVar == null) {
                    if (this.f5273d.isEmpty()) {
                        return null;
                    }
                    return (i) this.f5273d.removeFirst();
                }
                throw fVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        synchronized (this.f5271b) {
        }
    }

    @Override // i1.e
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void b(h hVar) {
        boolean z9;
        synchronized (this.f5271b) {
            try {
                f fVar = this.f5279j;
                if (fVar == null) {
                    boolean z10 = true;
                    if (hVar == this.f5278i) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    w7.b.g(z9);
                    this.f5272c.addLast(hVar);
                    if (this.f5272c.isEmpty() || this.f5277h <= 0) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f5271b.notify();
                    }
                    this.f5278i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
