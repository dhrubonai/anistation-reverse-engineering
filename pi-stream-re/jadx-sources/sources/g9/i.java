package g9;

import f9.x;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import r6.h0;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: h, reason: collision with root package name */
    public static final x f4507h = new x(6, 0);

    /* renamed from: c, reason: collision with root package name */
    public final Method f4508c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f4509d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f4510e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f4511f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f4512g;

    public i(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f4508c = method;
        this.f4509d = method2;
        this.f4510e = method3;
        this.f4511f = cls;
        this.f4512g = cls2;
    }

    @Override // g9.l
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f4510e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // g9.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h0.u(list, "protocols");
        try {
            this.f4508c.invoke(null, sSLSocket, Proxy.newProxyInstance(l.class.getClassLoader(), new Class[]{this.f4511f, this.f4512g}, new h(x.l(list))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // g9.l
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f4509d.invoke(null, sSLSocket));
            h0.r(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            h hVar = (h) invocationHandler;
            boolean z9 = hVar.f4505b;
            if (!z9 && hVar.f4506c == null) {
                l.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z9) {
                return null;
            }
            return hVar.f4506c;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
