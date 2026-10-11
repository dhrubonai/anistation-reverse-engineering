package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface hu0 {
    void a(aj5 aj5Var);

    <T> void encodeNullableSerializableElement(aj5 aj5Var, int i, mj5 mj5Var, T t);

    default boolean shouldEncodeElementDefault(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return true;
    }
}
