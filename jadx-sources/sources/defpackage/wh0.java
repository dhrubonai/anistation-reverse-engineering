package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wh0 extends ls3 {
    public final /* synthetic */ ks3 a;
    public final /* synthetic */ w44 b;

    public wh0(rs3 rs3Var, ks3 ks3Var, w44 w44Var) {
        this.a = ks3Var;
        this.b = w44Var;
    }

    @Override // defpackage.ls3
    public final void a(rs3 rs3Var, qs3 qs3Var) {
        rs3Var.getClass();
        h();
    }

    @Override // defpackage.ls3
    public final void b(rs3 rs3Var, qs3 qs3Var) {
        rs3Var.getClass();
        h();
    }

    @Override // defpackage.ls3
    public final void e(rs3 rs3Var, qs3 qs3Var) {
        rs3Var.getClass();
        h();
    }

    public final void h() {
        rs3.b();
        ArrayList arrayList = rs3.c().i;
        arrayList.getClass();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qs3 qs3Var = (qs3) obj;
            if (qs3Var.e(this.a) && !qs3Var.c()) {
                arrayList2.add(obj);
            }
        }
        this.b.setValue(arrayList2);
    }
}
