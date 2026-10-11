package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class uo2 implements xw1 {
    public final jd4 a;
    public final ez4 b;
    public final db0 c;
    public final cb0 d;
    public byte e;
    public final ok2 f;
    public ik2 g;

    public uo2(jd4 jd4Var, ez4 ez4Var, xy4 xy4Var, wy4 wy4Var) {
        xy4Var.getClass();
        wy4Var.getClass();
        this.a = jd4Var;
        this.b = ez4Var;
        this.c = xy4Var;
        this.d = wy4Var;
        this.f = new ok2(xy4Var);
    }

    @Override // defpackage.xw1
    public final bv5 a(p45 p45Var) {
        if (!pq2.a(p45Var)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(p45.a(p45Var, "Transfer-Encoding"))) {
            ws2 ws2Var = p45Var.x.a;
            if (this.e == 4) {
                this.e = (byte) 5;
                return new ro2(this, ws2Var);
            }
            p65.e(this.e, "state: ");
            return null;
        }
        long j = dq6.j(p45Var);
        if (j != -1) {
            return i(j);
        }
        if (this.e == 4) {
            this.e = (byte) 5;
            this.b.k();
            return new po2(this);
        }
        p65.e(this.e, "state: ");
        return null;
    }

    @Override // defpackage.xw1
    public final void b() {
        this.d.flush();
    }

    @Override // defpackage.xw1
    public final pq5 c(l35 l35Var, long j) {
        l35Var.getClass();
        if ("chunked".equalsIgnoreCase(l35Var.c.b("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = (byte) 2;
                return new qo2(this);
            }
            p65.e(this.e, "state: ");
            return null;
        }
        if (j != -1) {
            if (this.e == 1) {
                this.e = (byte) 2;
                return new p12(this);
            }
            p65.e(this.e, "state: ");
            return null;
        }
        ze0.m("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    }

    @Override // defpackage.xw1
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            dq6.e(socket);
        }
    }

    @Override // defpackage.xw1
    public final o45 d(boolean z) {
        ok2 ok2Var = this.f;
        byte b = this.e;
        if (b != 1 && b != 2 && b != 3) {
            p65.e(this.e, "state: ");
            return null;
        }
        try {
            String K = ((db0) ok2Var.z).K(ok2Var.y);
            ok2Var.y -= K.length();
            eb2 g = jy5.g(K);
            int i = g.y;
            o45 o45Var = new o45();
            o45Var.b = (iw4) g.z;
            o45Var.c = i;
            o45Var.d = (String) g.A;
            o45Var.f = ok2Var.D().d();
            if (z && i == 100) {
                return null;
            }
            if (i == 100) {
                this.e = (byte) 3;
                return o45Var;
            }
            if (102 <= i && i < 200) {
                this.e = (byte) 3;
                return o45Var;
            }
            this.e = (byte) 4;
            return o45Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.b.a.h.f()), e);
        }
    }

    @Override // defpackage.xw1
    public final long e(p45 p45Var) {
        if (!pq2.a(p45Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(p45.a(p45Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return dq6.j(p45Var);
    }

    @Override // defpackage.xw1
    public final ez4 f() {
        return this.b;
    }

    @Override // defpackage.xw1
    public final void g(l35 l35Var) {
        l35Var.getClass();
        Proxy.Type type = this.b.b.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(l35Var.b);
        sb.append(' ');
        ws2 ws2Var = l35Var.a;
        if (!ws2Var.i && type == Proxy.Type.HTTP) {
            sb.append(ws2Var);
        } else {
            String b = ws2Var.b();
            String d = ws2Var.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        }
        sb.append(" HTTP/1.1");
        j(l35Var.c, sb.toString());
    }

    @Override // defpackage.xw1
    public final void h() {
        this.d.flush();
    }

    public final so2 i(long j) {
        if (this.e == 4) {
            this.e = (byte) 5;
            return new so2(this, j);
        }
        p65.e(this.e, "state: ");
        return null;
    }

    public final void j(ik2 ik2Var, String str) {
        if (this.e == 0) {
            cb0 cb0Var = this.d;
            cb0Var.V(str).V("\r\n");
            int size = ik2Var.size();
            for (int i = 0; i < size; i++) {
                cb0Var.V(ik2Var.c(i)).V(": ").V(ik2Var.g(i)).V("\r\n");
            }
            cb0Var.V("\r\n");
            this.e = (byte) 1;
            return;
        }
        p65.e(this.e, "state: ");
    }
}
