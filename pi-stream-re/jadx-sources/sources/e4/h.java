package e4;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3491b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(v3.i.f10644a);

    @Override // v3.i
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f3491b);
    }

    @Override // e4.e
    public final Bitmap c(y3.d dVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = y.f3534a;
        if (bitmap.getWidth() != i10 || bitmap.getHeight() != i11) {
            Matrix matrix = new Matrix();
            float f10 = 0.0f;
            if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
                width = i11 / bitmap.getHeight();
                f10 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i10 / bitmap.getWidth();
                height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f10 + 0.5f), (int) (height + 0.5f));
            if (bitmap.getConfig() != null) {
                config = bitmap.getConfig();
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap b10 = dVar.b(i10, i11, config);
            b10.setHasAlpha(bitmap.hasAlpha());
            y.a(bitmap, b10, matrix);
            return b10;
        }
        return bitmap;
    }

    @Override // v3.i
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // v3.i
    public final int hashCode() {
        return -599754482;
    }
}
