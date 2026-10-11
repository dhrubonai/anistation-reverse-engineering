package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cy1 implements z25 {
    public final ok2 a = new ok2();
    public final qr1 b;
    public final st3 c;
    public final int d;
    public final zs e;
    public final LogSessionId f;

    public cy1(qr1 qr1Var, st3 st3Var, int i, zs zsVar, LogSessionId logSessionId) {
        this.b = qr1Var;
        this.c = st3Var;
        this.d = i;
        this.e = zsVar;
        this.f = logSessionId;
    }

    @Override // defpackage.z25
    public final w30[] b(Handler handler, lt6 lt6Var, iw iwVar, ld6 ld6Var, ky3 ky3Var) {
        ArrayList arrayList = new ArrayList();
        qr1 qr1Var = this.b;
        boolean z = qr1Var.b;
        zs zsVar = this.e;
        ok2 ok2Var = this.a;
        st3 st3Var = this.c;
        if (!z) {
            arrayList.add(new sx1(st3Var, ok2Var, zsVar, this.f));
        }
        if (!qr1Var.c) {
            arrayList.add(new ux1(st3Var, this.d, ok2Var, zsVar, this.f, qr1Var.e));
        }
        return (w30[]) arrayList.toArray(new w30[0]);
    }
}
