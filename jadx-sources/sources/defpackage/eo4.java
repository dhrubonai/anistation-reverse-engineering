package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eo4 implements gt6 {
    public static final qr B = new qr((byte) 1);
    public int A;
    public final Context a;
    public final tp5 b;
    public final SparseArray c;
    public final boolean d;
    public final kc1 e;
    public final xn4 f;
    public final f46 g;
    public final CopyOnWriteArraySet h;
    public final long i;
    public final zs6 j;
    public wp k = new wp();
    public ea2 l;
    public final l68 m;
    public final o15 n;
    public k46 o;
    public ht6 p;
    public ms6 q;
    public long r;
    public int s;
    public Pair t;
    public int u;
    public byte v;
    public long w;
    public long x;
    public boolean y;
    public int z;

    public eo4(yn4 yn4Var) {
        long j;
        this.a = yn4Var.a;
        tp5 tp5Var = yn4Var.c;
        tp5Var.getClass();
        this.b = tp5Var;
        this.c = new SparseArray();
        z62 z62Var = nw2.y;
        this.n = o15.B;
        this.m = l68.S;
        this.d = yn4Var.d;
        f46 f46Var = yn4Var.e;
        this.g = f46Var;
        long j2 = yn4Var.g;
        if (j2 != -9223372036854775807L) {
            j = -j2;
        } else {
            j = -9223372036854775807L;
        }
        this.i = j;
        zs6 zs6Var = yn4Var.h;
        this.j = zs6Var;
        this.e = new kc1(yn4Var.b, zs6Var, f46Var);
        this.f = new xn4(this);
        this.h = new CopyOnWriteArraySet();
        this.l = new ea2(new da2());
        this.r = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -1;
        this.v = (byte) 0;
    }

    @Override // defpackage.gt6
    public final void a(ns6 ns6Var) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            bo4 bo4Var = (bo4) it.next();
            bo4Var.i.execute(new ze((Object) bo4Var, (Object) bo4Var.h, (Object) ns6Var, (byte) 18));
        }
    }

    @Override // defpackage.gt6
    public final void b(long j) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((bo4) it.next()).getClass();
        }
    }

    @Override // defpackage.gt6
    public final void c(int i, int i2) {
        da2 a = this.l.a();
        a.v = i;
        a.w = i2;
        this.l = new ea2(a);
        h();
    }

    @Override // defpackage.gt6
    public final void d(long j, boolean z) {
        if (this.u <= 0) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                bo4 bo4Var = (bo4) it.next();
                bo4Var.i.execute(new ao4(bo4Var.h, (byte) 2));
            }
            if (z) {
                ms6 ms6Var = this.q;
                if (ms6Var != null) {
                    ms6Var.d(j, -9223372036854775807L, this.l, null);
                    return;
                }
                return;
            }
            this.w = j;
            do4 do4Var = (do4) this.k.s(j);
            if (do4Var != null) {
                this.r = do4Var.a;
                this.s = do4Var.b;
                h();
            }
            xn4 xn4Var = this.f;
            kc1 kc1Var = this.e;
            kc1Var.f(j, xn4Var);
            long j2 = this.x;
            if (j2 != -9223372036854775807L && j >= j2) {
                kc1Var.b();
                this.y = true;
            }
        }
    }

    public final void e(boolean z) {
        wp wpVar;
        if (this.v == 1) {
            this.u++;
            this.e.n(z);
            while (true) {
                int y = this.k.y();
                wpVar = this.k;
                if (y <= 1) {
                    break;
                } else {
                    wpVar.r();
                }
            }
            if (wpVar.y() == 1) {
                do4 do4Var = (do4) this.k.r();
                do4Var.getClass();
                this.r = do4Var.a;
                this.s = do4Var.b;
                h();
            }
            this.w = -9223372036854775807L;
            if (z) {
                this.x = -9223372036854775807L;
                this.y = false;
            }
            k46 k46Var = this.o;
            k46Var.getClass();
            k46Var.f(new a92(this, (byte) 12));
        }
    }

    @Override // defpackage.gt6
    public final void f(float f) {
        da2 a = this.l.a();
        a.a(f);
        this.l = new ea2(a);
        h();
    }

    public final void g(Surface surface, int i, int i2) {
        ht6 ht6Var = this.p;
        if (ht6Var == null) {
            return;
        }
        kc1 kc1Var = this.e;
        if (surface != null) {
            ht6Var.p(new i36(surface, i, i2, 0, false));
            kc1Var.t(surface, new sq5(i, i2));
        } else {
            ht6Var.p(null);
            kc1Var.k();
        }
    }

    public final void h() {
        ea2 ea2Var = this.l;
        long j = this.r;
        int i = this.s;
        z62 z62Var = nw2.y;
        this.e.u(i, j, ea2Var, o15.B);
    }
}
