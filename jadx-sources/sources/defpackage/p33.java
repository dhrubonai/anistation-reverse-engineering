package defpackage;

import com.google.protobuf.Internal;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p33 extends InputStream {
    public int A;
    public int B;
    public boolean C;
    public byte[] D;
    public int E;
    public long F;
    public final Iterator x;
    public ByteBuffer y;
    public final int z = 0;

    public p33(Iterable iterable) {
        this.x = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.z++;
        }
        this.A = -1;
        if (!a()) {
            this.y = Internal.EMPTY_BYTE_BUFFER;
            this.A = 0;
            this.B = 0;
            this.F = 0L;
        }
    }

    public final boolean a() {
        this.A++;
        Iterator it = this.x;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.y = byteBuffer;
        this.B = byteBuffer.position();
        if (this.y.hasArray()) {
            this.C = true;
            this.D = this.y.array();
            this.E = this.y.arrayOffset();
        } else {
            this.C = false;
            this.F = ro6.a(this.y);
            this.D = null;
        }
        return true;
    }

    public final void l(int i) {
        int i2 = this.B + i;
        this.B = i2;
        if (i2 == this.y.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.A == this.z) {
            return -1;
        }
        int limit = this.y.limit();
        int i3 = this.B;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.C) {
            System.arraycopy(this.D, i3 + this.E, bArr, i, i2);
            l(i2);
            return i2;
        }
        int position = this.y.position();
        this.y.position(this.B);
        this.y.get(bArr, i, i2);
        this.y.position(position);
        l(i2);
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.A == this.z) {
            return -1;
        }
        if (this.C) {
            int i = this.D[this.B + this.E] & 255;
            l(1);
            return i;
        }
        int d = ro6.c.d(this.B + this.F) & 255;
        l(1);
        return d;
    }
}
