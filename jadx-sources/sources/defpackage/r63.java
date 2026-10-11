package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class r63 extends n1 {
    public final h63 f;
    public final aj5 g;
    public int h;
    public boolean i;

    public r63(y43 y43Var, h63 h63Var, String str, int i) {
        super(y43Var, (i & 4) != 0 ? null : str);
        this.f = h63Var;
        this.g = null;
    }

    @Override // defpackage.n1
    public q53 O(String str) {
        str.getClass();
        return (q53) vn3.Q(str, S());
    }

    @Override // defpackage.n1
    public String Q(aj5 aj5Var, int i) {
        Object obj;
        aj5Var.getClass();
        y43 y43Var = this.c;
        m37.B(y43Var, aj5Var);
        String f = aj5Var.f(i);
        if (this.e.j && !S().x.keySet().contains(f)) {
            cn7 cn7Var = y43Var.c;
            i18 i18Var = m37.e;
            va1 va1Var = new va1(aj5Var, y43Var, (byte) 13);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cn7Var.x;
            Map map = (Map) concurrentHashMap.get(aj5Var);
            Object obj2 = null;
            if (map != null) {
                obj = map.get(i18Var);
            } else {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
            if (obj == null) {
                obj = va1Var.invoke();
                Object obj3 = concurrentHashMap.get(aj5Var);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(aj5Var, obj3);
                }
                ((Map) obj3).put(i18Var, obj);
            }
            Map map2 = (Map) obj;
            Iterator it = S().x.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj2 = next;
                    break;
                }
            }
            String str = (String) obj2;
            if (str != null) {
                return str;
            }
        }
        return f;
    }

    @Override // defpackage.n1
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public h63 S() {
        return this.f;
    }

    @Override // defpackage.n1, defpackage.gu0
    public void a(aj5 aj5Var) {
        Object obj;
        Set set;
        Set X;
        aj5Var.getClass();
        y43 y43Var = this.c;
        if (!m37.s(y43Var, aj5Var) && !(aj5Var.getKind() instanceof er4)) {
            m37.B(y43Var, aj5Var);
            String str = null;
            if (!this.e.j) {
                X = db.s(aj5Var);
            } else {
                Set s = db.s(aj5Var);
                cn7 cn7Var = y43Var.c;
                i18 i18Var = m37.e;
                Map map = (Map) ((ConcurrentHashMap) cn7Var.x).get(aj5Var);
                if (map != null) {
                    obj = map.get(i18Var);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    obj = null;
                }
                Map map2 = (Map) obj;
                if (map2 != null) {
                    set = map2.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = tt1.x;
                }
                X = el5.X(s, set);
            }
            for (String str2 : S().x.keySet()) {
                if (!X.contains(str2) && !a34.i(str2, this.d)) {
                    String g = qx1.g('\'', "Encountered an unknown key '", str2);
                    String T = T();
                    if (y43Var.a.l) {
                        str = iv.I(S().toString(), -1).toString();
                    }
                    throw new o53(iv.v(-1, g, T, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", str));
                }
            }
        }
    }

    @Override // defpackage.n1, defpackage.l61
    public final gu0 c(aj5 aj5Var) {
        String str;
        aj5Var.getClass();
        aj5 aj5Var2 = this.g;
        if (aj5Var == aj5Var2) {
            q53 P = P();
            String a = aj5Var2.a();
            boolean z = P instanceof h63;
            y43 y43Var = this.c;
            if (!z) {
                String str2 = "Expected " + z05.a(h63.class).f() + ", but had " + z05.a(P.getClass()).f() + " as the serialized body of " + a;
                String T = T();
                if (y43Var.a.l) {
                    str = iv.I(P.toString(), -1).toString();
                } else {
                    str = null;
                }
                throw new o53(iv.v(-1, str2, T, null, str));
            }
            return new r63(y43Var, (h63) P, this.d, aj5Var2);
        }
        return super.c(aj5Var);
    }

    @Override // defpackage.n1, defpackage.l61
    public final boolean decodeNotNullMark() {
        if (!this.i && super.decodeNotNullMark()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gu0
    public int i(aj5 aj5Var) {
        aj5Var.getClass();
        while (this.h < aj5Var.e()) {
            int i = this.h;
            this.h = i + 1;
            String R = R(aj5Var, i);
            boolean z = true;
            int i2 = this.h - 1;
            this.i = false;
            if (!S().containsKey(R)) {
                if (this.c.a.f || aj5Var.i(i2) || !aj5Var.h(i2).c()) {
                    z = false;
                }
                this.i = z;
                if (z) {
                }
            }
            return i2;
        }
        return -1;
    }

    public r63(y43 y43Var, h63 h63Var, String str, aj5 aj5Var) {
        super(y43Var, str);
        this.f = h63Var;
        this.g = aj5Var;
    }
}
