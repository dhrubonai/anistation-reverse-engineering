package f1;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f3865b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3866a;

    public x(Handler handler) {
        this.f3866a = handler;
    }

    public static w b() {
        w wVar;
        ArrayList arrayList = f3865b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                wVar = new w();
            } else {
                wVar = (w) arrayList.remove(arrayList.size() - 1);
            }
        }
        return wVar;
    }

    public final w a(int i10, Object obj) {
        w b10 = b();
        b10.f3864a = this.f3866a.obtainMessage(i10, obj);
        return b10;
    }

    public final boolean c(Runnable runnable) {
        return this.f3866a.post(runnable);
    }

    public final boolean d(int i10) {
        return this.f3866a.sendEmptyMessage(i10);
    }

    public final boolean e(w wVar) {
        Message message = wVar.f3864a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = this.f3866a.sendMessageAtFrontOfQueue(message);
        wVar.f3864a = null;
        ArrayList arrayList = f3865b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(wVar);
            }
        }
        return sendMessageAtFrontOfQueue;
    }
}
