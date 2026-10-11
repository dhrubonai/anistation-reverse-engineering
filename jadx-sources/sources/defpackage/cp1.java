package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cp1 extends CharacterStyle implements UpdateAppearance {
    public final bb4 x;

    public cp1(bb4 bb4Var) {
        this.x = bb4Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            y22 y22Var = y22.O;
            bb4 bb4Var = this.x;
            if (a34.i(bb4Var, y22Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (bb4Var instanceof d06) {
                textPaint.setStyle(Paint.Style.STROKE);
                d06 d06Var = (d06) bb4Var;
                textPaint.setStrokeWidth(d06Var.O);
                textPaint.setStrokeMiter(d06Var.P);
                int i = d06Var.R;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else if (i == 1) {
                    join = Paint.Join.ROUND;
                } else if (i == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i2 = d06Var.Q;
                if (i2 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i2 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i2 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                textPaint.setPathEffect(null);
                return;
            }
            ze0.l();
        }
    }
}
