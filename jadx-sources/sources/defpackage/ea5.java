package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ea5 {
    public final rq3 a;
    public l05 b;

    public ea5(rq3 rq3Var) {
        this.a = rq3Var;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        rq3 rq3Var = this.a;
        if (rq3Var.b) {
            Bundle bundle2 = (Bundle) rq3Var.h;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                bundle = v94.x(bundle2, str);
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                rq3Var.h = null;
            }
            return bundle;
        }
        ze0.m("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        return null;
    }

    public final da5 b(String str) {
        da5 da5Var;
        rq3 rq3Var = this.a;
        synchronized (((og5) rq3Var.f)) {
            Iterator it = ((LinkedHashMap) rq3Var.g).entrySet().iterator();
            do {
                da5Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                da5 da5Var2 = (da5) entry.getValue();
                if (a34.i(str2, str)) {
                    da5Var = da5Var2;
                }
            } while (da5Var == null);
        }
        return da5Var;
    }

    public final void c(String str, da5 da5Var) {
        rq3 rq3Var = this.a;
        synchronized (((og5) rq3Var.f)) {
            if (!((LinkedHashMap) rq3Var.g).containsKey(str)) {
                ((LinkedHashMap) rq3Var.g).put(str, da5Var);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public final void d() {
        if (this.a.c) {
            l05 l05Var = this.b;
            if (l05Var == null) {
                l05Var = new l05(this);
            }
            this.b = l05Var;
            try {
                sf3.class.getDeclaredConstructor(null);
                l05 l05Var2 = this.b;
                if (l05Var2 != null) {
                    l05Var2.a.add(sf3.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + sf3.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        ze0.m("Can not perform this action after onSaveInstanceState");
    }
}
