package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tf implements Choreographer.FrameCallback {
    public final /* synthetic */ qg0 x;
    public final /* synthetic */ ub2 y;

    public tf(qg0 qg0Var, uf ufVar, ub2 ub2Var) {
        this.x = qg0Var;
        this.y = ub2Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object y45Var;
        try {
            y45Var = this.y.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        this.x.resumeWith(y45Var);
    }
}
