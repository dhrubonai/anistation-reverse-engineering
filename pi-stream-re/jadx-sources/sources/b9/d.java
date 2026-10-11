package b9;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f1560a;

    public d(z8.a aVar) {
        this.f1560a = new ThreadPoolExecutor(0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
