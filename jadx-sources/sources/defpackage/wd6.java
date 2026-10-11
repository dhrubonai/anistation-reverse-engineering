package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wd6 extends CharacterStyle implements UpdateAppearance {
    public final float x;
    public final int y;

    public wd6(int i, float f) {
        this.x = f;
        this.y = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(this.x);
        textPaint.setColor(this.y);
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        textPaint.setStrokeCap(Paint.Cap.ROUND);
    }
}
