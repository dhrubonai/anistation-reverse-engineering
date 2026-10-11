package j6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import r6.h0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final u[] f6229a = new u[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f6230b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f6231c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f6232d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f6233e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f6234f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final u f6235g = new u();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f6236h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f6237i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f6238j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f6239k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6240l = true;

    public m() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f6229a[i10] = new u();
            this.f6230b[i10] = new Matrix();
            this.f6231c[i10] = new Matrix();
        }
    }

    public final void a(k kVar, float f10, RectF rectF, k3.d dVar, Path path) {
        int i10;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        e eVar;
        Path path2;
        k3.d dVar2;
        char c6;
        c cVar;
        h0 h0Var;
        m mVar = this;
        k3.d dVar3 = dVar;
        Path path3 = path;
        path.rewind();
        Path path4 = mVar.f6233e;
        path4.rewind();
        Path path5 = mVar.f6234f;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            i10 = 4;
            matrixArr = mVar.f6231c;
            fArr = mVar.f6236h;
            matrixArr2 = mVar.f6230b;
            uVarArr = mVar.f6229a;
            if (i11 >= 4) {
                break;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        cVar = kVar.f6221f;
                    } else {
                        cVar = kVar.f6220e;
                    }
                } else {
                    cVar = kVar.f6223h;
                }
            } else {
                cVar = kVar.f6222g;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        h0Var = kVar.f6217b;
                    } else {
                        h0Var = kVar.f6216a;
                    }
                } else {
                    h0Var = kVar.f6219d;
                }
            } else {
                h0Var = kVar.f6218c;
            }
            u uVar = uVarArr[i11];
            h0Var.getClass();
            h0Var.V(f10, cVar.a(rectF), uVar);
            int i12 = i11 + 1;
            float f11 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = mVar.f6232d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f11);
            u uVar2 = uVarArr[i11];
            fArr[0] = uVar2.f6261c;
            fArr[1] = uVar2.f6262d;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f11);
            i11 = i12;
        }
        char c10 = 1;
        char c11 = 0;
        int i13 = 0;
        while (i13 < i10) {
            u uVar3 = uVarArr[i13];
            fArr[c11] = uVar3.f6259a;
            fArr[c10] = uVar3.f6260b;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path3.moveTo(fArr[c11], fArr[c10]);
            } else {
                path3.lineTo(fArr[c11], fArr[c10]);
            }
            uVarArr[i13].b(matrixArr2[i13], path3);
            if (dVar3 != null) {
                u uVar4 = uVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                BitSet bitSet = ((g) dVar3.f6453b).f6197d;
                uVar4.getClass();
                bitSet.set(i13, false);
                t[] tVarArr = ((g) dVar3.f6453b).f6195b;
                uVar4.a(uVar4.f6264f);
                tVarArr[i13] = new n(new ArrayList(uVar4.f6266h), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            u uVar5 = uVarArr[i13];
            fArr[0] = uVar5.f6261c;
            fArr[1] = uVar5.f6262d;
            matrixArr2[i13].mapPoints(fArr);
            u uVar6 = uVarArr[i15];
            float f12 = uVar6.f6259a;
            float[] fArr2 = mVar.f6237i;
            fArr2[0] = f12;
            fArr2[1] = uVar6.f6260b;
            matrixArr2[i15].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            u uVar7 = uVarArr[i13];
            fArr[0] = uVar7.f6261c;
            fArr[1] = uVar7.f6262d;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 != 1 && i13 != 3) {
                Math.abs(rectF.centerY() - fArr[1]);
            } else {
                Math.abs(rectF.centerX() - fArr[0]);
            }
            u uVar8 = mVar.f6235g;
            uVar8.d(0.0f, 270.0f, 0.0f);
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        eVar = kVar.f6225j;
                    } else {
                        eVar = kVar.f6224i;
                    }
                } else {
                    eVar = kVar.f6227l;
                }
            } else {
                eVar = kVar.f6226k;
            }
            eVar.getClass();
            uVar8.c(max, 0.0f);
            Path path6 = mVar.f6238j;
            path6.reset();
            uVar8.b(matrixArr[i13], path6);
            if (mVar.f6240l && (mVar.b(path6, i13) || mVar.b(path6, i15))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr[0] = uVar8.f6259a;
                fArr[1] = uVar8.f6260b;
                matrixArr[i13].mapPoints(fArr);
                path4.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i13], path4);
                dVar2 = dVar;
                path2 = path;
            } else {
                path2 = path;
                uVar8.b(matrixArr[i13], path2);
                dVar2 = dVar;
            }
            if (dVar2 != null) {
                Matrix matrix2 = matrixArr[i13];
                c6 = 0;
                ((g) dVar2.f6453b).f6197d.set(i13 + 4, false);
                t[] tVarArr2 = ((g) dVar2.f6453b).f6196c;
                uVar8.a(uVar8.f6264f);
                tVarArr2[i13] = new n(new ArrayList(uVar8.f6266h), new Matrix(matrix2));
            } else {
                c6 = 0;
            }
            c11 = c6;
            path3 = path2;
            i13 = i14;
            c10 = 1;
            i10 = 4;
            mVar = this;
            dVar3 = dVar2;
        }
        Path path7 = path3;
        path.close();
        path4.close();
        if (!path4.isEmpty()) {
            path7.op(path4, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f6239k;
        path2.reset();
        this.f6229a[i10].b(this.f6230b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }
}
