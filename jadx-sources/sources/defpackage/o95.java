package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o95 implements n95 {
    public final ub2 x;
    public final p44 y;
    public p44 z;

    public o95(Map map, ub2 ub2Var) {
        p44 p44Var;
        this.x = ub2Var;
        if (map != null && !map.isEmpty()) {
            p44Var = new p44(map.size());
            for (Map.Entry entry : map.entrySet()) {
                p44Var.n(entry.getKey(), entry.getValue());
            }
        } else {
            p44Var = null;
        }
        this.y = p44Var;
    }

    @Override // defpackage.n95
    public final m95 a(String str, sb2 sb2Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!t80.c0(str.charAt(i))) {
                p44 p44Var = this.z;
                if (p44Var == null) {
                    long[] jArr = cb5.a;
                    p44Var = new p44();
                    this.z = p44Var;
                }
                Object g = p44Var.g(str);
                if (g == null) {
                    g = new ArrayList();
                    p44Var.n(str, g);
                }
                ((List) g).add(sb2Var);
                return new st3(p44Var, str, sb2Var);
            }
        }
        ze0.k("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.n95
    public final boolean b(Object obj) {
        return ((Boolean) this.x.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // defpackage.n95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map c() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o95.c():java.util.Map");
    }

    @Override // defpackage.n95
    public final Object d(String str) {
        List list;
        p44 p44Var = this.y;
        if (p44Var != null) {
            list = (List) p44Var.l(str);
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && p44Var != null) {
            List subList = list.subList(1, list.size());
            int f = p44Var.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = p44Var.c;
            Object obj = objArr[f];
            p44Var.b[f] = str;
            objArr[f] = subList;
        }
        return list.get(0);
    }
}
