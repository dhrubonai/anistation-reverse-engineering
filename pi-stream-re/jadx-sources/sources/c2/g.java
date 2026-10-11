package c2;

import android.opengl.GLES20;
import android.util.Log;
import androidx.appcompat.widget.d0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f1985i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f1986j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f1987k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f1988a;

    /* renamed from: b, reason: collision with root package name */
    public c.j f1989b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f1990c;

    /* renamed from: d, reason: collision with root package name */
    public int f1991d;

    /* renamed from: e, reason: collision with root package name */
    public int f1992e;

    /* renamed from: f, reason: collision with root package name */
    public int f1993f;

    /* renamed from: g, reason: collision with root package name */
    public int f1994g;

    /* renamed from: h, reason: collision with root package name */
    public int f1995h;

    public static boolean b(f fVar) {
        c.j[] jVarArr = fVar.f1981a.f1980a;
        if (jVarArr.length != 1 || jVarArr[0].f1594a != 0) {
            return false;
        }
        c.j[] jVarArr2 = fVar.f1982b.f1980a;
        if (jVarArr2.length != 1 || jVarArr2[0].f1594a != 0) {
            return false;
        }
        return true;
    }

    public final void a() {
        try {
            d0 d0Var = new d0("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f1990c = d0Var;
            this.f1991d = GLES20.glGetUniformLocation(d0Var.f440a, "uMvpMatrix");
            this.f1992e = GLES20.glGetUniformLocation(this.f1990c.f440a, "uTexMatrix");
            this.f1993f = this.f1990c.d("aPosition");
            this.f1994g = this.f1990c.d("aTexCoords");
            this.f1995h = GLES20.glGetUniformLocation(this.f1990c.f440a, "uTexture");
        } catch (f1.h e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }
}
