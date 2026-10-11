package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bi6 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public bi6(String str, String str2, int i, int i2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final wp a() {
        wp wpVar = new wp((byte) 4);
        wpVar.b = this.a;
        wpVar.d = this.b;
        wpVar.e = this.c;
        wpVar.c = this.d;
        return wpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi6)) {
            return false;
        }
        bi6 bi6Var = (bi6) obj;
        if (this.a == bi6Var.a && Objects.equals(this.b, bi6Var.b) && Objects.equals(this.c, bi6Var.c) && this.d == bi6Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.a * 31;
        int i3 = 0;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((i4 + i3) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationRequest{outputHeight=");
        sb.append(this.a);
        sb.append(", audioMimeType='");
        sb.append(this.b);
        sb.append("', videoMimeType='");
        sb.append(this.c);
        sb.append("', hdrMode=");
        return qx1.o(sb, this.d, '}');
    }
}
