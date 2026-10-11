package w1;

import c1.v;

/* loaded from: classes.dex */
public abstract class n extends f {
    public final long A;

    public n(h1.h hVar, h1.l lVar, v vVar, int i10, Object obj, long j4, long j10, long j11) {
        super(hVar, lVar, 1, vVar, i10, obj, j4, j10);
        vVar.getClass();
        this.A = j11;
    }

    public long a() {
        long j4 = this.A;
        if (j4 == -1) {
            return -1L;
        }
        return 1 + j4;
    }

    public abstract boolean b();
}
