package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface yv6 {
    default vv6 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default vv6 b(Class cls, o34 o34Var) {
        return a(cls);
    }

    default vv6 c(im0 im0Var, o34 o34Var) {
        return b(t80.M(im0Var), o34Var);
    }
}
