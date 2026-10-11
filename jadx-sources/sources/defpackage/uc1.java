package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class uc1 implements hu5 {
    public final tc1 a;
    public hu5 b;

    public uc1(tc1 tc1Var) {
        this.a = tc1Var;
    }

    @Override // defpackage.hu5
    public final String a(SSLSocket sSLSocket) {
        hu5 d = d(sSLSocket);
        if (d != null) {
            return d.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.hu5
    public final void b(SSLSocket sSLSocket, String str, List list) {
        hu5 d = d(sSLSocket);
        if (d != null) {
            d.b(sSLSocket, str, list);
        }
    }

    @Override // defpackage.hu5
    public final boolean c(SSLSocket sSLSocket) {
        return this.a.c(sSLSocket);
    }

    public final synchronized hu5 d(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.c(sSLSocket)) {
                this.b = this.a.o(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // defpackage.hu5
    public final boolean isSupported() {
        return true;
    }
}
