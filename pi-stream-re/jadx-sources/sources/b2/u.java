package b2;

import android.view.Surface;

/* loaded from: classes.dex */
public abstract class u {
    public static void a(Surface surface, float f10) {
        int i10;
        if (f10 == 0.0f) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        try {
            surface.setFrameRate(f10, i10);
        } catch (IllegalStateException e10) {
            f1.o.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
