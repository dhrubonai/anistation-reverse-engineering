package j1;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;

/* loaded from: classes.dex */
public abstract class y {
    public static k1.i0 a(Context context, d0 d0Var, boolean z9) {
        PlaybackSession createPlaybackSession;
        k1.f0 f0Var;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager f10 = k1.e0.f(context.getSystemService("media_metrics"));
        if (f10 != null) {
            createPlaybackSession = f10.createPlaybackSession();
            f0Var = new k1.f0(context, createPlaybackSession);
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            f1.o.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new k1.i0(logSessionId);
        }
        if (z9) {
            d0Var.getClass();
            k1.a0 a0Var = (k1.a0) d0Var.f5687q;
            a0Var.getClass();
            a0Var.f6318f.a(f0Var);
        }
        sessionId = f0Var.f6356c.getSessionId();
        return new k1.i0(sessionId);
    }
}
