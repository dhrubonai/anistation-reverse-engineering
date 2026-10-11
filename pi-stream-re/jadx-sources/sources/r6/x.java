package r6;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class x implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f9563a;

    /* renamed from: b, reason: collision with root package name */
    public int f9564b;

    /* renamed from: c, reason: collision with root package name */
    public int f9565c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f9566d;

    public x(a0 a0Var) {
        int i10;
        this.f9566d = a0Var;
        this.f9563a = a0Var.f9433e;
        if (a0Var.isEmpty()) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        this.f9564b = i10;
        this.f9565c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9564b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object k10;
        a0 a0Var = this.f9566d;
        if (a0Var.f9433e == this.f9563a) {
            if (hasNext()) {
                int i10 = this.f9564b;
                this.f9565c = i10;
                v vVar = (v) this;
                int i11 = vVar.f9552e;
                a0 a0Var2 = vVar.f9553f;
                switch (i11) {
                    case 0:
                        k10 = a0Var2.c(i10);
                        break;
                    case 1:
                        k10 = new y(a0Var2, i10);
                        break;
                    default:
                        k10 = a0Var2.k(i10);
                        break;
                }
                int i12 = this.f9564b + 1;
                if (i12 >= a0Var.f9434f) {
                    i12 = -1;
                }
                this.f9564b = i12;
                return k10;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z9;
        a0 a0Var = this.f9566d;
        if (a0Var.f9433e == this.f9563a) {
            if (this.f9565c >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            h0.x("no calls to next() since the last call to remove()", z9);
            this.f9563a += 32;
            a0Var.remove(a0Var.c(this.f9565c));
            this.f9564b--;
            this.f9565c = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
