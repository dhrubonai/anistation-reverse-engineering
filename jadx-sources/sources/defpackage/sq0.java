package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sq0 extends AbstractMap implements Serializable {
    public static final Object G = new Object();
    public transient Object[] A;
    public transient int B;
    public transient int C;
    public transient qq0 D;
    public transient qq0 E;
    public transient i2 F;
    public transient Object x;
    public transient int[] y;
    public transient Object[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, sq0] */
    public static sq0 a() {
        ?? abstractMap = new AbstractMap();
        abstractMap.B = Math.min(Math.max(3, 1), 1073741823);
        return abstractMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, sq0] */
    public static sq0 b(int i) {
        boolean z;
        ?? abstractMap = new AbstractMap();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.m("Expected size must be >= 0", z);
        abstractMap.B = Math.min(Math.max(i, 1), 1073741823);
        return abstractMap;
    }

    public final Map c() {
        Object obj = this.x;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.B += 32;
        Map c = c();
        if (c != null) {
            this.B = Math.min(Math.max(size(), 3), 1073741823);
            c.clear();
            this.x = null;
            this.C = 0;
            return;
        }
        Arrays.fill(j(), 0, this.C, (Object) null);
        Arrays.fill(k(), 0, this.C, (Object) null);
        Object obj = this.x;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.C, 0);
        this.C = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c = c();
        if (c != null) {
            return c.containsKey(obj);
        }
        if (e(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c = c();
        if (c != null) {
            return c.containsValue(obj);
        }
        for (int i = 0; i < this.C; i++) {
            if (tl7.r(obj, k()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.B & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int c0 = h41.c0(obj);
        int d = d();
        Object obj2 = this.x;
        Objects.requireNonNull(obj2);
        int S = wc7.S(c0 & d, obj2);
        if (S == 0) {
            return -1;
        }
        int i = ~d;
        int i2 = c0 & i;
        do {
            int i3 = S - 1;
            int i4 = i()[i3];
            if ((i4 & i) == i2 && tl7.r(obj, j()[i3])) {
                return i3;
            }
            S = i4 & d;
        } while (S != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        qq0 qq0Var = this.E;
        if (qq0Var == null) {
            qq0 qq0Var2 = new qq0(this, (byte) 0);
            this.E = qq0Var2;
            return qq0Var2;
        }
        return qq0Var;
    }

    public final void f(int i, int i2) {
        Object obj = this.x;
        Objects.requireNonNull(obj);
        int[] i3 = i();
        Object[] j = j();
        Object[] k = k();
        int size = size();
        int i4 = size - 1;
        if (i < i4) {
            Object obj2 = j[i4];
            j[i] = obj2;
            k[i] = k[i4];
            j[i4] = null;
            k[i4] = null;
            i3[i] = i3[i4];
            i3[i4] = 0;
            int c0 = h41.c0(obj2) & i2;
            int S = wc7.S(c0, obj);
            if (S == size) {
                wc7.T(c0, i + 1, obj);
                return;
            }
            while (true) {
                int i5 = S - 1;
                int i6 = i3[i5];
                int i7 = i6 & i2;
                if (i7 == size) {
                    i3[i5] = wc7.E(i6, i + 1, i2);
                    return;
                }
                S = i7;
            }
        } else {
            j[i] = null;
            k[i] = null;
            i3[i] = 0;
        }
    }

    public final boolean g() {
        if (this.x == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c = c();
        if (c != null) {
            return c.get(obj);
        }
        int e = e(obj);
        if (e == -1) {
            return null;
        }
        return k()[e];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int d = d();
            Object obj2 = this.x;
            Objects.requireNonNull(obj2);
            int K = wc7.K(obj, null, d, obj2, i(), j(), null);
            if (K != -1) {
                Object obj3 = k()[K];
                f(K, d);
                this.C--;
                this.B += 32;
                return obj3;
            }
        }
        return G;
    }

    public final int[] i() {
        int[] iArr = this.y;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.z;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.A;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        qq0 qq0Var = this.D;
        if (qq0Var == null) {
            qq0 qq0Var2 = new qq0(this, (byte) 1);
            this.D = qq0Var2;
            return qq0Var2;
        }
        return qq0Var;
    }

    public final int l(int i, int i2, int i3, int i4) {
        Object k = wc7.k(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            wc7.T(i3 & i5, i4 + 1, k);
        }
        Object obj = this.x;
        Objects.requireNonNull(obj);
        int[] i6 = i();
        for (int i7 = 0; i7 <= i; i7++) {
            int S = wc7.S(i7, obj);
            while (S != 0) {
                int i8 = S - 1;
                int i9 = i6[i8];
                int i10 = ((~i) & i9) | i7;
                int i11 = i10 & i5;
                int S2 = wc7.S(i11, k);
                wc7.T(i11, S, k);
                i6[i8] = wc7.E(i10, S2, i5);
                S = i9 & i;
            }
        }
        this.x = k;
        this.B = wc7.E(this.B, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:43:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sq0.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c = c();
        if (c != null) {
            return c.remove(obj);
        }
        Object h = h(obj);
        if (h == G) {
            return null;
        }
        return h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c = c();
        if (c != null) {
            return c.size();
        }
        return this.C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        i2 i2Var = this.F;
        if (i2Var == null) {
            i2 i2Var2 = new i2(this, (byte) 2);
            this.F = i2Var2;
            return i2Var2;
        }
        return i2Var;
    }
}
