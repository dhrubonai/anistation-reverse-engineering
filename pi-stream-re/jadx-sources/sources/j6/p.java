package j6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f6244c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6245d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6246e;

    public p(r rVar, float f10, float f11) {
        this.f6244c = rVar;
        this.f6245d = f10;
        this.f6246e = f11;
    }

    @Override // j6.t
    public final void a(Matrix matrix, i6.a aVar, int i10, Canvas canvas) {
        r rVar = this.f6244c;
        float f10 = rVar.f6255c;
        float f11 = this.f6246e;
        float f12 = rVar.f6254b;
        float f13 = this.f6245d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
        Matrix matrix2 = this.f6258a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = i6.a.f5386i;
        iArr[0] = aVar.f5395f;
        iArr[1] = aVar.f5394e;
        iArr[2] = aVar.f5393d;
        Paint paint = aVar.f5392c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, i6.a.f5387j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f6244c;
        return (float) Math.toDegrees(Math.atan((rVar.f6255c - this.f6246e) / (rVar.f6254b - this.f6245d)));
    }
}
