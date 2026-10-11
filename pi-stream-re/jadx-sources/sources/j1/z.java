package j1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class z implements b2.f0, l1.s, x1.e, t1.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f5932a;

    public z(d0 d0Var) {
        this.f5932a = d0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        d0 d0Var = this.f5932a;
        d0Var.getClass();
        Surface surface = new Surface(surfaceTexture);
        d0Var.Z(surface);
        d0Var.P = surface;
        d0Var.O(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d0 d0Var = this.f5932a;
        d0Var.Z(null);
        d0Var.O(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f5932a.O(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f5932a.O(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        d0 d0Var = this.f5932a;
        if (d0Var.S) {
            d0Var.Z(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        d0 d0Var = this.f5932a;
        if (d0Var.S) {
            d0Var.Z(null);
        }
        d0Var.O(0, 0);
    }
}
