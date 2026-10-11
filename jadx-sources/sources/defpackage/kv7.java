package defpackage;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kv7 {
    public static final zk3 j = new zk3("ClientCastAnalytics", null);
    public static boolean k = true;
    public final pk5 a;
    public final qn7 b;
    public final gl7 c;
    public Long e;
    public st3 g;
    public un7 h;
    public int i = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public kv7(Context context, wb7 wb7Var, pk5 pk5Var, qn7 qn7Var, gl7 gl7Var) {
        this.a = pk5Var;
        this.b = qn7Var;
        this.c = gl7Var;
    }

    public final void a(final l38 l38Var, final int i) {
        this.f.execute(new Runnable() { // from class: yq7
            @Override // java.lang.Runnable
            public final void run() {
                lj2 lj2Var;
                v78 v78Var;
                kv7 kv7Var = kv7.this;
                l38 l38Var2 = l38Var;
                short s = i;
                un7 un7Var = kv7Var.h;
                if (un7Var == null) {
                    return;
                }
                synchronized (un7Var) {
                    p76 p76Var = new p76();
                    wb7 wb7Var = un7Var.a;
                    o76 b = o76.b();
                    b.d = new fq3(wb7Var, (byte) 27);
                    b.c = (short) 4501;
                    v78 d = wb7Var.d(0, b.a());
                    ub7 ub7Var = new ub7(p76Var, (byte) 4);
                    lj2Var = r76.a;
                    d.a(lj2Var, ub7Var);
                    d.b.m(new os7((Executor) lj2Var, (ce4) new fq3(p76Var, (byte) 26)));
                    d.j();
                    un7Var.c.postDelayed(new la(p76Var, (byte) 16), un7Var.b * 1000);
                    v78Var = p76Var.a;
                }
                v78Var.a(lj2Var, new uw4(kv7Var, l38Var2, s));
            }
        });
    }
}
