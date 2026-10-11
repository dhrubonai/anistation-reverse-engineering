package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bk6 extends f30 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.f30
    public final vv a(vv vvVar) {
        if (eq6.N(vvVar.c)) {
            this.k = true;
            if (this.i == 0 && this.j == 0) {
                return vv.e;
            }
            return vvVar;
        }
        throw new yv(vvVar);
    }

    @Override // defpackage.f30
    public final void b() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.f30
    public final void c() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.f30, defpackage.zv
    public final boolean d() {
        if (super.d() && this.n == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.f30, defpackage.zv
    public final ByteBuffer e() {
        int i;
        if (super.d() && (i = this.n) > 0) {
            l(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.e();
    }

    @Override // defpackage.zv
    public final void g(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.l);
            this.o += min / this.b.d;
            this.l -= min;
            byteBuffer.position(position + min);
            if (this.l > 0) {
                return;
            }
            int i2 = i - min;
            int length = (this.n + i2) - this.m.length;
            ByteBuffer l = l(length);
            int j = eq6.j(length, 0, this.n);
            l.put(this.m, 0, j);
            int j2 = eq6.j(length - j, 0, i2);
            byteBuffer.limit(byteBuffer.position() + j2);
            l.put(byteBuffer);
            byteBuffer.limit(limit);
            int i3 = i2 - j2;
            int i4 = this.n - j;
            this.n = i4;
            byte[] bArr = this.m;
            System.arraycopy(bArr, j, bArr, 0, i4);
            byteBuffer.get(this.m, this.n, i3);
            this.n += i3;
            l.flip();
        }
    }

    @Override // defpackage.zv
    public final long j(long j) {
        return Math.max(0L, j - eq6.c0(this.b.a, this.j + this.i));
    }

    @Override // defpackage.f30
    public final void k() {
        this.m = eq6.b;
    }
}
