package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class od1 implements or1 {
    public final int a;
    public final int b;

    public od1(int i, int i2) {
        boolean z;
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            fz2.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
    }

    @Override // defpackage.or1
    public final void a(sr1 sr1Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = sr1Var.b;
                if (i5 > i4) {
                    char g = sr1Var.g((i5 - i4) - 1);
                    char g2 = sr1Var.g(sr1Var.b - i4);
                    if (Character.isHighSurrogate(g) && Character.isLowSurrogate(g2)) {
                        i3 += 2;
                    } else {
                        i3 = i4;
                    }
                    i2++;
                } else {
                    i3 = i5;
                    break;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = sr1Var.c;
            wp wpVar = (wp) sr1Var.f;
            if (i8 + i7 < wpVar.g()) {
                char g3 = sr1Var.g((sr1Var.c + i7) - 1);
                char g4 = sr1Var.g(sr1Var.c + i7);
                if (Character.isHighSurrogate(g3) && Character.isLowSurrogate(g4)) {
                    i6 += 2;
                } else {
                    i6 = i7;
                }
                i++;
            } else {
                i6 = wpVar.g() - sr1Var.c;
                break;
            }
        }
        int i9 = sr1Var.c;
        sr1Var.e(i9, i6 + i9);
        int i10 = sr1Var.b;
        sr1Var.e(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od1)) {
            return false;
        }
        od1 od1Var = (od1) obj;
        if (this.a == od1Var.a && this.b == od1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return qx1.l("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", this.a, ", lengthAfterCursor=", this.b, ")");
    }
}
