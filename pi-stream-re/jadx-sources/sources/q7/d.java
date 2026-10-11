package q7;

import a3.g;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.q0;
import java.util.concurrent.CancellationException;
import p7.a1;
import p7.f0;
import p7.i0;
import p7.k0;
import p7.k1;
import p7.m1;
import p7.o1;
import p7.x1;
import r6.h0;
import t7.s;
import z6.i;

/* loaded from: classes.dex */
public final class d extends m1 implements f0 {
    private volatile d _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f9227c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9228d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9229e;

    /* renamed from: f, reason: collision with root package name */
    public final d f9230f;

    public d(Handler handler, String str, boolean z9) {
        this.f9227c = handler;
        this.f9228d = str;
        this.f9229e = z9;
        this._immediate = z9 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f9230f = dVar;
    }

    @Override // p7.w
    public final void G(i iVar, Runnable runnable) {
        if (!this.f9227c.post(runnable)) {
            I(iVar, runnable);
        }
    }

    @Override // p7.w
    public final boolean H() {
        if (this.f9229e && h0.g(Looper.myLooper(), this.f9227c.getLooper())) {
            return false;
        }
        return true;
    }

    public final void I(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        a1 a1Var = (a1) iVar.r(q0.f1134x);
        if (a1Var != null) {
            ((k1) a1Var).k(cancellationException);
        }
        i0.f8692b.G(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d) && ((d) obj).f9227c == this.f9227c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f9227c);
    }

    @Override // p7.f0
    public final k0 q(long j4, final x1 x1Var, i iVar) {
        if (j4 > 4611686018427387903L) {
            j4 = 4611686018427387903L;
        }
        if (this.f9227c.postDelayed(x1Var, j4)) {
            return new k0() { // from class: q7.c
                @Override // p7.k0
                public final void b() {
                    d.this.f9227c.removeCallbacks(x1Var);
                }
            };
        }
        I(iVar, x1Var);
        return o1.f8727a;
    }

    @Override // p7.w
    public final String toString() {
        d dVar;
        String str;
        u7.d dVar2 = i0.f8691a;
        m1 m1Var = s.f10087a;
        if (this == m1Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = ((d) m1Var).f9230f;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            if (this == dVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f9228d;
            if (str2 == null) {
                str2 = this.f9227c.toString();
            }
            if (this.f9229e) {
                return g.s(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
