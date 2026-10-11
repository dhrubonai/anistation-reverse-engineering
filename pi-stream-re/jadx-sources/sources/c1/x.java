package c1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f1950a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1951b;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
    }

    public x(String str, String str2) {
        this.f1950a = f1.b0.P(str);
        this.f1951b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (f1.b0.a(this.f1950a, xVar.f1950a) && f1.b0.a(this.f1951b, xVar.f1951b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f1951b.hashCode() * 31;
        String str = this.f1950a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
