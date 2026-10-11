package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ax0 implements tc1 {
    @Override // defpackage.tc1
    public final boolean c(SSLSocket sSLSocket) {
        if (zw0.d && Conscrypt.isConscrypt(sSLSocket)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hu5, java.lang.Object] */
    @Override // defpackage.tc1
    public final hu5 o(SSLSocket sSLSocket) {
        return new Object();
    }
}
