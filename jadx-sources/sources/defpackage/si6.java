package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface si6 {
    Object a();

    default boolean b(Object obj, Object obj2) {
        if (obj.equals(a()) && obj2.equals(c())) {
            return true;
        }
        return false;
    }

    Object c();
}
