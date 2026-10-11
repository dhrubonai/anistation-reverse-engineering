package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class oa7 {
    public static final oa7 b = new Object();
    public Context a;

    public oa7(Context context, byte b2) {
        switch (b2) {
            case 2:
                context.getClass();
                this.a = context;
                return;
            default:
                this.a = context.getApplicationContext();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(defpackage.ea2 r5) {
        /*
            java.lang.String r0 = r5.p
            r1 = 0
            if (r0 == 0) goto L7d
            boolean r0 = defpackage.qy3.k(r0)
            if (r0 != 0) goto Ld
            goto L7d
        Ld:
            java.lang.String r5 = r5.p
            r5.getClass()
            int r0 = r5.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1487656890: goto L5f;
                case -1487464693: goto L54;
                case -1487464690: goto L49;
                case -1487394660: goto L3e;
                case -1487018032: goto L33;
                case -879272239: goto L28;
                case -879258763: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L69
        L1d:
            java.lang.String r0 = "image/png"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L26
            goto L69
        L26:
            r4 = 6
            goto L69
        L28:
            java.lang.String r0 = "image/bmp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L31
            goto L69
        L31:
            r4 = 5
            goto L69
        L33:
            java.lang.String r0 = "image/webp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3c
            goto L69
        L3c:
            r4 = r2
            goto L69
        L3e:
            java.lang.String r0 = "image/jpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L47
            goto L69
        L47:
            r4 = 3
            goto L69
        L49:
            java.lang.String r0 = "image/heif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L52
            goto L69
        L52:
            r4 = 2
            goto L69
        L54:
            java.lang.String r0 = "image/heic"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5d
            goto L69
        L5d:
            r4 = r3
            goto L69
        L5f:
            java.lang.String r0 = "image/avif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L68
            goto L69
        L68:
            r4 = r1
        L69:
            switch(r4) {
                case 0: goto L6d;
                case 1: goto L73;
                case 2: goto L73;
                case 3: goto L73;
                case 4: goto L73;
                case 5: goto L73;
                case 6: goto L73;
                default: goto L6c;
            }
        L6c:
            goto L78
        L6d:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r5 < r0) goto L78
        L73:
            int r5 = defpackage.w30.a(r2, r1, r1, r1)
            return r5
        L78:
            int r5 = defpackage.w30.a(r3, r1, r1, r1)
            return r5
        L7d:
            int r5 = defpackage.w30.a(r1, r1, r1, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa7.a(ea2):int");
    }
}
