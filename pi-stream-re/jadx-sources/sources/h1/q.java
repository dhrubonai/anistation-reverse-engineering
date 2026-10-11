package h1;

import java.util.List;
import java.util.Map;
import java.util.Set;
import r6.h0;

/* loaded from: classes.dex */
public final class q extends r6.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4625a;

    public q(Map map) {
        this.f4625a = map;
    }

    @Override // r6.g0, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && super.containsKey(obj)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (r1.hasNext() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r3.equals(r1.next()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000f, code lost:
    
        if (r3 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1.hasNext() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r1.next() != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        return true;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r3) {
        /*
            r2 = this;
            java.util.Set r0 = r2.entrySet()
            r6.x1 r0 = (r6.x1) r0
            java.util.Iterator r0 = r0.iterator()
            r6.a1 r1 = new r6.a1
            r1.<init>(r0)
            if (r3 != 0) goto L1e
        L11:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.next()
            if (r3 != 0) goto L11
            goto L2e
        L1e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.next()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1e
        L2e:
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.q.containsValue(java.lang.Object):boolean");
    }

    @Override // r6.g0, java.util.Map
    public final Set entrySet() {
        return h0.Q(super.entrySet(), new p(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && h0.O(this, obj)) {
            return true;
        }
        return false;
    }

    @Override // r6.g0, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return h0.d0(entrySet());
    }

    @Override // r6.g0, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        if (super.size() == 1 && super.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // r6.g0, java.util.Map
    public final Set keySet() {
        return h0.Q(super.keySet(), new p(1));
    }

    @Override // r6.g0, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
