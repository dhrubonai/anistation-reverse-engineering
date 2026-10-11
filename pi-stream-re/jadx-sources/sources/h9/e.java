package h9;

import javax.net.ssl.SSLSocket;
import r6.h0;

/* loaded from: classes.dex */
public final class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5164a = "com.google.android.gms.org.conscrypt";

    @Override // h9.l
    public final boolean a(SSLSocket sSLSocket) {
        return o7.j.C1(sSLSocket.getClass().getName(), this.f5164a + '.', false);
    }

    @Override // h9.l
    public final n b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!h0.g(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(cls2);
    }
}
