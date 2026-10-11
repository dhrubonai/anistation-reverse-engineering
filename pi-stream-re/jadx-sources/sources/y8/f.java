package y8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f11708c = new f(x6.m.z0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f11709a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.b f11710b;

    public f(Set set, w7.b bVar) {
        r6.h0.u(set, "pins");
        this.f11709a = set;
        this.f11710b = bVar;
    }

    public final void a(String str, h7.a aVar) {
        r6.h0.u(str, "hostname");
        Iterator it = this.f11709a.iterator();
        if (!it.hasNext()) {
            return;
        }
        a3.g.z(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (r6.h0.g(fVar.f11709a, this.f11709a) && r6.h0.g(fVar.f11710b, this.f11710b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f11709a.hashCode() + 1517) * 41;
        w7.b bVar = this.f11710b;
        if (bVar != null) {
            i10 = bVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
