package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yg1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final Long h;
    public final String i;
    public final String j;

    public yg1(String str, String str2, String str3, String str4, String str5, String str6, Long l, Long l2, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = l;
        this.h = l2;
        this.i = str7;
        this.j = str8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yg1) {
                yg1 yg1Var = (yg1) obj;
                if (!this.a.equals(yg1Var.a) || !a34.i(this.b, yg1Var.b) || !a34.i(this.c, yg1Var.c) || !this.d.equals(yg1Var.d) || !a34.i(this.e, yg1Var.e) || !a34.i(this.f, yg1Var.f) || !a34.i(this.g, yg1Var.g) || !a34.i(this.h, yg1Var.h) || !a34.i(this.i, yg1Var.i) || !a34.i(this.j, yg1Var.j)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode8 + hashCode) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = zo5.i(this.d, (i2 + hashCode2) * 31, 31);
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l = this.g;
        if (l == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Long l2 = this.h;
        if (l2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str5 = this.i;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str6 = this.j;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i8 + i;
    }

    public final String toString() {
        StringBuilder o = h11.o("DiscordPresenceActivity(details=", this.a, ", state=", this.b, ", largeImage=");
        qx1.x(o, this.c, ", largeText=", this.d, ", smallImage=");
        qx1.x(o, this.e, ", smallText=", this.f, ", startEpochSeconds=");
        o.append(this.g);
        o.append(", endEpochSeconds=");
        o.append(this.h);
        o.append(", buttonLabel=");
        return h11.l(o, this.i, ", buttonUrl=", this.j, ")");
    }
}
