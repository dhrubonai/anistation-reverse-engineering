package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface as0 {
    default Object b(Class cls) {
        return l(px4.a(cls));
    }

    default Set d(px4 px4Var) {
        return (Set) j(px4Var).get();
    }

    default ow4 f(Class cls) {
        return k(px4.a(cls));
    }

    ow4 j(px4 px4Var);

    ow4 k(px4 px4Var);

    default Object l(px4 px4Var) {
        ow4 k = k(px4Var);
        if (k == null) {
            return null;
        }
        return k.get();
    }
}
