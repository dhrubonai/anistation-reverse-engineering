package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class br2 {
    public static final Set a = ms.U0(new Character[]{'/', '?', '#', '@'});
    public static final cn7 b;

    static {
        List list = gh3.b;
        b = tl7.j(te4.I("HTTP/1.0", "HTTP/1.1"), new ui((byte) 10), new vs0((byte) 19));
    }

    public static final void a(CharSequence charSequence, char c) {
        throw new wm0("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((Object) charSequence), (byte) 4);
    }

    public static final int b(mk0 mk0Var, h12 h12Var) {
        int i = h12Var.c;
        for (int i2 = h12Var.b; i2 < i; i2++) {
            char charAt = mk0Var.charAt(i2);
            if (charAt == ':' && i2 != h12Var.b) {
                h12Var.b = i2 + 1;
                return i2;
            }
            if (a34.D(charAt, 32) <= 0 || uz5.N("\"(),/:;<=>?@[\\]{}", charAt)) {
                int i3 = h12Var.b;
                if (charAt != ':') {
                    if (i2 == i3) {
                        throw new wm0("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.", (byte) 4);
                    }
                    a(mk0Var, charAt);
                    throw null;
                }
                throw new wm0("Empty header names are not allowed as per RFC7230.", (byte) 4);
            }
        }
        throw new wm0("No colon in HTTP header in " + mk0Var.subSequence(h12Var.b, h12Var.c).toString() + " in builder: \n" + ((Object) mk0Var), (byte) 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c5, code lost:
    
        a(r2, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c8, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:14:0x006b, B:16:0x0077, B:19:0x007f, B:23:0x008c, B:26:0x0098, B:60:0x00a4, B:31:0x00a9, B:32:0x00d2, B:33:0x0053, B:40:0x00b1, B:53:0x00c5, B:54:0x00c8, B:50:0x00c9, B:58:0x00cc, B:63:0x00dc, B:64:0x00e3, B:65:0x00e4, B:67:0x00ec), top: B:13:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:14:0x006b, B:16:0x0077, B:19:0x007f, B:23:0x008c, B:26:0x0098, B:60:0x00a4, B:31:0x00a9, B:32:0x00d2, B:33:0x0053, B:40:0x00b1, B:53:0x00c5, B:54:0x00c8, B:50:0x00c9, B:58:0x00cc, B:63:0x00dc, B:64:0x00e3, B:65:0x00e4, B:67:0x00ec), top: B:13:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0066 -> B:13:0x006b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.wc0 r17, defpackage.mk0 r18, defpackage.h12 r19, defpackage.xz0 r20) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br2.c(wc0, mk0, h12, xz0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|(3:(1:(10:10|11|12|13|14|15|(1:17)|18|19|20)(2:29|30))(4:31|32|33|34)|25|26)(5:49|50|51|(1:53)|41)|35|36|(1:38)(3:39|(7:42|14|15|(0)|18|19|20)|41)))|57|6|(0)(0)|35|36|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c4 A[Catch: all -> 0x00cb, TryCatch #3 {all -> 0x00cb, blocks: (B:15:0x00c0, B:17:0x00c4, B:19:0x00ce), top: B:14:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:36:0x007b, B:39:0x0088), top: B:35:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.wc0 r17, defpackage.xz0 r18) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br2.d(wc0, xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r6.b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int e(defpackage.mk0 r5, defpackage.h12 r6) {
        /*
            defpackage.ct5.n(r5, r6)
            int r0 = r6.c
            int r1 = r6.b
            r2 = 0
        L8:
            if (r1 >= r0) goto L70
            char r3 = r5.charAt(r1)
            r4 = 32
            if (r3 != r4) goto L36
            r5 = 100
            if (r2 < r5) goto L1c
            r5 = 999(0x3e7, float:1.4E-42)
            if (r2 > r5) goto L1c
            r0 = r1
            goto L70
        L1c:
            wm0 r5 = new wm0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Status-code must be 3-digit. Status received: "
            r6.<init>(r0)
            r6.append(r2)
            r0 = 46
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r0 = 4
            r5.<init>(r6, r0)
            throw r5
        L36:
            r4 = 48
            if (r4 > r3) goto L46
            r4 = 58
            if (r3 >= r4) goto L46
            int r2 = r2 * 10
            int r3 = r3 + (-48)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L8
        L46:
            int r0 = r6.b
            int r6 = defpackage.ct5.g(r5, r6)
            java.lang.CharSequence r5 = r5.subSequence(r0, r6)
            java.lang.String r5 = r5.toString()
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal digit "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " in status code "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L70:
            r6.b = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br2.e(mk0, h12):int");
    }

    public static final String f(mk0 mk0Var, h12 h12Var) {
        ct5.n(mk0Var, h12Var);
        int i = h12Var.b;
        int i2 = h12Var.c;
        if (i < i2) {
            String str = (String) yo0.A0(cn7.r(b, mk0Var, i, i2, new st0((byte) 21), 8));
            if (str != null) {
                h12Var.b = str.length() + h12Var.b;
                return str;
            }
            int g = ct5.g(mk0Var, h12Var);
            CharSequence subSequence = mk0Var.subSequence(h12Var.b, g);
            h12Var.b = g;
            throw new wm0("Unsupported HTTP version: " + ((Object) subSequence), (byte) 4);
        }
        ov3.l(mk0Var, "Failed to parse version: ");
        return null;
    }

    public static final void g(kk0 kk0Var) {
        if (!uz5.O(kk0Var, ":")) {
            for (int i = 0; i < kk0Var.length(); i++) {
                Character valueOf = Character.valueOf(kk0Var.charAt(i));
                Set set = a;
                if (set.contains(valueOf)) {
                    throw new wm0("Host cannot contain any of the following symbols: " + set, (byte) 4);
                }
            }
            return;
        }
        throw new wm0("Host header with ':' should contains port: " + ((Object) kk0Var), (byte) 4);
    }
}
