package p7;

/* loaded from: classes.dex */
public abstract class w extends z6.a implements z6.f {

    /* renamed from: b, reason: collision with root package name */
    public static final v f8753b = new v(0);

    public w() {
        super(androidx.lifecycle.q0.A);
    }

    public abstract void G(z6.i iVar, Runnable runnable);

    public boolean H() {
        return !(this instanceof y1);
    }

    @Override // z6.a, z6.i
    public final z6.g r(z6.h hVar) {
        boolean z9;
        r6.h0.u(hVar, "key");
        if (hVar instanceof z6.b) {
            z6.b bVar = (z6.b) hVar;
            z6.h hVar2 = this.f12066a;
            r6.h0.u(hVar2, "key");
            if (hVar2 != bVar && bVar.f12068b != hVar2) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                z6.g gVar = (z6.g) bVar.f12067a.invoke(this);
                if (gVar instanceof z6.g) {
                    return gVar;
                }
            }
        } else if (androidx.lifecycle.q0.A == hVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a0.z(this);
    }

    @Override // z6.a, z6.i
    public final z6.i v(z6.h hVar) {
        boolean z9;
        r6.h0.u(hVar, "key");
        boolean z10 = hVar instanceof z6.b;
        z6.j jVar = z6.j.f12080a;
        if (z10) {
            z6.b bVar = (z6.b) hVar;
            z6.h hVar2 = this.f12066a;
            r6.h0.u(hVar2, "key");
            if (hVar2 != bVar && bVar.f12068b != hVar2) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9 && ((z6.g) bVar.f12067a.invoke(this)) != null) {
                return jVar;
            }
        } else if (androidx.lifecycle.q0.A == hVar) {
            return jVar;
        }
        return this;
    }
}
