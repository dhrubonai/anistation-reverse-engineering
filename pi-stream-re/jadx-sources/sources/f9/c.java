package f9;

import r6.h0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final k9.j f3996d;

    /* renamed from: e, reason: collision with root package name */
    public static final k9.j f3997e;

    /* renamed from: f, reason: collision with root package name */
    public static final k9.j f3998f;

    /* renamed from: g, reason: collision with root package name */
    public static final k9.j f3999g;

    /* renamed from: h, reason: collision with root package name */
    public static final k9.j f4000h;

    /* renamed from: i, reason: collision with root package name */
    public static final k9.j f4001i;

    /* renamed from: a, reason: collision with root package name */
    public final k9.j f4002a;

    /* renamed from: b, reason: collision with root package name */
    public final k9.j f4003b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4004c;

    static {
        k9.j jVar = k9.j.f6522d;
        f3996d = x.v(":");
        f3997e = x.v(":status");
        f3998f = x.v(":method");
        f3999g = x.v(":path");
        f4000h = x.v(":scheme");
        f4001i = x.v(":authority");
    }

    public c(k9.j jVar, k9.j jVar2) {
        h0.u(jVar, "name");
        h0.u(jVar2, "value");
        this.f4002a = jVar;
        this.f4003b = jVar2;
        this.f4004c = jVar2.c() + jVar.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h0.g(this.f4002a, cVar.f4002a) && h0.g(this.f4003b, cVar.f4003b);
    }

    public final int hashCode() {
        return this.f4003b.hashCode() + (this.f4002a.hashCode() * 31);
    }

    public final String toString() {
        return this.f4002a.j() + ": " + this.f4003b.j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(x.v(str), x.v(str2));
        h0.u(str, "name");
        h0.u(str2, "value");
        k9.j jVar = k9.j.f6522d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(k9.j jVar, String str) {
        this(jVar, x.v(str));
        h0.u(jVar, "name");
        h0.u(str, "value");
        k9.j jVar2 = k9.j.f6522d;
    }
}
