package defpackage;

import android.content.Context;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yb1 implements ye2 {
    public final fq3 a;
    public final g34 b;
    public final y23 c;
    public final st3 d;
    public final ts6 e;
    public boolean g;
    public hp0 l;
    public EGLDisplay m;
    public EGLSurface n;
    public int o = -1;
    public final SparseArray f = new SparseArray();
    public final he6 h = new he6(false, 1);
    public final sr1 i = new sr1(1);
    public final sr1 j = new sr1(1);
    public l68 k = l68.S;

    public yb1(Context context, y23 y23Var, ScheduledExecutorService scheduledExecutorService, fq3 fq3Var, g34 g34Var) {
        this.a = fq3Var;
        this.b = g34Var;
        this.c = y23Var;
        this.d = new st3(context, (byte) 12);
        ts6 ts6Var = new ts6(scheduledExecutorService, false, new h5((Object) fq3Var, (byte) 12));
        this.e = ts6Var;
        ts6Var.f(new ub1(this, (byte) 2), true);
    }

    @Override // defpackage.ye2
    public final void a(long j) {
        this.e.f(new tb1(this, j, (byte) 0), true);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ew2, jw2] */
    public final synchronized o15 b() {
        if (this.h.d() == 0) {
            z62 z62Var = nw2.y;
            return o15.B;
        }
        for (int i = 0; i < this.f.size(); i++) {
            if (((xb1) this.f.valueAt(i)).a.isEmpty()) {
                z62 z62Var2 = nw2.y;
                return o15.B;
            }
        }
        ?? ew2Var = new ew2(4);
        wb1 wb1Var = (wb1) ((xb1) this.f.get(this.o)).a.element();
        ew2Var.c(wb1Var);
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (this.f.keyAt(i2) != this.o) {
                xb1 xb1Var = (xb1) this.f.valueAt(i2);
                if (xb1Var.a.size() == 1 && !xb1Var.b) {
                    z62 z62Var3 = nw2.y;
                    return o15.B;
                }
                Iterator it = xb1Var.a.iterator();
                long j = Long.MAX_VALUE;
                wb1 wb1Var2 = null;
                while (it.hasNext()) {
                    wb1 wb1Var3 = (wb1) it.next();
                    long j2 = wb1Var3.b.b;
                    long abs = Math.abs(j2 - wb1Var.b.b);
                    if (abs < j) {
                        wb1Var2 = wb1Var3;
                        j = abs;
                    }
                    if (j2 > wb1Var.b.b || (!it.hasNext() && xb1Var.b)) {
                        wb1Var2.getClass();
                        ew2Var.c(wb1Var2);
                        break;
                    }
                }
            }
        }
        o15 g = ew2Var.g();
        if (g.A != this.f.size()) {
            z62 z62Var4 = nw2.y;
            return o15.B;
        }
        return g;
    }

    public final synchronized void c() {
        try {
            o15 b = b();
            if (b.isEmpty()) {
                return;
            }
            wb1 wb1Var = (wb1) b.get(this.o);
            io3.t(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < b.A) {
                we2 we2Var = ((wb1) b.get(i2)).b.a;
                sq5 sq5Var = new sq5(we2Var.c, we2Var.d);
                int i4 = i3 + 1;
                int b2 = fw2.b(objArr.length, i4);
                if (b2 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b2);
                }
                objArr[i3] = sq5Var;
                i2++;
                i3 = i4;
            }
            l68 l68Var = this.k;
            o15 j = nw2.j(objArr, i3);
            l68Var.getClass();
            sq5 sq5Var2 = (sq5) j.get(0);
            this.h.c(this.c, sq5Var2.a, sq5Var2.b);
            we2 f = this.h.f();
            long j2 = wb1Var.b.b;
            this.i.a(j2);
            io3.t(4, "initialCapacity");
            Object[] objArr2 = new Object[4];
            int i5 = 0;
            while (i < b.A) {
                me2 me2Var = new me2(((wb1) b.get(i)).b.a, ((wb1) b.get(i)).c);
                int i6 = i5 + 1;
                int b3 = fw2.b(objArr2.length, i6);
                if (b3 > objArr2.length) {
                    objArr2 = Arrays.copyOf(objArr2, b3);
                }
                objArr2[i5] = me2Var;
                i++;
                i5 = i6;
            }
            this.d.k(nw2.j(objArr2, i5), f);
            this.j.a(a34.O());
            this.b.a(this, f, j2);
            xb1 xb1Var = (xb1) this.f.get(this.o);
            f(xb1Var, 1);
            d();
            if (this.g && xb1Var.a.isEmpty()) {
                this.a.k();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        for (int i = 0; i < this.f.size(); i++) {
            if (this.f.keyAt(i) != this.o) {
                e((xb1) this.f.valueAt(i));
            }
        }
    }

    public final synchronized void e(xb1 xb1Var) {
        final long j;
        int G;
        xb1 xb1Var2 = (xb1) this.f.get(this.o);
        if (xb1Var2.a.isEmpty() && xb1Var2.b) {
            f(xb1Var, xb1Var.a.size());
            return;
        }
        wb1 wb1Var = (wb1) xb1Var2.a.peek();
        if (wb1Var != null) {
            j = wb1Var.b.b;
        } else {
            j = -9223372036854775807L;
        }
        Iterable q33Var = new q33(xb1Var.a, new gs4() { // from class: vb1
            @Override // defpackage.gs4
            public final boolean apply(Object obj) {
                if (((wb1) obj).b.b <= j) {
                    return true;
                }
                return false;
            }
        });
        if (q33Var instanceof Collection) {
            G = ((Collection) q33Var).size();
        } else {
            Iterator it = q33Var.iterator();
            long j2 = 0;
            while (true) {
                r33 r33Var = (r33) it;
                if (!r33Var.hasNext()) {
                    break;
                }
                r33Var.next();
                j2++;
            }
            G = jf7.G(j2);
        }
        f(xb1Var, Math.max(G - 1, 0));
    }

    public final synchronized void f(xb1 xb1Var, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            wb1 wb1Var = (wb1) xb1Var.a.remove();
            wb1Var.a.a(wb1Var.b.b);
        }
    }
}
