package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class md extends lm4 {
    public static final boolean e;
    public final ArrayList c;
    public final dn0 d;

    static {
        boolean z = false;
        if (m18.N() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public md() {
        pe peVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            peVar = new pe(cls);
        } catch (Exception e2) {
            lm4.a.getClass();
            lm4.i("unable to load android socket classes", 5, e2);
            peVar = null;
        }
        int i = 0;
        ArrayList H0 = ms.H0(new hu5[]{peVar, new uc1(pe.f), new uc1(bx0.a), new uc1(r80.a)});
        ArrayList arrayList = new ArrayList();
        int size = H0.size();
        while (i < size) {
            Object obj = H0.get(i);
            i++;
            if (((hu5) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new dn0((Object) method3, (Object) method2, (Object) method, (byte) 11);
    }

    @Override // defpackage.lm4
    public final nx7 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        v9 v9Var = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            v9Var = new v9(x509TrustManager, x509TrustManagerExtensions);
        }
        if (v9Var != null) {
            return v9Var;
        }
        return new b40(c(x509TrustManager));
    }

    @Override // defpackage.lm4
    public final fk6 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new ld(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.lm4
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                if (((hu5) obj).c(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        hu5 hu5Var = (hu5) obj;
        if (hu5Var != null) {
            hu5Var.b(sSLSocket, str, list);
        }
    }

    @Override // defpackage.lm4
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    @Override // defpackage.lm4
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                if (((hu5) obj).c(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        hu5 hu5Var = (hu5) obj;
        if (hu5Var == null) {
            return null;
        }
        return hu5Var.a(sSLSocket);
    }

    @Override // defpackage.lm4
    public final Object g() {
        dn0 dn0Var = this.d;
        dn0Var.getClass();
        Method method = (Method) dn0Var.y;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = (Method) dn0Var.z;
                method2.getClass();
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.lm4
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.lm4
    public final void j(Object obj, String str) {
        dn0 dn0Var = this.d;
        dn0Var.getClass();
        if (obj != null) {
            try {
                Method method = (Method) dn0Var.A;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        lm4.i(str, 5, null);
    }
}
