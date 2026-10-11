package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface oe2 {
    we2 J(int i, int i2, int i3);

    EGLSurface K(EGLContext eGLContext, EGLDisplay eGLDisplay);

    void P(EGLDisplay eGLDisplay);

    EGLContext l(EGLDisplay eGLDisplay, int i, int[] iArr);

    EGLSurface w(EGLDisplay eGLDisplay, Object obj, int i, boolean z);
}
