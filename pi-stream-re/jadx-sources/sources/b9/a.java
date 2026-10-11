package b9;

import r6.h0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1548a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1549b;

    /* renamed from: c, reason: collision with root package name */
    public c f1550c;

    /* renamed from: d, reason: collision with root package name */
    public long f1551d;

    public a(String str, boolean z9) {
        h0.u(str, "name");
        this.f1548a = str;
        this.f1549b = z9;
        this.f1551d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f1548a;
    }
}
