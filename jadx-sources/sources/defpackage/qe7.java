package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class qe7 {
    protected transient int zza;

    public final byte[] a() {
        try {
            mf7 mf7Var = (mf7) this;
            int k = mf7Var.k();
            byte[] bArr = new byte[k];
            boolean z = ef7.b;
            af7 af7Var = new af7(k, bArr);
            mf7Var.d(af7Var);
            if (af7Var.x() <= 0) {
                if (af7Var.x() >= 0) {
                    return bArr;
                }
                throw new IllegalStateException("Wrote more data than expected.");
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            ov3.k(qx1.q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public abstract int b(xg7 xg7Var);
}
