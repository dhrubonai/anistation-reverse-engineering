package y8;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f11730a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f11731b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f11732c;

    public g0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        r6.h0.u(aVar, "address");
        r6.h0.u(inetSocketAddress, "socketAddress");
        this.f11730a = aVar;
        this.f11731b = proxy;
        this.f11732c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (r6.h0.g(g0Var.f11730a, this.f11730a) && r6.h0.g(g0Var.f11731b, this.f11731b) && r6.h0.g(g0Var.f11732c, this.f11732c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11732c.hashCode() + ((this.f11731b.hashCode() + ((this.f11730a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f11732c + '}';
    }
}
