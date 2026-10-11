package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gq6 extends Animatable2.AnimationCallback {
    public final /* synthetic */ sb2 a;
    public final /* synthetic */ sb2 b;

    public gq6(sb2 sb2Var, sb2 sb2Var2) {
        this.a = sb2Var;
        this.b = sb2Var2;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        sb2 sb2Var = this.b;
        if (sb2Var != null) {
            sb2Var.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        sb2 sb2Var = this.a;
        if (sb2Var != null) {
            sb2Var.invoke();
        }
    }
}
