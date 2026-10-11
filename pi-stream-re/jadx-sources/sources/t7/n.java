package t7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r6.h0;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10075a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10076b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10077c = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r6 = ((t7.u) r6).f10088a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r5.compareAndSet(r4, r2, r6) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r5.get(r4) == r2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r7 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t7.n e() {
        /*
            r11 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = t7.n.f10076b
            java.lang.Object r1 = r0.get(r11)
            t7.n r1 = (t7.n) r1
            r2 = r1
        L9:
            r3 = 0
            r4 = r3
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = t7.n.f10075a
            java.lang.Object r6 = r5.get(r2)
            r7 = 0
            r8 = 1
            if (r6 != r11) goto L2a
            if (r1 != r2) goto L18
            return r2
        L18:
            boolean r3 = r0.compareAndSet(r11, r1, r2)
            if (r3 == 0) goto L20
            r7 = r8
            goto L26
        L20:
            java.lang.Object r3 = r0.get(r11)
            if (r3 == r1) goto L18
        L26:
            if (r7 != 0) goto L29
            goto L0
        L29:
            return r2
        L2a:
            boolean r9 = r11.j()
            if (r9 == 0) goto L31
            return r3
        L31:
            if (r6 != 0) goto L34
            return r2
        L34:
            boolean r9 = r6 instanceof t7.t
            if (r9 == 0) goto L3e
            t7.t r6 = (t7.t) r6
            r6.a(r2)
            goto L0
        L3e:
            boolean r9 = r6 instanceof t7.u
            if (r9 == 0) goto L62
            if (r4 == 0) goto L5b
            t7.u r6 = (t7.u) r6
            t7.n r6 = r6.f10088a
        L48:
            boolean r3 = r5.compareAndSet(r4, r2, r6)
            if (r3 == 0) goto L50
            r7 = r8
            goto L56
        L50:
            java.lang.Object r3 = r5.get(r4)
            if (r3 == r2) goto L48
        L56:
            if (r7 != 0) goto L59
            goto L0
        L59:
            r2 = r4
            goto L9
        L5b:
            java.lang.Object r2 = r0.get(r2)
            t7.n r2 = (t7.n) r2
            goto Lb
        L62:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            r6.h0.r(r6, r4)
            r4 = r6
            t7.n r4 = (t7.n) r4
            r10 = r4
            r4 = r2
            r2 = r10
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.n.e():t7.n");
    }

    public final void f(n nVar) {
        boolean z9;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10076b;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(nVar);
            if (g() != nVar) {
                return;
            }
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(nVar, nVar2, this)) {
                    z9 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(nVar) != nVar2) {
                    z9 = false;
                    break;
                }
            }
        } while (!z9);
        if (j()) {
            nVar.e();
        }
    }

    public final Object g() {
        while (true) {
            Object obj = f10075a.get(this);
            if (!(obj instanceof t)) {
                return obj;
            }
            ((t) obj).a(this);
        }
    }

    public final n h() {
        u uVar;
        n nVar;
        Object g10 = g();
        w4.o oVar = l.f10074a;
        if (g10 instanceof u) {
            uVar = (u) g10;
        } else {
            uVar = null;
        }
        if (uVar == null || (nVar = uVar.f10088a) == null) {
            h0.r(g10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (n) g10;
        }
        return nVar;
    }

    public final n i() {
        n e10 = e();
        if (e10 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10076b;
            Object obj = atomicReferenceFieldUpdater.get(this);
            while (true) {
                e10 = (n) obj;
                if (!e10.j()) {
                    break;
                }
                obj = atomicReferenceFieldUpdater.get(e10);
            }
        }
        return e10;
    }

    public boolean j() {
        return g() instanceof u;
    }

    public String toString() {
        return new m(this) + '@' + p7.a0.z(this);
    }
}
