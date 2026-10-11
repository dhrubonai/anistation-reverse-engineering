package v3;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class l implements i {

    /* renamed from: b, reason: collision with root package name */
    public final p4.c f10650b = new p4.c();

    @Override // v3.i
    public final void a(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            p4.c cVar = this.f10650b;
            if (i10 < cVar.f7891c) {
                k kVar = (k) cVar.h(i10);
                Object l10 = this.f10650b.l(i10);
                j jVar = kVar.f10647b;
                if (kVar.f10649d == null) {
                    kVar.f10649d = kVar.f10648c.getBytes(i.f10644a);
                }
                jVar.e(kVar.f10649d, l10, messageDigest);
                i10++;
            } else {
                return;
            }
        }
    }

    public final Object c(k kVar) {
        p4.c cVar = this.f10650b;
        if (cVar.containsKey(kVar)) {
            return cVar.getOrDefault(kVar, null);
        }
        return kVar.f10646a;
    }

    @Override // v3.i
    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f10650b.equals(((l) obj).f10650b);
        }
        return false;
    }

    @Override // v3.i
    public final int hashCode() {
        return this.f10650b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f10650b + '}';
    }
}
