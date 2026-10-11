package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bt6 extends at6 implements Choreographer.FrameCallback {
    @Override // defpackage.at6
    public final void a() {
        long j;
        this.y.registerDisplayListener(this, eq6.p(null));
        this.x.removeFrameCallback(this);
        this.x.postFrameCallback(this);
        if (this.y.getDisplay(0) != null) {
            j = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            kb0.O("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
        }
        this.A = j;
    }

    @Override // defpackage.at6
    public final void b() {
        this.y.unregisterDisplayListener(this);
        this.x.removeFrameCallback(this);
        this.z = -9223372036854775807L;
        this.A = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.z = j;
        this.x.removeFrameCallback(this);
        this.x.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long j;
        if (i == 0) {
            this.x.removeFrameCallback(this);
            this.x.postFrameCallback(this);
            if (this.y.getDisplay(0) != null) {
                j = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                kb0.O("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j = -9223372036854775807L;
            }
            this.A = j;
        }
    }
}
