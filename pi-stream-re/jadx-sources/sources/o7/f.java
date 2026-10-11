package o7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import r6.h0;
import x6.p;

/* loaded from: classes.dex */
public abstract class f extends h0 {
    public static final Map g1(w6.b... bVarArr) {
        if (bVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(h0.m0(bVarArr.length));
            for (w6.b bVar : bVarArr) {
                linkedHashMap.put(bVar.f11012a, bVar.f11013b);
            }
            return linkedHashMap;
        }
        return p.f11319a;
    }

    public static final Map h1(ArrayList arrayList) {
        p pVar = p.f11319a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(h0.m0(arrayList.size()));
                i1(arrayList, linkedHashMap);
                return linkedHashMap;
            }
            w6.b bVar = (w6.b) arrayList.get(0);
            h0.u(bVar, "pair");
            Map singletonMap = Collections.singletonMap(bVar.f11012a, bVar.f11013b);
            h0.s(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        return pVar;
    }

    public static final void i1(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w6.b bVar = (w6.b) it.next();
            linkedHashMap.put(bVar.f11012a, bVar.f11013b);
        }
    }
}
