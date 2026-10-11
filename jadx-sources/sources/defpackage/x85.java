package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x85 implements Runnable {
    public final /* synthetic */ byte x;
    public final Runnable y;

    public /* synthetic */ x85(Runnable runnable, byte b) {
        this.x = b;
        this.y = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Runnable runnable = this.y;
        switch (b) {
            case 0:
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    Log.e("TransportRuntime.Executor", "Background execution failure.", e);
                    return;
                }
            default:
                runnable.run();
                return;
        }
    }

    public String toString() {
        switch (this.x) {
            case 1:
                return this.y.toString();
            default:
                return super.toString();
        }
    }
}
