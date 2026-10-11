package r6;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class v0 extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9555b;

    public v0(Object obj) {
        this.f9555b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f9554a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f9554a) {
            this.f9554a = true;
            return this.f9555b;
        }
        throw new NoSuchElementException();
    }
}
