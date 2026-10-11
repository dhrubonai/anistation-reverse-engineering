package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xp3 implements ev6 {
    public final /* synthetic */ hp3 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ aq3 c;

    public xp3(aq3 aq3Var, hp3 hp3Var, int i, long j) {
        this.c = aq3Var;
        this.a = hp3Var;
        this.b = i;
    }

    @Override // defpackage.ev6
    public final void a(long j) {
        this.c.P0(this.a, this.b, j);
    }

    @Override // defpackage.ev6
    public final void b() {
        Trace.beginSection("dropVideoBuffer");
        this.a.f(this.b);
        Trace.endSection();
        this.c.U0(0, 1);
    }
}
