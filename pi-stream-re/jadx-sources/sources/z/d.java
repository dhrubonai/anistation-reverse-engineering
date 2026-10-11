package z;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f11855e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f11856a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11857b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11858c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11859d;

    public d(int i10, int i11, int i12, int i13) {
        this.f11856a = i10;
        this.f11857b = i11;
        this.f11858c = i12;
        this.f11859d = i13;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f11856a, dVar2.f11856a), Math.max(dVar.f11857b, dVar2.f11857b), Math.max(dVar.f11858c, dVar2.f11858c), Math.max(dVar.f11859d, dVar2.f11859d));
    }

    public static d b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f11855e;
        }
        return new d(i10, i11, i12, i13);
    }

    public static d c(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return b(i10, i11, i12, i13);
    }

    public final Insets d() {
        return c.a(this.f11856a, this.f11857b, this.f11858c, this.f11859d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f11859d == dVar.f11859d && this.f11856a == dVar.f11856a && this.f11858c == dVar.f11858c && this.f11857b == dVar.f11857b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f11856a * 31) + this.f11857b) * 31) + this.f11858c) * 31) + this.f11859d;
    }

    public final String toString() {
        return "Insets{left=" + this.f11856a + ", top=" + this.f11857b + ", right=" + this.f11858c + ", bottom=" + this.f11859d + '}';
    }
}
