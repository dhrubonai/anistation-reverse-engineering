package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a94 {
    public final LinkedHashMap a;

    public a94(b94 b94Var) {
        Map map = b94Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), yo0.K0((Collection) entry.getValue()));
        }
        this.a = linkedHashMap;
    }

    public void a(oy3 oy3Var) {
        oy3Var.getClass();
        int i = oy3Var.startVersion;
        int i2 = oy3Var.endVersion;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i2)) + " with " + oy3Var);
        }
        treeMap.put(Integer.valueOf(i2), oy3Var);
    }

    public void b(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.a.put(lowerCase, te4.J(str));
    }

    public a94() {
        this.a = new LinkedHashMap();
    }
}
