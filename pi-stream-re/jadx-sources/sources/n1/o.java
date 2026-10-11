package n1;

import java.util.List;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: j, reason: collision with root package name */
    public final List f7972j;

    public o(j jVar, long j4, long j10, long j11, long j12, List list, long j13, List list2, long j14, long j15) {
        super(jVar, j4, j10, j11, j12, list, j13, j14, j15);
        this.f7972j = list2;
    }

    @Override // n1.n
    public final long d(long j4) {
        return this.f7972j.size();
    }

    @Override // n1.n
    public final j h(long j4, m mVar) {
        return (j) this.f7972j.get((int) (j4 - this.f7966d));
    }

    @Override // n1.n
    public final boolean i() {
        return true;
    }
}
