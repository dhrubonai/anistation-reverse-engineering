package k3;

import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class h {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: k3.g
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j4) {
                runnable.run();
            }
        });
    }
}
