package com.unity3d.ads.core.extensions;

import defpackage.db;
import defpackage.e13;
import defpackage.f13;
import defpackage.zo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class JSONArrayExtensionsKt {
    public static final Map<String, List<String>> getHeadersMap(JSONArray jSONArray) {
        jSONArray.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            obj.getClass();
            JSONArray jSONArray2 = (JSONArray) obj;
            List list = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (list == null) {
                list = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            string.getClass();
            list.add(string);
            linkedHashMap.put(jSONArray2.getString(0), list);
        }
        return linkedHashMap;
    }

    public static final Object[] toTypedArray(JSONArray jSONArray) {
        jSONArray.getClass();
        f13 r0 = db.r0(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(zo0.V(r0, 10));
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((e13) it).nextInt()));
        }
        return arrayList.toArray(new Object[0]);
    }
}
