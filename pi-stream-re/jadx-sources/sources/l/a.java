package l;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f6562e = new HashMap();

    @Override // l.g
    public final c b(Object obj) {
        return (c) this.f6562e.get(obj);
    }

    @Override // l.g
    public final Object c(Object obj) {
        Object c6 = super.c(obj);
        this.f6562e.remove(obj);
        return c6;
    }

    public final Object d(Object obj, Object obj2) {
        c b10 = b(obj);
        if (b10 != null) {
            return b10.f6565b;
        }
        HashMap hashMap = this.f6562e;
        c cVar = new c(obj, obj2);
        this.f6576d++;
        c cVar2 = this.f6574b;
        if (cVar2 == null) {
            this.f6573a = cVar;
            this.f6574b = cVar;
        } else {
            cVar2.f6566c = cVar;
            cVar.f6567d = cVar2;
            this.f6574b = cVar;
        }
        hashMap.put(obj, cVar);
        return null;
    }
}
