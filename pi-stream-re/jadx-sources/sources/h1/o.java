package h1;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: b, reason: collision with root package name */
    public String f4621b;

    /* renamed from: a, reason: collision with root package name */
    public final z f4620a = new z(0);

    /* renamed from: c, reason: collision with root package name */
    public final int f4622c = 8000;

    /* renamed from: d, reason: collision with root package name */
    public final int f4623d = 8000;

    @Override // h1.g
    public final h a() {
        return new r(this.f4621b, this.f4622c, this.f4623d, this.f4620a);
    }

    public final void b(HashMap hashMap) {
        z zVar = this.f4620a;
        synchronized (zVar) {
            zVar.f4647b = null;
            zVar.f4646a.clear();
            zVar.f4646a.putAll(hashMap);
        }
    }
}
