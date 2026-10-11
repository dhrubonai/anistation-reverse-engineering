package defpackage;

import com.anistation.model.settings.HoldAction;
import com.anistation.model.settings.ThemeMode;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nf2 {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final HoldAction f;
    public final Boolean g;
    public final Boolean h;
    public final String i;
    public final String j;
    public final Set k;
    public final ThemeMode l;

    public nf2(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, HoldAction holdAction, Boolean bool6, Boolean bool7, String str, String str2, Set set, ThemeMode themeMode) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
        this.e = bool5;
        this.f = holdAction;
        this.g = bool6;
        this.h = bool7;
        this.i = str;
        this.j = str2;
        this.k = set;
        this.l = themeMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf2)) {
            return false;
        }
        nf2 nf2Var = (nf2) obj;
        if (a34.i(this.a, nf2Var.a) && a34.i(this.b, nf2Var.b) && a34.i(this.c, nf2Var.c) && a34.i(this.d, nf2Var.d) && a34.i(this.e, nf2Var.e) && this.f == nf2Var.f && a34.i(this.g, nf2Var.g) && a34.i(this.h, nf2Var.h) && a34.i(this.i, nf2Var.i) && a34.i(this.j, nf2Var.j) && a34.i(this.k, nf2Var.k) && this.l == nf2Var.l) {
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
        int hashCode11;
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
        HoldAction holdAction = this.f;
        if (holdAction == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = holdAction.hashCode();
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
        String str = this.i;
        if (str == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        String str2 = this.j;
        if (str2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str2.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Set set = this.k;
        if (set == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = set.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        ThemeMode themeMode = this.l;
        if (themeMode != null) {
            i = themeMode.hashCode();
        }
        return i12 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalSettingsSnapshot(hapticsEnabled=");
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
        qx1.x(sb, this.i, ", malUsername=", this.j, ", selectedStatuses=");
        sb.append(this.k);
        sb.append(", themeMode=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
