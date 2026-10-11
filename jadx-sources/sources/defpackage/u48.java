package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u48 {
    public final HashMap a;
    public final HashMap b;
    public final ArrayList c;

    public u48(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v58 v58Var = (v58) it.next();
            if (TextUtils.isEmpty(v58Var.d())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                v58 v58Var2 = (v58) this.a.put(v58Var.d(), v58Var);
                if (v58Var2 != null) {
                    String canonicalName = v58Var2.getClass().getCanonicalName();
                    String canonicalName2 = v58Var.getClass().getCanonicalName();
                    ze0.k(h11.l(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                    throw null;
                }
            }
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            this.c.addAll(list);
            return;
        }
        throw qx1.f(it2);
    }

    public final Object a(Uri uri, s48 s48Var) {
        return s48Var.c(b(uri));
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [q48, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [q48, java.lang.Object] */
    public final q48 b(Uri uri) {
        List list;
        jw2 k = nw2.k();
        jw2 k2 = nw2.k();
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment) && encodedFragment.startsWith("transform=")) {
            String substring = encodedFragment.substring(10);
            i90 d = i90.d("+");
            list = nw2.n(new qw5(new i90((rw5) d.d, true, (cl0) d.c, d.a), substring));
        } else {
            list = o15.B;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            Matcher matcher = p58.a.matcher(str);
            if (matcher.matches()) {
                k2.c(matcher.group(1));
            } else {
                ze0.k("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
        }
        o15 g = k2.g();
        if (g.A <= 0) {
            nw2 v = k.g().v();
            ?? obj = new Object();
            String scheme = uri.getScheme();
            v58 v58Var = (v58) this.a.get(scheme);
            if (v58Var != null) {
                obj.a = v58Var;
                obj.c = this.c;
                obj.b = v;
                if (!v.isEmpty()) {
                    ArrayList arrayList = new ArrayList(uri.getPathSegments());
                    if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                        String str2 = (String) arrayList.get(arrayList.size() - 1);
                        ListIterator listIterator = v.listIterator(v.size());
                        while (listIterator.hasPrevious()) {
                            if (listIterator.previous() != null) {
                                ov3.d();
                                return null;
                            }
                        }
                        arrayList.set(arrayList.size() - 1, str2);
                        uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
                    }
                }
                obj.d = uri;
                ?? obj2 = new Object();
                obj2.a = obj.a;
                obj2.b = obj.b;
                obj2.c = obj.c;
                obj2.d = obj.d;
                return obj2;
            }
            throw new IOException(zo5.l("Requested backend isn't registered: ", scheme));
        }
        String str3 = (String) g.get(0);
        if (this.b.get(str3) != null) {
            ov3.d();
            return null;
        }
        String valueOf = String.valueOf(uri);
        throw new IOException(h11.l(new StringBuilder(str3.length() + 40 + valueOf.length()), "Requested transform isn't registered: ", str3, ": ", valueOf));
    }
}
