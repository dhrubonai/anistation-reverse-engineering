package o1;

import android.media.MediaDrm;

/* loaded from: classes.dex */
public abstract class s {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return f1.b0.u(f1.b0.v(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
