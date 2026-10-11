package g9;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import f9.x;
import h9.m;
import h9.n;
import h9.o;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import r6.h0;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: e, reason: collision with root package name */
    public static final x f4494e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f4495f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4496c;

    /* renamed from: d, reason: collision with root package name */
    public final h9.i f4497d;

    static {
        boolean z9 = false;
        z9 = false;
        f4494e = new x(4, z9 ? 1 : 0);
        if (x.x() && Build.VERSION.SDK_INT < 30) {
            z9 = true;
        }
        f4495f = z9;
    }

    public c() {
        o oVar;
        Method method;
        Method method2;
        n[] nVarArr = new n[4];
        Method method3 = null;
        try {
            oVar = new o(Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl")), Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl")), Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl")));
        } catch (Exception e10) {
            l.f4517a.getClass();
            l.i(5, "unable to load android socket classes", e10);
            oVar = null;
        }
        nVarArr[0] = oVar;
        nVarArr[1] = new m(h9.f.f5165f);
        nVarArr[2] = new m(h9.k.f5176a.w());
        nVarArr[3] = new m(h9.h.f5171a.w());
        ArrayList l12 = x6.i.l1(nVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = l12.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f4496c = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f4497d = new h9.i(method3, method2, method);
    }

    @Override // g9.l
    public final w7.b b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        h9.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new h9.b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (bVar == null) {
            return new j9.a(c(x509TrustManager));
        }
        return bVar;
    }

    @Override // g9.l
    public final j9.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // g9.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        h0.u(list, "protocols");
        Iterator it = this.f4496c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((n) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // g9.l
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        h0.u(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    @Override // g9.l
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f4496c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((n) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar == null) {
            return null;
        }
        return nVar.b(sSLSocket);
    }

    @Override // g9.l
    public final Object g() {
        h9.i iVar = this.f4497d;
        iVar.getClass();
        Method method = iVar.f5173a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = iVar.f5174b;
            h0.q(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // g9.l
    public final boolean h(String str) {
        boolean isCleartextTrafficPermitted;
        h0.u(str, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
            return isCleartextTrafficPermitted;
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // g9.l
    public final void j(Object obj, String str) {
        h0.u(str, "message");
        h9.i iVar = this.f4497d;
        iVar.getClass();
        boolean z9 = false;
        if (obj != null) {
            try {
                Method method = iVar.f5175c;
                h0.q(method);
                method.invoke(obj, new Object[0]);
                z9 = true;
            } catch (Exception unused) {
            }
        }
        if (!z9) {
            l.i(5, str, null);
        }
    }
}
