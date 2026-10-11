package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fu4 extends gu2 {
    public final String b;
    public final byte[] c;

    public fu4(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && fu4.class == obj.getClass()) {
                fu4 fu4Var = (fu4) obj;
                if (this.b.equals(fu4Var.b) && Arrays.equals(this.c, fu4Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + zo5.i(this.b, 527, 31);
    }

    @Override // defpackage.gu2
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
