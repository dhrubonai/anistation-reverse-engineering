package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dx3 {
    public static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String[] b;

    public dx3(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.charset.Charset a(java.nio.charset.Charset r6) {
        /*
            r5 = this;
            java.lang.String[] r5 = r5.b
            int r0 = r5.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = defpackage.x97.E(r2, r0, r1)
            if (r0 < 0) goto L21
        Ld:
            r1 = r5[r2]
            java.lang.String r3 = "charset"
            r4 = 1
            boolean r1 = defpackage.b06.C(r1, r3, r4)
            if (r1 == 0) goto L1c
            int r2 = r2 + r4
            r5 = r5[r2]
            goto L22
        L1c:
            if (r2 == r0) goto L21
            int r2 = r2 + 2
            goto Ld
        L21:
            r5 = 0
        L22:
            if (r5 != 0) goto L25
            return r6
        L25:
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch: java.lang.IllegalArgumentException -> L2a
            return r5
        L2a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx3.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dx3) && a34.i(((dx3) obj).a, this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
