package defpackage;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class g92 {
    public static final hm3 a = new hm3(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final so5 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new r35((byte) 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new so5(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((z82) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #1 {all -> 0x00a6, all -> 0x0076, NameNotFoundException -> 0x009c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:24:0x0072, B:26:0x0087, B:29:0x0093, B:34:0x0077, B:35:0x007a, B:36:0x007b, B:38:0x002f, B:40:0x0037, B:43:0x003b, B:45:0x003f, B:47:0x004a, B:56:0x009c, B:23:0x006c), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #1 {all -> 0x00a6, all -> 0x0076, NameNotFoundException -> 0x009c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:24:0x0072, B:26:0x0087, B:29:0x0093, B:34:0x0077, B:35:0x007a, B:36:0x007b, B:38:0x002f, B:40:0x0037, B:43:0x003b, B:45:0x003f, B:47:0x004a, B:56:0x009c, B:23:0x006c), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.f92 b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            hm3 r0 = defpackage.g92.a
            java.lang.String r1 = "getFontSync"
            java.lang.String r1 = defpackage.it5.f(r1)
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r0.c(r8)     // Catch: java.lang.Throwable -> La6
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L1c
            f92 r8 = new f92     // Catch: java.lang.Throwable -> La6
            r8.<init>(r1)     // Catch: java.lang.Throwable -> La6
            android.os.Trace.endSection()
            return r8
        L1c:
            u92 r10 = defpackage.y82.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9c java.lang.Throwable -> La6
            java.util.List r1 = r10.b     // Catch: java.lang.Throwable -> La6
            boolean r10 = r10.c     // Catch: java.lang.Throwable -> La6
            r2 = 1
            r3 = -3
            r4 = 0
            if (r10 == 0) goto L2f
            if (r10 == r2) goto L2d
        L2b:
            r10 = r3
            goto L50
        L2d:
            r10 = -2
            goto L50
        L2f:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> La6
            v92[] r10 = (defpackage.v92[]) r10     // Catch: java.lang.Throwable -> La6
            if (r10 == 0) goto L4f
            int r5 = r10.length     // Catch: java.lang.Throwable -> La6
            if (r5 != 0) goto L3b
            goto L4f
        L3b:
            int r5 = r10.length     // Catch: java.lang.Throwable -> La6
            r6 = r4
        L3d:
            if (r6 >= r5) goto L4d
            r7 = r10[r6]     // Catch: java.lang.Throwable -> La6
            int r7 = r7.f     // Catch: java.lang.Throwable -> La6
            if (r7 == 0) goto L4a
            if (r7 >= 0) goto L48
            goto L2b
        L48:
            r10 = r7
            goto L50
        L4a:
            int r6 = r6 + 1
            goto L3d
        L4d:
            r10 = r4
            goto L50
        L4f:
            r10 = r2
        L50:
            if (r10 == 0) goto L5b
            f92 r8 = new f92     // Catch: java.lang.Throwable -> La6
            r8.<init>(r10)     // Catch: java.lang.Throwable -> La6
            android.os.Trace.endSection()
            return r8
        L5b:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> La6
            if (r10 <= r2) goto L7b
            y95 r10 = defpackage.dl6.a     // Catch: java.lang.Throwable -> La6
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            java.lang.String r10 = defpackage.it5.f(r10)     // Catch: java.lang.Throwable -> La6
            android.os.Trace.beginSection(r10)     // Catch: java.lang.Throwable -> La6
            y95 r10 = defpackage.dl6.a     // Catch: java.lang.Throwable -> L76
            android.graphics.Typeface r9 = r10.f(r9, r1, r11)     // Catch: java.lang.Throwable -> L76
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La6
            goto L85
        L76:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La6
            throw r8     // Catch: java.lang.Throwable -> La6
        L7b:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> La6
            v92[] r10 = (defpackage.v92[]) r10     // Catch: java.lang.Throwable -> La6
            android.graphics.Typeface r9 = defpackage.dl6.a(r9, r10, r11)     // Catch: java.lang.Throwable -> La6
        L85:
            if (r9 == 0) goto L93
            r0.d(r8, r9)     // Catch: java.lang.Throwable -> La6
            f92 r8 = new f92     // Catch: java.lang.Throwable -> La6
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La6
            android.os.Trace.endSection()
            return r8
        L93:
            f92 r8 = new f92     // Catch: java.lang.Throwable -> La6
            r8.<init>(r3)     // Catch: java.lang.Throwable -> La6
            android.os.Trace.endSection()
            return r8
        L9c:
            f92 r8 = new f92     // Catch: java.lang.Throwable -> La6
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La6
            android.os.Trace.endSection()
            return r8
        La6:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g92.b(java.lang.String, android.content.Context, java.util.List, int):f92");
    }
}
