package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t9 implements vg0 {
    public Canvas a = u9.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.vg0
    public final void a(pc pcVar, ad adVar) {
        this.a.drawBitmap(oi4.h(pcVar), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) adVar.z);
    }

    @Override // defpackage.vg0
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.vg0
    public final void c(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.vg0
    public final void d(float f, long j, ad adVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) adVar.z);
    }

    @Override // defpackage.vg0
    public final void e(pc pcVar, long j, long j2, long j3, ad adVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap h = oi4.h(pcVar);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(h, rect, rect2, (Paint) adVar.z);
    }

    @Override // defpackage.vg0
    public final void f(id idVar, ad adVar) {
        Canvas canvas = this.a;
        if (idVar instanceof id) {
            canvas.drawPath(idVar.a, n77.J(adVar));
        } else {
            ov3.g("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.vg0
    public final void g(float f, float f2, float f3, float f4, float f5, float f6, ad adVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) adVar.z);
    }

    @Override // defpackage.vg0
    public final void h() {
        this.a.save();
    }

    @Override // defpackage.vg0
    public final void i(long j, long j2, ad adVar) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) adVar.z);
    }

    @Override // defpackage.vg0
    public final void j() {
        this.a.disableZ();
    }

    @Override // defpackage.vg0
    public final void k(float f, float f2, float f3, float f4, ad adVar) {
        this.a.drawRect(f, f2, f3, f4, n77.J(adVar));
    }

    @Override // defpackage.vg0
    public final void l(float[] fArr) {
        if (!v94.z(fArr)) {
            Matrix matrix = new Matrix();
            wk6.E(matrix, fArr);
            this.a.concat(matrix);
        }
    }

    @Override // defpackage.vg0
    public final void m(id idVar) {
        Canvas canvas = this.a;
        if (idVar instanceof id) {
            canvas.clipPath(idVar.a, Region.Op.INTERSECT);
        } else {
            ov3.g("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.vg0
    public final void n(float f, float f2, float f3, float f4, int i) {
        Region.Op op;
        Canvas canvas = this.a;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // defpackage.vg0
    public final void o(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.vg0
    public final void p() {
        this.a.restore();
    }

    @Override // defpackage.vg0
    public final void r(n05 n05Var, ad adVar) {
        this.a.saveLayer(n05Var.a, n05Var.b, n05Var.c, n05Var.d, (Paint) adVar.z, 31);
    }

    @Override // defpackage.vg0
    public final void s() {
        this.a.enableZ();
    }

    @Override // defpackage.vg0
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, ad adVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) adVar.z);
    }
}
