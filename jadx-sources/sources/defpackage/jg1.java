package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class jg1 implements Closeable {
    public final qq5 x;

    public /* synthetic */ jg1(oa0 oa0Var) {
        this.x = oa0Var;
    }

    public static final byte[] a(oa0 oa0Var, String str) {
        byte[] bArr;
        str.getClass();
        synchronized (oa0Var) {
            zg zgVar = new zg(str, (byte) 8);
            qz4 l = oa0Var.l();
            try {
                Object invoke = zgVar.invoke(l);
                o80.r(l, null);
                bArr = (byte[]) invoke;
            } finally {
            }
        }
        bArr.getClass();
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.x.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jg1) {
            if (!a34.i(this.x, ((jg1) obj).x)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return "Digest(state=" + this.x + ')';
    }
}
