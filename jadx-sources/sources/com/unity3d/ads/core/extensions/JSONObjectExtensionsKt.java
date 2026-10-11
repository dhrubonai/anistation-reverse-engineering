package com.unity3d.ads.core.extensions;

import defpackage.fx0;
import defpackage.ni5;
import defpackage.wi5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class JSONObjectExtensionsKt {
    public static final Map<String, Object> toBuiltInMap(JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        ni5 o0 = wi5.o0(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((fx0) o0).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object opt = jSONObject.opt((String) next);
            if (opt == null || String.valueOf(opt).equals("undefined") || String.valueOf(opt).equals("null")) {
                opt = null;
            }
            linkedHashMap.put(next, opt);
        }
        return linkedHashMap;
    }
}
