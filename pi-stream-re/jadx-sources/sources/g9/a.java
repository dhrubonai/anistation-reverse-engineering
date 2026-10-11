package g9;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import f9.x;
import h9.m;
import h9.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import r6.h0;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: d, reason: collision with root package name */
    public static final x f4489d = new x(3, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f4490e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4491c;

    static {
        boolean z9 = false;
        if (x.x() && Build.VERSION.SDK_INT >= 29) {
            z9 = true;
        }
        f4490e = z9;
    }

    public a() {
        h9.a aVar;
        n[] nVarArr = new n[4];
        if (h9.a.f5158a.y()) {
            aVar = new h9.a();
        } else {
            aVar = null;
        }
        nVarArr[0] = aVar;
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
        this.f4491c = arrayList;
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
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        h0.u(list, "protocols");
        Iterator it = this.f4491c.iterator();
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
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f4491c.iterator();
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
    public final boolean h(String str) {
        boolean isCleartextTrafficPermitted;
        h0.u(str, "hostname");
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }
}
