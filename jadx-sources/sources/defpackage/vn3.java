package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class vn3 extends kb0 {
    public static Object Q(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static HashMap R(ai4... ai4VarArr) {
        HashMap hashMap = new HashMap(S(ai4VarArr.length));
        X(hashMap, ai4VarArr);
        return hashMap;
    }

    public static int S(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map T(ai4... ai4VarArr) {
        if (ai4VarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(S(ai4VarArr.length));
            X(linkedHashMap, ai4VarArr);
            return linkedHashMap;
        }
        return ot1.x;
    }

    public static LinkedHashMap U(ai4... ai4VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(S(ai4VarArr.length));
        X(linkedHashMap, ai4VarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap V(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map W(Map map, ai4 ai4Var) {
        Object obj = ai4Var.y;
        Object obj2 = ai4Var.x;
        map.getClass();
        if (map.isEmpty()) {
            Map singletonMap = Collections.singletonMap(obj2, obj);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(obj2, obj);
        return linkedHashMap;
    }

    public static final void X(HashMap hashMap, ai4[] ai4VarArr) {
        for (ai4 ai4Var : ai4VarArr) {
            hashMap.put(ai4Var.x, ai4Var.y);
        }
    }

    public static Map Y(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(S(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    ai4 ai4Var = (ai4) obj;
                    linkedHashMap.put(ai4Var.x, ai4Var.y);
                }
                return linkedHashMap;
            }
            ai4 ai4Var2 = (ai4) arrayList.get(0);
            ai4Var2.getClass();
            Map singletonMap = Collections.singletonMap(ai4Var2.x, ai4Var2.y);
            singletonMap.getClass();
            return singletonMap;
        }
        return ot1.x;
    }

    public static Map Z(Map map) {
        map.getClass();
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return new LinkedHashMap(map);
            }
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            singletonMap.getClass();
            return singletonMap;
        }
        return ot1.x;
    }
}
