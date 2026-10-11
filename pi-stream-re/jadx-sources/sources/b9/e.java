package b9;

import java.util.logging.Level;
import r6.h0;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1561a;

    public e(f fVar) {
        this.f1561a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a c6;
        long j4;
        while (true) {
            f fVar = this.f1561a;
            synchronized (fVar) {
                c6 = fVar.c();
            }
            if (c6 == null) {
                return;
            }
            c cVar = c6.f1550c;
            h0.q(cVar);
            f fVar2 = this.f1561a;
            boolean isLoggable = f.f1562h.m().isLoggable(Level.FINE);
            if (isLoggable) {
                cVar.f1554a.f1565a.getClass();
                j4 = System.nanoTime();
                h0.b(c6, cVar, "starting");
            } else {
                j4 = -1;
            }
            try {
                f.a(fVar2, c6);
                if (isLoggable) {
                    cVar.f1554a.f1565a.getClass();
                    h0.b(c6, cVar, "finished run in ".concat(h0.T(System.nanoTime() - j4)));
                }
            } finally {
            }
        }
    }
}
