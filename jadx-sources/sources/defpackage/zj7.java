package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class zj7 implements ik7, uj7 {
    public final HashMap x = new HashMap();

    @Override // defpackage.uj7
    public final ik7 b(String str) {
        HashMap hashMap = this.x;
        if (hashMap.containsKey(str)) {
            return (ik7) hashMap.get(str);
        }
        return ik7.p;
    }

    @Override // defpackage.ik7
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // defpackage.ik7
    public final String d() {
        return "[object Object]";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj7)) {
            return false;
        }
        return this.x.equals(((zj7) obj).x);
    }

    @Override // defpackage.ik7
    public final Iterator f() {
        return new nj7(this.x.keySet().iterator());
    }

    @Override // defpackage.uj7
    public final void g(String str, ik7 ik7Var) {
        HashMap hashMap = this.x;
        if (ik7Var == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, ik7Var);
        }
    }

    @Override // defpackage.ik7
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // defpackage.ik7
    public ik7 i(String str, vs7 vs7Var, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new tk7(toString());
        }
        return uj7.j(this, new tk7(str), vs7Var, arrayList);
    }

    @Override // defpackage.uj7
    public final boolean k(String str) {
        return this.x.containsKey(str);
    }

    @Override // defpackage.ik7
    public final ik7 m() {
        zj7 zj7Var = new zj7();
        for (Map.Entry entry : this.x.entrySet()) {
            boolean z = entry.getValue() instanceof uj7;
            HashMap hashMap = zj7Var.x;
            if (z) {
                hashMap.put((String) entry.getKey(), (ik7) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((ik7) entry.getValue()).m());
            }
        }
        return zj7Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.x;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
