package c2;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import b2.p;
import c1.v;
import f1.o;
import f1.t;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import o1.d0;

/* loaded from: classes.dex */
public final class i implements p, a {
    public SurfaceTexture A;
    public byte[] D;

    /* renamed from: z, reason: collision with root package name */
    public int f2005z;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f1997a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1998b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public final g f1999c = new g();

    /* renamed from: d, reason: collision with root package name */
    public final d0 f2000d = new d0();

    /* renamed from: e, reason: collision with root package name */
    public final c.j f2001e = new c.j();

    /* renamed from: f, reason: collision with root package name */
    public final c.j f2002f = new c.j();

    /* renamed from: x, reason: collision with root package name */
    public final float[] f2003x = new float[16];

    /* renamed from: y, reason: collision with root package name */
    public final float[] f2004y = new float[16];
    public volatile int B = 0;
    public int C = -1;

    public final void a(float[] fArr) {
        float[] fArr2;
        Object d10;
        GLES20.glClear(16384);
        try {
            j5.a.g();
        } catch (f1.h e10) {
            o.d("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f1997a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.A;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                j5.a.g();
            } catch (f1.h e11) {
                o.d("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f1998b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f2003x, 0);
            }
            long timestamp = this.A.getTimestamp();
            c.j jVar = this.f2001e;
            synchronized (jVar) {
                d10 = jVar.d(timestamp, false);
            }
            Long l10 = (Long) d10;
            if (l10 != null) {
                d0 d0Var = this.f2000d;
                float[] fArr3 = this.f2003x;
                float[] fArr4 = (float[]) ((c.j) d0Var.f8140d).f(l10.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) d0Var.f8139c;
                    float f10 = fArr4[0];
                    float f11 = -fArr4[1];
                    float f12 = -fArr4[2];
                    float length = Matrix.length(f10, f11, f12);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    boolean z9 = d0Var.f8137a;
                    Object obj = d0Var.f8138b;
                    if (!z9) {
                        d0.e((float[]) obj, (float[]) d0Var.f8139c);
                        d0Var.f8137a = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) obj, 0, (float[]) d0Var.f8139c, 0);
                }
            }
            f fVar = (f) this.f2002f.f(timestamp);
            if (fVar != null) {
                g gVar = this.f1999c;
                gVar.getClass();
                if (g.b(fVar)) {
                    gVar.f1988a = fVar.f1983c;
                    gVar.f1989b = new c.j(fVar.f1981a.f1980a[0]);
                    if (!fVar.f1984d) {
                        new c.j(fVar.f1982b.f1980a[0]);
                    }
                    gVar.getClass();
                }
            }
        }
        Matrix.multiplyMM(this.f2004y, 0, fArr, 0, this.f2003x, 0);
        g gVar2 = this.f1999c;
        int i10 = this.f2005z;
        float[] fArr6 = this.f2004y;
        c.j jVar2 = gVar2.f1989b;
        if (jVar2 != null) {
            int i11 = gVar2.f1988a;
            if (i11 == 1) {
                fArr2 = g.f1986j;
            } else if (i11 == 2) {
                fArr2 = g.f1987k;
            } else {
                fArr2 = g.f1985i;
            }
            GLES20.glUniformMatrix3fv(gVar2.f1992e, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(gVar2.f1991d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i10);
            GLES20.glUniform1i(gVar2.f1995h, 0);
            try {
                j5.a.g();
            } catch (f1.h e12) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e12);
            }
            GLES20.glVertexAttribPointer(gVar2.f1993f, 3, 5126, false, 12, (Buffer) jVar2.f1596c);
            try {
                j5.a.g();
            } catch (f1.h e13) {
                Log.e("ProjectionRenderer", "Failed to load position data", e13);
            }
            GLES20.glVertexAttribPointer(gVar2.f1994g, 2, 5126, false, 8, (Buffer) jVar2.f1597d);
            try {
                j5.a.g();
            } catch (f1.h e14) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e14);
            }
            GLES20.glDrawArrays(jVar2.f1595b, 0, jVar2.f1594a);
            try {
                j5.a.g();
            } catch (f1.h e15) {
                Log.e("ProjectionRenderer", "Failed to render", e15);
            }
        }
    }

    public final SurfaceTexture b() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            j5.a.g();
            this.f1999c.a();
            j5.a.g();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            j5.a.g();
            int i10 = iArr[0];
            j5.a.d(36197, i10);
            this.f2005z = i10;
        } catch (f1.h e10) {
            o.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f2005z);
        this.A = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: c2.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.f1997a.set(true);
            }
        });
        return this.A;
    }

    @Override // c2.a
    public final void c(long j4, float[] fArr) {
        ((c.j) this.f2000d.f8140d).a(fArr, j4);
    }

    @Override // c2.a
    public final void h() {
        this.f2001e.b();
        d0 d0Var = this.f2000d;
        ((c.j) d0Var.f8140d).b();
        d0Var.f8137a = false;
        this.f1998b.set(true);
    }

    @Override // b2.p
    public final void j(long j4, long j10, v vVar, MediaFormat mediaFormat) {
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        boolean z9;
        this.f2001e.a(Long.valueOf(j4), j10);
        byte[] bArr = vVar.f1944w;
        int i13 = vVar.f1945x;
        byte[] bArr2 = this.D;
        int i14 = this.C;
        this.D = bArr;
        if (i13 == -1) {
            i13 = this.B;
        }
        this.C = i13;
        if (i14 != i13 || !Arrays.equals(bArr2, this.D)) {
            byte[] bArr3 = this.D;
            f fVar = null;
            if (bArr3 != null) {
                int i15 = this.C;
                t tVar = new t(bArr3);
                try {
                    tVar.H(4);
                    int f12 = tVar.f();
                    tVar.G(0);
                    if (f12 == 1886547818) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (z9) {
                    tVar.H(8);
                    int i16 = tVar.f3859b;
                    int i17 = tVar.f3860c;
                    while (i16 < i17) {
                        int f13 = tVar.f() + i16;
                        if (f13 <= i16 || f13 > i17) {
                            break;
                        }
                        int f14 = tVar.f();
                        if (f14 != 2037673328 && f14 != 1836279920) {
                            tVar.G(f13);
                            i16 = f13;
                        }
                        tVar.F(f13);
                        arrayList = q6.g.I(tVar);
                        break;
                    }
                    arrayList = null;
                } else {
                    arrayList = q6.g.I(tVar);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (size != 1) {
                        if (size == 2) {
                            fVar = new f((e) arrayList.get(0), (e) arrayList.get(1), i15);
                        }
                    } else {
                        e eVar = (e) arrayList.get(0);
                        fVar = new f(eVar, eVar, i15);
                    }
                }
            }
            if (fVar == null || !g.b(fVar)) {
                int i18 = this.C;
                float radians = (float) Math.toRadians(180.0f);
                float radians2 = (float) Math.toRadians(360.0f);
                float f15 = radians / 36;
                float f16 = radians2 / 72;
                float[] fArr = new float[15984];
                float[] fArr2 = new float[10656];
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                for (int i22 = 36; i19 < i22; i22 = 36) {
                    float f17 = radians / 2.0f;
                    float f18 = (i19 * f15) - f17;
                    int i23 = i19 + 1;
                    float f19 = (i23 * f15) - f17;
                    int i24 = 0;
                    while (i24 < 73) {
                        int i25 = i23;
                        int i26 = 0;
                        int i27 = 2;
                        while (i26 < i27) {
                            if (i26 == 0) {
                                f11 = f19;
                                f10 = f18;
                            } else {
                                f10 = f19;
                                f11 = f10;
                            }
                            float f20 = i24 * f16;
                            float f21 = f18;
                            int i28 = i20 + 1;
                            float f22 = f16;
                            double d10 = 50.0f;
                            int i29 = i24;
                            double d11 = (f20 + 3.1415927f) - (radians2 / 2.0f);
                            float f23 = f15;
                            double d12 = f10;
                            int i30 = i18;
                            int i31 = i26;
                            fArr[i20] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                            int i32 = i28 + 1;
                            fArr[i28] = (float) (Math.sin(d12) * d10);
                            int i33 = i32 + 1;
                            fArr[i32] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                            int i34 = i21 + 1;
                            fArr2[i21] = f20 / radians2;
                            int i35 = i34 + 1;
                            fArr2[i34] = ((i19 + i31) * f23) / radians;
                            if (i29 == 0 && i31 == 0) {
                                i10 = i29;
                                i11 = i31;
                            } else {
                                i10 = i29;
                                i11 = i31;
                                if (i10 != 72 || i11 != 1) {
                                    i12 = 2;
                                    i21 = i35;
                                    i20 = i33;
                                    i26 = i11 + 1;
                                    i24 = i10;
                                    i27 = i12;
                                    f19 = f11;
                                    f16 = f22;
                                    f18 = f21;
                                    f15 = f23;
                                    i18 = i30;
                                }
                            }
                            System.arraycopy(fArr, i33 - 3, fArr, i33, 3);
                            i33 += 3;
                            i12 = 2;
                            System.arraycopy(fArr2, i35 - 2, fArr2, i35, 2);
                            i35 += 2;
                            i21 = i35;
                            i20 = i33;
                            i26 = i11 + 1;
                            i24 = i10;
                            i27 = i12;
                            f19 = f11;
                            f16 = f22;
                            f18 = f21;
                            f15 = f23;
                            i18 = i30;
                        }
                        i24++;
                        i23 = i25;
                        f18 = f18;
                        i18 = i18;
                    }
                    i19 = i23;
                }
                e eVar2 = new e(new c.j(0, fArr, fArr2, 1));
                fVar = new f(eVar2, eVar2, i18);
            }
            this.f2002f.a(fVar, j10);
        }
    }
}
