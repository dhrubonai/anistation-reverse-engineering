package v1;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10559a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10560b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10561c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10562d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10563e;

    public w(Object obj) {
        this(obj, -1L);
    }

    public final w a(Object obj) {
        if (this.f10559a.equals(obj)) {
            return this;
        }
        return new w(obj, this.f10560b, this.f10561c, this.f10562d, this.f10563e);
    }

    public final boolean b() {
        if (this.f10560b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f10559a.equals(wVar.f10559a) && this.f10560b == wVar.f10560b && this.f10561c == wVar.f10561c && this.f10562d == wVar.f10562d && this.f10563e == wVar.f10563e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f10559a.hashCode() + 527) * 31) + this.f10560b) * 31) + this.f10561c) * 31) + ((int) this.f10562d)) * 31) + this.f10563e;
    }

    public w(Object obj, long j4) {
        this(obj, -1, -1, j4, -1);
    }

    public w(Object obj, int i10, long j4) {
        this(obj, -1, -1, j4, i10);
    }

    public w(int i10, int i11, long j4, Object obj) {
        this(obj, i10, i11, j4, -1);
    }

    public w(Object obj, int i10, int i11, long j4, int i12) {
        this.f10559a = obj;
        this.f10560b = i10;
        this.f10561c = i11;
        this.f10562d = j4;
        this.f10563e = i12;
    }
}
