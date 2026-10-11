package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fw5 implements GLSurfaceView.Renderer, tg4 {
    public final hb5 a;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public float g;
    public float h;
    public final /* synthetic */ gw5 k;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] i = new float[16];
    public final float[] j = new float[16];

    public fw5(gw5 gw5Var, hb5 hb5Var) {
        this.k = gw5Var;
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.a = hb5Var;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }

    @Override // defpackage.tg4
    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.h = f2;
        Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f2), (float) Math.sin(this.h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object q;
        synchronized (this) {
            Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
            Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
        hb5 hb5Var = this.a;
        float[] fArr2 = this.c;
        GLES20.glClear(16384);
        try {
            a34.p();
        } catch (ze2 e) {
            kb0.t("SceneRenderer", "Failed to draw a frame", e);
        }
        if (hb5Var.x.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = hb5Var.G;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                a34.p();
            } catch (ze2 e2) {
                kb0.t("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (hb5Var.y.compareAndSet(true, false)) {
                Matrix.setIdentityM(hb5Var.D, 0);
            }
            long timestamp = hb5Var.G.getTimestamp();
            wp wpVar = hb5Var.B;
            synchronized (wpVar) {
                q = wpVar.q(timestamp, false);
            }
            Long l = (Long) q;
            if (l != null) {
                tu tuVar = hb5Var.A;
                float[] fArr3 = hb5Var.D;
                float[] fArr4 = (float[]) ((wp) tuVar.A).s(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) tuVar.z;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!tuVar.x) {
                        tu.b((float[]) tuVar.y, (float[]) tuVar.z);
                        tuVar.x = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) tuVar.y, 0, (float[]) tuVar.z, 0);
                }
            }
            sv4 sv4Var = (sv4) hb5Var.C.s(timestamp);
            if (sv4Var != null) {
                vv4 vv4Var = hb5Var.z;
                if (vv4.b(sv4Var)) {
                    vv4Var.a = sv4Var.c;
                    vv4Var.b = new uv4(sv4Var.a.a[0]);
                    if (!sv4Var.d) {
                        wp wpVar2 = sv4Var.b.a[0];
                        a34.K((float[]) wpVar2.d);
                        a34.K((float[]) wpVar2.e);
                    }
                }
            }
        }
        Matrix.multiplyMM(hb5Var.E, 0, fArr2, 0, hb5Var.D, 0);
        vv4 vv4Var2 = hb5Var.z;
        int i = hb5Var.F;
        float[] fArr6 = hb5Var.E;
        uv4 uv4Var = vv4Var2.b;
        if (uv4Var != null) {
            int i2 = vv4Var2.a;
            if (i2 == 1) {
                fArr = vv4.j;
            } else if (i2 == 2) {
                fArr = vv4.k;
            } else {
                fArr = vv4.i;
            }
            GLES20.glUniformMatrix3fv(vv4Var2.e, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(vv4Var2.d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(vv4Var2.h, 0);
            try {
                a34.p();
            } catch (ze2 e3) {
                kb0.t("ProjectionRenderer", "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(vv4Var2.f, 3, 5126, false, 12, (Buffer) uv4Var.b);
            try {
                a34.p();
            } catch (ze2 e4) {
                kb0.t("ProjectionRenderer", "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(vv4Var2.g, 2, 5126, false, 8, (Buffer) uv4Var.c);
            try {
                a34.p();
            } catch (ze2 e5) {
                kb0.t("ProjectionRenderer", "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(uv4Var.d, 0, uv4Var.a);
            try {
                a34.p();
            } catch (ze2 e6) {
                kb0.t("ProjectionRenderer", "Failed to render", e6);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        GLES20.glViewport(0, 0, i, i2);
        float f2 = i / i2;
        if (f2 > 1.0f) {
            f = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d);
        } else {
            f = 90.0f;
        }
        Matrix.perspectiveM(this.b, 0, f, f2, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        gw5 gw5Var = this.k;
        SurfaceTexture c = this.a.c();
        int i = gw5.I;
        gw5Var.B.post(new sp5(gw5Var, c, (byte) 1));
    }
}
