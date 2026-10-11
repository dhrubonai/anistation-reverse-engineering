package r6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class a0 extends AbstractMap implements Serializable {
    public static final Object A = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f9429a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f9430b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f9431c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f9432d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f9433e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f9434f;

    /* renamed from: x, reason: collision with root package name */
    public transient w f9435x;

    /* renamed from: y, reason: collision with root package name */
    public transient w f9436y;

    /* renamed from: z, reason: collision with root package name */
    public transient z f9437z;

    public a0(int i10) {
        boolean z9;
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f9433e = com.bumptech.glide.d.n(i10, 1);
            return;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    public final Map a() {
        Object obj = this.f9429a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int b(Object obj) {
        if (e()) {
            return -1;
        }
        int K0 = h0.K0(obj);
        int i10 = (1 << (this.f9433e & 31)) - 1;
        Object obj2 = this.f9429a;
        Objects.requireNonNull(obj2);
        int k02 = com.bumptech.glide.c.k0(K0 & i10, obj2);
        if (k02 == 0) {
            return -1;
        }
        int i11 = ~i10;
        int i12 = K0 & i11;
        do {
            int i13 = k02 - 1;
            int i14 = g()[i13];
            if ((i14 & i11) == i12 && q6.g.x(obj, c(i13))) {
                return i13;
            }
            k02 = i14 & i10;
        } while (k02 != 0);
        return -1;
    }

    public final Object c(int i10) {
        return h()[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (e()) {
            return;
        }
        this.f9433e += 32;
        Map a10 = a();
        if (a10 != null) {
            this.f9433e = com.bumptech.glide.d.n(size(), 3);
            a10.clear();
            this.f9429a = null;
            this.f9434f = 0;
            return;
        }
        Arrays.fill(h(), 0, this.f9434f, (Object) null);
        Arrays.fill(i(), 0, this.f9434f, (Object) null);
        Object obj = this.f9429a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(g(), 0, this.f9434f, 0);
        this.f9434f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map a10 = a();
        if (a10 != null) {
            return a10.containsKey(obj);
        }
        if (b(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map a10 = a();
        if (a10 != null) {
            return a10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f9434f; i10++) {
            if (q6.g.x(obj, k(i10))) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i10, int i11) {
        Object obj = this.f9429a;
        Objects.requireNonNull(obj);
        int[] g10 = g();
        Object[] h10 = h();
        Object[] i12 = i();
        int size = size() - 1;
        if (i10 < size) {
            Object obj2 = h10[size];
            h10[i10] = obj2;
            i12[i10] = i12[size];
            h10[size] = null;
            i12[size] = null;
            g10[i10] = g10[size];
            g10[size] = 0;
            int K0 = h0.K0(obj2) & i11;
            int k02 = com.bumptech.glide.c.k0(K0, obj);
            int i13 = size + 1;
            if (k02 == i13) {
                com.bumptech.glide.c.l0(obj, K0, i10 + 1);
                return;
            }
            while (true) {
                int i14 = k02 - 1;
                int i15 = g10[i14];
                int i16 = i15 & i11;
                if (i16 == i13) {
                    g10[i14] = ((i10 + 1) & i11) | (i15 & (~i11));
                    return;
                }
                k02 = i16;
            }
        } else {
            h10[i10] = null;
            i12[i10] = null;
            g10[i10] = 0;
        }
    }

    public final boolean e() {
        if (this.f9429a == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        w wVar = this.f9436y;
        if (wVar == null) {
            w wVar2 = new w(this, 0);
            this.f9436y = wVar2;
            return wVar2;
        }
        return wVar;
    }

    public final Object f(Object obj) {
        boolean e10 = e();
        Object obj2 = A;
        if (e10) {
            return obj2;
        }
        int i10 = (1 << (this.f9433e & 31)) - 1;
        Object obj3 = this.f9429a;
        Objects.requireNonNull(obj3);
        int e02 = com.bumptech.glide.c.e0(obj, null, i10, obj3, g(), h(), null);
        if (e02 == -1) {
            return obj2;
        }
        Object k10 = k(e02);
        d(e02, i10);
        this.f9434f--;
        this.f9433e += 32;
        return k10;
    }

    public final int[] g() {
        int[] iArr = this.f9430b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map a10 = a();
        if (a10 != null) {
            return a10.get(obj);
        }
        int b10 = b(obj);
        if (b10 == -1) {
            return null;
        }
        return k(b10);
    }

    public final Object[] h() {
        Object[] objArr = this.f9431c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f9432d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i10, int i11, int i12, int i13) {
        Object n9 = com.bumptech.glide.c.n(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            com.bumptech.glide.c.l0(n9, i12 & i14, i13 + 1);
        }
        Object obj = this.f9429a;
        Objects.requireNonNull(obj);
        int[] g10 = g();
        for (int i15 = 0; i15 <= i10; i15++) {
            int k02 = com.bumptech.glide.c.k0(i15, obj);
            while (k02 != 0) {
                int i16 = k02 - 1;
                int i17 = g10[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int k03 = com.bumptech.glide.c.k0(i19, n9);
                com.bumptech.glide.c.l0(n9, i19, k02);
                g10[i16] = ((~i14) & i18) | (k03 & i14);
                k02 = i17 & i10;
            }
        }
        this.f9429a = n9;
        this.f9433e = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f9433e & (-32));
        return i14;
    }

    public final Object k(int i10) {
        return i()[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        w wVar = this.f9435x;
        if (wVar == null) {
            w wVar2 = new w(this, 1);
            this.f9435x = wVar2;
            return wVar2;
        }
        return wVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        int min;
        int i11;
        if (e()) {
            h0.x("Arrays already allocated", e());
            int i12 = this.f9433e;
            int max = Math.max(i12 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (highestOneBit * 1.0d))) {
                int i13 = highestOneBit << 1;
                if (i13 <= 0) {
                    i13 = 1073741824;
                }
                highestOneBit = i13;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f9429a = com.bumptech.glide.c.n(max2);
            this.f9433e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f9433e & (-32));
            this.f9430b = new int[i12];
            this.f9431c = new Object[i12];
            this.f9432d = new Object[i12];
        }
        Map a10 = a();
        if (a10 != null) {
            return a10.put(obj, obj2);
        }
        int[] g10 = g();
        Object[] h10 = h();
        Object[] i14 = i();
        int i15 = this.f9434f;
        int i16 = i15 + 1;
        int K0 = h0.K0(obj);
        int i17 = (1 << (this.f9433e & 31)) - 1;
        int i18 = K0 & i17;
        Object obj3 = this.f9429a;
        Objects.requireNonNull(obj3);
        int k02 = com.bumptech.glide.c.k0(i18, obj3);
        int i19 = 0;
        if (k02 == 0) {
            if (i16 > i17) {
                if (i17 < 32) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i17 = j(i17, (i17 + 1) * i11, K0, i15);
            } else {
                Object obj4 = this.f9429a;
                Objects.requireNonNull(obj4);
                com.bumptech.glide.c.l0(obj4, i18, i16);
            }
        } else {
            int i20 = ~i17;
            int i21 = K0 & i20;
            int i22 = 0;
            while (true) {
                int i23 = k02 - 1;
                int i24 = g10[i23];
                int i25 = i24 & i20;
                if (i25 == i21 && q6.g.x(obj, h10[i23])) {
                    Object obj5 = i14[i23];
                    i14[i23] = obj2;
                    return obj5;
                }
                int i26 = i24 & i17;
                int i27 = i21;
                int i28 = i22 + 1;
                if (i26 == 0) {
                    if (i28 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(((1 << (this.f9433e & 31)) - 1) + 1, 1.0f);
                        if (isEmpty()) {
                            i19 = -1;
                        }
                        int i29 = i19;
                        while (i29 >= 0) {
                            linkedHashMap.put(c(i29), k(i29));
                            i29++;
                            if (i29 >= this.f9434f) {
                                i29 = -1;
                            }
                        }
                        this.f9429a = linkedHashMap;
                        this.f9430b = null;
                        this.f9431c = null;
                        this.f9432d = null;
                        this.f9433e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i16 > i17) {
                        if (i17 < 32) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        i17 = j(i17, (i17 + 1) * i10, K0, i15);
                    } else {
                        g10[i23] = (i16 & i17) | i25;
                    }
                } else {
                    k02 = i26;
                    i22 = i28;
                    i21 = i27;
                }
            }
        }
        int length = g().length;
        if (i16 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f9430b = Arrays.copyOf(g(), min);
            this.f9431c = Arrays.copyOf(h(), min);
            this.f9432d = Arrays.copyOf(i(), min);
        }
        g()[i15] = ((~i17) & K0) | (i17 & 0);
        h()[i15] = obj;
        i()[i15] = obj2;
        this.f9434f = i16;
        this.f9433e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map a10 = a();
        if (a10 != null) {
            return a10.remove(obj);
        }
        Object f10 = f(obj);
        if (f10 == A) {
            return null;
        }
        return f10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map a10 = a();
        if (a10 != null) {
            return a10.size();
        }
        return this.f9434f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        z zVar = this.f9437z;
        if (zVar == null) {
            z zVar2 = new z(this);
            this.f9437z = zVar2;
            return zVar2;
        }
        return zVar;
    }
}
