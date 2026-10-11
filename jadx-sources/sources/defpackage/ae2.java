package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ae2 extends gu2 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public ae2(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ae2.class == obj.getClass()) {
                ae2 ae2Var = (ae2) obj;
                if (Objects.equals(this.b, ae2Var.b) && this.c.equals(ae2Var.c) && this.d.equals(ae2Var.d) && Arrays.equals(this.e, ae2Var.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.e) + zo5.i(this.d, zo5.i(this.c, (527 + i) * 31, 31), 31);
    }

    @Override // defpackage.gu2
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
