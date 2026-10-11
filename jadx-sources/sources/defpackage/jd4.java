package defpackage;

import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class jd4 implements Cloneable {
    public static final List X = dq6.k(iw4.HTTP_2, iw4.HTTP_1_1);
    public static final List Y = dq6.k(jw0.e, jw0.f);
    public final List A;
    public final p65 B;
    public final boolean C;
    public final l68 D;
    public final boolean E;
    public final boolean F;
    public final l68 G;
    public final l68 H;
    public final ProxySelector I;
    public final l68 J;
    public final SocketFactory K;
    public final SSLSocketFactory L;
    public final X509TrustManager M;
    public final List N;
    public final List O;
    public final HostnameVerifier P;
    public final ej0 Q;
    public final nx7 R;
    public final int S;
    public final int T;
    public final int U;
    public final short V;
    public final sn3 W;
    public final nh1 x;
    public final cn7 y;
    public final List z;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017b  */
    /* JADX WARN: Type inference failed for: r1v7, types: [short, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jd4(defpackage.id4 r7) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd4.<init>(id4):void");
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [short, int] */
    public final id4 a() {
        id4 id4Var = new id4();
        id4Var.a = this.x;
        id4Var.b = this.y;
        dp0.Y(this.z, id4Var.c);
        dp0.Y(this.A, id4Var.d);
        id4Var.e = this.B;
        id4Var.f = this.C;
        id4Var.g = this.D;
        id4Var.h = this.E;
        id4Var.i = this.F;
        id4Var.j = this.G;
        id4Var.k = this.H;
        id4Var.l = this.I;
        id4Var.m = this.J;
        id4Var.n = this.K;
        id4Var.o = this.L;
        id4Var.p = this.M;
        id4Var.q = this.N;
        id4Var.r = this.O;
        id4Var.s = this.P;
        id4Var.t = this.Q;
        id4Var.u = this.R;
        id4Var.v = this.S;
        id4Var.w = this.T;
        id4Var.x = this.U;
        id4Var.y = this.V;
        id4Var.z = this.W;
        return id4Var;
    }

    public final Object clone() {
        return super.clone();
    }

    public jd4() {
        this(new id4());
    }
}
