package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1072a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f1073b;

    public b(HashMap hashMap) {
        this.f1073b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            n nVar = (n) entry.getValue();
            List list = (List) this.f1072a.get(nVar);
            if (list == null) {
                list = new ArrayList();
                this.f1072a.put(nVar, list);
            }
            list.add((c) entry.getKey());
        }
    }

    public static void a(List list, u uVar, n nVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                cVar.getClass();
                try {
                    int i10 = cVar.f1076a;
                    Method method = cVar.f1077b;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                method.invoke(obj, uVar, nVar);
                            }
                        } else {
                            method.invoke(obj, uVar);
                        }
                    } else {
                        method.invoke(obj, new Object[0]);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
