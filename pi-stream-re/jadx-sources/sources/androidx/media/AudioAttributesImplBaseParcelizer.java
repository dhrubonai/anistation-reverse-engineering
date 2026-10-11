package androidx.media;

import s3.a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1174a = aVar.f(audioAttributesImplBase.f1174a, 1);
        audioAttributesImplBase.f1175b = aVar.f(audioAttributesImplBase.f1175b, 2);
        audioAttributesImplBase.f1176c = aVar.f(audioAttributesImplBase.f1176c, 3);
        audioAttributesImplBase.f1177d = aVar.f(audioAttributesImplBase.f1177d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f1174a, 1);
        aVar.j(audioAttributesImplBase.f1175b, 2);
        aVar.j(audioAttributesImplBase.f1176c, 3);
        aVar.j(audioAttributesImplBase.f1177d, 4);
    }
}
