package defpackage;

import java.nio.charset.Charset;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class u83 {
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;

    static {
        Charset charset = kl0.a;
        byte[] bytes = "master secret".getBytes(charset);
        bytes.getClass();
        a = bytes;
        byte[] bytes2 = "key expansion".getBytes(charset);
        bytes2.getClass();
        b = bytes2;
        byte[] bytes3 = "client finished".getBytes(charset);
        bytes3.getClass();
        c = bytes3;
        byte[] bytes4 = "server finished".getBytes(charset);
        bytes4.getClass();
        d = bytes4;
    }

    public static final SecretKeySpec a(cm0 cm0Var, byte[] bArr) {
        int i = cm0Var.p * 2;
        int i2 = cm0Var.o;
        return new SecretKeySpec(bArr, i + i2, i2, uz5.q0(cm0Var.e, "/"));
    }
}
