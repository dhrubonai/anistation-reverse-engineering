package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qi5 implements at, zs {
    public static final ea2 A;
    public static final ea2 B;
    public final o15 a;
    public final zw2 b;
    public final l33 c;
    public final ex1 d;
    public final mi6 e;
    public final k46 f;
    public final HashMap g;
    public final HashMap h;
    public final jw2 i;
    public final AtomicInteger j;
    public final AtomicInteger k;
    public boolean l;
    public int m;
    public at n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public ea2 t;
    public ea2 u;
    public volatile boolean v;
    public volatile long w;
    public volatile long x;
    public volatile boolean y;
    public volatile boolean z;

    static {
        da2 da2Var = new da2();
        da2Var.o = qy3.n("audio/mp4a-latm");
        da2Var.K = 44100;
        da2Var.I = 2;
        A = new ea2(da2Var);
        da2 da2Var2 = new da2();
        da2Var2.v = 16;
        da2Var2.w = 16;
        da2Var2.o = qy3.n("image/raw");
        da2Var2.G = hp0.i;
        B = new ea2(da2Var2);
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [ew2, jw2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ew2, jw2] */
    public qi5(rr1 rr1Var, ys ysVar, ex1 ex1Var, mi6 mi6Var, Looper looper) {
        boolean z;
        boolean z2;
        zw2 zw2Var = rr1Var.b;
        this.b = zw2Var;
        o15 o15Var = rr1Var.a;
        if (!zw2Var.contains(-2)) {
            ?? ew2Var = new ew2(4);
            z62 listIterator = o15Var.listIterator(0);
            while (listIterator.hasNext()) {
                qr1 qr1Var = (qr1) listIterator.next();
                if (qr1.d(qr1Var.a)) {
                    ew2Var.c(qr1Var);
                } else {
                    pr1 a = qr1Var.a();
                    if (!qr1Var.b && zw2Var.contains(1)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    a.b = z;
                    if (!qr1Var.c && zw2Var.contains(2)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    a.c = z2;
                    ew2Var.c(new qr1(a));
                }
            }
            o15Var = ew2Var.g();
        }
        this.a = o15Var;
        l33 l33Var = new l33((byte) 17, this, ysVar, false);
        this.c = l33Var;
        this.d = ex1Var;
        this.e = mi6Var;
        this.f = new k46(new Handler(looper, null));
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new ew2(4);
        this.j = new AtomicInteger();
        this.k = new AtomicInteger();
        this.l = true;
        this.n = l33Var.i((qr1) o15Var.get(0), looper, this, ex1Var);
    }

    @Override // defpackage.at
    public final int a(mm5 mm5Var) {
        int a = this.n.a(mm5Var);
        int i = this.a.A;
        if (i != 1 && a != 0) {
            int Z = eq6.Z(this.m, i);
            if (a == 2) {
                Z += mm5Var.x / i;
            }
            mm5Var.x = Z;
            return 2;
        }
        return a;
    }

    @Override // defpackage.zs
    public final void b(oz1 oz1Var) {
        this.e.b(oz1Var);
    }

    @Override // defpackage.zs
    public final void c(int i) {
        this.j.set(i);
        this.k.set(i);
    }

    @Override // defpackage.at
    public final rw2 e() {
        return this.n.e();
    }

    @Override // defpackage.zs
    public final void f(long j) {
        boolean z;
        if (j == -9223372036854775807L && !j()) {
            z = false;
        } else {
            z = true;
        }
        io3.k(this.m, "Could not retrieve required duration for EditedMediaItem %s", z);
        this.x = ((qr1) this.a.get(this.m)).b(j);
        this.w = j;
        if (this.a.A == 1) {
            this.e.getClass();
        }
    }

    @Override // defpackage.zs
    public final boolean g(int i, ea2 ea2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2 = 0;
        boolean z6 = false;
        if (yu5.g(ea2Var.p) == 1) {
            z = true;
        } else {
            z = false;
        }
        LinkedHashMap linkedHashMap = a61.a;
        synchronized (a61.class) {
        }
        if (z) {
            this.t = ea2Var;
        } else {
            this.u = ea2Var;
        }
        if (!this.l) {
            if (z) {
                z5 = this.p;
            } else {
                z5 = this.q;
            }
            if (z5) {
                return z5;
            }
            if ((i & 1) != 0) {
                z6 = true;
            }
            io3.n(z6);
            return z5;
        }
        if (this.j.get() == 1) {
            if (this.b.contains(1) && !z) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.b.contains(2) && z) {
                z3 = true;
                z2 = z4;
            } else {
                z3 = false;
                z2 = z4;
            }
        } else {
            z2 = false;
            z3 = false;
        }
        if (!this.o) {
            int i3 = this.j.get();
            if (z2 || z3) {
                i2 = 1;
            }
            this.e.c(i3 + i2);
            this.o = true;
        }
        boolean g = this.e.g(i, ea2Var);
        if (z) {
            this.p = g;
        } else {
            this.q = g;
        }
        if (z2) {
            this.e.g(2, A);
            this.p = true;
        }
        if (z3) {
            this.e.g(2, B);
            this.q = true;
        }
        return g;
    }

    public final void h() {
        int i = this.r;
        o15 o15Var = this.a;
        int i2 = i * o15Var.A;
        int i3 = this.m;
        if (i2 + i3 >= this.s) {
            rw2 e = this.n.e();
            this.i.c(new rz1(this.w, this.t, this.u, (String) e.get(1), (String) e.get(2)));
            this.s++;
        }
    }

    public final void i(Bitmap bitmap) {
        pi5 pi5Var = (pi5) this.g.get(2);
        pi5Var.getClass();
        if (pi5Var.a.e(bitmap, new ex0(this.w, 30.0f, 0).a()) != 1) {
            this.f.g(new f32(this, bitmap, (byte) 28), 10L);
        } else {
            pi5Var.f();
        }
    }

    public final boolean j() {
        if (this.m == this.a.A - 1) {
            return true;
        }
        return false;
    }

    public final void k(int i, ea2 ea2Var) {
        ge4 ge4Var = (ge4) this.h.get(Integer.valueOf(i));
        if (ge4Var == null) {
            return;
        }
        qr1 qr1Var = (qr1) this.a.get(this.m);
        long j = this.w;
        if (qr1.d(qr1Var.a) && i == 1) {
            ea2Var = null;
        }
        ge4Var.c(qr1Var, j, ea2Var, j());
    }

    @Override // defpackage.zs
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final pi5 d(ea2 ea2Var) {
        String str;
        pi5 pi5Var;
        int g = yu5.g(ea2Var.p);
        eq6.J(g);
        LinkedHashMap linkedHashMap = a61.a;
        synchronized (a61.class) {
        }
        if (this.l) {
            if (g == 2) {
                this.z = true;
            } else {
                this.y = true;
            }
            b95 d = this.e.d(ea2Var);
            if (d == null) {
                return null;
            }
            pi5Var = new pi5(this, d, g);
            this.g.put(Integer.valueOf(g), pi5Var);
            if (this.j.get() == 1) {
                if (this.b.contains(1) && g == 2) {
                    mi6 mi6Var = this.e;
                    da2 a = A.a();
                    a.o = qy3.n("audio/raw");
                    a.L = 2;
                    b95 d2 = mi6Var.d(new ea2(a));
                    d2.getClass();
                    this.g.put(1, new pi5(this, d2, 1));
                } else if (this.b.contains(2) && g == 1) {
                    b95 d3 = this.e.d(B);
                    d3.getClass();
                    this.g.put(2, new pi5(this, d3, 2));
                }
            }
        } else {
            if (g == 1) {
                str = "The preceding MediaItem does not contain any audio track. If the sequence starts with an item without audio track (like images), followed by items with audio tracks, then EditedMediaItemSequence.Builder.experimentalSetForceAudioTrack() needs to be set to true.";
            } else {
                str = "The preceding MediaItem does not contain any video track. If the sequence starts with an item without video track (audio only), followed by items with video tracks, then EditedMediaItemSequence.Builder.experimentalSetForceVideoTrack() needs to be set to true.";
            }
            pi5Var = (pi5) this.g.get(Integer.valueOf(g));
            io3.w(pi5Var, str);
        }
        k(g, ea2Var);
        if (this.j.get() == 1 && this.g.size() == 2) {
            if (g == 1) {
                k(2, B);
                this.k.incrementAndGet();
                this.f.f(new a92(this, (byte) 18));
                return pi5Var;
            }
            k(1, null);
        }
        return pi5Var;
    }

    @Override // defpackage.at
    public final void release() {
        this.n.release();
        this.v = true;
    }

    @Override // defpackage.at
    public final void start() {
        this.n.start();
        if (this.a.A <= 1) {
            return;
        }
        this.e.getClass();
    }
}
