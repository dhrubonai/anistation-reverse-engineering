package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ux5 extends e3 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.e3
    public final boolean a(d3 d3Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(tx5.a);
        return true;
    }

    @Override // defpackage.e3
    public final vz0[] b(d3 d3Var) {
        this.a.set(null);
        return t80.a;
    }
}
