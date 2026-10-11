package c9;

import androidx.lifecycle.q0;
import f9.g0;
import java.io.IOException;
import k9.q;
import r6.h0;
import y8.c0;
import y8.d0;
import y8.e0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i f2109a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f2110b;

    /* renamed from: c, reason: collision with root package name */
    public final f f2111c;

    /* renamed from: d, reason: collision with root package name */
    public final d9.d f2112d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2113e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2114f;

    /* renamed from: g, reason: collision with root package name */
    public final k f2115g;

    public e(i iVar, q0 q0Var, f fVar, d9.d dVar) {
        h0.u(q0Var, "eventListener");
        this.f2109a = iVar;
        this.f2110b = q0Var;
        this.f2111c = fVar;
        this.f2112d = dVar;
        this.f2115g = dVar.h();
    }

    public final IOException a(boolean z9, boolean z10, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        q0 q0Var = this.f2110b;
        i iVar = this.f2109a;
        if (z10) {
            if (iOException != null) {
                q0Var.getClass();
                h0.u(iVar, "call");
            } else {
                q0Var.getClass();
                h0.u(iVar, "call");
            }
        }
        if (z9) {
            if (iOException != null) {
                q0Var.getClass();
                h0.u(iVar, "call");
            } else {
                q0Var.getClass();
                h0.u(iVar, "call");
            }
        }
        return iVar.f(this, z10, z9, iOException);
    }

    public final e0 b(d0 d0Var) {
        d9.d dVar = this.f2112d;
        try {
            String a10 = d0.a(d0Var, "Content-Type");
            long e10 = dVar.e(d0Var);
            return new e0(a10, e10, new q(new d(this, dVar.f(d0Var), e10)));
        } catch (IOException e11) {
            this.f2110b.getClass();
            h0.u(this.f2109a, "call");
            d(e11);
            throw e11;
        }
    }

    public final c0 c(boolean z9) {
        try {
            c0 g10 = this.f2112d.g(z9);
            if (g10 != null) {
                g10.f11690m = this;
            }
            return g10;
        } catch (IOException e10) {
            this.f2110b.getClass();
            h0.u(this.f2109a, "call");
            d(e10);
            throw e10;
        }
    }

    public final void d(IOException iOException) {
        boolean z9;
        this.f2114f = true;
        this.f2111c.c(iOException);
        k h10 = this.f2112d.h();
        i iVar = this.f2109a;
        synchronized (h10) {
            h0.u(iVar, "call");
            if (iOException instanceof g0) {
                if (((g0) iOException).f4041a == f9.b.REFUSED_STREAM) {
                    int i10 = h10.f2150n + 1;
                    h10.f2150n = i10;
                    if (i10 > 1) {
                        h10.f2146j = true;
                        h10.f2148l++;
                    }
                } else if (((g0) iOException).f4041a != f9.b.CANCEL || !iVar.G) {
                    h10.f2146j = true;
                    h10.f2148l++;
                }
            } else {
                if (h10.f2143g != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9 || (iOException instanceof f9.a)) {
                    h10.f2146j = true;
                    if (h10.f2149m == 0) {
                        k.d(iVar.f2128a, h10.f2138b, iOException);
                        h10.f2148l++;
                    }
                }
            }
        }
    }
}
