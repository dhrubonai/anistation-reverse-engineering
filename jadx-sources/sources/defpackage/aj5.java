package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface aj5 {
    String a();

    default boolean c() {
        return false;
    }

    int d(String str);

    int e();

    String f(int i);

    List g(int i);

    default List getAnnotations() {
        return nt1.x;
    }

    hj5 getKind();

    aj5 h(int i);

    boolean i(int i);

    default boolean isInline() {
        return false;
    }
}
