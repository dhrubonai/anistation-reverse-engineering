package q0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class v implements e4.k, com.bumptech.glide.load.data.g {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f8963a;

    @Override // com.bumptech.glide.load.data.g
    public final Object a() {
        ByteBuffer byteBuffer = this.f8963a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // e4.k
    public final long b(long j4) {
        ByteBuffer byteBuffer = this.f8963a;
        int min = (int) Math.min(byteBuffer.remaining(), j4);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    @Override // com.bumptech.glide.load.data.g
    public final void c() {
    }

    @Override // e4.k
    public final int d(byte[] bArr, int i10) {
        ByteBuffer byteBuffer = this.f8963a;
        int min = Math.min(i10, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // e4.k
    public final short e() {
        ByteBuffer byteBuffer = this.f8963a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new e4.j();
    }

    @Override // e4.k
    public final int f() {
        return (e() << 8) | e();
    }

    public final short g(int i10) {
        boolean z9;
        ByteBuffer byteBuffer = this.f8963a;
        if (byteBuffer.remaining() - i10 >= 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return byteBuffer.getShort(i10);
        }
        return (short) -1;
    }

    public final long h() {
        return this.f8963a.getInt() & 4294967295L;
    }

    public final void i(int i10) {
        ByteBuffer byteBuffer = this.f8963a;
        byteBuffer.position(byteBuffer.position() + i10);
    }

    public v(int i10, ByteBuffer byteBuffer) {
        if (i10 != 2) {
            this.f8963a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        } else {
            this.f8963a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    public v(byte[] bArr, int i10) {
        this.f8963a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
    }
}
