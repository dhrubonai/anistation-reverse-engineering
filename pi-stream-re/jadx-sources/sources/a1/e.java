package a1;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f27a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f28b;

    public e(a aVar) {
        this.f28b = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a aVar = this.f28b;
        aVar.f14e.set(true);
        try {
            Process.setThreadPriority(10);
            aVar.f16x.c();
            Binder.flushPendingCommands();
            return null;
        } finally {
        }
    }
}
