package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class tq2 extends ea1 {
    @Override // defpackage.ea1
    public final Object a(Object obj) {
        mk2 mk2Var = (mk2) obj;
        ArrayList arrayList = mk2Var.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            vq2.a.i0((int[]) obj2);
        }
        arrayList.clear();
        return mk2Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [mk2, java.lang.Object] */
    @Override // defpackage.ea1
    public final Object l() {
        ?? obj = new Object();
        obj.a = new ArrayList();
        return obj;
    }
}
