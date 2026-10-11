package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yk5 implements or1 {
    public final ko a;
    public final int b;

    public yk5(String str, int i) {
        this.a = new ko(str);
        this.b = i;
    }

    @Override // defpackage.or1
    public final void a(sr1 sr1Var) {
        int length;
        String str = this.a.y;
        int i = sr1Var.d;
        int i2 = -1;
        if (i != -1) {
            sr1Var.n(str, i, sr1Var.e);
            if (str.length() > 0) {
                sr1Var.o(i, str.length() + i);
            }
        } else {
            int i3 = sr1Var.b;
            sr1Var.n(str, i3, sr1Var.c);
            if (str.length() > 0) {
                sr1Var.o(i3, str.length() + i3);
            }
        }
        int i4 = sr1Var.b;
        int i5 = sr1Var.c;
        if (i4 == i5) {
            i2 = i5;
        }
        int i6 = this.b;
        if (i6 > 0) {
            length = (i2 + i6) - 1;
        } else {
            length = (i2 + i6) - str.length();
        }
        int C = db.C(length, 0, ((wp) sr1Var.f).g());
        sr1Var.p(C, C);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yk5) {
                yk5 yk5Var = (yk5) obj;
                if (!a34.i(this.a.y, yk5Var.a.y) || this.b != yk5Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.y.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + this.a.y + "', newCursorPosition=" + this.b + ")";
    }
}
