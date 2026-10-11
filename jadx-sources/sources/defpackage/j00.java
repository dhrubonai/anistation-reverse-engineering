package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class j00 {
    public static final x53 a = zz.d(new ui((byte) 13));

    public static String a(v00 v00Var) {
        x53 x53Var = a;
        x53Var.getClass();
        byte[] bytes = x53Var.b(v00.Companion.serializer(), v00Var).getBytes(kl0.a);
        bytes.getClass();
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);
        digest.getClass();
        return ms.O0(digest, "", new ui((byte) 14), 30);
    }
}
