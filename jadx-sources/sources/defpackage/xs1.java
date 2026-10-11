package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class xs1 {
    public byte a = 1;
    public final my3 b;
    public my3 c;
    public my3 d;
    public int e;
    public int f;

    public xs1(my3 my3Var) {
        this.b = my3Var;
        this.c = my3Var;
    }

    public final void a() {
        this.a = (byte) 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        iy3 b = this.c.b.b();
        int a = b.a(6);
        if ((a != 0 && ((ByteBuffer) b.A).get(a + b.x) != 0) || this.e == 65039) {
            return true;
        }
        return false;
    }
}
