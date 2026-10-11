package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class no6 extends qo6 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no6(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 0);
        this.c = b;
    }

    @Override // defpackage.qo6
    public final void a(long j, byte[] bArr, long j2, long j3) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.qo6
    public final void b(byte[] bArr, long j, long j2, long j3) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.qo6
    public final boolean c(long j, Object obj) {
        switch (this.c) {
            case 0:
                if (ro6.h) {
                    if (ro6.h(j, obj) == 0) {
                        return false;
                    }
                } else if (ro6.i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (ro6.h) {
                    if (ro6.h(j, obj) == 0) {
                        return false;
                    }
                } else if (ro6.i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.qo6
    public final byte d(long j) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.qo6
    public final byte e(long j, Object obj) {
        switch (this.c) {
            case 0:
                if (ro6.h) {
                    return ro6.h(j, obj);
                }
                return ro6.i(j, obj);
            default:
                if (ro6.h) {
                    return ro6.h(j, obj);
                }
                return ro6.i(j, obj);
        }
    }

    @Override // defpackage.qo6
    public final double f(long j, Object obj) {
        switch (this.c) {
            case 0:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            default:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
        }
    }

    @Override // defpackage.qo6
    public final float g(long j, Object obj) {
        switch (this.c) {
            case 0:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            default:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
        }
    }

    @Override // defpackage.qo6
    public final long h(long j) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.qo6
    public final void i(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (ro6.h) {
                    ro6.p(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    ro6.q(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (ro6.h) {
                    ro6.p(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    ro6.q(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.qo6
    public final void j(long j, byte b) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.qo6
    public final void k(long j, Object obj, byte b) {
        switch (this.c) {
            case 0:
                if (ro6.h) {
                    ro6.p(j, obj, b);
                    return;
                } else {
                    ro6.q(j, obj, b);
                    return;
                }
            default:
                if (ro6.h) {
                    ro6.p(j, obj, b);
                    return;
                } else {
                    ro6.q(j, obj, b);
                    return;
                }
        }
    }

    @Override // defpackage.qo6
    public final void l(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // defpackage.qo6
    public final void m(Object obj, long j, float f) {
        switch (this.c) {
            case 0:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                return;
            default:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                return;
        }
    }

    @Override // defpackage.qo6
    public final boolean o() {
        switch (this.c) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
