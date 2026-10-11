package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class s00 {
    public static final r00 Companion = new Object();
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final String f;
    public final Boolean g;
    public final Boolean h;
    public final String i;
    public final String j;
    public final String k;

    public /* synthetic */ s00(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, Boolean bool6, Boolean bool7, String str2, String str3, String str4) {
        if (215 != (i & 215)) {
            iq4.throwMissingFieldException(i, 215, q00.a.getDescriptor());
        }
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool4;
        }
        this.e = bool5;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        this.g = bool6;
        this.h = bool7;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s00)) {
            return false;
        }
        s00 s00Var = (s00) obj;
        if (a34.i(this.a, s00Var.a) && a34.i(this.b, s00Var.b) && a34.i(this.c, s00Var.c) && a34.i(this.d, s00Var.d) && a34.i(this.e, s00Var.e) && a34.i(this.f, s00Var.f) && a34.i(this.g, s00Var.g) && a34.i(this.h, s00Var.h) && a34.i(this.i, s00Var.i) && a34.i(this.j, s00Var.j) && a34.i(this.k, s00Var.k)) {
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
        int hashCode10;
        int i = 0;
        Boolean bool = this.a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool2 = this.b;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool3 = this.c;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool4 = this.d;
        if (bool4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Boolean bool5 = this.e;
        if (bool5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str = this.f;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Boolean bool6 = this.g;
        if (bool6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool6.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Boolean bool7 = this.h;
        if (bool7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool7.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str2 = this.i;
        if (str2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str2.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        String str3 = this.j;
        if (str3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str3.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        String str4 = this.k;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i11 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackupGlobalSettings(hapticsEnabled=");
        sb.append(this.a);
        sb.append(", adultEnabled=");
        sb.append(this.b);
        sb.append(", volumeBrightnessGestureEnabled=");
        sb.append(this.c);
        sb.append(", fullscreenSwipeGesturesEnabled=");
        sb.append(this.d);
        sb.append(", holdFastForwardEnabled=");
        sb.append(this.e);
        sb.append(", holdAction=");
        sb.append(this.f);
        sb.append(", doubleTapToSkipEnabled=");
        sb.append(this.g);
        sb.append(", showSkipEnabled=");
        sb.append(this.h);
        sb.append(", anilistUsername=");
        qx1.x(sb, this.i, ", malUsername=", this.j, ", themeMode=");
        return h11.k(sb, this.k, ")");
    }

    public s00(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, Boolean bool6, Boolean bool7, String str2, String str3, String str4) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
        this.e = bool5;
        this.f = str;
        this.g = bool6;
        this.h = bool7;
        this.i = str2;
        this.j = str3;
        this.k = str4;
    }
}
