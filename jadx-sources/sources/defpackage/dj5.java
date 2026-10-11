package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class dj5 {
    public static final au4 a(String str) {
        xt4 xt4Var = xt4.i;
        if (!uz5.V(str)) {
            Object it = ((fh0) bu4.a.values()).iterator();
            while (((zm3) it).hasNext()) {
                x73 x73Var = (x73) ((xm3) it).next();
                if (str.equals(x73Var.getDescriptor().a())) {
                    StringBuilder n = h11.n("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                    n.append(z05.a(x73Var.getClass()).f());
                    n.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                    ze0.k(vz5.u(n.toString()));
                    return null;
                }
            }
            return new au4(str, xt4Var);
        }
        ze0.k("Blank serial names are prohibited");
        return null;
    }

    public static /* synthetic */ aj5 b(String str, hj5 hj5Var, aj5[] aj5VarArr) {
        return buildSerialDescriptor(str, hj5Var, aj5VarArr, new tg5((byte) 4));
    }

    public static final aj5 buildSerialDescriptor(String str, hj5 hj5Var, aj5[] aj5VarArr, ub2 ub2Var) {
        str.getClass();
        hj5Var.getClass();
        aj5VarArr.getClass();
        ub2Var.getClass();
        if (!uz5.V(str)) {
            if (!hj5Var.equals(f06.a)) {
                jm0 jm0Var = new jm0(str);
                ub2Var.invoke(jm0Var);
                return new cj5(str, hj5Var, jm0Var.c.size(), ms.S0(aj5VarArr), jm0Var);
            }
            ze0.k("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        ze0.k("Blank serial names are prohibited");
        return null;
    }

    public static final aj5 listSerialDescriptor(aj5 aj5Var) {
        aj5Var.getClass();
        return new zr(aj5Var, false);
    }

    public static final aj5 mapSerialDescriptor(aj5 aj5Var, aj5 aj5Var2) {
        aj5Var.getClass();
        aj5Var2.getClass();
        return new xj2("kotlin.collections.HashMap", aj5Var, aj5Var2);
    }

    public static final aj5 setSerialDescriptor(aj5 aj5Var) {
        aj5Var.getClass();
        return new zr(aj5Var, (byte) 2, false);
    }

    public static final <T> aj5 listSerialDescriptor() {
        a34.r0();
        throw null;
    }

    public static final <T> aj5 setSerialDescriptor() {
        a34.r0();
        throw null;
    }

    public static final <K, V> aj5 mapSerialDescriptor() {
        a34.r0();
        throw null;
    }

    public static /* synthetic */ void getNonNullOriginal$annotations(aj5 aj5Var) {
    }
}
