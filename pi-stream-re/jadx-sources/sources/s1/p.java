package s1;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import k1.h0;
import k1.i0;

/* loaded from: classes.dex */
public abstract class p {
    public static void a(i iVar, i0 i0Var) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        h0 h0Var = i0Var.f6385a;
        h0Var.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = h0Var.f6384a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = iVar.f9796b;
            stringId = logSessionId2.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
