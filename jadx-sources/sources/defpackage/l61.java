package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface l61 {
    float A();

    double C();

    gu0 c(aj5 aj5Var);

    boolean decodeNotNullMark();

    Void decodeNull();

    default <T> T decodeNullableSerializableValue(ne1 ne1Var) {
        ne1Var.getClass();
        if (!ne1Var.getDescriptor().c() && !decodeNotNullMark()) {
            return (T) decodeNull();
        }
        return (T) f(ne1Var);
    }

    boolean e();

    default Object f(ne1 ne1Var) {
        ne1Var.getClass();
        return ne1Var.deserialize(this);
    }

    char g();

    int n();

    l61 q(aj5 aj5Var);

    String s();

    int t(aj5 aj5Var);

    long u();

    byte x();

    short z();
}
