package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p96 implements CharSequence {
    public final CharSequence A;
    public final long B;
    public final nd6 C;
    public final ai4 D;
    public final List x;
    public final List y;
    public final lc6 z;

    public p96(CharSequence charSequence, long j, nd6 nd6Var, ai4 ai4Var, List list, List list2, lc6 lc6Var, int i) {
        CharSequence charSequence2;
        nd6 nd6Var2;
        nd6Var = (i & 4) != 0 ? null : nd6Var;
        ai4Var = (i & 8) != 0 ? null : ai4Var;
        list = (i & 16) != 0 ? null : list;
        list2 = (i & 32) != 0 ? null : list2;
        lc6Var = (i & 64) != 0 ? null : lc6Var;
        this.x = list;
        this.y = list2;
        this.z = lc6Var;
        if (charSequence instanceof p96) {
            charSequence2 = ((p96) charSequence).A;
        } else {
            charSequence2 = charSequence;
        }
        this.A = charSequence2;
        this.B = fy5.b(charSequence.length(), j);
        if (nd6Var != null) {
            nd6Var2 = new nd6(fy5.b(charSequence.length(), nd6Var.a));
        } else {
            nd6Var2 = null;
        }
        this.C = nd6Var2;
        this.D = ai4Var != null ? new ai4(ai4Var.x, new nd6(fy5.b(charSequence.length(), ((nd6) ai4Var.y).a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.A.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p96.class != obj.getClass()) {
            return false;
        }
        p96 p96Var = (p96) obj;
        if (!nd6.c(this.B, p96Var.B) || !a34.i(this.C, p96Var.C) || !a34.i(this.D, p96Var.D) || !a34.i(this.x, p96Var.x)) {
            return false;
        }
        if (b06.y(this.A, p96Var.A) && a34.i(this.z, p96Var.z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = this.A.hashCode() * 31;
        int i4 = nd6.c;
        int d = qx1.d(hashCode, this.B, 31);
        int i5 = 0;
        nd6 nd6Var = this.C;
        if (nd6Var != null) {
            i = Long.hashCode(nd6Var.a);
        } else {
            i = 0;
        }
        int i6 = (d + i) * 31;
        ai4 ai4Var = this.D;
        if (ai4Var != null) {
            i2 = ai4Var.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        List list = this.x;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        lc6 lc6Var = this.z;
        if (lc6Var != null) {
            i5 = lc6Var.hashCode();
        }
        return i8 + i5;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.A.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.A.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.A.toString();
    }
}
