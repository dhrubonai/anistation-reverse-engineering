package f9;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.h0;

/* loaded from: classes.dex */
public final class c0 implements Closeable {

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f4005x = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final k9.h f4006a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4007b;

    /* renamed from: c, reason: collision with root package name */
    public final k9.g f4008c;

    /* renamed from: d, reason: collision with root package name */
    public int f4009d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4010e;

    /* renamed from: f, reason: collision with root package name */
    public final e f4011f;

    public c0(k9.h hVar, boolean z9) {
        this.f4006a = hVar;
        this.f4007b = z9;
        k9.g gVar = new k9.g();
        this.f4008c = gVar;
        this.f4009d = 16384;
        this.f4011f = new e(gVar);
    }

    public final synchronized void G(f0 f0Var) {
        int i10;
        h0.u(f0Var, "settings");
        if (!this.f4010e) {
            q(0, Integer.bitCount(f0Var.f4035a) * 6, 4, 0);
            for (int i11 = 0; i11 < 10; i11++) {
                boolean z9 = true;
                if (((1 << i11) & f0Var.f4035a) == 0) {
                    z9 = false;
                }
                if (z9) {
                    if (i11 != 4) {
                        if (i11 != 7) {
                            i10 = i11;
                        } else {
                            i10 = 4;
                        }
                    } else {
                        i10 = 3;
                    }
                    this.f4006a.i(i10);
                    this.f4006a.j(f0Var.f4036b[i11]);
                }
            }
            this.f4006a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void H(int i10, long j4) {
        boolean z9;
        if (!this.f4010e) {
            if (j4 != 0 && j4 <= 2147483647L) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                q(i10, 4, 8, 0);
                this.f4006a.j((int) j4);
                this.f4006a.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void I(int i10, long j4) {
        int i11;
        while (j4 > 0) {
            long min = Math.min(this.f4009d, j4);
            j4 -= min;
            int i12 = (int) min;
            if (j4 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            q(i10, i12, 9, i11);
            this.f4006a.w(this.f4008c, min);
        }
    }

    public final synchronized void a(f0 f0Var) {
        int i10;
        int i11;
        h0.u(f0Var, "peerSettings");
        if (!this.f4010e) {
            int i12 = this.f4009d;
            int i13 = f0Var.f4035a;
            if ((i13 & 32) != 0) {
                i12 = f0Var.f4036b[5];
            }
            this.f4009d = i12;
            if ((i13 & 2) != 0) {
                i10 = f0Var.f4036b[1];
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                e eVar = this.f4011f;
                if ((i13 & 2) != 0) {
                    i11 = f0Var.f4036b[1];
                } else {
                    i11 = -1;
                }
                eVar.getClass();
                int min = Math.min(i11, 16384);
                int i14 = eVar.f4027e;
                if (i14 != min) {
                    if (min < i14) {
                        eVar.f4025c = Math.min(eVar.f4025c, min);
                    }
                    eVar.f4026d = true;
                    eVar.f4027e = min;
                    int i15 = eVar.f4031i;
                    if (min < i15) {
                        if (min == 0) {
                            c[] cVarArr = eVar.f4028f;
                            Arrays.fill(cVarArr, 0, cVarArr.length, (Object) null);
                            eVar.f4029g = eVar.f4028f.length - 1;
                            eVar.f4030h = 0;
                            eVar.f4031i = 0;
                        } else {
                            eVar.a(i15 - min);
                        }
                    }
                }
            }
            q(0, 0, 4, 1);
            this.f4006a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f4010e = true;
        this.f4006a.close();
    }

    public final synchronized void f(boolean z9, int i10, k9.g gVar, int i11) {
        if (!this.f4010e) {
            q(i10, i11, 0, z9 ? 1 : 0);
            if (i11 > 0) {
                h0.q(gVar);
                this.f4006a.w(gVar, i11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() {
        if (!this.f4010e) {
            this.f4006a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void q(int i10, int i11, int i12, int i13) {
        boolean z9;
        Level level = Level.FINE;
        Logger logger = f4005x;
        boolean z10 = false;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i10, i11, i12, i13));
        }
        if (i11 <= this.f4009d) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if ((Integer.MIN_VALUE & i10) == 0) {
                z10 = true;
            }
            if (z10) {
                byte[] bArr = z8.b.f12133a;
                k9.h hVar = this.f4006a;
                h0.u(hVar, "<this>");
                hVar.o((i11 >>> 16) & 255);
                hVar.o((i11 >>> 8) & 255);
                hVar.o(i11 & 255);
                hVar.o(i12 & 255);
                hVar.o(i13 & 255);
                hVar.j(i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException(a3.g.n("reserved bit set: ", i10).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f4009d + ": " + i11).toString());
    }

    public final synchronized void r(int i10, b bVar, byte[] bArr) {
        boolean z9;
        if (!this.f4010e) {
            boolean z10 = false;
            if (bVar.f3981a != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                q(0, bArr.length + 8, 7, 0);
                this.f4006a.j(i10);
                this.f4006a.j(bVar.f3981a);
                if (bArr.length == 0) {
                    z10 = true;
                }
                if (!z10) {
                    this.f4006a.p(bArr);
                }
                this.f4006a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void t(int i10, ArrayList arrayList, boolean z9) {
        int i11;
        if (!this.f4010e) {
            this.f4011f.d(arrayList);
            long j4 = this.f4008c.f6521b;
            long min = Math.min(this.f4009d, j4);
            if (j4 == min) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            if (z9) {
                i11 |= 1;
            }
            q(i10, (int) min, 1, i11);
            this.f4006a.w(this.f4008c, min);
            if (j4 > min) {
                I(i10, j4 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void v(int i10, int i11, boolean z9) {
        int i12;
        if (!this.f4010e) {
            if (z9) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            q(0, 8, 6, i12);
            this.f4006a.j(i10);
            this.f4006a.j(i11);
            this.f4006a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void x(int i10, b bVar) {
        boolean z9;
        h0.u(bVar, "errorCode");
        if (!this.f4010e) {
            if (bVar.f3981a != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                q(i10, 4, 3, 0);
                this.f4006a.j(bVar.f3981a);
                this.f4006a.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
