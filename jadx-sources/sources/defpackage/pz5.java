package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface pz5 {
    static {
        int i = oz5.a;
    }

    Set a();

    default void b(ic2 ic2Var) {
        for (Map.Entry entry : a()) {
            ic2Var.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    boolean c();

    List d(String str);

    default String get(String str) {
        List d = d(str);
        if (d != null) {
            return (String) yo0.m0(d);
        }
        return null;
    }

    boolean isEmpty();

    Set names();
}
