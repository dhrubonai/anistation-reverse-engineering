package y1;

import android.os.SystemClock;
import c1.f1;
import f1.b0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f11480a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11481b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f11482c;

    /* renamed from: d, reason: collision with root package name */
    public final c1.v[] f11483d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f11484e;

    /* renamed from: f, reason: collision with root package name */
    public int f11485f;

    public c(f1 f1Var, int[] iArr) {
        boolean z9;
        int i10 = 0;
        if (iArr.length > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        f1Var.getClass();
        this.f11480a = f1Var;
        int length = iArr.length;
        this.f11481b = length;
        this.f11483d = new c1.v[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f11483d[i11] = f1Var.f1693d[iArr[i11]];
        }
        Arrays.sort(this.f11483d, new d0.b(2));
        this.f11482c = new int[this.f11481b];
        while (true) {
            int i12 = this.f11481b;
            if (i10 < i12) {
                this.f11482c[i10] = f1Var.b(this.f11483d[i10]);
                i10++;
            } else {
                this.f11484e = new long[i12];
                return;
            }
        }
    }

    @Override // y1.s
    public final /* synthetic */ void a(boolean z9) {
    }

    @Override // y1.s
    public final boolean b(int i10, long j4) {
        if (this.f11484e[i10] > j4) {
            return true;
        }
        return false;
    }

    @Override // y1.s
    public final c1.v c(int i10) {
        return this.f11483d[i10];
    }

    @Override // y1.s
    public final int d(c1.v vVar) {
        for (int i10 = 0; i10 < this.f11481b; i10++) {
            if (this.f11483d[i10] == vVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // y1.s
    public void e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11480a.equals(cVar.f11480a) && Arrays.equals(this.f11482c, cVar.f11482c)) {
            return true;
        }
        return false;
    }

    @Override // y1.s
    public final int f(int i10) {
        return this.f11482c[i10];
    }

    @Override // y1.s
    public int g(long j4, List list) {
        return list.size();
    }

    public final int hashCode() {
        if (this.f11485f == 0) {
            this.f11485f = Arrays.hashCode(this.f11482c) + (System.identityHashCode(this.f11480a) * 31);
        }
        return this.f11485f;
    }

    @Override // y1.s
    public void i() {
    }

    @Override // y1.s
    public final int j() {
        return this.f11482c[n()];
    }

    @Override // y1.s
    public final f1 k() {
        return this.f11480a;
    }

    @Override // y1.s
    public final c1.v l() {
        return this.f11483d[n()];
    }

    @Override // y1.s
    public final int length() {
        return this.f11482c.length;
    }

    @Override // y1.s
    public final boolean o(int i10, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b10 = b(i10, elapsedRealtime);
        for (int i11 = 0; i11 < this.f11481b && !b10; i11++) {
            if (i11 != i10 && !b(i11, elapsedRealtime)) {
                b10 = true;
            } else {
                b10 = false;
            }
        }
        if (!b10) {
            return false;
        }
        long[] jArr = this.f11484e;
        long j10 = jArr[i10];
        int i12 = b0.f3799a;
        long j11 = elapsedRealtime + j4;
        if (((j4 ^ j11) & (elapsedRealtime ^ j11)) < 0) {
            j11 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j10, j11);
        return true;
    }

    @Override // y1.s
    public void p(float f10) {
    }

    @Override // y1.s
    public final /* synthetic */ void r() {
    }

    @Override // y1.s
    public final /* synthetic */ boolean s(long j4, w1.f fVar, List list) {
        return false;
    }

    @Override // y1.s
    public final /* synthetic */ void t() {
    }

    @Override // y1.s
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f11481b; i11++) {
            if (this.f11482c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}
