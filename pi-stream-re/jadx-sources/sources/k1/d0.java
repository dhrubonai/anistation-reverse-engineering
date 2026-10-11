package k1;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackMetrics;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d0 {
    public static /* synthetic */ NetworkEvent.Builder b() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackMetrics.Builder f() {
        return new PlaybackMetrics.Builder();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder h(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }
}
