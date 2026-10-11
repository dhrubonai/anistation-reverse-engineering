package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lm0 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public lm0(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            dg3 dg3Var = (dg3) entry.getValue();
            List list = (List) this.a.get(dg3Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(dg3Var, list);
            }
            list.add((mm0) entry.getKey());
        }
    }

    public static void a(List list, og3 og3Var, dg3 dg3Var, ng3 ng3Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                mm0 mm0Var = (mm0) list.get(size);
                Method method = mm0Var.b;
                try {
                    int i = mm0Var.a;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                method.invoke(ng3Var, og3Var, dg3Var);
                            }
                        } else {
                            method.invoke(ng3Var, og3Var);
                        }
                    } else {
                        method.invoke(ng3Var, null);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    ov3.k("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
