package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class jb0 {
    public static final <T, E extends T> x73 ArraySerializer(e73 e73Var, x73 x73Var) {
        e73Var.getClass();
        x73Var.getClass();
        return new y05(e73Var, x73Var);
    }

    public static final x73 NothingSerializer() {
        return za4.a;
    }

    public static final x73 UByteArraySerializer() {
        return vl6.c;
    }

    public static final x73 UIntArraySerializer() {
        return am6.c;
    }

    public static final x73 ULongArraySerializer() {
        return fm6.c;
    }

    public static final x73 UShortArraySerializer() {
        return nm6.c;
    }

    public static final x73 a(x73 x73Var) {
        x73Var.getClass();
        if (x73Var.getDescriptor().c()) {
            return x73Var;
        }
        return new wb4(x73Var);
    }

    public static final <T, E extends T> x73 ArraySerializer(x73 x73Var) {
        x73Var.getClass();
        a34.r0();
        throw null;
    }
}
