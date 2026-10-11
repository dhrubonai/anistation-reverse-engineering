package androidx.media;

import android.media.AudioAttributes;
import defpackage.bs6;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media.AudioAttributesImplApi26, androidx.media.AudioAttributesImplApi21] */
    public static AudioAttributesImplApi26 read(bs6 bs6Var) {
        ?? audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) bs6Var.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = bs6Var.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, bs6 bs6Var) {
        bs6Var.getClass();
        bs6Var.k(audioAttributesImplApi26.a, 1);
        bs6Var.j(audioAttributesImplApi26.b, 2);
    }
}
