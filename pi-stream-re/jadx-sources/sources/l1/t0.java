package l1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6740b;

    public /* synthetic */ t0(Object obj, int i10) {
        this.f6739a = i10;
        this.f6740b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f6739a;
        Object obj = this.f6740b;
        switch (i10) {
            case 0:
                ((Handler) obj).post(runnable);
                return;
            case 1:
                ((Handler) obj).post(runnable);
                return;
            default:
                ((f1.x) ((f1.i) obj)).c(runnable);
                return;
        }
    }
}
