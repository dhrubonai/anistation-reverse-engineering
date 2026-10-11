package androidx.media;

import android.media.AudioAttributes;
import s3.a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f1172a = (AudioAttributes) aVar.g(audioAttributesImplApi26.f1172a, 1);
        audioAttributesImplApi26.f1173b = aVar.f(audioAttributesImplApi26.f1173b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi26.f1172a, 1);
        aVar.j(audioAttributesImplApi26.f1173b, 2);
    }
}
