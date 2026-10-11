package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class im5 extends ka0 {
    public fq3 a;
    public long b = 9205357640488583168L;

    @Override // defpackage.ka0
    public final void a(float f, long j, ad adVar) {
        Shader shader;
        Paint paint = (Paint) adVar.z;
        fq3 fq3Var = this.a;
        Shader shader2 = null;
        if (fq3Var == null || !uq5.b(this.b, j)) {
            if (uq5.f(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                fq3Var = null;
            } else {
                fq3Var = this.a;
                if (fq3Var == null) {
                    fq3Var = new fq3((byte) 14, false);
                    this.a = fq3Var;
                }
                fq3Var.y = b(j);
                this.a = fq3Var;
                this.b = j;
            }
        }
        long a = c97.a.a(paint);
        long j2 = ep0.b;
        if (!cm6.a(a, j2)) {
            adVar.r(j2);
        }
        Shader shader3 = (Shader) adVar.A;
        if (fq3Var != null) {
            shader = (Shader) fq3Var.y;
        } else {
            shader = null;
        }
        if (!a34.i(shader3, shader)) {
            if (fq3Var != null) {
                shader2 = (Shader) fq3Var.y;
            }
            adVar.u(shader2);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        adVar.p(f);
    }

    public abstract Shader b(long j);
}
