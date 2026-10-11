package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class bx0 implements hu5 {
    public static final ax0 a = new Object();

    @Override // defpackage.hu5
    public final String a(SSLSocket sSLSocket) {
        if (c(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.hu5
    public final void b(SSLSocket sSLSocket, String str, List list) {
        if (c(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            lm4 lm4Var = lm4.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) m18.K(list).toArray(new String[0]));
        }
    }

    @Override // defpackage.hu5
    public final boolean c(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.hu5
    public final boolean isSupported() {
        boolean z = zw0.d;
        return zw0.d;
    }
}
