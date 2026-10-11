package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class et1 implements ox2 {
    public final boolean x;

    public et1(boolean z) {
        this.x = z;
    }

    @Override // defpackage.ox2
    public final ha4 a() {
        return null;
    }

    @Override // defpackage.ox2
    public final boolean isActive() {
        return this.x;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.x) {
            str = "Active";
        } else {
            str = "New";
        }
        return qx1.p(sb, str, '}');
    }
}
