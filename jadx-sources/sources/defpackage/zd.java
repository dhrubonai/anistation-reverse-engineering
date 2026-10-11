package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zd implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ArrayList y;

    public /* synthetic */ zd(ArrayList arrayList, byte b) {
        this.x = b;
        this.y = arrayList;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        ArrayList arrayList = this.y;
        switch (b) {
            case 0:
                dm4 dm4Var = (dm4) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        dm4.j(dm4Var, (em4) arrayList.get(i), 0, 0);
                        if (i != size) {
                            i++;
                        }
                    }
                }
                return pn6.a;
            case 1:
                arrayList.get(((Number) obj).intValue());
                return null;
            default:
                arrayList.get(((Number) obj).intValue());
                return null;
        }
    }
}
