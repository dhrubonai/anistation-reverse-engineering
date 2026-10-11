package r7;

import e0.j;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r6.h0;

/* loaded from: classes.dex */
public final class b extends j implements a {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9581c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: b, reason: collision with root package name */
    public int f9582b;

    public b(Object obj) {
        super(6);
        this._state = obj;
    }

    public final void n(Object obj) {
        int i10;
        j5.a[] aVarArr;
        if (obj == null) {
            obj = s7.a.f9930a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9581c;
            if (!h0.g(atomicReferenceFieldUpdater.get(this), obj)) {
                atomicReferenceFieldUpdater.set(this, obj);
                int i11 = this.f9582b;
                if ((i11 & 1) == 0) {
                    int i12 = i11 + 1;
                    this.f9582b = i12;
                    j5.a[] aVarArr2 = (j5.a[]) this.f3315a;
                    while (true) {
                        if (aVarArr2 != null) {
                            for (j5.a aVar : aVarArr2) {
                            }
                        }
                        synchronized (this) {
                            i10 = this.f9582b;
                            if (i10 == i12) {
                                this.f9582b = i12 + 1;
                                return;
                            }
                            aVarArr = (j5.a[]) this.f3315a;
                        }
                        aVarArr2 = aVarArr;
                        i12 = i10;
                    }
                } else {
                    this.f9582b = i11 + 2;
                }
            }
        }
    }
}
