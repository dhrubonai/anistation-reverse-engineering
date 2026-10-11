package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h75 extends wa3 {
    public static final h75 c = new h75("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h75(String str, byte b) {
        super(str);
        this.b = b;
    }

    @Override // defpackage.vo3
    public final wo3 b(xo3 xo3Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                ot1 ot1Var = ot1.x;
                if (size != 0) {
                    if (size != 1) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size2 = list.size();
                        int i = 0;
                        int i2 = 0;
                        for (int i3 = 0; i3 < size2; i3++) {
                            em4 p = ((ro3) list.get(i3)).p(j);
                            i = Math.max(p.x, i);
                            i2 = Math.max(p.y, i2);
                            arrayList.add(p);
                        }
                        return xo3Var.L(sx0.g(i, j), sx0.f(i2, j), ot1Var, new xb(arrayList, (byte) 3));
                    }
                    em4 p2 = ((ro3) list.get(0)).p(j);
                    return xo3Var.L(sx0.g(p2.x, j), sx0.f(p2.y, j), ot1Var, new r0(p2, (byte) 12));
                }
                return xo3Var.L(rx0.j(j), rx0.i(j), ot1Var, new rs4((byte) 10));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
