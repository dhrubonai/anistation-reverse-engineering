package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.as;
import defpackage.yb5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class f {
    public static int a(byte[] bArr, int i, as asVar) {
        int r = r(bArr, i, asVar);
        int i2 = asVar.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - r) {
                if (i2 == 0) {
                    asVar.c = ByteString.EMPTY;
                    return r;
                }
                asVar.c = ByteString.copyFrom(bArr, r, i2);
                return r + i2;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long c(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int d(yb5 yb5Var, byte[] bArr, int i, int i2, int i3, as asVar) {
        Object d = yb5Var.d();
        int u = u(d, yb5Var, bArr, i, i2, i3, asVar);
        yb5Var.b(d);
        asVar.c = d;
        return u;
    }

    public static int e(yb5 yb5Var, byte[] bArr, int i, int i2, as asVar) {
        Object d = yb5Var.d();
        int v = v(d, yb5Var, bArr, i, i2, asVar);
        yb5Var.b(d);
        asVar.c = d;
        return v;
    }

    public static int f(yb5 yb5Var, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, as asVar) {
        int e = e(yb5Var, bArr, i2, i3, asVar);
        protobufList.add(asVar.c);
        while (e < i3) {
            int r = r(bArr, e, asVar);
            if (i != asVar.a) {
                break;
            }
            e = e(yb5Var, bArr, r, i3, asVar);
            protobufList.add(asVar.c);
        }
        return e;
    }

    public static int g(byte[] bArr, int i, Internal.ProtobufList protobufList, as asVar) {
        boolean z;
        h hVar = (h) protobufList;
        int r = r(bArr, i, asVar);
        int i2 = asVar.a + r;
        while (r < i2) {
            r = t(bArr, r, asVar);
            if (asVar.b != 0) {
                z = true;
            } else {
                z = false;
            }
            hVar.addBoolean(z);
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int h(byte[] bArr, int i, Internal.ProtobufList protobufList, as asVar) {
        a0 a0Var = (a0) protobufList;
        int r = r(bArr, i, asVar);
        int i2 = asVar.a + r;
        while (r < i2) {
            a0Var.addDouble(Double.longBitsToDouble(c(r, bArr)));
            r += 8;
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int i(byte[] bArr, int i, Internal.ProtobufList protobufList, as asVar) {
        x0 x0Var = (x0) protobufList;
        int r = r(bArr, i, asVar);
        int i2 = asVar.a + r;
        while (r < i2) {
            x0Var.addInt(b(r, bArr));
            r += 4;
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int j(byte[] bArr, int i, Internal.ProtobufList protobufList, as asVar) {
        g1 g1Var = (g1) protobufList;
        int r = r(bArr, i, asVar);
        int i2 = asVar.a + r;
        while (r < i2) {
            g1Var.addLong(c(r, bArr));
            r += 8;
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int k(byte[] bArr, int i, Internal.ProtobufList protobufList, as asVar) {
        r0 r0Var = (r0) protobufList;
        int r = r(bArr, i, asVar);
        int i2 = asVar.a + r;
        while (r < i2) {
            r0Var.addFloat(Float.intBitsToFloat(b(r, bArr)));
            r += 4;
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int l(byte[] bArr, int i, Internal.ProtobufList protobufList, as asVar) {
        x0 x0Var = (x0) protobufList;
        int r = r(bArr, i, asVar);
        int i2 = asVar.a + r;
        while (r < i2) {
            r = r(bArr, r, asVar);
            x0Var.addInt(CodedInputStream.decodeZigZag32(asVar.a));
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int m(byte[] bArr, int i, Internal.ProtobufList protobufList, as asVar) {
        g1 g1Var = (g1) protobufList;
        int r = r(bArr, i, asVar);
        int i2 = asVar.a + r;
        while (r < i2) {
            r = t(bArr, r, asVar);
            g1Var.addLong(CodedInputStream.decodeZigZag64(asVar.b));
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int n(byte[] bArr, int i, Internal.ProtobufList protobufList, as asVar) {
        x0 x0Var = (x0) protobufList;
        int r = r(bArr, i, asVar);
        int i2 = asVar.a + r;
        while (r < i2) {
            r = r(bArr, r, asVar);
            x0Var.addInt(asVar.a);
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int o(byte[] bArr, int i, as asVar) {
        int r = r(bArr, i, asVar);
        int i2 = asVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                asVar.c = "";
                return r;
            }
            asVar.c = new String(bArr, r, i2, Internal.UTF_8);
            return r + i2;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public static int p(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, as asVar) {
        if (WireFormat.getTagFieldNumber(i) != 0) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                unknownFieldSetLite.storeField(i, Integer.valueOf(b(i2, bArr)));
                                return i2 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
                        int i4 = (i & (-8)) | 4;
                        int i5 = asVar.e + 1;
                        asVar.e = i5;
                        if (i5 < 100) {
                            int i6 = 0;
                            while (true) {
                                if (i2 >= i3) {
                                    break;
                                }
                                int r = r(bArr, i2, asVar);
                                i6 = asVar.a;
                                if (i6 == i4) {
                                    i2 = r;
                                    break;
                                }
                                i2 = p(i6, bArr, r, i3, newInstance, asVar);
                            }
                            asVar.e--;
                            if (i2 <= i3 && i6 == i4) {
                                unknownFieldSetLite.storeField(i, newInstance);
                                return i2;
                            }
                            throw InvalidProtocolBufferException.parseFailure();
                        }
                        throw InvalidProtocolBufferException.recursionLimitExceeded();
                    }
                    int r2 = r(bArr, i2, asVar);
                    int i7 = asVar.a;
                    if (i7 >= 0) {
                        if (i7 <= bArr.length - r2) {
                            if (i7 == 0) {
                                unknownFieldSetLite.storeField(i, ByteString.EMPTY);
                            } else {
                                unknownFieldSetLite.storeField(i, ByteString.copyFrom(bArr, r2, i7));
                            }
                            return r2 + i7;
                        }
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                unknownFieldSetLite.storeField(i, Long.valueOf(c(i2, bArr)));
                return i2 + 8;
            }
            int t = t(bArr, i2, asVar);
            unknownFieldSetLite.storeField(i, Long.valueOf(asVar.b));
            return t;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public static int q(int i, byte[] bArr, int i2, as asVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            asVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            asVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            asVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            asVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                asVar.a = i11;
                return i12;
            }
        }
    }

    public static int r(byte[] bArr, int i, as asVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            asVar.a = b;
            return i2;
        }
        return q(b, bArr, i2, asVar);
    }

    public static int s(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, as asVar) {
        x0 x0Var = (x0) protobufList;
        int r = r(bArr, i2, asVar);
        x0Var.addInt(asVar.a);
        while (r < i3) {
            int r2 = r(bArr, r, asVar);
            if (i != asVar.a) {
                break;
            }
            r = r(bArr, r2, asVar);
            x0Var.addInt(asVar.a);
        }
        return r;
    }

    public static int t(byte[] bArr, int i, as asVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            asVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        asVar.b = j2;
        return i3;
    }

    public static int u(Object obj, yb5 yb5Var, byte[] bArr, int i, int i2, int i3, as asVar) {
        l1 l1Var = (l1) yb5Var;
        int i4 = asVar.e + 1;
        asVar.e = i4;
        if (i4 < 100) {
            int F = l1Var.F(obj, bArr, i, i2, i3, asVar);
            asVar.e--;
            asVar.c = obj;
            return F;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public static int v(Object obj, yb5 yb5Var, byte[] bArr, int i, int i2, as asVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = q(i4, bArr, i3, asVar);
            i4 = asVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = asVar.e + 1;
            asVar.e = i6;
            if (i6 < 100) {
                int i7 = i5 + i4;
                yb5Var.i(obj, bArr, i5, i7, asVar);
                asVar.e--;
                asVar.c = obj;
                return i7;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int w(int i, byte[] bArr, int i2, int i3, as asVar) {
        if (WireFormat.getTagFieldNumber(i) != 0) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                return i2 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (i2 < i3) {
                            i2 = r(bArr, i2, asVar);
                            i5 = asVar.a;
                            if (i5 == i4) {
                                break;
                            }
                            i2 = w(i5, bArr, i2, i3, asVar);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            return i2;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    return r(bArr, i2, asVar) + asVar.a;
                }
                return i2 + 8;
            }
            return t(bArr, i2, asVar);
        }
        throw InvalidProtocolBufferException.invalidTag();
    }
}
