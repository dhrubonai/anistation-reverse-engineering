package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gl6 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final zp2 b;
    public volatile int c = 0;

    public gl6(zp2 zp2Var, int i) {
        this.b = zp2Var;
        this.a = i;
    }

    public final int a(int i) {
        iy3 b = b();
        int a = b.a(16);
        if (a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b.A;
            int i2 = a + b.x;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [zm3, java.lang.Object] */
    public final iy3 b() {
        ThreadLocal threadLocal = d;
        iy3 iy3Var = (iy3) threadLocal.get();
        iy3 iy3Var2 = iy3Var;
        if (iy3Var == null) {
            ?? zm3Var = new zm3();
            threadLocal.set(zm3Var);
            iy3Var2 = zm3Var;
        }
        jy3 jy3Var = (jy3) this.b.x;
        int a = jy3Var.a(6);
        if (a != 0) {
            int i = a + jy3Var.x;
            int i2 = (this.a * 4) + ((ByteBuffer) jy3Var.A).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) jy3Var.A).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) jy3Var.A;
            iy3Var2.A = byteBuffer;
            if (byteBuffer != null) {
                iy3Var2.x = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                iy3Var2.y = i4;
                iy3Var2.z = ((ByteBuffer) iy3Var2.A).getShort(i4);
                return iy3Var2;
            }
            iy3Var2.x = 0;
            iy3Var2.y = 0;
            iy3Var2.z = 0;
        }
        return iy3Var2;
    }

    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        iy3 b = b();
        int a = b.a(4);
        if (a != 0) {
            i = ((ByteBuffer) b.A).getInt(a + b.x);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        iy3 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i3 = a2 + b2.x;
            i2 = ((ByteBuffer) b2.A).getInt(((ByteBuffer) b2.A).getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
