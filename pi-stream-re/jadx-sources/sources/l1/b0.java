package l1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b0 extends d1.e {

    /* renamed from: i, reason: collision with root package name */
    public int[] f6617i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f6618j;

    @Override // d1.e
    public final d1.b c(d1.b bVar) {
        boolean z9;
        boolean z10;
        int[] iArr = this.f6617i;
        if (iArr == null) {
            return d1.b.f3040e;
        }
        if (bVar.f3043c == 2) {
            int length = iArr.length;
            int i10 = bVar.f3042b;
            if (i10 != length) {
                z9 = true;
            } else {
                z9 = false;
            }
            for (int i11 = 0; i11 < iArr.length; i11++) {
                int i12 = iArr[i11];
                if (i12 < i10) {
                    if (i12 != i11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z9 |= z10;
                } else {
                    throw new d1.c(bVar);
                }
            }
            if (z9) {
                return new d1.b(bVar.f3041a, iArr.length, 2);
            }
            return d1.b.f3040e;
        }
        throw new d1.c(bVar);
    }

    @Override // d1.e
    public final void d() {
        this.f6618j = this.f6617i;
    }

    @Override // d1.d
    public final void i(ByteBuffer byteBuffer) {
        int[] iArr = this.f6618j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f3046b.f3044d) * this.f3047c.f3044d);
        while (position < limit) {
            for (int i10 : iArr) {
                l10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f3046b.f3044d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    @Override // d1.e
    public final void k() {
        this.f6618j = null;
        this.f6617i = null;
    }
}
