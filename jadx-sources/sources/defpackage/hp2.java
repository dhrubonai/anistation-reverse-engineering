package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class hp2 implements Closeable {
    public static final Logger A;
    public final db0 x;
    public final gp2 y;
    public final mo2 z;

    static {
        Logger logger = Logger.getLogger(vo2.class.getName());
        logger.getClass();
        A = logger;
    }

    public hp2(xy4 xy4Var) {
        xy4Var.getClass();
        this.x = xy4Var;
        gp2 gp2Var = new gp2(xy4Var);
        this.y = gp2Var;
        this.z = new mo2(gp2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x023c, code lost:
    
        defpackage.qi2.k(defpackage.qx1.h(r13, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0245, code lost:
    
        return r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r23, defpackage.uh0 r24) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp2.a(boolean, uh0):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.x.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, pa0] */
    public final void l(uh0 uh0Var, int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (i3 != 0) {
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 32) == 0) {
                if ((i2 & 8) != 0) {
                    byte readByte = this.x.readByte();
                    byte[] bArr = dq6.a;
                    i4 = readByte & 255;
                } else {
                    i4 = 0;
                }
                int G = w65.G(i, i2, i4);
                db0 db0Var = this.x;
                ep2 ep2Var = (ep2) uh0Var.z;
                if (i3 != 0 && (i3 & 1) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    ?? obj = new Object();
                    long j = G;
                    db0Var.m(j);
                    db0Var.j0(j, obj);
                    ep2Var.F.c(new ap2(ep2Var.z + '[' + i3 + "] onData", ep2Var, i3, obj, G, z), 0L);
                } else {
                    lp2 l = ep2Var.l(i3);
                    if (l == null) {
                        ((ep2) uh0Var.z).G(i3, 2);
                        long j2 = G;
                        ((ep2) uh0Var.z).t(j2);
                        db0Var.skip(j2);
                    } else {
                        byte[] bArr2 = dq6.a;
                        jp2 jp2Var = l.i;
                        long j3 = G;
                        jp2Var.getClass();
                        long j4 = j3;
                        while (true) {
                            lp2 lp2Var = jp2Var.C;
                            if (j4 > 0) {
                                synchronized (lp2Var) {
                                    z3 = jp2Var.y;
                                    if (jp2Var.A.y + j4 > jp2Var.x) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                if (z4) {
                                    db0Var.skip(j4);
                                    jp2Var.C.e(4);
                                    break;
                                }
                                if (z3) {
                                    db0Var.skip(j4);
                                    break;
                                }
                                long j0 = db0Var.j0(j4, jp2Var.z);
                                if (j0 != -1) {
                                    j4 -= j0;
                                    lp2 lp2Var2 = jp2Var.C;
                                    synchronized (lp2Var2) {
                                        try {
                                            if (jp2Var.B) {
                                                pa0 pa0Var = jp2Var.z;
                                                pa0Var.skip(pa0Var.y);
                                            } else {
                                                pa0 pa0Var2 = jp2Var.A;
                                                if (pa0Var2.y == 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                pa0Var2.v0(jp2Var.z);
                                                if (z5) {
                                                    lp2Var2.notifyAll();
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } else {
                                    throw new EOFException();
                                }
                            } else {
                                byte[] bArr3 = dq6.a;
                                lp2Var.b.t(j3);
                                break;
                            }
                        }
                        if (z) {
                            l.i(dq6.b, true);
                        }
                    }
                }
                this.x.skip(i4);
                return;
            }
            qi2.k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        qi2.k("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    public final List p(int i, int i2, int i3, int i4) {
        gp2 gp2Var = this.y;
        gp2Var.B = i;
        gp2Var.y = i;
        gp2Var.C = i2;
        gp2Var.z = i3;
        gp2Var.A = i4;
        mo2 mo2Var = this.z;
        xy4 xy4Var = mo2Var.c;
        ArrayList arrayList = mo2Var.b;
        while (!xy4Var.D()) {
            byte readByte = xy4Var.readByte();
            byte[] bArr = dq6.a;
            int i5 = readByte & 255;
            if (i5 != 128) {
                if ((readByte & 128) == 128) {
                    int e = mo2Var.e(i5, 127);
                    int i6 = e - 1;
                    if (i6 >= 0) {
                        ak2[] ak2VarArr = oo2.a;
                        if (i6 <= ak2VarArr.length - 1) {
                            arrayList.add(ak2VarArr[i6]);
                        }
                    }
                    int length = mo2Var.e + 1 + (i6 - oo2.a.length);
                    if (length >= 0) {
                        ak2[] ak2VarArr2 = mo2Var.d;
                        if (length < ak2VarArr2.length) {
                            ak2 ak2Var = ak2VarArr2[length];
                            ak2Var.getClass();
                            arrayList.add(ak2Var);
                        }
                    }
                    qi2.k(qx1.h(e, "Header index too large "));
                    return null;
                }
                if (i5 == 64) {
                    ak2[] ak2VarArr3 = oo2.a;
                    zd0 d = mo2Var.d();
                    oo2.a(d);
                    mo2Var.c(new ak2(d, mo2Var.d()));
                } else if ((readByte & 64) == 64) {
                    mo2Var.c(new ak2(mo2Var.b(mo2Var.e(i5, 63) - 1), mo2Var.d()));
                } else if ((readByte & 32) == 32) {
                    int e2 = mo2Var.e(i5, 31);
                    mo2Var.a = e2;
                    if (e2 >= 0 && e2 <= 4096) {
                        int i7 = mo2Var.g;
                        if (e2 < i7) {
                            if (e2 == 0) {
                                ak2[] ak2VarArr4 = mo2Var.d;
                                ms.E0(0, ak2VarArr4.length, null, ak2VarArr4);
                                mo2Var.e = mo2Var.d.length - 1;
                                mo2Var.f = 0;
                                mo2Var.g = 0;
                            } else {
                                mo2Var.a(i7 - e2);
                            }
                        }
                    } else {
                        throw new IOException("Invalid dynamic table size update " + mo2Var.a);
                    }
                } else if (i5 != 16 && i5 != 0) {
                    arrayList.add(new ak2(mo2Var.b(mo2Var.e(i5, 15) - 1), mo2Var.d()));
                } else {
                    ak2[] ak2VarArr5 = oo2.a;
                    zd0 d2 = mo2Var.d();
                    oo2.a(d2);
                    arrayList.add(new ak2(d2, mo2Var.d()));
                }
            } else {
                qi2.k("index == 0");
                return null;
            }
        }
        List I0 = yo0.I0(arrayList);
        arrayList.clear();
        return I0;
    }

    public final void q(uh0 uh0Var, int i, int i2, int i3) {
        boolean z;
        int i4;
        if (i3 != 0) {
            boolean z2 = false;
            byte b = 1;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 8) != 0) {
                byte readByte = this.x.readByte();
                byte[] bArr = dq6.a;
                i4 = readByte & 255;
            } else {
                i4 = 0;
            }
            if ((i2 & 32) != 0) {
                db0 db0Var = this.x;
                db0Var.readInt();
                db0Var.readByte();
                byte[] bArr2 = dq6.a;
                i -= 5;
            }
            List p = p(w65.G(i, i2, i4), i4, i2, i3);
            ep2 ep2Var = (ep2) uh0Var.z;
            if (i3 != 0 && (i3 & 1) == 0) {
                z2 = true;
            }
            if (z2) {
                ep2Var.F.c(new bp2(ep2Var.z + '[' + i3 + "] onHeaders", ep2Var, i3, p, z), 0L);
                return;
            }
            synchronized (ep2Var) {
                lp2 l = ep2Var.l(i3);
                if (l == null) {
                    if (ep2Var.C) {
                        return;
                    }
                    if (i3 <= ep2Var.A) {
                        return;
                    }
                    if (i3 % 2 == ep2Var.B % 2) {
                        return;
                    }
                    lp2 lp2Var = new lp2(i3, ep2Var, false, z, dq6.u(p));
                    ep2Var.A = i3;
                    ep2Var.y.put(Integer.valueOf(i3), lp2Var);
                    ep2Var.D.d().c(new yo2(ep2Var.z + '[' + i3 + "] onStream", ep2Var, lp2Var, b), 0L);
                    return;
                }
                l.i(dq6.u(p), z);
                return;
            }
        }
        qi2.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void t(uh0 uh0Var, int i, int i2, int i3) {
        int i4;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                byte readByte = this.x.readByte();
                byte[] bArr = dq6.a;
                i4 = readByte & 255;
            } else {
                i4 = 0;
            }
            int readInt = this.x.readInt() & Integer.MAX_VALUE;
            List p = p(w65.G(i - 4, i2, i4), i4, i2, i3);
            ep2 ep2Var = (ep2) uh0Var.z;
            synchronized (ep2Var) {
                if (ep2Var.V.contains(Integer.valueOf(readInt))) {
                    ep2Var.G(readInt, 2);
                    return;
                }
                ep2Var.V.add(Integer.valueOf(readInt));
                ep2Var.F.c(new bp2(ep2Var.z + '[' + readInt + "] onRequest", ep2Var, readInt, p), 0L);
                return;
            }
        }
        qi2.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
