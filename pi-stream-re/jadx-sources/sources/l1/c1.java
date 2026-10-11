package l1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c1 extends d1.e {

    /* renamed from: i, reason: collision with root package name */
    public static final int f6633i = Float.floatToIntBits(Float.NaN);

    public static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f6633i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // d1.e
    public final d1.b c(d1.b bVar) {
        boolean z9;
        int i10 = bVar.f3043c;
        if (i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            if (i10 != 4) {
                return new d1.b(bVar.f3041a, bVar.f3042b, 4);
            }
            return d1.b.f3040e;
        }
        throw new d1.c(bVar);
    }

    @Override // d1.d
    public final void i(ByteBuffer byteBuffer) {
        ByteBuffer l10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f3046b.f3043c;
        if (i11 != 21) {
            if (i11 != 22) {
                if (i11 != 1342177280) {
                    if (i11 == 1610612736) {
                        l10 = l(i10);
                        while (position < limit) {
                            m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l10);
                            position += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    l10 = l((i10 / 3) * 4);
                    while (position < limit) {
                        m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l10);
                        position += 3;
                    }
                }
            } else {
                l10 = l(i10);
                while (position < limit) {
                    m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l10);
                    position += 4;
                }
            }
        } else {
            l10 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l10);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l10.flip();
    }
}
