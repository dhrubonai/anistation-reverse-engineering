package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class zd2 implements aj6, m91, k76 {
    private boolean isStarted;

    @Override // defpackage.aj6
    public abstract Drawable getDrawable();

    @Override // defpackage.aj6
    public abstract View getView();

    @Override // defpackage.k76
    public void onError(mu2 mu2Var) {
        updateImage(mu2Var);
    }

    @Override // defpackage.m91
    public void onStart(og3 og3Var) {
        this.isStarted = true;
        updateAnimation();
    }

    @Override // defpackage.m91
    public void onStop(og3 og3Var) {
        this.isStarted = false;
        updateAnimation();
    }

    @Override // defpackage.k76
    public void onSuccess(mu2 mu2Var) {
        updateImage(mu2Var);
    }

    public abstract void setDrawable(Drawable drawable);

    public final void updateAnimation() {
        Animatable animatable;
        Object drawable = getDrawable();
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void updateImage(mu2 mu2Var) {
        Drawable drawable;
        Animatable animatable = null;
        if (mu2Var != null) {
            drawable = sw0.f(mu2Var, getView().getResources());
        } else {
            drawable = null;
        }
        Object drawable2 = getDrawable();
        if (drawable2 instanceof Animatable) {
            animatable = (Animatable) drawable2;
        }
        if (animatable != null) {
            animatable.stop();
        }
        setDrawable(drawable);
        updateAnimation();
    }

    @Override // defpackage.k76
    public void onStart(mu2 mu2Var) {
        updateImage(mu2Var);
    }
}
