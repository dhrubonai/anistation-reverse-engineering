package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class b40 extends nx7 {
    public final fk6 E;

    public b40(fk6 fk6Var) {
        fk6Var.getClass();
        this.E = fk6Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof b40) && a34.i(((b40) obj).E, this.E)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    @Override // defpackage.nx7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List t(java.lang.String r8, java.util.List r9) {
        /*
            r7 = this;
            r9.getClass()
            r8.getClass()
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r0 = r8.removeFirst()
            r0.getClass()
            r9.add(r0)
            r0 = 0
            r1 = r0
        L1c:
            r2 = 9
            if (r0 >= r2) goto Lab
            int r2 = r9.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r9.get(r2)
            r2.getClass()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            fk6 r4 = r7.E
            java.security.cert.X509Certificate r4 = r4.a(r2)
            if (r4 == 0) goto L5f
            int r1 = r9.size()
            if (r1 > r3) goto L43
            boolean r1 = r2.equals(r4)
            if (r1 != 0) goto L46
        L43:
            r9.add(r4)
        L46:
            java.security.Principal r1 = r4.getIssuerDN()
            java.security.Principal r2 = r4.getSubjectDN()
            boolean r1 = defpackage.a34.i(r1, r2)
            if (r1 != 0) goto L55
            goto L5d
        L55:
            java.security.PublicKey r1 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L5d
            r4.verify(r1)     // Catch: java.security.GeneralSecurityException -> L5d
            goto L96
        L5d:
            r1 = r3
            goto L91
        L5f:
            java.util.Iterator r3 = r8.iterator()
            r3.getClass()
        L66:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L94
            java.lang.Object r4 = r3.next()
            r4.getClass()
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            java.security.Principal r5 = r2.getIssuerDN()
            java.security.Principal r6 = r4.getSubjectDN()
            boolean r5 = defpackage.a34.i(r5, r6)
            if (r5 != 0) goto L84
            goto L66
        L84:
            java.security.PublicKey r5 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L66
            r2.verify(r5)     // Catch: java.security.GeneralSecurityException -> L66
            r3.remove()
            r9.add(r4)
        L91:
            int r0 = r0 + 1
            goto L1c
        L94:
            if (r1 == 0) goto L97
        L96:
            return r9
        L97:
            javax.net.ssl.SSLPeerUnverifiedException r7 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to find a trusted cert that signed "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Lab:
            javax.net.ssl.SSLPeerUnverifiedException r7 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Certificate chain too long: "
            r8.<init>(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b40.t(java.lang.String, java.util.List):java.util.List");
    }
}
