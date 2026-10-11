package a1;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class f extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f29a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, e eVar) {
        super(eVar);
        this.f29a = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        a aVar = this.f29a;
        try {
            Object obj = get();
            if (!aVar.f14e.get()) {
                aVar.a(obj);
            }
        } catch (InterruptedException e10) {
            Log.w("AsyncTask", e10);
        } catch (CancellationException unused) {
            if (!aVar.f14e.get()) {
                aVar.a(null);
            }
        } catch (ExecutionException e11) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
