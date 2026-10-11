package androidx.media;

import s3.a;
import s3.c;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVar = audioAttributesCompat.f1171a;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        audioAttributesCompat.f1171a = (AudioAttributesImpl) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f1171a;
        aVar.i(1);
        aVar.l(audioAttributesImpl);
    }
}
