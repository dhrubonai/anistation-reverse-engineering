package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a9 {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ e9 d;

    public a9(e9 e9Var) {
        this.d = e9Var;
    }

    public static /* synthetic */ void b(a9 a9Var, float f) {
        a9Var.a(f, 0.0f);
    }

    public final void a(float f, float f2) {
        boolean z;
        Object obj;
        float f3;
        e9 e9Var = this.d;
        ti4 ti4Var = e9Var.c;
        pi4 pi4Var = e9Var.f;
        float h = pi4Var.h();
        pi4Var.i(f);
        e9Var.g.i(f2);
        if (!Float.isNaN(h)) {
            if (f >= h) {
                z = true;
            } else {
                z = false;
            }
            if (pi4Var.h() == e9Var.b().c(ti4Var.getValue())) {
                float h2 = pi4Var.h();
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = -1.0f;
                }
                Object b = e9Var.b().b(h2 + f3, z);
                if (b == null) {
                    b = ti4Var.getValue();
                }
                if (z) {
                    this.a = ti4Var.getValue();
                    this.b = b;
                } else {
                    this.a = b;
                    this.b = ti4Var.getValue();
                }
            } else {
                Object b2 = e9Var.b().b(pi4Var.h(), false);
                if (b2 == null) {
                    b2 = ti4Var.getValue();
                }
                Object b3 = e9Var.b().b(pi4Var.h(), true);
                if (b3 == null) {
                    b3 = ti4Var.getValue();
                }
                this.a = b2;
                this.b = b3;
            }
            y71 b4 = e9Var.b();
            Object obj2 = this.a;
            obj2.getClass();
            float c = b4.c(obj2);
            y71 b5 = e9Var.b();
            Object obj3 = this.b;
            obj3.getClass();
            this.c = Math.abs(c - b5.c(obj3));
            if (Math.abs(pi4Var.h() - e9Var.b().c(ti4Var.getValue())) >= this.c / 2.0f) {
                if (z) {
                    obj = this.b;
                } else {
                    obj = this.a;
                }
                if (obj == null) {
                    obj = ti4Var.getValue();
                }
                ti4Var.setValue(obj);
            }
        }
    }
}
