package j6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f6247h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public float f6248b;

    /* renamed from: c, reason: collision with root package name */
    public float f6249c;

    /* renamed from: d, reason: collision with root package name */
    public float f6250d;

    /* renamed from: e, reason: collision with root package name */
    public float f6251e;

    /* renamed from: f, reason: collision with root package name */
    public float f6252f;

    /* renamed from: g, reason: collision with root package name */
    public float f6253g;

    public q(float f10, float f11, float f12, float f13) {
        this.f6248b = f10;
        this.f6249c = f11;
        this.f6250d = f12;
        this.f6251e = f13;
    }

    @Override // j6.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f6256a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f6247h;
        rectF.set(this.f6248b, this.f6249c, this.f6250d, this.f6251e);
        path.arcTo(rectF, this.f6252f, this.f6253g, false);
        path.transform(matrix);
    }
}
