package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class id {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public id(Path path) {
        this.a = path;
    }

    public static void a(id idVar, id idVar2) {
        Path path = idVar.a;
        if (idVar2 instanceof id) {
            path.addPath(idVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            ov3.g("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(id idVar, m75 m75Var) {
        RectF rectF = idVar.b;
        if (rectF == null) {
            rectF = new RectF();
            idVar.b = rectF;
        }
        float f = m75Var.a;
        long j = m75Var.h;
        long j2 = m75Var.g;
        long j3 = m75Var.f;
        long j4 = m75Var.e;
        rectF.set(f, m75Var.b, m75Var.c, m75Var.d);
        float[] fArr = idVar.c;
        if (fArr == null) {
            fArr = new float[8];
            idVar.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = idVar.a;
        RectF rectF2 = idVar.b;
        rectF2.getClass();
        float[] fArr2 = idVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final n05 c() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new n05(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean d(id idVar, id idVar2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        if (idVar instanceof id) {
            Path path = idVar.a;
            if (idVar2 instanceof id) {
                return this.a.op(path, idVar2.a, op);
            }
            ov3.g("Unable to obtain android.graphics.Path");
            return false;
        }
        ov3.g("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void e() {
        this.a.reset();
    }

    public final void f(int i) {
        Path.FillType fillType;
        if (i == 1) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        this.a.setFillType(fillType);
    }

    public final void g(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
