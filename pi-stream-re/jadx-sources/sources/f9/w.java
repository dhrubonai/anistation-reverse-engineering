package f9;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.h0;

/* loaded from: classes.dex */
public final class w implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final y8.j f4102e = new y8.j(29, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f4103f;

    /* renamed from: a, reason: collision with root package name */
    public final k9.i f4104a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4105b;

    /* renamed from: c, reason: collision with root package name */
    public final v f4106c;

    /* renamed from: d, reason: collision with root package name */
    public final d f4107d;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        h0.s(logger, "getLogger(Http2::class.java.name)");
        f4103f = logger;
    }

    public w(k9.i iVar, boolean z9) {
        this.f4104a = iVar;
        this.f4105b = z9;
        v vVar = new v(iVar);
        this.f4106c = vVar;
        this.f4107d = new d(vVar);
    }

    public final void G(n nVar, int i10, int i11) {
        if (i10 == 4) {
            int readInt = this.f4104a.readInt();
            byte[] bArr = z8.b.f12133a;
            long j4 = readInt & 2147483647L;
            if (j4 != 0) {
                if (i11 == 0) {
                    t tVar = nVar.f4062b;
                    synchronized (tVar) {
                        tVar.N += j4;
                        tVar.notifyAll();
                    }
                    return;
                }
                b0 q9 = nVar.f4062b.q(i11);
                if (q9 != null) {
                    synchronized (q9) {
                        q9.f3987f += j4;
                        if (j4 > 0) {
                            q9.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException(a3.g.n("TYPE_WINDOW_UPDATE length !=4: ", i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fc, code lost:
    
        throw new java.io.IOException(a3.g.n("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r17, f9.n r18) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.w.a(boolean, f9.n):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4104a.close();
    }

    public final void f(n nVar) {
        h0.u(nVar, "handler");
        if (this.f4105b) {
            if (!a(true, nVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        k9.j jVar = g.f4037a;
        k9.j h10 = this.f4104a.h(jVar.f6523a.length);
        Level level = Level.FINE;
        Logger logger = f4103f;
        if (logger.isLoggable(level)) {
            logger.fine(z8.b.h("<< CONNECTION " + h10.d(), new Object[0]));
        }
        if (h0.g(jVar, h10)) {
        } else {
            throw new IOException("Expected a connection header but was ".concat(h10.j()));
        }
    }

    public final void q(n nVar, int i10, int i11) {
        b bVar;
        Object[] array;
        boolean z9;
        if (i10 >= 8) {
            if (i11 == 0) {
                int readInt = this.f4104a.readInt();
                int readInt2 = this.f4104a.readInt();
                int i12 = i10 - 8;
                b[] values = b.values();
                int length = values.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        bVar = values[i13];
                        if (bVar.f3981a == readInt2) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            break;
                        } else {
                            i13++;
                        }
                    } else {
                        bVar = null;
                        break;
                    }
                }
                if (bVar != null) {
                    k9.j jVar = k9.j.f6522d;
                    if (i12 > 0) {
                        jVar = this.f4104a.h(i12);
                    }
                    nVar.getClass();
                    h0.u(jVar, "debugData");
                    jVar.c();
                    t tVar = nVar.f4062b;
                    synchronized (tVar) {
                        array = tVar.f4081c.values().toArray(new b0[0]);
                        tVar.f4085x = true;
                    }
                    for (b0 b0Var : (b0[]) array) {
                        if (b0Var.f3982a > readInt && b0Var.h()) {
                            b0Var.k(b.REFUSED_STREAM);
                            nVar.f4062b.t(b0Var.f3982a);
                        }
                    }
                    return;
                }
                throw new IOException(a3.g.n("TYPE_GOAWAY unexpected error code: ", readInt2));
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException(a3.g.n("TYPE_GOAWAY length < 8: ", i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r3.f4013b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List r(int r3, int r4, int r5, int r6) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.w.r(int, int, int, int):java.util.List");
    }

    public final void t(n nVar, int i10, int i11, int i12) {
        boolean z9;
        int i13;
        if (i12 != 0) {
            boolean z10 = false;
            int i14 = 1;
            if ((i11 & 1) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i11 & 8) != 0) {
                byte readByte = this.f4104a.readByte();
                byte[] bArr = z8.b.f12133a;
                i13 = readByte & 255;
            } else {
                i13 = 0;
            }
            if ((i11 & 32) != 0) {
                k9.i iVar = this.f4104a;
                iVar.readInt();
                iVar.readByte();
                byte[] bArr2 = z8.b.f12133a;
                nVar.getClass();
                i10 -= 5;
            }
            List r8 = r(y8.j.p(i10, i11, i13), i13, i11, i12);
            nVar.getClass();
            nVar.f4062b.getClass();
            if (i12 != 0 && (i12 & 1) == 0) {
                z10 = true;
            }
            if (z10) {
                t tVar = nVar.f4062b;
                tVar.getClass();
                tVar.A.c(new p(tVar.f4082d + '[' + i12 + "] onHeaders", tVar, i12, r8, z9), 0L);
                return;
            }
            t tVar2 = nVar.f4062b;
            synchronized (tVar2) {
                b0 q9 = tVar2.q(i12);
                if (q9 == null) {
                    if (!tVar2.f4085x) {
                        if (i12 > tVar2.f4083e) {
                            if (i12 % 2 != tVar2.f4084f % 2) {
                                b0 b0Var = new b0(i12, tVar2, false, z9, z8.b.u(r8));
                                tVar2.f4083e = i12;
                                tVar2.f4081c.put(Integer.valueOf(i12), b0Var);
                                tVar2.f4086y.f().c(new k(tVar2.f4082d + '[' + i12 + "] onStream", tVar2, b0Var, i14), 0L);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                q9.j(z8.b.u(r8), z9);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void v(n nVar, int i10, int i11, int i12) {
        boolean z9;
        if (i10 == 8) {
            if (i12 == 0) {
                int readInt = this.f4104a.readInt();
                int readInt2 = this.f4104a.readInt();
                if ((i11 & 1) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    t tVar = nVar.f4062b;
                    synchronized (tVar) {
                        if (readInt != 1) {
                            if (readInt != 2) {
                                if (readInt == 3) {
                                    tVar.notifyAll();
                                }
                            } else {
                                tVar.G++;
                            }
                        } else {
                            tVar.E++;
                        }
                    }
                    return;
                }
                nVar.f4062b.f4087z.c(new l(a3.g.t(new StringBuilder(), nVar.f4062b.f4082d, " ping"), nVar.f4062b, readInt, readInt2), 0L);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException(a3.g.n("TYPE_PING length != 8: ", i10));
    }

    public final void x(n nVar, int i10, int i11, int i12) {
        int i13;
        if (i12 != 0) {
            if ((i11 & 8) != 0) {
                byte readByte = this.f4104a.readByte();
                byte[] bArr = z8.b.f12133a;
                i13 = readByte & 255;
            } else {
                i13 = 0;
            }
            int readInt = this.f4104a.readInt() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            List r8 = r(y8.j.p(i10 - 4, i11, i13), i13, i11, i12);
            nVar.getClass();
            t tVar = nVar.f4062b;
            tVar.getClass();
            synchronized (tVar) {
                if (tVar.R.contains(Integer.valueOf(readInt))) {
                    tVar.H(readInt, b.PROTOCOL_ERROR);
                    return;
                }
                tVar.R.add(Integer.valueOf(readInt));
                tVar.A.c(new q(tVar.f4082d + '[' + readInt + "] onRequest", tVar, readInt, r8, 2), 0L);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
