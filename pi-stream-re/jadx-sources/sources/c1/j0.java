package c1;

import android.net.Uri;

/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f1728a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1729b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1730c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1731d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1732e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1733f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1734g;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
        f1.b0.J(5);
        f1.b0.J(6);
    }

    public j0(i0 i0Var) {
        this.f1728a = i0Var.f1714c;
        this.f1729b = (String) i0Var.f1715d;
        this.f1730c = (String) i0Var.f1716e;
        this.f1731d = i0Var.f1712a;
        this.f1732e = i0Var.f1713b;
        this.f1733f = (String) i0Var.f1717f;
        this.f1734g = (String) i0Var.f1718g;
    }

    public final i0 a() {
        return new i0(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f1728a.equals(j0Var.f1728a) && f1.b0.a(this.f1729b, j0Var.f1729b) && f1.b0.a(this.f1730c, j0Var.f1730c) && this.f1731d == j0Var.f1731d && this.f1732e == j0Var.f1732e && f1.b0.a(this.f1733f, j0Var.f1733f) && f1.b0.a(this.f1734g, j0Var.f1734g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f1728a.hashCode() * 31;
        int i10 = 0;
        String str = this.f1729b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f1730c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.f1731d) * 31) + this.f1732e) * 31;
        String str3 = this.f1733f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f1734g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
