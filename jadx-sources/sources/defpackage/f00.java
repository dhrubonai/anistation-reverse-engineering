package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class f00 {
    public static final e00 Companion = new Object();
    public final String a;
    public final int b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final int h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final long o;
    public final long p;

    public /* synthetic */ f00(int i, String str, int i2, Integer num, String str2, String str3, String str4, Integer num2, int i3, String str5, String str6, int i4, int i5, String str7, String str8, long j, long j2) {
        if (65534 != (i & 65534)) {
            iq4.throwMissingFieldException(i, 65534, d00.a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = i2;
        this.c = num;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = num2;
        this.h = i3;
        this.i = str5;
        this.j = str6;
        this.k = i4;
        this.l = i5;
        this.m = str7;
        this.n = str8;
        this.o = j;
        this.p = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f00)) {
            return false;
        }
        f00 f00Var = (f00) obj;
        if (a34.i(this.a, f00Var.a) && this.b == f00Var.b && a34.i(this.c, f00Var.c) && a34.i(this.d, f00Var.d) && a34.i(this.e, f00Var.e) && a34.i(this.f, f00Var.f) && a34.i(this.g, f00Var.g) && this.h == f00Var.h && a34.i(this.i, f00Var.i) && a34.i(this.j, f00Var.j) && this.k == f00Var.k && this.l == f00Var.l && a34.i(this.m, f00Var.m) && a34.i(this.n, f00Var.n) && this.o == f00Var.o && this.p == f00Var.p) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c = qx1.c(this.b, hashCode * 31, 31);
        Integer num = this.c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i2 = zo5.i(this.d, (c + hashCode2) * 31, 31);
        String str2 = this.e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str3 = this.f;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Integer num2 = this.g;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int c2 = qx1.c(this.h, (i4 + hashCode5) * 31, 31);
        String str4 = this.i;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int c3 = qx1.c(this.l, qx1.c(this.k, zo5.i(this.j, (c2 + hashCode6) * 31, 31), 31), 31);
        String str5 = this.m;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i5 = (c3 + hashCode7) * 31;
        String str6 = this.n;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return Long.hashCode(this.p) + qx1.d((i5 + i) * 31, this.o, 31);
    }

    public final String toString() {
        StringBuilder m = h11.m(this.b, "BackupAnimeListItem(anistationId=", this.a, ", anilistId=", ", malId=");
        m.append(this.c);
        m.append(", title=");
        m.append(this.d);
        m.append(", coverImage=");
        qx1.x(m, this.e, ", bannerImage=", this.f, ", totalEpisodes=");
        m.append(this.g);
        m.append(", currentAiredEpisodes=");
        m.append(this.h);
        m.append(", mediaStatus=");
        qx1.x(m, this.i, ", watchStatus=", this.j, ", importedProgress=");
        h11.y(m, this.k, ", score=", this.l, ", format=");
        qx1.x(m, this.m, ", notes=", this.n, ", createdAt=");
        m.append(this.o);
        m.append(", updatedAt=");
        m.append(this.p);
        m.append(")");
        return m.toString();
    }

    public f00(String str, int i, Integer num, String str2, String str3, String str4, Integer num2, int i2, String str5, String str6, int i3, int i4, String str7, String str8, long j, long j2) {
        str2.getClass();
        str6.getClass();
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = num2;
        this.h = i2;
        this.i = str5;
        this.j = str6;
        this.k = i3;
        this.l = i4;
        this.m = str7;
        this.n = str8;
        this.o = j;
        this.p = j2;
    }
}
