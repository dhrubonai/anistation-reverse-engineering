package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hp1 implements Drawable.Callback {
    public final /* synthetic */ ip1 x;

    public hp1(ip1 ip1Var) {
        this.x = ip1Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        ip1 ip1Var = this.x;
        ti4 ti4Var = ip1Var.D;
        ti4Var.setValue(Integer.valueOf(((Number) ti4Var.getValue()).intValue() + 1));
        ip1Var.E.setValue(new uq5(jp1.a(ip1Var.C)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) jp1.a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) jp1.a.getValue()).removeCallbacks(runnable);
    }
}
