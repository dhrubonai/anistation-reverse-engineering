package w1;

import c1.v;

/* loaded from: classes.dex */
public abstract class a extends n {
    public final long B;
    public final long C;
    public c D;
    public int[] E;

    public a(h1.h hVar, h1.l lVar, v vVar, int i10, Object obj, long j4, long j10, long j11, long j12, long j13) {
        super(hVar, lVar, vVar, i10, obj, j4, j10, j13);
        this.B = j11;
        this.C = j12;
    }

    public final int d(int i10) {
        int[] iArr = this.E;
        w7.b.w(iArr);
        return iArr[i10];
    }
}
