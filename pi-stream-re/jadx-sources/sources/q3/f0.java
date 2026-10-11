package q3;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class f0 extends e0 {
    @Override // q3.c0
    public final void A(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // q3.d0
    public final void B(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // q3.e0, w1.o
    public final void v(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // q3.b0
    public final float x(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // q3.b0
    public final void y(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // q3.c0
    public final void z(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
