package r3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f9365p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f9366a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f9367b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f9368c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f9369d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f9370e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f9371f;

    /* renamed from: g, reason: collision with root package name */
    public final i f9372g;

    /* renamed from: h, reason: collision with root package name */
    public float f9373h;

    /* renamed from: i, reason: collision with root package name */
    public float f9374i;

    /* renamed from: j, reason: collision with root package name */
    public float f9375j;

    /* renamed from: k, reason: collision with root package name */
    public float f9376k;

    /* renamed from: l, reason: collision with root package name */
    public int f9377l;

    /* renamed from: m, reason: collision with root package name */
    public String f9378m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f9379n;
    public final n.e o;

    public l() {
        this.f9368c = new Matrix();
        this.f9373h = 0.0f;
        this.f9374i = 0.0f;
        this.f9375j = 0.0f;
        this.f9376k = 0.0f;
        this.f9377l = 255;
        this.f9378m = null;
        this.f9379n = null;
        this.o = new n.e();
        this.f9372g = new i();
        this.f9366a = new Path();
        this.f9367b = new Path();
    }

    public final void a(i iVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        float f11;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Path.FillType fillType;
        Path.FillType fillType2;
        iVar.f9349a.set(matrix);
        Matrix matrix2 = iVar.f9349a;
        matrix2.preConcat(iVar.f9358j);
        canvas.save();
        char c6 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = iVar.f9350b;
            if (i13 < arrayList.size()) {
                j jVar = (j) arrayList.get(i13);
                if (jVar instanceof i) {
                    a((i) jVar, matrix2, canvas, i10, i11);
                } else if (jVar instanceof k) {
                    k kVar = (k) jVar;
                    float f12 = i10 / this.f9375j;
                    float f13 = i11 / this.f9376k;
                    float min = Math.min(f12, f13);
                    Matrix matrix3 = this.f9368c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f12, f13);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[c6], fArr[1]);
                    i12 = i13;
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    if (max > 0.0f) {
                        f10 = Math.abs(f14) / max;
                    } else {
                        f10 = 0.0f;
                    }
                    if (f10 != 0.0f) {
                        kVar.getClass();
                        Path path = this.f9366a;
                        path.reset();
                        z.h[] hVarArr = kVar.f9361a;
                        if (hVarArr != null) {
                            z.h.b(hVarArr, path);
                        }
                        Path path2 = this.f9367b;
                        path2.reset();
                        if (kVar instanceof g) {
                            if (kVar.f9363c == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType2);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            h hVar = (h) kVar;
                            float f15 = hVar.f9344j;
                            if (f15 != 0.0f || hVar.f9345k != 1.0f) {
                                float f16 = hVar.f9346l;
                                float f17 = (f15 + f16) % 1.0f;
                                float f18 = (hVar.f9345k + f16) % 1.0f;
                                if (this.f9371f == null) {
                                    this.f9371f = new PathMeasure();
                                }
                                this.f9371f.setPath(path, false);
                                float length = this.f9371f.getLength();
                                float f19 = f17 * length;
                                float f20 = f18 * length;
                                path.reset();
                                if (f19 > f20) {
                                    this.f9371f.getSegment(f19, length, path, true);
                                    f11 = 0.0f;
                                    this.f9371f.getSegment(0.0f, f20, path, true);
                                } else {
                                    f11 = 0.0f;
                                    this.f9371f.getSegment(f19, f20, path, true);
                                }
                                path.rLineTo(f11, f11);
                            }
                            path2.addPath(path, matrix3);
                            y.c cVar = hVar.f9341g;
                            if (((Shader) cVar.f11424b) != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (!z9 && cVar.f11423a == 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                if (this.f9370e == null) {
                                    Paint paint = new Paint(1);
                                    this.f9370e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f9370e;
                                Object obj = cVar.f11424b;
                                if (((Shader) obj) != null) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    Shader shader = (Shader) obj;
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(hVar.f9343i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i14 = cVar.f11423a;
                                    float f21 = hVar.f9343i;
                                    PorterDuff.Mode mode = o.A;
                                    paint2.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f21)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (hVar.f9363c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            y.c cVar2 = hVar.f9339e;
                            if (((Shader) cVar2.f11424b) != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11 && cVar2.f11423a == 0) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (z12) {
                                if (this.f9369d == null) {
                                    z13 = true;
                                    Paint paint3 = new Paint(1);
                                    this.f9369d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z13 = true;
                                }
                                Paint paint4 = this.f9369d;
                                Paint.Join join = hVar.f9348n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = hVar.f9347m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(hVar.o);
                                Object obj2 = cVar2.f11424b;
                                if (((Shader) obj2) == null) {
                                    z13 = false;
                                }
                                if (z13) {
                                    Shader shader2 = (Shader) obj2;
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(hVar.f9342h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i15 = cVar2.f11423a;
                                    float f22 = hVar.f9342h;
                                    PorterDuff.Mode mode2 = o.A;
                                    paint4.setColor((i15 & 16777215) | (((int) (Color.alpha(i15) * f22)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(hVar.f9340f * f10 * min);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i13 = i12 + 1;
                    c6 = 0;
                }
                i12 = i13;
                i13 = i12 + 1;
                c6 = 0;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f9377l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f9377l = i10;
    }

    public l(l lVar) {
        this.f9368c = new Matrix();
        this.f9373h = 0.0f;
        this.f9374i = 0.0f;
        this.f9375j = 0.0f;
        this.f9376k = 0.0f;
        this.f9377l = 255;
        this.f9378m = null;
        this.f9379n = null;
        n.e eVar = new n.e();
        this.o = eVar;
        this.f9372g = new i(lVar.f9372g, eVar);
        this.f9366a = new Path(lVar.f9366a);
        this.f9367b = new Path(lVar.f9367b);
        this.f9373h = lVar.f9373h;
        this.f9374i = lVar.f9374i;
        this.f9375j = lVar.f9375j;
        this.f9376k = lVar.f9376k;
        this.f9377l = lVar.f9377l;
        this.f9378m = lVar.f9378m;
        String str = lVar.f9378m;
        if (str != null) {
            eVar.put(str, this);
        }
        this.f9379n = lVar.f9379n;
    }
}
