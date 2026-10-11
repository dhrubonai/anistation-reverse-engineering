package l1;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes.dex */
public abstract class d0 {
    public static k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z9) {
        int playbackOffloadSupport;
        boolean z10;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return k.f6678d;
        }
        j jVar = new j();
        if (f1.b0.f3799a > 32 && playbackOffloadSupport == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        jVar.f6675a = true;
        jVar.f6676b = z10;
        jVar.f6677c = z9;
        return jVar.a();
    }
}
