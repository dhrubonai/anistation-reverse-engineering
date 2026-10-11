package n;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f7857a;

    /* renamed from: b, reason: collision with root package name */
    public int f7858b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7859c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f7860d;

    public c(e eVar) {
        this.f7860d = eVar;
        this.f7857a = eVar.f7891c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this.f7859c) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i10 = this.f7858b;
            e eVar = this.f7860d;
            Object h10 = eVar.h(i10);
            if (key != h10 && (key == null || !key.equals(h10))) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!z9) {
                return false;
            }
            Object value = entry.getValue();
            Object l10 = eVar.l(this.f7858b);
            if (value != l10 && (value == null || !value.equals(l10))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f7859c) {
            return this.f7860d.h(this.f7858b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f7859c) {
            return this.f7860d.l(this.f7858b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7858b < this.f7857a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f7859c) {
            int i10 = this.f7858b;
            e eVar = this.f7860d;
            Object h10 = eVar.h(i10);
            Object l10 = eVar.l(this.f7858b);
            int i11 = 0;
            if (h10 == null) {
                hashCode = 0;
            } else {
                hashCode = h10.hashCode();
            }
            if (l10 != null) {
                i11 = l10.hashCode();
            }
            return hashCode ^ i11;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f7858b++;
            this.f7859c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f7859c) {
            this.f7860d.j(this.f7858b);
            this.f7858b--;
            this.f7857a--;
            this.f7859c = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f7859c) {
            return this.f7860d.k(this.f7858b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
