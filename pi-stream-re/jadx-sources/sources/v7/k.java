package v7;

import java.util.concurrent.atomic.AtomicReferenceArray;
import t7.x;

/* loaded from: classes.dex */
public final class k extends x {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceArray f10694e;

    public k(long j4, k kVar, int i10) {
        super(j4, kVar, i10);
        this.f10694e = new AtomicReferenceArray(j.f10693f);
    }

    @Override // t7.x
    public final int d() {
        return j.f10693f;
    }

    @Override // t7.x
    public final void e(int i10) {
        this.f10694e.set(i10, j.f10692e);
        if (x.f10090d.incrementAndGet(this) == j.f10693f) {
            b();
        }
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f10091c + ", hashCode=" + hashCode() + ']';
    }
}
