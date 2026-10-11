package e0;

import b4.c0;
import b4.x;
import b4.y;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public abstract class j implements y {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3315a;

    public abstract y3.k a();

    public abstract p0.a b(String str);

    public abstract p0.a c(String str, String str2);

    public abstract boolean d();

    public final y3.k e() {
        y3.k kVar = (y3.k) ((Queue) this.f3315a).poll();
        if (kVar == null) {
            return a();
        }
        return kVar;
    }

    public abstract String f();

    public abstract boolean g();

    public abstract boolean h();

    public final boolean i(CharSequence charSequence, int i10) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            i iVar = (i) this.f3315a;
            if (iVar == null) {
                return d();
            }
            int h10 = iVar.h(charSequence, i10);
            if (h10 == 0) {
                return true;
            }
            if (h10 != 1) {
                return d();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    @Override // b4.y
    public final x j(c0 c0Var) {
        return new b4.f((b4.n) this.f3315a, 2);
    }

    public abstract long k();

    public abstract j[] l();

    public final void m(y3.k kVar) {
        Object obj = this.f3315a;
        if (((Queue) obj).size() < 20) {
            ((Queue) obj).offer(kVar);
        }
    }

    public j(int i10) {
        if (i10 != 6) {
            char[] cArr = p4.m.f8575a;
            this.f3315a = new ArrayDeque(20);
        }
    }
}
