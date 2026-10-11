package i7;

import p7.a0;
import r6.h0;

/* loaded from: classes.dex */
public abstract class j extends b implements m7.d, h7.a {

    /* renamed from: x, reason: collision with root package name */
    public final boolean f5411x;

    public j(Object obj) {
        super(obj, a0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f5411x = false;
    }

    @Override // h7.a
    public final Object a() {
        return ((t7.m) this).f5400b.getClass().getSimpleName();
    }

    public final m7.a c() {
        if (!this.f5411x) {
            m7.a aVar = this.f5399a;
            if (aVar == null) {
                d();
                this.f5399a = this;
            } else {
                return aVar;
            }
        }
        return this;
    }

    public final m7.a d() {
        l.f5413a.getClass();
        return this;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (b().equals(jVar.b()) && this.f5402d.equals(jVar.f5402d) && this.f5403e.equals(jVar.f5403e) && h0.g(this.f5400b, jVar.f5400b)) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof m7.d)) {
            return false;
        }
        return obj.equals(c());
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        return this.f5403e.hashCode() + ((this.f5402d.hashCode() + (b().hashCode() * 31)) * 31);
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        m7.a c6 = c();
        if (c6 != this) {
            return c6.toString();
        }
        return a3.g.t(new StringBuilder("property "), this.f5402d, " (Kotlin reflection is not available)");
    }
}
