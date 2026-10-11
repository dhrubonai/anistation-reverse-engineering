package e4;

/* loaded from: classes.dex */
public final class b implements v3.o {

    /* renamed from: b, reason: collision with root package name */
    public static final v3.k f3469b = v3.k.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c, reason: collision with root package name */
    public static final v3.k f3470c = new v3.k("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, v3.k.f10645e);

    /* renamed from: a, reason: collision with root package name */
    public final y3.h f3471a;

    public b(y3.h hVar) {
        this.f3471a = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    @Override // v3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(java.lang.Object r9, java.io.File r10, v3.l r11) {
        /*
            r8 = this;
            x3.e0 r9 = (x3.e0) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            v3.k r1 = e4.b.f3470c
            java.lang.Object r2 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r3 = p4.g.f8564b
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            v3.k r5 = e4.b.f3469b
            java.lang.Object r5 = r11.c(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            y3.h r10 = r8.f3471a
            if (r10 == 0) goto L4e
            com.bumptech.glide.load.data.c r6 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            r6.<init>(r7, r10)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            goto L4f
        L48:
            r9 = move-exception
            goto Lb9
        L4b:
            r10 = move-exception
            r6 = r7
            goto L5d
        L4e:
            r6 = r7
        L4f:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r6.close()     // Catch: java.io.IOException -> L58 java.lang.Throwable -> Lbf
        L58:
            r10 = 1
            goto L6f
        L5a:
            r9 = move-exception
            goto Lb8
        L5c:
            r10 = move-exception
        L5d:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L69
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch: java.lang.Throwable -> L5a
        L69:
            if (r6 == 0) goto L6e
            r6.close()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbf
        L6e:
            r10 = 0
        L6f:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto Lb7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Compressed with type: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " of size "
            r5.append(r2)
            int r2 = p4.m.c(r9)
            r5.append(r2)
            java.lang.String r2 = " in "
            r5.append(r2)
            double r2 = p4.g.a(r3)
            r5.append(r2)
            java.lang.String r2 = ", options format: "
            r5.append(r2)
            java.lang.Object r11 = r11.c(r1)
            r5.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r5.append(r11)
            boolean r9 = r9.hasAlpha()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            android.util.Log.v(r0, r9)
        Lb7:
            return r10
        Lb8:
            r7 = r6
        Lb9:
            if (r7 == 0) goto Lc1
            r7.close()     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            goto Lc1
        Lbf:
            r9 = move-exception
            throw r9
        Lc1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.b.p(java.lang.Object, java.io.File, v3.l):boolean");
    }

    @Override // v3.o
    public final int q(v3.l lVar) {
        return 2;
    }
}
