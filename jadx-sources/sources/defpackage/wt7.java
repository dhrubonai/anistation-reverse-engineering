package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wt7 extends FutureTask implements Comparable {
    public final /* synthetic */ au7 A;
    public final long x;
    public final boolean y;
    public final String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt7(au7 au7Var, Callable callable, boolean z) {
        super(callable);
        this.A = au7Var;
        long andIncrement = au7.H.getAndIncrement();
        this.x = andIncrement;
        this.z = "Task exception on worker thread";
        this.y = z;
        if (andIncrement == Long.MAX_VALUE) {
            es7 es7Var = ((gu7) au7Var.x).C;
            gu7.l(es7Var);
            es7Var.C.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        wt7 wt7Var = (wt7) obj;
        boolean z = wt7Var.y;
        boolean z2 = this.y;
        if (z2 != z) {
            if (z2) {
                return -1;
            }
            return 1;
        }
        long j = wt7Var.x;
        long j2 = this.x;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        es7 es7Var = ((gu7) this.A.x).C;
        gu7.l(es7Var);
        es7Var.D.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        es7 es7Var = ((gu7) this.A.x).C;
        gu7.l(es7Var);
        es7Var.C.b(th, this.z);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt7(au7 au7Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.A = au7Var;
        long andIncrement = au7.H.getAndIncrement();
        this.x = andIncrement;
        this.z = str;
        this.y = z;
        if (andIncrement == Long.MAX_VALUE) {
            es7 es7Var = ((gu7) au7Var.x).C;
            gu7.l(es7Var);
            es7Var.C.a("Tasks index overflow");
        }
    }
}
