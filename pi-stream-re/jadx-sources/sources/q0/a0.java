package q0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public final class a0 extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final r f8910b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f8909a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public float f8911c = 1.0f;

    public a0(r rVar) {
        if (rVar != null) {
            this.f8910b = rVar;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    @Override // android.text.style.ReplacementSpan
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        short s9;
        Paint.FontMetricsInt fontMetricsInt2 = this.f8909a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        r rVar = this.f8910b;
        r0.a d10 = rVar.d();
        int a10 = d10.a(14);
        short s10 = 0;
        if (a10 != 0) {
            s9 = d10.f9299b.getShort(a10 + d10.f9298a);
        } else {
            s9 = 0;
        }
        this.f8911c = abs / s9;
        r0.a d11 = rVar.d();
        int a11 = d11.a(14);
        if (a11 != 0) {
            d11.f9299b.getShort(a11 + d11.f9298a);
        }
        r0.a d12 = rVar.d();
        int a12 = d12.a(12);
        if (a12 != 0) {
            s10 = d12.f9299b.getShort(a12 + d12.f9298a);
        }
        short s11 = (short) (s10 * this.f8911c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s11;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        l.a().getClass();
        r rVar = this.f8910b;
        i.g gVar = rVar.f8942b;
        Typeface typeface = (Typeface) gVar.f5199e;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) gVar.f5197c, rVar.f8941a * 2, 2, f10, i13, paint);
        paint.setTypeface(typeface2);
    }
}
