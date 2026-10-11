package j9;

import r6.h0;

/* loaded from: classes.dex */
public final class a extends w7.b {

    /* renamed from: u, reason: collision with root package name */
    public final d f6278u;

    public a(d dVar) {
        h0.u(dVar, "trustRootIndex");
        this.f6278u = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[LOOP:1: B:26:0x0076->B:38:?, LOOP_END, SYNTHETIC] */
    @Override // w7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A(java.lang.String r11, java.util.List r12) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            r6.h0.u(r12, r0)
            java.lang.String r0 = "hostname"
            r6.h0.u(r11, r0)
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            r11.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.Object r0 = r11.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            r6.h0.s(r0, r1)
            r12.add(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L23:
            r3 = 9
            if (r1 >= r3) goto Lc1
            int r3 = r12.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r12.get(r3)
            java.lang.String r5 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r6.h0.r(r3, r5)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            j9.d r6 = r10.f6278u
            java.security.cert.X509Certificate r6 = r6.a(r3)
            if (r6 == 0) goto L6d
            int r2 = r12.size()
            if (r2 > r4) goto L4c
            boolean r2 = r6.h0.g(r3, r6)
            if (r2 != 0) goto L4f
        L4c:
            r12.add(r6)
        L4f:
            java.security.Principal r2 = r6.getIssuerDN()
            java.security.Principal r3 = r6.getSubjectDN()
            boolean r2 = r6.h0.g(r2, r3)
            if (r2 != 0) goto L5e
            goto L67
        L5e:
            java.security.PublicKey r2 = r6.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L67
            r6.verify(r2)     // Catch: java.security.GeneralSecurityException -> L67
            r2 = r4
            goto L68
        L67:
            r2 = r0
        L68:
            if (r2 == 0) goto L6b
            return r12
        L6b:
            r2 = r4
            goto La6
        L6d:
            java.util.Iterator r6 = r11.iterator()
            java.lang.String r7 = "queue.iterator()"
            r6.h0.s(r6, r7)
        L76:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Laa
            java.lang.Object r7 = r6.next()
            r6.h0.r(r7, r5)
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.security.Principal r8 = r3.getIssuerDN()
            java.security.Principal r9 = r7.getSubjectDN()
            boolean r8 = r6.h0.g(r8, r9)
            if (r8 != 0) goto L94
            goto L9d
        L94:
            java.security.PublicKey r8 = r7.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L9d
            r3.verify(r8)     // Catch: java.security.GeneralSecurityException -> L9d
            r8 = r4
            goto L9e
        L9d:
            r8 = r0
        L9e:
            if (r8 == 0) goto L76
            r6.remove()
            r12.add(r7)
        La6:
            int r1 = r1 + 1
            goto L23
        Laa:
            if (r2 == 0) goto Lad
            return r12
        Lad:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r12.<init>(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lc1:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Certificate chain too long: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.a.A(java.lang.String, java.util.List):java.util.List");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && h0.g(((a) obj).f6278u, this.f6278u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6278u.hashCode();
    }
}
