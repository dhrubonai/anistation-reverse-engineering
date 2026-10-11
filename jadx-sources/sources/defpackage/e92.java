package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e92 implements by0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e92(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.by0
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                f92 f92Var = (f92) obj;
                if (f92Var == null) {
                    f92Var = new f92(-3);
                }
                ((rt3) this.b).y(f92Var);
                return;
            default:
                f92 f92Var2 = (f92) obj;
                synchronized (g92.c) {
                    try {
                        so5 so5Var = g92.d;
                        ArrayList arrayList = (ArrayList) so5Var.get((String) this.b);
                        if (arrayList != null) {
                            so5Var.remove((String) this.b);
                            for (int i = 0; i < arrayList.size(); i++) {
                                ((by0) arrayList.get(i)).accept(f92Var2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
