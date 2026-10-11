package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gv4 implements cm1 {
    public final ExecutorService a;
    public final v41 b;
    public final ue0 c;
    public final gf0 d;
    public hk1 e;
    public volatile fv4 f;
    public volatile boolean g;

    public gv4(ar3 ar3Var, te0 te0Var, ExecutorService executorService, long j, long j2) {
        q41 q41Var;
        this.a = executorService;
        vq3 vq3Var = ar3Var.b;
        vq3Var.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri uri = vq3Var.a;
        String str = vq3Var.f;
        io3.w(uri, "The uri must be set.");
        v41 v41Var = new v41(uri, 0L, 1, null, map, j, j2, str, 4);
        this.b = v41Var;
        l33 l33Var = te0Var.A;
        if (l33Var != null) {
            q41Var = l33Var.H();
        } else {
            q41Var = null;
        }
        ue0 a = te0Var.a(q41Var, 1);
        this.c = a;
        this.d = new gf0(a, v41Var, null, new xv3(this, (byte) 3));
    }

    @Override // defpackage.cm1
    public final void a(hk1 hk1Var) {
        this.e = hk1Var;
        try {
            if (!this.g) {
                this.f = new fv4(this);
                this.a.execute(this.f);
                try {
                    this.f.get();
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof IOException)) {
                        String str = eq6.a;
                        throw cause;
                    }
                    throw ((IOException) cause);
                }
            }
        } finally {
            fv4 fv4Var = this.f;
            fv4Var.getClass();
            fv4Var.b();
        }
    }

    @Override // defpackage.cm1
    public final void cancel() {
        this.g = true;
        fv4 fv4Var = this.f;
        if (fv4Var != null) {
            fv4Var.cancel(true);
        }
    }

    @Override // defpackage.cm1
    public final void remove() {
        ue0 ue0Var = this.c;
        ue0Var.x.k(ue0Var.B.c(this.b));
    }
}
