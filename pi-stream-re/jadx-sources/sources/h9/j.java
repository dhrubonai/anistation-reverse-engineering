package h9;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements l {
    @Override // h9.l
    public final boolean a(SSLSocket sSLSocket) {
        boolean z9 = g9.g.f4502d;
        if (g9.e.b() && Conscrypt.isConscrypt(sSLSocket)) {
            return true;
        }
        return false;
    }

    @Override // h9.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
