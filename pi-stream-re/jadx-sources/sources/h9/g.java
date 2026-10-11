package h9;

import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class g implements l {
    @Override // h9.l
    public final boolean a(SSLSocket sSLSocket) {
        if (g9.d.f4498d.y() && (sSLSocket instanceof BCSSLSocket)) {
            return true;
        }
        return false;
    }

    @Override // h9.l
    public final n b(SSLSocket sSLSocket) {
        return new h();
    }
}
