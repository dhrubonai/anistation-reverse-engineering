package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sy3 {
    public static sy3 h;
    public final ia3 a;
    public final xd6 b;
    public final xd1 c;
    public final p82 d;
    public final xd6 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public sy3(ia3 ia3Var, xd6 xd6Var, xd1 xd1Var, p82 p82Var) {
        this.a = ia3Var;
        this.b = xd6Var;
        this.c = xd1Var;
        this.d = p82Var;
        this.e = ez5.j(xd6Var, ia3Var);
    }

    public final long a(int i, long j) {
        float f = this.g;
        float f2 = this.f;
        int i2 = 0;
        int i3 = 1;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = ty3.a;
            xd6 xd6Var = this.e;
            nt1 nt1Var = nt1.x;
            p82 p82Var = this.d;
            xd1 xd1Var = this.c;
            cd cdVar = new cd(new gd(str, xd6Var, nt1Var, nt1Var, p82Var, xd1Var, false), 1, 1, sx0.b(0, 0, 0, 0, 15));
            i3 = 1;
            float f3 = new cd(new gd(ty3.b, xd6Var, nt1Var, nt1Var, this.d, xd1Var, true), 2, 1, sx0.b(0, 0, 0, 0, 15)).f;
            float f4 = cdVar.f;
            float f5 = f3 - f4;
            this.g = f4;
            this.f = f5;
            f2 = f5;
            f = f4;
        }
        if (i != i3) {
            int round = Math.round((f2 * (i - 1)) + f);
            if (round >= 0) {
                i2 = round;
            }
            int g = rx0.g(j);
            if (i2 > g) {
                i2 = g;
            }
        } else {
            i2 = rx0.i(j);
        }
        return sx0.a(rx0.j(j), rx0.h(j), i2, rx0.g(j));
    }
}
