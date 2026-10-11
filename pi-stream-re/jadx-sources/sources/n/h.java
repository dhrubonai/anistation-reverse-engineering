package n;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class h implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f7877a;

    /* renamed from: b, reason: collision with root package name */
    public int f7878b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7879c;

    public h(int i10) {
        this.f7877a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7878b < this.f7877a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        if (hasNext()) {
            int i10 = this.f7878b;
            a aVar = (a) this;
            int i11 = aVar.f7854d;
            Object obj2 = aVar.f7855e;
            switch (i11) {
                case 0:
                    obj = ((e) obj2).h(i10);
                    break;
                case 1:
                    obj = ((e) obj2).l(i10);
                    break;
                default:
                    obj = ((f) obj2).f7871b[i10];
                    break;
            }
            this.f7878b++;
            this.f7879c = true;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f7879c) {
            int i10 = this.f7878b - 1;
            this.f7878b = i10;
            a aVar = (a) this;
            int i11 = aVar.f7854d;
            Object obj = aVar.f7855e;
            switch (i11) {
                case 0:
                    ((e) obj).j(i10);
                    break;
                case 1:
                    ((e) obj).j(i10);
                    break;
                default:
                    ((f) obj).f(i10);
                    break;
            }
            this.f7877a--;
            this.f7879c = false;
            return;
        }
        throw new IllegalStateException();
    }
}
