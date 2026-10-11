package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class at6 implements DisplayManager.DisplayListener {
    public final Choreographer x;
    public final DisplayManager y;
    public volatile long z = -9223372036854775807L;
    public volatile long A = -9223372036854775807L;

    public at6(Choreographer choreographer, DisplayManager displayManager) {
        this.x = choreographer;
        this.y = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
