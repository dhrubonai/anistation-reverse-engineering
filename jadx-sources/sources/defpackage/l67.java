package defpackage;

import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l67 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View x;
    public final /* synthetic */ h05 y;

    public l67(View view, h05 h05Var) {
        this.x = view;
        this.y = h05Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.x.removeOnAttachStateChangeListener(this);
        this.y.A();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
