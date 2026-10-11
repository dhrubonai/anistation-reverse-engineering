package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o60 implements mu2 {
    public final Bitmap a;

    public o60(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.mu2
    public final boolean a() {
        return true;
    }

    @Override // defpackage.mu2
    public final void b(Canvas canvas) {
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
    }

    @Override // defpackage.mu2
    public final long c() {
        int i;
        int i2;
        Bitmap bitmap = this.a;
        if (!bitmap.isRecycled()) {
            try {
                i2 = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else if (config == Bitmap.Config.RGBA_F16) {
                    i = 8;
                } else {
                    i = 4;
                }
                i2 = i * height;
            }
            return i2;
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o60) && a34.i(this.a, ((o60) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mu2
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.mu2
    public final int getWidth() {
        return this.a.getWidth();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=true)";
    }
}
