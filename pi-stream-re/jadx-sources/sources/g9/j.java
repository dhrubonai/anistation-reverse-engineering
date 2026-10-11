package g9;

import f9.x;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import r6.h0;

/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f4513c;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r0.intValue() >= 9) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6d
            r3 = 10
            com.bumptech.glide.c.i(r3)
            int r4 = r0.length()
            if (r4 != 0) goto L17
            goto L6d
        L17:
            char r5 = r0.charAt(r2)
            r6 = 48
            int r6 = r6.h0.B(r5, r6)
            r7 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r6 >= 0) goto L38
            if (r4 != r1) goto L29
            goto L6d
        L29:
            r6 = 45
            if (r5 != r6) goto L31
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r1
            goto L39
        L31:
            r6 = 43
            if (r5 != r6) goto L6d
            r5 = r1
            r6 = r2
            goto L3a
        L38:
            r5 = r2
        L39:
            r6 = r5
        L3a:
            r8 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r9 = r2
            r10 = r8
        L3f:
            if (r5 >= r4) goto L60
            char r11 = r0.charAt(r5)
            int r11 = java.lang.Character.digit(r11, r3)
            if (r11 >= 0) goto L4c
            goto L6d
        L4c:
            if (r9 >= r10) goto L55
            if (r10 != r8) goto L6d
            int r10 = r7 / 10
            if (r9 >= r10) goto L55
            goto L6d
        L55:
            int r9 = r9 * 10
            int r12 = r7 + r11
            if (r9 >= r12) goto L5c
            goto L6d
        L5c:
            int r9 = r9 - r11
            int r5 = r5 + 1
            goto L3f
        L60:
            if (r6 == 0) goto L67
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L6e
        L67:
            int r0 = -r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L6e
        L6d:
            r0 = 0
        L6e:
            if (r0 == 0) goto L79
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L83
            goto L84
        L79:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L83
            r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L83
            goto L84
        L83:
            r1 = r2
        L84:
            g9.j.f4513c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.j.<clinit>():void");
    }

    @Override // g9.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h0.u(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) x.l(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // g9.l
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        boolean g10;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                g10 = true;
            } else {
                g10 = h0.g(applicationProtocol, "");
            }
        } catch (UnsupportedOperationException unused) {
        }
        if (g10) {
            return null;
        }
        return applicationProtocol;
    }
}
