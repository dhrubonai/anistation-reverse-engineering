package defpackage;

import android.opengl.GLES20;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vv4 {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public uv4 b;
    public re2 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public static boolean b(sv4 sv4Var) {
        rv4 rv4Var = sv4Var.a;
        rv4 rv4Var2 = sv4Var.b;
        wp[] wpVarArr = rv4Var.a;
        if (wpVarArr.length == 1 && wpVarArr[0].b == 0) {
            wp[] wpVarArr2 = rv4Var2.a;
            if (wpVarArr2.length == 1 && wpVarArr2[0].b == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            re2 re2Var = new re2("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.c = re2Var;
            this.d = GLES20.glGetUniformLocation(re2Var.a, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.c.a, "uTexMatrix");
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.c.a, "aPosition");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            a34.p();
            this.f = glGetAttribLocation;
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.c.a, "aTexCoords");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
            a34.p();
            this.g = glGetAttribLocation2;
            this.h = GLES20.glGetUniformLocation(this.c.a, "uTexture");
        } catch (ze2 e) {
            kb0.t("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
