package j9;

import a3.g;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import r6.h0;
import x6.o;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f6280a = new c();

    public static List a(X509Certificate x509Certificate, int i10) {
        Object obj;
        o oVar = o.f11318a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return oVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && h0.g(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return oVar;
        }
    }

    public static boolean b(String str) {
        boolean z9;
        boolean z10;
        int i10;
        char c6;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (length2 <= str.length()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                long j4 = 0;
                int i11 = 0;
                while (i11 < length2) {
                    char charAt = str.charAt(i11);
                    if (charAt < 128) {
                        j4++;
                    } else {
                        if (charAt < 2048) {
                            i10 = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i12 = i11 + 1;
                            if (i12 < length2) {
                                c6 = str.charAt(i12);
                            } else {
                                c6 = 0;
                            }
                            if (charAt <= 56319 && c6 >= 56320 && c6 <= 57343) {
                                j4 += 4;
                                i11 += 2;
                            } else {
                                j4++;
                                i11 = i12;
                            }
                        } else {
                            i10 = 3;
                        }
                        j4 += i10;
                    }
                    i11++;
                }
                if (length != ((int) j4)) {
                    return false;
                }
                return true;
            }
            StringBuilder u9 = g.u("endIndex > string.length: ", length2, " > ");
            u9.append(str.length());
            throw new IllegalArgumentException(u9.toString().toString());
        }
        throw new IllegalArgumentException(g.o("endIndex < beginIndex: ", length2, " < 0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[LOOP:1: B:24:0x006e->B:58:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        h0.u(str, "host");
        h0.u(sSLSession, "session");
        if (b(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                h0.r(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
                return false;
            }
        }
        return c(str, (X509Certificate) certificate);
    }
}
