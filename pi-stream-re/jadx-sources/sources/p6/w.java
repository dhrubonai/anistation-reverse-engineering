package p6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f8628a;

    public w() {
        this.f8628a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f8628a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f8628a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public w(TaskCompletionSource taskCompletionSource) {
        this.f8628a = taskCompletionSource;
    }
}
