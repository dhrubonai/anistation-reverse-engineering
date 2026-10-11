package defpackage;

import android.content.Intent;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface at3 {
    static ii3 e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ar3) it.next()).b == null) {
                return wc7.v(new UnsupportedOperationException());
            }
        }
        return wc7.w(list);
    }

    default boolean a(ft3 ft3Var, dt3 dt3Var, Intent intent) {
        return false;
    }
}
