package l1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f6612d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f6613e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f6614a = d1.d.f3045a;

    /* renamed from: c, reason: collision with root package name */
    public int f6616c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f6615b = 2;

    public static void a(ByteBuffer byteBuffer, long j4, int i10, int i11, boolean z9) {
        byte b10;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        boolean z10 = false;
        byteBuffer.put((byte) 0);
        if (z9) {
            b10 = 2;
        } else {
            b10 = 0;
        }
        byteBuffer.put(b10);
        byteBuffer.putLong(j4);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        long j10 = i11;
        if ((j10 >> 8) == 0) {
            z10 = true;
        }
        r6.h0.l(z10, "out of range: %s", j10);
        byteBuffer.put((byte) j10);
    }
}
