package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dt6 extends at6 implements Choreographer$VsyncCallback {
    public final Handler B;

    public dt6(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.B = eq6.p(null);
    }

    @Override // defpackage.at6
    public final void a() {
        this.y.registerDisplayListener(this, eq6.p(null));
        Choreographer choreographer = this.x;
        choreographer.removeVsyncCallback(this);
        choreographer.postVsyncCallback(this);
    }

    @Override // defpackage.at6
    public final void b() {
        this.y.unregisterDisplayListener(this);
        this.B.removeCallbacksAndMessages(null);
        this.x.removeVsyncCallback(this);
        this.z = -9223372036854775807L;
        this.A = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.B.removeCallbacksAndMessages(null);
            Choreographer choreographer = this.x;
            choreographer.removeVsyncCallback(this);
            choreographer.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        long frameTimeNanos;
        Choreographer.FrameTimeline[] frameTimelines;
        long expectedPresentationTimeNanos;
        long expectedPresentationTimeNanos2;
        frameTimeNanos = frameData.getFrameTimeNanos();
        this.z = frameTimeNanos;
        frameTimelines = frameData.getFrameTimelines();
        byte b = 0;
        long j = -9223372036854775807L;
        if (frameTimelines.length >= 2) {
            expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos();
            expectedPresentationTimeNanos2 = frameTimelines[0].getExpectedPresentationTimeNanos();
            long j2 = expectedPresentationTimeNanos - expectedPresentationTimeNanos2;
            if (j2 != 0) {
                j = j2;
            }
            this.A = j;
        } else {
            this.A = -9223372036854775807L;
        }
        this.B.removeCallbacksAndMessages(null);
        this.B.postDelayed(new ct6(this, b), 500L);
    }
}
