package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d81 implements wp1 {
    public final /* synthetic */ e81 A;
    public final tp1 x;
    public qp1 y;
    public boolean z;

    public d81(e81 e81Var, tp1 tp1Var) {
        this.A = e81Var;
        this.x = tp1Var;
    }

    @Override // defpackage.wp1
    public final void release() {
        Handler handler = this.A.u;
        handler.getClass();
        eq6.a0(handler, new p0(this, (byte) 13));
    }
}
