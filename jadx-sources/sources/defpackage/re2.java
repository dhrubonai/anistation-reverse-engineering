package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class re2 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;

    public re2(String str, String str2) {
        boolean z;
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        a34.p();
        a(str, glCreateProgram, 35633);
        a(str2, glCreateProgram, 35632);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        } else {
            z = false;
        }
        a34.q("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), z);
        GLES20.glUseProgram(glCreateProgram);
        this.e = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.c = new pe2[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.a;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            String str3 = new String(bArr, 0, i3);
            pe2 pe2Var = new pe2(str3, GLES20.glGetAttribLocation(i2, str3));
            ((pe2[]) this.c)[i] = pe2Var;
            ((HashMap) this.e).put(str3, pe2Var);
        }
        this.f = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr4, 0);
        this.d = new qe2[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int[] iArr6 = new int[1];
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, iArr6, 0, bArr2, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            String str4 = new String(bArr2, 0, i7);
            qe2 qe2Var = new qe2(str4, GLES20.glGetUniformLocation(i6, str4), iArr6[0]);
            ((qe2[]) this.d)[i5] = qe2Var;
            ((HashMap) this.f).put(str4, qe2Var);
        }
        a34.p();
    }

    public static void a(String str, int i, int i2) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        }
        a34.q(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, z);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        a34.p();
    }

    public boolean b(int i, int i2) {
        wz3 wz3Var = (wz3) ((f44) this.d).g(this.a + i);
        wz3 wz3Var2 = (wz3) ((f44) this.e).g(this.a + i2);
        if (a34.i(wz3Var, wz3Var2) || wz3Var.getClass() == wz3Var2.getClass()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0055. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0058. Please report as an issue. */
    public void c() {
        int i;
        for (pe2 pe2Var : (pe2[]) this.c) {
            FloatBuffer floatBuffer = pe2Var.b;
            io3.w(floatBuffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(pe2Var.a, (int) pe2Var.c, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(pe2Var.a);
            a34.p();
        }
        for (qe2 qe2Var : (qe2[]) this.d) {
            boolean z = this.b;
            int[] iArr = qe2Var.d;
            float[] fArr = qe2Var.c;
            int i2 = qe2Var.a;
            int i3 = qe2Var.b;
            if (i3 != 5124) {
                if (i3 != 5126) {
                    if (i3 != 35815 && i3 != 36198) {
                        switch (i3) {
                            case 35664:
                                GLES20.glUniform2fv(i2, 1, fArr, 0);
                                a34.p();
                                break;
                            case 35665:
                                GLES20.glUniform3fv(i2, 1, fArr, 0);
                                a34.p();
                                break;
                            case 35666:
                                GLES20.glUniform4fv(i2, 1, fArr, 0);
                                a34.p();
                                break;
                            case 35667:
                                GLES20.glUniform2iv(i2, 1, iArr, 0);
                                a34.p();
                                break;
                            case 35668:
                                GLES20.glUniform3iv(i2, 1, iArr, 0);
                                a34.p();
                                break;
                            case 35669:
                                GLES20.glUniform4iv(i2, 1, iArr, 0);
                                a34.p();
                                break;
                            default:
                                switch (i3) {
                                    case 35675:
                                        GLES20.glUniformMatrix3fv(i2, 1, false, fArr, 0);
                                        a34.p();
                                        break;
                                    case 35676:
                                        GLES20.glUniformMatrix4fv(i2, 1, false, fArr, 0);
                                        a34.p();
                                        break;
                                    default:
                                        switch (i3) {
                                            case 35678:
                                            case 35679:
                                                break;
                                            default:
                                                ze0.m(qx1.h(i3, "Unexpected uniform type: "));
                                                return;
                                        }
                                }
                        }
                    }
                    if (qe2Var.e != 0) {
                        GLES20.glActiveTexture((qe2Var.f ? 1 : 0) + 33984);
                        a34.p();
                        int i4 = 9729;
                        switch (i3) {
                            case 35678:
                                i = 3553;
                                break;
                            case 35679:
                                i = 32879;
                                break;
                            case 35815:
                            case 36198:
                                if (z) {
                                    i4 = 9728;
                                }
                                i = 36197;
                                break;
                            default:
                                ze0.m(qx1.h(i3, "Unexpected sampler type: "));
                                return;
                        }
                        a34.k(i, qe2Var.e, i4);
                        if (i3 == 35678) {
                            if (qe2Var.g == 9987) {
                                GLES20.glGenerateMipmap(3553);
                                a34.p();
                            }
                            GLES20.glTexParameteri(3553, 10241, qe2Var.g);
                            a34.p();
                        }
                        GLES20.glUniform1i(i2, qe2Var.f ? 1 : 0);
                        a34.p();
                    } else {
                        ze0.m("No call to setSamplerTexId() before bind.");
                        return;
                    }
                } else {
                    GLES20.glUniform1fv(i2, 1, fArr, 0);
                    a34.p();
                }
            } else {
                GLES20.glUniform1iv(i2, 1, iArr, 0);
                a34.p();
            }
        }
    }

    public void d(float[] fArr) {
        pe2 pe2Var = (pe2) ((HashMap) this.e).get("aFramePosition");
        pe2Var.getClass();
        pe2Var.b = a34.K(fArr);
        pe2Var.c = (byte) 4;
    }

    public void e(String str, float f) {
        qe2 qe2Var = (qe2) ((HashMap) this.f).get(str);
        qe2Var.getClass();
        qe2Var.c[0] = f;
    }

    public void f(String str, float[] fArr) {
        qe2 qe2Var = (qe2) ((HashMap) this.f).get(str);
        qe2Var.getClass();
        System.arraycopy(fArr, 0, qe2Var.c, 0, fArr.length);
    }

    public void g(int i, String str) {
        qe2 qe2Var = (qe2) ((HashMap) this.f).get(str);
        qe2Var.getClass();
        qe2Var.d[0] = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h(String str, int i, int i2) {
        qe2 qe2Var = (qe2) ((HashMap) this.f).get(str);
        qe2Var.getClass();
        qe2Var.e = i;
        qe2Var.f = i2;
    }

    public re2(Context context, int i, int i2) {
        this(eq6.S(context, i), eq6.S(context, i2));
    }

    public re2(kf kfVar, xz3 xz3Var, int i, f44 f44Var, f44 f44Var2, boolean z) {
        this.f = kfVar;
        this.c = xz3Var;
        this.a = i;
        this.d = f44Var;
        this.e = f44Var2;
        this.b = z;
    }
}
