package c9;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import r6.h0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f2092a;

    /* renamed from: b, reason: collision with root package name */
    public int f2093b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2094c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2095d;

    public b(List list) {
        h0.u(list, "connectionSpecs");
        this.f2092a = list;
    }

    public final y8.i a(SSLSocket sSLSocket) {
        y8.i iVar;
        boolean z9;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        boolean z10;
        int i10 = this.f2093b;
        List list = this.f2092a;
        int size = list.size();
        while (true) {
            if (i10 < size) {
                iVar = (y8.i) list.get(i10);
                if (iVar.b(sSLSocket)) {
                    this.f2093b = i10 + 1;
                    break;
                }
                i10++;
            } else {
                iVar = null;
                break;
            }
        }
        if (iVar != null) {
            int i11 = this.f2093b;
            int size2 = list.size();
            while (true) {
                if (i11 < size2) {
                    if (((y8.i) list.get(i11)).b(sSLSocket)) {
                        z9 = true;
                        break;
                    }
                    i11++;
                } else {
                    z9 = false;
                    break;
                }
            }
            this.f2094c = z9;
            boolean z11 = this.f2095d;
            String[] strArr = iVar.f11748c;
            if (strArr != null) {
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                h0.s(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
                enabledCipherSuites = z8.b.o(enabledCipherSuites2, strArr, y8.g.f11712c);
            } else {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr2 = iVar.f11749d;
            if (strArr2 != null) {
                String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
                h0.s(enabledProtocols2, "sslSocket.enabledProtocols");
                enabledProtocols = z8.b.o(enabledProtocols2, strArr2, y6.a.f11633a);
            } else {
                enabledProtocols = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            h0.s(supportedCipherSuites, "supportedCipherSuites");
            u.f fVar = y8.g.f11712c;
            byte[] bArr = z8.b.f12133a;
            int length = supportedCipherSuites.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (fVar.compare(supportedCipherSuites[i12], "TLS_FALLBACK_SCSV") == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (z11 && i12 != -1) {
                h0.s(enabledCipherSuites, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i12];
                h0.s(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
                h0.s(copyOf, "copyOf(this, newSize)");
                enabledCipherSuites = (String[]) copyOf;
                enabledCipherSuites[enabledCipherSuites.length - 1] = str;
            }
            y8.h hVar = new y8.h(iVar);
            h0.s(enabledCipherSuites, "cipherSuitesIntersection");
            hVar.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
            h0.s(enabledProtocols, "tlsVersionsIntersection");
            hVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
            y8.i a10 = hVar.a();
            if (a10.c() != null) {
                sSLSocket.setEnabledProtocols(a10.f11749d);
            }
            if (a10.a() != null) {
                sSLSocket.setEnabledCipherSuites(a10.f11748c);
            }
            return iVar;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f2095d);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
        h0.q(enabledProtocols3);
        String arrays = Arrays.toString(enabledProtocols3);
        h0.s(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }
}
