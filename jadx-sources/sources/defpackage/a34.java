package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import com.anistation.model.Anime;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a34 {
    public static final q18 b;
    public static final q18 c;
    public static final q18 d;
    public static final q18 e;
    public static final q18 f;
    public static final q12 v;
    public static final q12[] w;
    public static final b3 a = new b3(22);
    public static final os0 g = new os0(641200809, false, new ys0(1));
    public static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] i = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] j = {12445, 13120, 12344, 12344};
    public static final int[] k = {12445, 13632, 12344, 12344};
    public static final int[] l = {12344};
    public static final String[] m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] n = {44100, 48000, 32000};
    public static final int[] o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final kw4 t = new kw4(new qa4(16));
    public static final oe6 u = new oe6(0, new long[0], new Object[0]);

    static {
        byte b2 = 17;
        b = new q18(b2);
        c = new q18(b2);
        d = new q18(b2);
        e = new q18(b2);
        f = new q18(b2);
        q12 q12Var = new q12("CLIENT_TELEMETRY", -1, 1L, false);
        v = q12Var;
        w = new q12[]{q12Var};
    }

    public static void A(String str, boolean z) {
        if (z) {
            return;
        }
        ze0.m(str);
    }

    public static void B() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        p();
    }

    public static final void C(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                n03.i(th, th2);
            }
        }
    }

    public static int D(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        if (i2 == i3) {
            return 0;
        }
        return 1;
    }

    public static int E(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        if (j2 == j3) {
            return 0;
        }
        return 1;
    }

    public static final float F(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static Parcelable G(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] H(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = iArr[i2];
            }
            return jArr;
        }
        if (serializable instanceof long[]) {
            return (long[]) serializable;
        }
        return null;
    }

    public static float[] I() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static final sb2 J(ub2 ub2Var, kd2 kd2Var, int i2) {
        boolean z;
        int hashCode = Long.hashCode(kd2Var.T);
        Context context = (Context) kd2Var.j(eb.b);
        id2 O = h98.O(kd2Var);
        n95 n95Var = (n95) kd2Var.j(p95.a);
        View view = (View) kd2Var.j(eb.f);
        boolean h2 = kd2Var.h(context);
        if ((((i2 & 14) ^ 6) > 4 && kd2Var.f(ub2Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        boolean h3 = z | h2 | kd2Var.h(O) | kd2Var.h(n95Var) | kd2Var.d(hashCode) | kd2Var.h(view);
        Object Q = kd2Var.Q();
        if (h3 || Q == au0.a) {
            Object ngVar = new ng(context, ub2Var, O, n95Var, hashCode, view);
            kd2Var.n0(ngVar);
            Q = ngVar;
        }
        return (sb2) Q;
    }

    public static FloatBuffer K(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static EGLContext L(EGLContext eGLContext, EGLDisplay eGLDisplay, int i2, int[] iArr) {
        boolean z;
        boolean z2 = true;
        if (!Arrays.equals(iArr, h) && !Arrays.equals(iArr, i)) {
            z = false;
        } else {
            z = true;
        }
        io3.n(z);
        if (i2 != 2 && i2 != 3) {
            z2 = false;
        }
        io3.n(z2);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, Z(eGLDisplay, iArr), eGLContext, new int[]{12440, i2, 12344}, 0);
        if (eglCreateContext != null && !eglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            o("Error in createEglContext");
            return eglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new ze2(qx1.h(i2, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
    }

    public static final w62 M(v65 v65Var, boolean z, String[] strArr, ub2 ub2Var) {
        g10 g10Var;
        v65Var.getClass();
        i33 invalidationTracker = v65Var.getInvalidationTracker();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        invalidationTracker.getClass();
        jf7.K(invalidationTracker.a);
        ak6 ak6Var = invalidationTracker.c;
        ai4 j2 = ak6Var.j(strArr2);
        String[] strArr3 = (String[]) j2.x;
        int[] iArr = (int[]) j2.y;
        strArr3.getClass();
        iArr.getClass();
        vz0 vz0Var = null;
        byte b2 = 5;
        w42 mx0Var = new mx0(new j10(ak6Var, iArr, strArr3, vz0Var, (byte) 11), b2);
        l24 l24Var = invalidationTracker.k;
        if (l24Var != null) {
            g10Var = new g10(l24Var.h, strArr3, b2);
        } else {
            g10Var = null;
        }
        byte b3 = 1;
        byte b4 = 0;
        if (g10Var != null) {
            mx0Var = y52.a(mx0Var, g10Var);
        }
        return new w62(zz.l(new i52(new k52(new ji(invalidationTracker, vz0Var, b2), mx0Var), new g70(invalidationTracker, vz0Var, b3), b4), -1), v65Var, z, ub2Var);
    }

    public static EGLSurface N(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        EGLSurface eglCreatePbufferSurface;
        if (i0("EGL_KHR_surfaceless_context")) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, Z(eGLDisplay, h), new int[]{12375, 1, 12374, 1, 12344}, 0);
            o("Error creating a new EGL Pbuffer surface");
        }
        S(eGLDisplay, eGLContext, eglCreatePbufferSurface, 1, 1);
        return eglCreatePbufferSurface;
    }

    public static long O() {
        if (X() >= 3) {
            long glFenceSync = GLES30.glFenceSync(37143, 0);
            p();
            GLES20.glFlush();
            p();
            return glFenceSync;
        }
        return 0L;
    }

    public static void P(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            o("Error releasing context");
            if (eGLContext != null && !eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                o("Error destroying context");
            }
        }
    }

    public static void Q(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) && eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            o("Error destroying surface");
        }
    }

    public static int R(ByteBuffer byteBuffer, int i2, int i3) {
        int i4 = 0;
        while (i2 < i3) {
            int i5 = byteBuffer.get(i2) & 255;
            if (i4 >= 2 && i5 == 1) {
                return i2 - 2;
            }
            if (i5 == 0) {
                i4++;
            } else {
                i4 = 0;
            }
            i2++;
        }
        return i3;
    }

    public static void S(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3) {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        o("Error making context current");
        T(0, i2, i3);
        if (!eGLSurface.equals(EGL14.EGL_NO_SURFACE) && X() >= 3) {
            GLES30.glDrawBuffers(1, new int[]{1029}, 0);
            p();
            GLES30.glReadBuffer(1029);
            p();
        }
    }

    public static void T(int i2, int i3, int i4) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i2) {
            GLES20.glBindFramebuffer(36160, i2);
        }
        p();
        GLES20.glViewport(0, 0, i3, i4);
        p();
    }

    public static e41 U(byte[] bArr) {
        boolean z;
        bArr.getClass();
        if (bArr.length <= 10240) {
            if (bArr.length == 0) {
                return e41.b;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                byte[] bArr2 = new byte[2];
                byteArrayInputStream.read(bArr2);
                int i2 = 0;
                if (bArr2[0] == -84 && bArr2[1] == -19) {
                    z = true;
                } else {
                    z = false;
                }
                byteArrayInputStream.reset();
                if (z) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt = objectInputStream.readInt();
                        while (i2 < readInt) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i2++;
                        }
                        objectInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C(objectInputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short readShort = dataInputStream.readShort();
                        if (readShort == -21521) {
                            short readShort2 = dataInputStream.readShort();
                            if (readShort2 != 1) {
                                p65.f(qx1.h(readShort2, "Unsupported version number: "));
                            }
                        } else {
                            p65.f(qx1.h(readShort, "Magic number doesn't match: "));
                        }
                        int readInt2 = dataInputStream.readInt();
                        while (i2 < readInt2) {
                            linkedHashMap.put(dataInputStream.readUTF(), V(dataInputStream, dataInputStream.readByte()));
                            i2++;
                        }
                        dataInputStream.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            C(dataInputStream, th3);
                            throw th4;
                        }
                    }
                }
            } catch (IOException e2) {
                xk3.d().c(q51.a, "Error in Data#fromByteArray: ", e2);
            } catch (ClassNotFoundException e3) {
                xk3.d().c(q51.a, "Error in Data#fromByteArray: ", e3);
            }
            return new e41(linkedHashMap);
        }
        ze0.m("Data cannot occupy more than 10240 bytes when serialized");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String[], java.io.Serializable] */
    public static final Serializable V(DataInputStream dataInputStream, byte b2) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r0 = new Boolean[readInt];
            while (i2 < readInt) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        }
        if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r02 = new Byte[readInt2];
            while (i2 < readInt2) {
                r02[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r02;
        }
        if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r03 = new Integer[readInt3];
            while (i2 < readInt3) {
                r03[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r03;
        }
        if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r04 = new Long[readInt4];
            while (i2 < readInt4) {
                r04[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r04;
        }
        if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r05 = new Float[readInt5];
            while (i2 < readInt5) {
                r05[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r05;
        }
        if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r06 = new Double[readInt6];
            while (i2 < readInt6) {
                r06[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r06;
        }
        if (b2 == 14) {
            int readInt7 = dataInputStream.readInt();
            ?? r1 = new String[readInt7];
            while (i2 < readInt7) {
                String readUTF = dataInputStream.readUTF();
                if (i(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    readUTF = null;
                }
                r1[i2] = readUTF;
                i2++;
            }
            return r1;
        }
        ze0.m(qx1.h(b2, "Unsupported type "));
        return null;
    }

    public static final String W() {
        qq6 qq6Var;
        byte[] bArr = new byte[16];
        ff5.a.nextBytes(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b3 = (byte) (bArr[8] & 63);
        bArr[8] = b3;
        bArr[8] = (byte) (b3 | 128);
        long e2 = fy5.e(0, bArr);
        long e3 = fy5.e(8, bArr);
        if (e2 == 0 && e3 == 0) {
            qq6Var = qq6.z;
        } else {
            qq6Var = new qq6(e2, e3);
        }
        return qq6Var.toString();
    }

    public static long X() {
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, new int[1], 0);
        p();
        return r0[0];
    }

    public static EGLDisplay Y() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        q("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        q("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        o("Error in getDefaultEglDisplay");
        return eglGetDisplay;
    }

    public static EGLConfig Z(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new ze2("eglChooseConfig failed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.ub2 r17, defpackage.yz3 r18, defpackage.ub2 r19, defpackage.ub2 r20, defpackage.ub2 r21, defpackage.kd2 r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a34.a(ub2, yz3, ub2, ub2, ub2, kd2, int, int):void");
    }

    public static int a0(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i9 = n[i6];
        if (i3 == 2) {
            i9 /= 2;
        } else if (i3 == 0) {
            i9 /= 4;
        }
        int i10 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            if (i3 == 3) {
                i8 = o[i5 - 1];
            } else {
                i8 = p[i5 - 1];
            }
            return (((i8 * 12) / i9) + i10) * 4;
        }
        if (i3 == 3) {
            if (i4 == 2) {
                i7 = q[i5 - 1];
            } else {
                i7 = r[i5 - 1];
            }
        } else {
            i7 = s[i5 - 1];
        }
        int i11 = 144;
        if (i3 == 3) {
            return ((i7 * 144) / i9) + i10;
        }
        if (i4 == 1) {
            i11 = 72;
        }
        return ((i11 * i7) / i9) + i10;
    }

    public static final void b(ub2 ub2Var, yz3 yz3Var, ub2 ub2Var2, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        boolean z;
        kd2Var.f0(-1783766393);
        if (kd2Var.f(yz3Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i3 | i2;
        if (kd2Var.h(ub2Var2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i6 & 1, z)) {
            a(ub2Var, yz3Var, null, a, ub2Var2, kd2Var, (i6 & 112) | 3078 | ((i6 << 6) & 57344), 4);
        } else {
            kd2Var.Y();
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new df((Object) ub2Var, yz3Var, ub2Var2, i2, (byte) 1);
        }
    }

    public static boolean b0() {
        Object obj;
        try {
            if (oa.f1 == null) {
                oa.f1 = Class.forName("android.os.SystemProperties");
            }
            Method method = oa.g1;
            Boolean bool = null;
            if (method == null) {
                Class cls = oa.f1;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                } else {
                    method = null;
                }
                oa.g1 = method;
            }
            if (method != null) {
                obj = method.invoke(null, "debug.layout", Boolean.FALSE);
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            }
            return i(bool, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void c(int i2, ub2 ub2Var, kd2 kd2Var, yz3 yz3Var, Anime anime) {
        int i3;
        int i4;
        int i5;
        boolean z;
        anime.getClass();
        kd2Var.f0(-1283487557);
        if (kd2Var.h(anime)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (kd2Var.f(yz3Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (kd2Var.h(ub2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        byte b2 = 0;
        boolean z2 = true;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i8 & 1, z)) {
            Context context = (Context) kd2Var.j(eb.b);
            Object extraLarge = anime.getCoverImage().getExtraLarge();
            if (extraLarge == null) {
                extraLarge = anime.getCoverImage().getLarge();
            }
            boolean f2 = kd2Var.f(extraLarge) | kd2Var.f(context);
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (f2 || Q == obj) {
                bv2 bv2Var = new bv2(context);
                bv2Var.c = extraLarge;
                hv2.a(bv2Var, true);
                Q = bv2Var.a();
                kd2Var.n0(Q);
            }
            ev2 ev2Var = (ev2) Q;
            String b3 = e02.b(anime.getTitle());
            long j2 = ep0.b;
            yz3 e2 = ar5.e(ar5.n(yz3Var, 0.0f, 180.0f, 1), 275.0f);
            if ((i8 & 896) != 256) {
                z2 = false;
            }
            boolean h2 = kd2Var.h(anime) | z2;
            Object Q2 = kd2Var.Q();
            if (h2 || Q2 == obj) {
                Q2 = new em(ub2Var, anime, b2);
                kd2Var.n0(Q2);
            }
            l36.a(kb0.A(e2, false, null, null, false, (sb2) Q2, kd2Var, 0, 31), ((cn5) kd2Var.j(dn5.a)).c, ((mp0) kd2Var.j(op0.a)).p, 0L, 0.0f, 0.0f, null, nx7.R(-635121258, new fm(anime, ev2Var, j2, b3, (byte) 0), kd2Var), kd2Var, 12582912, 120);
        } else {
            kd2Var.Y();
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new gm(anime, yz3Var, ub2Var, i2);
        }
    }

    public static float[] c0() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static final void d(final ko koVar, final yz3 yz3Var, final xd6 xd6Var, final ub2 ub2Var, final int i2, final boolean z, final int i3, final int i4, final Map map, kd2 kd2Var, final int i5, final int i6) {
        int i7;
        xd6 xd6Var2;
        boolean z2;
        int i8;
        boolean z3;
        int i9;
        boolean z4;
        boolean z5;
        boolean h2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(-1343466571);
        if ((i5 & 6) == 0) {
            if (kd2Var2.f(koVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i7 = i19 | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            if (kd2Var2.f(yz3Var)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i7 |= i18;
        }
        if ((i5 & 384) == 0) {
            xd6Var2 = xd6Var;
            if (kd2Var2.f(xd6Var2)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i7 |= i17;
        } else {
            xd6Var2 = xd6Var;
        }
        if ((i5 & 3072) == 0) {
            if (kd2Var2.h(ub2Var)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i7 |= i16;
        }
        if ((i5 & 24576) == 0) {
            if (kd2Var2.d(i2)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i7 |= i15;
        }
        if ((196608 & i5) == 0) {
            z2 = z;
            if (kd2Var2.g(z2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i7 |= i14;
        } else {
            z2 = z;
        }
        if ((1572864 & i5) == 0) {
            if (kd2Var2.d(i3)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i7 |= i13;
        }
        if ((12582912 & i5) == 0) {
            if (kd2Var2.d(i4)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i7 |= i12;
        }
        if ((100663296 & i5) == 0) {
            if (kd2Var2.h(map)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i7 |= i11;
        }
        int i20 = i7 | 805306368;
        if ((i6 & 6) == 0) {
            if ((i6 & 8) == 0) {
                h2 = kd2Var2.f(null);
            } else {
                h2 = kd2Var2.h(null);
            }
            if (h2) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i8 = i6 | i10;
        } else {
            i8 = i6;
        }
        boolean z6 = false;
        if ((306783379 & i20) == 306783378 && (i8 & 3) == 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (kd2Var2.V(i20 & 1, z3)) {
            q23.X(i4, i3);
            if (kd2Var2.j(mh5.a) == null) {
                kd2Var2.e0(1588900273);
                kd2Var2.q(false);
                ai4 ai4Var = no.a;
                int length = koVar.y.length();
                List list = koVar.x;
                if (list != null) {
                    int size = list.size();
                    int i21 = 0;
                    while (i21 < size) {
                        jo joVar = (jo) list.get(i21);
                        i9 = i20;
                        if ((joVar.a instanceof cz5) && "androidx.compose.foundation.text.inlineContent".equals(joVar.d)) {
                            int i22 = joVar.b;
                            int i23 = joVar.c;
                            z6 = false;
                            if (lo.b(0, length, i22, i23)) {
                                z4 = true;
                                break;
                            }
                        } else {
                            z6 = false;
                        }
                        i21++;
                        i20 = i9;
                    }
                }
                i9 = i20;
                z4 = z6;
                boolean d2 = iz5.d(koVar);
                p82 p82Var = (p82) kd2Var2.j(bv0.k);
                if (!z4 && !d2) {
                    kd2Var2.e0(1589148149);
                    a50.a(koVar, xd6Var2, p82Var, null, z2, kd2Var2);
                    boolean z7 = z6;
                    yz3 q0 = q0(yz3Var, koVar, xd6Var, ub2Var, i2, z, i3, i4, p82Var, null, null, null);
                    yb ybVar = yb.g;
                    int hashCode = Long.hashCode(kd2Var2.T);
                    yz3 E = o80.E(kd2Var2, q0);
                    al4 l2 = kd2Var2.l();
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(za3.p0);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(p7.F, kd2Var2, ybVar);
                    ss5.i(p7.E, kd2Var2, l2);
                    ss5.h(kd2Var2);
                    ss5.i(p7.D, kd2Var2, E);
                    ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
                    kd2Var2.q(true);
                    kd2Var2.q(z7);
                    kd2Var2 = kd2Var2;
                } else {
                    boolean z8 = z6;
                    kd2Var2.e0(1590195670);
                    if ((i9 & 14) == 4) {
                        z5 = true;
                    } else {
                        z5 = z8;
                    }
                    Object Q = kd2Var2.Q();
                    Object obj = au0.a;
                    if (z5 || Q == obj) {
                        Q = xt5.g(koVar);
                        kd2Var2.n0(Q);
                    }
                    w44 w44Var = (w44) Q;
                    ko koVar2 = (ko) w44Var.getValue();
                    boolean f2 = kd2Var2.f(w44Var);
                    Object Q2 = kd2Var2.Q();
                    if (f2 || Q2 == obj) {
                        Q2 = new ef(w44Var, (byte) 2);
                        kd2Var2.n0(Q2);
                    }
                    int i24 = i9 << 6;
                    f(yz3Var, koVar2, ub2Var, z4, map, xd6Var, i2, z, i3, i4, p82Var, (ub2) Q2, kd2Var2, ((i9 >> 3) & 910) | ((i9 >> 12) & 57344) | ((i9 << 9) & 458752) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192), ((i9 >> 21) & 896) | (57344 & (i8 << 12)));
                    kd2Var2 = kd2Var2;
                    kd2Var2.q(z8);
                }
            } else {
                ov3.d();
                return;
            }
        } else {
            kd2Var2.Y();
        }
        zz4 u2 = kd2Var2.u();
        if (u2 != null) {
            u2.d = new ic2() { // from class: v40
                @Override // defpackage.ic2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int N = kb0.N(i5 | 1);
                    int N2 = kb0.N(i6);
                    ko koVar3 = ko.this;
                    yz3 yz3Var2 = yz3Var;
                    xd6 xd6Var3 = xd6Var;
                    ub2 ub2Var2 = ub2Var;
                    byte b2 = i2;
                    boolean z9 = z;
                    int i25 = i3;
                    boolean z10 = i4;
                    Map map2 = map;
                    a34.d(koVar3, yz3Var2, xd6Var3, ub2Var2, b2, z9, i25, z10 ? 1 : 0, map2, (kd2) obj2, N, N2);
                    return pn6.a;
                }
            };
        }
    }

    public static long d0(byte b2, byte b3) {
        int i2;
        int i3;
        int i4 = b2 & 255;
        int i5 = b2 & 3;
        if (i5 != 0) {
            i2 = 2;
            if (i5 != 1 && i5 != 2) {
                i2 = b3 & 63;
            }
        } else {
            i2 = 1;
        }
        int i6 = i4 >> 3;
        int i7 = i6 & 3;
        if (i6 >= 16) {
            i3 = UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL << i7;
        } else if (i6 >= 12) {
            i3 = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS << (i6 & 1);
        } else if (i7 == 3) {
            i3 = 60000;
        } else {
            i3 = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS << i7;
        }
        return i2 * i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.lang.String r20, final defpackage.yz3 r21, final defpackage.xd6 r22, int r23, boolean r24, final int r25, int r26, defpackage.kd2 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a34.e(java.lang.String, yz3, xd6, int, boolean, int, int, kd2, int, int):void");
    }

    public static final long e0(an1 an1Var) {
        DragEvent dragEvent = an1Var.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r39v0, types: [kd2] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [w44, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static final void f(final yz3 yz3Var, ko koVar, final ub2 ub2Var, final boolean z, final Map map, final xd6 xd6Var, final int i2, final boolean z2, final int i3, final int i4, final p82 p82Var, final ub2 ub2Var2, kd2 kd2Var, final int i5, final int i6) {
        int i7;
        int i8;
        boolean z3;
        hd6 hd6Var;
        boolean z4;
        n nVar;
        hd6 hd6Var2;
        sb2 sb2Var;
        ai4 ai4Var;
        ef efVar;
        ?? r9;
        boolean z5;
        Object obj;
        boolean z6;
        ?? r1;
        Object obj2;
        nt1 nt1Var;
        boolean z7;
        boolean z8;
        boolean h2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        final ko koVar2 = koVar;
        kd2Var.f0(-2118572703);
        if ((i5 & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i7 = i21 | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            if (kd2Var.f(koVar2)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i7 |= i20;
        }
        if ((i5 & 384) == 0) {
            if (kd2Var.h(ub2Var)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i7 |= i19;
        }
        int i22 = 1024;
        if ((i5 & 3072) == 0) {
            if (kd2Var.g(z)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i7 |= i18;
        }
        int i23 = 8192;
        if ((i5 & 24576) == 0) {
            if (kd2Var.h(map)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i7 |= i17;
        }
        if ((196608 & i5) == 0) {
            if (kd2Var.f(xd6Var)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i7 |= i16;
        }
        if ((i5 & 1572864) == 0) {
            if (kd2Var.d(i2)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i7 |= i15;
        }
        if ((i5 & 12582912) == 0) {
            if (kd2Var.g(z2)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i7 |= i14;
        }
        if ((i5 & 100663296) == 0) {
            if (kd2Var.d(i3)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i7 |= i13;
        }
        if ((i5 & 805306368) == 0) {
            if (kd2Var.d(i4)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i7 |= i12;
        }
        if ((i6 & 6) == 0) {
            if (kd2Var.h(p82Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i6 | i11;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            if (kd2Var.h(null)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i8 |= i10;
        }
        int i24 = i7;
        if ((i6 & 384) == 0) {
            if (kd2Var.h(null)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i8 |= i9;
        }
        if ((i6 & 3072) == 0) {
            if (kd2Var.h(ub2Var2)) {
                i22 = 2048;
            }
            i8 |= i22;
        }
        if ((i6 & 24576) == 0) {
            if ((32768 & i6) == 0) {
                h2 = kd2Var.f(null);
            } else {
                h2 = kd2Var.h(null);
            }
            if (h2) {
                i23 = 16384;
            }
            i8 |= i23;
        }
        int i25 = i8;
        if ((i24 & 306783379) == 306783378 && (i25 & 9363) == 9362) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (kd2Var.V(i24 & 1, z3)) {
            boolean d2 = iz5.d(koVar2);
            q18 q18Var = au0.a;
            if (d2) {
                kd2Var.e0(145641571);
                if ((i24 & 112) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                ?? Q = kd2Var.Q();
                hd6 hd6Var3 = Q;
                if (z8 || Q == q18Var) {
                    hd6 hd6Var4 = new hd6(koVar2);
                    kd2Var.n0(hd6Var4);
                    hd6Var3 = hd6Var4;
                }
                hd6Var = hd6Var3;
                kd2Var.q(false);
            } else {
                kd2Var.e0(145707228);
                kd2Var.q(false);
                hd6Var = null;
            }
            if (iz5.d(koVar2)) {
                kd2Var.e0(145905443);
                if ((i24 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean f2 = z7 | kd2Var.f(hd6Var);
                ?? Q2 = kd2Var.Q();
                n nVar2 = Q2;
                if (f2 || Q2 == q18Var) {
                    n nVar3 = new n(hd6Var, koVar2, (byte) 18);
                    kd2Var.n0(nVar3);
                    nVar2 = nVar3;
                }
                nVar = nVar2;
                kd2Var.q(false);
            } else {
                kd2Var.e0(146002721);
                if ((i24 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object Q3 = kd2Var.Q();
                Object obj3 = Q3;
                if (z4 || Q3 == q18Var) {
                    y7 y7Var = new y7(koVar2, (byte) 21);
                    kd2Var.n0(y7Var);
                    obj3 = y7Var;
                }
                nVar = (sb2) obj3;
                kd2Var.q(false);
            }
            if (z) {
                if (map != null) {
                    ai4 ai4Var2 = no.a;
                    if (!map.isEmpty()) {
                        int length = koVar2.y.length();
                        hd6Var2 = hd6Var;
                        List list = koVar2.x;
                        if (list != null) {
                            ?? arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i26 = 0;
                            while (i26 < size) {
                                List list2 = list;
                                jo joVar = (jo) list.get(i26);
                                int i27 = size;
                                Object obj4 = joVar.a;
                                int i28 = i26;
                                int i29 = joVar.c;
                                sb2 sb2Var2 = nVar;
                                int i30 = joVar.b;
                                String str = joVar.d;
                                if ((obj4 instanceof cz5) && "androidx.compose.foundation.text.inlineContent".equals(str) && lo.b(0, length, i30, i29)) {
                                    Object obj5 = joVar.a;
                                    obj5.getClass();
                                    arrayList.add(new jo(((cz5) obj5).a, i30, i29, str));
                                }
                                i26 = i28 + 1;
                                size = i27;
                                list = list2;
                                nVar = sb2Var2;
                            }
                            sb2Var = nVar;
                            nt1Var = arrayList;
                        } else {
                            sb2Var = nVar;
                            nt1Var = nt1.x;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = nt1Var.size();
                        for (int i31 = 0; i31 < size2; i31++) {
                            if (map.get(((jo) nt1Var.get(i31)).a) != null) {
                                ov3.d();
                                return;
                            }
                        }
                        ai4Var = new ai4(arrayList2, arrayList3);
                        efVar = null;
                    }
                }
                hd6Var2 = hd6Var;
                sb2Var = nVar;
                ai4Var = no.a;
                efVar = null;
            } else {
                hd6Var2 = hd6Var;
                sb2Var = nVar;
                efVar = null;
                ai4Var = new ai4(null, null);
            }
            List list3 = (List) ai4Var.x;
            List list4 = (List) ai4Var.y;
            if (z) {
                kd2Var.e0(146318828);
                Object Q4 = kd2Var.Q();
                Object obj6 = Q4;
                if (Q4 == q18Var) {
                    ti4 g2 = xt5.g(efVar);
                    kd2Var.n0(g2);
                    obj6 = g2;
                }
                kd2Var.q(false);
                r9 = (w44) obj6;
            } else {
                kd2Var.e0(146406588);
                kd2Var.q(false);
                r9 = efVar;
            }
            if (z) {
                kd2Var.e0(146499837);
                boolean f3 = kd2Var.f(r9);
                ?? Q5 = kd2Var.Q();
                ef efVar2 = Q5;
                if (f3 || Q5 == q18Var) {
                    ef efVar3 = new ef(r9, (byte) 3);
                    kd2Var.n0(efVar3);
                    efVar2 = efVar3;
                }
                efVar = efVar2;
                kd2Var.q(false);
            } else {
                kd2Var.e0(146571260);
                kd2Var.q(false);
            }
            ub2 ub2Var3 = efVar;
            int i32 = (i24 >> 3) & 14;
            hd6 hd6Var5 = hd6Var2;
            a50.a(koVar, xd6Var, p82Var, list3, z2, kd2Var);
            koVar2 = koVar;
            ko koVar3 = (ko) sb2Var.invoke();
            boolean h3 = kd2Var.h(hd6Var5);
            if ((i24 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = h3 | z5;
            Object Q6 = kd2Var.Q();
            Object obj7 = Q6;
            if (z9 || Q6 == q18Var) {
                w40 w40Var = new w40(hd6Var5, ub2Var, (byte) 0);
                kd2Var.n0(w40Var);
                obj7 = w40Var;
            }
            yz3 q0 = q0(yz3Var, koVar3, xd6Var, (ub2) obj7, i2, z2, i3, i4, p82Var, list3, ub2Var3, ub2Var2);
            if (!z) {
                kd2Var.e0(147779703);
                boolean h4 = kd2Var.h(hd6Var5);
                Object Q7 = kd2Var.Q();
                if (!h4 && Q7 != q18Var) {
                    r1 = 0;
                    obj2 = Q7;
                } else {
                    r1 = 0;
                    x40 x40Var = new x40(hd6Var5, false ? 1 : 0);
                    kd2Var.n0(x40Var);
                    obj2 = x40Var;
                }
                obj = new yh3((sb2) obj2, r1);
                kd2Var.q(r1);
            } else {
                kd2Var.e0(147956465);
                boolean h5 = kd2Var.h(hd6Var5);
                Object Q8 = kd2Var.Q();
                Object obj8 = Q8;
                if (h5 || Q8 == q18Var) {
                    x40 x40Var2 = new x40(hd6Var5, (byte) 1);
                    kd2Var.n0(x40Var2);
                    obj8 = x40Var2;
                }
                sb2 sb2Var3 = (sb2) obj8;
                boolean f4 = kd2Var.f(r9);
                Object Q9 = kd2Var.Q();
                Object obj9 = Q9;
                if (f4 || Q9 == q18Var) {
                    cf cfVar = new cf(r9, (byte) 9);
                    kd2Var.n0(cfVar);
                    obj9 = cfVar;
                }
                vd vdVar = new vd(sb2Var3, (sb2) obj9, (byte) 1);
                kd2Var.q(false);
                obj = vdVar;
            }
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E = o80.E(kd2Var, q0);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, obj);
            ss5.i(p7.E, kd2Var, l2);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            if (hd6Var5 == null) {
                kd2Var.e0(-433557001);
                z6 = false;
            } else {
                z6 = false;
                kd2Var.e0(-291080374);
                hd6Var5.a(0, kd2Var);
            }
            kd2Var.q(z6);
            if (list4 == null) {
                kd2Var.e0(-433506223);
            } else {
                kd2Var.e0(-433506222);
                no.a(koVar2, list4, kd2Var, i32);
            }
            kd2Var.q(z6);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new ic2() { // from class: u40
                @Override // defpackage.ic2
                public final Object invoke(Object obj10, Object obj11) {
                    ((Integer) obj11).getClass();
                    int N = kb0.N(i5 | 1);
                    int N2 = kb0.N(i6);
                    yz3 yz3Var2 = yz3.this;
                    ko koVar4 = koVar2;
                    ub2 ub2Var4 = ub2Var;
                    boolean z10 = z;
                    Map map2 = map;
                    xd6 xd6Var2 = xd6Var;
                    byte b2 = i2;
                    boolean z11 = z2;
                    int i33 = i3;
                    boolean z12 = i4;
                    p82 p82Var2 = p82Var;
                    ub2 ub2Var5 = ub2Var2;
                    a34.f(yz3Var2, koVar4, ub2Var4, z10, map2, xd6Var2, b2, z11, i33, z12 ? 1 : 0, p82Var2, ub2Var5, (kd2) obj10, N, N2);
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f0(a04 a04Var) {
        if (((xz3) a04Var).x.K && a04Var.h() != null) {
            ov3.d();
        }
    }

    public static final py2 g(ry2 ry2Var, float f2, float f3, oy2 oy2Var, kd2 kd2Var) {
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf(f3);
        Object Q = kd2Var.Q();
        q18 q18Var = au0.a;
        if (Q == q18Var) {
            Q = new py2(ry2Var, valueOf, valueOf2, oy2Var);
            kd2Var.n0(Q);
        }
        py2 py2Var = (py2) Q;
        boolean h2 = kd2Var.h(oy2Var);
        Object Q2 = kd2Var.Q();
        if (h2 || Q2 == q18Var) {
            Q2 = new wb(valueOf, py2Var, valueOf2, oy2Var, (byte) 4);
            kd2Var.n0(Q2);
        }
        db.m((sb2) Q2, kd2Var);
        boolean h3 = kd2Var.h(ry2Var);
        Object Q3 = kd2Var.Q();
        if (h3 || Q3 == q18Var) {
            Q3 = new r82(ry2Var, py2Var, (byte) 3);
            kd2Var.n0(Q3);
        }
        db.c(py2Var, (ub2) Q3, kd2Var);
        return py2Var;
    }

    public static final bd6 g0(ph5 ph5Var) {
        ub2 ub2Var;
        ArrayList arrayList = new ArrayList();
        Object g2 = ph5Var.x.g(oh5.a);
        if (g2 == null) {
            g2 = null;
        }
        o3 o3Var = (o3) g2;
        if (o3Var == null || (ub2Var = (ub2) o3Var.b) == null || !((Boolean) ub2Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (bd6) arrayList.get(0);
    }

    public static boolean h(float f2, Float f3) {
        if (f3 != null && f2 == f3.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean h0() {
        if (Build.VERSION.SDK_INT >= 33 && i0("EGL_EXT_gl_colorspace_bt2020_pq")) {
            return true;
        }
        return false;
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static boolean i0(String str) {
        String eglQueryString = EGL14.eglQueryString(Y(), 12373);
        if (eglQueryString != null && eglQueryString.contains(str)) {
            return true;
        }
        return false;
    }

    public static void j(int i2, int i3) {
        boolean z = true;
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i4 = iArr[0];
        if (i4 <= 0) {
            z = false;
        }
        io3.A("Create a OpenGL context first or run the GL methods on an OpenGL thread.", z);
        if (i2 >= 0 && i3 >= 0) {
            if (i2 <= i4 && i3 <= i4) {
                return;
            } else {
                throw new ze2(qx1.h(i4, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
            }
        }
        throw new ze2("width or height is less than 0");
    }

    public static final ArrayList j0(List list, sb2 sb2Var) {
        ed4 ed4Var;
        if (((Boolean) sb2Var.invoke()).booleanValue()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ro3 ro3Var = (ro3) list.get(i3);
                Object w2 = ro3Var.w();
                w2.getClass();
                fs0 fs0Var = ((od6) w2).x;
                hd6 hd6Var = (hd6) fs0Var.y;
                jo joVar = (jo) fs0Var.z;
                bd6 bd6Var = (bd6) hd6Var.a.getValue();
                if (bd6Var == null) {
                    ed4Var = new ed4(i2, i2, new jk5((byte) 16));
                } else {
                    jo c2 = hd6.c(joVar, bd6Var);
                    if (c2 == null) {
                        ed4Var = new ed4(i2, i2, new jk5((byte) 17));
                    } else {
                        g13 D = wk6.D(bd6Var.j(c2.b, c2.c).c());
                        ed4Var = new ed4(D.d(), D.b(), new e96(D, (byte) 3));
                    }
                }
                int i4 = ed4Var.x;
                int i5 = ed4Var.y;
                arrayList.add(new ai4(ro3Var.p(n03.p(i4, i4, i5, i5)), (sb2) ed4Var.z));
            }
            return arrayList;
        }
        return null;
    }

    public static void k(int i2, int i3, int i4) {
        GLES20.glBindTexture(i2, i3);
        p();
        GLES20.glTexParameteri(i2, 10240, i4);
        p();
        GLES20.glTexParameteri(i2, 10241, i4);
        p();
        GLES20.glTexParameteri(i2, 10242, 33071);
        p();
        GLES20.glTexParameteri(i2, 10243, 33071);
        p();
    }

    public static h94 k0(xy4 xy4Var) {
        int parseInt = Integer.parseInt(xy4Var.K(Long.MAX_VALUE));
        long parseLong = Long.parseLong(xy4Var.K(Long.MAX_VALUE));
        long parseLong2 = Long.parseLong(xy4Var.K(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int parseInt2 = Integer.parseInt(xy4Var.K(Long.MAX_VALUE));
        for (int i2 = 0; i2 < parseInt2; i2++) {
            String K = xy4Var.K(Long.MAX_VALUE);
            int S = uz5.S(K, ':', 0, 6);
            if (S != -1) {
                String obj = uz5.w0(K.substring(0, S)).toString();
                String substring = K.substring(S + 1);
                String lowerCase = obj.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                Object obj2 = linkedHashMap.get(lowerCase);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(lowerCase, obj2);
                }
                ((List) obj2).add(substring);
            } else {
                ze0.e("Unexpected header: ".concat(K));
                return null;
            }
        }
        return new h94(parseInt, parseLong, parseLong2, new b94(vn3.Z(linkedHashMap)), null, null);
    }

    public static ArrayList l(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final sv6 l0(za3 za3Var) {
        sv6 sv6Var = za3Var.L;
        if (sv6Var != null) {
            return sv6Var;
        }
        throw h11.e("Required value was null.");
    }

    public static void m(String str, boolean z) {
        if (z) {
            return;
        }
        ze0.k(str);
    }

    public static void m0(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void n(boolean z) {
        if (z) {
            return;
        }
        p65.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n0(defpackage.yp2 r4, defpackage.xz0 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.r95
            if (r0 == 0) goto L13
            r0 = r5
            r95 r0 = (defpackage.r95) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            r95 r0 = new r95
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            yp2 r4 = r0.x
            defpackage.m37.N(r5)
            goto L4b
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.m37.N(r5)
            boolean r5 = r4 instanceof defpackage.s95
            if (r5 == 0) goto L36
            return r4
        L36:
            f91 r5 = r4.d()
            wc0 r5 = r5.b()
            r0.x = r4
            r0.z = r2
            java.lang.Object r5 = defpackage.zz.V(r5, r0)
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L4b
            return r0
        L4b:
            cv5 r5 = (defpackage.cv5) r5
            r5.getClass()
            r0 = -1
            byte[] r5 = defpackage.nv5.p(r5, r0)
            s95 r0 = new s95
            wp2 r1 = r4.x
            nr2 r2 = r4.c()
            f91 r4 = r4.d()
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a34.n0(yp2, xz0):java.lang.Object");
    }

    public static void o(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new ze2(str + ", error code: 0x" + Integer.toHexString(eglGetError), nw2.s(Integer.valueOf(eglGetError)));
    }

    public static final jg o0(og ogVar, int i2) {
        Object obj;
        Iterator<T> it = ogVar.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((za3) ((Map.Entry) obj).getKey()).y == i2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (jg) entry.getValue();
    }

    public static void p() {
        StringBuilder sb = new StringBuilder();
        io3.t(4, "initialCapacity");
        Object[] objArr = new Object[4];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int i3 = i2 + 1;
            int b2 = fw2.b(objArr.length, i3);
            if (b2 > objArr.length) {
                objArr = Arrays.copyOf(objArr, b2);
            }
            objArr[i2] = valueOf;
            z = true;
            i2 = i3;
        }
        if (!z) {
        } else {
            throw new ze2(sb.toString(), nw2.j(objArr, i2));
        }
    }

    public static boolean p0(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static void q(String str, boolean z) {
        if (z) {
        } else {
            throw new ze2(str);
        }
    }

    public static final yz3 q0(yz3 yz3Var, ko koVar, xd6 xd6Var, ub2 ub2Var, int i2, boolean z, int i3, int i4, p82 p82Var, List list, ub2 ub2Var2, ub2 ub2Var3) {
        return yz3Var.w(vz3.x).w(new f86(koVar, xd6Var, p82Var, ub2Var, i2, z, i3, i4, list, ub2Var2, ub2Var3));
    }

    public static void r(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            int length = String.valueOf(name).length();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 35 + 1);
            qx1.x(sb, "Must be called on ", name, " thread, but got ", str);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void r0() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void s() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        ze0.m("Must be called from the main thread.");
    }

    public static void s0(String str) {
        er0 er0Var = new er0(qx1.m("lateinit property ", str, " has not been initialized"), (byte) 8);
        m0(er0Var, a34.class.getName());
        throw er0Var;
    }

    public static void t(long j2, String str) {
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j2 + ") must be >= 0");
    }

    public static byte[] t0(e41 e41Var) {
        e41Var.getClass();
        HashMap hashMap = e41Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    u0(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() <= 10240) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                    byteArray.getClass();
                    return byteArray;
                }
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            } finally {
            }
        } catch (IOException e2) {
            xk3.d().c(q51.a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static void u(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        ze0.k("Given String is empty or null");
    }

    public static final void u0(DataOutputStream dataOutputStream, String str, Object obj) {
        int i2;
        double d2;
        float f2;
        long j2;
        int i3;
        byte b2;
        boolean z;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            im0 a2 = z05.a(objArr.getClass());
            if (a2.equals(z05.a(Boolean[].class))) {
                i2 = 8;
            } else if (a2.equals(z05.a(Byte[].class))) {
                i2 = 9;
            } else if (a2.equals(z05.a(Integer[].class))) {
                i2 = 10;
            } else if (a2.equals(z05.a(Long[].class))) {
                i2 = 11;
            } else if (a2.equals(z05.a(Float[].class))) {
                i2 = 12;
            } else if (a2.equals(z05.a(Double[].class))) {
                i2 = 13;
            } else if (a2.equals(z05.a(String[].class))) {
                i2 = 14;
            } else {
                ze0.k(zo5.l("Unsupported value type ", z05.a(objArr.getClass()).e()));
                return;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                String str2 = null;
                Boolean bool = null;
                Byte b3 = null;
                Integer num = null;
                Long l2 = null;
                Float f3 = null;
                Double d3 = null;
                if (i2 == 8) {
                    if (obj2 instanceof Boolean) {
                        bool = (Boolean) obj2;
                    }
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    dataOutputStream.writeBoolean(z);
                } else if (i2 == 9) {
                    if (obj2 instanceof Byte) {
                        b3 = (Byte) obj2;
                    }
                    if (b3 != null) {
                        b2 = b3.byteValue();
                    } else {
                        b2 = 0;
                    }
                    dataOutputStream.writeByte(b2);
                } else if (i2 == 10) {
                    if (obj2 instanceof Integer) {
                        num = (Integer) obj2;
                    }
                    if (num != null) {
                        i3 = num.intValue();
                    } else {
                        i3 = 0;
                    }
                    dataOutputStream.writeInt(i3);
                } else if (i2 == 11) {
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    }
                    if (l2 != null) {
                        j2 = l2.longValue();
                    } else {
                        j2 = 0;
                    }
                    dataOutputStream.writeLong(j2);
                } else if (i2 == 12) {
                    if (obj2 instanceof Float) {
                        f3 = (Float) obj2;
                    }
                    if (f3 != null) {
                        f2 = f3.floatValue();
                    } else {
                        f2 = 0.0f;
                    }
                    dataOutputStream.writeFloat(f2);
                } else if (i2 == 13) {
                    if (obj2 instanceof Double) {
                        d3 = (Double) obj2;
                    }
                    if (d3 != null) {
                        d2 = d3.doubleValue();
                    } else {
                        d2 = 0.0d;
                    }
                    dataOutputStream.writeDouble(d2);
                } else if (i2 == 14) {
                    if (obj2 instanceof String) {
                        str2 = (String) obj2;
                    }
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        } else {
            ze0.k(zo5.l("Unsupported value type ", z05.a(obj.getClass()).f()));
            return;
        }
        dataOutputStream.writeUTF(str);
    }

    public static void v(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        ze0.k(str2);
    }

    public static final String v0(int i2) {
        if (i2 == 0) {
            return "android.widget.Button";
        }
        if (i2 == 1) {
            return "android.widget.CheckBox";
        }
        if (i2 == 3) {
            return "android.widget.RadioButton";
        }
        if (i2 == 5) {
            return "android.widget.ImageView";
        }
        if (i2 == 6) {
            return "android.widget.Spinner";
        }
        if (i2 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static void w(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        ze0.m(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final fr0 w0(ai2 ai2Var, int i2, boolean z) {
        int i3;
        int i4 = 6;
        int i5 = 0;
        if (ai2Var instanceof dz5) {
            String quote = Pattern.quote(((dz5) ai2Var).a);
            quote.getClass();
            return new fr0(quote, i5, i4);
        }
        if (ai2Var instanceof cy4) {
            return new fr0("\\d", i5, i4);
        }
        if (ai2Var instanceof gr0) {
            StringBuilder sb = new StringBuilder();
            if (z) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
            }
            for (Object obj : ((gr0) ai2Var).a()) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    fr0 w0 = w0((ai2) obj, i3, true);
                    if (i5 != 0 && (ai2Var instanceof og4)) {
                        sb.append("|");
                    }
                    sb.append((String) w0.z);
                    i3 += w0.y;
                    i5 = i6;
                } else {
                    te4.R();
                    throw null;
                }
            }
            int i7 = i3 - i2;
            if (z) {
                i7--;
            }
            return new fr0(sb.toString(), i7, z);
        }
        if (ai2Var instanceof ju) {
            if (ai2Var instanceof ju) {
                fr0 w02 = w0(((ju) ai2Var).a, i2, true);
                return new fr0(qx1.p(new StringBuilder(), (String) w02.z, '+'), w02.y, 4);
            }
            v71.g(ai2Var, "Unsupported simple grammar element: ");
            return null;
        }
        if (ai2Var instanceof xx4) {
            StringBuilder sb2 = new StringBuilder("[");
            xx4 xx4Var = (xx4) ai2Var;
            sb2.append(xx4Var.a);
            sb2.append('-');
            sb2.append(xx4Var.b);
            sb2.append(']');
            return new fr0(sb2.toString(), i5, i4);
        }
        ze0.l();
        return null;
    }

    public static void x(Object obj) {
        if (obj != null) {
            return;
        }
        qi2.m("null reference");
    }

    public static final void x0(kd2 kd2Var, yz3 yz3Var, int i2, ud1 ud1Var, og3 og3Var, ga5 ga5Var, ia3 ia3Var, al4 al4Var) {
        tt0.d.getClass();
        ss5.i(p7.E, kd2Var, al4Var);
        ss5.i(new vs0((byte) 13), kd2Var, yz3Var);
        ss5.i(new vs0((byte) 4), kd2Var, ud1Var);
        ss5.i(new vs0((byte) 5), kd2Var, og3Var);
        ss5.i(new vs0((byte) 6), kd2Var, ga5Var);
        ss5.i(new vs0((byte) 7), kd2Var, ia3Var);
        ss5.i(p7.G, kd2Var, Integer.valueOf(i2));
    }

    public static void y(Object obj, String str) {
        if (obj != null) {
            return;
        }
        qi2.m(str);
    }

    public static void y0(h94 h94Var, wy4 wy4Var) {
        wy4Var.l(h94Var.a);
        wy4Var.writeByte(10);
        wy4Var.l(h94Var.b);
        wy4Var.writeByte(10);
        wy4Var.l(h94Var.c);
        wy4Var.writeByte(10);
        Set<Map.Entry> entrySet = h94Var.d.a.entrySet();
        Iterator it = entrySet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        wy4Var.l(i2);
        wy4Var.writeByte(10);
        for (Map.Entry entry : entrySet) {
            for (String str : (List) entry.getValue()) {
                wy4Var.V((String) entry.getKey());
                wy4Var.V(":");
                wy4Var.V(str);
                wy4Var.writeByte(10);
            }
        }
    }

    public static void z(boolean z) {
        if (z) {
        } else {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
