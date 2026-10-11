package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class m20 {
    public static final l20 Companion = new Object();
    public final Boolean a;
    public final String b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final float j;
    public final float k;
    public final float l;
    public final int m;
    public final int n;
    public final String o;
    public final String p;
    public final boolean q;

    public /* synthetic */ m20(int i, Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, String str3, String str4, float f, float f2, float f3, int i2, int i3, String str5, String str6, boolean z) {
        String str7;
        boolean z2;
        if (32767 != (i & 32767)) {
            iq4.throwMissingFieldException(i, 32767, k20.a.getDescriptor());
        }
        this.a = bool;
        this.b = str;
        this.c = bool2;
        this.d = bool3;
        this.e = bool4;
        this.f = bool5;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = f;
        this.k = f2;
        this.l = f3;
        this.m = i2;
        this.n = i3;
        this.o = str5;
        if ((32768 & i) == 0) {
            str7 = null;
        } else {
            str7 = str6;
        }
        this.p = str7;
        if ((i & 65536) == 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        this.q = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m20)) {
            return false;
        }
        m20 m20Var = (m20) obj;
        if (a34.i(this.a, m20Var.a) && a34.i(this.b, m20Var.b) && a34.i(this.c, m20Var.c) && a34.i(this.d, m20Var.d) && a34.i(this.e, m20Var.e) && a34.i(this.f, m20Var.f) && a34.i(this.g, m20Var.g) && a34.i(this.h, m20Var.h) && a34.i(this.i, m20Var.i) && Float.compare(this.j, m20Var.j) == 0 && Float.compare(this.k, m20Var.k) == 0 && Float.compare(this.l, m20Var.l) == 0 && this.m == m20Var.m && this.n == m20Var.n && a34.i(this.o, m20Var.o) && a34.i(this.p, m20Var.p) && this.q == m20Var.q) {
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
        int hashCode8;
        int hashCode9;
        int i = 0;
        Boolean bool = this.a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool2 = this.c;
        if (bool2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool3 = this.d;
        if (bool3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Boolean bool4 = this.e;
        if (bool4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Boolean bool5 = this.f;
        if (bool5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool5.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str2 = this.g;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str3 = this.h;
        if (str3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str3.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str4 = this.i;
        if (str4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str4.hashCode();
        }
        int i10 = zo5.i(this.o, qx1.c(this.n, qx1.c(this.m, qx1.b(this.l, qx1.b(this.k, qx1.b(this.j, (i9 + hashCode9) * 31, 31), 31), 31), 31), 31), 31);
        String str5 = this.p;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return Boolean.hashCode(this.q) + ((i10 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackupVideoSettings(dubEnabled=");
        sb.append(this.a);
        sb.append(", selectedQuality=");
        sb.append(this.b);
        sb.append(", autoPlayEnabled=");
        sb.append(this.c);
        sb.append(", autoNextEnabled=");
        sb.append(this.d);
        sb.append(", autoSkipEnabled=");
        sb.append(this.e);
        sb.append(", subtitlesEnabled=");
        sb.append(this.f);
        sb.append(", subtitleLanguage=");
        qx1.x(sb, this.g, ", server=", this.h, ", selectedContentScale=");
        sb.append(this.i);
        sb.append(", subtitleFontScale=");
        sb.append(this.j);
        sb.append(", subtitleVerticalPosition=");
        h11.x(sb, this.k, ", subtitleOutlineWidthDp=", this.l, ", subtitleTextColorArgb=");
        h11.y(sb, this.m, ", subtitleOutlineColorArgb=", this.n, ", subtitleFontFamily=");
        qx1.x(sb, this.o, ", audioLanguage=", this.p, ", subtitleIsBold=");
        return qx1.r(sb, this.q, ")");
    }

    public m20(Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, String str3, String str4, float f, float f2, float f3, int i, int i2, String str5, String str6, boolean z) {
        str5.getClass();
        this.a = bool;
        this.b = str;
        this.c = bool2;
        this.d = bool3;
        this.e = bool4;
        this.f = bool5;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = f;
        this.k = f2;
        this.l = f3;
        this.m = i;
        this.n = i2;
        this.o = str5;
        this.p = str6;
        this.q = z;
    }
}
