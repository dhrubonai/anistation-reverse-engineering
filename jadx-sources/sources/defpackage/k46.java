package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k46 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public k46(Handler handler) {
        this.a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j46 e() {
        j46 j46Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    j46Var = new Object();
                } else {
                    j46Var = (j46) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j46Var;
    }

    public final j46 a(int i) {
        j46 e = e();
        e.a = this.a.obtainMessage(i);
        return e;
    }

    public final j46 b(int i, int i2, int i3) {
        j46 e = e();
        e.a = this.a.obtainMessage(i, i2, i3);
        return e;
    }

    public final j46 c(int i, Object obj) {
        j46 e = e();
        e.a = this.a.obtainMessage(i, obj);
        return e;
    }

    public final j46 d(Object obj, int i, int i2, int i3) {
        j46 e = e();
        e.a = this.a.obtainMessage(i, i2, i3, obj);
        return e;
    }

    public final void f(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void g(Runnable runnable, long j) {
        this.a.postDelayed(runnable, j);
    }

    public final void h() {
        this.a.removeCallbacksAndMessages(null);
    }

    public final void i(int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        this.a.removeMessages(i);
    }

    public final void j(int i) {
        this.a.sendEmptyMessage(i);
    }

    public final void k(int i, int i2) {
        this.a.sendEmptyMessageDelayed(i, i2);
    }
}
