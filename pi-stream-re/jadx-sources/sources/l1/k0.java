package l1;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class k0 {
    public static void a(AudioTrack audioTrack, k1.i0 i0Var) {
        LogSessionId logSessionId;
        boolean equals;
        k1.h0 h0Var = i0Var.f6385a;
        h0Var.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = h0Var.f6384a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(logSessionId2);
        }
    }
}
