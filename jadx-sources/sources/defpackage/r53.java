package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class r53 {
    public static final aj5 a = bz2.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", mz5.a);

    public static final l63 a(q53 q53Var) {
        l63 l63Var;
        if (q53Var instanceof l63) {
            l63Var = (l63) q53Var;
        } else {
            l63Var = null;
        }
        if (l63Var != null) {
            return l63Var;
        }
        throw new IllegalArgumentException("Element " + z05.a(q53Var.getClass()) + " is not a JsonPrimitive");
    }

    public static final long b(l63 l63Var) {
        int i;
        String str;
        gz5 a2 = hz5.a(y43.d, l63Var.b());
        String str2 = a2.D;
        long k = a2.k();
        if (a2.h() != 10) {
            int i2 = a2.y;
            if (i2 > 0) {
                i = i2 - 1;
            } else {
                i = i2;
            }
            if (i2 != str2.length() && i >= 0) {
                str = String.valueOf(str2.charAt(i));
            } else {
                str = "EOF";
            }
            m1.u(a2, qx1.m("Expected input to contain a single valid number, but got '", str, "' after it"), i, null, 4);
            throw null;
        }
        return k;
    }
}
