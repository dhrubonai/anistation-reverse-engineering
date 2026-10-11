package k2;

import r6.n1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6426a;

    /* renamed from: b, reason: collision with root package name */
    public long f6427b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6428c;

    public c(long j4, n1 n1Var) {
        this.f6426a = 0;
        this.f6427b = j4;
        this.f6428c = n1Var;
    }

    public final void a(int i10) {
        if (i10 >= 64) {
            Object obj = this.f6428c;
            if (((c) obj) != null) {
                ((c) obj).a(i10 - 64);
                return;
            }
            return;
        }
        this.f6427b &= ~(1 << i10);
    }

    public final int b(int i10) {
        Object obj = this.f6428c;
        if (((c) obj) == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f6427b);
            }
            return Long.bitCount(this.f6427b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f6427b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f6427b) + ((c) obj).b(i10 - 64);
    }

    public final void c() {
        if (((c) this.f6428c) == null) {
            this.f6428c = new c();
        }
    }

    public final boolean d(int i10) {
        if (i10 >= 64) {
            c();
            return ((c) this.f6428c).d(i10 - 64);
        }
        if ((this.f6427b & (1 << i10)) != 0) {
            return true;
        }
        return false;
    }

    public final void e(int i10, boolean z9) {
        boolean z10;
        if (i10 >= 64) {
            c();
            ((c) this.f6428c).e(i10 - 64, z9);
            return;
        }
        long j4 = this.f6427b;
        if ((Long.MIN_VALUE & j4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f6427b = ((j4 & (~j10)) << 1) | (j4 & j10);
        if (z9) {
            h(i10);
        } else {
            a(i10);
        }
        if (z10 || ((c) this.f6428c) != null) {
            c();
            ((c) this.f6428c).e(0, z10);
        }
    }

    public final boolean f(int i10) {
        boolean z9;
        if (i10 >= 64) {
            c();
            return ((c) this.f6428c).f(i10 - 64);
        }
        long j4 = 1 << i10;
        long j10 = this.f6427b;
        if ((j10 & j4) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        long j11 = j10 & (~j4);
        this.f6427b = j11;
        long j12 = j4 - 1;
        this.f6427b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        Object obj = this.f6428c;
        if (((c) obj) != null) {
            if (((c) obj).d(0)) {
                h(63);
            }
            ((c) this.f6428c).f(0);
        }
        return z9;
    }

    public final void g() {
        this.f6427b = 0L;
        Object obj = this.f6428c;
        if (((c) obj) != null) {
            ((c) obj).g();
        }
    }

    public final void h(int i10) {
        if (i10 >= 64) {
            c();
            ((c) this.f6428c).h(i10 - 64);
        } else {
            this.f6427b |= 1 << i10;
        }
    }

    public final String toString() {
        switch (this.f6426a) {
            case 1:
                if (((c) this.f6428c) == null) {
                    return Long.toBinaryString(this.f6427b);
                }
                return ((c) this.f6428c).toString() + "xx" + Long.toBinaryString(this.f6427b);
            default:
                return super.toString();
        }
    }

    public c() {
        this.f6426a = 1;
        this.f6427b = 0L;
    }
}
