package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vc7 extends qo6 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc7(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 2);
        this.c = b;
    }

    @Override // defpackage.qo6
    public final void p(long j, Object obj, byte b) {
        switch (this.c) {
            case 0:
                if (zc7.g) {
                    zc7.c(j, obj, b);
                    return;
                } else {
                    zc7.d(j, obj, b);
                    return;
                }
            default:
                if (zc7.g) {
                    zc7.c(j, obj, b);
                    return;
                } else {
                    zc7.d(j, obj, b);
                    return;
                }
        }
    }

    @Override // defpackage.qo6
    public final boolean q(long j, Object obj) {
        switch (this.c) {
            case 0:
                if (zc7.g) {
                    return zc7.k(j, obj);
                }
                return zc7.l(j, obj);
            default:
                if (zc7.g) {
                    return zc7.k(j, obj);
                }
                return zc7.l(j, obj);
        }
    }

    @Override // defpackage.qo6
    public final void r(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (zc7.g) {
                    zc7.c(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    zc7.d(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (zc7.g) {
                    zc7.c(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    zc7.d(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.qo6
    public final float s(long j, Object obj) {
        byte b = this.c;
        Unsafe unsafe = this.b;
        switch (b) {
            case 0:
                return Float.intBitsToFloat(unsafe.getInt(obj, j));
            default:
                return Float.intBitsToFloat(unsafe.getInt(obj, j));
        }
    }

    @Override // defpackage.qo6
    public final void t(Object obj, long j, float f) {
        byte b = this.c;
        Unsafe unsafe = this.b;
        switch (b) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                return;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                return;
        }
    }

    @Override // defpackage.qo6
    public final double u(long j, Object obj) {
        byte b = this.c;
        Unsafe unsafe = this.b;
        switch (b) {
            case 0:
                return Double.longBitsToDouble(unsafe.getLong(obj, j));
            default:
                return Double.longBitsToDouble(unsafe.getLong(obj, j));
        }
    }

    @Override // defpackage.qo6
    public final void v(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }
}
