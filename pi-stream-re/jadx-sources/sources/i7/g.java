package i7;

import r6.h0;

/* loaded from: classes.dex */
public abstract class g extends b implements f, m7.c {

    /* renamed from: x, reason: collision with root package name */
    public final int f5408x;

    /* renamed from: y, reason: collision with root package name */
    public final int f5409y;

    public g() {
        super(a.f5398a, v7.j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", true);
        this.f5408x = 2;
        this.f5409y = 0;
    }

    public final m7.a c() {
        l.f5413a.getClass();
        return this;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f5402d.equals(gVar.f5402d) && this.f5403e.equals(gVar.f5403e) && this.f5409y == gVar.f5409y && this.f5408x == gVar.f5408x && h0.g(this.f5400b, gVar.f5400b) && h0.g(b(), gVar.b())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof m7.c)) {
            return false;
        }
        m7.a aVar = this.f5399a;
        if (aVar == null) {
            c();
            this.f5399a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int hashCode;
        if (b() == null) {
            hashCode = 0;
        } else {
            hashCode = b().hashCode() * 31;
        }
        return this.f5403e.hashCode() + ((this.f5402d.hashCode() + hashCode) * 31);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        m7.a aVar = this.f5399a;
        if (aVar == null) {
            c();
            this.f5399a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f5402d;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return r.f.e("function ", str, " (Kotlin reflection is not available)");
    }

    @Override // i7.f
    public final int getArity() {
        return this.f5408x;
    }
}
