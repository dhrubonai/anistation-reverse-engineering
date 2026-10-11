package defpackage;

import android.net.Uri;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mm2 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public boolean d;
    public final Object e;
    public AbstractCollection f;
    public AbstractCollection g;
    public Serializable h;
    public Object i;

    public mm2() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new HashMap();
        this.i = new WeakHashMap();
    }

    public static void e(HashMap hashMap, String str, String str2) {
        if (hashMap.containsKey(str) && !str2.equals(hashMap.get(str))) {
            throw bj4.b("The group ID " + str + " is associated with more than one pathway from variants");
        }
        hashMap.put(str, str2);
    }

    public nw2 a(List list, HashMap hashMap) {
        String str;
        mm2 mm2Var;
        boolean z = this.d;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        int i = 0;
        while (i < list.size()) {
            dm2 dm2Var = (dm2) list.get(i);
            Uri uri = dm2Var.a;
            nm2 nm2Var = new nm2(dm2Var.b, dm2Var.e, dm2Var.d);
            if (z) {
                str = (String) hashMap.get(dm2Var.c);
                if (str == null) {
                    mm2Var = this;
                    i++;
                    this = mm2Var;
                }
            } else {
                str = null;
            }
            String str2 = str;
            Uri uri2 = dm2Var.a;
            mm2Var = this;
            mm2Var.d(uri2, str2, i, arrayList, nm2Var, hashMap2, hashMap3);
            i++;
            this = mm2Var;
        }
        mm2 mm2Var2 = this;
        if (z) {
            om2 om2Var = (om2) ((nw2) mm2Var2.f).get(0);
            om2Var.getClass();
            zw2 a = om2Var.a();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (!((om2) arrayList.get(i2)).a().equals(a)) {
                    throw bj4.b("The set of available pathway IDs of a rendition redundant group is inconsistent with variant redundant groups");
                }
            }
        }
        return nw2.o(arrayList);
    }

    public nw2 b(int i) {
        fm2 fm2Var = (fm2) this.e;
        c();
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    nw2 nw2Var = (nw2) this.i;
                    if (nw2Var == null) {
                        nw2 a = a(fm2Var.h, this.c);
                        this.i = a;
                        return a;
                    }
                    return nw2Var;
                }
                ze0.k("Invalid type for creating rendition redundant group list");
                return null;
            }
            nw2 nw2Var2 = (nw2) this.h;
            if (nw2Var2 == null) {
                nw2 a2 = a(fm2Var.g, this.b);
                this.h = a2;
                return a2;
            }
            return nw2Var2;
        }
        nw2 nw2Var3 = (nw2) this.g;
        if (nw2Var3 == null) {
            nw2 a3 = a(fm2Var.f, this.a);
            this.g = a3;
            return a3;
        }
        return nw2Var3;
    }

    public void c() {
        boolean z = this.d;
        fm2 fm2Var = (fm2) this.e;
        if (((nw2) this.f) == null) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int i = 0;
            while (i < fm2Var.e.size()) {
                em2 em2Var = (em2) fm2Var.e.get(i);
                mm2 mm2Var = this;
                String d = mm2Var.d(em2Var.a, em2Var.g, i, arrayList, new nm2(em2Var.b, em2Var.h, null), hashMap, hashMap2);
                if (z) {
                    String str = em2Var.c;
                    if (str != null) {
                        e(mm2Var.a, str, d);
                    }
                    String str2 = em2Var.d;
                    if (str2 != null) {
                        e(mm2Var.b, str2, d);
                    }
                    String str3 = em2Var.e;
                    if (str3 != null) {
                        e(mm2Var.c, str3, d);
                    }
                }
                i++;
                this = mm2Var;
            }
            mm2 mm2Var2 = this;
            nw2 o = nw2.o(arrayList);
            mm2Var2.f = o;
            if (z) {
                om2 om2Var = (om2) o.get(0);
                om2Var.getClass();
                zw2 a = om2Var.a();
                for (int i2 = 1; i2 < ((nw2) mm2Var2.f).size(); i2++) {
                    if (!((om2) ((nw2) mm2Var2.f).get(i2)).a().equals(a)) {
                        throw bj4.b("The set of available pathway IDs is inconsistent among variant redundant groups");
                    }
                }
            }
        }
    }

    public String d(Uri uri, String str, int i, ArrayList arrayList, nm2 nm2Var, HashMap hashMap, HashMap hashMap2) {
        int i2;
        String str2;
        Integer num = (Integer) hashMap.get(nm2Var);
        boolean z = false;
        int i3 = 1;
        if (num == null) {
            if (str == null) {
                hashMap2.put(nm2Var, 1);
                str = ".";
            } else {
                hashMap2.put(nm2Var, 0);
            }
            om2 om2Var = new om2(nm2Var, str, uri, i);
            hashMap.put(nm2Var, Integer.valueOf(arrayList.size()));
            arrayList.add(om2Var);
            return str;
        }
        if (str == null) {
            Integer num2 = (Integer) hashMap2.get(nm2Var);
            num2.getClass();
            int intValue = num2.intValue();
            if (this.d && intValue >= 1) {
                throw bj4.b("At most one playlist URL within an HlsRedundantGroup can have an undefined pathway when Content Steering is enabled");
            }
            int i4 = intValue + 1;
            if (i4 <= 1) {
                if (i4 >= 0) {
                    z = true;
                }
                io3.k(i4, "invalid count: %s", z);
                if (i4 != 0) {
                    str2 = ".";
                } else {
                    str2 = "";
                }
            } else {
                long j = i4;
                int i5 = (int) j;
                if (i5 == j) {
                    char[] cArr = new char[i5];
                    ".".getChars(0, 1, cArr, 0);
                    while (true) {
                        i2 = i5 - i3;
                        if (i3 >= i2) {
                            break;
                        }
                        System.arraycopy(cArr, 0, cArr, i3, i3);
                        i3 <<= 1;
                    }
                    System.arraycopy(cArr, 0, cArr, i3, i2);
                    str2 = new String(cArr);
                } else {
                    throw new ArrayIndexOutOfBoundsException(h11.h(j, "Required array size too large: "));
                }
            }
            hashMap2.put(nm2Var, Integer.valueOf(i4));
            str = str2;
        }
        om2 om2Var2 = (om2) arrayList.get(num.intValue());
        Uri uri2 = (Uri) om2Var2.b.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw bj4.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup");
        }
        om2Var2.b.put(str, uri);
        if (i != -1) {
            om2Var2.c.add(Integer.valueOf(i));
        }
        return str;
    }

    public mm2(fm2 fm2Var) {
        this.e = fm2Var;
        this.d = fm2Var.n != null;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
    }
}
