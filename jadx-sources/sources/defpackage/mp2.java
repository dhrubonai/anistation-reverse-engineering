package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class mp2 implements Closeable {
    public static final Logger C = Logger.getLogger(vo2.class.getName());
    public boolean A;
    public final no2 B;
    public final cb0 x;
    public final pa0 y;
    public int z;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pa0] */
    public mp2(wy4 wy4Var) {
        wy4Var.getClass();
        this.x = wy4Var;
        ?? obj = new Object();
        this.y = obj;
        this.z = 16384;
        this.B = new no2(obj);
    }

    public final synchronized void A(int i, int i2, boolean z) {
        if (!this.A) {
            p(0, 8, 6, z ? 1 : 0);
            this.x.writeInt(i);
            this.x.writeInt(i2);
            this.x.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void G(int i, int i2) {
        if (i2 != 0) {
            if (!this.A) {
                if (h11.b(i2) != -1) {
                    p(i, 4, 3, 0);
                    this.x.writeInt(h11.b(i2));
                    this.x.flush();
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                throw new IOException("closed");
            }
        } else {
            throw null;
        }
    }

    public final synchronized void I(int i, long j) {
        if (!this.A) {
            if (j != 0 && j <= 2147483647L) {
                p(i, 4, 8, 0);
                this.x.writeInt((int) j);
                this.x.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(jl5 jl5Var) {
        int i;
        try {
            jl5Var.getClass();
            if (!this.A) {
                int i2 = this.z;
                int i3 = jl5Var.a;
                if ((i3 & 32) != 0) {
                    i2 = jl5Var.b[5];
                }
                this.z = i2;
                int i4 = -1;
                if ((i3 & 2) != 0) {
                    i = jl5Var.b[1];
                } else {
                    i = -1;
                }
                if (i != -1) {
                    no2 no2Var = this.B;
                    if ((i3 & 2) != 0) {
                        i4 = jl5Var.b[1];
                    }
                    int min = Math.min(i4, 16384);
                    int i5 = no2Var.d;
                    if (i5 != min) {
                        if (min < i5) {
                            no2Var.b = Math.min(no2Var.b, min);
                        }
                        no2Var.c = true;
                        no2Var.d = min;
                        int i6 = no2Var.h;
                        if (min < i6) {
                            if (min == 0) {
                                ak2[] ak2VarArr = no2Var.e;
                                ms.E0(0, ak2VarArr.length, null, ak2VarArr);
                                no2Var.f = no2Var.e.length - 1;
                                no2Var.g = 0;
                                no2Var.h = 0;
                            } else {
                                no2Var.a(i6 - min);
                            }
                        }
                    }
                }
                p(0, 0, 4, 1);
                this.x.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.A = true;
        this.x.close();
    }

    public final synchronized void flush() {
        if (!this.A) {
            this.x.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void l(boolean z, int i, pa0 pa0Var, int i2) {
        if (!this.A) {
            p(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                cb0 cb0Var = this.x;
                pa0Var.getClass();
                cb0Var.f0(i2, pa0Var);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void p(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = C;
        if (logger.isLoggable(level)) {
            logger.fine(vo2.a(false, i, i2, i3, i4));
        }
        if (i2 <= this.z) {
            if ((Integer.MIN_VALUE & i) == 0) {
                byte[] bArr = dq6.a;
                cb0 cb0Var = this.x;
                cb0Var.writeByte((i2 >>> 16) & 255);
                cb0Var.writeByte((i2 >>> 8) & 255);
                cb0Var.writeByte(i2 & 255);
                cb0Var.writeByte(i3 & 255);
                cb0Var.writeByte(i4 & 255);
                cb0Var.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            ze0.e(qx1.h(i, "reserved bit set: "));
            return;
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.z + ": " + i2).toString());
    }

    public final synchronized void q(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            if (!this.A) {
                if (h11.b(i2) != -1) {
                    p(0, bArr.length + 8, 7, 0);
                    this.x.writeInt(i);
                    this.x.writeInt(h11.b(i2));
                    if (bArr.length != 0) {
                        this.x.write(bArr);
                    }
                    this.x.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
            } else {
                throw new IOException("closed");
            }
        } else {
            throw null;
        }
    }

    public final synchronized void t(boolean z, int i, ArrayList arrayList) {
        int i2;
        int i3;
        if (!this.A) {
            this.B.d(arrayList);
            long j = this.y.y;
            long min = Math.min(this.z, j);
            if (j == min) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            p(i, (int) min, 1, i2);
            this.x.f0(min, this.y);
            if (j > min) {
                long j2 = j - min;
                while (j2 > 0) {
                    long min2 = Math.min(this.z, j2);
                    j2 -= min2;
                    int i4 = (int) min2;
                    if (j2 == 0) {
                        i3 = 4;
                    } else {
                        i3 = 0;
                    }
                    p(i, i4, 9, i3);
                    this.x.f0(min2, this.y);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }
}
