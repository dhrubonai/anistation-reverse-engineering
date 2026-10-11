package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zu4 {
    public static final zu4 d = new zu4(0.0f, new do0(0.0f, 0.0f), 0);
    public final float a;
    public final do0 b;
    public final int c;

    public zu4(float f, do0 do0Var, int i) {
        this.a = f;
        this.b = do0Var;
        this.c = i;
        if (!Float.isNaN(f)) {
            return;
        }
        ze0.k("current must not be NaN");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zu4) {
                zu4 zu4Var = (zu4) obj;
                if (this.a == zu4Var.a && this.b.equals(zu4Var.b) && this.c == zu4Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return zo5.k(this.c, ")", sb);
    }
}
