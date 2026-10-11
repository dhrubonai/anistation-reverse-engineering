package k9;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f6552a = new r(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f6553b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f6554c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f6553b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f6554c = atomicReferenceArr;
    }

    public static final void a(r rVar) {
        boolean z9;
        int i10;
        if (rVar.f6550f == null && rVar.f6551g == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (rVar.f6548d) {
                return;
            }
            AtomicReference atomicReference = f6554c[(int) (Thread.currentThread().getId() & (f6553b - 1))];
            r rVar2 = f6552a;
            r rVar3 = (r) atomicReference.getAndSet(rVar2);
            if (rVar3 == rVar2) {
                return;
            }
            if (rVar3 != null) {
                i10 = rVar3.f6547c;
            } else {
                i10 = 0;
            }
            if (i10 >= 65536) {
                atomicReference.set(rVar3);
                return;
            }
            rVar.f6550f = rVar3;
            rVar.f6546b = 0;
            rVar.f6547c = i10 + 8192;
            atomicReference.set(rVar);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final r b() {
        AtomicReference atomicReference = f6554c[(int) (Thread.currentThread().getId() & (f6553b - 1))];
        r rVar = f6552a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new r();
        }
        if (rVar2 == null) {
            atomicReference.set(null);
            return new r();
        }
        atomicReference.set(rVar2.f6550f);
        rVar2.f6550f = null;
        rVar2.f6547c = 0;
        return rVar2;
    }
}
