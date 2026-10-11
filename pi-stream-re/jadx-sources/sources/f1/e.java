package f1;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* loaded from: classes.dex */
public final class e implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3818x = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3819a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3820b = new int[1];

    /* renamed from: c, reason: collision with root package name */
    public EGLDisplay f3821c;

    /* renamed from: d, reason: collision with root package name */
    public EGLContext f3822d;

    /* renamed from: e, reason: collision with root package name */
    public EGLSurface f3823e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceTexture f3824f;

    public e(Handler handler) {
        this.f3819a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f3819a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f3824f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
