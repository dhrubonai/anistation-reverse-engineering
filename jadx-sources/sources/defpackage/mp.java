package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mp extends gu2 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public mp(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // defpackage.ey3
    public final void b(hr3 hr3Var) {
        hr3Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && mp.class == obj.getClass()) {
                mp mpVar = (mp) obj;
                if (this.d == mpVar.d && this.b.equals(mpVar.b) && Objects.equals(this.c, mpVar.c) && Arrays.equals(this.e, mpVar.e)) {
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
        int i2 = zo5.i(this.b, (527 + this.d) * 31, 31);
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.e) + ((i2 + i) * 31);
    }

    @Override // defpackage.gu2
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
