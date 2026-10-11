package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tw5 implements j32 {
    public final float a;
    public final float b;
    public final Object c;

    public tw5(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.ll
    public final kr6 a(tk6 tk6Var) {
        rl rlVar;
        Object obj = this.c;
        if (obj == null) {
            rlVar = null;
        } else {
            rlVar = (rl) tk6Var.a.invoke(obj);
        }
        return new sn3(this.a, this.b, rlVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tw5) {
            tw5 tw5Var = (tw5) obj;
            if (tw5Var.a == this.a && tw5Var.b == this.b && a34.i(tw5Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return Float.hashCode(this.b) + qx1.b(this.a, i * 31, 31);
    }

    public /* synthetic */ tw5(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
