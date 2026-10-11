package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import defpackage.es;
import defpackage.fs5;
import defpackage.v71;
import defpackage.vb3;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q0 {
    public static final q0 d = new q0(0);
    public final fs5 a = new fs5(16);
    public boolean b;
    public boolean c;

    public q0(int i) {
        m();
        m();
    }

    public static int c(WireFormat.FieldType fieldType, int i, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return d(fieldType, obj) + computeTagSize;
    }

    public static int d(WireFormat.FieldType fieldType, Object obj) {
        switch (p0.b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj);
                }
                return CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    return CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber());
                }
                return CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                v71.i("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static int e(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldSet$FieldDescriptorLite.getLiteType();
        int number = fieldSet$FieldDescriptorLite.getNumber();
        if (fieldSet$FieldDescriptorLite.isRepeated()) {
            List list = (List) obj;
            int i = 0;
            if (fieldSet$FieldDescriptorLite.isPacked()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i += d(liteType, it.next());
                }
                return CodedOutputStream.computeUInt32SizeNoTag(i) + CodedOutputStream.computeTagSize(number) + i;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                i += c(liteType, number, it2.next());
            }
            return i;
        }
        return c(liteType, number, obj);
    }

    public static int h(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldSet$FieldDescriptorLite.isRepeated() && !fieldSet$FieldDescriptorLite.isPacked()) {
            if (value instanceof LazyField) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
        }
        return e(fieldSet$FieldDescriptorLite, value);
    }

    public static boolean k(Map.Entry entry) {
        boolean z;
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (fieldSet$FieldDescriptorLite.isRepeated()) {
                for (Object obj : (List) entry.getValue()) {
                    if (obj instanceof MessageLiteOrBuilder) {
                        z = ((MessageLiteOrBuilder) obj).isInitialized();
                    } else if (obj instanceof LazyField) {
                        z = true;
                    } else {
                        ze0.k("Wrong object type used with protocol message reflection.");
                        return false;
                    }
                    if (!z) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof MessageLiteOrBuilder) {
                    return ((MessageLiteOrBuilder) value).isInitialized();
                }
                if (value instanceof LazyField) {
                    return true;
                }
                ze0.k("Wrong object type used with protocol message reflection.");
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r4 instanceof com.google.protobuf.LazyField) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if ((r4 instanceof com.google.protobuf.Internal.EnumLite) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void q(com.google.protobuf.FieldSet$FieldDescriptorLite r3, java.lang.Object r4) {
        /*
            com.google.protobuf.WireFormat$FieldType r0 = r3.getLiteType()
            com.google.protobuf.Internal.checkNotNull(r4)
            int[] r1 = com.google.protobuf.p0.a
            com.google.protobuf.WireFormat$JavaType r0 = r0.getJavaType()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L35;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r1 = r2
            goto L46
        L1a:
            boolean r0 = r4 instanceof com.google.protobuf.MessageLite
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.protobuf.LazyField
            if (r0 == 0) goto L18
            goto L46
        L23:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.protobuf.Internal.EnumLite
            if (r0 == 0) goto L18
            goto L46
        L2c:
            boolean r0 = r4 instanceof com.google.protobuf.ByteString
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L18
            goto L46
        L35:
            boolean r1 = r4 instanceof java.lang.String
            goto L46
        L38:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L46
        L3b:
            boolean r1 = r4 instanceof java.lang.Double
            goto L46
        L3e:
            boolean r1 = r4 instanceof java.lang.Float
            goto L46
        L41:
            boolean r1 = r4 instanceof java.lang.Long
            goto L46
        L44:
            boolean r1 = r4 instanceof java.lang.Integer
        L46:
            if (r1 == 0) goto L49
            return
        L49:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.getNumber()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.protobuf.WireFormat$FieldType r3 = r3.getLiteType()
            com.google.protobuf.WireFormat$JavaType r3 = r3.getJavaType()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q0.q(com.google.protobuf.FieldSet$FieldDescriptorLite, java.lang.Object):void");
    }

    public static void r(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, fieldType.getWireType());
            s(codedOutputStream, fieldType, obj);
        }
    }

    public static void s(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (p0.b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                return;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeStringNoTag((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final void a(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        List list;
        if (fieldSet$FieldDescriptorLite.isRepeated()) {
            q(fieldSet$FieldDescriptorLite, obj);
            Object f = f(fieldSet$FieldDescriptorLite);
            if (f == null) {
                list = new ArrayList();
                this.a.put(fieldSet$FieldDescriptorLite, list);
            } else {
                list = (List) f;
            }
            list.add(obj);
            return;
        }
        ze0.k("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q0 clone() {
        fs5 fs5Var;
        q0 q0Var = new q0();
        int i = 0;
        while (true) {
            fs5Var = this.a;
            if (i >= fs5Var.y.size()) {
                break;
            }
            Map.Entry c = fs5Var.c(i);
            q0Var.p((FieldSet$FieldDescriptorLite) c.getKey(), c.getValue());
            i++;
        }
        for (Map.Entry entry : fs5Var.d()) {
            q0Var.p((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        q0Var.c = this.c;
        return q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        return this.a.equals(((q0) obj).a);
    }

    public final Object f(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite) {
        Object obj = this.a.get(fieldSet$FieldDescriptorLite);
        if (obj instanceof LazyField) {
            return ((LazyField) obj).getValue();
        }
        return obj;
    }

    public final int g() {
        fs5 fs5Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            fs5Var = this.a;
            if (i >= fs5Var.y.size()) {
                break;
            }
            i2 += h(fs5Var.c(i));
            i++;
        }
        Iterator it = fs5Var.d().iterator();
        while (it.hasNext()) {
            i2 += h((Map.Entry) it.next());
        }
        return i2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        fs5 fs5Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            fs5Var = this.a;
            if (i >= fs5Var.y.size()) {
                break;
            }
            Map.Entry c = fs5Var.c(i);
            i2 += e((FieldSet$FieldDescriptorLite) c.getKey(), c.getValue());
            i++;
        }
        for (Map.Entry entry : fs5Var.d()) {
            i2 += e((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public final boolean j() {
        int i = 0;
        while (true) {
            fs5 fs5Var = this.a;
            if (i < fs5Var.y.size()) {
                if (!k(fs5Var.c(i))) {
                    return false;
                }
                i++;
            } else {
                Iterator it = fs5Var.d().iterator();
                while (it.hasNext()) {
                    if (!k((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public final Iterator l() {
        boolean z = this.c;
        fs5 fs5Var = this.a;
        if (z) {
            return new vb3(((es) fs5Var.entrySet()).iterator());
        }
        return ((es) fs5Var.entrySet()).iterator();
    }

    public final void m() {
        fs5 fs5Var;
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            fs5Var = this.a;
            if (i >= fs5Var.y.size()) {
                break;
            }
            Map.Entry c = fs5Var.c(i);
            if (c.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) c.getValue()).makeImmutable();
            }
            i++;
        }
        if (!fs5Var.A) {
            for (int i2 = 0; i2 < fs5Var.y.size(); i2++) {
                Map.Entry c2 = fs5Var.c(i2);
                if (((FieldSet$FieldDescriptorLite) c2.getKey()).isRepeated()) {
                    c2.setValue(Collections.unmodifiableList((List) c2.getValue()));
                }
            }
            for (Map.Entry entry : fs5Var.d()) {
                if (((FieldSet$FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!fs5Var.A) {
            if (fs5Var.z.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(fs5Var.z);
            }
            fs5Var.z = unmodifiableMap;
            if (fs5Var.C.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(fs5Var.C);
            }
            fs5Var.C = unmodifiableMap2;
            fs5Var.A = true;
        }
        this.b = true;
    }

    public final void n(q0 q0Var) {
        fs5 fs5Var;
        int i = 0;
        while (true) {
            int size = q0Var.a.y.size();
            fs5Var = q0Var.a;
            if (i >= size) {
                break;
            }
            o(fs5Var.c(i));
            i++;
        }
        Iterator it = fs5Var.d().iterator();
        while (it.hasNext()) {
            o((Map.Entry) it.next());
        }
    }

    public final void o(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        boolean isRepeated = fieldSet$FieldDescriptorLite.isRepeated();
        fs5 fs5Var = this.a;
        if (isRepeated) {
            Object f = f(fieldSet$FieldDescriptorLite);
            if (f == null) {
                f = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) f;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            fs5Var.put(fieldSet$FieldDescriptorLite, f);
            return;
        }
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            Object f2 = f(fieldSet$FieldDescriptorLite);
            if (f2 == null) {
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                fs5Var.put(fieldSet$FieldDescriptorLite, value);
                return;
            }
            fs5Var.put(fieldSet$FieldDescriptorLite, fieldSet$FieldDescriptorLite.internalMergeFrom(((MessageLite) f2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        fs5Var.put(fieldSet$FieldDescriptorLite, value);
    }

    public final void p(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        if (fieldSet$FieldDescriptorLite.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    q(fieldSet$FieldDescriptorLite, obj2);
                }
                obj = arrayList;
            } else {
                ze0.k("Wrong object type used with protocol message reflection.");
                return;
            }
        } else {
            q(fieldSet$FieldDescriptorLite, obj);
        }
        if (obj instanceof LazyField) {
            this.c = true;
        }
        this.a.put(fieldSet$FieldDescriptorLite, obj);
    }

    public q0() {
    }
}
