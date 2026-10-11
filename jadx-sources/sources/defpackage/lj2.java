package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lj2 implements Executor {
    public final /* synthetic */ byte x;
    public final Object y;

    public lj2() {
        this.x = (byte) 4;
        Handler handler = new Handler(Looper.getMainLooper());
        Looper.getMainLooper();
        this.y = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                ((h15) obj).post(runnable);
                return;
            case 1:
                ((Executor) obj).execute(new x85(runnable, (byte) 0));
                return;
            case 2:
                ((o77) obj).d.post(runnable);
                return;
            case 3:
                au7 au7Var = ((gu7) ((qx7) obj).x).D;
                gu7.l(au7Var);
                au7Var.U(runnable);
                return;
            default:
                ((h15) obj).post(runnable);
                return;
        }
    }

    public /* synthetic */ lj2(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    public lj2(Looper looper) {
        this.x = (byte) 0;
        this.y = new h15(looper, (byte) 5);
    }
}
