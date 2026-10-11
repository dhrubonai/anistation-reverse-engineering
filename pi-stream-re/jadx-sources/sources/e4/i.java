package e4;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3492b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(v3.i.f10644a);

    @Override // v3.i
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f3492b);
    }

    @Override // e4.e
    public final Bitmap c(y3.d dVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = y.f3534a;
        if (bitmap.getWidth() <= i10 && bitmap.getHeight() <= i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
                return bitmap;
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return y.b(dVar, bitmap, i10, i11);
    }

    @Override // v3.i
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // v3.i
    public final int hashCode() {
        return -670243078;
    }
}
