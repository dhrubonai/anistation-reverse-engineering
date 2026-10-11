package y8;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11750a;

    public /* synthetic */ j(int i10) {
        this.f11750a = i10;
    }

    public static final d0 a(d0 d0Var) {
        f0 f0Var;
        int i10 = a9.a.f207a;
        if (d0Var != null) {
            f0Var = d0Var.f11697x;
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            d0Var.getClass();
            c0 c0Var = new c0(d0Var);
            c0Var.f11684g = null;
            return c0Var.a();
        }
        return d0Var;
    }

    public static void b(StringBuilder sb, String str) {
        r6.h0.u(str, "key");
        sb.append('\"');
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\"');
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static String c(String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, int i12) {
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        String str3;
        boolean z18;
        char[] cArr = q.f11779k;
        ?? r32 = 0;
        if ((i12 & 1) != 0) {
            i13 = 0;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i14 = str.length();
        } else {
            i14 = i11;
        }
        if ((i12 & 8) != 0) {
            z13 = false;
        } else {
            z13 = z9;
        }
        if ((i12 & 16) != 0) {
            z14 = false;
        } else {
            z14 = z10;
        }
        if ((i12 & 32) != 0) {
            z15 = false;
        } else {
            z15 = z11;
        }
        if ((i12 & 64) != 0) {
            z16 = false;
        } else {
            z16 = z12;
        }
        r6.h0.u(str, "<this>");
        int i15 = i13;
        while (i15 < i14) {
            int codePointAt = str.codePointAt(i15);
            int i16 = 127;
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z16)) {
                if (o7.j.p1(str2, (char) codePointAt, 0, false, 2) >= 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (!z18 && ((codePointAt != 37 || (z13 && (!z14 || o(i15, i14, str)))) && (codePointAt != 43 || !z15))) {
                    i15 += Character.charCount(codePointAt);
                }
            }
            k9.g gVar = new k9.g();
            gVar.P(i13, i15, str);
            k9.g gVar2 = null;
            while (i15 < i14) {
                int codePointAt2 = str.codePointAt(i15);
                if (!z13 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                    if (codePointAt2 == 43 && z15) {
                        if (z13) {
                            str3 = "+";
                        } else {
                            str3 = "%2B";
                        }
                        gVar.Q(str3);
                    } else {
                        if (codePointAt2 >= 32 && codePointAt2 != i16) {
                            if (codePointAt2 < 128 || z16) {
                                if (o7.j.p1(str2, (char) codePointAt2, r32, r32, 2) >= 0) {
                                    z17 = true;
                                } else {
                                    z17 = r32;
                                }
                                if (!z17 && (codePointAt2 != 37 || (z13 && (!z14 || o(i15, i14, str))))) {
                                    gVar.R(codePointAt2);
                                    i15 += Character.charCount(codePointAt2);
                                    r32 = 0;
                                    i16 = 127;
                                }
                            }
                        }
                        if (gVar2 == null) {
                            gVar2 = new k9.g();
                        }
                        gVar2.R(codePointAt2);
                        while (!gVar2.n()) {
                            int readByte = gVar2.readByte() & 255;
                            gVar.K(37);
                            char[] cArr2 = q.f11779k;
                            gVar.K(cArr2[(readByte >> 4) & 15]);
                            gVar.K(cArr2[readByte & 15]);
                        }
                        i15 += Character.charCount(codePointAt2);
                        r32 = 0;
                        i16 = 127;
                    }
                }
                i15 += Character.charCount(codePointAt2);
                r32 = 0;
                i16 = 127;
            }
            return gVar.x(gVar.f6521b, o7.a.f8311a);
        }
        String substring = str.substring(i13, i14);
        r6.h0.s(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static void d(String str) {
        boolean z9;
        boolean z10;
        if (str.length() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ('!' <= charAt && charAt < 127) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalArgumentException(z8.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064 A[LOOP:0: B:2:0x0006->B:13:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L67
            char r3 = r6.charAt(r2)
            r4 = 9
            r5 = 1
            if (r3 == r4) goto L21
            r4 = 32
            if (r4 > r3) goto L1b
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 >= r4) goto L1b
            r4 = r5
            goto L1c
        L1b:
            r4 = r1
        L1c:
            if (r4 == 0) goto L1f
            goto L21
        L1f:
            r4 = r1
            goto L22
        L21:
            r4 = r5
        L22:
            if (r4 != 0) goto L64
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r1] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r4[r5] = r1
            r1 = 2
            r4[r1] = r7
            java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
            java.lang.String r1 = z8.b.h(r1, r4)
            r0.append(r1)
            boolean r7 = z8.b.p(r7)
            if (r7 == 0) goto L4d
            java.lang.String r6 = ""
            goto L53
        L4d:
            java.lang.String r7 = ": "
            java.lang.String r6 = r7.concat(r6)
        L53:
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L64:
            int r2 = r2 + 1
            goto L6
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.j.e(java.lang.String, java.lang.String):void");
    }

    public static t f(String str, String str2, b0 b0Var) {
        boolean z9;
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=");
        s sVar = u.f11797f;
        b(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            b(sb, str2);
        }
        String sb2 = sb.toString();
        r6.h0.s(sb2, "StringBuilder().apply(builderAction).toString()");
        ArrayList arrayList = new ArrayList(20);
        d("Content-Disposition");
        arrayList.add("Content-Disposition");
        arrayList.add(o7.j.G1(sb2).toString());
        boolean z10 = false;
        o oVar = new o((String[]) arrayList.toArray(new String[0]));
        if (oVar.b("Content-Type") == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (oVar.b("Content-Length") == null) {
                z10 = true;
            }
            if (z10) {
                return new t(oVar, b0Var);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003b, code lost:
    
        if (r0 != ':') goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(int r5, int r6, java.lang.String r7, boolean r8) {
        /*
        L0:
            if (r5 >= r6) goto L46
            char r0 = r7.charAt(r5)
            r1 = 32
            r2 = 1
            if (r0 >= r1) goto Lf
            r1 = 9
            if (r0 != r1) goto L3d
        Lf:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L3d
            r1 = 48
            r3 = 58
            r4 = 0
            if (r1 > r0) goto L1e
            if (r0 >= r3) goto L1e
            r1 = r2
            goto L1f
        L1e:
            r1 = r4
        L1f:
            if (r1 != 0) goto L3d
            r1 = 97
            if (r1 > r0) goto L2b
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 >= r1) goto L2b
            r1 = r2
            goto L2c
        L2b:
            r1 = r4
        L2c:
            if (r1 != 0) goto L3d
            r1 = 65
            if (r1 > r0) goto L38
            r1 = 91
            if (r0 >= r1) goto L38
            r1 = r2
            goto L39
        L38:
            r1 = r4
        L39:
            if (r1 != 0) goto L3d
            if (r0 != r3) goto L3e
        L3d:
            r4 = r2
        L3e:
            r0 = r8 ^ 1
            if (r4 != r0) goto L43
            return r5
        L43:
            int r5 = r5 + 1
            goto L0
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.j.g(int, int, java.lang.String, boolean):int");
    }

    public static int h(String str) {
        r6.h0.u(str, "scheme");
        if (r6.h0.g(str, "http")) {
            return 80;
        }
        if (r6.h0.g(str, "https")) {
            return 443;
        }
        return -1;
    }

    public static h0 i(String str) {
        r6.h0.u(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return h0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return h0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return h0.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return h0.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return h0.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static y8.n j(javax.net.ssl.SSLSession r6) {
        /*
            x6.o r0 = x6.o.f11318a
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L7e
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r6.h0.g(r1, r2)
            r3 = 1
            if (r2 == 0) goto L13
            r2 = r3
            goto L19
        L13:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r6.h0.g(r1, r2)
        L19:
            if (r2 != 0) goto L72
            androidx.lifecycle.q0 r2 = y8.g.f11711b
            y8.g r1 = r2.x(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L66
            java.lang.String r4 = "NONE"
            boolean r4 = r6.h0.g(r4, r2)
            if (r4 != 0) goto L5e
            y8.h0 r2 = i(r2)
            java.security.cert.Certificate[] r4 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
            if (r4 == 0) goto L43
            int r5 = r4.length     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
            java.util.List r4 = z8.b.k(r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
            goto L44
        L43:
            r4 = r0
        L44:
            y8.n r5 = new y8.n
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L55
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.util.List r0 = z8.b.k(r6)
        L55:
            androidx.lifecycle.r0 r6 = new androidx.lifecycle.r0
            r6.<init>(r4, r3)
            r5.<init>(r2, r1, r0, r6)
            return r5
        L5e:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L66:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L72:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0)
            throw r6
        L7e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.j.j(javax.net.ssl.SSLSession):y8.n");
    }

    public static s k(String str) {
        r6.h0.u(str, "<this>");
        Matcher matcher = s.f11790d.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            r6.h0.s(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            r6.h0.s(locale, "US");
            String lowerCase = group.toLowerCase(locale);
            r6.h0.s(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            r6.h0.s(group2, "typeSubtype.group(2)");
            r6.h0.s(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = s.f11791e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group3 = matcher2.group(1);
                    if (group3 == null) {
                        end = matcher2.end();
                    } else {
                        String group4 = matcher2.group(2);
                        if (group4 == null) {
                            group4 = matcher2.group(3);
                        } else if (o7.j.C1(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            r6.h0.s(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        arrayList.add(group3);
                        arrayList.add(group4);
                        end = matcher2.end();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    r6.h0.s(substring, "this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            return new s(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
        }
        throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
    }

    public static x l(String str) {
        x xVar = x.HTTP_1_0;
        if (!r6.h0.g(str, "http/1.0")) {
            xVar = x.HTTP_1_1;
            if (!r6.h0.g(str, "http/1.1")) {
                xVar = x.H2_PRIOR_KNOWLEDGE;
                if (!r6.h0.g(str, "h2_prior_knowledge")) {
                    xVar = x.HTTP_2;
                    if (!r6.h0.g(str, "h2")) {
                        xVar = x.SPDY_3;
                        if (!r6.h0.g(str, "spdy/3.1")) {
                            xVar = x.QUIC;
                            if (!r6.h0.g(str, "quic")) {
                                throw new IOException("Unexpected protocol: ".concat(str));
                            }
                        }
                    }
                }
            }
        }
        return xVar;
    }

    public static boolean n(String str) {
        if (!o7.j.l1("Connection", str) && !o7.j.l1("Keep-Alive", str) && !o7.j.l1("Proxy-Authenticate", str) && !o7.j.l1("Proxy-Authorization", str) && !o7.j.l1("TE", str) && !o7.j.l1("Trailers", str) && !o7.j.l1("Transfer-Encoding", str) && !o7.j.l1("Upgrade", str)) {
            return true;
        }
        return false;
    }

    public static boolean o(int i10, int i11, String str) {
        int i12 = i10 + 2;
        if (i12 < i11 && str.charAt(i10) == '%' && z8.b.q(str.charAt(i10 + 1)) != -1 && z8.b.q(str.charAt(i12)) != -1) {
            return true;
        }
        return false;
    }

    public static int p(int i10, int i11, int i12) {
        if ((i11 & 8) != 0) {
            i10--;
        }
        if (i12 <= i10) {
            return i10 - i12;
        }
        throw new IOException(a3.g.p("PROTOCOL_ERROR padding ", i12, " > remaining length ", i10));
    }

    public static o q(String... strArr) {
        boolean z9;
        boolean z10;
        int i10 = 0;
        if (strArr.length % 2 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr2[i11];
                if (str != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    strArr2[i11] = o7.j.G1(str).toString();
                } else {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
            }
            int C = com.bumptech.glide.d.C(0, strArr2.length - 1, 2);
            if (C >= 0) {
                while (true) {
                    String str2 = strArr2[i10];
                    String str3 = strArr2[i10 + 1];
                    d(str2);
                    e(str3, str2);
                    if (i10 == C) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new o(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values".toString());
    }

    public static d9.h r(String str) {
        int i10;
        String str2;
        r6.h0.u(str, "statusLine");
        boolean C1 = o7.j.C1(str, "HTTP/1.", false);
        x xVar = x.HTTP_1_0;
        if (C1) {
            i10 = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        xVar = x.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (o7.j.C1(str, "ICY ", false)) {
            i10 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i11 = i10 + 3;
        if (str.length() >= i11) {
            try {
                String substring = str.substring(i10, i11);
                r6.h0.s(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() > i11) {
                    if (str.charAt(i11) == ' ') {
                        str2 = str.substring(i10 + 4);
                        r6.h0.s(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new d9.h(xVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    public static long s(int i10, String str) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int g10 = g(0, i10, str, false);
        Matcher matcher = k.f11754m.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        while (g10 < i10) {
            int g11 = g(g10 + 1, i10, str, true);
            matcher.region(g10, g11);
            if (i12 == -1 && matcher.usePattern(k.f11754m).matches()) {
                String group = matcher.group(1);
                r6.h0.s(group, "matcher.group(1)");
                i12 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                r6.h0.s(group2, "matcher.group(2)");
                i15 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                r6.h0.s(group3, "matcher.group(3)");
                i16 = Integer.parseInt(group3);
            } else if (i13 == -1 && matcher.usePattern(k.f11753l).matches()) {
                String group4 = matcher.group(1);
                r6.h0.s(group4, "matcher.group(1)");
                i13 = Integer.parseInt(group4);
            } else {
                if (i14 == -1) {
                    Pattern pattern = k.f11752k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        r6.h0.s(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        r6.h0.s(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        r6.h0.s(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        r6.h0.s(pattern2, "MONTH_PATTERN.pattern()");
                        i14 = o7.j.q1(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i11 == -1 && matcher.usePattern(k.f11751j).matches()) {
                    String group6 = matcher.group(1);
                    r6.h0.s(group6, "matcher.group(1)");
                    i11 = Integer.parseInt(group6);
                }
            }
            g10 = g(g11 + 1, i10, str, false);
        }
        if (70 <= i11 && i11 < 100) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 < 70) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 += 2000;
        }
        if (i11 >= 1601) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i14 != -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                if (1 <= i13 && i13 < 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    if (i12 >= 0 && i12 < 24) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        if (i15 >= 0 && i15 < 60) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            if (i16 >= 0 && i16 < 60) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(z8.b.f12137e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i11);
                                gregorianCalendar.set(2, i14 - 1);
                                gregorianCalendar.set(5, i13);
                                gregorianCalendar.set(11, i12);
                                gregorianCalendar.set(12, i15);
                                gregorianCalendar.set(13, i16);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static String t(String str, int i10, int i11, boolean z9, int i12) {
        int i13;
        char[] cArr = q.f11779k;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z9 = false;
        }
        r6.h0.u(str, "<this>");
        int i14 = i10;
        while (i14 < i11) {
            char charAt = str.charAt(i14);
            if (charAt != '%' && (charAt != '+' || !z9)) {
                i14++;
            } else {
                k9.g gVar = new k9.g();
                gVar.P(i10, i14, str);
                while (i14 < i11) {
                    int codePointAt = str.codePointAt(i14);
                    if (codePointAt == 37 && (i13 = i14 + 2) < i11) {
                        int q9 = z8.b.q(str.charAt(i14 + 1));
                        int q10 = z8.b.q(str.charAt(i13));
                        if (q9 != -1 && q10 != -1) {
                            gVar.K((q9 << 4) + q10);
                            i14 = Character.charCount(codePointAt) + i13;
                        }
                        gVar.R(codePointAt);
                        i14 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z9) {
                            gVar.K(32);
                            i14++;
                        }
                        gVar.R(codePointAt);
                        i14 += Character.charCount(codePointAt);
                    }
                }
                return gVar.x(gVar.f6521b, o7.a.f8311a);
            }
        }
        String substring = str.substring(i10, i11);
        r6.h0.s(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList u(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int p12 = o7.j.p1(str, '&', i10, false, 4);
            if (p12 == -1) {
                p12 = str.length();
            }
            int p13 = o7.j.p1(str, '=', i10, false, 4);
            if (p13 != -1 && p13 <= p12) {
                String substring = str.substring(i10, p13);
                r6.h0.s(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                String substring2 = str.substring(p13 + 1, p12);
                r6.h0.s(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
            } else {
                String substring3 = str.substring(i10, p12);
                r6.h0.s(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
                arrayList.add(null);
            }
            i10 = p12 + 1;
        }
        return arrayList;
    }

    public final Logger m() {
        switch (this.f11750a) {
            case 16:
                return b9.f.f1564j;
            default:
                return f9.w.f4103f;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, int i11) {
        this(29);
        this.f11750a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case zzaja.zze.zzg /* 7 */:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                return;
            default:
                this(0);
                return;
        }
    }
}
