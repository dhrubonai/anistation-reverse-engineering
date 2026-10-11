package l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class g implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f6573a;

    /* renamed from: b, reason: collision with root package name */
    public c f6574b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f6575c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f6576d = 0;

    public c b(Object obj) {
        c cVar = this.f6573a;
        while (cVar != null && !cVar.f6564a.equals(obj)) {
            cVar = cVar.f6566c;
        }
        return cVar;
    }

    public Object c(Object obj) {
        c b10 = b(obj);
        if (b10 == null) {
            return null;
        }
        this.f6576d--;
        WeakHashMap weakHashMap = this.f6575c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(b10);
            }
        }
        c cVar = b10.f6567d;
        if (cVar != null) {
            cVar.f6566c = b10.f6566c;
        } else {
            this.f6573a = b10.f6566c;
        }
        c cVar2 = b10.f6566c;
        if (cVar2 != null) {
            cVar2.f6567d = cVar;
        } else {
            this.f6574b = cVar;
        }
        b10.f6566c = null;
        b10.f6567d = null;
        return b10.f6565b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((l.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof l.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l.g r7 = (l.g) r7
            int r1 = r6.f6576d
            int r3 = r7.f6576d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            l.e r3 = (l.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            l.e r4 = (l.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            l.e r7 = (l.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                i10 += ((Map.Entry) eVar.next()).hashCode();
            } else {
                return i10;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f6573a, this.f6574b, 0);
        this.f6575c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                sb.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
