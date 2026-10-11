package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nd3 implements Comparator {
    public final /* synthetic */ byte x;
    public final /* synthetic */ eb2 y;

    public /* synthetic */ nd3(eb2 eb2Var, byte b) {
        this.x = b;
        this.y = eb2Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.x;
        eb2 eb2Var = this.y;
        switch (b) {
            case 0:
                return Integer.valueOf(eb2Var.l(((vd3) obj).getKey())).compareTo(Integer.valueOf(eb2Var.l(((vd3) obj2).getKey())));
            case 1:
                return Integer.valueOf(eb2Var.l(((vd3) obj).getKey())).compareTo(Integer.valueOf(eb2Var.l(((vd3) obj2).getKey())));
            case 2:
                return Integer.valueOf(eb2Var.l(((vd3) obj2).getKey())).compareTo(Integer.valueOf(eb2Var.l(((vd3) obj).getKey())));
            default:
                return Integer.valueOf(eb2Var.l(((vd3) obj2).getKey())).compareTo(Integer.valueOf(eb2Var.l(((vd3) obj).getKey())));
        }
    }
}
