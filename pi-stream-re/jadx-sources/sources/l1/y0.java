package l1;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class y0 {
    public static void a(x xVar, Object obj) {
        i iVar;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        w0 w0Var = (w0) xVar;
        if (audioDeviceInfo == null) {
            iVar = null;
        } else {
            w0Var.getClass();
            iVar = new i(audioDeviceInfo);
        }
        w0Var.f6758c0 = iVar;
        h hVar = w0Var.f6789z;
        if (hVar != null) {
            hVar.b(audioDeviceInfo);
        }
        AudioTrack audioTrack = w0Var.f6787x;
        if (audioTrack != null) {
            j0.a(audioTrack, w0Var.f6758c0);
        }
    }
}
