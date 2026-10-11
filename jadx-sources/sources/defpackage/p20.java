package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class p20 {
    public static final o20 Companion = new Object();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final long j;
    public final long k;
    public final boolean l;
    public final long m;

    public /* synthetic */ p20(int i, String str, String str2, int i2, int i3, String str3, String str4, String str5, String str6, int i4, long j, long j2, boolean z, long j3) {
        if (8189 != (i & 8189)) {
            iq4.throwMissingFieldException(i, 8189, n20.a.getDescriptor());
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = i2;
        this.d = i3;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = i4;
        this.j = j;
        this.k = j2;
        this.l = z;
        this.m = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p20)) {
            return false;
        }
        p20 p20Var = (p20) obj;
        if (a34.i(this.a, p20Var.a) && a34.i(this.b, p20Var.b) && this.c == p20Var.c && this.d == p20Var.d && a34.i(this.e, p20Var.e) && a34.i(this.f, p20Var.f) && a34.i(this.g, p20Var.g) && a34.i(this.h, p20Var.h) && this.i == p20Var.i && this.j == p20Var.j && this.k == p20Var.k && this.l == p20Var.l && this.m == p20Var.m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c = qx1.c(this.d, qx1.c(this.c, (hashCode4 + hashCode) * 31, 31), 31);
        String str2 = this.e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = zo5.i(this.f, (c + hashCode2) * 31, 31);
        String str3 = this.g;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return Long.hashCode(this.m) + zo5.g(qx1.d(qx1.d(qx1.c(this.i, (i3 + i) * 31, 31), this.j, 31), this.k, 31), 31, this.l);
    }

    public final String toString() {
        StringBuilder o = h11.o("BackupWatchProgress(id=", this.a, ", anistationId=", this.b, ", anilistId=");
        h11.y(o, this.c, ", malId=", this.d, ", animeTitle=");
        qx1.x(o, this.e, ", episodeTitle=", this.f, ", coverImage=");
        qx1.x(o, this.g, ", thumbnailImage=", this.h, ", episodeNumber=");
        o.append(this.i);
        o.append(", positionMs=");
        o.append(this.j);
        qx1.w(o, ", durationMs=", this.k, ", completed=");
        o.append(this.l);
        o.append(", updatedAt=");
        o.append(this.m);
        o.append(")");
        return o.toString();
    }

    public p20(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, int i3, long j, long j2, boolean z, long j3) {
        str.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = i3;
        this.j = j;
        this.k = j2;
        this.l = z;
        this.m = j3;
    }
}
