package l1;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class j0 {
    public static void a(AudioTrack audioTrack, i iVar) {
        AudioDeviceInfo audioDeviceInfo;
        if (iVar == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = iVar.f6671a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
