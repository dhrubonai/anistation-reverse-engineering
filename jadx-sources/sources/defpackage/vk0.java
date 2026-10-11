package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vk0 extends cl0 {
    public final cl0 x;
    public final cl0 y;

    public vk0(cl0 cl0Var, cl0 cl0Var2) {
        this.x = cl0Var;
        cl0Var2.getClass();
        this.y = cl0Var2;
    }

    @Override // defpackage.gs4
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    @Override // defpackage.cl0
    public final boolean b(char c) {
        if (this.x.b(c) && this.y.b(c)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.x + ", " + this.y + ")";
    }
}
