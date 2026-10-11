package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ii5 extends ag5 {
    public final /* synthetic */ AtomicReferenceArray D;

    public ii5(long j, ii5 ii5Var, int i) {
        super(j, ii5Var, i);
        this.D = new AtomicReferenceArray(hi5.f);
    }

    @Override // defpackage.ag5
    public final int g() {
        return hi5.f;
    }

    @Override // defpackage.ag5
    public final void h(int i, l11 l11Var) {
        this.D.set(i, hi5.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.A + ", hashCode=" + hashCode() + ']';
    }
}
