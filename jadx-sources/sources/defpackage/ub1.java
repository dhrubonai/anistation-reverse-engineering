package defpackage;

import android.opengl.EGLDisplay;
import android.opengl.GLES20;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ub1 implements ss6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yb1 b;

    public /* synthetic */ ub1(yb1 yb1Var, byte b) {
        this.a = b;
        this.b = yb1Var;
    }

    @Override // defpackage.ss6
    public final void run() {
        byte b = this.a;
        yb1 yb1Var = this.b;
        switch (b) {
            case 0:
                yb1Var.c();
                return;
            case 1:
                yb1Var.getClass();
                try {
                    st3 st3Var = yb1Var.d;
                    st3Var.getClass();
                    try {
                        re2 re2Var = (re2) st3Var.z;
                        if (re2Var != null) {
                            GLES20.glDeleteProgram(re2Var.a);
                            a34.p();
                        }
                    } catch (ze2 e) {
                        kb0.t("CompositorGlProgram", "Error releasing GL Program", e);
                    }
                    yb1Var.h.b();
                    a34.Q(yb1Var.m, yb1Var.n);
                    return;
                } catch (ze2 e2) {
                    kb0.t("DefaultVideoCompositor", "Error releasing GL resources", e2);
                    return;
                }
            default:
                EGLDisplay Y = a34.Y();
                yb1Var.m = Y;
                yb1Var.n = a34.N(yb1Var.c.l(Y, 2, a34.h), yb1Var.m);
                return;
        }
    }
}
