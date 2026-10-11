package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pd2 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = eq6.a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.a = parseInt;
                    this.b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r0.apply(r6) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.fy3 r10) {
        /*
            r9 = this;
            r10.getClass()
            jw2 r0 = defpackage.nw2.k()
            ey3[] r1 = r10.a
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lc:
            r5 = 0
            if (r4 >= r2) goto L39
            r6 = r1[r4]
            java.lang.Class r7 = r6.getClass()
            java.lang.Class<lq0> r8 = defpackage.lq0.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L31
            java.lang.Object r6 = r8.cast(r6)
            ey3 r6 = (defpackage.ey3) r6
            r7 = r6
            lq0 r7 = (defpackage.lq0) r7
            java.lang.String r7 = r7.c
            java.lang.String r8 = "iTunSMPB"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L31
            r5 = r6
        L31:
            if (r5 == 0) goto L36
            r0.c(r5)
        L36:
            int r4 = r4 + 1
            goto Lc
        L39:
            o15 r0 = r0.g()
            z62 r0 = r0.listIterator(r3)
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            lq0 r1 = (defpackage.lq0) r1
            java.lang.String r1 = r1.d
            boolean r1 = r9.a(r1)
            if (r1 == 0) goto L41
            goto La6
        L56:
            dv r0 = new dv
            r1 = 4
            r0.<init>(r1)
            jw2 r1 = defpackage.nw2.k()
            ey3[] r10 = r10.a
            int r2 = r10.length
            r4 = r3
        L64:
            if (r4 >= r2) goto L8a
            r6 = r10[r4]
            java.lang.Class r7 = r6.getClass()
            java.lang.Class<z13> r8 = defpackage.z13.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L81
            java.lang.Object r6 = r8.cast(r6)
            ey3 r6 = (defpackage.ey3) r6
            boolean r7 = r0.apply(r6)
            if (r7 == 0) goto L81
            goto L82
        L81:
            r6 = r5
        L82:
            if (r6 == 0) goto L87
            r1.c(r6)
        L87:
            int r4 = r4 + 1
            goto L64
        L8a:
            o15 r10 = r1.g()
            z62 r10 = r10.listIterator(r3)
        L92:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r10.next()
            z13 r0 = (defpackage.z13) r0
            java.lang.String r0 = r0.d
            boolean r0 = r9.a(r0)
            if (r0 == 0) goto L92
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd2.b(fy3):void");
    }
}
