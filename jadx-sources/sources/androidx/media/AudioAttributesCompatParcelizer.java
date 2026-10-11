package androidx.media;

import defpackage.bs6;
import defpackage.ds6;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    public static AudioAttributesCompat read(bs6 bs6Var) {
        ?? obj = new Object();
        ds6 ds6Var = obj.a;
        if (bs6Var.e(1)) {
            ds6Var = bs6Var.h();
        }
        obj.a = (AudioAttributesImpl) ds6Var;
        return obj;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, bs6 bs6Var) {
        bs6Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        bs6Var.i(1);
        bs6Var.l(audioAttributesImpl);
    }
}
