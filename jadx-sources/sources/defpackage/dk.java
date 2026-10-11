package defpackage;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dk implements bi1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dk(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.bi1
    public final void dispose() {
        fg3 lifecycle;
        boolean isTerminated;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((zt5) obj3).remove(obj2);
                ((qk) obj).d.l(obj2);
                return;
            case 1:
                ((og3) obj3).getLifecycle().b((jg3) obj2);
                rz rzVar = (rz) ((w05) obj).x;
                if (rzVar != null) {
                    rzVar.a();
                    return;
                }
                return;
            case 2:
                og3 og3Var = (og3) obj3;
                if (og3Var != null && (lifecycle = og3Var.getLifecycle()) != null) {
                    lifecycle.b((pq) obj2);
                }
                gt0 gt0Var = (gt0) obj;
                dg3 dg3Var = dg3.ON_DESTROY;
                gt0Var.getClass();
                gt0Var.y = dg3Var.a();
                gt0Var.a();
                return;
            case 3:
                AutoCloseable autoCloseable = (hw6) obj3;
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    p65.b();
                    return;
                }
                if (((rg3) ((fg3) obj2)).i.compareTo(eg3.z) >= 0) {
                    kw6 kw6Var = (kw6) obj;
                    iw6 iw6Var = (iw6) kw6Var.a().b.g(p7.V);
                    if (iw6Var == null || iw6Var.c <= 0) {
                        kw6Var.a().d();
                        return;
                    }
                    return;
                }
                return;
            default:
                k95 k95Var = (k95) obj3;
                q95 q95Var = (q95) obj;
                if (k95Var.y.l(obj2) == q95Var) {
                    Map map = k95Var.x;
                    Map c = q95Var.c();
                    if (c.isEmpty()) {
                        map.remove(obj2);
                        return;
                    } else {
                        map.put(obj2, c);
                        return;
                    }
                }
                return;
        }
    }
}
