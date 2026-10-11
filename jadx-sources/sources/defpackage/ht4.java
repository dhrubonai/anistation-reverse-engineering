package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ht4 extends jg4 {
    public final Object x;

    public ht4(Object obj) {
        this.x = obj;
    }

    @Override // defpackage.jg4
    public final Object a() {
        return this.x;
    }

    @Override // defpackage.jg4
    public final boolean b() {
        return true;
    }

    @Override // defpackage.jg4
    public final Object c() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ht4) {
            return this.x.equals(((ht4) obj).x);
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.x + ")";
    }
}
