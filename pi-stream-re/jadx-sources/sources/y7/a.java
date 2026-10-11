package y7;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c8.d f11635a;

    public a(c8.d dVar) {
        this.f11635a = dVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:12:0x002c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public final e0.a a(msr.pistream.app.ui.home.screens.MainActivity r7) {
        /*
            r6 = this;
            e0.a r0 = new e0.a
            r0.<init>()
            r1 = 0
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch: java.lang.Exception -> L2c
            java.lang.String r7 = r7.getPackageName()     // Catch: java.lang.Exception -> L2c
            android.content.pm.PackageInfo r7 = r2.getPackageInfo(r7, r1)     // Catch: java.lang.Exception -> L2c
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L2c
            r3 = 28
            if (r2 < r3) goto L29
            long r2 = com.google.android.gms.internal.p002firebaseauthapi.a.c(r7)     // Catch: java.lang.Exception -> L2c
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L27
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L2d
        L27:
            int r7 = (int) r2     // Catch: java.lang.Exception -> L2c
            goto L2d
        L29:
            int r7 = r7.versionCode     // Catch: java.lang.Exception -> L2c
            goto L2d
        L2c:
            r7 = r1
        L2d:
            r0.f3296b = r7     // Catch: java.lang.Exception -> L4e
            c8.d r7 = r6.f11635a     // Catch: java.lang.Exception -> L4e
            c8.c r7 = r7.a()     // Catch: java.lang.Exception -> L4e
            r0.f3297c = r7     // Catch: java.lang.Exception -> L4e
            if (r7 == 0) goto L4a
            int r2 = r0.f3296b     // Catch: java.lang.Exception -> L4e
            int r7 = r7.f2083a     // Catch: java.lang.Exception -> L4e
            r3 = 1
            if (r7 <= 0) goto L46
            if (r2 <= 0) goto L46
            if (r7 <= r2) goto L46
            r7 = r3
            goto L47
        L46:
            r7 = r1
        L47:
            if (r7 == 0) goto L4a
            goto L4b
        L4a:
            r3 = r1
        L4b:
            r0.f3295a = r3     // Catch: java.lang.Exception -> L4e
            goto L58
        L4e:
            r7 = move-exception
            java.lang.String r2 = "CheckAppUpdate"
            java.lang.String r3 = "execute"
            android.util.Log.e(r2, r3, r7)
            r0.f3295a = r1
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.a.a(msr.pistream.app.ui.home.screens.MainActivity):e0.a");
    }
}
