package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class q45 implements Closeable {
    public final int A;
    public final CharSequence B;
    public final sq2 x;
    public final mk0 y;
    public final CharSequence z;

    public q45(CharSequence charSequence, int i, CharSequence charSequence2, sq2 sq2Var, mk0 mk0Var) {
        charSequence.getClass();
        charSequence2.getClass();
        mk0Var.getClass();
        this.x = sq2Var;
        this.y = mk0Var;
        this.z = charSequence;
        this.A = i;
        this.B = charSequence2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.y.e();
        this.x.e();
    }
}
