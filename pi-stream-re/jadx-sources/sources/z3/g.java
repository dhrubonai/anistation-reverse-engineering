package z3;

import b4.v;
import java.util.ArrayDeque;
import x3.e0;
import x3.q;

/* loaded from: classes.dex */
public final class g extends p4.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12046d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f12047e;

    public g(long j4) {
        super(j4);
    }

    @Override // p4.i
    public final int b(Object obj) {
        switch (this.f12046d) {
            case 0:
                e0 e0Var = (e0) obj;
                if (e0Var == null) {
                    return 1;
                }
                return e0Var.b();
            default:
                return 1;
        }
    }

    @Override // p4.i
    public final void c(Object obj, Object obj2) {
        switch (this.f12046d) {
            case 0:
                e0 e0Var = (e0) obj2;
                h hVar = (h) this.f12047e;
                if (hVar != null && e0Var != null) {
                    ((q) hVar).f11244e.f(e0Var, true);
                    return;
                }
                return;
            default:
                v vVar = (v) obj;
                vVar.getClass();
                ArrayDeque arrayDeque = v.f1497d;
                synchronized (arrayDeque) {
                    arrayDeque.offer(vVar);
                }
                return;
        }
    }

    public final void f(int i10) {
        long j4;
        if (i10 >= 40) {
            e(0L);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (this) {
                j4 = this.f8568b;
            }
            e(j4 / 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k3.d dVar) {
        super(500L);
        this.f12047e = dVar;
    }
}
