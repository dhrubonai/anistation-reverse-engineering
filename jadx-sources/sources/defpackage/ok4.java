package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ok4 implements c25 {
    public final Set x;
    public final z44 y = new z44(new od2[16], 0);

    public ok4(Set set) {
        this.x = set;
    }

    @Override // defpackage.c25
    public final void c() {
        z44 z44Var = this.y;
        Object[] objArr = z44Var.x;
        int i = z44Var.z;
        for (int i2 = 0; i2 < i; i2++) {
            c25 c25Var = ((od2) objArr[i2]).a;
            this.x.remove(c25Var);
            c25Var.c();
        }
    }

    @Override // defpackage.c25
    public final void a() {
    }

    @Override // defpackage.c25
    public final void b() {
    }
}
