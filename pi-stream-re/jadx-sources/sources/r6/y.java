package r6;

import java.util.Map;

/* loaded from: classes.dex */
public final class y extends r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9571a;

    /* renamed from: b, reason: collision with root package name */
    public int f9572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f9573c;

    public y(a0 a0Var, int i10) {
        this.f9573c = a0Var;
        Object obj = a0.A;
        this.f9571a = a0Var.c(i10);
        this.f9572b = i10;
    }

    public final void a() {
        int i10 = this.f9572b;
        Object obj = this.f9571a;
        a0 a0Var = this.f9573c;
        if (i10 == -1 || i10 >= a0Var.size() || !q6.g.x(obj, a0Var.c(this.f9572b))) {
            Object obj2 = a0.A;
            this.f9572b = a0Var.b(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9571a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a0 a0Var = this.f9573c;
        Map a10 = a0Var.a();
        if (a10 != null) {
            return a10.get(this.f9571a);
        }
        a();
        int i10 = this.f9572b;
        if (i10 == -1) {
            return null;
        }
        return a0Var.k(i10);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a0 a0Var = this.f9573c;
        Map a10 = a0Var.a();
        Object obj2 = this.f9571a;
        if (a10 != null) {
            return a10.put(obj2, obj);
        }
        a();
        int i10 = this.f9572b;
        if (i10 == -1) {
            a0Var.put(obj2, obj);
            return null;
        }
        Object k10 = a0Var.k(i10);
        a0Var.i()[this.f9572b] = obj;
        return k10;
    }
}
