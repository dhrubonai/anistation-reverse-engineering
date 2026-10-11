package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yp4 extends SurfaceView {
    public final /* synthetic */ w44 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp4(Context context, w44 w44Var) {
        super(context);
        this.x = w44Var;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34) {
            w44 w44Var = this.x;
            SurfaceSyncGroup n = nj2.n(w44Var.getValue());
            if (n != null) {
                n.markSyncReady();
            }
            w44Var.setValue(null);
        }
    }
}
