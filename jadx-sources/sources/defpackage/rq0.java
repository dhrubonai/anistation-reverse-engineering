package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rq0 extends g2 {
    public final Object x;
    public int y;
    public final /* synthetic */ sq0 z;

    public rq0(sq0 sq0Var, int i) {
        this.z = sq0Var;
        Object obj = sq0.G;
        this.x = sq0Var.j()[i];
        this.y = i;
    }

    public final void a() {
        int i = this.y;
        Object obj = this.x;
        sq0 sq0Var = this.z;
        if (i != -1 && i < sq0Var.size()) {
            if (tl7.r(obj, sq0Var.j()[this.y])) {
                return;
            }
        }
        Object obj2 = sq0.G;
        this.y = sq0Var.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.x;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        sq0 sq0Var = this.z;
        Map c = sq0Var.c();
        if (c != null) {
            return c.get(this.x);
        }
        a();
        int i = this.y;
        if (i == -1) {
            return null;
        }
        return sq0Var.k()[i];
    }

    @Override // defpackage.g2, java.util.Map.Entry
    public final Object setValue(Object obj) {
        sq0 sq0Var = this.z;
        Map c = sq0Var.c();
        Object obj2 = this.x;
        if (c != null) {
            return c.put(obj2, obj);
        }
        a();
        int i = this.y;
        if (i == -1) {
            sq0Var.put(obj2, obj);
            return null;
        }
        Object obj3 = sq0Var.k()[i];
        sq0Var.k()[this.y] = obj;
        return obj3;
    }
}
