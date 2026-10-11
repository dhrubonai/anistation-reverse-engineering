package x6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class r implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public u f11321a = u.f11339b;

    /* renamed from: b, reason: collision with root package name */
    public Object f11322b;

    /* renamed from: c, reason: collision with root package name */
    public int f11323c;

    /* renamed from: d, reason: collision with root package name */
    public int f11324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f11325e;

    public r(s sVar) {
        this.f11325e = sVar;
        this.f11323c = sVar.b();
        this.f11324d = sVar.f11328c;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        boolean z9;
        u uVar = this.f11321a;
        u uVar2 = u.f11341d;
        if (uVar != uVar2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            int ordinal = uVar.ordinal();
            if (ordinal == 0) {
                return true;
            }
            if (ordinal != 2) {
                this.f11321a = uVar2;
                int i10 = this.f11323c;
                if (i10 == 0) {
                    this.f11321a = u.f11340c;
                } else {
                    s sVar = this.f11325e;
                    Object[] objArr = sVar.f11326a;
                    int i11 = this.f11324d;
                    this.f11322b = objArr[i11];
                    this.f11321a = u.f11338a;
                    this.f11324d = (i11 + 1) % sVar.f11327b;
                    this.f11323c = i10 - 1;
                }
                if (this.f11321a == u.f11338a) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (hasNext()) {
            this.f11321a = u.f11339b;
            return this.f11322b;
        }
        throw new NoSuchElementException();
    }

    public final void c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
