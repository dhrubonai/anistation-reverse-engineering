package defpackage;

import com.anistation.model.Page;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wm6 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Page e;
    public final List f;
    public final boolean g;
    public final List h;
    public final boolean i;
    public final String j;

    public wm6(String str, String str2, boolean z, boolean z2, Page page, List list, boolean z3, List list2, boolean z4, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = page;
        this.f = list;
        this.g = z3;
        this.h = list2;
        this.i = z4;
        this.j = str3;
    }

    public static wm6 a(wm6 wm6Var, String str, String str2, boolean z, boolean z2, Page page, List list, boolean z3, List list2, String str3, int i) {
        Page page2;
        List list3;
        boolean z4;
        List list4;
        boolean z5;
        String str4;
        if ((i & 1) != 0) {
            str = wm6Var.a;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = wm6Var.b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            z = wm6Var.c;
        }
        boolean z6 = z;
        if ((i & 8) != 0) {
            z2 = wm6Var.d;
        }
        boolean z7 = z2;
        if ((i & 16) != 0) {
            page2 = wm6Var.e;
        } else {
            page2 = page;
        }
        if ((i & 32) != 0) {
            list3 = wm6Var.f;
        } else {
            list3 = list;
        }
        if ((i & 64) != 0) {
            z4 = wm6Var.g;
        } else {
            z4 = z3;
        }
        if ((i & 128) != 0) {
            list4 = wm6Var.h;
        } else {
            list4 = list2;
        }
        if ((i & 256) != 0) {
            z5 = wm6Var.i;
        } else {
            z5 = false;
        }
        boolean z8 = z5;
        if ((i & 512) != 0) {
            str4 = wm6Var.j;
        } else {
            str4 = str3;
        }
        wm6Var.getClass();
        str5.getClass();
        str6.getClass();
        list3.getClass();
        list4.getClass();
        return new wm6(str5, str6, z6, z7, page2, list3, z4, list4, z8, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm6)) {
            return false;
        }
        wm6 wm6Var = (wm6) obj;
        if (a34.i(this.a, wm6Var.a) && a34.i(this.b, wm6Var.b) && this.c == wm6Var.c && this.d == wm6Var.d && a34.i(this.e, wm6Var.e) && a34.i(this.f, wm6Var.f) && this.g == wm6Var.g && a34.i(this.h, wm6Var.h) && this.i == wm6Var.i && a34.i(this.j, wm6Var.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int g = zo5.g(zo5.g(zo5.i(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        int i = 0;
        Page page = this.e;
        if (page == null) {
            hashCode = 0;
        } else {
            hashCode = page.hashCode();
        }
        int g2 = zo5.g(zo5.j(this.h, zo5.g(zo5.j(this.f, (g + hashCode) * 31, 31), 31, this.g), 31), 31, this.i);
        String str = this.j;
        if (str != null) {
            i = str.hashCode();
        }
        return g2 + i;
    }

    public final String toString() {
        StringBuilder o = h11.o("UiState(query=", this.a, ", submittedQuery=", this.b, ", isLoading=");
        o.append(this.c);
        o.append(", isLoadingMore=");
        o.append(this.d);
        o.append(", searchResults=");
        o.append(this.e);
        o.append(", suggestions=");
        o.append(this.f);
        o.append(", isSuggestionsLoading=");
        o.append(this.g);
        o.append(", searchHistory=");
        o.append(this.h);
        o.append(", isHistoryLoading=");
        o.append(this.i);
        o.append(", error=");
        o.append(this.j);
        o.append(")");
        return o.toString();
    }
}
