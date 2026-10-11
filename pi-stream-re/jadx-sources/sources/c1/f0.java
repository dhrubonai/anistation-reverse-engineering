package c1;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f1682a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1683b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f1684c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1685d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1686e = null;

    /* renamed from: f, reason: collision with root package name */
    public final r6.o0 f1687f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1688g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1689h;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
        f1.b0.J(5);
        f1.b0.J(6);
        f1.b0.J(7);
    }

    public f0(Uri uri, String str, c0 c0Var, List list, r6.o0 o0Var, Object obj, long j4) {
        this.f1682a = uri;
        this.f1683b = q0.o(str);
        this.f1684c = c0Var;
        this.f1685d = list;
        this.f1687f = o0Var;
        r6.l0 i10 = r6.o0.i();
        for (int i11 = 0; i11 < o0Var.size(); i11++) {
            i10.y0(i0.a(((j0) o0Var.get(i11)).a()));
        }
        i10.C0();
        this.f1688g = obj;
        this.f1689h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f1682a.equals(f0Var.f1682a) && f1.b0.a(this.f1683b, f0Var.f1683b) && f1.b0.a(this.f1684c, f0Var.f1684c) && f1.b0.a(null, null) && this.f1685d.equals(f0Var.f1685d) && f1.b0.a(this.f1686e, f0Var.f1686e) && this.f1687f.equals(f0Var.f1687f) && f1.b0.a(this.f1688g, f0Var.f1688g) && f1.b0.a(Long.valueOf(this.f1689h), Long.valueOf(f0Var.f1689h))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f1682a.hashCode() * 31;
        int i10 = 0;
        String str = this.f1683b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        c0 c0Var = this.f1684c;
        if (c0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0Var.hashCode();
        }
        int hashCode5 = (this.f1685d.hashCode() + ((((i11 + hashCode2) * 31) + 0) * 31)) * 31;
        String str2 = this.f1686e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode6 = (this.f1687f.hashCode() + ((hashCode5 + hashCode3) * 31)) * 31;
        Object obj = this.f1688g;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return (int) (((hashCode6 + i10) * 31) + this.f1689h);
    }
}
