package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import android.os.Trace;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b25 {
    public Object a;
    public Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public b25(byte b) {
        switch (b) {
            case 1:
                this.a = new an5[4];
                this.b = new Matrix[4];
                this.c = new Matrix[4];
                this.d = new PointF();
                this.e = new Path();
                this.f = new Path();
                this.g = new an5();
                this.h = new float[2];
                this.i = new float[2];
                this.j = new Path();
                this.k = new Path();
                for (int i = 0; i < 4; i++) {
                    ((an5[]) this.a)[i] = new an5();
                    ((Matrix[]) this.b)[i] = new Matrix();
                    ((Matrix[]) this.c)[i] = new Matrix();
                }
                return;
            default:
                z44 z44Var = new z44(new od2[16], 0);
                this.c = z44Var;
                q44 q44Var = db5.a;
                this.g = new q44();
                this.d = z44Var;
                this.e = new z44(new Object[16], 0);
                this.f = new z44(new sb2[16], 0);
                return;
        }
    }

    public static final boolean g(od2 od2Var, z44 z44Var) {
        Object[] objArr = z44Var.x;
        int i = z44Var.z;
        for (int i2 = 0; i2 < i; i2++) {
            c25 c25Var = ((od2) objArr[i2]).a;
            if (c25Var instanceof ok4) {
                z44 z44Var2 = ((ok4) c25Var).y;
                if (z44Var2.k(od2Var) || g(od2Var, z44Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static b25 h() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return qm5.a;
        }
        return new b25((byte) 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public void a(pm5 pm5Var, float f, RectF rectF, eo3 eo3Var, Path path) {
        int i;
        boolean z;
        float f2;
        nr1 nr1Var;
        eo3 eo3Var2;
        boolean z2;
        f11 f11Var;
        wc7 wc7Var;
        eo3 eo3Var3 = eo3Var;
        Matrix[] matrixArr = (Matrix[]) this.c;
        float[] fArr = (float[]) this.h;
        an5[] an5VarArr = (an5[]) this.a;
        Matrix[] matrixArr2 = (Matrix[]) this.b;
        path.rewind();
        Path path2 = (Path) this.e;
        path2.rewind();
        Path path3 = (Path) this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            z = 0;
            if (i2 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.d;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        f11Var = pm5Var.g;
                    } else {
                        f11Var = pm5Var.f;
                    }
                } else {
                    f11Var = pm5Var.i;
                }
            } else {
                f11Var = pm5Var.h;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        wc7Var = pm5Var.c;
                    } else {
                        wc7Var = pm5Var.b;
                    }
                } else {
                    wc7Var = pm5Var.e;
                }
            } else {
                wc7Var = pm5Var.d;
            }
            an5 an5Var = an5VarArr[i2];
            wc7Var.getClass();
            Matrix[] matrixArr3 = matrixArr;
            wc7Var.r(an5Var, f, f11Var.a(rectF));
            int i3 = i2 + 1;
            float f3 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
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
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            an5 an5Var2 = an5VarArr[i2];
            fArr[0] = an5Var2.b;
            fArr[1] = an5Var2.c;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr3[i2].reset();
            matrixArr3[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr3[i2].preRotate(f3);
            i2 = i3;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            an5 an5Var3 = an5VarArr[i4];
            an5Var3.getClass();
            fArr[z] = 0.0f;
            fArr[1] = an5Var3.a;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path.moveTo(fArr[z], fArr[1]);
            } else {
                path.lineTo(fArr[z], fArr[1]);
            }
            an5VarArr[i4].b(matrixArr2[i4], path);
            if (eo3Var3 != null) {
                an5 an5Var4 = an5VarArr[i4];
                Matrix matrix = matrixArr2[i4];
                go3 go3Var = (go3) eo3Var3.y;
                BitSet bitSet = go3Var.e;
                an5Var4.getClass();
                f2 = 0.0f;
                bitSet.set(i4, z);
                zm5[] zm5VarArr = go3Var.c;
                an5Var4.a(an5Var4.e);
                zm5VarArr[i4] = new um5(new ArrayList(an5Var4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            Path path4 = (Path) this.j;
            an5 an5Var5 = (an5) this.g;
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            an5 an5Var6 = an5VarArr[i4];
            fArr[0] = an5Var6.b;
            fArr[1] = an5Var6.c;
            matrixArr2[i4].mapPoints(fArr);
            float[] fArr2 = (float[]) this.i;
            an5 an5Var7 = an5VarArr[i6];
            an5Var7.getClass();
            fArr2[0] = f2;
            fArr2[1] = an5Var7.a;
            matrixArr2[i6].mapPoints(fArr2);
            an5[] an5VarArr2 = an5VarArr;
            Matrix[] matrixArr5 = matrixArr2;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            an5 an5Var8 = an5VarArr2[i4];
            fArr[0] = an5Var8.b;
            fArr[1] = an5Var8.c;
            matrixArr5[i4].mapPoints(fArr);
            if (i4 != 1 && i4 != 3) {
                Math.abs(rectF.centerY() - fArr[1]);
            } else {
                Math.abs(rectF.centerX() - fArr[0]);
            }
            an5Var5.d(0.0f, 270.0f, 0.0f);
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        nr1Var = pm5Var.k;
                    } else {
                        nr1Var = pm5Var.j;
                    }
                } else {
                    nr1Var = pm5Var.m;
                }
            } else {
                nr1Var = pm5Var.l;
            }
            nr1Var.getClass();
            an5Var5.c(max, 0.0f);
            path4.reset();
            an5Var5.b(matrixArr4[i4], path4);
            if (!i(path4, i4) && !i(path4, i6)) {
                an5Var5.b(matrixArr4[i4], path);
            } else {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = an5Var5.a;
                matrixArr4[i4].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                an5Var5.b(matrixArr4[i4], path2);
            }
            if (eo3Var != null) {
                Matrix matrix2 = matrixArr4[i4];
                eo3Var2 = eo3Var;
                go3 go3Var2 = (go3) eo3Var2.y;
                z2 = false;
                go3Var2.e.set(i4 + 4, false);
                zm5[] zm5VarArr2 = go3Var2.d;
                an5Var5.a(an5Var5.e);
                zm5VarArr2[i4] = new um5(new ArrayList(an5Var5.g), new Matrix(matrix2));
            } else {
                eo3Var2 = eo3Var;
                z2 = false;
            }
            z = z2;
            eo3Var3 = eo3Var2;
            i4 = i5;
            an5VarArr = an5VarArr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public void b() {
        this.a = null;
        this.b = null;
        z44 z44Var = (z44) this.c;
        z44Var.h();
        ((q44) this.g).b();
        this.d = z44Var;
        ((z44) this.e).h();
        ((z44) this.f).h();
        this.h = null;
        this.j = null;
        this.k = null;
    }

    public void c() {
        Set set = (Set) this.a;
        if (set != null && !set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    c25 c25Var = (c25) it.next();
                    it.remove();
                    c25Var.a();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public void d() {
        z44 z44Var = (z44) this.c;
        z44 z44Var2 = (z44) this.e;
        Set set = (Set) this.a;
        if (set != null) {
            this.i = null;
            byte b = 28;
            if (z44Var2.z != 0) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    q44 q44Var = (q44) this.h;
                    int i = z44Var2.z;
                    while (true) {
                        i--;
                        if (-1 >= i) {
                            break;
                        }
                        Object obj = z44Var2.x[i];
                        try {
                            if (obj instanceof od2) {
                                c25 c25Var = ((od2) obj).a;
                                set.remove(c25Var);
                                c25Var.b();
                            }
                            if (obj instanceof it0) {
                                if (q44Var != null && q44Var.c(obj)) {
                                    ((it0) obj).a();
                                } else {
                                    ((it0) obj).c();
                                }
                            }
                        } catch (Throwable th) {
                            tu0 tu0Var = (tu0) this.b;
                            if (tu0Var != null) {
                                iv.Q(th, new n(tu0Var, obj, b));
                            }
                            throw th;
                        }
                    }
                } finally {
                    Trace.endSection();
                }
            }
            if (z44Var.z != 0) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    Set set2 = (Set) this.a;
                    if (set2 != null) {
                        Object[] objArr = z44Var.x;
                        int i2 = z44Var.z;
                        for (int i3 = 0; i3 < i2; i3++) {
                            od2 od2Var = (od2) objArr[i3];
                            c25 c25Var2 = od2Var.a;
                            set2.remove(c25Var2);
                            try {
                                c25Var2.c();
                            } catch (Throwable th2) {
                                tu0 tu0Var2 = (tu0) this.b;
                                if (tu0Var2 != null) {
                                    iv.Q(th2, new n(tu0Var2, od2Var, b));
                                }
                                throw th2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public void e() {
        z44 z44Var = (z44) this.f;
        if (z44Var.z != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = z44Var.x;
                int i = z44Var.z;
                for (int i2 = 0; i2 < i; i2++) {
                    ((sb2) objArr[i2]).invoke();
                }
                z44Var.h();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void f(od2 od2Var) {
        z44 z44Var = (z44) this.c;
        if (((q44) this.g).c(od2Var)) {
            ((q44) this.g).l(od2Var);
            if (!((z44) this.d).k(od2Var) && !z44Var.k(od2Var)) {
                g(od2Var, z44Var);
            }
            Set set = (Set) this.a;
            if (set != null) {
                set.add(od2Var.a);
                return;
            }
            return;
        }
        q44 q44Var = (q44) this.i;
        if (q44Var != null && q44Var.c(od2Var)) {
            return;
        }
        ((z44) this.e).b(od2Var);
    }

    public boolean i(Path path, int i) {
        Path path2 = (Path) this.k;
        path2.reset();
        ((an5[]) this.a)[i].b(((Matrix[]) this.b)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    public void j(Set set, tu0 tu0Var) {
        b();
        this.a = set;
        this.b = tu0Var;
    }
}
