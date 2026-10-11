package defpackage;

import com.google.protobuf.CodedOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qo5 implements zv {
    public long b;
    public long c;
    public vv d;
    public vv e;
    public ByteBuffer f;
    public ByteBuffer g;
    public ByteBuffer h;
    public long i;
    public long j;
    public boolean k;

    @Override // defpackage.zv
    public final boolean d() {
        if (this.k && this.i >= this.j && !this.h.hasRemaining()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zv
    public final ByteBuffer e() {
        boolean z;
        if (this.k && !this.h.hasRemaining()) {
            long j = this.i;
            long j2 = this.j;
            if (j < j2) {
                long j3 = (j2 - j) * this.d.d;
                if (j3 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                io3.B(z);
                if (this.g.capacity() == 0) {
                    this.g = ByteBuffer.allocateDirect(this.d.d * CodedOutputStream.DEFAULT_BUFFER_SIZE).order(ByteOrder.nativeOrder());
                }
                this.g.clear();
                if (j3 < this.g.capacity()) {
                    this.g.limit((int) j3);
                }
                this.i += this.g.remaining() / this.d.d;
                return this.g;
            }
        }
        ByteBuffer byteBuffer = this.h;
        this.h = zv.a;
        return byteBuffer;
    }

    @Override // defpackage.zv
    public final void f(xv xvVar) {
        vv vvVar = this.e;
        this.d = vvVar;
        long j = this.c;
        this.b = j;
        this.j = eq6.r(vvVar.a, j);
        this.i = 0L;
        ByteBuffer byteBuffer = zv.a;
        this.g = byteBuffer;
        this.f = byteBuffer;
        this.h = byteBuffer;
        boolean z = false;
        this.k = false;
        if (!isActive() || xvVar.a == 0) {
            z = true;
        }
        io3.B(z);
    }

    @Override // defpackage.zv
    public final void g(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        this.i += byteBuffer.remaining() / this.d.d;
        int remaining = byteBuffer.remaining();
        if (this.f.capacity() < remaining) {
            this.f = ByteBuffer.allocateDirect(remaining).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        this.f.put(byteBuffer).flip();
        this.h = this.f;
    }

    @Override // defpackage.zv
    public final vv h(vv vvVar) {
        if (eq6.N(vvVar.c)) {
            this.e = vvVar;
            return vvVar;
        }
        throw new yv(vvVar);
    }

    @Override // defpackage.zv
    public final void i() {
        this.k = true;
    }

    @Override // defpackage.zv
    public final boolean isActive() {
        if (!this.d.equals(vv.e) && this.b != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zv
    public final void reset() {
        vv vvVar = vv.e;
        this.e = vvVar;
        this.d = vvVar;
        this.j = 0L;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
        this.i = 0L;
        ByteBuffer byteBuffer = zv.a;
        this.g = byteBuffer;
        this.f = byteBuffer;
        this.k = false;
    }
}
