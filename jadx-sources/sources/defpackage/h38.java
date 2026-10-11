package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h38 {
    public final boolean a;
    public final List b;
    public final we7 c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final uz7 k;

    public h38(boolean z, nw2 nw2Var, we7 we7Var, String str, String str2, nw2 nw2Var2, nw2 nw2Var3, boolean z2, boolean z3, boolean z4, uz7 uz7Var) {
        nw2Var.getClass();
        we7Var.getClass();
        str.getClass();
        str2.getClass();
        nw2Var2.getClass();
        nw2Var3.getClass();
        uz7Var.getClass();
        this.a = z;
        this.b = nw2Var;
        this.c = we7Var;
        this.d = str;
        this.e = str2;
        this.f = nw2Var2;
        this.g = nw2Var3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = uz7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h38) {
                h38 h38Var = (h38) obj;
                if (this.a != h38Var.a || !this.b.equals(h38Var.b) || !a34.i(this.c, h38Var.c) || !a34.i(this.d, h38Var.d) || !a34.i(this.e, h38Var.e) || !this.f.equals(h38Var.f) || !this.g.equals(h38Var.g) || this.h != h38Var.h || this.i != h38Var.i || this.j != h38Var.j || !a34.i(this.k, h38Var.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j));
    }

    public final String toString() {
        boolean z = this.a;
        int length = String.valueOf(z).length();
        List list = this.b;
        int length2 = String.valueOf(list).length();
        we7 we7Var = this.c;
        int length3 = String.valueOf(we7Var).length();
        String str = this.d;
        int length4 = String.valueOf(str).length();
        String str2 = this.e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.h;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.i;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.j;
        int length10 = String.valueOf(z4).length();
        uz7 uz7Var = this.k;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(uz7Var).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(we7Var);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(uz7Var);
        sb.append(")");
        return sb.toString();
    }
}
