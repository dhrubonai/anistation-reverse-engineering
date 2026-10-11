package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ew4 {
    public static final ew4 c = new ew4();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final i75 a = new i75((byte) 2);

    public final zb5 a(Class cls) {
        boolean z;
        zz1 zz1Var;
        zb5 w;
        Class cls2;
        y13.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        zb5 zb5Var = (zb5) concurrentHashMap.get(cls);
        if (zb5Var == null) {
            Class cls3 = cc5.a;
            zz1 zz1Var2 = null;
            if (!vd2.class.isAssignableFrom(cls) && (cls2 = cc5.a) != null && !cls2.isAssignableFrom(cls)) {
                ze0.k("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
            ey4 a = ((wm3) this.a.y).a(cls);
            if ((a.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (vd2.class.isAssignableFrom(cls)) {
                    w = new dy3(cc5.c, b02.a, a.a);
                } else {
                    fo6 fo6Var = cc5.b;
                    zz1 zz1Var3 = b02.b;
                    if (zz1Var3 != null) {
                        w = new dy3(fo6Var, zz1Var3, a.a);
                    } else {
                        ze0.m("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (vd2.class.isAssignableFrom(cls)) {
                p94 p94Var = r94.b;
                di3 di3Var = ei3.b;
                fo6 fo6Var2 = cc5.c;
                if (h11.B(a.a()) != 1) {
                    zz1Var2 = b02.a;
                }
                w = cy3.w(a, p94Var, di3Var, fo6Var2, zz1Var2, ln3.b);
            } else {
                p94 p94Var2 = r94.a;
                di3 di3Var2 = ei3.a;
                fo6 fo6Var3 = cc5.b;
                if (h11.B(a.a()) != 1) {
                    zz1 zz1Var4 = b02.b;
                    if (zz1Var4 != null) {
                        zz1Var = zz1Var4;
                    } else {
                        ze0.m("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    zz1Var = null;
                }
                w = cy3.w(a, p94Var2, di3Var2, fo6Var3, zz1Var, ln3.a);
            }
            zb5 zb5Var2 = (zb5) concurrentHashMap.putIfAbsent(cls, w);
            if (zb5Var2 != null) {
                return zb5Var2;
            }
            return w;
        }
        return zb5Var;
    }
}
