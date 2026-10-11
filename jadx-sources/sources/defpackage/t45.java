package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class t45 implements Closeable {
    public final InputStream a() {
        return o0().t0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dq6.d(o0());
    }

    public final byte[] l() {
        long p = p();
        if (p <= 2147483647L) {
            db0 o0 = o0();
            try {
                byte[] z = o0.z();
                o0.close();
                int length = z.length;
                if (p != -1 && p != length) {
                    throw new IOException("Content-Length (" + p + ") and stream length (" + length + ") disagree");
                }
                return z;
            } finally {
            }
        } else {
            qi2.k(h11.h(p, "Cannot buffer entire body for content length: "));
            return null;
        }
    }

    public abstract db0 o0();

    public abstract long p();

    public dx3 q() {
        return null;
    }

    public final String t() {
        Charset charset;
        db0 o0 = o0();
        try {
            dx3 q = q();
            if (q == null || (charset = q.a(kl0.a)) == null) {
                charset = kl0.a;
            }
            String Z = o0.Z(dq6.r(o0, charset));
            o0.close();
            return Z;
        } finally {
        }
    }
}
