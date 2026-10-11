package defpackage;

import com.anistation.model.settings.SubtitleStyleSettings;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rt6 {
    public final Boolean a;
    public final String b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final SubtitleStyleSettings j;
    public final String k;

    public rt6(Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, String str3, String str4, SubtitleStyleSettings subtitleStyleSettings, String str5) {
        subtitleStyleSettings.getClass();
        this.a = bool;
        this.b = str;
        this.c = bool2;
        this.d = bool3;
        this.e = bool4;
        this.f = bool5;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = subtitleStyleSettings;
        this.k = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt6)) {
            return false;
        }
        rt6 rt6Var = (rt6) obj;
        if (a34.i(this.a, rt6Var.a) && a34.i(this.b, rt6Var.b) && a34.i(this.c, rt6Var.c) && a34.i(this.d, rt6Var.d) && a34.i(this.e, rt6Var.e) && a34.i(this.f, rt6Var.f) && a34.i(this.g, rt6Var.g) && a34.i(this.h, rt6Var.h) && a34.i(this.i, rt6Var.i) && a34.i(this.j, rt6Var.j) && a34.i(this.k, rt6Var.k)) {
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
        int hashCode10 = (this.j.hashCode() + ((i9 + hashCode9) * 31)) * 31;
        String str5 = this.k;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSettingsSnapshot(dubEnabled=");
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
        sb.append(", subtitleStyle=");
        sb.append(this.j);
        sb.append(", audioLanguage=");
        return h11.k(sb, this.k, ")");
    }
}
