package defpackage;

import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p55 implements ud1 {
    public float B;
    public float C;
    public float D;
    public long E;
    public long F;
    public float G;
    public float H;
    public float I;
    public float J;
    public long K;
    public om5 L;
    public boolean M;
    public int N;
    public long O;
    public ca3 P;
    public ud1 Q;
    public ia3 R;
    public d70 S;
    public w60 T;
    public int U;
    public bb4 V;
    public int x;
    public float y = 1.0f;
    public float z = 1.0f;
    public float A = 1.0f;

    public p55() {
        long j = gi2.a;
        this.E = j;
        this.F = j;
        this.J = 8.0f;
        this.K = xh6.b;
        this.L = io3.h;
        this.N = 0;
        this.O = 9205357640488583168L;
        this.P = ca3.a;
        this.Q = tl7.d();
        this.R = ia3.x;
        this.U = 3;
    }

    public final void a() {
        h(1.0f);
        i(1.0f);
        c(1.0f);
        if (this.B != 0.0f) {
            this.x |= 8;
            this.B = 0.0f;
        }
        n(0.0f);
        j(0.0f);
        long j = gi2.a;
        d(j);
        l(j);
        if (this.G != 0.0f) {
            this.x |= 256;
            this.G = 0.0f;
        }
        if (this.H != 0.0f) {
            this.x |= 512;
            this.H = 0.0f;
        }
        if (this.I != 0.0f) {
            this.x |= 1024;
            this.I = 0.0f;
        }
        if (this.J != 8.0f) {
            this.x |= 2048;
            this.J = 8.0f;
        }
        m(xh6.b);
        k(io3.h);
        e(false);
        f(null);
        if (!a34.i(this.T, null)) {
            this.x |= 262144;
            this.T = null;
        }
        if (this.U != 3) {
            this.x |= 524288;
            this.U = 3;
        }
        if (this.N != 0) {
            this.x |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
            this.N = 0;
        }
        ca3 ca3Var = ca3.a;
        if (!a34.i(this.P, ca3Var)) {
            this.x |= 1048576;
            this.P = ca3Var;
        }
        this.O = 9205357640488583168L;
        this.V = null;
        this.x = 0;
    }

    @Override // defpackage.ud1
    public final float b() {
        return this.Q.b();
    }

    public final void c(float f) {
        if (this.A == f) {
            return;
        }
        this.x |= 4;
        this.A = f;
    }

    public final void d(long j) {
        long j2 = this.E;
        int i = ep0.j;
        if (!cm6.a(j2, j)) {
            this.x |= 64;
            this.E = j;
        }
    }

    public final void e(boolean z) {
        if (this.M != z) {
            this.x |= 16384;
            this.M = z;
        }
    }

    public final void f(d70 d70Var) {
        if (!a34.i(this.S, d70Var)) {
            this.x |= 131072;
            this.S = d70Var;
        }
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return this.Q.getFontScale();
    }

    public final void h(float f) {
        if (this.y == f) {
            return;
        }
        this.x |= 1;
        this.y = f;
    }

    public final void i(float f) {
        if (this.z == f) {
            return;
        }
        this.x |= 2;
        this.z = f;
    }

    public final void j(float f) {
        if (this.D == f) {
            return;
        }
        this.x |= 32;
        this.D = f;
    }

    public final void k(om5 om5Var) {
        if (!a34.i(this.L, om5Var)) {
            this.x |= 8192;
            this.L = om5Var;
        }
    }

    public final void l(long j) {
        long j2 = this.F;
        int i = ep0.j;
        if (!cm6.a(j2, j)) {
            this.x |= 128;
            this.F = j;
        }
    }

    public final void m(long j) {
        if (!xh6.a(this.K, j)) {
            this.x |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
            this.K = j;
        }
    }

    public final void n(float f) {
        if (this.C == f) {
            return;
        }
        this.x |= 16;
        this.C = f;
    }
}
