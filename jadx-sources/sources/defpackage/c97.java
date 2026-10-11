package defpackage;

import android.graphics.Paint;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c97 {
    public static final c97 a = new Object();

    public final long a(Paint paint) {
        int i = ep0.j;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        if (j < 16) {
            return colorLong;
        }
        return (colorLong & (-64)) | (j + 1);
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(z51.P(i));
    }

    public final void c(Paint paint, long j) {
        paint.setColor(q23.V(j));
    }
}
