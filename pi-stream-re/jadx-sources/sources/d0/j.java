package d0;

import android.os.Process;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f3033a;

    public j(Runnable runnable, String str, int i10) {
        super(runnable, str);
        this.f3033a = i10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f3033a);
        super.run();
    }
}
