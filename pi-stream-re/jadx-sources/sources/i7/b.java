package i7;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class b implements m7.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient m7.a f5399a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5400b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f5401c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5402d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5403e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5404f;

    public b(Object obj, Class cls, String str, String str2, boolean z9) {
        this.f5400b = obj;
        this.f5401c = cls;
        this.f5402d = str;
        this.f5403e = str2;
        this.f5404f = z9;
    }

    public final c b() {
        c dVar;
        Class cls = this.f5401c;
        if (cls == null) {
            return null;
        }
        if (this.f5404f) {
            l.f5413a.getClass();
            dVar = new i(cls);
        } else {
            l.f5413a.getClass();
            dVar = new d(cls);
        }
        return dVar;
    }
}
