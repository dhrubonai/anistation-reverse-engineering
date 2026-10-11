package defpackage;

import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class g43 extends lm4 {
    public static final boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0.intValue() >= 9) goto L10;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 == 0) goto L10
            r2 = 10
            java.lang.Integer r0 = defpackage.b06.J(r2, r0)
            goto L11
        L10:
            r0 = r1
        L11:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1f
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L27
        L1d:
            r2 = r3
            goto L27
        L1f:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L27
            goto L1d
        L27:
            defpackage.g43.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g43.<clinit>():void");
    }

    @Override // defpackage.lm4
    public final void d(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((iw4) obj) != iw4.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(zo0.V(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((iw4) obj2).x);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // defpackage.lm4
    public final String f(SSLSocket sSLSocket) {
        boolean equals;
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                equals = true;
            } else {
                equals = applicationProtocol.equals("");
            }
            if (!equals) {
                return applicationProtocol;
            }
            return null;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
