package l1;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public Exception f6735a;

    /* renamed from: b, reason: collision with root package name */
    public long f6736b;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f6735a == null) {
            this.f6735a = exc;
            this.f6736b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f6736b) {
            Exception exc2 = this.f6735a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f6735a;
            this.f6735a = null;
            throw exc3;
        }
    }
}
