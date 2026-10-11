package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class px4 {
    public final Class a;
    public final Class b;

    public px4(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static px4 a(Class cls) {
        return new px4(ox4.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && px4.class == obj.getClass()) {
            px4 px4Var = (px4) obj;
            if (this.b.equals(px4Var.b)) {
                return this.a.equals(px4Var.a);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == ox4.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
