package e4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class w extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f3532c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(v3.i.f10644a);

    /* renamed from: b, reason: collision with root package name */
    public final int f3533b;

    public w(int i10) {
        boolean z9;
        if (i10 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.h(z9, "roundingRadius must be greater than 0.");
        this.f3533b = i10;
    }

    @Override // v3.i
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f3532c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f3533b).array());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    @Override // e4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap c(y3.d r9, android.graphics.Bitmap r10, int r11, int r12) {
        /*
            r8 = this;
            android.graphics.Paint r11 = e4.y.f3534a
            int r11 = r8.f3533b
            r12 = 1
            r0 = 0
            if (r11 <= 0) goto La
            r1 = r12
            goto Lb
        La:
            r1 = r0
        Lb:
            java.lang.String r2 = "roundingRadius must be greater than 0."
            w7.b.h(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L29
            android.graphics.Bitmap$Config r3 = h0.f.z()
            android.graphics.Bitmap$Config r4 = r10.getConfig()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L29
            android.graphics.Bitmap$Config r3 = h0.f.z()
            goto L2b
        L29:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L2b:
            if (r1 < r2) goto L40
            android.graphics.Bitmap$Config r1 = h0.f.z()
            android.graphics.Bitmap$Config r2 = r10.getConfig()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L40
            android.graphics.Bitmap$Config r1 = h0.f.z()
            goto L42
        L40:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L42:
            android.graphics.Bitmap$Config r2 = r10.getConfig()
            boolean r2 = r1.equals(r2)
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L50
            r1 = r10
            goto L64
        L50:
            int r2 = r10.getWidth()
            int r6 = r10.getHeight()
            android.graphics.Bitmap r1 = r9.b(r2, r6, r1)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            r2.drawBitmap(r10, r5, r5, r4)
        L64:
            int r2 = r1.getWidth()
            int r6 = r1.getHeight()
            android.graphics.Bitmap r2 = r9.b(r2, r6, r3)
            r2.setHasAlpha(r12)
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r6 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r1, r6, r6)
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r6.setAntiAlias(r12)
            r6.setShader(r3)
            android.graphics.RectF r12 = new android.graphics.RectF
            int r3 = r2.getWidth()
            float r3 = (float) r3
            int r7 = r2.getHeight()
            float r7 = (float) r7
            r12.<init>(r5, r5, r3, r7)
            java.util.concurrent.locks.Lock r3 = e4.y.f3535b
            r3.lock()
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> Lb7
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lb7
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> Lb7
            r5.drawColor(r0, r7)     // Catch: java.lang.Throwable -> Lb7
            float r11 = (float) r11     // Catch: java.lang.Throwable -> Lb7
            r5.drawRoundRect(r12, r11, r11, r6)     // Catch: java.lang.Throwable -> Lb7
            r5.setBitmap(r4)     // Catch: java.lang.Throwable -> Lb7
            r3.unlock()
            boolean r10 = r1.equals(r10)
            if (r10 != 0) goto Lb6
            r9.c(r1)
        Lb6:
            return r2
        Lb7:
            r9 = move-exception
            r3.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.w.c(y3.d, android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }

    @Override // v3.i
    public final boolean equals(Object obj) {
        if (!(obj instanceof w) || this.f3533b != ((w) obj).f3533b) {
            return false;
        }
        return true;
    }

    @Override // v3.i
    public final int hashCode() {
        char[] cArr = p4.m.f8575a;
        return ((this.f3533b + 527) * 31) - 569625254;
    }
}
