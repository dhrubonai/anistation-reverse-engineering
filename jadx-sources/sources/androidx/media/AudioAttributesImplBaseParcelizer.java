package androidx.media;

import defpackage.bs6;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media.AudioAttributesImplBase, java.lang.Object] */
    public static AudioAttributesImplBase read(bs6 bs6Var) {
        ?? obj = new Object();
        obj.a = 0;
        obj.b = 0;
        obj.c = 0;
        obj.d = -1;
        obj.a = bs6Var.f(0, 1);
        obj.b = bs6Var.f(obj.b, 2);
        obj.c = bs6Var.f(obj.c, 3);
        obj.d = bs6Var.f(obj.d, 4);
        return obj;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, bs6 bs6Var) {
        bs6Var.getClass();
        bs6Var.j(audioAttributesImplBase.a, 1);
        bs6Var.j(audioAttributesImplBase.b, 2);
        bs6Var.j(audioAttributesImplBase.c, 3);
        bs6Var.j(audioAttributesImplBase.d, 4);
    }
}
