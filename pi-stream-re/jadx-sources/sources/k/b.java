package k;

import android.os.Looper;

/* loaded from: classes.dex */
public final class b extends z7.c {

    /* renamed from: m, reason: collision with root package name */
    public static volatile b f6282m;

    /* renamed from: l, reason: collision with root package name */
    public final e f6283l = new e();

    public static b y() {
        if (f6282m != null) {
            return f6282m;
        }
        synchronized (b.class) {
            if (f6282m == null) {
                f6282m = new b();
            }
        }
        return f6282m;
    }

    public final void z(Runnable runnable) {
        e eVar = this.f6283l;
        if (eVar.f6287n == null) {
            synchronized (eVar.f6285l) {
                if (eVar.f6287n == null) {
                    eVar.f6287n = e.y(Looper.getMainLooper());
                }
            }
        }
        eVar.f6287n.post(runnable);
    }
}
