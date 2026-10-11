package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class am0 {
    public static final ByteBuffer a;

    static {
        ByteBuffer allocate = ByteBuffer.allocate(0);
        allocate.getClass();
        a = allocate;
    }

    public static final void a(byte[] bArr, int i, long j) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2 + i] = (byte) (j >>> ((7 - i2) * 8));
        }
    }

    public static final void b(byte[] bArr, short s) {
        for (int i = 0; i < 2; i++) {
            bArr[i + 11] = (byte) (s >>> ((1 - i) * 8));
        }
    }
}
