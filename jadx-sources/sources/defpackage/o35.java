package defpackage;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class o35 {
    public static final n35 c(dx3 dx3Var, String str) {
        str.getClass();
        Charset charset = kl0.a;
        if (dx3Var != null) {
            Pattern pattern = dx3.c;
            Charset a = dx3Var.a(null);
            if (a == null) {
                try {
                    dx3Var = n77.I(dx3Var + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    dx3Var = null;
                }
            } else {
                charset = a;
            }
        }
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        dq6.c(bytes.length, 0L, length);
        return new n35(dx3Var, length, bytes);
    }

    public abstract long a();

    public dx3 b() {
        return null;
    }

    public abstract void d(wy4 wy4Var);
}
