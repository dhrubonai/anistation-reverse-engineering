package l1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b1 extends d1.e {
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6625p;

    /* renamed from: q, reason: collision with root package name */
    public int f6626q;

    /* renamed from: r, reason: collision with root package name */
    public long f6627r;

    /* renamed from: t, reason: collision with root package name */
    public byte[] f6629t;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f6632w;

    /* renamed from: s, reason: collision with root package name */
    public int f6628s = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f6630u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f6631v = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f6622l = 100000;

    /* renamed from: i, reason: collision with root package name */
    public final float f6619i = 0.2f;

    /* renamed from: m, reason: collision with root package name */
    public final long f6623m = 2000000;

    /* renamed from: k, reason: collision with root package name */
    public final int f6621k = 10;

    /* renamed from: j, reason: collision with root package name */
    public final short f6620j = 1024;

    /* renamed from: n, reason: collision with root package name */
    public d1.b f6624n = d1.b.f3040e;

    public b1() {
        byte[] bArr = f1.b0.f3804f;
        this.f6629t = bArr;
        this.f6632w = bArr;
    }

    @Override // d1.e, d1.d
    public final boolean a() {
        if (this.f6624n.f3041a != -1 && this.f6625p) {
            return true;
        }
        return false;
    }

    @Override // d1.e
    public final d1.b c(d1.b bVar) {
        if (bVar.f3043c == 2) {
            this.f6624n = bVar;
            this.o = bVar.f3042b * 2;
            return bVar;
        }
        throw new d1.c(bVar);
    }

    @Override // d1.e
    public final void d() {
        if (a()) {
            int i10 = ((int) ((this.f6622l * this.f6624n.f3041a) / 1000000)) / 2;
            int i11 = this.o;
            int i12 = (i10 / i11) * i11 * 2;
            if (this.f6629t.length != i12) {
                this.f6629t = new byte[i12];
                this.f6632w = new byte[i12];
            }
        }
        this.f6626q = 0;
        this.f6627r = 0L;
        this.f6628s = 0;
        this.f6630u = 0;
        this.f6631v = 0;
    }

    @Override // d1.e
    public final void e() {
        if (this.f6631v > 0) {
            n(true);
            this.f6628s = 0;
        }
    }

    @Override // d1.d
    public final void i(ByteBuffer byteBuffer) {
        boolean z9;
        int limit;
        boolean z10;
        boolean z11;
        boolean z12;
        int position;
        boolean z13;
        while (byteBuffer.hasRemaining() && !this.f3051g.hasRemaining()) {
            int i10 = this.f6626q;
            short s9 = this.f6620j;
            boolean z14 = true;
            if (i10 != 0) {
                if (i10 == 1) {
                    if (this.f6630u < this.f6629t.length) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    w7.b.u(z9);
                    int limit2 = byteBuffer.limit();
                    int position2 = byteBuffer.position() + 1;
                    while (true) {
                        if (position2 < byteBuffer.limit()) {
                            if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s9) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                int i11 = this.o;
                                limit = (position2 / i11) * i11;
                                break;
                            }
                            position2 += 2;
                        } else {
                            limit = byteBuffer.limit();
                            break;
                        }
                    }
                    int position3 = limit - byteBuffer.position();
                    int i12 = this.f6630u;
                    int i13 = this.f6631v;
                    int i14 = i12 + i13;
                    byte[] bArr = this.f6629t;
                    if (i14 < bArr.length) {
                        i12 = bArr.length;
                    } else {
                        i14 = i13 - (bArr.length - i12);
                    }
                    int i15 = i12 - i14;
                    if (limit < limit2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int min = Math.min(position3, i15);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f6629t, i14, min);
                    int i16 = this.f6631v + min;
                    this.f6631v = i16;
                    if (i16 <= this.f6629t.length) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    w7.b.u(z11);
                    if (!z10 || position3 >= i15) {
                        z14 = false;
                    }
                    n(z14);
                    if (z14) {
                        this.f6626q = 0;
                        this.f6628s = 0;
                    }
                    byteBuffer.limit(limit2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f6629t.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > s9) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            int i17 = this.o;
                            position = ((limit4 / i17) * i17) + i17;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f6626q = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // d1.e
    public final void k() {
        this.f6625p = false;
        this.f6624n = d1.b.f3040e;
        byte[] bArr = f1.b0.f3804f;
        this.f6629t = bArr;
        this.f6632w = bArr;
    }

    public final int m(int i10) {
        boolean z9;
        int length = ((((int) ((this.f6623m * this.f6624n.f3041a) / 1000000)) - this.f6628s) * this.o) - (this.f6629t.length / 2);
        if (length >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        int min = (int) Math.min((i10 * this.f6619i) + 0.5f, length);
        int i11 = this.o;
        return (min / i11) * i11;
    }

    public final void n(boolean z9) {
        int length;
        int m5;
        boolean z10;
        boolean z11;
        int i10 = this.f6631v;
        byte[] bArr = this.f6629t;
        if (i10 == bArr.length || z9) {
            boolean z12 = false;
            if (this.f6628s == 0) {
                if (z9) {
                    o(i10, 3);
                    length = i10;
                } else {
                    if (i10 >= bArr.length / 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    w7.b.u(z11);
                    length = this.f6629t.length / 2;
                    o(length, 0);
                }
                m5 = length;
            } else if (z9) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int m9 = m(length2) + (this.f6629t.length / 2);
                o(m9, 2);
                m5 = m9;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                m5 = m(length);
                o(m5, 1);
            }
            if (length % this.o == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w7.b.t("bytesConsumed is not aligned to frame size: %s" + length, z10);
            if (i10 >= m5) {
                z12 = true;
            }
            w7.b.u(z12);
            this.f6631v -= length;
            int i11 = this.f6630u + length;
            this.f6630u = i11;
            this.f6630u = i11 % this.f6629t.length;
            this.f6628s = (m5 / this.o) + this.f6628s;
            this.f6627r += (length - m5) / r2;
        }
    }

    public final void o(int i10, int i11) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (i10 == 0) {
            return;
        }
        boolean z12 = true;
        if (this.f6631v >= i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        if (i11 == 2) {
            int i12 = this.f6630u;
            int i13 = this.f6631v;
            int i14 = i12 + i13;
            byte[] bArr = this.f6629t;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, i14 - i10, this.f6632w, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f6632w, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f6632w, 0, i15);
                    System.arraycopy(this.f6629t, 0, this.f6632w, i15, length);
                }
            }
        } else {
            int i16 = this.f6630u;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f6629t;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f6632w, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f6632w, 0, length2);
                System.arraycopy(this.f6629t, 0, this.f6632w, length2, i10 - length2);
            }
        }
        if (i10 % this.o == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b.f("sizeToOutput is not aligned to frame size: " + i10, z10);
        if (this.f6630u < this.f6629t.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        w7.b.u(z11);
        byte[] bArr3 = this.f6632w;
        if (i10 % this.o != 0) {
            z12 = false;
        }
        w7.b.f("byteOutput size is not aligned to frame size " + i10, z12);
        if (i11 != 3) {
            for (int i18 = 0; i18 < i10; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & 255);
                int i21 = this.f6621k;
                if (i11 == 0) {
                    i21 = ((((i18 * 1000) / (i10 - 1)) * (i21 - 100)) / 1000) + 100;
                } else if (i11 == 2) {
                    i21 += (((i18 * 1000) * (100 - i21)) / (i10 - 1)) / 1000;
                }
                int i22 = (i20 * i21) / 100;
                if (i22 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = Byte.MAX_VALUE;
                } else if (i22 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = Byte.MIN_VALUE;
                } else {
                    bArr3[i18] = (byte) (i22 & 255);
                    bArr3[i19] = (byte) (i22 >> 8);
                }
            }
        }
        l(i10).put(bArr3, 0, i10).flip();
    }
}
