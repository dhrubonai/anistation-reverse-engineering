package r0;

import j6.e;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f9298a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f9299b;

    /* renamed from: c, reason: collision with root package name */
    public int f9300c;

    /* renamed from: d, reason: collision with root package name */
    public int f9301d;

    public c() {
        if (e.f6173a == null) {
            e.f6173a = new e();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f9301d) {
            return this.f9299b.getShort(this.f9300c + i10);
        }
        return 0;
    }

    public final void b(int i10, ByteBuffer byteBuffer) {
        this.f9299b = byteBuffer;
        if (byteBuffer != null) {
            this.f9298a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f9300c = i11;
            this.f9301d = this.f9299b.getShort(i11);
            return;
        }
        this.f9298a = 0;
        this.f9300c = 0;
        this.f9301d = 0;
    }
}
