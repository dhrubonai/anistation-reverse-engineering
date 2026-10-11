package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ms1 extends tl7 {
    public final /* synthetic */ tl7 k;
    public final /* synthetic */ ThreadPoolExecutor l;

    public ms1(tl7 tl7Var, ThreadPoolExecutor threadPoolExecutor) {
        this.k = tl7Var;
        this.l = threadPoolExecutor;
    }

    @Override // defpackage.tl7
    public final void C(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.C(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.tl7
    public final void D(zp2 zp2Var) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.D(zp2Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
