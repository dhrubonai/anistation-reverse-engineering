package p1;

import android.os.SystemClock;
import c1.f1;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends y1.c {

    /* renamed from: g, reason: collision with root package name */
    public int f8435g;

    public h(f1 f1Var, int[] iArr) {
        super(f1Var, iArr);
        this.f8435g = d(f1Var.f1693d[iArr[0]]);
    }

    @Override // y1.s
    public final void h(long j4, long j10, long j11, List list, w1.p[] pVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!b(this.f8435g, elapsedRealtime)) {
            return;
        }
        int i10 = this.f11481b;
        do {
            i10--;
            if (i10 < 0) {
                throw new IllegalStateException();
            }
        } while (b(i10, elapsedRealtime));
        this.f8435g = i10;
    }

    @Override // y1.s
    public final int m() {
        return 0;
    }

    @Override // y1.s
    public final int n() {
        return this.f8435g;
    }

    @Override // y1.s
    public final Object q() {
        return null;
    }
}
