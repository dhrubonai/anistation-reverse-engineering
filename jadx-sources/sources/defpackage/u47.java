package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u47 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ c57 a;
    public final /* synthetic */ v57 b;
    public final /* synthetic */ v57 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public u47(c57 c57Var, v57 v57Var, v57 v57Var2, int i, View view) {
        this.a = c57Var;
        this.b = v57Var;
        this.c = v57Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        j57 d57Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        c57 c57Var = this.a;
        b57 b57Var = c57Var.a;
        b57Var.e(animatedFraction);
        float c = b57Var.c();
        PathInterpolator pathInterpolator = y47.e;
        int i = Build.VERSION.SDK_INT;
        v57 v57Var = this.b;
        if (i >= 36) {
            d57Var = new i57(v57Var);
        } else if (i >= 35) {
            d57Var = new h57(v57Var);
        } else if (i >= 34) {
            d57Var = new g57(v57Var);
        } else if (i >= 31) {
            d57Var = new f57(v57Var);
        } else if (i >= 30) {
            d57Var = new e57(v57Var);
        } else {
            d57Var = new d57(v57Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            s57 s57Var = v57Var.a;
            if (i3 == 0) {
                d57Var.d(i2, s57Var.i(i2));
            } else {
                yz2 i4 = s57Var.i(i2);
                yz2 i5 = this.c.a.i(i2);
                float f = 1.0f - c;
                d57Var.d(i2, v57.a(i4, (int) (((i4.a - i5.a) * f) + 0.5d), (int) (((i4.b - i5.b) * f) + 0.5d), (int) (((i4.c - i5.c) * f) + 0.5d), (int) (((i4.d - i5.d) * f) + 0.5d)));
            }
        }
        y47.h(this.e, d57Var.b(), Collections.singletonList(c57Var));
    }
}
