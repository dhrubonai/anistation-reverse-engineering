package defpackage;

import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ga4 {
    public static final b44 a;

    static {
        b44 b44Var = dc4.a;
        a = new b44();
    }

    public static final void a(xz3 xz3Var, int i, int i2) {
        if (xz3Var instanceof zc1) {
            zc1 zc1Var = (zc1) xz3Var;
            int i3 = zc1Var.L;
            b(xz3Var, i3 & i, i2);
            int i4 = (~i3) & i;
            for (xz3 xz3Var2 = zc1Var.M; xz3Var2 != null; xz3Var2 = xz3Var2.C) {
                a(xz3Var2, i4, i2);
            }
            return;
        }
        b(xz3Var, i & xz3Var.z, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(xz3 xz3Var, int i, int i2) {
        if (i2 != 0 || xz3Var.P0()) {
            if ((i & 2) != 0 && (xz3Var instanceof ra3)) {
                w65.E((ra3) xz3Var);
                if (i2 == 2) {
                    wc7.M(xz3Var, 2).l1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                wc7.O(xz3Var).F();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                wc7.O(xz3Var).V(false);
            }
            if ((i & 256) != 0 && (xz3Var instanceof hf2)) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        wc7.O(xz3Var).b0(r0.m0 - 1);
                    }
                } else {
                    za3 O = wc7.O(xz3Var);
                    O.b0(O.m0 + 1);
                }
                if (i2 != 2) {
                    za3 O2 = wc7.O(xz3Var);
                    if (O2.m0 != 0 && !O2.p() && !O2.q() && !O2.l0) {
                        oa oaVar = (oa) cb3.a(O2);
                        y23 y23Var = (y23) oaVar.q0.f;
                        if (O2.m0 > 0) {
                            ((z44) y23Var.y).b(O2);
                            O2.l0 = true;
                        }
                        oaVar.D(null);
                    }
                }
            }
            if ((i & 4) != 0 && (xz3Var instanceof zo1)) {
                v94.y((zo1) xz3Var);
            }
            if ((i & 8) != 0 && (xz3Var instanceof sh5)) {
                wc7.O(xz3Var).O = true;
            }
            if ((i & 64) != 0 && (xz3Var instanceof vi4)) {
                db3 db3Var = wc7.O((vi4) xz3Var).d0;
                db3Var.p.O = true;
                em3 em3Var = db3Var.q;
                if (em3Var != null) {
                    em3Var.U = true;
                }
            }
            if ((i & 2048) != 0 && (xz3Var instanceof v72)) {
                v72 v72Var = (v72) xz3Var;
                jg0.b = null;
                v72Var.D(jg0.a);
                if (jg0.b != null) {
                    xz3 xz3Var2 = (xz3) v72Var;
                    if (!xz3Var2.x.K) {
                        ez2.b("visitChildren called on an unattached node");
                    }
                    z44 z44Var = new z44(new xz3[16], 0);
                    xz3 xz3Var3 = xz3Var2.x;
                    xz3 xz3Var4 = xz3Var3.C;
                    if (xz3Var4 == null) {
                        wc7.f(z44Var, xz3Var3);
                    } else {
                        z44Var.b(xz3Var4);
                    }
                    while (true) {
                        int i3 = z44Var.z;
                        if (i3 == 0) {
                            break;
                        }
                        xz3 xz3Var5 = (xz3) z44Var.m(i3 - 1);
                        if ((xz3Var5.A & 1024) == 0) {
                            wc7.f(z44Var, xz3Var5);
                        } else {
                            while (true) {
                                if (xz3Var5 == null) {
                                    break;
                                }
                                if ((xz3Var5.z & 1024) != 0) {
                                    z44 z44Var2 = null;
                                    while (xz3Var5 != null) {
                                        if (xz3Var5 instanceof h82) {
                                            h82 h82Var = (h82) xz3Var5;
                                            n72 n72Var = ((r72) ((oa) wc7.P(h82Var)).getFocusOwner()).d;
                                            if (n72Var.c.a(h82Var)) {
                                                n72Var.a();
                                            }
                                        } else if ((xz3Var5.z & 1024) != 0 && (xz3Var5 instanceof zc1)) {
                                            int i4 = 0;
                                            for (xz3 xz3Var6 = ((zc1) xz3Var5).M; xz3Var6 != null; xz3Var6 = xz3Var6.C) {
                                                if ((xz3Var6.z & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        xz3Var5 = xz3Var6;
                                                    } else {
                                                        if (z44Var2 == null) {
                                                            z44Var2 = new z44(new xz3[16], 0);
                                                        }
                                                        if (xz3Var5 != null) {
                                                            z44Var2.b(xz3Var5);
                                                            xz3Var5 = null;
                                                        }
                                                        z44Var2.b(xz3Var6);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        xz3Var5 = wc7.J(z44Var2);
                                    }
                                } else {
                                    xz3Var5 = xz3Var5.C;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 && (xz3Var instanceof g72)) {
                g72 g72Var = (g72) xz3Var;
                n72 n72Var2 = ((r72) ((oa) wc7.P(g72Var)).getFocusOwner()).d;
                if (n72Var2.d.a(g72Var)) {
                    n72Var2.a();
                }
            }
            if ((i & 2097152) != 0 && (xz3Var instanceof ly2) && i2 == 2) {
                ((ly2) xz3Var).l0();
            }
        }
    }

    public static final void c(xz3 xz3Var) {
        if (!xz3Var.K) {
            ez2.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(xz3Var, -1, 0);
    }

    public static final int d(wz3 wz3Var) {
        int i;
        if (wz3Var instanceof pa3) {
            i = 3;
        } else {
            i = 1;
        }
        if (wz3Var instanceof yo1) {
            i |= 4;
        }
        if (wz3Var instanceof qh5) {
            i |= 8;
        }
        if (wz3Var instanceof ar4) {
            i |= 16;
        }
        if (wz3Var instanceof b04) {
            i |= 32;
        }
        if (wz3Var instanceof va6) {
            i |= 256;
        }
        if (wz3Var instanceof ui4) {
            i |= 64;
        }
        if (wz3Var instanceof t90) {
            return 524288 | i;
        }
        return i;
    }

    public static final int e(xz3 xz3Var) {
        int i;
        int i2 = xz3Var.z;
        if (i2 != 0) {
            return i2;
        }
        Class<?> cls = xz3Var.getClass();
        b44 b44Var = a;
        int d = b44Var.d(cls);
        if (d >= 0) {
            return b44Var.c[d];
        }
        if (xz3Var instanceof ra3) {
            i = 3;
        } else {
            i = 1;
        }
        if (xz3Var instanceof zo1) {
            i |= 4;
        }
        if (xz3Var instanceof sh5) {
            i |= 8;
        }
        if (xz3Var instanceof xq4) {
            i |= 16;
        }
        if (xz3Var instanceof a04) {
            i |= 32;
        }
        if (xz3Var instanceof vi4) {
            i |= 64;
        }
        if (xz3Var instanceof fa3) {
            i |= 4194432;
        } else if (xz3Var instanceof yo3) {
            i |= 128;
        }
        if (xz3Var instanceof hf2) {
            i |= 256;
        }
        if (xz3Var instanceof h82) {
            i |= 1024;
        }
        if (xz3Var instanceof v72) {
            i |= 2048;
        }
        if (xz3Var instanceof g72) {
            i |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
        }
        if (xz3Var instanceof j83) {
            i |= 8192;
        }
        if (xz3Var instanceof ga) {
            i |= 16384;
        }
        if (xz3Var instanceof wu0) {
            i |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
        }
        if (xz3Var instanceof jj6) {
            i |= 262144;
        }
        if (xz3Var instanceof t90) {
            i |= 524288;
        }
        if (xz3Var instanceof h82) {
            i |= 1048576;
        }
        if (xz3Var instanceof ly2) {
            i |= 2097152;
        }
        if (xz3Var instanceof gd3) {
            i |= 8388608;
        }
        b44Var.g(i, cls);
        return i;
    }

    public static final int f(xz3 xz3Var) {
        if (xz3Var instanceof zc1) {
            zc1 zc1Var = (zc1) xz3Var;
            int i = zc1Var.L;
            for (xz3 xz3Var2 = zc1Var.M; xz3Var2 != null; xz3Var2 = xz3Var2.C) {
                i |= f(xz3Var2);
            }
            return i;
        }
        return e(xz3Var);
    }

    public static final boolean g(int i) {
        boolean z;
        boolean z2 = false;
        if ((i & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4194304) != 0) {
            z2 = true;
        }
        return z | z2;
    }
}
