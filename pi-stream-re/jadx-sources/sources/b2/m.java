package b2;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes.dex */
public final class m extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public f1.e f1376a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f1377b;

    /* renamed from: c, reason: collision with root package name */
    public Error f1378c;

    /* renamed from: d, reason: collision with root package name */
    public RuntimeException f1379d;

    /* renamed from: e, reason: collision with root package name */
    public n f1380e;

    public m() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final void a(int i10) {
        boolean z9;
        boolean z10;
        int[] iArr;
        boolean z11;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        boolean z12;
        this.f1376a.getClass();
        f1.e eVar = this.f1376a;
        eVar.getClass();
        boolean z13 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        j5.a.h("eglGetDisplay failed", z9);
        int[] iArr3 = new int[2];
        j5.a.h("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1));
        eVar.f3821c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr4 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f1.e.f3818x, 0, eGLConfigArr, 0, 1, iArr4, 0);
        if (eglChooseConfig && iArr4[0] > 0 && eGLConfigArr[0] != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        j5.a.h(f1.b0.m("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLDisplay eGLDisplay = eVar.f3821c;
        if (i10 == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        j5.a.h("eglCreateContext failed", z11);
        eVar.f3822d = eglCreateContext;
        EGLDisplay eGLDisplay2 = eVar.f3821c;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i10 == 2) {
                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
            if (eglCreatePbufferSurface != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            j5.a.h("eglCreatePbufferSurface failed", z12);
        }
        j5.a.h("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        eVar.f3823e = eglCreatePbufferSurface;
        int[] iArr5 = eVar.f3820b;
        GLES20.glGenTextures(1, iArr5, 0);
        j5.a.g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
        eVar.f3824f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(eVar);
        SurfaceTexture surfaceTexture2 = this.f1376a.f3824f;
        surfaceTexture2.getClass();
        if (i10 != 0) {
            z13 = true;
        }
        this.f1380e = new n(this, surfaceTexture2, z13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f1376a.getClass();
        f1.e eVar = this.f1376a;
        eVar.f3819a.removeCallbacks(eVar);
        try {
            SurfaceTexture surfaceTexture = eVar.f3824f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, eVar.f3820b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = eVar.f3821c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = eVar.f3821c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = eVar.f3823e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(eVar.f3821c, eVar.f3823e);
            }
            EGLContext eGLContext = eVar.f3822d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eVar.f3821c, eGLContext);
            }
            if (f1.b0.f3799a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = eVar.f3821c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(eVar.f3821c);
            }
            eVar.f3821c = null;
            eVar.f3822d = null;
            eVar.f3823e = null;
            eVar.f3824f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (f1.h e10) {
                f1.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.f1379d = new IllegalStateException(e10);
                synchronized (this) {
                    notify();
                }
            } catch (Error e11) {
                f1.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.f1378c = e11;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e12) {
                f1.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                this.f1379d = e12;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
