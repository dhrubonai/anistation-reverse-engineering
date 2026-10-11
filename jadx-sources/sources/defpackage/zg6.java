package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zg6 {
    public static final zg6 d = new zg6(new yg6[0]);
    public static final String e;
    public final int a;
    public final o15 b;
    public int c;

    static {
        String str = eq6.a;
        e = Integer.toString(0, 36);
    }

    public zg6(yg6... yg6VarArr) {
        o15 p = nw2.p(yg6VarArr);
        this.b = p;
        this.a = yg6VarArr.length;
        int i = 0;
        while (i < p.A) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < p.A; i3++) {
                if (((yg6) p.get(i)).equals(p.get(i3))) {
                    kb0.t("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final yg6 a(int i) {
        return (yg6) this.b.get(i);
    }

    public final int b(yg6 yg6Var) {
        int indexOf = this.b.indexOf(yg6Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && zg6.class == obj.getClass()) {
                zg6 zg6Var = (zg6) obj;
                if (this.a == zg6Var.a && this.b.equals(zg6Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = this.b.hashCode();
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        return this.b.toString();
    }
}
