package defpackage;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iy7 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public iy7(py7 py7Var, dy7 dy7Var, long j) {
        this.z = dy7Var;
        this.y = j;
        Objects.requireNonNull(py7Var);
        this.A = py7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Object obj = this.A;
        long j = this.y;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                py7 py7Var = (py7) obj;
                py7Var.U((dy7) obj2, false, j);
                py7Var.B = null;
                zz7 n = ((gu7) py7Var.x).n();
                n.L();
                n.M();
                n.Z(new ly7(n, null));
                return;
            default:
                ((ns1) obj2).run();
                p04 p04Var = (p04) obj;
                p04Var.getClass();
                hk6 hk6Var = new hk6(Executors.callable(this, null));
                n04 n04Var = new n04(hk6Var, p04Var.y.schedule(hk6Var, j, TimeUnit.MINUTES));
                n04Var.a(new la(n04Var, (byte) 26), qg1.x);
                return;
        }
    }

    public iy7(c38 c38Var, ns1 ns1Var, p04 p04Var, long j) {
        this.z = ns1Var;
        this.A = p04Var;
        this.y = j;
    }
}
