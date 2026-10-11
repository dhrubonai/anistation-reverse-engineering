package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xn3 extends ma2 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public xn3(kf6 kf6Var, Object obj, Object obj2) {
        super(kf6Var);
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.ma2, defpackage.kf6
    public final int b(Object obj) {
        Object obj2;
        if (h == obj && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // defpackage.ma2, defpackage.kf6
    public final hf6 f(int i, hf6 hf6Var, boolean z) {
        this.e.f(i, hf6Var, z);
        if (Objects.equals(hf6Var.b, this.g) && z) {
            hf6Var.b = h;
        }
        return hf6Var;
    }

    @Override // defpackage.ma2, defpackage.kf6
    public final Object l(int i) {
        Object l = this.e.l(i);
        if (Objects.equals(l, this.g)) {
            return h;
        }
        return l;
    }

    @Override // defpackage.ma2, defpackage.kf6
    public final jf6 m(int i, jf6 jf6Var, long j) {
        this.e.m(i, jf6Var, j);
        if (Objects.equals(jf6Var.a, this.f)) {
            jf6Var.a = jf6.q;
        }
        return jf6Var;
    }
}
