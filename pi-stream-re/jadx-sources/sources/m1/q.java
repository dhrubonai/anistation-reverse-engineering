package m1;

import androidx.appcompat.widget.a0;
import c1.v;
import f1.b0;
import v1.v0;

/* loaded from: classes.dex */
public final class q implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f7119a;

    /* renamed from: c, reason: collision with root package name */
    public long[] f7121c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7122d;

    /* renamed from: e, reason: collision with root package name */
    public n1.g f7123e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7124f;

    /* renamed from: x, reason: collision with root package name */
    public int f7125x;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f7120b = new a0(15);

    /* renamed from: y, reason: collision with root package name */
    public long f7126y = -9223372036854775807L;

    public q(n1.g gVar, v vVar, boolean z9) {
        this.f7119a = vVar;
        this.f7123e = gVar;
        this.f7121c = gVar.f7939b;
        d(gVar, z9);
    }

    @Override // v1.v0
    public final boolean a() {
        return true;
    }

    @Override // v1.v0
    public final void b() {
    }

    public final void c(long j4) {
        boolean z9 = true;
        int b10 = b0.b(this.f7121c, j4, true);
        this.f7125x = b10;
        if (!this.f7122d || b10 != this.f7121c.length) {
            z9 = false;
        }
        if (!z9) {
            j4 = -9223372036854775807L;
        }
        this.f7126y = j4;
    }

    public final void d(n1.g gVar, boolean z9) {
        long j4;
        int i10 = this.f7125x;
        if (i10 == 0) {
            j4 = -9223372036854775807L;
        } else {
            j4 = this.f7121c[i10 - 1];
        }
        this.f7122d = z9;
        this.f7123e = gVar;
        long[] jArr = gVar.f7939b;
        this.f7121c = jArr;
        long j10 = this.f7126y;
        if (j10 != -9223372036854775807L) {
            c(j10);
        } else if (j4 != -9223372036854775807L) {
            this.f7125x = b0.b(jArr, j4, false);
        }
    }

    @Override // v1.v0
    public final int g(a0 a0Var, i1.h hVar, int i10) {
        boolean z9;
        int i11 = this.f7125x;
        if (i11 == this.f7121c.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && !this.f7122d) {
            hVar.f5247b = 4;
            return -4;
        }
        if ((i10 & 2) == 0 && this.f7124f) {
            if (z9) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.f7125x = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] J = this.f7120b.J(this.f7123e.f7938a[i11]);
                hVar.j(J.length);
                hVar.f5262e.put(J);
            }
            hVar.f5264x = this.f7121c[i11];
            hVar.f5247b = 1;
            return -4;
        }
        a0Var.f404c = this.f7119a;
        this.f7124f = true;
        return -5;
    }

    @Override // v1.v0
    public final int i(long j4) {
        int max = Math.max(this.f7125x, b0.b(this.f7121c, j4, true));
        int i10 = max - this.f7125x;
        this.f7125x = max;
        return i10;
    }
}
