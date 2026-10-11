package c9;

import androidx.lifecycle.q0;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import r6.h0;
import x6.o;
import y8.g0;
import y8.q;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final y8.a f2160a;

    /* renamed from: b, reason: collision with root package name */
    public final f8.h f2161b;

    /* renamed from: c, reason: collision with root package name */
    public final y8.d f2162c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f2163d;

    /* renamed from: e, reason: collision with root package name */
    public List f2164e;

    /* renamed from: f, reason: collision with root package name */
    public int f2165f;

    /* renamed from: g, reason: collision with root package name */
    public List f2166g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2167h;

    public n(y8.a aVar, f8.h hVar, i iVar, q0 q0Var) {
        boolean z9;
        List w9;
        h0.u(aVar, "address");
        h0.u(hVar, "routeDatabase");
        h0.u(iVar, "call");
        h0.u(q0Var, "eventListener");
        this.f2160a = aVar;
        this.f2161b = hVar;
        this.f2162c = iVar;
        this.f2163d = q0Var;
        o oVar = o.f11318a;
        this.f2164e = oVar;
        this.f2166g = oVar;
        this.f2167h = new ArrayList();
        q qVar = aVar.f11655i;
        h0.u(qVar, "url");
        Proxy proxy = aVar.f11653g;
        if (proxy != null) {
            w9 = com.bumptech.glide.c.L(proxy);
        } else {
            URI f10 = qVar.f();
            if (f10.getHost() == null) {
                w9 = z8.b.k(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = aVar.f11654h.select(f10);
                if (select != null && !select.isEmpty()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    w9 = z8.b.k(Proxy.NO_PROXY);
                } else {
                    h0.s(select, "proxiesOrNull");
                    w9 = z8.b.w(select);
                }
            }
        }
        this.f2164e = w9;
        this.f2165f = 0;
    }

    public final boolean a() {
        boolean z9;
        if (this.f2165f < this.f2164e.size()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 || (!this.f2167h.isEmpty())) {
            return true;
        }
        return false;
    }

    public final d0.h b() {
        boolean z9;
        boolean z10;
        String str;
        int i10;
        List B;
        boolean contains;
        if (a()) {
            ArrayList arrayList = new ArrayList();
            do {
                boolean z11 = false;
                if (this.f2165f < this.f2164e.size()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    break;
                }
                if (this.f2165f < this.f2164e.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y8.a aVar = this.f2160a;
                if (z10) {
                    List list = this.f2164e;
                    int i11 = this.f2165f;
                    this.f2165f = i11 + 1;
                    Proxy proxy = (Proxy) list.get(i11);
                    ArrayList arrayList2 = new ArrayList();
                    this.f2166g = arrayList2;
                    if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                        SocketAddress address = proxy.address();
                        if (address instanceof InetSocketAddress) {
                            h0.s(address, "proxyAddress");
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                            InetAddress address2 = inetSocketAddress.getAddress();
                            if (address2 == null) {
                                str = inetSocketAddress.getHostName();
                                h0.s(str, "hostName");
                            } else {
                                str = address2.getHostAddress();
                                h0.s(str, "address.hostAddress");
                            }
                            i10 = inetSocketAddress.getPort();
                        } else {
                            throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                        }
                    } else {
                        q qVar = aVar.f11655i;
                        str = qVar.f11783d;
                        i10 = qVar.f11784e;
                    }
                    if (1 <= i10 && i10 < 65536) {
                        z11 = true;
                    }
                    if (z11) {
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            arrayList2.add(InetSocketAddress.createUnresolved(str, i10));
                        } else {
                            byte[] bArr = z8.b.f12133a;
                            h0.u(str, "<this>");
                            o7.d dVar = z8.b.f12138f;
                            dVar.getClass();
                            if (dVar.f8324a.matcher(str).matches()) {
                                B = com.bumptech.glide.c.L(InetAddress.getByName(str));
                            } else {
                                this.f2163d.getClass();
                                h0.u(this.f2162c, "call");
                                B = ((q0) aVar.f11647a).B(str);
                                if (B.isEmpty()) {
                                    throw new UnknownHostException(aVar.f11647a + " returned no addresses for " + str);
                                }
                            }
                            Iterator it = B.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i10));
                            }
                        }
                        Iterator it2 = this.f2166g.iterator();
                        while (it2.hasNext()) {
                            g0 g0Var = new g0(this.f2160a, proxy, (InetSocketAddress) it2.next());
                            f8.h hVar = this.f2161b;
                            synchronized (hVar) {
                                contains = ((Set) hVar.f3961a).contains(g0Var);
                            }
                            if (contains) {
                                this.f2167h.add(g0Var);
                            } else {
                                arrayList.add(g0Var);
                            }
                        }
                    } else {
                        throw new SocketException("No route to " + str + ':' + i10 + "; port is out of range");
                    }
                } else {
                    throw new SocketException("No route to " + aVar.f11655i.f11783d + "; exhausted proxy configurations: " + this.f2164e);
                }
            } while (!(!arrayList.isEmpty()));
            if (arrayList.isEmpty()) {
                x6.l.p0(this.f2167h, arrayList);
                this.f2167h.clear();
            }
            return new d0.h(arrayList);
        }
        throw new NoSuchElementException();
    }
}
