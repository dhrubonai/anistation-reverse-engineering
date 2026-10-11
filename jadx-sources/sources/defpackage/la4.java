package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class la4 extends t0 implements h43 {
    public static final la4 x = new t0(h95.F);

    @Override // defpackage.h43
    public final nl0 A(t43 t43Var) {
        return ma4.x;
    }

    @Override // defpackage.h43
    public final Object G(vz0 vz0Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.h43
    public final CancellationException I() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.h43
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.h43
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.h43
    public final boolean k0() {
        return false;
    }

    @Override // defpackage.h43
    public final ei1 l0(ub2 ub2Var) {
        return ma4.x;
    }

    @Override // defpackage.h43
    public final boolean start() {
        return false;
    }

    @Override // defpackage.h43
    public final ei1 t(boolean z, boolean z2, ub2 ub2Var) {
        return ma4.x;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.h43
    public final void l(CancellationException cancellationException) {
    }
}
