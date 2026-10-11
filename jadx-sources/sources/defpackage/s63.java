package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class s63 extends n1 {
    public final a53 f;
    public final int g;
    public int h;

    public s63(y43 y43Var, a53 a53Var) {
        super(y43Var, null);
        this.f = a53Var;
        this.g = a53Var.x.size();
        this.h = -1;
    }

    @Override // defpackage.n1
    public final q53 O(String str) {
        str.getClass();
        return (q53) this.f.x.get(Integer.parseInt(str));
    }

    @Override // defpackage.n1
    public final String Q(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.n1
    public final q53 S() {
        return this.f;
    }

    @Override // defpackage.gu0
    public final int i(aj5 aj5Var) {
        aj5Var.getClass();
        int i = this.h;
        if (i < this.g - 1) {
            int i2 = i + 1;
            this.h = i2;
            return i2;
        }
        return -1;
    }
}
