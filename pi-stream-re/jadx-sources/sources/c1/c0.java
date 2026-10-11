package c1;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f1633a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f1634b;

    /* renamed from: c, reason: collision with root package name */
    public final r6.r0 f1635c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1636d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1637e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1638f;

    /* renamed from: g, reason: collision with root package name */
    public final r6.o0 f1639g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f1640h;

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

    public c0(b0 b0Var) {
        b0Var.getClass();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f1633a.equals(c0Var.f1633a) && f1.b0.a(this.f1634b, c0Var.f1634b) && f1.b0.a(this.f1635c, c0Var.f1635c) && this.f1636d == c0Var.f1636d && this.f1638f == c0Var.f1638f && this.f1637e == c0Var.f1637e && this.f1639g.equals(c0Var.f1639g) && Arrays.equals(this.f1640h, c0Var.f1640h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f1633a.hashCode() * 31;
        Uri uri = this.f1634b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f1640h) + ((this.f1639g.hashCode() + ((((((((this.f1635c.hashCode() + ((hashCode + i10) * 31)) * 31) + (this.f1636d ? 1 : 0)) * 31) + (this.f1638f ? 1 : 0)) * 31) + (this.f1637e ? 1 : 0)) * 31)) * 31);
    }
}
