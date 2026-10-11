package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mt6 implements gt6 {
    public final ht6 a;
    public final Object b = new Object();
    public final xv3 c;
    public final boolean d;
    public final long e;
    public int f;
    public int g;
    public final /* synthetic */ nt6 h;

    public mt6(nt6 nt6Var, Context context, tp5 tp5Var, hp0 hp0Var, l68 l68Var, List list, xv3 xv3Var, long j, boolean z) {
        this.h = nt6Var;
        this.c = xv3Var;
        this.d = z;
        this.e = j;
        ht6 a = tp5Var.a(context, hp0Var, this, qg1.x, j, z);
        this.a = a;
        a.h(list);
        a.m(l68Var);
    }

    @Override // defpackage.gt6
    public final void a(ns6 ns6Var) {
        this.c.accept(oz1.e(ns6Var));
    }

    @Override // defpackage.gt6
    public final void b(long j) {
        this.h.h = j;
        try {
            this.h.f.b();
        } catch (oz1 e) {
            this.c.accept(e);
        }
    }

    @Override // defpackage.gt6
    public final void c(int i, int i2) {
        i36 i36Var;
        try {
            i36Var = this.h.f.a(i, i2);
        } catch (oz1 e) {
            this.c.accept(e);
            i36Var = null;
        }
        this.a.p(i36Var);
    }

    @Override // defpackage.gt6
    public final void d(long j, boolean z) {
        if (!this.d) {
            synchronized (this.b) {
                this.g++;
            }
            e();
        }
    }

    public final void e() {
        boolean z;
        int i;
        synchronized (this.b) {
            try {
                int i2 = this.g;
                if (i2 > 0 && (i = this.f) < -1) {
                    z = true;
                    this.f = i + 1;
                    this.g = i2 - 1;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.a.k(-3L);
        }
    }
}
