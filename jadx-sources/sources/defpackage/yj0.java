package defpackage;

import com.anistation.model.settings.SubtitleArgbColor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yj0 extends f30 {
    public iw2 i;
    public iw2 j;

    @Override // defpackage.f30
    public final vv a(vv vvVar) {
        boolean z;
        boolean z2;
        int i = vvVar.c;
        iw2 iw2Var = this.i;
        if (iw2Var == null) {
            return vv.e;
        }
        int i2 = vvVar.b;
        if (eq6.N(i)) {
            int i3 = iw2Var.y;
            if (i2 != i3) {
                z = true;
            } else {
                z = false;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                int b = iw2Var.b(i4);
                if (b < i2) {
                    if (b != i4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new yv("Channel map (" + iw2Var + ") trying to access non-existent input channel.", vvVar);
                }
            }
            if (z) {
                return new vv(vvVar.a, i3, i);
            }
            return vv.e;
        }
        throw new yv(vvVar);
    }

    @Override // defpackage.f30
    public final void b() {
        this.j = this.i;
    }

    @Override // defpackage.zv
    public final void g(ByteBuffer byteBuffer) {
        int i;
        boolean z;
        int i2;
        int i3;
        iw2 iw2Var = this.j;
        iw2Var.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l = l(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i4 = 0; i4 < iw2Var.y; i4++) {
                int v = (eq6.v(this.b.c) * iw2Var.b(i4)) + position;
                int i5 = this.b.c;
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 21) {
                                if (i5 != 22) {
                                    if (i5 != 268435456) {
                                        if (i5 != 1342177280) {
                                            if (i5 != 1610612736) {
                                                if (i5 != 1879048192) {
                                                    if (i5 != 1895825408) {
                                                        if (i5 != 1912602624) {
                                                            qi2.h(this.b.c, "Unexpected encoding: ");
                                                            return;
                                                        }
                                                    }
                                                }
                                                l.putDouble(byteBuffer.getDouble(v));
                                            }
                                        }
                                    }
                                }
                                l.putInt(byteBuffer.getInt(v));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            if (order == byteOrder) {
                                i = v;
                            } else {
                                i = v + 2;
                            }
                            byte b = byteBuffer.get(i);
                            byte b2 = byteBuffer.get(v + 1);
                            if (byteBuffer.order() == byteOrder) {
                                v += 2;
                            }
                            int i6 = ((((b << 24) & SubtitleArgbColor.BLACK) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(v) << 8) & 65280)) >> 8;
                            boolean z2 = true;
                            if ((i6 & SubtitleArgbColor.BLACK) != 0 && (i6 & (-8388608)) != -8388608) {
                                z = false;
                            } else {
                                z = true;
                            }
                            io3.p(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i6));
                            if (l.remaining() < 3) {
                                z2 = false;
                            }
                            io3.n(z2);
                            if (l.order() == byteOrder) {
                                i2 = (i6 & 16711680) >> 16;
                            } else {
                                i2 = i6 & 255;
                            }
                            byte b3 = (byte) i2;
                            byte b4 = (byte) ((i6 & 65280) >> 8);
                            if (l.order() == byteOrder) {
                                i3 = i6 & 255;
                            } else {
                                i3 = (i6 & 16711680) >> 16;
                            }
                            l.put(b3).put(b4).put((byte) i3);
                        }
                        l.putFloat(byteBuffer.getFloat(v));
                    } else {
                        l.put(byteBuffer.get(v));
                    }
                }
                l.putShort(byteBuffer.getShort(v));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        l.flip();
    }

    @Override // defpackage.f30
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
