package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class an5 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public an5() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 > 180.0f) {
                return;
            }
            float f4 = this.b;
            float f5 = this.c;
            wm5 wm5Var = new wm5(f4, f5, f4, f5);
            wm5Var.f = this.d;
            wm5Var.g = f3;
            this.g.add(new um5(wm5Var));
            this.d = f;
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ym5) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ym5, xm5, java.lang.Object] */
    public final void c(float f, float f2) {
        ?? ym5Var = new ym5();
        ym5Var.b = f;
        ym5Var.c = f2;
        this.f.add(ym5Var);
        vm5 vm5Var = new vm5(ym5Var, this.b, this.c);
        float a = vm5Var.a() + 270.0f;
        float a2 = vm5Var.a() + 270.0f;
        a(a);
        this.g.add(vm5Var);
        this.d = a2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
