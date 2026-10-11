package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xq0 implements Comparator {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ xq0(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.x;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                for (ub2 ub2Var : (ub2[]) obj3) {
                    int s = jf7.s((Comparable) ub2Var.invoke(obj), (Comparable) ub2Var.invoke(obj2));
                    if (s != 0) {
                        return s;
                    }
                }
                return 0;
            default:
                tp3 tp3Var = (tp3) obj3;
                return tp3Var.b(obj2) - tp3Var.b(obj);
        }
    }
}
