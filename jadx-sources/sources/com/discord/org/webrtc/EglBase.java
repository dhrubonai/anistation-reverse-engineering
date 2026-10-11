package com.discord.org.webrtc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.discord.org.webrtc.EglBase10;
import com.discord.org.webrtc.EglBase10Impl;
import com.discord.org.webrtc.EglBase14;
import com.discord.org.webrtc.EglBase14Impl;
import defpackage.qx1;
import defpackage.ze0;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface EglBase {
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES3_BIT = 64;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final Object lock = new Object();
    public static final int[] CONFIG_PLAIN = configBuilder().createConfigAttributes();
    public static final int[] CONFIG_RGBA = configBuilder().setHasAlphaChannel(true).createConfigAttributes();
    public static final int[] CONFIG_PIXEL_BUFFER = configBuilder().setSupportsPixelBuffer(true).createConfigAttributes();
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = configBuilder().setHasAlphaChannel(true).setSupportsPixelBuffer(true).createConfigAttributes();
    public static final int[] CONFIG_RECORDABLE = configBuilder().setIsRecordable(true).createConfigAttributes();

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static class ConfigBuilder {
        private boolean hasAlphaChannel;
        private boolean isRecordable;
        private int openGlesVersion = 2;
        private boolean supportsPixelBuffer;

        public int[] createConfigAttributes() {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(12324);
            arrayList.add(8);
            arrayList.add(12323);
            arrayList.add(8);
            arrayList.add(12322);
            arrayList.add(8);
            if (this.hasAlphaChannel) {
                arrayList.add(12321);
                arrayList.add(8);
            }
            int i2 = this.openGlesVersion;
            if (i2 == 2 || i2 == 3) {
                arrayList.add(12352);
                if (this.openGlesVersion == 3) {
                    i = 64;
                } else {
                    i = 4;
                }
                arrayList.add(Integer.valueOf(i));
            }
            if (this.supportsPixelBuffer) {
                arrayList.add(12339);
                arrayList.add(1);
            }
            if (this.isRecordable) {
                arrayList.add(Integer.valueOf(EglBase.EGL_RECORDABLE_ANDROID));
                arrayList.add(1);
            }
            arrayList.add(12344);
            int[] iArr = new int[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
            }
            return iArr;
        }

        public ConfigBuilder setHasAlphaChannel(boolean z) {
            this.hasAlphaChannel = z;
            return this;
        }

        public ConfigBuilder setIsRecordable(boolean z) {
            this.isRecordable = z;
            return this;
        }

        public ConfigBuilder setOpenGlesVersion(int i) {
            if (i >= 1 && i <= 3) {
                this.openGlesVersion = i;
                return this;
            }
            ze0.k(qx1.i(i, "OpenGL ES version ", " not supported"));
            return null;
        }

        public ConfigBuilder setSupportsPixelBuffer(boolean z) {
            this.supportsPixelBuffer = z;
            return this;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public interface Context {
        public static final long NO_CONTEXT = 0;

        long getNativeEglContext();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public interface EglConnection extends RefCounted {
        static EglConnection create(Context context, int[] iArr) {
            if (context == null) {
                return createEgl14(iArr);
            }
            if (context instanceof EglBase14.Context) {
                return new EglBase14Impl.EglConnection(((EglBase14.Context) context).getRawContext(), iArr);
            }
            if (context instanceof EglBase10.Context) {
                return new EglBase10Impl.EglConnection(((EglBase10.Context) context).getRawContext(), iArr);
            }
            ze0.k("Unrecognized Context");
            return null;
        }

        static EglConnection createEgl10(int[] iArr) {
            return new EglBase10Impl.EglConnection(null, iArr);
        }

        static EglConnection createEgl14(int[] iArr) {
            return new EglBase14Impl.EglConnection(null, iArr);
        }
    }

    static ConfigBuilder configBuilder() {
        return new ConfigBuilder();
    }

    static EglBase create(EglConnection eglConnection) {
        if (eglConnection == null) {
            return create();
        }
        if (eglConnection instanceof EglBase14Impl.EglConnection) {
            return new EglBase14Impl((EglBase14Impl.EglConnection) eglConnection);
        }
        if (eglConnection instanceof EglBase10Impl.EglConnection) {
            return new EglBase10Impl((EglBase10Impl.EglConnection) eglConnection);
        }
        ze0.k("Unrecognized EglConnection");
        return null;
    }

    static EglBase10 createEgl10(EglBase10.Context context, int[] iArr) {
        EGLContext rawContext;
        if (context == null) {
            rawContext = null;
        } else {
            rawContext = context.getRawContext();
        }
        return new EglBase10Impl(rawContext, iArr);
    }

    static EglBase14 createEgl14(EglBase14.Context context, int[] iArr) {
        android.opengl.EGLContext rawContext;
        if (context == null) {
            rawContext = null;
        } else {
            rawContext = context.getRawContext();
        }
        return new EglBase14Impl(rawContext, iArr);
    }

    static int getOpenGlesVersionFromConfig(int[] iArr) {
        for (int i = 0; i < iArr.length - 1; i++) {
            if (iArr[i] == 12352) {
                int i2 = iArr[i + 1];
                if (i2 != 4) {
                    if (i2 != 64) {
                        return 1;
                    }
                    return 3;
                }
                return 2;
            }
        }
        return 1;
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i, int i2);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j);

    static EglBase10 createEgl10(int[] iArr) {
        return new EglBase10Impl(null, iArr);
    }

    static EglBase14 createEgl14(int[] iArr) {
        return new EglBase14Impl(null, iArr);
    }

    static EglBase10 createEgl10(EGLContext eGLContext, int[] iArr) {
        return new EglBase10Impl(eGLContext, iArr);
    }

    static EglBase14 createEgl14(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14Impl(eGLContext, iArr);
    }

    static EglBase create(Context context, int[] iArr) {
        if (context == null) {
            return createEgl14(iArr);
        }
        if (context instanceof EglBase14.Context) {
            return createEgl14((EglBase14.Context) context, iArr);
        }
        if (context instanceof EglBase10.Context) {
            return createEgl10((EglBase10.Context) context, iArr);
        }
        ze0.k("Unrecognized Context");
        return null;
    }

    static EglBase create() {
        return create(null, CONFIG_PLAIN);
    }

    static EglBase create(Context context) {
        return create(context, CONFIG_PLAIN);
    }
}
