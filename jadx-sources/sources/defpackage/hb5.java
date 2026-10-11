package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hb5 implements ms6, fg0 {
    public int F;
    public SurfaceTexture G;
    public byte[] J;
    public final AtomicBoolean x = new AtomicBoolean();
    public final AtomicBoolean y = new AtomicBoolean(true);
    public final vv4 z = new Object();
    public final tu A = new tu((byte) 2);
    public final wp B = new wp();
    public final wp C = new wp();
    public final float[] D = new float[16];
    public final float[] E = new float[16];
    public volatile int H = 0;
    public int I = -1;

    @Override // defpackage.fg0
    public final void a(long j, float[] fArr) {
        ((wp) this.A.A).a(j, fArr);
    }

    @Override // defpackage.fg0
    public final void b() {
        this.B.e();
        tu tuVar = this.A;
        ((wp) tuVar.A).e();
        tuVar.x = false;
        this.y.set(true);
    }

    public final SurfaceTexture c() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            a34.p();
            this.z.a();
            a34.p();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            a34.p();
            int i = iArr[0];
            a34.k(36197, i, 9729);
            this.F = i;
        } catch (ze2 e) {
            kb0.t("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.F);
        this.G = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new gb5(this, (byte) 0));
        return this.G;
    }

    @Override // defpackage.ms6
    public final void d(long j, long j2, ea2 ea2Var, MediaFormat mediaFormat) {
        int i;
        float f;
        ArrayList arrayList;
        int m;
        this.B.a(j2, Long.valueOf(j));
        byte[] bArr = ea2Var.F;
        int i2 = ea2Var.G;
        byte[] bArr2 = this.J;
        int i3 = this.I;
        this.J = bArr;
        if (i2 == -1) {
            i2 = this.H;
        }
        this.I = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.J)) {
            return;
        }
        byte[] bArr3 = this.J;
        sv4 sv4Var = null;
        if (bArr3 != null) {
            int i4 = this.I;
            int i5 = tv4.b;
            zi4 zi4Var = new zi4(bArr3);
            try {
                zi4Var.O(4);
                m = zi4Var.m();
                zi4Var.N(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (m == 1886547818) {
                zi4Var.O(8);
                int i6 = zi4Var.b;
                int i7 = zi4Var.c;
                while (i6 < i7) {
                    int m2 = zi4Var.m() + i6;
                    if (m2 <= i6 || m2 > i7) {
                        break;
                    }
                    int m3 = zi4Var.m();
                    if (m3 != 2037673328 && m3 != 1836279920) {
                        zi4Var.N(m2);
                        i6 = m2;
                    }
                    zi4Var.M(m2);
                    arrayList = tv4.a(zi4Var);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = tv4.a(zi4Var);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size != 1) {
                    if (size == 2) {
                        sv4Var = new sv4((rv4) arrayList.get(0), (rv4) arrayList.get(1), i4);
                    }
                } else {
                    rv4 rv4Var = (rv4) arrayList.get(0);
                    sv4Var = new sv4(rv4Var, rv4Var, i4);
                }
            }
        }
        if (sv4Var == null || !vv4.b(sv4Var)) {
            int i8 = this.I;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f2 = radians / 36.0f;
            float f3 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < 36; i11 = i) {
                float f4 = radians / 2.0f;
                float f5 = (i11 * f2) - f4;
                i = i11 + 1;
                float f6 = (i * f2) - f4;
                int i12 = 0;
                while (i12 < 73) {
                    int i13 = i;
                    int i14 = 0;
                    int i15 = 2;
                    while (i14 < i15) {
                        if (i14 == 0) {
                            f = f5;
                        } else {
                            f = f6;
                        }
                        float f7 = radians;
                        float f8 = i12 * f3;
                        float f9 = radians2;
                        double d = (f8 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = f;
                        fArr[i9] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i9 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i16 = i9 + 3;
                        float f10 = f2;
                        fArr[i9 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i10] = f8 / f9;
                        int i17 = i10 + 2;
                        fArr2[i10 + 1] = ((i11 + i14) * f10) / f7;
                        if ((i12 == 0 && i14 == 0) || (i12 == 72 && i14 == 1)) {
                            System.arraycopy(fArr, i9, fArr, i16, 3);
                            i9 += 6;
                            i15 = 2;
                            System.arraycopy(fArr2, i10, fArr2, i17, 2);
                            i10 += 4;
                        } else {
                            i15 = 2;
                            i9 = i16;
                            i10 = i17;
                        }
                        i14++;
                        radians = f7;
                        f2 = f10;
                        radians2 = f9;
                    }
                    i12++;
                    i = i13;
                }
            }
            rv4 rv4Var2 = new rv4(new wp(0, 1, fArr, fArr2));
            sv4Var = new sv4(rv4Var2, rv4Var2, i8);
        }
        this.C.a(j2, sv4Var);
    }
}
