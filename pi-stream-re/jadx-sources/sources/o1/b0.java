package o1;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import k1.h0;
import k1.i0;

/* loaded from: classes.dex */
public abstract class b0 {
    public static boolean a(MediaDrm mediaDrm, String str) {
        boolean requiresSecureDecoder;
        requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
        return requiresSecureDecoder;
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, i0 i0Var) {
        LogSessionId logSessionId;
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        h0 h0Var = i0Var.f6385a;
        h0Var.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = h0Var.f6384a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            k1.e0.e(playbackComponent).setLogSessionId(logSessionId2);
        }
    }
}
