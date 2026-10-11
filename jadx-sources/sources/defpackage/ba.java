package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ba implements Executor {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ba(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                ((oa) obj).postOnAnimation(runnable);
                return;
            case 1:
                eq6.a0(((bu3) obj).l, runnable);
                return;
            case 2:
                ((wu3) obj).U(runnable);
                return;
            case 3:
                ((gw3) obj).Q(runnable);
                return;
            default:
                k46 k46Var = ((fi0) obj).d;
                if (k46Var.a.getLooper() == Looper.myLooper()) {
                    runnable.run();
                    return;
                } else {
                    k46Var.f(runnable);
                    return;
                }
        }
    }
}
