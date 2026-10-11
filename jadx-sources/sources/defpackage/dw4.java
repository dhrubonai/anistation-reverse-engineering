package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.c1;
import com.google.protobuf.e1;
import com.google.protobuf.g2;
import com.google.protobuf.l1;
import com.google.protobuf.m1;
import com.google.protobuf.v1;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dw4 {
    public static final dw4 c = new dw4();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final cn7 a = new cn7((byte) 1);

    public final yb5 a(Class cls) {
        yb5 B;
        Class cls2;
        Internal.checkNotNull(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        yb5 yb5Var = (yb5) concurrentHashMap.get(cls);
        if (yb5Var == null) {
            Class cls3 = v1.a;
            if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = v1.a) != null && !cls2.isAssignableFrom(cls)) {
                ze0.k("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                return null;
            }
            yx3 a = ((zx3) this.a.x).a(cls);
            if (a.a()) {
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    B = new m1(v1.c, a02.a, a.b());
                } else {
                    g2 g2Var = v1.b;
                    yz1 yz1Var = a02.b;
                    if (yz1Var != null) {
                        B = new m1(g2Var, yz1Var, a.b());
                    } else {
                        ze0.m("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                if (um3.a[a.getSyntax().ordinal()] != 1) {
                    B = l1.B(a, q94.b, e1.b, v1.c, a02.a, kn3.b);
                } else {
                    B = l1.B(a, q94.b, e1.b, v1.c, null, kn3.b);
                }
            } else if (um3.a[a.getSyntax().ordinal()] != 1) {
                o94 o94Var = q94.a;
                c1 c1Var = e1.a;
                g2 g2Var2 = v1.b;
                yz1 yz1Var2 = a02.b;
                if (yz1Var2 != null) {
                    B = l1.B(a, o94Var, c1Var, g2Var2, yz1Var2, kn3.a);
                } else {
                    ze0.m("Protobuf runtime is not correctly loaded.");
                    return null;
                }
            } else {
                B = l1.B(a, q94.a, e1.a, v1.b, null, kn3.a);
            }
            Internal.checkNotNull(cls, "messageType");
            Internal.checkNotNull(B, "schema");
            yb5 yb5Var2 = (yb5) concurrentHashMap.putIfAbsent(cls, B);
            if (yb5Var2 != null) {
                return yb5Var2;
            }
            return B;
        }
        return yb5Var;
    }
}
