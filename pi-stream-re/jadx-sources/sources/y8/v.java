package y8;

import androidx.lifecycle.q0;
import c1.i0;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class v {
    public final int A;
    public final long B;
    public final f8.h C;

    /* renamed from: a, reason: collision with root package name */
    public final i0 f11805a;

    /* renamed from: b, reason: collision with root package name */
    public final f8.h f11806b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11807c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11808d;

    /* renamed from: e, reason: collision with root package name */
    public final w.f f11809e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11810f;

    /* renamed from: g, reason: collision with root package name */
    public final b f11811g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11812h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11813i;

    /* renamed from: j, reason: collision with root package name */
    public final l f11814j;

    /* renamed from: k, reason: collision with root package name */
    public final m f11815k;

    /* renamed from: l, reason: collision with root package name */
    public final Proxy f11816l;

    /* renamed from: m, reason: collision with root package name */
    public final ProxySelector f11817m;

    /* renamed from: n, reason: collision with root package name */
    public final b f11818n;
    public final SocketFactory o;

    /* renamed from: p, reason: collision with root package name */
    public final SSLSocketFactory f11819p;

    /* renamed from: q, reason: collision with root package name */
    public final X509TrustManager f11820q;

    /* renamed from: r, reason: collision with root package name */
    public final List f11821r;

    /* renamed from: s, reason: collision with root package name */
    public final List f11822s;

    /* renamed from: t, reason: collision with root package name */
    public final HostnameVerifier f11823t;

    /* renamed from: u, reason: collision with root package name */
    public final f f11824u;

    /* renamed from: v, reason: collision with root package name */
    public final w7.b f11825v;

    /* renamed from: w, reason: collision with root package name */
    public final int f11826w;

    /* renamed from: x, reason: collision with root package name */
    public int f11827x;

    /* renamed from: y, reason: collision with root package name */
    public int f11828y;

    /* renamed from: z, reason: collision with root package name */
    public int f11829z;

    public v() {
        this.f11805a = new i0();
        this.f11806b = new f8.h(5);
        this.f11807c = new ArrayList();
        this.f11808d = new ArrayList();
        q0 q0Var = q0.f1136z;
        byte[] bArr = z8.b.f12133a;
        this.f11809e = new w.f(q0Var, 27);
        this.f11810f = true;
        q0 q0Var2 = b.f11662t;
        this.f11811g = q0Var2;
        this.f11812h = true;
        this.f11813i = true;
        this.f11814j = l.f11764u;
        this.f11815k = m.f11765v;
        this.f11818n = q0Var2;
        SocketFactory socketFactory = SocketFactory.getDefault();
        r6.h0.s(socketFactory, "getDefault()");
        this.o = socketFactory;
        this.f11821r = w.V;
        this.f11822s = w.U;
        this.f11823t = j9.c.f6280a;
        this.f11824u = f.f11708c;
        this.f11827x = 10000;
        this.f11828y = 10000;
        this.f11829z = 10000;
        this.B = 1024L;
    }

    public final void a(long j4, TimeUnit timeUnit) {
        r6.h0.u(timeUnit, "unit");
        this.f11827x = z8.b.b(j4, timeUnit);
    }

    public final void b(long j4, TimeUnit timeUnit) {
        r6.h0.u(timeUnit, "unit");
        this.f11828y = z8.b.b(j4, timeUnit);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(w wVar) {
        this();
        r6.h0.u(wVar, "okHttpClient");
        this.f11805a = wVar.f11830a;
        this.f11806b = wVar.f11831b;
        x6.l.p0(wVar.f11832c, this.f11807c);
        x6.l.p0(wVar.f11833d, this.f11808d);
        this.f11809e = wVar.f11834e;
        this.f11810f = wVar.f11835f;
        this.f11811g = wVar.f11836x;
        this.f11812h = wVar.f11837y;
        this.f11813i = wVar.f11838z;
        this.f11814j = wVar.A;
        this.f11815k = wVar.B;
        this.f11816l = wVar.C;
        this.f11817m = wVar.D;
        this.f11818n = wVar.E;
        this.o = wVar.F;
        this.f11819p = wVar.G;
        this.f11820q = wVar.H;
        this.f11821r = wVar.I;
        this.f11822s = wVar.J;
        this.f11823t = wVar.K;
        this.f11824u = wVar.L;
        this.f11825v = wVar.M;
        this.f11826w = wVar.N;
        this.f11827x = wVar.O;
        this.f11828y = wVar.P;
        this.f11829z = wVar.Q;
        this.A = wVar.R;
        this.B = wVar.S;
        this.C = wVar.T;
    }
}
