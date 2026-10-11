package r6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9439a = 2;

    /* renamed from: b, reason: collision with root package name */
    public Object f9440b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z9;
        Object next;
        int i10 = this.f9439a;
        if (i10 != 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            int b10 = p.j.b(i10);
            if (b10 == 0) {
                return true;
            }
            if (b10 == 2) {
                return false;
            }
            this.f9439a = 4;
            u0 u0Var = (u0) this;
            int i11 = u0Var.f9548c;
            Object obj = u0Var.f9550e;
            Iterator it = u0Var.f9549d;
            switch (i11) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((q6.h) obj).apply(next)) {
                            break;
                        }
                    }
                    u0Var.f9439a = 3;
                    next = null;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((w1) obj).f9562c.contains(next)) {
                            break;
                        }
                    }
                    u0Var.f9439a = 3;
                    next = null;
                    break;
            }
            this.f9440b = next;
            if (this.f9439a == 3) {
                return false;
            }
            this.f9439a = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f9439a = 2;
            Object obj = this.f9440b;
            this.f9440b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
