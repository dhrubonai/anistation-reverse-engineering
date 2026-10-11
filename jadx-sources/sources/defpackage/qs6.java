package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class qs6 implements Runnable {
    public final /* synthetic */ ts6 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ ss6 z;

    public /* synthetic */ qs6(ts6 ts6Var, boolean z, ss6 ss6Var) {
        this.x = ts6Var;
        this.y = z;
        this.z = ss6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ss6 ss6Var;
        ts6 ts6Var = this.x;
        boolean z = this.y;
        ss6 ss6Var2 = this.z;
        try {
            synchronized (ts6Var.e) {
                try {
                    if (ts6Var.g && z) {
                        return;
                    }
                    while (true) {
                        synchronized (ts6Var.e) {
                            ss6Var = (ss6) ts6Var.f.poll();
                        }
                        if (ss6Var == null) {
                            ss6Var2.run();
                            return;
                        }
                        ss6Var.run();
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            ts6Var.b(e);
        }
    }
}
