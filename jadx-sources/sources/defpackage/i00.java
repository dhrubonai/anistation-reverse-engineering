package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class i00 {
    public static final h00 Companion = new Object();
    public final String a;
    public final int b;
    public final String c;
    public final v00 d;

    public /* synthetic */ i00(int i, String str, int i2, String str2, v00 v00Var) {
        if (12 != (i & 12)) {
            iq4.throwMissingFieldException(i, 12, g00.a.getDescriptor());
        }
        this.a = (i & 1) == 0 ? "AniStationBackup" : str;
        if ((i & 2) == 0) {
            this.b = 2;
        } else {
            this.b = i2;
        }
        this.c = str2;
        this.d = v00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i00)) {
            return false;
        }
        i00 i00Var = (i00) obj;
        if (a34.i(this.a, i00Var.a) && this.b == i00Var.b && a34.i(this.c, i00Var.c) && a34.i(this.d, i00Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + zo5.i(this.c, qx1.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = h11.m(this.b, "BackupArchive(format=", this.a, ", version=", ", checksumSha256=");
        m.append(this.c);
        m.append(", payload=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }

    public i00(String str, v00 v00Var) {
        this.a = "AniStationBackup";
        this.b = 2;
        this.c = str;
        this.d = v00Var;
    }
}
