package i1;

import android.os.Process;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5268a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f5269b = kVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f5268a) {
            case 0:
                k kVar = (k) this.f5269b;
                kVar.getClass();
                do {
                    try {
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                } while (kVar.j());
                return;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x3.a aVar, Runnable runnable) {
        super(runnable);
        this.f5269b = aVar;
    }
}
