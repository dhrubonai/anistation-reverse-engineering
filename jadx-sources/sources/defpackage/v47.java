package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v47 extends AnimatorListenerAdapter {
    public final /* synthetic */ c57 a;
    public final /* synthetic */ View b;

    public v47(c57 c57Var, View view) {
        this.a = c57Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c57 c57Var = this.a;
        c57Var.a.e(1.0f);
        y47.f(c57Var, this.b);
    }
}
