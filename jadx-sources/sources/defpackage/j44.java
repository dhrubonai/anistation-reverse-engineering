package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j44 {
    public final LinkedHashMap a;
    public final i75 b;

    public j44(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new i75(z);
    }

    public final Map a() {
        ai4 ai4Var;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int S = vn3.S(zo0.V(entrySet, 10));
        if (S < 16) {
            S = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                ai4Var = new ai4(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                ai4Var = new ai4(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(ai4Var.x, ai4Var.y);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (!((AtomicBoolean) this.b.y).get()) {
            return;
        }
        ze0.m("Do mutate preferences once returned to DataStore.");
    }

    public final Object c(ts4 ts4Var) {
        ts4Var.getClass();
        Object obj = this.a.get(ts4Var);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            return Arrays.copyOf(bArr, bArr.length);
        }
        return obj;
    }

    public final void d(ts4 ts4Var) {
        ts4Var.getClass();
        b();
        this.a.remove(ts4Var);
    }

    public final void e(ts4 ts4Var, Object obj) {
        ts4Var.getClass();
        f(ts4Var, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.j44
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            j44 r6 = (defpackage.j44) r6
            java.util.LinkedHashMap r6 = r6.a
            java.util.LinkedHashMap r5 = r5.a
            r0 = 1
            if (r6 != r5) goto L10
            goto L61
        L10:
            int r2 = r6.size()
            int r3 = r5.size()
            if (r2 == r3) goto L1b
            goto L60
        L1b:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L22
            goto L61
        L22:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r5.get(r3)
            if (r3 == 0) goto L5d
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L58
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L5d
            byte[] r2 = (byte[]) r2
            byte[] r3 = (byte[]) r3
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L5d
            r2 = r0
            goto L5e
        L58:
            boolean r2 = defpackage.a34.i(r2, r3)
            goto L5e
        L5d:
            r2 = r1
        L5e:
            if (r2 != 0) goto L2a
        L60:
            return r1
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j44.equals(java.lang.Object):boolean");
    }

    public final void f(ts4 ts4Var, Object obj) {
        ts4Var.getClass();
        b();
        if (obj == null) {
            d(ts4Var);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            Set unmodifiableSet = Collections.unmodifiableSet(yo0.N0((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(ts4Var, unmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(ts4Var, Arrays.copyOf(bArr, bArr.length));
        } else {
            linkedHashMap.put(ts4Var, obj);
        }
    }

    public final int hashCode() {
        int hashCode;
        Iterator it = this.a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    public final String toString() {
        return yo0.q0(this.a.entrySet(), ",\n", "{\n", "\n}", new p03((byte) 23), 24);
    }

    public /* synthetic */ j44(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
