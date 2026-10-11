package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g0;
import com.google.protobuf.g2;
import com.google.protobuf.q0;
import com.google.protobuf.s;
import com.google.protobuf.u0;
import com.google.protobuf.v1;
import com.google.protobuf.z;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class yz1 {
    public abstract Object a(Object obj, s sVar, GeneratedMessageLite.GeneratedExtension generatedExtension, ExtensionRegistryLite extensionRegistryLite, q0 q0Var, Object obj2, g2 g2Var);

    public void b(j97 j97Var, Map.Entry entry) {
        u0 u0Var = (u0) entry.getKey();
        boolean z = u0Var.A;
        WireFormat.FieldType fieldType = u0Var.z;
        boolean z2 = u0Var.B;
        int i = u0Var.y;
        if (z) {
            switch (g0.a[fieldType.ordinal()]) {
                case 1:
                    v1.q(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 2:
                    v1.u(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 3:
                    v1.x(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 4:
                    v1.F(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 5:
                    v1.w(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 6:
                    v1.t(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 7:
                    v1.s(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 8:
                    v1.o(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 9:
                    v1.E(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 10:
                    v1.z(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 11:
                    v1.A(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 12:
                    v1.B(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 13:
                    v1.C(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 14:
                    v1.w(i, (List) entry.getValue(), j97Var, z2);
                    return;
                case 15:
                    v1.p(i, (List) entry.getValue(), j97Var);
                    return;
                case 16:
                    v1.D(i, (List) entry.getValue(), j97Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        v1.v(i, (List) entry.getValue(), j97Var, dw4.c.a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        v1.y(i, (List) entry.getValue(), j97Var, dw4.c.a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (g0.a[fieldType.ordinal()]) {
            case 1:
                ((z) j97Var).a.writeDouble(i, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                ((z) j97Var).a.writeFloat(i, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                ((z) j97Var).f(i, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                ((z) j97Var).a.writeUInt64(i, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                ((z) j97Var).e(i, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                ((z) j97Var).c(i, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                ((z) j97Var).b(i, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                ((z) j97Var).a.writeBool(i, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                ((z) j97Var).a.writeUInt32(i, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                ((z) j97Var).a.writeSFixed32(i, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                ((z) j97Var).a.writeSFixed64(i, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                ((z) j97Var).a.writeSInt32(i, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                ((z) j97Var).a.writeSInt64(i, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                ((z) j97Var).e(i, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                ((z) j97Var).a(i, (ByteString) entry.getValue());
                return;
            case 16:
                ((z) j97Var).a.writeString(i, (String) entry.getValue());
                return;
            case 17:
                ((z) j97Var).d(i, entry.getValue(), dw4.c.a(entry.getValue().getClass()));
                return;
            case 18:
                ((z) j97Var).g(i, entry.getValue(), dw4.c.a(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}
