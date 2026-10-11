package l1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class d1 extends d1.e {

    /* renamed from: i, reason: collision with root package name */
    public int f6638i;

    /* renamed from: j, reason: collision with root package name */
    public int f6639j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6640k;

    /* renamed from: l, reason: collision with root package name */
    public int f6641l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f6642m = f1.b0.f3804f;

    /* renamed from: n, reason: collision with root package name */
    public int f6643n;
    public long o;

    @Override // d1.e, d1.d
    public final boolean b() {
        if (super.b() && this.f6643n == 0) {
            return true;
        }
        return false;
    }

    @Override // d1.e
    public final d1.b c(d1.b bVar) {
        if (bVar.f3043c == 2) {
            this.f6640k = true;
            if (this.f6638i == 0 && this.f6639j == 0) {
                return d1.b.f3040e;
            }
            return bVar;
        }
        throw new d1.c(bVar);
    }

    @Override // d1.e
    public final void d() {
        if (this.f6640k) {
            this.f6640k = false;
            int i10 = this.f6639j;
            int i11 = this.f3046b.f3044d;
            this.f6642m = new byte[i10 * i11];
            this.f6641l = this.f6638i * i11;
        }
        this.f6643n = 0;
    }

    @Override // d1.e
    public final void e() {
        if (this.f6640k) {
            if (this.f6643n > 0) {
                this.o += r0 / this.f3046b.f3044d;
            }
            this.f6643n = 0;
        }
    }

    @Override // d1.e, d1.d
    public final ByteBuffer g() {
        int i10;
        if (super.b() && (i10 = this.f6643n) > 0) {
            l(i10).put(this.f6642m, 0, this.f6643n).flip();
            this.f6643n = 0;
        }
        return super.g();
    }

    @Override // d1.d
    public final void i(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f6641l);
        this.o += min / this.f3046b.f3044d;
        this.f6641l -= min;
        byteBuffer.position(position + min);
        if (this.f6641l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f6643n + i11) - this.f6642m.length;
        ByteBuffer l10 = l(length);
        int h10 = f1.b0.h(length, 0, this.f6643n);
        l10.put(this.f6642m, 0, h10);
        int h11 = f1.b0.h(length - h10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + h11);
        l10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - h11;
        int i13 = this.f6643n - h10;
        this.f6643n = i13;
        byte[] bArr = this.f6642m;
        System.arraycopy(bArr, h10, bArr, 0, i13);
        byteBuffer.get(this.f6642m, this.f6643n, i12);
        this.f6643n += i12;
        l10.flip();
    }

    @Override // d1.e
    public final void k() {
        this.f6642m = f1.b0.f3804f;
    }
}
