package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import defpackage.aq6;
import defpackage.as;
import defpackage.dw4;
import defpackage.h11;
import defpackage.in3;
import defpackage.j97;
import defpackage.o94;
import defpackage.ov3;
import defpackage.qi2;
import defpackage.qo6;
import defpackage.ro6;
import defpackage.v71;
import defpackage.vd0;
import defpackage.wd0;
import defpackage.yb5;
import defpackage.yz1;
import java.io.IOException;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l1 implements yb5 {
    public static final int[] q = new int[0];
    public static final Unsafe r;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final MessageLite e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final o94 l;
    public final e1 m;
    public final g2 n;
    public final yz1 o;
    public final in3 p;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new defpackage.g1((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        r = unsafe;
    }

    public l1(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, int[] iArr2, int i3, int i4, o94 o94Var, e1 e1Var, g2 g2Var, yz1 yz1Var, in3 in3Var) {
        boolean z2;
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = messageLite instanceof GeneratedMessageLite;
        if (yz1Var != null && (messageLite instanceof GeneratedMessageLite.ExtendableMessage)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        this.h = z;
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = o94Var;
        this.m = e1Var;
        this.n = g2Var;
        this.o = yz1Var;
        this.e = messageLite;
        this.p = in3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.protobuf.l1 B(defpackage.yx3 r39, defpackage.o94 r40, com.google.protobuf.e1 r41, com.google.protobuf.g2 r42, defpackage.yz1 r43, defpackage.in3 r44) {
        /*
            Method dump skipped, instructions count: 1588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l1.B(yx3, o94, com.google.protobuf.e1, com.google.protobuf.g2, yz1, in3):com.google.protobuf.l1");
    }

    public static long C(int i) {
        return i & 1048575;
    }

    public static int D(long j, Object obj) {
        return ((Integer) ro6.l(j, obj)).intValue();
    }

    public static long E(long j, Object obj) {
        return ((Long) ro6.l(j, obj)).longValue();
    }

    public static java.lang.reflect.Field K(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder n = h11.n("Field ", str, " for ");
            n.append(cls.getName());
            n.append(" not found. Known fields are ");
            n.append(Arrays.toString(declaredFields));
            throw new RuntimeException(n.toString());
        }
    }

    public static int Q(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void T(int i, Object obj, j97 j97Var) {
        if (obj instanceof String) {
            ((z) j97Var).a.writeString(i, (String) obj);
        } else {
            ((z) j97Var).a(i, (ByteString) obj);
        }
    }

    public static void l(Object obj) {
        if (u(obj)) {
            return;
        }
        ov3.f(obj, "Mutating immutable message: ");
    }

    public static int m(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class cls, as asVar) {
        boolean z = false;
        switch (k1.a[fieldType.ordinal()]) {
            case 1:
                int t = f.t(bArr, i, asVar);
                if (asVar.b != 0) {
                    z = true;
                }
                asVar.c = Boolean.valueOf(z);
                return t;
            case 2:
                return f.a(bArr, i, asVar);
            case 3:
                asVar.c = Double.valueOf(Double.longBitsToDouble(f.c(i, bArr)));
                return i + 8;
            case 4:
            case 5:
                asVar.c = Integer.valueOf(f.b(i, bArr));
                return i + 4;
            case 6:
            case 7:
                asVar.c = Long.valueOf(f.c(i, bArr));
                return i + 8;
            case 8:
                asVar.c = Float.valueOf(Float.intBitsToFloat(f.b(i, bArr)));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int r2 = f.r(bArr, i, asVar);
                asVar.c = Integer.valueOf(asVar.a);
                return r2;
            case 12:
            case 13:
                int t2 = f.t(bArr, i, asVar);
                asVar.c = Long.valueOf(asVar.b);
                return t2;
            case 14:
                return f.e(dw4.c.a(cls), bArr, i, i2, asVar);
            case 15:
                int r3 = f.r(bArr, i, asVar);
                asVar.c = Integer.valueOf(CodedInputStream.decodeZigZag32(asVar.a));
                return r3;
            case 16:
                int t3 = f.t(bArr, i, asVar);
                asVar.c = Long.valueOf(CodedInputStream.decodeZigZag64(asVar.b));
                return t3;
            case 17:
                int r4 = f.r(bArr, i, asVar);
                int i3 = asVar.a;
                if (i3 >= 0) {
                    if (i3 == 0) {
                        asVar.c = "";
                        return r4;
                    }
                    asVar.c = aq6.a.b(bArr, r4, i3);
                    return r4 + i3;
                }
                throw InvalidProtocolBufferException.negativeSize();
            default:
                v71.i("unsupported field type.");
                return 0;
        }
    }

    public static UnknownFieldSetLite r(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = newInstance;
            return newInstance;
        }
        return unknownFieldSetLite;
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    public final Object A(int i, int i2, Object obj) {
        yb5 q2 = q(i2);
        if (!v(i, i2, obj)) {
            return q2.d();
        }
        Object object = r.getObject(obj, R(i2) & 1048575);
        if (u(object)) {
            return object;
        }
        Object d = q2.d();
        if (object != null) {
            q2.a(d, object);
        }
        return d;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int F(java.lang.Object r41, byte[] r42, int r43, int r44, int r45, defpackage.as r46) {
        /*
            Method dump skipped, instructions count: 4304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l1.F(java.lang.Object, byte[], int, int, int, as):int");
    }

    public final void G(Object obj, long j, s sVar, yb5 yb5Var, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        List c = this.m.c(j, obj);
        CodedInputStream codedInputStream = sVar.a;
        if (WireFormat.getTagWireType(sVar.b) == 3) {
            int i = sVar.b;
            do {
                Object d = yb5Var.d();
                sVar.b(d, yb5Var, extensionRegistryLite);
                yb5Var.b(d);
                c.add(d);
                if (!codedInputStream.isAtEnd() && sVar.d == 0) {
                    readTag = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag == i);
            sVar.d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public final void H(Object obj, int i, s sVar, yb5 yb5Var, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        List c = this.m.c(i & 1048575, obj);
        CodedInputStream codedInputStream = sVar.a;
        if (WireFormat.getTagWireType(sVar.b) == 2) {
            int i2 = sVar.b;
            do {
                Object d = yb5Var.d();
                sVar.c(d, yb5Var, extensionRegistryLite);
                yb5Var.b(d);
                c.add(d);
                if (!codedInputStream.isAtEnd() && sVar.d == 0) {
                    readTag = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag == i2);
            sVar.d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public final void I(int i, s sVar, Object obj) {
        CodedInputStream codedInputStream = sVar.a;
        if ((536870912 & i) != 0) {
            sVar.x(2);
            ro6.t(i & 1048575, obj, codedInputStream.readStringRequireUtf8());
        } else if (this.g) {
            sVar.x(2);
            ro6.t(i & 1048575, obj, codedInputStream.readString());
        } else {
            ro6.t(i & 1048575, obj, sVar.e());
        }
    }

    public final void J(int i, s sVar, Object obj) {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        e1 e1Var = this.m;
        if (z) {
            sVar.t(e1Var.c(i & 1048575, obj), true);
        } else {
            sVar.t(e1Var.c(i & 1048575, obj), false);
        }
    }

    public final void L(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        ro6.r(obj, j, (1 << (i2 >>> 20)) | ro6.j(j, obj));
    }

    public final void M(int i, int i2, Object obj) {
        ro6.r(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int N(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void O(int i, Object obj, Object obj2) {
        r.putObject(obj, R(i) & 1048575, obj2);
        L(i, obj);
    }

    public final void P(int i, int i2, Object obj, Object obj2) {
        r.putObject(obj, R(i2) & 1048575, obj2);
        M(i, i2, obj);
    }

    public final int R(int i) {
        return this.a[i + 1];
    }

    public final void S(j97 j97Var, int i, Object obj, int i2) {
        if (obj != null) {
            Object p = p(i2);
            this.p.getClass();
            i1 metadata = ((MapEntryLite) p).getMetadata();
            MapFieldLite mapFieldLite = (MapFieldLite) obj;
            z zVar = (z) j97Var;
            CodedOutputStream codedOutputStream = zVar.a;
            CodedOutputStream codedOutputStream2 = zVar.a;
            if (codedOutputStream.isSerializationDeterministic()) {
                int i3 = 0;
                switch (y.a[metadata.a.ordinal()]) {
                    case 1:
                        Boolean bool = Boolean.FALSE;
                        V v = mapFieldLite.get(bool);
                        if (v != 0) {
                            codedOutputStream2.writeTag(i, 2);
                            codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, bool, v));
                            MapEntryLite.writeTo(codedOutputStream2, metadata, bool, v);
                        }
                        Boolean bool2 = Boolean.TRUE;
                        V v2 = mapFieldLite.get(bool2);
                        if (v2 != 0) {
                            codedOutputStream2.writeTag(i, 2);
                            codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, bool2, v2));
                            MapEntryLite.writeTo(codedOutputStream2, metadata, bool2, v2);
                            return;
                        }
                        return;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        int size = mapFieldLite.size();
                        int[] iArr = new int[size];
                        Iterator it = mapFieldLite.keySet().iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            iArr[i4] = ((Integer) it.next()).intValue();
                            i4++;
                        }
                        Arrays.sort(iArr);
                        while (i3 < size) {
                            int i5 = iArr[i3];
                            V v3 = mapFieldLite.get(Integer.valueOf(i5));
                            codedOutputStream.writeTag(i, 2);
                            codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Integer.valueOf(i5), v3));
                            MapEntryLite.writeTo(codedOutputStream, metadata, Integer.valueOf(i5), v3);
                            i3++;
                        }
                        return;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        int size2 = mapFieldLite.size();
                        long[] jArr = new long[size2];
                        Iterator it2 = mapFieldLite.keySet().iterator();
                        int i6 = 0;
                        while (it2.hasNext()) {
                            jArr[i6] = ((Long) it2.next()).longValue();
                            i6++;
                        }
                        Arrays.sort(jArr);
                        while (i3 < size2) {
                            long j = jArr[i3];
                            V v4 = mapFieldLite.get(Long.valueOf(j));
                            codedOutputStream.writeTag(i, 2);
                            codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Long.valueOf(j), v4));
                            MapEntryLite.writeTo(codedOutputStream, metadata, Long.valueOf(j), v4);
                            i3++;
                        }
                        return;
                    case 12:
                        int size3 = mapFieldLite.size();
                        String[] strArr = new String[size3];
                        Iterator it3 = mapFieldLite.keySet().iterator();
                        int i7 = 0;
                        while (it3.hasNext()) {
                            strArr[i7] = (String) it3.next();
                            i7++;
                        }
                        Arrays.sort(strArr);
                        while (i3 < size3) {
                            String str = strArr[i3];
                            V v5 = mapFieldLite.get(str);
                            codedOutputStream.writeTag(i, 2);
                            codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str, v5));
                            MapEntryLite.writeTo(codedOutputStream, metadata, str, v5);
                            i3++;
                        }
                        return;
                    default:
                        qi2.i(metadata.a, "does not support key type: ");
                        return;
                }
            }
            Iterator it4 = mapFieldLite.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                codedOutputStream.writeTag(i, 2);
                codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
                MapEntryLite.writeTo(codedOutputStream, metadata, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // defpackage.yb5
    public final void a(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int R = R(i);
                long j = 1048575 & R;
                int i2 = iArr[i];
                switch (Q(R)) {
                    case 0:
                        if (s(i, obj2)) {
                            qo6 qo6Var = ro6.c;
                            obj3 = obj;
                            qo6Var.l(obj3, j, qo6Var.f(j, obj2));
                            L(i, obj3);
                            break;
                        }
                        break;
                    case 1:
                        if (s(i, obj2)) {
                            qo6 qo6Var2 = ro6.c;
                            qo6Var2.m(obj, j, qo6Var2.g(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 2:
                        if (s(i, obj2)) {
                            ro6.s(obj, j, ro6.k(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 3:
                        if (s(i, obj2)) {
                            ro6.s(obj, j, ro6.k(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 4:
                        if (s(i, obj2)) {
                            ro6.r(obj, j, ro6.j(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 5:
                        if (s(i, obj2)) {
                            ro6.s(obj, j, ro6.k(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 6:
                        if (s(i, obj2)) {
                            ro6.r(obj, j, ro6.j(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 7:
                        if (s(i, obj2)) {
                            qo6 qo6Var3 = ro6.c;
                            qo6Var3.i(obj, j, qo6Var3.c(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 8:
                        if (s(i, obj2)) {
                            ro6.t(j, obj, ro6.l(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 9:
                        x(i, obj, obj2);
                        break;
                    case 10:
                        if (s(i, obj2)) {
                            ro6.t(j, obj, ro6.l(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 11:
                        if (s(i, obj2)) {
                            ro6.r(obj, j, ro6.j(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 12:
                        if (s(i, obj2)) {
                            ro6.r(obj, j, ro6.j(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 13:
                        if (s(i, obj2)) {
                            ro6.r(obj, j, ro6.j(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 14:
                        if (s(i, obj2)) {
                            ro6.s(obj, j, ro6.k(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 15:
                        if (s(i, obj2)) {
                            ro6.r(obj, j, ro6.j(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 16:
                        if (s(i, obj2)) {
                            ro6.s(obj, j, ro6.k(j, obj2));
                            L(i, obj);
                            break;
                        }
                        break;
                    case 17:
                        x(i, obj, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                        this.m.b(j, obj, obj2);
                        break;
                    case 50:
                        Class cls = v1.a;
                        Object l = ro6.l(j, obj);
                        Object l2 = ro6.l(j, obj2);
                        this.p.getClass();
                        ro6.t(j, obj, in3.a(l, l2));
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                        if (v(i2, i, obj2)) {
                            ro6.t(j, obj, ro6.l(j, obj2));
                            M(i2, i, obj);
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                        y(i, obj, obj2);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    case 64:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE:
                        if (v(i2, i, obj2)) {
                            ro6.t(j, obj, ro6.l(j, obj2));
                            M(i2, i, obj);
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS_VALUE:
                        y(i, obj, obj2);
                        break;
                }
                obj3 = obj;
                i += 3;
                obj = obj3;
            } else {
                Object obj4 = obj;
                v1.l(this.n, obj4, obj2);
                if (this.f) {
                    ((h0) this.o).getClass();
                    q0 q0Var = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
                    if (!q0Var.a.isEmpty()) {
                        ((GeneratedMessageLite.ExtendableMessage) obj4).ensureExtensionsAreMutable().n(q0Var);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.yb5
    public final void b(Object obj) {
        if (u(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int R = R(i);
                long j = 1048575 & R;
                int Q = Q(R);
                Unsafe unsafe = r;
                if (Q != 9) {
                    if (Q != 60 && Q != 68) {
                        switch (Q) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                                this.m.a(j, obj);
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.p.getClass();
                                    ((MapFieldLite) object).makeImmutable();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (v(iArr[i], i, obj)) {
                        q(i).b(unsafe.getObject(obj, j));
                    }
                }
                if (s(i, obj)) {
                    q(i).b(unsafe.getObject(obj, j));
                }
            }
            ((h2) this.n).getClass();
            ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
            if (this.f) {
                ((h0) this.o).getClass();
                ((GeneratedMessageLite.ExtendableMessage) obj).extensions.m();
            }
        }
    }

    @Override // defpackage.yb5
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            if (i6 < this.j) {
                int i7 = this.i[i6];
                int[] iArr = this.a;
                int i8 = iArr[i7];
                int R = R(i7);
                int i9 = iArr[i7 + 2];
                int i10 = i9 & 1048575;
                int i11 = 1 << (i9 >>> 20);
                if (i10 != i4) {
                    if (i10 != 1048575) {
                        i5 = r.getInt(obj, i10);
                    }
                    i2 = i7;
                    i3 = i5;
                    i = i10;
                } else {
                    int i12 = i5;
                    i = i4;
                    i2 = i7;
                    i3 = i12;
                }
                if ((268435456 & R) != 0 && !t(obj, i2, i, i3, i11)) {
                    break;
                }
                int Q = Q(R);
                if (Q != 9 && Q != 17) {
                    if (Q != 27) {
                        if (Q != 60 && Q != 68) {
                            if (Q != 49) {
                                if (Q == 50) {
                                    Object l = ro6.l(R & 1048575, obj);
                                    this.p.getClass();
                                    MapFieldLite mapFieldLite = (MapFieldLite) l;
                                    if (!mapFieldLite.isEmpty() && ((MapEntryLite) p(i2)).getMetadata().c.getJavaType() == WireFormat.JavaType.MESSAGE) {
                                        yb5 yb5Var = null;
                                        for (Object obj2 : mapFieldLite.values()) {
                                            if (yb5Var == null) {
                                                yb5Var = dw4.c.a(obj2.getClass());
                                            }
                                            if (!yb5Var.c(obj2)) {
                                                break loop0;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                i6++;
                                i4 = i;
                                i5 = i3;
                            }
                        } else {
                            if (v(i8, i2, obj) && !q(i2).c(ro6.l(R & 1048575, obj))) {
                                break;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) ro6.l(R & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        yb5 q2 = q(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (!q2.c(list.get(i13))) {
                                break loop0;
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (t(obj, i2, i, i3, i11) && !q(i2).c(ro6.l(R & 1048575, obj))) {
                        break;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            } else {
                if (this.f) {
                    ((h0) this.o).getClass();
                    if (!((GeneratedMessageLite.ExtendableMessage) obj).extensions.j()) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yb5
    public final Object d() {
        this.l.getClass();
        return ((GeneratedMessageLite) this.e).newMutableInstance();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        r14.c(r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0107. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0868 A[Catch: all -> 0x086f, TryCatch #10 {all -> 0x086f, blocks: (B:45:0x0863, B:47:0x0868, B:49:0x0872), top: B:44:0x0863 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0878 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x08aa A[LOOP:3: B:66:0x08a8->B:67:0x08aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x08b9  */
    @Override // defpackage.yb5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r21, com.google.protobuf.s r22, com.google.protobuf.ExtensionRegistryLite r23) {
        /*
            Method dump skipped, instructions count: 2380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l1.e(java.lang.Object, com.google.protobuf.s, com.google.protobuf.ExtensionRegistryLite):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:329:0x0671. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cf  */
    @Override // defpackage.yb5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.protobuf.MessageLite r23, defpackage.j97 r24) {
        /*
            Method dump skipped, instructions count: 3312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l1.f(com.google.protobuf.MessageLite, j97):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0018. Please report as an issue. */
    @Override // defpackage.yb5
    public final int g(GeneratedMessageLite generatedMessageLite) {
        int i;
        int hashLong;
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int R = R(i3);
            int i4 = iArr[i3];
            long j = 1048575 & R;
            int i5 = 37;
            switch (Q(R)) {
                case 0:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(ro6.c.f(j, generatedMessageLite)));
                    i2 = hashLong + i;
                    break;
                case 1:
                    i = i2 * 53;
                    hashLong = Float.floatToIntBits(ro6.c.g(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 2:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(ro6.k(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 3:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(ro6.k(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 4:
                    i = i2 * 53;
                    hashLong = ro6.j(j, generatedMessageLite);
                    i2 = hashLong + i;
                    break;
                case 5:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(ro6.k(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 6:
                    i = i2 * 53;
                    hashLong = ro6.j(j, generatedMessageLite);
                    i2 = hashLong + i;
                    break;
                case 7:
                    i = i2 * 53;
                    hashLong = Internal.hashBoolean(ro6.c.c(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 8:
                    i = i2 * 53;
                    hashLong = ((String) ro6.l(j, generatedMessageLite)).hashCode();
                    i2 = hashLong + i;
                    break;
                case 9:
                    Object l = ro6.l(j, generatedMessageLite);
                    if (l != null) {
                        i5 = l.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    hashLong = ro6.l(j, generatedMessageLite).hashCode();
                    i2 = hashLong + i;
                    break;
                case 11:
                    i = i2 * 53;
                    hashLong = ro6.j(j, generatedMessageLite);
                    i2 = hashLong + i;
                    break;
                case 12:
                    i = i2 * 53;
                    hashLong = ro6.j(j, generatedMessageLite);
                    i2 = hashLong + i;
                    break;
                case 13:
                    i = i2 * 53;
                    hashLong = ro6.j(j, generatedMessageLite);
                    i2 = hashLong + i;
                    break;
                case 14:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(ro6.k(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 15:
                    i = i2 * 53;
                    hashLong = ro6.j(j, generatedMessageLite);
                    i2 = hashLong + i;
                    break;
                case 16:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(ro6.k(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 17:
                    Object l2 = ro6.l(j, generatedMessageLite);
                    if (l2 != null) {
                        i5 = l2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    i = i2 * 53;
                    hashLong = ro6.l(j, generatedMessageLite).hashCode();
                    i2 = hashLong + i;
                    break;
                case 50:
                    i = i2 * 53;
                    hashLong = ro6.l(j, generatedMessageLite).hashCode();
                    i2 = hashLong + i;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(((Double) ro6.l(j, generatedMessageLite)).doubleValue()));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Float.floatToIntBits(((Float) ro6.l(j, generatedMessageLite)).floatValue());
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(E(j, generatedMessageLite));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(E(j, generatedMessageLite));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = D(j, generatedMessageLite);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(E(j, generatedMessageLite));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = D(j, generatedMessageLite);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashBoolean(((Boolean) ro6.l(j, generatedMessageLite)).booleanValue());
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = ((String) ro6.l(j, generatedMessageLite)).hashCode();
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = ro6.l(j, generatedMessageLite).hashCode();
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = ro6.l(j, generatedMessageLite).hashCode();
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = D(j, generatedMessageLite);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = D(j, generatedMessageLite);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = D(j, generatedMessageLite);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(E(j, generatedMessageLite));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = D(j, generatedMessageLite);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(E(j, generatedMessageLite));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS_VALUE:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = ro6.l(j, generatedMessageLite).hashCode();
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((h2) this.n).getClass();
        int hashCode = generatedMessageLite.unknownFields.hashCode() + (i2 * 53);
        if (this.f) {
            ((h0) this.o).getClass();
            return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.a.hashCode() + (hashCode * 53);
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (com.google.protobuf.v1.m(defpackage.ro6.l(r7, r12), defpackage.ro6.l(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (defpackage.ro6.k(r7, r12) == defpackage.ro6.k(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (defpackage.ro6.j(r7, r12) == defpackage.ro6.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (defpackage.ro6.k(r7, r12) == defpackage.ro6.k(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (defpackage.ro6.j(r7, r12) == defpackage.ro6.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (defpackage.ro6.j(r7, r12) == defpackage.ro6.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (defpackage.ro6.j(r7, r12) == defpackage.ro6.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (com.google.protobuf.v1.m(defpackage.ro6.l(r7, r12), defpackage.ro6.l(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (com.google.protobuf.v1.m(defpackage.ro6.l(r7, r12), defpackage.ro6.l(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (com.google.protobuf.v1.m(defpackage.ro6.l(r7, r12), defpackage.ro6.l(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (defpackage.ro6.j(r7, r12) == defpackage.ro6.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (defpackage.ro6.k(r7, r12) == defpackage.ro6.k(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (defpackage.ro6.j(r7, r12) == defpackage.ro6.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (defpackage.ro6.k(r7, r12) == defpackage.ro6.k(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (defpackage.ro6.k(r7, r12) == defpackage.ro6.k(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.g(r7, r12)) == java.lang.Float.floatToIntBits(r5.g(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.f(r7, r12)) == java.lang.Double.doubleToLongBits(r5.f(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (com.google.protobuf.v1.m(defpackage.ro6.l(r7, r12), defpackage.ro6.l(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // defpackage.yb5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(com.google.protobuf.GeneratedMessageLite r12, com.google.protobuf.GeneratedMessageLite r13) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l1.h(com.google.protobuf.GeneratedMessageLite, com.google.protobuf.GeneratedMessageLite):boolean");
    }

    @Override // defpackage.yb5
    public final void i(Object obj, byte[] bArr, int i, int i2, as asVar) {
        F(obj, bArr, i, i2, 0, asVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0055. Please report as an issue. */
    @Override // defpackage.yb5
    public final int j(AbstractMessageLite abstractMessageLite) {
        int i;
        int computeFloatSize;
        int computeStringSize;
        int computeMessageSize;
        int computeTagSize;
        int size;
        int i2;
        int computeTagSize2;
        int computeBoolSize;
        int computeStringSizeNoTag;
        int computeStringSizeNoTag2;
        int computeTagSize3;
        int computeMessageSizeNoTag;
        int size2;
        int computeTagSize4;
        int computeUInt32SizeNoTag;
        int i3;
        int computeStringSize2;
        l1 l1Var = this;
        AbstractMessageLite abstractMessageLite2 = abstractMessageLite;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = l1Var.a;
            if (i5 < iArr.length) {
                int R = l1Var.R(i5);
                int Q = Q(R);
                int i9 = iArr[i5];
                int i10 = iArr[i5 + 2];
                int i11 = i10 & i4;
                Unsafe unsafe = r;
                if (Q <= 17) {
                    if (i11 != i8) {
                        if (i11 == i4) {
                            i6 = 0;
                        } else {
                            i6 = unsafe.getInt(abstractMessageLite2, i11);
                        }
                        i8 = i11;
                    }
                    i = 1 << (i10 >>> 20);
                } else {
                    i = 0;
                }
                int i12 = i7;
                long j = R & i4;
                if (Q < FieldType.DOUBLE_LIST_PACKED.id() || Q > FieldType.SINT64_LIST_PACKED.id()) {
                    i11 = 0;
                }
                boolean z = l1Var.h;
                switch (Q) {
                    case 0:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            i7 = CodedOutputStream.computeDoubleSize(i9, 0.0d) + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case 1:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeFloatSize(i9, 0.0f);
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 2:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeInt64Size(i9, unsafe.getLong(abstractMessageLite2, j));
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 3:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeUInt64Size(i9, unsafe.getLong(abstractMessageLite2, j));
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 4:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeInt32Size(i9, unsafe.getInt(abstractMessageLite2, j));
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 5:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeFixed64Size(i9, 0L);
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 6:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeFixed32Size(i9, 0);
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 7:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeBoolSize(i9, true);
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 8:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            Object object = unsafe.getObject(abstractMessageLite2, j);
                            if (object instanceof ByteString) {
                                computeStringSize = CodedOutputStream.computeBytesSize(i9, (ByteString) object);
                            } else {
                                computeStringSize = CodedOutputStream.computeStringSize(i9, (String) object);
                            }
                            i7 = computeStringSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 9:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            Object object2 = unsafe.getObject(abstractMessageLite2, j);
                            yb5 q2 = l1Var.q(i5);
                            Class cls = v1.a;
                            if (object2 instanceof LazyFieldLite) {
                                computeMessageSize = CodedOutputStream.computeLazyFieldSize(i9, (LazyFieldLite) object2);
                            } else {
                                computeMessageSize = CodedOutputStream.computeMessageSize(i9, (MessageLite) object2, q2);
                            }
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case 10:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeBytesSize(i9, (ByteString) unsafe.getObject(abstractMessageLite2, j));
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 11:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeUInt32Size(i9, unsafe.getInt(abstractMessageLite2, j));
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 12:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeEnumSize(i9, unsafe.getInt(abstractMessageLite2, j));
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 13:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeSFixed32Size(i9, 0);
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 14:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeSFixed64Size(i9, 0L);
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 15:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeSInt32Size(i9, unsafe.getInt(abstractMessageLite2, j));
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 16:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeFloatSize = CodedOutputStream.computeSInt64Size(i9, unsafe.getLong(abstractMessageLite2, j));
                            i7 = computeFloatSize + i12;
                            l1Var = this;
                            break;
                        }
                        l1Var = this;
                        i7 = i12;
                        break;
                    case 17:
                        if (l1Var.t(abstractMessageLite2, i5, i8, i6, i)) {
                            computeMessageSize = CodedOutputStream.computeGroupSize(i9, (MessageLite) unsafe.getObject(abstractMessageLite2, j), l1Var.q(i5));
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case 18:
                        computeMessageSize = v1.c(i9, (List) unsafe.getObject(abstractMessageLite2, j));
                        i7 = computeMessageSize + i12;
                        break;
                    case 19:
                        computeMessageSize = v1.b(i9, (List) unsafe.getObject(abstractMessageLite2, j));
                        i7 = computeMessageSize + i12;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls2 = v1.a;
                        if (list.size() != 0) {
                            computeTagSize = (CodedOutputStream.computeTagSize(i9) * list.size()) + v1.e(list);
                            i7 = i12 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i7 = i12 + computeTagSize;
                    case 21:
                        List list2 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls3 = v1.a;
                        size = list2.size();
                        if (size != 0) {
                            i2 = v1.i(list2);
                            computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                            computeTagSize = (computeTagSize2 * size) + i2;
                            i7 = i12 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i7 = i12 + computeTagSize;
                    case 22:
                        List list3 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls4 = v1.a;
                        size = list3.size();
                        if (size != 0) {
                            i2 = v1.d(list3);
                            computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                            computeTagSize = (computeTagSize2 * size) + i2;
                            i7 = i12 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i7 = i12 + computeTagSize;
                    case 23:
                        computeMessageSize = v1.c(i9, (List) unsafe.getObject(abstractMessageLite2, j));
                        i7 = computeMessageSize + i12;
                        break;
                    case 24:
                        computeMessageSize = v1.b(i9, (List) unsafe.getObject(abstractMessageLite2, j));
                        i7 = computeMessageSize + i12;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls5 = v1.a;
                        int size3 = list4.size();
                        if (size3 == 0) {
                            computeBoolSize = 0;
                        } else {
                            computeBoolSize = CodedOutputStream.computeBoolSize(i9, true) * size3;
                        }
                        i7 = i12 + computeBoolSize;
                        break;
                    case 26:
                        List list5 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls6 = v1.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            computeTagSize = CodedOutputStream.computeTagSize(i9) * size4;
                            if (list5 instanceof LazyStringList) {
                                LazyStringList lazyStringList = (LazyStringList) list5;
                                for (int i13 = 0; i13 < size4; i13++) {
                                    Object raw = lazyStringList.getRaw(i13);
                                    if (raw instanceof ByteString) {
                                        computeStringSizeNoTag2 = CodedOutputStream.computeBytesSizeNoTag((ByteString) raw);
                                    } else {
                                        computeStringSizeNoTag2 = CodedOutputStream.computeStringSizeNoTag((String) raw);
                                    }
                                    computeTagSize = computeStringSizeNoTag2 + computeTagSize;
                                }
                            } else {
                                for (int i14 = 0; i14 < size4; i14++) {
                                    Object obj = list5.get(i14);
                                    if (obj instanceof ByteString) {
                                        computeStringSizeNoTag = CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                                    } else {
                                        computeStringSizeNoTag = CodedOutputStream.computeStringSizeNoTag((String) obj);
                                    }
                                    computeTagSize = computeStringSizeNoTag + computeTagSize;
                                }
                            }
                            i7 = i12 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i7 = i12 + computeTagSize;
                    case 27:
                        List list6 = (List) unsafe.getObject(abstractMessageLite2, j);
                        yb5 q3 = l1Var.q(i5);
                        Class cls7 = v1.a;
                        int size5 = list6.size();
                        if (size5 == 0) {
                            computeTagSize3 = 0;
                        } else {
                            computeTagSize3 = CodedOutputStream.computeTagSize(i9) * size5;
                            for (int i15 = 0; i15 < size5; i15++) {
                                Object obj2 = list6.get(i15);
                                if (obj2 instanceof LazyFieldLite) {
                                    computeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj2);
                                } else {
                                    computeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj2, q3);
                                }
                                computeTagSize3 = computeMessageSizeNoTag + computeTagSize3;
                            }
                        }
                        i7 = i12 + computeTagSize3;
                        break;
                    case 28:
                        List list7 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls8 = v1.a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            computeTagSize = CodedOutputStream.computeTagSize(i9) * size6;
                            for (int i16 = 0; i16 < list7.size(); i16++) {
                                computeTagSize += CodedOutputStream.computeBytesSizeNoTag((ByteString) list7.get(i16));
                            }
                            i7 = i12 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i7 = i12 + computeTagSize;
                    case 29:
                        List list8 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls9 = v1.a;
                        size = list8.size();
                        if (size != 0) {
                            i2 = v1.h(list8);
                            computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                            computeTagSize = (computeTagSize2 * size) + i2;
                            i7 = i12 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i7 = i12 + computeTagSize;
                    case 30:
                        List list9 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls10 = v1.a;
                        size = list9.size();
                        if (size != 0) {
                            i2 = v1.a(list9);
                            computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                            computeTagSize = (computeTagSize2 * size) + i2;
                            i7 = i12 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i7 = i12 + computeTagSize;
                    case 31:
                        computeMessageSize = v1.b(i9, (List) unsafe.getObject(abstractMessageLite2, j));
                        i7 = computeMessageSize + i12;
                        break;
                    case 32:
                        computeMessageSize = v1.c(i9, (List) unsafe.getObject(abstractMessageLite2, j));
                        i7 = computeMessageSize + i12;
                        break;
                    case 33:
                        List list10 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls11 = v1.a;
                        size = list10.size();
                        if (size != 0) {
                            i2 = v1.f(list10);
                            computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                            computeTagSize = (computeTagSize2 * size) + i2;
                            i7 = i12 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i7 = i12 + computeTagSize;
                    case 34:
                        List list11 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls12 = v1.a;
                        size = list11.size();
                        if (size != 0) {
                            i2 = v1.g(list11);
                            computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                            computeTagSize = (computeTagSize2 * size) + i2;
                            i7 = i12 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i7 = i12 + computeTagSize;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        List list12 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls13 = v1.a;
                        size2 = list12.size() * 8;
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                        List list13 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls14 = v1.a;
                        size2 = list13.size() * 4;
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                        size2 = v1.e((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        size2 = v1.i((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                        size2 = v1.d((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                        List list14 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls15 = v1.a;
                        size2 = list14.size() * 8;
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                        List list15 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls16 = v1.a;
                        size2 = list15.size() * 4;
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                        List list16 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls17 = v1.a;
                        size2 = list16.size();
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                        size2 = v1.h((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                        size2 = v1.a((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                        List list17 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls18 = v1.a;
                        size2 = list17.size() * 4;
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                        List list18 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls19 = v1.a;
                        size2 = list18.size() * 8;
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                        size2 = v1.f((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                        size2 = v1.g((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z) {
                                unsafe.putInt(abstractMessageLite2, i11, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                        List list19 = (List) unsafe.getObject(abstractMessageLite2, j);
                        yb5 q4 = l1Var.q(i5);
                        Class cls20 = v1.a;
                        int size7 = list19.size();
                        if (size7 == 0) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            for (int i17 = 0; i17 < size7; i17++) {
                                i3 += CodedOutputStream.computeGroupSize(i9, (MessageLite) list19.get(i17), q4);
                            }
                        }
                        i7 = i12 + i3;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(abstractMessageLite2, j);
                        Object p = l1Var.p(i5);
                        l1Var.p.getClass();
                        MapFieldLite mapFieldLite = (MapFieldLite) object3;
                        MapEntryLite mapEntryLite = (MapEntryLite) p;
                        if (!mapFieldLite.isEmpty()) {
                            computeTagSize = 0;
                            for (Map.Entry entry : mapFieldLite.entrySet()) {
                                computeTagSize += mapEntryLite.computeMessageSize(i9, entry.getKey(), entry.getValue());
                            }
                            i7 = i12 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i7 = i12 + computeTagSize;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeDoubleSize(i9, 0.0d);
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeFloatSize(i9, 0.0f);
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeInt64Size(i9, E(j, abstractMessageLite2));
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeUInt64Size(i9, E(j, abstractMessageLite2));
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeInt32Size(i9, D(j, abstractMessageLite2));
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeFixed64Size(i9, 0L);
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeFixed32Size(i9, 0);
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeBoolSize(i9, true);
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            Object object4 = unsafe.getObject(abstractMessageLite2, j);
                            if (object4 instanceof ByteString) {
                                computeStringSize2 = CodedOutputStream.computeBytesSize(i9, (ByteString) object4);
                            } else {
                                computeStringSize2 = CodedOutputStream.computeStringSize(i9, (String) object4);
                            }
                            i7 = computeStringSize2 + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            Object object5 = unsafe.getObject(abstractMessageLite2, j);
                            yb5 q5 = l1Var.q(i5);
                            Class cls21 = v1.a;
                            if (object5 instanceof LazyFieldLite) {
                                computeMessageSize = CodedOutputStream.computeLazyFieldSize(i9, (LazyFieldLite) object5);
                            } else {
                                computeMessageSize = CodedOutputStream.computeMessageSize(i9, (MessageLite) object5, q5);
                            }
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeBytesSize(i9, (ByteString) unsafe.getObject(abstractMessageLite2, j));
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeUInt32Size(i9, D(j, abstractMessageLite2));
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeEnumSize(i9, D(j, abstractMessageLite2));
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case 64:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeSFixed32Size(i9, 0);
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeSFixed64Size(i9, 0L);
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeSInt32Size(i9, D(j, abstractMessageLite2));
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeSInt64Size(i9, E(j, abstractMessageLite2));
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS_VALUE:
                        if (l1Var.v(i9, i5, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeGroupSize(i9, (MessageLite) unsafe.getObject(abstractMessageLite2, j), l1Var.q(i5));
                            i7 = computeMessageSize + i12;
                            break;
                        }
                        i7 = i12;
                        break;
                    default:
                        i7 = i12;
                        break;
                }
                i5 += 3;
                abstractMessageLite2 = abstractMessageLite;
                i4 = 1048575;
            } else {
                ((h2) l1Var.n).getClass();
                int serializedSize = ((GeneratedMessageLite) abstractMessageLite).unknownFields.getSerializedSize() + i7;
                if (l1Var.f) {
                    ((h0) l1Var.o).getClass();
                    return ((GeneratedMessageLite.ExtendableMessage) abstractMessageLite).extensions.i() + serializedSize;
                }
                return serializedSize;
            }
        }
    }

    public final boolean k(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        if (s(i, generatedMessageLite) == s(i, generatedMessageLite2)) {
            return true;
        }
        return false;
    }

    public final Object n(Object obj, int i, Object obj2, g2 g2Var, Object obj3) {
        Internal.EnumVerifier o;
        int i2 = this.a[i];
        Object l = ro6.l(R(i) & 1048575, obj);
        if (l == null || (o = o(i)) == null) {
            return obj2;
        }
        this.p.getClass();
        i1 metadata = ((MapEntryLite) p(i)).getMetadata();
        Iterator it = ((MapFieldLite) l).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!o.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = g2Var.a(obj3);
                }
                vd0 newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.a, metadata, entry.getKey(), entry.getValue());
                    newCodedBuilder.a.checkNoSpaceLeft();
                    wd0 wd0Var = new wd0(newCodedBuilder.b);
                    ((h2) g2Var).getClass();
                    ((UnknownFieldSetLite) obj2).storeField(WireFormat.makeTag(i2, 2), wd0Var);
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    public final Internal.EnumVerifier o(int i) {
        return (Internal.EnumVerifier) this.b[((i / 3) * 2) + 1];
    }

    public final Object p(int i) {
        return this.b[(i / 3) * 2];
    }

    public final yb5 q(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        yb5 yb5Var = (yb5) objArr[i2];
        if (yb5Var != null) {
            return yb5Var;
        }
        yb5 a = dw4.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l1.s(int, java.lang.Object):boolean");
    }

    public final boolean t(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return s(i, obj);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v(int i, int i2, Object obj) {
        if (ro6.j(this.a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        r9.put(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r10.popLimit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.Object r8, int r9, java.lang.Object r10, com.google.protobuf.ExtensionRegistryLite r11, com.google.protobuf.s r12) {
        /*
            r7 = this;
            int r9 = r7.R(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            java.lang.Object r9 = defpackage.ro6.l(r0, r8)
            in3 r7 = r7.p
            if (r9 != 0) goto L20
            r7.getClass()
            com.google.protobuf.MapFieldLite r9 = com.google.protobuf.MapFieldLite.emptyMapField()
            com.google.protobuf.MapFieldLite r9 = r9.mutableCopy()
            defpackage.ro6.t(r0, r8, r9)
            goto L3b
        L20:
            r7.getClass()
            r2 = r9
            com.google.protobuf.MapFieldLite r2 = (com.google.protobuf.MapFieldLite) r2
            boolean r2 = r2.isMutable()
            if (r2 != 0) goto L3b
            com.google.protobuf.MapFieldLite r2 = com.google.protobuf.MapFieldLite.emptyMapField()
            com.google.protobuf.MapFieldLite r2 = r2.mutableCopy()
            defpackage.in3.a(r2, r9)
            defpackage.ro6.t(r0, r8, r2)
            r9 = r2
        L3b:
            r7.getClass()
            com.google.protobuf.MapFieldLite r9 = (com.google.protobuf.MapFieldLite) r9
            com.google.protobuf.MapEntryLite r10 = (com.google.protobuf.MapEntryLite) r10
            com.google.protobuf.i1 r7 = r10.getMetadata()
            r8 = 2
            r12.x(r8)
            com.google.protobuf.CodedInputStream r10 = r12.a
            int r0 = r10.readUInt32()
            int r0 = r10.pushLimit(r0)
            java.lang.Object r1 = r7.b
            java.lang.Object r2 = r7.d
            r3 = r2
        L59:
            int r4 = r12.a()     // Catch: java.lang.Throwable -> L7d
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L9f
            boolean r5 = r10.isAtEnd()     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L69
            goto L9f
        L69:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L8a
            if (r4 == r8) goto L7f
            boolean r4 = r12.y()     // Catch: java.lang.Throwable -> L7d com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L92
            if (r4 == 0) goto L77
            goto L59
        L77:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L7d com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L92
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L7d com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L92
            throw r4     // Catch: java.lang.Throwable -> L7d com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L92
        L7d:
            r7 = move-exception
            goto La6
        L7f:
            com.google.protobuf.WireFormat$FieldType r4 = r7.c     // Catch: java.lang.Throwable -> L7d com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L92
            java.lang.Class r5 = r2.getClass()     // Catch: java.lang.Throwable -> L7d com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L92
            java.lang.Object r3 = r12.i(r4, r5, r11)     // Catch: java.lang.Throwable -> L7d com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L92
            goto L59
        L8a:
            com.google.protobuf.WireFormat$FieldType r4 = r7.a     // Catch: java.lang.Throwable -> L7d com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L92
            r5 = 0
            java.lang.Object r1 = r12.i(r4, r5, r5)     // Catch: java.lang.Throwable -> L7d com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L92
            goto L59
        L92:
            boolean r4 = r12.y()     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L99
            goto L59
        L99:
            com.google.protobuf.InvalidProtocolBufferException r7 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L7d
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L7d
            throw r7     // Catch: java.lang.Throwable -> L7d
        L9f:
            r9.put(r1, r3)     // Catch: java.lang.Throwable -> L7d
            r10.popLimit(r0)
            return
        La6:
            r10.popLimit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l1.w(java.lang.Object, int, java.lang.Object, com.google.protobuf.ExtensionRegistryLite, com.google.protobuf.s):void");
    }

    public final void x(int i, Object obj, Object obj2) {
        if (!s(i, obj2)) {
            return;
        }
        long R = R(i) & 1048575;
        Unsafe unsafe = r;
        Object object = unsafe.getObject(obj2, R);
        if (object != null) {
            yb5 q2 = q(i);
            if (!s(i, obj)) {
                if (!u(object)) {
                    unsafe.putObject(obj, R, object);
                } else {
                    Object d = q2.d();
                    q2.a(d, object);
                    unsafe.putObject(obj, R, d);
                }
                L(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, R);
            if (!u(object2)) {
                Object d2 = q2.d();
                q2.a(d2, object2);
                unsafe.putObject(obj, R, d2);
                object2 = d2;
            }
            q2.a(object2, object);
            return;
        }
        ov3.e(this.a[i], obj2);
    }

    public final void y(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (!v(i2, i, obj2)) {
            return;
        }
        long R = R(i) & 1048575;
        Unsafe unsafe = r;
        Object object = unsafe.getObject(obj2, R);
        if (object != null) {
            yb5 q2 = q(i);
            if (!v(i2, i, obj)) {
                if (!u(object)) {
                    unsafe.putObject(obj, R, object);
                } else {
                    Object d = q2.d();
                    q2.a(d, object);
                    unsafe.putObject(obj, R, d);
                }
                M(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, R);
            if (!u(object2)) {
                Object d2 = q2.d();
                q2.a(d2, object2);
                unsafe.putObject(obj, R, d2);
                object2 = d2;
            }
            q2.a(object2, object);
            return;
        }
        ov3.e(iArr[i], obj2);
    }

    public final Object z(int i, Object obj) {
        yb5 q2 = q(i);
        long R = R(i) & 1048575;
        if (!s(i, obj)) {
            return q2.d();
        }
        Object object = r.getObject(obj, R);
        if (u(object)) {
            return object;
        }
        Object d = q2.d();
        if (object != null) {
            q2.a(d, object);
        }
        return d;
    }
}
