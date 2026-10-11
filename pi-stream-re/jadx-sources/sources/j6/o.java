package j6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class o extends t {

    /* renamed from: c, reason: collision with root package name */
    public final q f6243c;

    public o(q qVar) {
        this.f6243c = qVar;
    }

    @Override // j6.t
    public final void a(Matrix matrix, i6.a aVar, int i10, Canvas canvas) {
        boolean z9;
        q qVar = this.f6243c;
        float f10 = qVar.f6252f;
        float f11 = qVar.f6253g;
        RectF rectF = new RectF(qVar.f6248b, qVar.f6249c, qVar.f6250d, qVar.f6251e);
        aVar.getClass();
        if (f11 < 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        Path path = aVar.f5396g;
        int[] iArr = i6.a.f5388k;
        if (z9) {
            iArr[0] = 0;
            iArr[1] = aVar.f5395f;
            iArr[2] = aVar.f5394e;
            iArr[3] = aVar.f5393d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = aVar.f5393d;
            iArr[2] = aVar.f5394e;
            iArr[3] = aVar.f5395f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f13 = 1.0f - (i10 / width);
            float[] fArr = i6.a.f5389l;
            fArr[1] = f13;
            fArr[2] = ((1.0f - f13) / 2.0f) + f13;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = aVar.f5391b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z9) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f5397h);
            }
            canvas.drawArc(rectF, f10, f11, true, paint);
            canvas.restore();
        }
    }
}
