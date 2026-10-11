package f;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3760a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3760a) {
            case 0:
                new Thread(runnable).start();
                return;
            case 1:
                p4.m.e().post(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
