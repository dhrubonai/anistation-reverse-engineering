package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gi3 implements ic2 {
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ ic2 y;

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        n95 n95Var;
        byte b = this.x;
        ic2 ic2Var = this.y;
        switch (b) {
            case 0:
                i95 i95Var = (i95) obj;
                List list = (List) ic2Var.invoke(i95Var, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (obj3 != null && (n95Var = i95Var.y) != null && !n95Var.b(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (!list.isEmpty()) {
                    return new ArrayList(list);
                }
                return null;
            default:
                ((Integer) obj2).getClass();
                i66.c(ic2Var, (kd2) obj, kb0.N(1));
                return pn6.a;
        }
    }

    public /* synthetic */ gi3(ic2 ic2Var) {
        this.y = ic2Var;
    }
}
