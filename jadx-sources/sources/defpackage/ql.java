package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ql extends rl {
    public float a;
    public float b;
    public float c;
    public float d;

    public ql(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.rl
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0.0f;
                    }
                    return this.d;
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.rl
    public final int b() {
        return 4;
    }

    @Override // defpackage.rl
    public final rl c() {
        return new ql(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.rl
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.rl
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.d = f;
                    return;
                }
                this.c = f;
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ql) {
            ql qlVar = (ql) obj;
            if (qlVar.a == this.a && qlVar.b == this.b && qlVar.c == this.c && qlVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + qx1.b(this.c, qx1.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder t = qx1.t("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        t.append(f3);
        t.append(", v4 = ");
        t.append(f4);
        return t.toString();
    }
}
