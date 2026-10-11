package f1;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* loaded from: classes.dex */
public abstract class g {
    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        StringBuilder a10 = p.j.a(str, ", error code: 0x");
        a10.append(Integer.toHexString(eglGetError));
        throw new h(a10.toString());
    }

    public static EGLContext b(EGLContext eGLContext, EGLDisplay eGLDisplay, int i10, int[] iArr) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, k(eGLDisplay, iArr), eGLContext, new int[]{12440, i10, 12344}, 0);
        if (eglCreateContext != null) {
            j5.a.g();
            return eglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new h(a3.g.n("eglCreateContext() failed to create a valid context. The device may not support EGL version ", i10));
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, k(eGLDisplay, iArr), iArr2, 0);
        a("Error creating a new EGL Pbuffer surface");
        return eglCreatePbufferSurface;
    }

    public static EGLSurface d(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, k(eGLDisplay, iArr), obj, iArr2, 0);
        a("Error creating a new EGL surface");
        return eglCreateWindowSurface;
    }

    public static void e(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (eGLDisplay == null) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        a("Error releasing context");
        if (eGLContext != null) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            a("Error destroying context");
        }
        EGL14.eglReleaseThread();
        a("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        a("Error terminating display");
    }

    public static void f(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        if (eGLDisplay == null || eGLSurface == null || EGL14.eglGetCurrentSurface(12377) == EGL14.EGL_NO_SURFACE) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        a("Error destroying surface");
    }

    public static void g(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        a("Error making context current");
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i10) {
            GLES20.glBindFramebuffer(36160, i10);
        }
        j5.a.g();
        GLES20.glViewport(0, 0, i11, i12);
        j5.a.g();
    }

    public static int h() {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        j5.a.g();
        return iArr[0];
    }

    public static EGLContext i() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay j() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        j5.a.h("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        j5.a.h("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        j5.a.g();
        return eglGetDisplay;
    }

    private static EGLConfig k(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new h("eglChooseConfig failed.");
    }

    public static boolean l(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (eglQueryString == null || !eglQueryString.contains(str)) {
            return false;
        }
        return true;
    }
}
