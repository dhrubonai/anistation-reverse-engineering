package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vl2 {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final ArrayList h;
    public final boolean i;
    public final long j;
    public final long k;
    public final nw2 l;
    public final nw2 m;
    public final o15 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public vl2(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        boolean z3;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z3 = false;
        } else {
            z3 = true;
        }
        io3.n(z3);
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = nw2.o(arrayList2);
        this.m = nw2.o(arrayList3);
        this.n = nw2.w(arrayList4, new be((byte) 14));
        this.o = z2;
        this.p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vl2) {
                vl2 vl2Var = (vl2) obj;
                if (this.d == vl2Var.d && this.e == vl2Var.e && this.f == vl2Var.f && this.g == vl2Var.g && this.i == vl2Var.i && this.j == vl2Var.j && this.k == vl2Var.k && this.o == vl2Var.o && this.r == vl2Var.r && this.s == vl2Var.s && this.a.equals(vl2Var.a) && Objects.equals(this.b, vl2Var.b) && Objects.equals(this.c, vl2Var.c) && this.h.equals(vl2Var.h) && Objects.equals(this.l, vl2Var.l) && Objects.equals(this.m, vl2Var.m) && Objects.equals(this.n, vl2Var.n) && Objects.equals(this.p, vl2Var.p) && Objects.equals(this.q, vl2Var.q) && Objects.equals(this.t, vl2Var.t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}
