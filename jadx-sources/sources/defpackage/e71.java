package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e71 {
    public long a;
    public final vv b;
    public final ak0 c;
    public final /* synthetic */ f71 d;

    public e71(f71 f71Var, vv vvVar, ak0 ak0Var, long j) {
        this.d = f71Var;
        this.b = vvVar;
        this.a = j;
        this.c = ak0Var;
    }

    public final void a(long j, ByteBuffer byteBuffer) {
        boolean z;
        if (j >= this.a) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        int i = (int) (j - this.a);
        byteBuffer.position((i * this.b.d) + byteBuffer.position());
        this.a = j;
    }
}
