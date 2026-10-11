package c2;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import f.m0;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class j implements GLSurfaceView.Renderer, c {
    public final /* synthetic */ k B;

    /* renamed from: a, reason: collision with root package name */
    public final i f2006a;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f2009d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f2010e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f2011f;

    /* renamed from: x, reason: collision with root package name */
    public float f2012x;

    /* renamed from: y, reason: collision with root package name */
    public float f2013y;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f2007b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f2008c = new float[16];

    /* renamed from: z, reason: collision with root package name */
    public final float[] f2014z = new float[16];
    public final float[] A = new float[16];

    public j(k kVar, i iVar) {
        this.B = kVar;
        float[] fArr = new float[16];
        this.f2009d = fArr;
        float[] fArr2 = new float[16];
        this.f2010e = fArr2;
        float[] fArr3 = new float[16];
        this.f2011f = fArr3;
        this.f2006a = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f2013y = 3.1415927f;
    }

    @Override // c2.c
    public final synchronized void a(float[] fArr, float f10) {
        float[] fArr2 = this.f2009d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f11 = -f10;
        this.f2013y = f11;
        Matrix.setRotateM(this.f2010e, 0, -this.f2012x, (float) Math.cos(f11), (float) Math.sin(this.f2013y), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.A, 0, this.f2009d, 0, this.f2011f, 0);
            Matrix.multiplyMM(this.f2014z, 0, this.f2010e, 0, this.A, 0);
        }
        Matrix.multiplyMM(this.f2008c, 0, this.f2007b, 0, this.f2014z, 0);
        this.f2006a.a(this.f2008c);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f10;
        boolean z9 = false;
        GLES20.glViewport(0, 0, i10, i11);
        float f11 = i10 / i11;
        if (f11 > 1.0f) {
            z9 = true;
        }
        if (z9) {
            f10 = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f11)) * 2.0d);
        } else {
            f10 = 90.0f;
        }
        Matrix.perspectiveM(this.f2007b, 0, f10, f11, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.B;
        kVar.f2019e.post(new m0(16, kVar, this.f2006a.b()));
    }
}
