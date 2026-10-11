package l7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f6885a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6886b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6887c;

    /* renamed from: d, reason: collision with root package name */
    public int f6888d;

    public e(int i10, int i11, int i12) {
        this.f6885a = i12;
        this.f6886b = i11;
        boolean z9 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z9 = false;
        }
        this.f6887c = z9;
        this.f6888d = z9 ? i10 : i11;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    public final int b() {
        int i10 = this.f6888d;
        if (i10 == this.f6886b) {
            if (this.f6887c) {
                this.f6887c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f6888d = this.f6885a + i10;
        }
        return i10;
    }

    public final void c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6887c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
