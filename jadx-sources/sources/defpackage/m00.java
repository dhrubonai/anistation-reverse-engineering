package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class m00 {
    public static final l00 Companion = new Object();
    public final boolean a;
    public final String b;
    public final String c;

    public /* synthetic */ m00(int i, String str, String str2, boolean z) {
        if (7 != (i & 7)) {
            iq4.throwMissingFieldException(i, 7, k00.a.getDescriptor());
        }
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m00)) {
            return false;
        }
        m00 m00Var = (m00) obj;
        if (this.a == m00Var.a && a34.i(this.b, m00Var.b) && a34.i(this.c, m00Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackupDownloadSettings(downloadOverWifiOnly=");
        sb.append(this.a);
        sb.append(", externalLocationUri=");
        sb.append(this.b);
        sb.append(", externalLocationName=");
        return h11.k(sb, this.c, ")");
    }

    public m00(boolean z, String str, String str2) {
        str2.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
    }
}
