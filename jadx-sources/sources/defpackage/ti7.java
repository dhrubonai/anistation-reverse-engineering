package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ti7 implements ik7, uj7 {
    public final String x;
    public final HashMap y = new HashMap();

    public ti7(String str) {
        this.x = str;
    }

    public abstract ik7 a(vs7 vs7Var, List list);

    @Override // defpackage.uj7
    public final ik7 b(String str) {
        HashMap hashMap = this.y;
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
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti7)) {
            return false;
        }
        ti7 ti7Var = (ti7) obj;
        String str = this.x;
        if (str == null) {
            return false;
        }
        return str.equals(ti7Var.x);
    }

    @Override // defpackage.ik7
    public final Iterator f() {
        return new nj7(this.y.keySet().iterator());
    }

    @Override // defpackage.uj7
    public final void g(String str, ik7 ik7Var) {
        HashMap hashMap = this.y;
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
        String str = this.x;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ik7
    public final ik7 i(String str, vs7 vs7Var, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new tk7(this.x);
        }
        return uj7.j(this, new tk7(str), vs7Var, arrayList);
    }

    @Override // defpackage.uj7
    public final boolean k(String str) {
        return this.y.containsKey(str);
    }

    @Override // defpackage.ik7
    public ik7 m() {
        return this;
    }
}
