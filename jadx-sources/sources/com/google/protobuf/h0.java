package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import defpackage.dw4;
import defpackage.yb5;
import defpackage.yz1;
import defpackage.ze0;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h0 extends yz1 {
    @Override // defpackage.yz1
    public final Object a(Object obj, s sVar, GeneratedMessageLite.GeneratedExtension generatedExtension, ExtensionRegistryLite extensionRegistryLite, q0 q0Var, Object obj2, g2 g2Var) {
        Object f;
        ArrayList arrayList;
        CodedInputStream codedInputStream = sVar.a;
        int number = generatedExtension.getNumber();
        u0 u0Var = generatedExtension.descriptor;
        Object obj3 = null;
        if (u0Var.A && u0Var.B) {
            switch (g0.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    sVar.g(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    sVar.l(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    sVar.n(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    sVar.v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    sVar.m(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    sVar.k(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    sVar.j(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    sVar.d(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    sVar.u(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    sVar.p(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    sVar.q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    sVar.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    sVar.s(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    sVar.h(arrayList);
                    obj2 = v1.j(obj, number, arrayList, generatedExtension.descriptor.x, obj2, g2Var);
                    break;
                default:
                    ze0.f(generatedExtension.descriptor.z, "Type cannot be packed: ");
                    return null;
            }
            q0Var.p(generatedExtension.descriptor, arrayList);
            return obj2;
        }
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            sVar.x(0);
            int readInt32 = codedInputStream.readInt32();
            if (generatedExtension.descriptor.x.findValueByNumber(readInt32) == null) {
                return v1.n(obj, number, readInt32, obj2, g2Var);
            }
            obj3 = Integer.valueOf(readInt32);
        } else {
            switch (g0.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    sVar.x(1);
                    obj3 = Double.valueOf(codedInputStream.readDouble());
                    break;
                case 2:
                    sVar.x(5);
                    obj3 = Float.valueOf(codedInputStream.readFloat());
                    break;
                case 3:
                    sVar.x(0);
                    obj3 = Long.valueOf(codedInputStream.readInt64());
                    break;
                case 4:
                    sVar.x(0);
                    obj3 = Long.valueOf(codedInputStream.readUInt64());
                    break;
                case 5:
                    sVar.x(0);
                    obj3 = Integer.valueOf(codedInputStream.readInt32());
                    break;
                case 6:
                    sVar.x(1);
                    obj3 = Long.valueOf(codedInputStream.readFixed64());
                    break;
                case 7:
                    sVar.x(5);
                    obj3 = Integer.valueOf(codedInputStream.readFixed32());
                    break;
                case 8:
                    sVar.x(0);
                    obj3 = Boolean.valueOf(codedInputStream.readBool());
                    break;
                case 9:
                    sVar.x(0);
                    obj3 = Integer.valueOf(codedInputStream.readUInt32());
                    break;
                case 10:
                    sVar.x(5);
                    obj3 = Integer.valueOf(codedInputStream.readSFixed32());
                    break;
                case 11:
                    sVar.x(1);
                    obj3 = Long.valueOf(codedInputStream.readSFixed64());
                    break;
                case 12:
                    sVar.x(0);
                    obj3 = Integer.valueOf(codedInputStream.readSInt32());
                    break;
                case 13:
                    sVar.x(0);
                    obj3 = Long.valueOf(codedInputStream.readSInt64());
                    break;
                case 14:
                    ze0.m("Shouldn't reach here.");
                    return null;
                case 15:
                    obj3 = sVar.e();
                    break;
                case 16:
                    sVar.x(2);
                    obj3 = codedInputStream.readString();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        Object f2 = q0Var.f(generatedExtension.descriptor);
                        if (f2 instanceof GeneratedMessageLite) {
                            dw4 dw4Var = dw4.c;
                            dw4Var.getClass();
                            yb5 a = dw4Var.a(f2.getClass());
                            if (!((GeneratedMessageLite) f2).isMutable()) {
                                Object d = a.d();
                                a.a(d, f2);
                                q0Var.p(generatedExtension.descriptor, d);
                                f2 = d;
                            }
                            sVar.x(3);
                            sVar.b(f2, a, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    Class<?> cls = generatedExtension.getMessageDefaultInstance().getClass();
                    sVar.x(3);
                    yb5 a2 = dw4.c.a(cls);
                    obj3 = a2.d();
                    sVar.b(obj3, a2, extensionRegistryLite);
                    a2.b(obj3);
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        Object f3 = q0Var.f(generatedExtension.descriptor);
                        if (f3 instanceof GeneratedMessageLite) {
                            dw4 dw4Var2 = dw4.c;
                            dw4Var2.getClass();
                            yb5 a3 = dw4Var2.a(f3.getClass());
                            if (!((GeneratedMessageLite) f3).isMutable()) {
                                Object d2 = a3.d();
                                a3.a(d2, f3);
                                q0Var.p(generatedExtension.descriptor, d2);
                                f3 = d2;
                            }
                            sVar.x(2);
                            sVar.c(f3, a3, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    obj3 = sVar.o(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
            }
        }
        if (generatedExtension.isRepeated()) {
            q0Var.a(generatedExtension.descriptor, obj3);
            return obj2;
        }
        int i = g0.a[generatedExtension.getLiteType().ordinal()];
        if ((i == 17 || i == 18) && (f = q0Var.f(generatedExtension.descriptor)) != null) {
            obj3 = Internal.mergeMessage(f, obj3);
        }
        q0Var.p(generatedExtension.descriptor, obj3);
        return obj2;
    }
}
