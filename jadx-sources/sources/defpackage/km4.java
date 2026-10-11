package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class km4 extends Surface {
    public static int A;
    public static boolean B;
    public final boolean x;
    public final jm4 y;
    public boolean z;

    public km4(jm4 jm4Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.y = jm4Var;
        this.x = z;
    }

    public static synchronized boolean a() {
        boolean z;
        int i;
        synchronized (km4.class) {
            try {
                z = false;
                if (!B) {
                    try {
                    } catch (ze2 e) {
                        kb0.s("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
                    }
                    if (a34.i0("EGL_EXT_protected_content")) {
                        if (a34.i0("EGL_KHR_surfaceless_context")) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        A = i;
                        B = true;
                    }
                    i = 0;
                    A = i;
                    B = true;
                }
                if (A != 0) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.y) {
            try {
                if (!this.z) {
                    jm4 jm4Var = this.y;
                    jm4Var.y.getClass();
                    jm4Var.y.sendEmptyMessage(2);
                    this.z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
