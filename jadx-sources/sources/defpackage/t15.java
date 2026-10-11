package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t15 extends rw2 {
    public static final t15 D = new t15(0, null, new Object[0]);
    public final transient Object A;
    public final transient Object[] B;
    public final transient int C;

    public t15(int i, Object obj, Object[] objArr) {
        this.A = obj;
        this.B = objArr;
        this.C = i;
    }

    public static t15 j(int i, Object[] objArr, eb2 eb2Var) {
        if (i == 0) {
            return D;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new t15(1, null, objArr);
        }
        io3.x(i, objArr.length >> 1);
        Object k = k(objArr, i, zw2.j(i), 0);
        if (k instanceof Object[]) {
            Object[] objArr2 = (Object[]) k;
            qw2 qw2Var = (qw2) objArr2[2];
            if (eb2Var != null) {
                eb2Var.A = qw2Var;
                Object obj = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                k = obj;
                i = intValue;
            } else {
                throw qw2Var.a();
            }
        }
        return new t15(i, k, objArr);
    }

    public static Object k(Object[] objArr, int i, int i2, int i3) {
        qw2 qw2Var = null;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = (i5 * 2) + i3;
                int i8 = (i6 * 2) + i3;
                Object obj = objArr[i7];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i7 ^ 1];
                Objects.requireNonNull(obj2);
                int b0 = h41.b0(obj.hashCode());
                while (true) {
                    int i9 = b0 & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj;
                            objArr[i8 ^ 1] = obj2;
                        }
                        i6++;
                    } else {
                        if (obj.equals(objArr[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj3 = objArr[i11];
                            Objects.requireNonNull(obj3);
                            qw2Var = new qw2(obj, obj2, obj3);
                            objArr[i11] = obj2;
                            break;
                        }
                        b0 = i9 + 1;
                    }
                }
                i5++;
            }
            if (i6 == i) {
                return bArr;
            }
            return new Object[]{bArr, Integer.valueOf(i6), qw2Var};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                Object obj4 = objArr[i13];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj5);
                int b02 = h41.b0(obj4.hashCode());
                while (true) {
                    int i15 = b02 & i4;
                    int i16 = sArr[i15] & 65535;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj4;
                            objArr[i14 ^ 1] = obj5;
                        }
                        i12++;
                    } else {
                        if (obj4.equals(objArr[i16])) {
                            int i17 = i16 ^ 1;
                            Object obj6 = objArr[i17];
                            Objects.requireNonNull(obj6);
                            qw2Var = new qw2(obj4, obj5, obj6);
                            objArr[i17] = obj5;
                            break;
                        }
                        b02 = i15 + 1;
                    }
                }
                i5++;
            }
            if (i12 == i) {
                return sArr;
            }
            return new Object[]{sArr, Integer.valueOf(i12), qw2Var};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i18 = 0;
        while (i5 < i) {
            int i19 = (i5 * 2) + i3;
            int i20 = (i18 * 2) + i3;
            Object obj7 = objArr[i19];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i19 ^ 1];
            Objects.requireNonNull(obj8);
            int b03 = h41.b0(obj7.hashCode());
            while (true) {
                int i21 = b03 & i4;
                int i22 = iArr[i21];
                if (i22 == -1) {
                    iArr[i21] = i20;
                    if (i18 < i5) {
                        objArr[i20] = obj7;
                        objArr[i20 ^ 1] = obj8;
                    }
                    i18++;
                } else {
                    if (obj7.equals(objArr[i22])) {
                        int i23 = i22 ^ 1;
                        Object obj9 = objArr[i23];
                        Objects.requireNonNull(obj9);
                        qw2Var = new qw2(obj7, obj8, obj9);
                        objArr[i23] = obj8;
                        break;
                    }
                    b03 = i21 + 1;
                }
            }
            i5++;
        }
        if (i18 == i) {
            return iArr;
        }
        return new Object[]{iArr, Integer.valueOf(i18), qw2Var};
    }

    public static Object l(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 != null) {
            if (i == 1) {
                Object obj3 = objArr[i2];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj2)) {
                    Object obj4 = objArr[i2 ^ 1];
                    Objects.requireNonNull(obj4);
                    return obj4;
                }
                return null;
            }
            if (obj != null) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length - 1;
                    int b0 = h41.b0(obj2.hashCode());
                    while (true) {
                        int i3 = b0 & length;
                        int i4 = bArr[i3] & 255;
                        if (i4 != 255) {
                            if (obj2.equals(objArr[i4])) {
                                return objArr[i4 ^ 1];
                            }
                            b0 = i3 + 1;
                        } else {
                            return null;
                        }
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    int length2 = sArr.length - 1;
                    int b02 = h41.b0(obj2.hashCode());
                    while (true) {
                        int i5 = b02 & length2;
                        int i6 = sArr[i5] & 65535;
                        if (i6 != 65535) {
                            if (obj2.equals(objArr[i6])) {
                                return objArr[i6 ^ 1];
                            }
                            b02 = i5 + 1;
                        } else {
                            return null;
                        }
                    }
                } else {
                    int[] iArr = (int[]) obj;
                    int length3 = iArr.length - 1;
                    int b03 = h41.b0(obj2.hashCode());
                    while (true) {
                        int i7 = b03 & length3;
                        int i8 = iArr[i7];
                        if (i8 == -1) {
                            return null;
                        }
                        if (obj2.equals(objArr[i8])) {
                            return objArr[i8 ^ 1];
                        }
                        b03 = i7 + 1;
                    }
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override // defpackage.rw2
    public final zw2 c() {
        return new q15(this, this.B, 0, this.C);
    }

    @Override // defpackage.rw2
    public final zw2 d() {
        return new r15(this, new s15(this.B, 0, this.C));
    }

    @Override // defpackage.rw2
    public final gw2 e() {
        return new s15(this.B, 1, this.C);
    }

    @Override // defpackage.rw2
    public final boolean g() {
        return false;
    }

    @Override // defpackage.rw2, java.util.Map
    public final Object get(Object obj) {
        Object l = l(this.A, this.B, this.C, 0, obj);
        if (l == null) {
            return null;
        }
        return l;
    }

    @Override // java.util.Map
    public final int size() {
        return this.C;
    }
}
