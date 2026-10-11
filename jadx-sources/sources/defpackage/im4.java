package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class im4 extends ReplacementSpan {
    public Paint.FontMetricsInt x;
    public boolean y;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.x;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        a34.s0("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.y) {
            fz2.b("PlaceholderSpan is not laid out yet.");
            return 0;
        }
        return 0;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.y = true;
        paint.getTextSize();
        this.x = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            fz2.a("Invalid fontMetrics: line height can not be negative.");
        }
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
