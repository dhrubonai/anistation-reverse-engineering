package f9;

import r6.h0;

/* loaded from: classes.dex */
public final class y implements k9.u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4109a;

    /* renamed from: b, reason: collision with root package name */
    public final k9.g f4110b = new k9.g();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f4112d;

    public y(b0 b0Var, boolean z9) {
        this.f4112d = b0Var;
        this.f4109a = z9;
    }

    public final void a(boolean z9) {
        long min;
        boolean z10;
        boolean z11;
        b0 b0Var = this.f4112d;
        synchronized (b0Var) {
            b0Var.f3993l.h();
            while (b0Var.f3986e >= b0Var.f3987f && !this.f4109a && !this.f4111c && b0Var.f() == null) {
                try {
                    b0Var.l();
                } finally {
                    b0Var.f3993l.l();
                }
            }
            b0Var.f3993l.l();
            b0Var.b();
            min = Math.min(b0Var.f3987f - b0Var.f3986e, this.f4110b.f6521b);
            b0Var.f3986e += min;
            if (z9 && min == this.f4110b.f6521b) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z10;
        }
        this.f4112d.f3993l.h();
        try {
            b0 b0Var2 = this.f4112d;
            b0Var2.f3983b.G(b0Var2.f3982a, z11, this.f4110b, min);
        } finally {
            b0Var = this.f4112d;
        }
    }

    @Override // k9.u
    public final k9.y c() {
        return this.f4112d.f3993l;
    }

    @Override // k9.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z9;
        b0 b0Var = this.f4112d;
        byte[] bArr = z8.b.f12133a;
        synchronized (b0Var) {
            if (this.f4111c) {
                return;
            }
            boolean z10 = false;
            if (b0Var.f() == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            b0 b0Var2 = this.f4112d;
            if (!b0Var2.f3991j.f4109a) {
                if (this.f4110b.f6521b > 0) {
                    z10 = true;
                }
                if (z10) {
                    while (this.f4110b.f6521b > 0) {
                        a(true);
                    }
                } else if (z9) {
                    b0Var2.f3983b.G(b0Var2.f3982a, true, null, 0L);
                }
            }
            synchronized (this.f4112d) {
                this.f4111c = true;
            }
            this.f4112d.f3983b.flush();
            this.f4112d.a();
        }
    }

    @Override // k9.u, java.io.Flushable
    public final void flush() {
        b0 b0Var = this.f4112d;
        byte[] bArr = z8.b.f12133a;
        synchronized (b0Var) {
            b0Var.b();
        }
        while (this.f4110b.f6521b > 0) {
            a(false);
            this.f4112d.f3983b.flush();
        }
    }

    @Override // k9.u
    public final void w(k9.g gVar, long j4) {
        h0.u(gVar, "source");
        byte[] bArr = z8.b.f12133a;
        k9.g gVar2 = this.f4110b;
        gVar2.w(gVar, j4);
        while (gVar2.f6521b >= 16384) {
            a(false);
        }
    }
}
