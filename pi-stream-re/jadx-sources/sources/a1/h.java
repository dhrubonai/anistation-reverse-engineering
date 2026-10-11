package a1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class h extends Handler {
    public h() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        CountDownLatch countDownLatch;
        g gVar = (g) message.obj;
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 == 2) {
                gVar.f30a.getClass();
                return;
            }
            return;
        }
        a aVar = gVar.f30a;
        Object obj = gVar.f31b[0];
        if (aVar.f13d.get()) {
            countDownLatch = aVar.f15f;
            try {
                b bVar = aVar.f16x;
                if (bVar.f25i == aVar) {
                    SystemClock.uptimeMillis();
                    bVar.f25i = null;
                    bVar.b();
                }
                countDownLatch.countDown();
            } finally {
                countDownLatch.countDown();
            }
        } else {
            try {
                b bVar2 = aVar.f16x;
                if (bVar2.f24h != aVar) {
                    if (bVar2.f25i == aVar) {
                        SystemClock.uptimeMillis();
                        bVar2.f25i = null;
                        bVar2.b();
                    }
                } else if (!bVar2.f20d) {
                    SystemClock.uptimeMillis();
                    bVar2.f24h = null;
                    c cVar = bVar2.f18b;
                    if (cVar != null) {
                        z0.b bVar3 = (z0.b) cVar;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            bVar3.j(obj);
                        } else {
                            bVar3.h(obj);
                        }
                    }
                }
            } finally {
                countDownLatch = aVar.f15f;
            }
        }
        aVar.f12c = 3;
    }
}
