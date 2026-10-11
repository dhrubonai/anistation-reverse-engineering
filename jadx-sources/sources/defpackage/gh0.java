package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class gh0 implements Map, n73 {
    public static final String[] F = new String[0];
    public static final Object[] G = new Object[0];
    public static final int[] H = new int[0];
    public int[] A;
    public int B;
    public dh0 C;
    public dh0 D;
    public fh0 E;
    public String[] x;
    public Object[] y;
    public int z;

    public final int a(String str) {
        if (this.z != 0) {
            int g = m37.g(str);
            int length = this.x.length;
            while (true) {
                int i = g & (length - 1);
                String str2 = this.x[i];
                if (str2 == null) {
                    return -1;
                }
                if (str2.equalsIgnoreCase(str)) {
                    return i;
                }
                g = i + 1;
                length = this.x.length;
            }
        } else {
            return -1;
        }
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Object obj, String str) {
        int i;
        int[] iArr;
        String str2;
        str.getClass();
        obj.getClass();
        int i2 = 0;
        if (this.x == F) {
            this.x = new String[8];
            this.y = new Object[8];
            int[] iArr2 = new int[8];
            for (int i3 = 0; i3 < 8; i3++) {
                iArr2[i3] = -1;
            }
            this.A = iArr2;
        }
        int g = m37.g(str);
        int length = (this.x.length - 1) & g;
        while (true) {
            String str3 = this.x[length];
            if (str3 == null) {
                int i4 = this.z * 4;
                String[] strArr = this.x;
                if (i4 >= strArr.length * 3) {
                    int length2 = strArr.length * 2;
                    Object[] objArr = this.y;
                    int[] iArr3 = this.A;
                    int i5 = this.B;
                    this.x = new String[length2];
                    this.y = new Object[length2];
                    int[] iArr4 = new int[length2];
                    for (int i6 = 0; i6 < length2; i6++) {
                        iArr4[i6] = -1;
                    }
                    this.A = iArr4;
                    this.z = 0;
                    this.B = 0;
                    for (int i7 = 0; i7 < i5; i7++) {
                        int i8 = iArr3[i7];
                        if (i8 >= 0 && (str2 = strArr[i8]) != null) {
                            Object obj2 = objArr[i8];
                            obj2.getClass();
                            put(obj2, str2);
                        }
                    }
                }
                int length3 = this.x.length;
                while (true) {
                    i = g & (length3 - 1);
                    String[] strArr2 = this.x;
                    if (strArr2[i] == null) {
                        break;
                    }
                    g = i + 1;
                    length3 = strArr2.length;
                }
                int i9 = this.B;
                if (i9 == this.A.length && i9 != 0) {
                    int i10 = 0;
                    while (true) {
                        iArr = this.A;
                        if (i2 >= i9) {
                            break;
                        }
                        int i11 = iArr[i2];
                        if (i11 >= 0 && this.x[i11] != null) {
                            iArr[i10] = i11;
                            i10++;
                        }
                        i2++;
                    }
                    int length4 = iArr.length;
                    for (int i12 = i10; i12 < length4; i12++) {
                        this.A[i12] = -1;
                    }
                    this.B = i10;
                    i9 = i10;
                }
                this.x[i] = str;
                this.y[i] = obj;
                int[] iArr5 = this.A;
                this.B = i9 + 1;
                iArr5[i9] = i;
                this.z++;
                return null;
            }
            if (str3.equalsIgnoreCase(str)) {
                Object[] objArr2 = this.y;
                Object obj3 = objArr2[length];
                objArr2[length] = obj;
                return obj3;
            }
            length = (length + 1) & (this.x.length - 1);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.z > 0) {
            ms.E0(0, r0.length, null, this.x);
            ms.E0(0, r0.length, null, this.y);
            int[] iArr = this.A;
            int length = iArr.length;
            iArr.getClass();
            Arrays.fill(iArr, 0, length, -1);
            this.z = 0;
            this.B = 0;
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String) || a((String) obj) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null || this.z == 0) {
            return false;
        }
        int length = this.y.length;
        for (int i = 0; i < length; i++) {
            if (this.x[i] != null && a34.i(this.y[i], obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        dh0 dh0Var = this.D;
        if (dh0Var != null) {
            return dh0Var;
        }
        dh0 dh0Var2 = new dh0(this, (byte) 0);
        this.D = dh0Var2;
        return dh0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gh0)) {
            return false;
        }
        gh0 gh0Var = (gh0) obj;
        if (gh0Var.z != this.z) {
            return false;
        }
        int length = this.x.length;
        for (int i = 0; i < length; i++) {
            String str = this.x[i];
            if (str != null) {
                if (!a34.i(gh0Var.get(str), this.y[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int a;
        if (!(obj instanceof String) || (a = a((String) obj)) < 0) {
            return null;
        }
        return this.y[a];
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int length = this.x.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = this.x[i3];
            if (str != null) {
                int g = m37.g(str);
                Object obj = this.y[i3];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 += g ^ i;
            }
        }
        return i2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.z == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        dh0 dh0Var = this.C;
        if (dh0Var != null) {
            return dh0Var;
        }
        dh0 dh0Var2 = new dh0(this, (byte) 1);
        this.C = dh0Var2;
        return dh0Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getValue(), (String) entry.getKey());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int a;
        int i;
        if (!(obj instanceof String) || (a = a((String) obj)) < 0) {
            return null;
        }
        Object obj2 = this.y[a];
        int i2 = this.B;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int[] iArr = this.A;
            if (iArr[i3] == a) {
                iArr[i3] = -1;
                break;
            }
            i3++;
        }
        String[] strArr = this.x;
        strArr[a] = null;
        this.y[a] = null;
        this.z--;
        int i4 = a + 1;
        int length = strArr.length;
        while (true) {
            int i5 = i4 & (length - 1);
            String[] strArr2 = this.x;
            String str = strArr2[i5];
            if (str != null) {
                Object[] objArr = this.y;
                Object obj3 = objArr[i5];
                strArr2[i5] = null;
                objArr[i5] = null;
                this.z--;
                obj3.getClass();
                int g = m37.g(str);
                int length2 = this.x.length;
                while (true) {
                    i = g & (length2 - 1);
                    String[] strArr3 = this.x;
                    String str2 = strArr3[i];
                    if (str2 == null) {
                        strArr3[i] = str;
                        this.y[i] = obj3;
                        this.z++;
                        break;
                    }
                    if (str2.equalsIgnoreCase(str)) {
                        this.y[i] = obj3;
                        break;
                    }
                    g = i + 1;
                    length2 = this.x.length;
                }
                int i6 = this.B;
                int i7 = 0;
                while (true) {
                    if (i7 < i6) {
                        int[] iArr2 = this.A;
                        if (iArr2[i7] == i5) {
                            iArr2[i7] = i;
                            break;
                        }
                        i7++;
                    }
                }
                i4 = i5 + 1;
                length = this.x.length;
            } else {
                return obj2;
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.z;
    }

    @Override // java.util.Map
    public final Collection values() {
        fh0 fh0Var = this.E;
        if (fh0Var != null) {
            return fh0Var;
        }
        fh0 fh0Var2 = new fh0(this);
        this.E = fh0Var2;
        return fh0Var2;
    }
}
