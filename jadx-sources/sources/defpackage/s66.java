package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s66 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final byte f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public s66(int i, int i2, String str, String str2, String str3, boolean z) {
        int i3;
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (uz5.M(upperCase, "INT", false)) {
            i3 = 3;
        } else if (!uz5.M(upperCase, "CHAR", false) && !uz5.M(upperCase, "CLOB", false) && !uz5.M(upperCase, "TEXT", false)) {
            if (uz5.M(upperCase, "BLOB", false)) {
                i3 = 5;
            } else if (!uz5.M(upperCase, "REAL", false) && !uz5.M(upperCase, "FLOA", false) && !uz5.M(upperCase, "DOUB", false)) {
                i3 = 1;
            } else {
                i3 = 4;
            }
        } else {
            i3 = 2;
        }
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj instanceof s66) {
                if (this.d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                s66 s66Var = (s66) obj;
                byte b = s66Var.f;
                if (s66Var.d > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2 && a34.i(this.a, s66Var.a) && this.c == s66Var.c) {
                    String str = s66Var.e;
                    byte b2 = this.f;
                    String str2 = this.e;
                    if ((b2 != 1 || b != 2 || str2 == null || gy5.c(str2, str)) && ((b2 != 2 || b != 1 || str == null || gy5.c(str, str2)) && ((b2 == 0 || b2 != b || (str2 == null ? str == null : gy5.c(str2, str))) && this.g == s66Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() * 31) + this.g) * 31;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((hashCode + i) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return vz5.t(vz5.v(sb.toString()));
    }
}
