package b4;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f1497d;

    /* renamed from: a, reason: collision with root package name */
    public int f1498a;

    /* renamed from: b, reason: collision with root package name */
    public int f1499b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1500c;

    static {
        char[] cArr = p4.m.f8575a;
        f1497d = new ArrayDeque(0);
    }

    public static v a(Object obj) {
        v vVar;
        ArrayDeque arrayDeque = f1497d;
        synchronized (arrayDeque) {
            vVar = (v) arrayDeque.poll();
        }
        if (vVar == null) {
            vVar = new v();
        }
        vVar.f1500c = obj;
        vVar.f1499b = 0;
        vVar.f1498a = 0;
        return vVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f1499b != vVar.f1499b || this.f1498a != vVar.f1498a || !this.f1500c.equals(vVar.f1500c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1500c.hashCode() + (((this.f1498a * 31) + this.f1499b) * 31);
    }
}
