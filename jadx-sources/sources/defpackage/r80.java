package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class r80 implements hu5 {
    public static final q80 a = new Object();

    @Override // defpackage.hu5
    public final String a(SSLSocket sSLSocket) {
        boolean equals;
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null) {
            equals = true;
        } else {
            equals = applicationProtocol.equals("");
        }
        if (equals) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.hu5
    public final void b(SSLSocket sSLSocket, String str, List list) {
        if (c(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            lm4 lm4Var = lm4.a;
            parameters.setApplicationProtocols((String[]) m18.K(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // defpackage.hu5
    public final boolean c(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.hu5
    public final boolean isSupported() {
        boolean z = p80.d;
        return p80.d;
    }
}
