package v1;

import java.util.Arrays;
import java.util.List;
import r6.n1;

/* loaded from: classes.dex */
public final class i implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f10438a;

    /* renamed from: b, reason: collision with root package name */
    public long f10439b;

    public i(List list, List list2) {
        boolean z9;
        r6.m0 m0Var = r6.o0.f9505b;
        r6.h0.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        if (list.size() == list2.size()) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        int i11 = 0;
        while (i10 < list.size()) {
            h hVar = new h((x0) list.get(i10), (List) list2.get(i10));
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, q6.g.y(objArr.length, i12));
            }
            objArr[i11] = hVar;
            i10++;
            i11 = i12;
        }
        this.f10438a = r6.o0.h(i11, objArr);
        this.f10439b = -9223372036854775807L;
    }

    @Override // v1.x0
    public final boolean c() {
        int i10 = 0;
        while (true) {
            n1 n1Var = this.f10438a;
            if (i10 >= n1Var.size()) {
                return false;
            }
            if (((h) n1Var.get(i10)).c()) {
                return true;
            }
            i10++;
        }
    }

    @Override // v1.x0
    public final long h() {
        int i10 = 0;
        long j4 = Long.MAX_VALUE;
        while (true) {
            n1 n1Var = this.f10438a;
            if (i10 >= n1Var.size()) {
                break;
            }
            long h10 = ((h) n1Var.get(i10)).h();
            if (h10 != Long.MIN_VALUE) {
                j4 = Math.min(j4, h10);
            }
            i10++;
        }
        if (j4 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // v1.x0
    public final boolean n(j1.n0 n0Var) {
        boolean z9;
        boolean z10;
        boolean z11 = false;
        do {
            long h10 = h();
            if (h10 == Long.MIN_VALUE) {
                break;
            }
            int i10 = 0;
            z9 = false;
            while (true) {
                n1 n1Var = this.f10438a;
                if (i10 >= n1Var.size()) {
                    break;
                }
                long h11 = ((h) n1Var.get(i10)).h();
                if (h11 != Long.MIN_VALUE && h11 <= n0Var.f5835a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (h11 == h10 || z10) {
                    z9 |= ((h) n1Var.get(i10)).n(n0Var);
                }
                i10++;
            }
            z11 |= z9;
        } while (z9);
        return z11;
    }

    @Override // v1.x0
    public final long o() {
        int i10 = 0;
        long j4 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        while (true) {
            n1 n1Var = this.f10438a;
            if (i10 >= n1Var.size()) {
                break;
            }
            h hVar = (h) n1Var.get(i10);
            long o = hVar.o();
            if ((hVar.a().contains(1) || hVar.a().contains(2) || hVar.a().contains(4)) && o != Long.MIN_VALUE) {
                j4 = Math.min(j4, o);
            }
            if (o != Long.MIN_VALUE) {
                j10 = Math.min(j10, o);
            }
            i10++;
        }
        if (j4 != Long.MAX_VALUE) {
            this.f10439b = j4;
            return j4;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j11 = this.f10439b;
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return j10;
    }

    @Override // v1.x0
    public final void v(long j4) {
        int i10 = 0;
        while (true) {
            n1 n1Var = this.f10438a;
            if (i10 < n1Var.size()) {
                ((h) n1Var.get(i10)).v(j4);
                i10++;
            } else {
                return;
            }
        }
    }
}
