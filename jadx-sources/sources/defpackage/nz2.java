package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class nz2 {
    public e41 a(ArrayList arrayList) {
        i75 i75Var = new i75((byte) 13);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Map unmodifiableMap = Collections.unmodifiableMap(((e41) obj).a);
            unmodifiableMap.getClass();
            linkedHashMap.putAll(unmodifiableMap);
        }
        i75Var.s(linkedHashMap);
        return i75Var.f();
    }
}
