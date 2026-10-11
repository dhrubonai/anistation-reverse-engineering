package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class f5 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        v4 v4Var;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        c5 c5Var = (c5) this.e.get(str);
        if (c5Var != null) {
            v4Var = c5Var.a;
        } else {
            v4Var = null;
        }
        if (v4Var != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c5Var.a.c(c5Var.b.c(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new u4(i2, intent));
        return true;
    }

    public abstract void b(int i, x4 x4Var, Object obj);

    public final void c(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        byte b = 2;
        t tVar = new t(b);
        Iterator it = ((fx0) wi5.p0(new u22(tVar, new pz3((Object) tVar, (byte) 27), b))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        p65.h("Sequence contains no element matching the predicate.");
    }

    public final void d(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder n = h11.n("Dropping pending result for request ", str, ": ");
            n.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", n.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((u4) nx7.G(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        d5 d5Var = (d5) linkedHashMap2.get(str);
        if (d5Var != null) {
            ArrayList arrayList = d5Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                d5Var.a.b((lg3) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
