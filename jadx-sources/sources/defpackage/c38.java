package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c38 implements g38 {
    public static boolean c;
    public final r26 a;
    public final int b = Math.max(5, 10);

    public c38(r26 r26Var) {
        this.a = r26Var;
    }

    @Override // defpackage.g38
    public final void a() {
        synchronized (c38.class) {
            try {
                if (!c) {
                    ns1 ns1Var = new ns1(this);
                    long j = this.b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    p04 p04Var = (p04) this.a.get();
                    iy7 iy7Var = new iy7(this, ns1Var, p04Var, j);
                    p04Var.getClass();
                    hk6 hk6Var = new hk6(Executors.callable(iy7Var, null));
                    n04 n04Var = new n04(hk6Var, p04Var.y.schedule(hk6Var, j, timeUnit));
                    n04Var.a(new la(n04Var, (byte) 26), qg1.x);
                    c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
