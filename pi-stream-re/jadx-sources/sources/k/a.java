package k;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6281a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6281a) {
            case 2:
                return;
            case 3:
                runnable.run();
                return;
            case 4:
                runnable.run();
                return;
            case 5:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
