package l7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import r6.h0;

/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f6878a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6879b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6880c;

    /* renamed from: d, reason: collision with root package name */
    public int f6881d;

    public b(char c6, char c10, int i10) {
        this.f6878a = i10;
        this.f6879b = c10;
        boolean z9 = true;
        if (i10 <= 0 ? h0.B(c6, c10) < 0 : h0.B(c6, c10) > 0) {
            z9 = false;
        }
        this.f6880c = z9;
        this.f6881d = z9 ? c6 : c10;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        int i10 = this.f6881d;
        if (i10 == this.f6879b) {
            if (this.f6880c) {
                this.f6880c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f6881d = this.f6878a + i10;
        }
        return Character.valueOf((char) i10);
    }

    public final void b() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6880c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        b();
        throw null;
    }
}
