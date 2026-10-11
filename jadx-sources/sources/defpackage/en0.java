package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class en0 implements Closeable {
    public sb2 A;
    public final ou x;
    public final Object y;
    public final ub2 z;

    public en0(ou ouVar, Object obj, ub2 ub2Var) {
        ouVar.getClass();
        obj.getClass();
        this.x = ouVar;
        this.y = obj;
        this.z = ub2Var;
        this.A = new gr((byte) 11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.invoke();
    }
}
