package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class g9 extends lm4 {
    public static final boolean d = m18.N();
    public final ArrayList c;

    /* JADX WARN: Multi-variable type inference failed */
    public g9() {
        Object obj;
        if (m18.N()) {
            obj = new Object();
        } else {
            obj = null;
        }
        int i = 0;
        ArrayList H0 = ms.H0(new hu5[]{obj, new uc1(pe.f), new uc1(bx0.a), new uc1(r80.a)});
        ArrayList arrayList = new ArrayList();
        int size = H0.size();
        while (i < size) {
            Object obj2 = H0.get(i);
            i++;
            if (((hu5) obj2).isSupported()) {
                arrayList.add(obj2);
            }
        }
        this.c = arrayList;
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
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
