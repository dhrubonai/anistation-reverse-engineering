package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.j97;
import defpackage.yb5;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class v1 {
    public static final Class a;
    public static final g2 b;
    public static final h2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.protobuf.h2, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        g2 g2Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                g2Var = (g2) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = g2Var;
        c = new Object();
    }

    public static void A(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeSFixed64SizeNoTag(((Long) list.get(i4)).longValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeSFixed64NoTag(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeSFixed64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void B(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i4)).intValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeSInt32NoTag(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeSInt32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void C(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i4)).longValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeSInt64NoTag(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeSInt64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void D(int i, List list, j97 j97Var) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (list instanceof LazyStringList) {
                LazyStringList lazyStringList = (LazyStringList) list;
                while (i2 < list.size()) {
                    Object raw = lazyStringList.getRaw(i2);
                    if (raw instanceof String) {
                        codedOutputStream.writeString(i, (String) raw);
                    } else {
                        codedOutputStream.writeBytes(i, (ByteString) raw);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeString(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    public static void E(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i4)).intValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeUInt32NoTag(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeUInt32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void F(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i4)).longValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeUInt64NoTag(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeUInt64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x0) {
            x0 x0Var = (x0) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeEnumSizeNoTag(x0Var.getInt(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed32Size(i, 0) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed64Size(i, 0L) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x0) {
            x0 x0Var = (x0) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeInt32SizeNoTag(x0Var.getInt(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g1) {
            g1 g1Var = (g1) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeInt64SizeNoTag(g1Var.getLong(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x0) {
            x0 x0Var = (x0) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeSInt32SizeNoTag(x0Var.getInt(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g1) {
            g1 g1Var = (g1) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeSInt64SizeNoTag(g1Var.getLong(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x0) {
            x0 x0Var = (x0) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeUInt32SizeNoTag(x0Var.getInt(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g1) {
            g1 g1Var = (g1) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeUInt64SizeNoTag(g1Var.getLong(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static Object j(Object obj, int i, AbstractList abstractList, Internal.EnumLiteMap enumLiteMap, Object obj2, g2 g2Var) {
        if (enumLiteMap == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int intValue = num.intValue();
            if (enumLiteMap.findValueByNumber(intValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj2 = n(obj, i, intValue, obj2, g2Var);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object k(Object obj, int i, List list, Internal.EnumVerifier enumVerifier, Object obj2, g2 g2Var) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (enumVerifier.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = n(obj, i, intValue, obj2, g2Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return obj2;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!enumVerifier.isInRange(intValue2)) {
                obj2 = n(obj, i, intValue2, obj2, g2Var);
                it.remove();
            }
        }
        return obj2;
    }

    public static void l(g2 g2Var, Object obj, Object obj2) {
        ((h2) g2Var).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        UnknownFieldSetLite unknownFieldSetLite2 = ((GeneratedMessageLite) obj2).unknownFields;
        if (!UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite2)) {
            if (UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite)) {
                unknownFieldSetLite = UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLite, unknownFieldSetLite2);
            } else {
                unknownFieldSetLite = unknownFieldSetLite.mergeFrom(unknownFieldSetLite2);
            }
        }
        generatedMessageLite.unknownFields = unknownFieldSetLite;
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static Object n(Object obj, int i, int i2, Object obj2, g2 g2Var) {
        if (obj2 == null) {
            obj2 = g2Var.a(obj);
        }
        ((h2) g2Var).getClass();
        ((UnknownFieldSetLite) obj2).storeField(WireFormat.makeTag(i, 0), Long.valueOf(i2));
        return obj2;
    }

    public static void o(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeBoolSizeNoTag(((Boolean) list.get(i4)).booleanValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeBoolNoTag(((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeBool(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void p(int i, List list, j97 j97Var) {
        if (list != null && !list.isEmpty()) {
            z zVar = (z) j97Var;
            zVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                zVar.a.writeBytes(i, (ByteString) list.get(i2));
            }
        }
    }

    public static void q(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeDoubleSizeNoTag(((Double) list.get(i4)).doubleValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeDoubleNoTag(((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeDouble(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    public static void r(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i4)).intValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeEnumNoTag(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeEnum(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void s(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeFixed32SizeNoTag(((Integer) list.get(i4)).intValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeFixed32NoTag(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeFixed32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void t(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeFixed64SizeNoTag(((Long) list.get(i4)).longValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeFixed64NoTag(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeFixed64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void u(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeFloatSizeNoTag(((Float) list.get(i4)).floatValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeFloatNoTag(((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeFloat(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    public static void v(int i, List list, j97 j97Var, yb5 yb5Var) {
        if (list != null && !list.isEmpty()) {
            z zVar = (z) j97Var;
            zVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                zVar.d(i, list.get(i2), yb5Var);
            }
        }
    }

    public static void w(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i4)).intValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeInt32NoTag(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeInt32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void x(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i4)).longValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeInt64NoTag(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeInt64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void y(int i, List list, j97 j97Var, yb5 yb5Var) {
        if (list != null && !list.isEmpty()) {
            z zVar = (z) j97Var;
            zVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                zVar.g(i, list.get(i2), yb5Var);
            }
        }
    }

    public static void z(int i, List list, j97 j97Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((z) j97Var).a;
            int i2 = 0;
            if (z) {
                codedOutputStream.writeTag(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.computeSFixed32SizeNoTag(((Integer) list.get(i4)).intValue());
                }
                codedOutputStream.writeUInt32NoTag(i3);
                while (i2 < list.size()) {
                    codedOutputStream.writeSFixed32NoTag(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                codedOutputStream.writeSFixed32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }
}
