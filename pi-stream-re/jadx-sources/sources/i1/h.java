package i1;

import c1.l0;
import c1.v;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class h extends a {

    /* renamed from: c, reason: collision with root package name */
    public v f5260c;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f5262e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5263f;

    /* renamed from: x, reason: collision with root package name */
    public long f5264x;

    /* renamed from: y, reason: collision with root package name */
    public ByteBuffer f5265y;

    /* renamed from: z, reason: collision with root package name */
    public final int f5266z;

    /* renamed from: d, reason: collision with root package name */
    public final d f5261d = new d();
    public final int A = 0;

    static {
        l0.a("media3.decoder");
    }

    public h(int i10) {
        this.f5266z = i10;
    }

    public void h() {
        this.f5247b = 0;
        ByteBuffer byteBuffer = this.f5262e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f5265y;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f5263f = false;
    }

    public final ByteBuffer i(int i10) {
        int capacity;
        int i11 = this.f5266z;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f5262e;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new g(capacity, i10);
    }

    public final void j(int i10) {
        int i11 = i10 + this.A;
        ByteBuffer byteBuffer = this.f5262e;
        if (byteBuffer == null) {
            this.f5262e = i(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f5262e = byteBuffer;
            return;
        }
        ByteBuffer i13 = i(i12);
        i13.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            i13.put(byteBuffer);
        }
        this.f5262e = i13;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.f5262e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f5265y;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
