package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mw4 {
    public final jw4 a;
    public final boolean b;
    public final tt5 c;
    public final ub2 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public mw4(jw4 jw4Var, Object obj, boolean z, tt5 tt5Var, ub2 ub2Var, boolean z2) {
        this.a = jw4Var;
        this.b = z;
        this.c = tt5Var;
        this.d = ub2Var;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        eu0.b("Unexpected form of a provided value");
        v71.e();
        return null;
    }
}
