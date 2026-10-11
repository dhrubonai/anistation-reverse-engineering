package k3;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6455b;

    public /* synthetic */ f(Context context, int i10) {
        this.f6454a = i10;
        this.f6455b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6454a;
        Context context = this.f6455b;
        switch (i10) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(context, 1));
                return;
            default:
                com.bumptech.glide.d.j0(context, new k.a(6), com.bumptech.glide.d.f2193h, false);
                return;
        }
    }
}
