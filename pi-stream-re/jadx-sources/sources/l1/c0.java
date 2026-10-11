package l1;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes.dex */
public abstract class c0 {
    public static k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z9) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return k.f6678d;
        }
        j jVar = new j();
        jVar.f6675a = true;
        jVar.f6677c = z9;
        return jVar.a();
    }
}
