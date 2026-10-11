package h9;

import f9.x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import r6.h0;

/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final e f5165f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f5166a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f5167b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f5168c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f5169d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f5170e;

    public f(Class cls) {
        this.f5166a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        h0.s(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f5167b = declaredMethod;
        this.f5168c = cls.getMethod("setHostname", String.class);
        this.f5169d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f5170e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // h9.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f5166a.isInstance(sSLSocket);
    }

    @Override // h9.n
    public final String b(SSLSocket sSLSocket) {
        if (!this.f5166a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f5169d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, o7.a.f8311a);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && h0.g(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // h9.n
    public final boolean c() {
        return g9.c.f4494e.y();
    }

    @Override // h9.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h0.u(list, "protocols");
        if (this.f5166a.isInstance(sSLSocket)) {
            try {
                this.f5167b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f5168c.invoke(sSLSocket, str);
                }
                Method method = this.f5170e;
                g9.l lVar = g9.l.f4517a;
                method.invoke(sSLSocket, x.t(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
