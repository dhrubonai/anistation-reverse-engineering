package defpackage;

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
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jm4 extends HandlerThread implements Handler.Callback {
    public RuntimeException A;
    public km4 B;
    public zq1 x;
    public Handler y;
    public Error z;

    public final void a(int i) {
        boolean z;
        boolean z2;
        int[] iArr;
        boolean z3;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        boolean z4;
        this.x.getClass();
        zq1 zq1Var = this.x;
        int[] iArr3 = zq1Var.y;
        boolean z5 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z = true;
        } else {
            z = false;
        }
        a34.q("eglGetDisplay failed", z);
        int[] iArr4 = new int[2];
        a34.q("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr4, 0, iArr4, 1));
        zq1Var.z = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr5 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, zq1.D, 0, eGLConfigArr, 0, 1, iArr5, 0);
        if (eglChooseConfig && iArr5[0] > 0 && eGLConfigArr[0] != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr5[0]), eGLConfigArr[0]};
        String str = eq6.a;
        a34.q(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z2);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLDisplay eGLDisplay = zq1Var.z;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        a34.q("eglCreateContext failed", z3);
        zq1Var.A = eglCreateContext;
        EGLDisplay eGLDisplay2 = zq1Var.z;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
            if (eglCreatePbufferSurface != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            a34.q("eglCreatePbufferSurface failed", z4);
        }
        a34.q("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        zq1Var.B = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr3, 0);
        a34.p();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        zq1Var.C = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(zq1Var);
        SurfaceTexture surfaceTexture2 = this.x.C;
        surfaceTexture2.getClass();
        if (i != 0) {
            z5 = true;
        }
        this.B = new km4(this, surfaceTexture2, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.x.getClass();
        zq1 zq1Var = this.x;
        zq1Var.x.removeCallbacks(zq1Var);
        try {
            SurfaceTexture surfaceTexture = zq1Var.C;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, zq1Var.y, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = zq1Var.z;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = zq1Var.z;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = zq1Var.B;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(zq1Var.z, zq1Var.B);
            }
            EGLContext eGLContext = zq1Var.A;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(zq1Var.z, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = zq1Var.z;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(zq1Var.z);
            }
            zq1Var.z = null;
            zq1Var.A = null;
            zq1Var.B = null;
            zq1Var.C = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i == 2) {
                    try {
                        b();
                        return true;
                    } catch (Throwable th) {
                        try {
                            kb0.t("PlaceholderSurface", "Failed to release placeholder surface", th);
                            return true;
                        } finally {
                            quit();
                        }
                    }
                }
            } else {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e) {
                    kb0.t("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.z = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    kb0.t("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.A = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (ze2 e3) {
                    kb0.t("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.A = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
