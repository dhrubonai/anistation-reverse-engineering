package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ub8 extends pc7 {
    public final Map b;

    public ub8(rv5 rv5Var, rv5 rv5Var2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, rv5Var);
        d(linkedHashMap, rv5Var2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((ia8) entry.getKey()).c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, rv5 rv5Var) {
        for (int i = 0; i < rv5Var.h(); i++) {
            ia8 j = rv5Var.j(i);
            Object obj = linkedHashMap.get(j);
            boolean z = j.c;
            Class cls = j.b;
            if (z) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(j, list);
                }
                list.add(cls.cast(rv5Var.k(i)));
            } else {
                linkedHashMap.put(j, cls.cast(rv5Var.k(i)));
            }
        }
    }

    @Override // defpackage.pc7
    public final void a(jb8 jb8Var, ab8 ab8Var) {
        for (Map.Entry entry : this.b.entrySet()) {
            ia8 ia8Var = (ia8) entry.getKey();
            Object value = entry.getValue();
            if (ia8Var.c) {
                jb8Var.b(ia8Var, ((List) value).iterator(), ab8Var);
            } else {
                jb8Var.a(ia8Var, value, ab8Var);
            }
        }
    }

    @Override // defpackage.pc7
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.pc7
    public final Set c() {
        return this.b.keySet();
    }
}
