package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class kw0 {
    public final List a;
    public int b;
    public boolean c;
    public boolean d;

    public kw0(List list) {
        this.a = list;
    }

    public final jw0 a(SSLSocket sSLSocket) {
        jw0 jw0Var;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i = this.b;
        List list = this.a;
        int size = list.size();
        while (true) {
            if (i < size) {
                jw0Var = (jw0) list.get(i);
                if (jw0Var.b(sSLSocket)) {
                    this.b = i + 1;
                    break;
                }
                i++;
            } else {
                jw0Var = null;
                break;
            }
        }
        if (jw0Var != null) {
            int i2 = this.b;
            int size2 = list.size();
            while (true) {
                if (i2 < size2) {
                    if (((jw0) list.get(i2)).b(sSLSocket)) {
                        z = true;
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            this.c = z;
            boolean z2 = this.d;
            String[] strArr = jw0Var.d;
            String[] strArr2 = jw0Var.c;
            if (strArr2 != null) {
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                enabledCipherSuites2.getClass();
                enabledCipherSuites = dq6.o(enabledCipherSuites2, strArr2, bm0.c);
            } else {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            if (strArr != null) {
                String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
                enabledProtocols2.getClass();
                enabledProtocols = dq6.o(enabledProtocols2, strArr, v64.y);
            } else {
                enabledProtocols = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            supportedCipherSuites.getClass();
            k82 k82Var = bm0.c;
            byte[] bArr = dq6.a;
            int length = supportedCipherSuites.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    if (k82Var.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (z2 && i3 != -1) {
                enabledCipherSuites.getClass();
                String str = supportedCipherSuites[i3];
                str.getClass();
                enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
                enabledCipherSuites[enabledCipherSuites.length - 1] = str;
            }
            pn0 pn0Var = new pn0(false);
            pn0Var.y = jw0Var.a;
            pn0Var.A = strArr2;
            pn0Var.B = strArr;
            pn0Var.z = jw0Var.b;
            enabledCipherSuites.getClass();
            pn0Var.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
            enabledProtocols.getClass();
            pn0Var.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
            jw0 a = pn0Var.a();
            if (a.c() != null) {
                sSLSocket.setEnabledProtocols(a.d);
            }
            if (a.a() != null) {
                sSLSocket.setEnabledCipherSuites(a.c);
            }
            return jw0Var;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.d);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
        enabledProtocols3.getClass();
        String arrays = Arrays.toString(enabledProtocols3);
        arrays.getClass();
        sb.append(", supported protocols=");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }
}
