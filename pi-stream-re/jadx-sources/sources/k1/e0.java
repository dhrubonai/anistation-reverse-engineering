package k1;

import android.media.AudioProfile;
import android.media.MediaDrm;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackStateEvent;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e0 {
    public static /* bridge */ /* synthetic */ AudioProfile c(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent e(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager f(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ PlaybackStateEvent.Builder k() {
        return new PlaybackStateEvent.Builder();
    }
}
