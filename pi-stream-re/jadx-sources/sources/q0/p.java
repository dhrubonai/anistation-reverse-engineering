package q0;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class p extends com.bumptech.glide.d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.d f8939n;
    public final /* synthetic */ ThreadPoolExecutor o;

    public p(com.bumptech.glide.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f8939n = dVar;
        this.o = threadPoolExecutor;
    }

    @Override // com.bumptech.glide.d
    public final void M(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.o;
        try {
            this.f8939n.M(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.bumptech.glide.d
    public final void N(i.g gVar) {
        ThreadPoolExecutor threadPoolExecutor = this.o;
        try {
            this.f8939n.N(gVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
